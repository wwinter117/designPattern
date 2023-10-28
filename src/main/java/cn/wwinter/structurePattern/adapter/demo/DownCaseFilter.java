package cn.wwinter.structurePattern.adapter.demo;

/**
 * ClassName: UpcaseFilter
 * Package: cn.wwinter.structurePattern.adapter.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class DownCaseFilter extends StringFilter{
    @Override
    public String filter(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
