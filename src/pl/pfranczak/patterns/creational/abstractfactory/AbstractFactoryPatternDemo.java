package pl.pfranczak.patterns.creational.abstractfactory;

/*
 * https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm
 */

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);
		Shape shape3 = shapeFactory1.getShape("RECTANGLE");
		shape3.draw();
		Shape shape4 = shapeFactory1.getShape("SQUARE");
		shape4.draw();
	}

}
