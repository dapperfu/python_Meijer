package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ek, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6698Ek implements InterfaceC7279Vq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7037Ok f66500a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K80 f66501b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7071Pk f66502c;

    C6698Ek(C7071Pk c7071Pk, C7037Ok c7037Ok, K80 k80) {
        this.f66500a = c7037Ok;
        this.f66501b = k80;
        this.f66502c = c7071Pk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7279Vq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Pc.p0.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.f66502c.f69404a) {
            try {
                Pc.p0.k("loadNewJavascriptEngine (success): Lock acquired");
                this.f66502c.f69412i = 0;
                C7071Pk c7071Pk = this.f66502c;
                if (c7071Pk.f69411h != null && this.f66500a != c7071Pk.f69411h) {
                    Pc.p0.k("New JS engine is loaded, marking previous one as destroyable.");
                    this.f66502c.f69411h.h();
                }
                this.f66502c.f69411h = this.f66500a;
                if (((Boolean) C8021fg.f74137d.e()).booleanValue()) {
                    C7071Pk c7071Pk2 = this.f66502c;
                    if (c7071Pk2.f69408e != null) {
                        Z80 z80 = c7071Pk2.f69408e;
                        K80 k80 = this.f66501b;
                        k80.r0(true);
                        z80.b(k80.zzm());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Pc.p0.k("loadNewJavascriptEngine (success): Lock released");
    }
}
