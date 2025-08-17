package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class EA implements TE, PC {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f66362a;

    /* renamed from: b, reason: collision with root package name */
    private final GA f66363b;

    /* renamed from: c, reason: collision with root package name */
    private final C9570u60 f66364c;

    /* renamed from: d, reason: collision with root package name */
    private final String f66365d;

    EA(com.google.android.gms.common.util.f fVar, GA ga2, C9570u60 c9570u60, String str) {
        this.f66362a = fVar;
        this.f66363b = ga2;
        this.f66364c = c9570u60;
        this.f66365d = str;
    }

    @Override // com.google.android.gms.internal.ads.TE
    public final void zza() {
        this.f66363b.e(this.f66365d, this.f66362a.c());
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        com.google.android.gms.common.util.f fVar = this.f66362a;
        this.f66363b.d(this.f66364c.f78740f, this.f66365d, fVar.c());
    }
}
