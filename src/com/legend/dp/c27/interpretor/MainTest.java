package com.legend.dp.c27.interpretor;

/*
 * 当前示例：享元模式----联合国处理国际事务
 * 定义：运用共享技术有效地支持大量细粒度对象
 * 适用场景：一个应用程序使用了大量重合度很高的对象
 * 特点：共享对象，大大减少了实例数量
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
					expression = new Scale();
					break;
				case "C":
				case "D":
				case "E":
				case "F":
				case "G":
				case "A":
				case "B":
					expression = new Note();
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
