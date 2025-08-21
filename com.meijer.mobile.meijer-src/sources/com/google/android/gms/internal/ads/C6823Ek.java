package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ek, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6823Ek implements InterfaceC7404Vq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7162Ok f67340a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K80 f67341b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7196Pk f67342c;

    C6823Ek(C7196Pk c7196Pk, C7162Ok c7162Ok, K80 k80) {
        this.f67340a = c7162Ok;
        this.f67341b = k80;
        this.f67342c = c7196Pk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7404Vq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Rc.p0.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.f67342c.f70244a) {
            try {
                Rc.p0.k("loadNewJavascriptEngine (success): Lock acquired");
                this.f67342c.f70252i = 0;
                C7196Pk c7196Pk = this.f67342c;
                if (c7196Pk.f70251h != null && this.f67340a != c7196Pk.f70251h) {
                    Rc.p0.k("New JS engine is loaded, marking previous one as destroyable.");
                    this.f67342c.f70251h.h();
                }
                this.f67342c.f70251h = this.f67340a;
                if (((Boolean) C8146fg.f74977d.e()).booleanValue()) {
                    C7196Pk c7196Pk2 = this.f67342c;
                    if (c7196Pk2.f70248e != null) {
                        Z80 z80 = c7196Pk2.f70248e;
                        K80 k80 = this.f67341b;
                        k80.s0(true);
                        z80.b(k80.zzm());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Rc.p0.k("loadNewJavascriptEngine (success): Lock released");
    }
}
