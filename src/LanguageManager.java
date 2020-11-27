import java.util.Scanner;

public enum LanguageManager {
    INSTANCE;

    private Language language;

    public Language getLanguage() {

        return language;

    }

    public void setLanguage(Language language) {

        this.language = language;

    }

    public void changeLanguage(){

        String nextLine = InputManager.ME.loadInput();

        if (nextLine.equals("cs")) {

            LanguageManager.INSTANCE.setLanguage(Language.CESTINA);

        } else if (nextLine.equals("en")) {

            LanguageManager.INSTANCE.setLanguage(Language.ENGLISH);

        }
    }
}
