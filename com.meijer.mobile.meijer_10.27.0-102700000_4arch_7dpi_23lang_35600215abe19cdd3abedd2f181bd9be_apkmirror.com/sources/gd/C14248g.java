package gd;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r0;
import io.constructor.data.local.PreferencesHelper;
import qd.C16519f;

/* renamed from: gd.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14248g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f133317a = C14250i.f133320a;

    /* renamed from: b, reason: collision with root package name */
    private static final C14248g f133318b = new C14248g();

    public Intent b(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            int i11 = r0.f64931c;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && com.google.android.gms.common.util.j.g(context)) {
            int i12 = r0.f64931c;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("gcore_");
        sb2.append(f133317a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(C16519f.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        int i13 = r0.f64931c;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(PreferencesHelper.PREF_ID, "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(Context context, int i10, int i11) {
        return d(context, i10, i11, null);
    }

    public static C14248g f() {
        return f133318b;
    }

    public int g(Context context) {
        return h(context, f133317a);
    }

    C14248g() {
    }

    public int a(Context context) {
        return C14250i.a(context);
    }

    public PendingIntent d(Context context, int i10, int i11, String str) {
        Intent intentB = b(context, i10, str);
        if (intentB == null) {
            return null;
        }
        return androidx.core.app.t.b(context, i11, intentB, 134217728, false);
    }

    public String e(int i10) {
        return C14250i.b(i10);
    }

    public int h(Context context, int i10) {
        int iG = C14250i.g(context, i10);
        if (C14250i.h(context, iG)) {
            return 18;
        }
        return iG;
    }

    public boolean i(Context context, String str) {
        return C14250i.l(context, str);
    }

    public boolean j(int i10) {
        return C14250i.j(i10);
    }
}
