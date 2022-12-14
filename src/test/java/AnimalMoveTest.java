import Project.EarthMap;
import Project.IWorldMap;
import org.junit.jupiter.api.Test;
import Project.Animal;
import Project.Vector2d;

public class AnimalMoveTest {
    @Test
    public void test_1() {
        IWorldMap map = new EarthMap(10, 10);
        Animal animal = new Animal(new Vector2d(0, 0), map, 1, 100);
        System.out.println(animal.getDirection());
        System.out.println(animal.getPosition());
        animal.move();
        System.out.println(animal.getDirection());
        System.out.println(animal.getPosition());
        animal.move();
        System.out.println(animal.getDirection());
        System.out.println(animal.getPosition());
        animal.move();
        System.out.println(animal.getDirection());
        System.out.println(animal.getPosition());
    }
}
