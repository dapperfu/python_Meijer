package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC8247gd implements Ku0 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);


    /* renamed from: n, reason: collision with root package name */
    private static final Lu0<EnumC8247gd> f75199n = new Lu0<EnumC8247gd>() { // from class: com.google.android.gms.internal.ads.gd.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f75201a;

    public static EnumC8247gd a(int i10) {
        switch (i10) {
            case 0:
                return AD_INITIATER_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return DFP_BANNER;
            case 3:
                return INTERSTITIAL;
            case 4:
                return DFP_INTERSTITIAL;
            case 5:
                return NATIVE_EXPRESS;
            case 6:
                return AD_LOADER;
            case 7:
                return REWARD_BASED_VIDEO_AD;
            case 8:
                return BANNER_SEARCH_ADS;
            case 9:
                return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
            case 10:
                return APP_OPEN;
            case 11:
                return REWARDED_INTERSTITIAL;
            default:
                return null;
        }
    }

    public static Mu0 b() {
        return C8354hd.f75593a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        return this.f75201a;
    }

    EnumC8247gd(int i10) {
        this.f75201a = i10;
    }
}
