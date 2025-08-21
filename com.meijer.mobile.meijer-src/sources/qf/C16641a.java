package qf;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* renamed from: qf.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C16641a {

    /* renamed from: a, reason: collision with root package name */
    public final String f158326a;

    /* renamed from: b, reason: collision with root package name */
    public final String f158327b;

    /* renamed from: c, reason: collision with root package name */
    public final List<C16646f> f158328c;

    /* renamed from: d, reason: collision with root package name */
    public final String f158329d;

    /* renamed from: e, reason: collision with root package name */
    public final String f158330e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158331f;

    /* renamed from: g, reason: collision with root package name */
    public final String f158332g;

    /* renamed from: h, reason: collision with root package name */
    public final nf.f f158333h;

    private static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public C16641a(String str, String str2, List<C16646f> list, String str3, String str4, String str5, String str6, nf.f fVar) {
        this.f158326a = str;
        this.f158327b = str2;
        this.f158328c = list;
        this.f158329d = str3;
        this.f158330e = str4;
        this.f158331f = str5;
        this.f158332g = str6;
        this.f158333h = fVar;
    }

    public static C16641a a(Context context, K k10, String str, String str2, List<C16646f> list, nf.f fVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strG = k10.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C16641a(str, str2, list, strG, packageName, strB, str3, fVar);
    }
}
