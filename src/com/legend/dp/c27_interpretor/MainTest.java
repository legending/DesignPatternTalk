package com.legend.dp.c27_interpretor;

/*
 * 当前示例：解释器模式----音乐解释器
 * 定义：给定一个语言，给它定义一种文法表示，然后定义一个解释器用定义的文法来解释语言中的句子
 * 适用场景：某个问题发生的频率足够高，希望用一种迷你语言来表示这个问题，解释问题的过程就是解决问题的过程
 * 特点：使用类来表示文法规则，很容易通过继承来扩展，但如果文法太多复杂，则很难管理维护
 * */

public class MainTest {
	
	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		context.setText("O 2 E 0.5 G 1 ");
		
		Expression expression = null;
		
		try {
			while (context.getText().length() > 0) {
				String str = context.getText().substring(0, 1);
				switch (str) {
				case "O":
					expression = new Scale();//音阶类
					break;
				case "C":
				case "D":
				case "E":
				case "F":
				case "G":
				case "A":
				case "B":
					expression = new Note();//音调类
					break;
				default:
					break;
				}
				expression.interpret(context);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
