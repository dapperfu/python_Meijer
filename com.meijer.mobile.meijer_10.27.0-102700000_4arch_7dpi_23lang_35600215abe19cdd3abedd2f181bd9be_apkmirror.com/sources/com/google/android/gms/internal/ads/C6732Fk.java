package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6732Fk implements InterfaceC7213Tq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7037Ok f66840a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K80 f66841b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7071Pk f66842c;

    C6732Fk(C7071Pk c7071Pk, C7037Ok c7037Ok, K80 k80) {
        this.f66840a = c7037Ok;
        this.f66841b = k80;
        this.f66842c = c7071Pk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7213Tq
    public final void zza() {
        Pc.p0.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.f66842c.f69404a) {
            try {
                Pc.p0.k("loadNewJavascriptEngine (failure): Lock acquired");
                this.f66842c.f69412i = 1;
                Pc.p0.k("Failed loading new engine. Marking new engine destroyable.");
                this.f66840a.h();
                if (((Boolean) C8021fg.f74137d.e()).booleanValue()) {
                    C7071Pk c7071Pk = this.f66842c;
                    if (c7071Pk.f69408e != null) {
                        Z80 z80 = c7071Pk.f69408e;
                        K80 k80 = this.f66841b;
                        k80.p("Failed loading new engine");
                        k80.r0(false);
                        z80.b(k80.zzm());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Pc.p0.k("loadNewJavascriptEngine (failure): Lock released");
    }
}
