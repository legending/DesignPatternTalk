package c6.decorate1;


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
