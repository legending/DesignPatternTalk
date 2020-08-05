package com.legend.dp.c6_decorator.v1;


public abstract class
Decorate extends Component {

	protected Component component;
	
	public void setComponent(Component component) {
		this.component = component;
	}
	
	@Override
	public void operation() {
		component.operation();
	}
	
}
