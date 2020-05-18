package test;

public enum Season {
    SPRING(1),SUMMER(2),AUTUMN(3),WINTER(4);

    int code;

    Season(int i) {
        code = i;
    }


    public int getCode(){
        return code;
    }
}
