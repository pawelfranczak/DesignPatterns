package pl.pfranczak.patterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}

		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}
}
