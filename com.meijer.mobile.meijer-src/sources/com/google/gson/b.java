package com.google.gson;

import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Field f90257a;

    public String toString() {
        return this.f90257a.toString();
    }

    public b(Field field) {
        Objects.requireNonNull(field);
        this.f90257a = field;
    }
}
