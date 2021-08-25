package guildTest;

public class dogFood {

    static String foodRequired (int smallDog, int midDog, int largeDog, int leftOver) {

        if (smallDog < 0 || midDog < 0 ||largeDog < 0||leftOver<0){

            return "Value can not be in negative";
        }

        else if (smallDog > 30 || midDog > 30 ||largeDog > 30){
            return "Dog count can not be more than 30";
        }

        else if (smallDog % 1 != 0 || midDog % 1 != 0 || largeDog % 1 != 0) {
            return "Dog count can not be in decimal";
        }

        else if (smallDog+midDog+largeDog <=30 && smallDog+midDog+largeDog > 0) {
            int foodAsPerDofCount = (10 * smallDog) + (20 * midDog) + (30 * largeDog);

            int deductLeftOver = foodAsPerDofCount - leftOver;

            int extraFoodToOrder = deductLeftOver / 5;

            int foodToOrder = extraFoodToOrder + deductLeftOver;

            return "Food required is " +foodToOrder;
        }

        else if(smallDog+midDog+largeDog == 0){

            return "Do not order food as Dog count is zero";
        }

        else {
            return "Total Dogs can not be more than 30";
        }

    }
    public static void main (String[] args)
    {
        System.out.println(foodRequired(3,5,7,17));
    }
}

