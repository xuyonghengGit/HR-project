// Description: Valid check for JavaScript
// Usage: <script type=text/javascript src=/check.js></script>
// Function Listing:
//  function chkdate(yearStr, monthStr, dayStr)
//  function chkdatestr(checkStr)
//  function chkemail(checkStr)
//  function chkfloat(checkStr)
//  function chkinteger(checkStr)
//  function chklength(checkStr)
//  function chkname(checkStr)
//  function chknegative(checkStr)
//  function chknostring(checkStr, forbidStr)
//  function chknumber(checkStr)
//  function chkpasswd(checkStr)
//  function chkphone(checkStr)
//  function chkquot(checkStr)
//  function chksafe(checkStr)
//  function chkspace(checkStr)
//  function chkstring(checkStr, checkOK)
//  function trim(w)
//  function trimform(TheForm)


//��������chkdate
//���ܽ��ܣ�����Ƿ�Ϊ�Ϸ�����
//����˵����Ҫ�����ַ����ꡢ�¡���
//�� �� ֵ��false:����  true:��
function chkdate(yearStr, monthStr, dayStr) {
  var checkOK = "1234567890";
  if ( !chkstring(yearStr, checkOK) ||
       !chkstring(monthStr, checkOK) ||
       !chkstring(dayStr, checkOK) )
    return(false);

  testday = new Date();
  testday.setFullYear(yearStr, monthStr-1, dayStr);
  var tmpy = testday.getFullYear();
  var tmpm = testday.getMonth() + 1;
  var tmpd = testday.getDate();
  if (tmpy == yearStr && tmpm == monthStr && tmpd == dayStr) {
    return(true);
  } else {
    return(false);
  }
}


//��������chkdateStr
//���ܽ��ܣ�����Ƿ�Ϊ�Ϸ�����
//����˵����Ҫ�����ַ���YYYY-MM-DD
//�� �� ֵ��false:����  true:��
function chkdatestr(checkStr) {
  var tmpy = "";
  var tmpm = "";
  var tmpd = "";
  var checkCode = 0;
  for (i=0; i<checkStr.length ;i++) {
    ch = checkStr.charAt(i);
    if (ch == '-') checkCode++;
    if (checkCode > 2) return(false);
    else if (checkCode == 0 && ch != '-') tmpy += ch;
    else if (checkCode == 1 && ch != '-') tmpm += ch;
    else if (checkCode == 2 && ch != '-') tmpd += ch;
  }
  if (chknumber(tmpy) && tmpy.length == 2) {
    if (tmpy > 70) tmpy = "19" + tmpy;
    else tmpy = "20" + tmpy;
  }
  return(chkdate(tmpy, tmpm, tmpd));
}


//�� �� ����chkemail
//���ܽ��ܣ�����Ƿ�Ϊ�Ϸ���Email Address
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
//У����򣺲�����.��@��ͷ��/���β�����ܰ���1������@������*@(*.)*
function chkemail(checkStr) {
  var checkOK = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ@._-";
  var allValid = false;
  var checkCode = 0;
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i);
    if (ch == "@") {
      if (checkCode == 0 && i > 0) {
        checkCode = 1;
      } else {
        break;
      }
    }
    if (ch == ".") {
      if (i == 0 || i == checkStr.length - 1) {
        break;
      } else if (checkStr.charAt(i+1) == '.') {
        break;
      } else if (checkCode == 0) {
        if (checkStr.charAt(i+1) == '@') {
          break;
        }
      } else if (checkCode == 1) {
        if (checkStr.charAt(i-1) == '@') {
          break;
        } else {
          checkCode = 2;
        }
      }
    }
    chValid = false;
    for (j = 0; j < checkOK.length; j++) {
      if (ch == checkOK.charAt(j)) {
        chValid = true;
        break;
      }
    }
    if (!chValid) break;
    if (i == checkStr.length - 1 && checkCode == 2) {
      allValid = true;
      break;
    }
  }
  return(allValid);
}


