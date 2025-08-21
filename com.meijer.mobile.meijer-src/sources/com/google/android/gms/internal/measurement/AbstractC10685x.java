package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10685x {

    /* renamed from: a, reason: collision with root package name */
    final List f83292a = new ArrayList();

    public abstract InterfaceC10623q a(String str, U1 u12, List list);

    final InterfaceC10623q b(String str) {
        if (this.f83292a.contains(C10670v2.e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }

    protected AbstractC10685x() {
    }
}
