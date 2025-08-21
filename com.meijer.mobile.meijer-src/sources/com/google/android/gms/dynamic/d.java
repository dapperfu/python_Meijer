package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamic.b;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public final class d<T> extends b.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f65819a;

    public static <T> b I2(T t10) {
        return new d(t10);
    }

    public static <T> T c2(b bVar) throws SecurityException {
        if (bVar instanceof d) {
            return (T) ((d) bVar).f65819a;
        }
        IBinder iBinderAsBinder = bVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        r.l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }

    private d(Object obj) {
        this.f65819a = obj;
    }
}
