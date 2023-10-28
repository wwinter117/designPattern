package cn.wwinter.structurePattern.adapter.demo;

/**
 * ClassName: OtherProcessorLike
 * Package: cn.wwinter.structurePattern.adapter.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class OtherProcessorLike {
    public String swapChar(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            char first = s.charAt(i);
            if (i == s.length() - 1) {
                sb.append(first);
                break;
            }
            char second = s.charAt(i + 1);
            sb.append(second).append(first);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        OtherProcessorLike processorLike = new OtherProcessorLike();
        String s = processorLike.swapChar("ab12AB");
        System.out.println("s = " + s);
        String s1 = processorLike.swapChar("ab12ABC");
        System.out.println("s1 = " + s1);
    }
}
