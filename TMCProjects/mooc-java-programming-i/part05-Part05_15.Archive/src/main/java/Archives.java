public class Archives {
    private String identifier;
    private String name;

    public Archives(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archives)) {
            return false;
        }

        Archives comparedArchive = (Archives) compared;

        return this.identifier.equals(comparedArchive.identifier);
    }


    public String toString() {
        return this.identifier + ": " + this.name;
    }

}
