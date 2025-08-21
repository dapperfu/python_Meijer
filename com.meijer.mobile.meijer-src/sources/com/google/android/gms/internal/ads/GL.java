package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class GL implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68011a;

    public GL(InterfaceC10213yy0 interfaceC10213yy0) {
        this.f68011a = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        EnumC8247gd enumC8247gd = ((QB) this.f68011a).a().f79589o.f75082a == 3 ? EnumC8247gd.REWARDED_INTERSTITIAL : EnumC8247gd.REWARD_BASED_VIDEO_AD;
        C9358qy0.b(enumC8247gd);
        return enumC8247gd;
    }
}
