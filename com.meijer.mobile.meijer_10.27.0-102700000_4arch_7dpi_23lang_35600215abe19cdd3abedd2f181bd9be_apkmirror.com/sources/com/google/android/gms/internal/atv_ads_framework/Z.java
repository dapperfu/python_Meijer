package com.google.android.gms.internal.atv_ads_framework;

/* loaded from: classes6.dex */
public enum Z implements M0 {
    TEL(0),
    SMS(1),
    CALLTO(2),
    WTAI(3),
    RTSP(4),
    MARKET(5),
    GEO(6),
    SKYPE(7),
    WHATSAPP(8),
    ITMS(20),
    ITMS_BOOKS(9),
    ITMS_BOOKSS(27),
    GLASS(10),
    ITMS_APPS(11),
    ITMS_APPSS(19),
    ITMS_SERVICES(22),
    GOOGLEASSISTANT(12),
    ASSISTANT_SETTINGS(13),
    SSH(14),
    INTENT(15),
    SIP(16),
    GOOGLEHOME(17),
    CHROMECAST(18),
    PAY(21),
    GOOGLEAPP(23),
    CID(24),
    WEBCAL(25),
    YOUTUBE(26);


    /* renamed from: D, reason: collision with root package name */
    private static final N0 f80916D = new N0() { // from class: com.google.android.gms.internal.atv_ads_framework.Y
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f80943a;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f80943a);
    }

    Z(int i10) {
        this.f80943a = i10;
    }
}
