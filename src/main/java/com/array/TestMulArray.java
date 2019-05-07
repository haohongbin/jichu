package com.array;

/**
 * 二维数组示例：Java中没有真正的多维数组，多维数组的表示方式是数组中元素还是数组
 * 一起来参加屌丝程序员大赛吧，有3个班级各3名学员参赛，
 * 记录每个学员的成绩，并计算每个班的平均分
 */
public class TestMulArray {

    public static void main(String[] args){

        int[][] scores={{78,98,88},{87,96,85},{67,78,89}};
        int sum=0;
        for(int i=0;i<scores.length;i++){
            for(int j=0;j<scores[i].length;j++){
                sum=sum+scores[i][j];
            }
            System.out.println(sum/scores[i].length);
            sum=0;
        }

    }
}
