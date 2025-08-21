package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class W7 extends AbstractC10569k {

    /* renamed from: c, reason: collision with root package name */
    private final Callable f82927c;

    public W7(String str, Callable callable) {
        super("internal.appMetadata");
        this.f82927c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10569k
    public final InterfaceC10623q b(U1 u12, List list) {
        try {
            return W2.a(this.f82927c.call());
        } catch (Exception unused) {
            return InterfaceC10623q.f83182i3;
        }
    }
}
