package common;

import common.dto.ReflectDTO;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {
    /**
     *
     */
    public void reflectMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<ReflectDTO> constructor = ReflectDTO.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ReflectDTO reflectDTO = constructor.newInstance();
        reflectDTO.setName("私有对象");
        reflectDTO.setDesc("私有对象创建");
    }

    public static void main(String[] args) {

    }
}
