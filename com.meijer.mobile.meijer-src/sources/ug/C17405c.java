package ug;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C6653j;
import java.util.Locale;

/* renamed from: ug.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C17405c {

    /* renamed from: a, reason: collision with root package name */
    private static final C6653j f163938a = new C6653j("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e10) {
            f163938a.c("CommonUtils", "Exception thrown when trying to get app version ".concat(e10.toString()));
            return "";
        }
    }

    public static String b(Locale locale) {
        if (com.google.android.gms.common.util.n.d()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb2 = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb2.append("-");
            sb2.append(locale.getVariant());
        }
        return sb2.toString();
    }
}
