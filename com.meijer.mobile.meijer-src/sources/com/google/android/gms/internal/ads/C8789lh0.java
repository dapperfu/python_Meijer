package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.lh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8789lh0 extends AbstractC7934dg0 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Iterator f77464c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ InterfaceC6816Ef0 f77465d;

    C8789lh0(Iterator it, InterfaceC6816Ef0 interfaceC6816Ef0) {
        this.f77464c = it;
        this.f77465d = interfaceC6816Ef0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7934dg0
    protected final Object a() {
        while (this.f77464c.hasNext()) {
            Iterator it = this.f77464c;
            InterfaceC6816Ef0 interfaceC6816Ef0 = this.f77465d;
            Object next = it.next();
            if (interfaceC6816Ef0.zza(next)) {
                return next;
            }
        }
        c();
        return null;
    }
}
