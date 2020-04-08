/*
 * # OMRī�� : Ŭ���� + ����
 * 1. �迭 answer�� ���蹮���� �������̴�.
 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
 * 4. �� ������ 20���̴�.
 * ��)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * ����ǥ     = {O, X, O, X, X}
 * ����        = 40��
 */

package day_40;

import java.util.Random;

class Ex06
{
	int[] answer = {1,3,4,2,5};		//���� ���
	int[] hgd = new int[5];			//�л� ���
	
	int count = 0;					//���� ���� ����
	int score = 0;					//����
}

public class ClassEx06 {
	public static void main(String[] args) {
		Random ran = new Random();
		Ex06 e = new Ex06();
		
		for(int i=0;i<e.hgd.length;i++)
		{
			int num = ran.nextInt(5)+1;
			e.hgd[i] = num;
		}
		
		System.out.print("���� = [");
		for(int i=0;i<e.answer.length;i++)
		{
			System.out.print(e.answer[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		
		System.out.print("���� = [");
		for(int i=0;i<e.hgd.length;i++)
		{
			System.out.print(e.hgd[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		
		System.out.print("���� = [");
		for(int i=0;i<e.answer.length;i++)
		{
			if(e.answer[i] == e.hgd[i])
			{
				System.out.print("o ");
				e.count++;
			}
			else
			{
				System.out.print("x ");
			}
		}
		System.out.print("]");
		System.out.println();
		e.score = e.count*20;
		System.out.println("����:"+e.score);
	}
}
