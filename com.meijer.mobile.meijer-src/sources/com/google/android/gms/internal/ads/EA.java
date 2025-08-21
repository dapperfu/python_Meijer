package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class EA implements TE, PC {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f67202a;

    /* renamed from: b, reason: collision with root package name */
    private final GA f67203b;

    /* renamed from: c, reason: collision with root package name */
    private final C9695u60 f67204c;

    /* renamed from: d, reason: collision with root package name */
    private final String f67205d;

    EA(com.google.android.gms.common.util.f fVar, GA ga2, C9695u60 c9695u60, String str) {
        this.f67202a = fVar;
        this.f67203b = ga2;
        this.f67204c = c9695u60;
        this.f67205d = str;
    }

    @Override // com.google.android.gms.internal.ads.TE
    public final void zza() {
        this.f67203b.e(this.f67205d, this.f67202a.c());
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final void zzs() {
        com.google.android.gms.common.util.f fVar = this.f67202a;
        this.f67203b.d(this.f67204c.f79580f, this.f67205d, fVar.c());
    }
}
