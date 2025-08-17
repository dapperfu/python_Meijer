package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9596uL implements InterfaceC8241hj {

    /* renamed from: a, reason: collision with root package name */
    private final IC f78831a;

    /* renamed from: b, reason: collision with root package name */
    private final C7277Vo f78832b;

    /* renamed from: c, reason: collision with root package name */
    private final String f78833c;

    /* renamed from: d, reason: collision with root package name */
    private final String f78834d;

    public C9596uL(IC ic2, Z50 z50) {
        this.f78831a = ic2;
        this.f78832b = z50.f72043l;
        this.f78833c = z50.f72039j;
        this.f78834d = z50.f72041k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8241hj
    public final void z0(C7277Vo c7277Vo) {
        int i10;
        String str;
        C7277Vo c7277Vo2 = this.f78832b;
        if (c7277Vo2 != null) {
            c7277Vo = c7277Vo2;
        }
        if (c7277Vo != null) {
            str = c7277Vo.f70928a;
            i10 = c7277Vo.f70929b;
        } else {
            i10 = 1;
            str = "";
        }
        this.f78831a.R0(new BinderC6736Fo(str, i10), this.f78833c, this.f78834d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8241hj
    public final void zzb() {
        this.f78831a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8241hj
    public final void zzc() {
        this.f78831a.zzf();
    }
}
