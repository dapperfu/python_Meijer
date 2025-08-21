package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.xY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10055xY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f80638a;

    /* renamed from: b, reason: collision with root package name */
    private final C6693Aq f80639b;

    C10055xY(Executor executor, C6693Aq c6693Aq) {
        this.f80638a = executor;
        this.f80639b = c6693Aq;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return ((Boolean) Oc.A.c().a(C8784lf.f77037W2)).booleanValue() ? Mj0.h(new C10162yY(null)) : Mj0.m(this.f80639b.l(), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.wY
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new C10162yY(arrayList);
            }
        }, this.f80638a);
    }
}
