package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class GL implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f67171a;

    public GL(InterfaceC10088yy0 interfaceC10088yy0) {
        this.f67171a = interfaceC10088yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        EnumC8122gd enumC8122gd = ((QB) this.f67171a).a().f78749o.f74242a == 3 ? EnumC8122gd.REWARDED_INTERSTITIAL : EnumC8122gd.REWARD_BASED_VIDEO_AD;
        C9233qy0.b(enumC8122gd);
        return enumC8122gd;
    }
}
