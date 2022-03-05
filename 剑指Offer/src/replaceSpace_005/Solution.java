package replaceSpace_005;

/**
 * @author ASUS
 * @ 2022/3/5- 11:02
 */
class Solution {
    public String replaceSpace(String s) {


        if (s.length()==0) return null;
        StringBuilder stringBuilder =new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                stringBuilder.append(s.charAt(i));

            }else stringBuilder.append("%20");
        }
        return stringBuilder.toString();


    }
}
