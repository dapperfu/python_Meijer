package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class QN implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final MN f70402a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f70403b;

    public QN(MN mn2, InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f70402a = mn2;
        this.f70403b = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a(this.f70402a, (WN) this.f70403b.zzb(), U70.b());
    }

    public static Set a(MN mn2, WN wn2, Executor executor) {
        Set setD = MN.d(wn2, executor);
        C9358qy0.b(setD);
        return setD;
    }
}
