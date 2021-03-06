package com.legend.dp.c16_state;

public class EveningState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.isFinish()) {
            w.setCurrent(new RestState());
			w.WriteProgram();
		}else {
			if(w.getHour() < 21) {
				System.out.println(String.format("当前时间：%s, 加班，累死了", w.getHour()));
			}else {
				w.setCurrent(new SleepingState());
				w.WriteProgram();
			}
		}
		
	}

}
