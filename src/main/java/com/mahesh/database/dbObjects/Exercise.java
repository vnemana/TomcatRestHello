package com.mahesh.database.dbObjects;


public class Exercise {
    public enum BodyPart {
        SHOULDERS ("SHOULDERS"), BICEPS ("BICEPS"), TRICEPS ("TRICEPS"), WRISTS ("WRISTS"), FOREARMS ("FOREARMS"),
        LEGS ("LEGS"), CALVES ("CALVES"), ABDOMEN ("ABDOMEN"), BACK ("BACK"), CHEST ("CHEST");
        private String bodyPart;
        BodyPart(String bodyPart) {
            this.bodyPart = bodyPart;
        }
        @Override
        public String toString() {
            return bodyPart;
        }
    }
    public enum Scope {
        USER ("USER"), GENERAL ("GENERAL");
        private String scope;
        Scope (String scope) {
            this.scope = scope;
        }
        @Override
        public String toString() {
            return scope;
        }
    }
    public enum Type {
        FREE_WEIGHTS ("FREE_WEIGHTS"), CARDIO ("CARDIO"), MACHINE ("MACHINE");
        private String type;
        Type (String type) {
            this.type = type;
        }
        @Override
        public String toString() {
            return type;
        }
    }

    private String name;
    private BodyPart bodyPart;
    private Scope scope;
    private Type type;
    int idUser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BodyPart getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(BodyPart bodyPart) {
        this.bodyPart = bodyPart;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
