package of;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* renamed from: of.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16033a {

    /* renamed from: a, reason: collision with root package name */
    public final String f153474a;

    /* renamed from: b, reason: collision with root package name */
    public final String f153475b;

    /* renamed from: c, reason: collision with root package name */
    public final List<C16038f> f153476c;

    /* renamed from: d, reason: collision with root package name */
    public final String f153477d;

    /* renamed from: e, reason: collision with root package name */
    public final String f153478e;

    /* renamed from: f, reason: collision with root package name */
    public final String f153479f;

    /* renamed from: g, reason: collision with root package name */
    public final String f153480g;

    /* renamed from: h, reason: collision with root package name */
    public final lf.f f153481h;

    private static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public C16033a(String str, String str2, List<C16038f> list, String str3, String str4, String str5, String str6, lf.f fVar) {
        this.f153474a = str;
        this.f153475b = str2;
        this.f153476c = list;
        this.f153477d = str3;
        this.f153478e = str4;
        this.f153479f = str5;
        this.f153480g = str6;
        this.f153481h = fVar;
    }

    public static C16033a a(Context context, K k10, String str, String str2, List<C16038f> list, lf.f fVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strG = k10.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C16033a(str, str2, list, strG, packageName, strB, str3, fVar);
    }
}
