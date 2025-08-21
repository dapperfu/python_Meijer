package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class J40 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8309h70 f68602a;

    /* renamed from: b, reason: collision with root package name */
    private final EB f68603b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f68604c;

    /* renamed from: d, reason: collision with root package name */
    private G40 f68605d;

    public J40(InterfaceC8309h70 interfaceC8309h70, EB eb2, Executor executor) {
        this.f68602a = interfaceC8309h70;
        this.f68603b = eb2;
        this.f68604c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final InterfaceC9483s70 e() {
        C9695u60 c9695u60Zzg = this.f68603b.zzg();
        return this.f68602a.c(c9695u60Zzg.f79578d, c9695u60Zzg.f79580f, c9695u60Zzg.f79584j);
    }

    public final com.google.common.util.concurrent.q c() {
        com.google.common.util.concurrent.q qVarH;
        G40 g40 = this.f68605d;
        if (g40 != null) {
            return Mj0.h(g40);
        }
        if (((Boolean) C9641tg.f79449a.e()).booleanValue()) {
            qVarH = (Cj0) Mj0.e((Cj0) Mj0.m(Cj0.D(this.f68603b.zzb().e(this.f68602a.zza())), new F40(this), this.f68604c), zzdyh.class, new E40(this), this.f68604c);
        } else {
            G40 g402 = new G40(null, e(), null);
            this.f68605d = g402;
            qVarH = Mj0.h(g402);
        }
        return Mj0.m(qVarH, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.D40
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return (G40) obj;
            }
        }, this.f68604c);
    }
}
