import java.util.List;

public class SharpieSet {

//    Create SharpieSet class
//    it contains a list of Sharpie
//                    countUsable() -> sharpie is usable if it has ink in it
//    removeTrash() -> removes all unusable sharpies

    List<Sharpie> sharpieList;

    public int countUsable()
    {
        int count = 0;

        for (Sharpie s: sharpieList) {
            if (s.inkAmount > 0)
            {count++;}
        }

        return  count;
    }

    public void removeTrash()
    {
        for (Sharpie s: sharpieList) {
            if (s.inkAmount == 0)
            {sharpieList.remove(s);}
        }

    }


}
