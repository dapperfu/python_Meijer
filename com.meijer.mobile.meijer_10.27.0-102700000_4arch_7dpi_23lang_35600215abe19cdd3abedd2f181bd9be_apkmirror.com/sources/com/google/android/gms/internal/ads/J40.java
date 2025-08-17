package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class J40 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8184h70 f67762a;

    /* renamed from: b, reason: collision with root package name */
    private final EB f67763b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f67764c;

    /* renamed from: d, reason: collision with root package name */
    private G40 f67765d;

    public J40(InterfaceC8184h70 interfaceC8184h70, EB eb2, Executor executor) {
        this.f67762a = interfaceC8184h70;
        this.f67763b = eb2;
        this.f67764c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final InterfaceC9358s70 e() {
        C9570u60 c9570u60Zzg = this.f67763b.zzg();
        return this.f67762a.c(c9570u60Zzg.f78738d, c9570u60Zzg.f78740f, c9570u60Zzg.f78744j);
    }

    public final com.google.common.util.concurrent.q c() {
        com.google.common.util.concurrent.q qVarH;
        G40 g40 = this.f67765d;
        if (g40 != null) {
            return Mj0.h(g40);
        }
        if (((Boolean) C9516tg.f78609a.e()).booleanValue()) {
            qVarH = (Cj0) Mj0.e((Cj0) Mj0.m(Cj0.D(this.f67763b.zzb().e(this.f67762a.zza())), new F40(this), this.f67764c), zzdyh.class, new E40(this), this.f67764c);
        } else {
            G40 g402 = new G40(null, e(), null);
            this.f67765d = g402;
            qVarH = Mj0.h(g402);
        }
        return Mj0.m(qVarH, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.D40
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return (G40) obj;
            }
        }, this.f67764c);
    }
}
