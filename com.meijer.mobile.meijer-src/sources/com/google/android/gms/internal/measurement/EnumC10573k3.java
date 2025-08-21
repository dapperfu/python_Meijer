package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.k3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC10573k3 implements InterfaceC10557i5 {
    CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN(0),
    CLIENT_UPLOAD_ELIGIBLE(1),
    MEASUREMENT_SERVICE_NOT_ENABLED(2),
    ANDROID_TOO_OLD(3),
    NON_PLAY_MODE(4),
    SDK_TOO_OLD(5),
    MISSING_JOB_SCHEDULER(6),
    NOT_ENABLED_IN_MANIFEST(7),
    CLIENT_FLAG_OFF(8),
    SERVICE_FLAG_OFF(20),
    PINNED_TO_SERVICE_UPLOAD(21),
    MISSING_SGTM_SERVER_URL(22);


    /* renamed from: a, reason: collision with root package name */
    private final int f83087a;

    public static EnumC10573k3 a(int i10) {
        switch (i10) {
            case 0:
                return CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
            case 1:
                return CLIENT_UPLOAD_ELIGIBLE;
            case 2:
                return MEASUREMENT_SERVICE_NOT_ENABLED;
            case 3:
                return ANDROID_TOO_OLD;
            case 4:
                return NON_PLAY_MODE;
            case 5:
                return SDK_TOO_OLD;
            case 6:
                return MISSING_JOB_SCHEDULER;
            case 7:
                return NOT_ENABLED_IN_MANIFEST;
            case 8:
                return CLIENT_FLAG_OFF;
            default:
                switch (i10) {
                    case 20:
                        return SERVICE_FLAG_OFF;
                    case 21:
                        return PINNED_TO_SERVICE_UPLOAD;
                    case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                        return MISSING_SGTM_SERVER_URL;
                    default:
                        return null;
                }
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f83087a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10557i5
    public final int zza() {
        return this.f83087a;
    }

    EnumC10573k3(int i10) {
        this.f83087a = i10;
    }
}
