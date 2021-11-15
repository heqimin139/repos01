package com.hqm.abstract_;

/**
 * @author heqimin
 * @version 1.0
 * @Description:计时器模板类
 * @date 2021-11-14 19:31
 */
public abstract class Templete_Timer {
    public abstract void job();

    public void timer(){
        long time1=System.currentTimeMillis();
        job();
        long time2=System.currentTimeMillis();
        System.out.println("此方法执行耗时："+(time2-time1));
    }
}

class A extends Templete_Timer{
    @Override
    public void job() {
        long total=0;
        int lastNum=50000;
        for (int i=0;i<lastNum;i++){
            total+=i;
        }
        System.out.println("从0累加到"+lastNum+",结果为："+total);
    }
}

class B extends Templete_Timer{
    @Override
    public void job() {
        long total=0;
        int lastNum=60000;
        for (int i=0;i<lastNum;i++){
            total+=i;
        }
        System.out.println("从0累加到"+lastNum+",结果为："+total);
    }
}
