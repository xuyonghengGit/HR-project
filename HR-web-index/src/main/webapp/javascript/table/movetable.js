//ʵ�ֱ���ȵ������϶�������ʱ���ܶ������ܿ�Ⱥ͵�Ԫ��߶ȣ�������center��caption����
var dragenable=0;
var x;//�����ᣬ��ҳ�еľ�������
var y;//������
var w;//������ڵĵ�Ԫ��Ŀ��
var h;
var obj;
function init() {//��갴�����
  x=(event.clientX+document.body.scrollLeft);//event.clientX:����¼�����Ļ��X������+document.body.scrollLeft:�����������ľ���
  obj=event.srcElement;
  w=event.srcElement.offsetWidth;
  obj.setCapture();
  if(x>event.srcElement.offsetLeft+w-8 && x<event.srcElement.offsetLeft+w) {
    dragenable=1;//�������������С��ϲ����ϲ����ܼ�������
    obj.style.cursor='e-resize';
  } else if(x>=event.srcElement.offsetLeft && x<event.srcElement.offsetLeft+10) {
     //������䷵��ֵ���ַ������ͣ�����
     w=obj.parentNode.parentNode.rows[0].cells[obj.cellIndex-1].width;
    dragenable=2;//���Ҳ��������Ŵ󣬿�һֱ����ſ���ҳ
    obj.style.cursor='w-resize';
  }
 }

function drag() {//����ƶ�
  //�������ķ���ֵ���ַ���������
  var pos=(event.clientX+document.body.scrollLeft);
  if(pos>event.srcElement.offsetLeft+event.srcElement.offsetWidth-8 &&
      pos<event.srcElement.offsetLeft+event.srcElement.offsetWidth) {
     event.srcElement.style.cursor='e-resize';//�����״
  } else if(pos>event.srcElement.offsetLeft &&
            pos<event.srcElement.offsetLeft+8) {
    event.srcElement.style.cursor='w-resize';
  } else {
    event.srcElement.style.cursor='default';//���Ĭ��״̬���޷�Ӧ
  }
  if(dragenable==1) {
    if(parseInt(pos)-x+parseInt(w)>0) {//posΪ��굱ǰ�����ҳ������ֵ��xΪ���ѡ��ʱ�����ҳ������ֵ
	var i=obj.cellIndex;
	var j;
	for(j=0;j<obj.parentNode.parentNode.rows.length;j++) {//������϶�ʱ����ǰ�е�������һ����
	  obj.parentNode.parentNode.rows[j].cells[i].width=pos-x+w;
	}
    } else {
      var i=obj.cellIndex;
      var j;
      for(j=0;j<obj.parentNode.parentNode.rows.length;j++) {
        obj.parentNode.parentNode.rows[j].cells[i].width=1;//nseer:���϶�����Ԫ���������߾�����1ʱ���϶���ֹ������������ϲ�����һ���߲����������Ż����δ���
      }
    }

  } else if(dragenable==2) {
     var i=obj.cellIndex;
     if(i>0) { 
     if(parseInt(pos)-x+parseInt(w)>0) {
 	 var j;
	 for(j=0;j<obj.parentNode.parentNode.rows.length;j++) {
          obj.parentNode.parentNode.rows[j].cells[i-1].width=parseInt(pos)-x+parseInt(w);
	 }
      } else {
        var j;
        for(j=0;j<obj.parentNode.parentNode.rows.length;j++) {
          obj.parentNode.parentNode.rows[j].cells[i-1].width=1;
        }
      }
      }
  }
}

function end() {//����ɿ����
  dragenable=false;
  obj.releaseCapture();//�ͷŲ�׽
  obj.style.cursor='default';
}
