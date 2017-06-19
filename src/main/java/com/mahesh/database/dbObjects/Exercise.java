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
    public enum ExType {
        FREE_WEIGHTS ("FREE_WEIGHTS"), CARDIO ("CARDIO"), MACHINE ("MACHINE");
        private String type;
        ExType (String type) {
            this.type = type;
        }
        @Override
        public String toString() {
            return type;
        }
    }

    private String exName;
    private BodyPart bodyPart;
    private Scope scope;
    private ExType exType;
    int idUser;

    public String getExName() {
        return exName;
    }

    public void setExName(String exName) {
        this.exName = exName;
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

    public ExType getExType() {
        return exType;
    }

    public void setType(ExType type) {
        this.exType = type;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
