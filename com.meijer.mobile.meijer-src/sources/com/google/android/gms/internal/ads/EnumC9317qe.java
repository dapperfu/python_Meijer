package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC9317qe implements Ku0 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);


    /* renamed from: m, reason: collision with root package name */
    private static final Lu0<EnumC9317qe> f78653m = new Lu0<EnumC9317qe>() { // from class: com.google.android.gms.internal.ads.qe.a
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f78655a;

    public static EnumC9317qe a(int i10) {
        switch (i10) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    public static Mu0 b() {
        return C9423re.f78888a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.Ku0
    public final int zza() {
        return this.f78655a;
    }

    EnumC9317qe(int i10) {
        this.f78655a = i10;
    }
}
