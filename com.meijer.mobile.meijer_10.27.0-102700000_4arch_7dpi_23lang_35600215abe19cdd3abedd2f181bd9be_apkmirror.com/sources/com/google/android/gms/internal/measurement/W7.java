package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class W7 extends AbstractC10444k {

    /* renamed from: c, reason: collision with root package name */
    private final Callable f82087c;

    public W7(String str, Callable callable) {
        super("internal.appMetadata");
        this.f82087c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10444k
    public final InterfaceC10498q b(U1 u12, List list) {
        try {
            return W2.a(this.f82087c.call());
        } catch (Exception unused) {
            return InterfaceC10498q.f82342i3;
        }
    }
}
