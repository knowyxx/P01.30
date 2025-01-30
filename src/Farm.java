import java.util.ArrayList;

public class Farm {
    private double area = 100;
    private ArrayList<Flower> flowerArrayList = new ArrayList<>();

    public String addFlower(Flower flower){
        for (int i = 0; i < flowerArrayList.size(); i++) {
            if (flowerArrayList.get(i).name.equals(flower.name)) {
                if (flowerArrayList.get(i).neededArea+flower.neededArea > area){
                    return "Needed area for this flower is too large.";
                } else {
                flowerArrayList.get(i).neededArea+=flower.neededArea;
                flowerArrayList.get(i).price = flower.price;
                }
            }else {
                if (flowerArrayList.size()>5){
                    System.out.println("Limit for flowers has reached.");
                }else {
                    flowerArrayList.add(flower);
                }
            }
        }
        return  "Added flower " + flower.name + ".";
    }

    public String removeFlower(String flowerName){
        for (int i = 0; i < flowerArrayList.size(); i++) {
            if (flowerArrayList.get(i).name.equalsIgnoreCase(flowerName)) {
                flowerArrayList.remove(i);
            }
        }
        return  "Removed flower " + flowerName + ".";
    }

    public String waterFlower(String flowerName){
        for (int i = 0; i < flowerArrayList.size(); i++) {
            if (flowerArrayList.get(i).name.equalsIgnoreCase(flowerName)) {
                flowerArrayList.get(i).chanceOfGrowth+=5;
                if (flowerArrayList.get(i).chanceOfGrowth>100){
                    flowerArrayList.get(i).chanceOfGrowth=100;
                }
                return  "Watered flower " + flowerName + ", increased chance of growth." + flowerArrayList.get(i).chanceOfGrowth;

            }
            else {
                return "No flower with this name exists.";
            }
        }
        return null;
    }



}