//�� �� ����chkfloat
//���ܽ��ܣ�����Ƿ�ΪС��
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chkfloat(checkStr) {
  if (chknumber(checkStr) && checkStr.indexOf(".") >= 0) {
    return(true);
  } else {
    return(false);
  }
}


//�� �� ����chkinteger
//���ܽ��ܣ�����Ƿ�Ϊ����
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chkinteger(checkStr) {
  var checkOK = "0123456789+-";
  var allValid = true;
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i);
    if (checkOK.indexOf(ch) == -1) {
      allValid = false;
      break;
    }
    if ((ch == '+' || ch == '-') && i > 0) {
      allValid = false;
      break;
    }
  }
  return(allValid);
}


//�� �� ����chklength
//���ܽ��ܣ�����ַ����ĳ���
//����˵����Ҫ�����ַ���
//�� �� ֵ���ֽڳ���ֵ
function chklength(checkStr) {
  var n = 0;
  for(i=0; i<checkStr.length; i++) {
    chcode = checkStr.charCodeAt(i);
    if (chcode >=0  && chcode <= 255) {
      n++;
    } else {
      n += 2;
    }
  }
  return(n);
}


//�� �� ����chkname
//���ܽ��ܣ�����Ƿ��������Ҫ��
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chkname(checkStr) {
  var forbidStr = "0123456789`~!@#$%^��&*()_-+=|\\{}[];:,<>?/\"";
  return(!chknostring(checkStr, forbidStr));
}


//�� �� ����chknegative
//���ܽ��ܣ�����Ƿ�Ϊ����
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chknegative(checkStr) {
  if (chknumber(checkStr) && checkStr.charAt(0) == '-') {
    return(true);
  } else {
    return(false);
  }
}


//�� �� ����chknostring
//���ܽ��ܣ�����Ƿ񺬷Ƿ��ַ�
//����˵����Ҫ�����ַ������Ϸ����ַ�������
//�� �� ֵ��false:����  true:��
function chknostring(checkStr, forbidStr) {
  var allValid = false;
  if (typeof(checkStr) != "string" || typeof(forbidStr) != "string") return(false);
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i);
    if (forbidStr.indexOf(ch) >= 0) {
      allValid = true;
      break;
    }
  }
  return(allValid);
}


//�� �� ����chknumber
//���ܽ��ܣ�����Ƿ�Ϊ����
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chknumber(checkStr) {
  var checkOK = "0123456789.+-,:";
  var allValid = true;
  var checkCode = 0;
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i);
    if (checkOK.indexOf(ch) == -1) {
      allValid = false;
      break;
    }
    if ((ch == '+' || ch == '-') && i > 0) {
      allValid = false;
      break;
    }
    if (ch == '.') {
      checkCode += 1;
      if (checkCode > 1) {
        allValid = false;
        break;
      }
    }
  }
  return(allValid);
}


//�� �� ����chkpasswd
//���ܽ��ܣ�����Ƿ��������Ҫ��
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chkpasswd(checkStr) {
  var checkOK ="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-.";
  return(chkstring(checkStr, checkOK));
}


//�� �� ����checkphone
//���ܽ��ܣ�����Ƿ�Ϊ�绰����
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chkphone(checkStr) {
  var checkOK = "0123456789-()# ,;:";
  return(chkstring(checkStr, checkOK));
}


//�� �� ����chkquot
//���ܽ��ܣ�����Ƿ������ţ������ź�/��˫���ţ�
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chkquot(checkStr) {
  var allValid = false;
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i);
    if (ch == "'" || ch == '"') {
      allValid = true;
      break;
    }
  }
  return(allValid);
}


