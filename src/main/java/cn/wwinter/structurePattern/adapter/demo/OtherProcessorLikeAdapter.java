package cn.wwinter.structurePattern.adapter.demo;

import cn.wwinter.behaviorPattern.strategy.demo.ProcessorConsumer;
import cn.wwinter.behaviorPattern.strategy.demo.Processor;
import cn.wwinter.common.StringConst;

/**
 * ClassName: OtherProcessorLikeAdapter
 * Package: cn.wwinter.structurePattern.adapter.demo
 * Description:
 * Datetime: 2023/10/28
 * Author: zhangdd
 */
public class OtherProcessorLikeAdapter implements Processor<String> {
    private final OtherProcessorLike processorLike;

    public OtherProcessorLikeAdapter(OtherProcessorLike processorLike) {
        this.processorLike = processorLike;
    }

    @Override
    public String process(String s) {
        return processorLike.swapChar(s);
    }

    @Override
    public String name() {
        return "OtherProcessorLike";
    }

    public static void main(String[] args) {
        ProcessorConsumer.process(new OtherProcessorLikeAdapter(new OtherProcessorLike()), StringConst.TEST_STRING);
    }
}
