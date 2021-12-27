package pl.pfranczak.patterns.creational.abstractfactory;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
		}

		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}

		return null;
	}
}
