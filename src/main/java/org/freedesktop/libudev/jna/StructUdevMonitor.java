package org.freedesktop.libudev.jna;

import com.sun.jna.Structure;

import java.util.Collections;
import java.util.List;

public class StructUdevMonitor extends Structure {
    @Override
    protected List getFieldOrder() {
        return Collections.EMPTY_LIST;
    }
}