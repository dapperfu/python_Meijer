package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.lh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8664lh0 extends AbstractC7809dg0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Iterator f76624c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC6691Ef0 f76625d;

    C8664lh0(Iterator it, InterfaceC6691Ef0 interfaceC6691Ef0) {
        this.f76624c = it;
        this.f76625d = interfaceC6691Ef0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7809dg0
    protected final Object a() {
        while (this.f76624c.hasNext()) {
            Iterator it = this.f76624c;
            InterfaceC6691Ef0 interfaceC6691Ef0 = this.f76625d;
            Object next = it.next();
            if (interfaceC6691Ef0.zza(next)) {
                return next;
            }
        }
        c();
        return null;
    }
}
