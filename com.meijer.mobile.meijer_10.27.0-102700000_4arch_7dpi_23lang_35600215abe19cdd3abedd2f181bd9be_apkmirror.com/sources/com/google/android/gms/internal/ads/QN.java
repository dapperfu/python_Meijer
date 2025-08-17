package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class QN implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final MN f69562a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f69563b;

    public QN(MN mn2, InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f69562a = mn2;
        this.f69563b = interfaceC10088yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a(this.f69562a, (WN) this.f69563b.zzb(), U70.b());
    }

    public static Set a(MN mn2, WN wn2, Executor executor) {
        Set setD = MN.d(wn2, executor);
        C9233qy0.b(setD);
        return setD;
    }
}
