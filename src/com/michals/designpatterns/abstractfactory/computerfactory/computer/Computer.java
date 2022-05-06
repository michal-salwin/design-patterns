package com.michals.designpatterns.abstractfactory.computerfactory.computer;

import com.michals.designpatterns.abstractfactory.computerfactory.part.CPUInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.GPUInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.HDDInterface;
import com.michals.designpatterns.abstractfactory.computerfactory.part.MemoryInterface;

public abstract class Computer {

    private CPUInterface cpu;
    private GPUInterface gpu;
    private MemoryInterface memory;
    private HDDInterface hdd;

    private String name;

    private ComputerType type;

    public ComputerType getType() {
        return type;
    }

    public void setType(ComputerType type) {
        this.type = type;
    }

    public CPUInterface getCpu() {
        return cpu;
    }

    public void setCpu(CPUInterface cpu) {
        this.cpu = cpu;
    }

    public GPUInterface getGpu() {
        return gpu;
    }

    public void setGpu(GPUInterface gpu) {
        this.gpu = gpu;
    }

    public MemoryInterface getMemory() {
        return memory;
    }

    public void setMemory(MemoryInterface memory) {
        this.memory = memory;
    }

    public HDDInterface getHdd() {
        return hdd;
    }

    public void setHdd(HDDInterface hdd) {
        this.hdd = hdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println(cpu.Calculate());
        System.out.println(gpu.print());
        System.out.println(memory.write());
        System.out.println(hdd.write());
    }

    public void turnOn() {
        System.out.println(name+" " + type + " computer was turned on");
    }
}
