package lotr;
import java.util.Random;

// import lotr.lotr.Character;



// import ua.edu.ucu.apps.lotr.Elf;
// import ua.edu.ucu.apps.lotr.Hobbit;
// import ua.edu.ucu.apps.lotr.King;
// import ua.edu.ucu.apps.lotr.Knight;
class CharacterFactory {
    private static final Class<?>[] CHARACTER_CLASSES = {Hobbit.class, Elf.class, King.class, Knight.class};
    private Random random = new Random();

    public Character createCharacter() {
        int index = random.nextInt(CHARACTER_CLASSES.length);
        try {
            return (Character) CHARACTER_CLASSES[index].getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
