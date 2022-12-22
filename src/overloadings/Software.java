package overloadings;

public class Software {

    public static void main(String[] args) {
        Face face1 = new Face("white", "round");
        Face face2 = new Face("olive", "square");
        Face face3 = new Face("black", "heart");

        Face face4 = new Face("yellow", "circle", "blue");


        face1.skinColor = "red";
        face1.shape = "oval";
        face1.noseSize = "medium";
        face1.eyeColor = "brown";

        face1.displayFace();
        face2.displayFace();
        face3.displayFace();
        face4.displayFace();
    }

}
