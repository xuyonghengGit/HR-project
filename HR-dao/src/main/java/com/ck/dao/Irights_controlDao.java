package com.ck.dao;

import com.ck.entity.Rights;
import com.ck.entity.rights_control;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

/**
 * 权限管理
 */
public interface Irights_controlDao {
    //
    @Select("SELECT * FROM rights_control WHERE r_id = #{id}")
    public rights_control queryByid(int id);
    //修改权限管理与修改角色一个事务
    @Update("UPDATE rights_control SET \n" +
            "A = #{A},\n" +
            "A_1 = #{A_1},A_1_a = #{A_1_a},A_1_b = #{A_1_b},A_1_c = #{A_1_c},\n" +
            "A_2 = #{A_2},A_2_a = #{A_2_a},A_2_b = #{A_2_b},A_2_c = #{A_2_c},\n" +
            "A_3 = #{A_3},A_3_a = #{A_3_a},A_3_b = #{A_3_b},\n" +
            "A_6 = #{A_6},A_6_a = #{A_6_a},A_6_b = #{A_6_b},A_6_c = #{A_6_c},\n" +
            "B = #{B},\n" +
            "B_1 = #{B_1},\n" +
            "B_2 = #{B_2},\n" +
            "B_3 = #{B_3},\n" +
            "B_4 = #{B_4},\n" +
            "B_5 = #{B_5},B_5_a = #{B_5_a},B_5_b = #{B_5_b},B_5_c = #{B_5_c},\n" +
            "C = #{C},\n" +
            "C_1 = #{C_1},\n" +
            "C_2 = #{C_2},\n" +
            "C_3 = #{C_3},\n" +
            "C_4 = #{C_4},\n" +
            "D = #{D},\n" +
            "D_1 = #{D_1},\n" +
            "D_2 = #{D_2},\n" +
            "D_3 = #{D_3},\n" +
            "E = #{E},\n" +
            "E_1 = #{E_1},\n" +
            "E_2 = #{E_2},\n" +
            "E_3 = #{E_3},\n" +
            "F = #{F},\n" +
            "F_1 = #{F_1},F_1_a = #{F_1_a},F_1_b = #{F_1_b},F_1_c = #{F_1_c},F_1_d = #{F_1_d},F_1_e = #{F_1_e},F_1_f = #{F_1_f},F_1_g = #{F_1_g},\n" +
            "F_2 = #{F_2},F_2_a = #{F_2_a},F_2_b = #{F_2_b},\n" +
            "F_4 = #{F_4},F_4_a = #{F_4_a},\n" +
            "G = #{G},\n" +
            "G_1 = #{G_1},\n" +
            "G_2 = #{G_2},\n" +
            "G_3 = #{G_3},\n" +
            "H = #{H},\n" +
            "H_1 = #{H_1},\n" +
            "H_2 = #{H_2}\n" +
            " WHERE rc_id = #{rc_id}")
    public void updatecontrol(rights_control rc);
    //添加权限
    @Insert("INSERT INTO rights_control(r_id) VALUES(#{id})")
    public void addcontrol(int id);


}