//�� �� ����chksafe
//���ܽ��ܣ�����Ƿ���&;`'\"|*?~<>^()[]{}$\n\r
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chksafe(checkStr) {
  var allValid = true;
  var forbidStr = new Array ("&", ";", "`", "'", "\"", "|", "*", "?", "~", "<", ">", "^", "(", ")", "[", "]", "{", "}", "$", "\n", "\r");
  m = forbidStr.length;
  n = checkStr.length;
  for (i=0; i<m; i++) {
    for (j=0; j<n; j++) {
      ch1 = checkStr.charAt(j);
      ch2 = forbidStr[i];
      if (ch1 == ch2) {
        allValid = false;
        break;
      }
    }
  }
  return(allValid);
}


//�� �� ����chkspace
//���ܽ��ܣ�����Ƿ��пո�
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chkspace(checkStr) {
  var allValid = false;
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i);
    if (ch == " " || ch == "��") {
      allValid = true;
      break;
    }
  }
  return(allValid);
}


//�� �� ����chkstring
//���ܽ��ܣ�����Ƿ�ȫ���Ϸ�
//����˵����Ҫ�����ַ������Ϸ����ַ�������
//�� �� ֵ��false:����  true:��
function chkstring(checkStr, checkOK) {
  var allValid = true;
  if (typeof(checkStr) != "string" || typeof(checkOK) != "string") return(false);
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i);
    if (checkOK.indexOf(ch) == -1) {
      allValid = false;
      break;
    }
  }
  return(allValid);
}


//�� �� ����trim
//���ܽ��ܣ�ɾ�����˵Ŀո���ţ�ȫ�Ǻͣ����ǣ�
//����˵����Ҫ������ַ���
//�� �� ֵ���������ַ���
function trim(w) {
  while (w.length>0 && (w.substr(0,1)==' ' || w.substr(0,1)=='��')) w=w.substr(1);
  while (w.length>0 && (w.substr(w.length-1)==' ' || w.substr(w.length-1)=='��')) w=w.substr(0,w.length-1);
  return(w);
}


//�� �� ����trimform
//���ܽ��ܣ��Ա�������text������trim����
//����˵����Ҫ����ı���
//�� �� ֵ��false:ʧ��  true:�ɹ�
function trimform(TheForm) {
  if (typeof(TheForm) != "object") return(false);
  for (var i=0; i<TheForm.elements.length; i++) {
    var e = TheForm.elements[i];
    if (e.type == 'text') {
      e.value = trim(e.value);
    }
  }
  return(true);
}


//�� �� ����chkint
//���ܽ��ܣ�����Ƿ�Ϊ������
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chkint(checkStr) {
  var checkOK = "0123456789";
  var allValid = true;
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i);
    if (checkOK.indexOf(ch) == -1) {
      allValid = false;
      break;
    }
    if ((ch == '+' || ch == '-') && i > 0) {
      allValid = false;
      break;
    }
  }
  return(allValid);
}


//�� �� ����chkfin
//���ܽ��ܣ�����Ƿ�Ϊʵ��
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chkfin(checkStr) {
  var checkOK = "0123456789.,-";
  var allValid = true;
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i);
    if (checkOK.indexOf(ch) == -1) {
      allValid = false;
      break;
    }
    if ((ch == '+' || ch == '-') && i > 0) {
      allValid = false;
      break;
    }
  }
  return(allValid);
}

//�� �� ����chkusername
//���ܽ��ܣ�����Ƿ�Ϊ�Ϸ��û���
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chkusername(checkStr) {
  var checkOK = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
  var allValid = true;
  for (i = 0; i < checkStr.length; i++) {
    ch = checkStr.charAt(i);
    if (checkOK.indexOf(ch) == -1) {
      allValid = false;
      break;
    }
    if ((ch == '+' || ch == '-') && i > 0) {
      allValid = false;
      break;
    }
  }
  return(allValid);
}
//

//�� �� ����chkformula
//���ܽ��ܣ�����Ƿ���Ϲ�ʽҪ��
//����˵����Ҫ�����ַ���
//�� �� ֵ��false:����  true:��
function chkname(checkStr) {
  var forbidStr = "`~!@#$%^&_=|\\{}[];:,<>?��\"";
  return(!chknostring(checkStr, forbidStr));
}