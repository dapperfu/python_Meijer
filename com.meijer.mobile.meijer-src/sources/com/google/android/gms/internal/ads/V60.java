package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzba;

/* loaded from: classes6.dex */
public final class V60 {
    public static Oc.W0 c(int i10, Oc.W0 w02) {
        if (i10 == 0) {
            throw null;
        }
        if (i10 == 8) {
            if (((Integer) Oc.A.c().a(C8784lf.f77182g8)).intValue() > 0) {
                return w02;
            }
            i10 = 8;
        }
        return d(i10, null, w02);
    }

    public static Oc.W0 a(Throwable th2) {
        if (th2 instanceof zzeda) {
            zzeda zzedaVar = (zzeda) th2;
            return c(zzedaVar.a(), zzedaVar.b());
        }
        if (th2 instanceof zzdvy) {
            return th2.getMessage() == null ? d(((zzdvy) th2).a(), null, null) : d(((zzdvy) th2).a(), th2.getMessage(), null);
        }
        if (!(th2 instanceof zzba)) {
            return d(1, null, null);
        }
        zzba zzbaVar = (zzba) th2;
        return new Oc.W0(zzbaVar.a(), C7392Vf0.c(zzbaVar.getMessage()), "com.google.android.gms.ads", null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Oc.W0 d(int i10, String str, Oc.W0 w02) {
        String str2;
        int i11 = i10 - 1;
        if (str == null) {
            if (i10 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i11) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) Oc.A.c().a(C8784lf.f77224j8)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i10 == 0) {
            throw null;
        }
        int i12 = 0;
        int i13 = 2;
        switch (i11) {
            case 0:
            case 11:
            case 15:
                i13 = i12;
                return new Oc.W0(i13, str3, "com.google.android.gms.ads", w02, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i13 = 1;
                return new Oc.W0(i13, str3, "com.google.android.gms.ads", w02, null);
            case 2:
            case 10:
            case 18:
                i13 = 3;
                return new Oc.W0(i13, str3, "com.google.android.gms.ads", w02, null);
            case 3:
                i12 = 8;
                i13 = i12;
                return new Oc.W0(i13, str3, "com.google.android.gms.ads", w02, null);
            case 4:
            case 8:
            case 17:
                return new Oc.W0(i13, str3, "com.google.android.gms.ads", w02, null);
            case 7:
                i12 = 4;
                i13 = i12;
                return new Oc.W0(i13, str3, "com.google.android.gms.ads", w02, null);
            case 12:
                if (((Integer) Oc.A.c().a(C8784lf.f77224j8)).intValue() <= 0) {
                    i12 = 9;
                    i13 = i12;
                    return new Oc.W0(i13, str3, "com.google.android.gms.ads", w02, null);
                }
                i13 = 3;
                return new Oc.W0(i13, str3, "com.google.android.gms.ads", w02, null);
            case 13:
                i12 = 10;
                i13 = i12;
                return new Oc.W0(i13, str3, "com.google.android.gms.ads", w02, null);
            case 14:
                i12 = 11;
                i13 = i12;
                return new Oc.W0(i13, str3, "com.google.android.gms.ads", w02, null);
            default:
                switch (i10) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }

    public static Oc.W0 b(Throwable th2, C8981nT c8981nT) {
        Oc.W0 w02;
        Oc.W0 w0A = a(th2);
        int i10 = w0A.f23346a;
        if ((i10 == 3 || i10 == 0) && (w02 = w0A.f23349d) != null && !w02.f23348c.equals("com.google.android.gms.ads")) {
            w0A.f23349d = null;
        }
        if (c8981nT != null) {
            w0A.f23350e = c8981nT.b();
        }
        return w0A;
    }
}
