package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.fullstory.FS;
import dd.C13504b;
import gd.C14249h;
import j2.C14837e;
import java.util.Locale;
import qd.C16519f;

/* loaded from: classes4.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private static final Z.n0 f64802a = new Z.n0();

    /* renamed from: b, reason: collision with root package name */
    private static Locale f64803b;

    public static String d(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i10);
    }

    public static String e(Context context, int i10) {
        String strH = i10 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i10);
        return strH == null ? context.getResources().getString(C13504b.f127359h) : strH;
    }

    private static String h(Context context, String str) {
        Z.n0 n0Var = f64802a;
        synchronized (n0Var) {
            try {
                Locale localeC = C14837e.a(context.getResources().getConfiguration()).c(0);
                if (!localeC.equals(f64803b)) {
                    n0Var.clear();
                    f64803b = localeC;
                }
                String str2 = (String) n0Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesD = C14249h.d(context);
                if (resourcesD == null) {
                    return null;
                }
                int identifier = resourcesD.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    FS.log_w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = resourcesD.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    n0Var.put(str, string);
                    return string;
                }
                FS.log_w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C16519f.a(context).d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i10) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return resources.getString(R.string.ok);
                }
                return resources.getString(C13504b.f127352a);
            }
            return resources.getString(C13504b.f127361j);
        }
        return resources.getString(C13504b.f127355d);
    }

    public static String c(Context context, int i10) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 7) {
                            if (i10 != 9) {
                                if (i10 != 20) {
                                    switch (i10) {
                                        case 16:
                                            return g(context, "common_google_play_services_api_unavailable_text", strA);
                                        case 17:
                                            return g(context, "common_google_play_services_sign_in_failed_text", strA);
                                        case 18:
                                            return resources.getString(C13504b.f127364m, strA);
                                        default:
                                            return resources.getString(gd.k.f133328a, strA);
                                    }
                                }
                                return g(context, "common_google_play_services_restricted_profile_text", strA);
                            }
                            return resources.getString(C13504b.f127360i, strA);
                        }
                        return g(context, "common_google_play_services_network_error_text", strA);
                    }
                    return g(context, "common_google_play_services_invalid_account_text", strA);
                }
                return resources.getString(C13504b.f127353b, strA);
            }
            if (com.google.android.gms.common.util.j.g(context)) {
                return resources.getString(C13504b.f127365n);
            }
            return resources.getString(C13504b.f127362k, strA);
        }
        return resources.getString(C13504b.f127356e, strA);
    }

    public static String f(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(C13504b.f127357f);
            case 2:
                return resources.getString(C13504b.f127363l);
            case 3:
                return resources.getString(C13504b.f127354c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                FS.log_e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                FS.log_e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                FS.log_e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                FS.log_e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                FS.log_e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                FS.log_e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                FS.log_e("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
            case 16:
                FS.log_e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                FS.log_e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                FS.log_e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String g(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(gd.k.f133328a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }
}
