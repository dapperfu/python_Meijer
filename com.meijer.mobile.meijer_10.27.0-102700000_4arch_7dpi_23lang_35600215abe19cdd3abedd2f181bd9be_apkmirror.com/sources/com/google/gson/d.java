package com.google.gson;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public interface d {
    String b(Field field);

    default List<String> a(Field field) {
        return Collections.EMPTY_LIST;
    }
}
