package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public enum zzuc implements zzbai {
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
    YOUTUBE(26),
    FILE(28),
    CONTENT(29),
    HELPFULINTERRUPTION(30),
    GOOGLECHROMEACTION(31),
    GOOGLECHROME(32),
    GOOGLECHROMES(33),
    GOOGLEPHOTOS(34);

    private final int zzJ;

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzJ);
    }

    @Override // com.google.android.libraries.places.internal.zzbai
    public final int zza() {
        return this.zzJ;
    }

    zzuc(int i10) {
        this.zzJ = i10;
    }
}
