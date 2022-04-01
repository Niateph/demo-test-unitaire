import static org.junit.Assert.*;

import org.diginamic.demotestsunitaires.StringUtils;
import org.junit.Test;

public class StringUtilsTest {
    private int result;
    @Test
    public void testLevenshteinDistanceBasic() throws Exception{
	result = StringUtils.levenshteinDistance("chien","chine");
	assertEquals(2,result);
	result = StringUtils.levenshteinDistance("distance","instance");
	assertEquals(2,result);
	result = StringUtils.levenshteinDistance("chat","chats");
	assertEquals(1,result);
	result = StringUtils.levenshteinDistance("machins","machines");
	assertEquals(1,result);
	result = StringUtils.levenshteinDistance("distance","instance");
	assertEquals(2,result);
	result = StringUtils.levenshteinDistance("c","chien");
	assertEquals(4,result);
	result = StringUtils.levenshteinDistance("c","a");
	assertEquals(1,result);
	result = StringUtils.levenshteinDistance("c","");
	assertEquals(1,result);
	result = StringUtils.levenshteinDistance("c a","cac");
	assertEquals(2,result);
	result = StringUtils.levenshteinDistance("c2","c1");
	assertEquals(1,result);
	result = StringUtils.levenshteinDistance("champ","champ");
	assertEquals(0,result);
    }
    
    @Test(expected = Exception.class)
    public void testLevenshteinDistanceNull() throws Exception{
	result = StringUtils.levenshteinDistance(null,"chine");
	result = StringUtils.levenshteinDistance("chien",null);
	result = StringUtils.levenshteinDistance(null,null);
    }

}
