package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9721uL implements InterfaceC8366hj {

    /* renamed from: a, reason: collision with root package name */
    private final IC f79671a;

    /* renamed from: b, reason: collision with root package name */
    private final C7402Vo f79672b;

    /* renamed from: c, reason: collision with root package name */
    private final String f79673c;

    /* renamed from: d, reason: collision with root package name */
    private final String f79674d;

    public C9721uL(IC ic2, Z50 z50) {
        this.f79671a = ic2;
        this.f79672b = z50.f72883l;
        this.f79673c = z50.f72879j;
        this.f79674d = z50.f72881k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8366hj
    public final void y0(C7402Vo c7402Vo) {
        int i10;
        String str;
        C7402Vo c7402Vo2 = this.f79672b;
        if (c7402Vo2 != null) {
            c7402Vo = c7402Vo2;
        }
        if (c7402Vo != null) {
            str = c7402Vo.f71768a;
            i10 = c7402Vo.f71769b;
        } else {
            i10 = 1;
            str = "";
        }
        this.f79671a.R0(new BinderC6861Fo(str, i10), this.f79673c, this.f79674d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8366hj
    public final void zzb() {
        this.f79671a.zze();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8366hj
    public final void zzc() {
        this.f79671a.zzf();
    }
}
