package com.google.android.gms.internal.pal;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.pal.r6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10995r6 implements Serializable {
    AbstractC10995r6() {
    }

    public static AbstractC10995r6 e() {
        return C10900l6.f84065a;
    }

    public abstract AbstractC10995r6 a(InterfaceC10948o6 interfaceC10948o6);

    public abstract Object b();

    public abstract Object c(Object obj);

    public abstract boolean d();

    public static AbstractC10995r6 f(Object obj) {
        obj.getClass();
        return new C11075w6(obj);
    }
}
