package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.xY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9930xY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f79798a;

    /* renamed from: b, reason: collision with root package name */
    private final C6568Aq f79799b;

    C9930xY(Executor executor, C6568Aq c6568Aq) {
        this.f79798a = executor;
        this.f79799b = c6568Aq;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return ((Boolean) Mc.A.c().a(C8659lf.f76197W2)).booleanValue() ? Mj0.h(new C10037yY(null)) : Mj0.m(this.f79799b.l(), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.wY
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new C10037yY(arrayList);
            }
        }, this.f79798a);
    }
}
