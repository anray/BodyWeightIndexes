import com.anray.BodyWeightIndex.Indexes;
import com.anray.BodyWeightIndex.WeightIndexCalculator;
import org.junit.Assert;

/**
 * Created by anray on 17.06.2016.
 */
public class WeightIndexCalculatorTests {
    public void calculateWeightIndex_100kg10cm_10000Returned(){
        float result = WeightIndexCalculator.calculateWeightIndex(100f,10f);
        Assert.assertEquals(10000,result,0);

    }

    public void getWeightIndexTitle_Index17f_NotEnoughWeight(){
        String result = WeightIndexCalculator.getWeightIndexTitle(17);
        Assert.assertEquals("Недостаточная масса", Indexes.two.getTitle(),result);
    }

    public static void main(String[] args){
        WeightIndexCalculatorTests test = new WeightIndexCalculatorTests();
        test.calculateWeightIndex_100kg10cm_10000Returned();
        test.getWeightIndexTitle_Index17f_NotEnoughWeight();
    }
}
