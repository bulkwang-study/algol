import java.util.ArrayList;

public class B2983{
    static Item start;
    static Item selected;
    static Item curr;
    static int minDist = 1000000;
    static Boolean hasCandidate = false;
    static int selectIndex;

    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<Item>();
        itemList.add(new Item(5,6));
        itemList.add(new Item(8,9));
        itemList.add(new Item(4,13));
        itemList.add(new Item(1,10));
        itemList.add(new Item(7,4));
        itemList.add(new Item(10,9));
        itemList.add(new Item(3,7));

        String s = "ACDBB";
        char[] chars = s.toCharArray();

        for (char ch : chars){
            hasCandidate = false;
            start = itemList.get(0);

            for (int i = 1; i < itemList.size() - 1; i++ ){
                curr = itemList.get(i);
                if (start.isCandidate(curr, ch) && start.calcDistFrom(curr) < minDist){
                    hasCandidate = true;
                    selected = curr;
                    selectIndex = i;
                }
            }
            if (hasCandidate) {
                itemList.remove(selectIndex);
                itemList.remove(start);
                itemList.add(0, selected);
            }
            minDist = 1000000;			
        }
        System.out.println(start);
    }
}

class Item{
    public int x;
    public int y;
    public Item next;

    public Item(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "x: " + x + ", y: " + y;
    }

    public int calcDistFrom(Item item){
        return (int) (Math.pow(item.x - this.x, 2) + Math.pow(item.y - this.y, 2));
    }

    public boolean isCandidate(Item item, char type){
        boolean result = false;
        switch (type){
            case 'A':
                if (item.x - this.x > 0 && item.y - this.y > 0) result = true;
                return result;
            case 'B':
                if (item.x - this.x > 0 && item.y - this.y < 0)	result = true;
                return result;
            case 'C':
                if (item.x - this.x < 0 && item.y - this.y > 0) result = true;
                return result;
            case 'D':
                if (item.x - this.x < 0 && item.y - this.y < 0) result = true;
                return result;
        }
        return result;
    }
}