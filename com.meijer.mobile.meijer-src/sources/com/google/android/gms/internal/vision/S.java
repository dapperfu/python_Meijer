package com.google.android.gms.internal.vision;

/* loaded from: classes6.dex */
public enum S implements R0 {
    UNKNOWN_FORMAT(0),
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    TEXT(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12),
    BOARDING_PASS(13);


    /* renamed from: p, reason: collision with root package name */
    private static final U0<S> f85302p = new U0<S>() { // from class: com.google.android.gms.internal.vision.V
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f85304a;

    public static T0 b() {
        return U.f85319a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + S.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f85304a + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.vision.R0
    public final int zza() {
        return this.f85304a;
    }

    S(int i10) {
        this.f85304a = i10;
    }

    public static S a(int i10) {
        switch (i10) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return CONTACT_INFO;
            case 2:
                return EMAIL;
            case 3:
                return ISBN;
            case 4:
                return PHONE;
            case 5:
                return PRODUCT;
            case 6:
                return SMS;
            case 7:
                return TEXT;
            case 8:
                return URL;
            case 9:
                return WIFI;
            case 10:
                return GEO;
            case 11:
                return CALENDAR_EVENT;
            case 12:
                return DRIVER_LICENSE;
            case 13:
                return BOARDING_PASS;
            default:
                return null;
        }
    }
}
