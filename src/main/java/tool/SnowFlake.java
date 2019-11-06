package tool;

/**
 * 雪花算法案例
 * 原始思想（生成一个64位的 long 型数据）
 * 1位默认值，即最高位默认为0，因为一般 ID 都是正整数
 * 41位时间戳
 * 10位机器标识
 * 12位序列号
 * 再次基础之上做一些定制改造
 */
public class SnowFlake {
    private static final Long START_STAMP = 1L;

    private static final Long MACHINE_ID_BIT = 10L;

    private static final Long SEQUENCE_BIT = 12L;

    private static final Long TIMESTAMP_BIT = 41L;

    private static final Long MACHINE_SHELF = SEQUENCE_BIT;

    private static final Long TIMESTAMP_SHELF = MACHINE_SHELF + TIMESTAMP_BIT;
}
