package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6857Fk implements InterfaceC7338Tq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7162Ok f67680a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K80 f67681b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7196Pk f67682c;

    C6857Fk(C7196Pk c7196Pk, C7162Ok c7162Ok, K80 k80) {
        this.f67680a = c7162Ok;
        this.f67681b = k80;
        this.f67682c = c7196Pk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7338Tq
    public final void zza() {
        Rc.p0.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.f67682c.f70244a) {
            try {
                Rc.p0.k("loadNewJavascriptEngine (failure): Lock acquired");
                this.f67682c.f70252i = 1;
                Rc.p0.k("Failed loading new engine. Marking new engine destroyable.");
                this.f67680a.h();
                if (((Boolean) C8146fg.f74977d.e()).booleanValue()) {
                    C7196Pk c7196Pk = this.f67682c;
                    if (c7196Pk.f70248e != null) {
                        Z80 z80 = c7196Pk.f70248e;
                        K80 k80 = this.f67681b;
                        k80.p("Failed loading new engine");
                        k80.s0(false);
                        z80.b(k80.zzm());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Rc.p0.k("loadNewJavascriptEngine (failure): Lock released");
    }
}
