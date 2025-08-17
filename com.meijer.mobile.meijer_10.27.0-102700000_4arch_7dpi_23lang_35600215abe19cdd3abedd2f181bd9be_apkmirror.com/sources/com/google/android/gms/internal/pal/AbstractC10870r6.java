package com.google.android.gms.internal.pal;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.pal.r6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10870r6 implements Serializable {
    AbstractC10870r6() {
    }

    public static AbstractC10870r6 e() {
        return C10775l6.f83225a;
    }

    public abstract AbstractC10870r6 a(InterfaceC10823o6 interfaceC10823o6);

    public abstract Object b();

    public abstract Object c(Object obj);

    public abstract boolean d();

    public static AbstractC10870r6 f(Object obj) {
        obj.getClass();
        return new C10950w6(obj);
    }
}
