package jh;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import kh.C15151e;
import mh.C15620a;

/* renamed from: jh.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C14892a extends C14895d implements InterfaceC14896e {

    /* renamed from: b, reason: collision with root package name */
    private final Application f139591b;

    private String f() {
        return this.f139591b.getPackageName();
    }

    private String g() {
        try {
            PackageManager packageManager = this.f139591b.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f139591b.getPackageName(), 0)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return super.a().b();
        }
    }

    private String h() {
        try {
            return Build.VERSION.SDK_INT >= 28 ? String.valueOf(this.f139591b.getPackageManager().getPackageInfo(this.f139591b.getPackageName(), 0).getLongVersionCode()) : String.valueOf(this.f139591b.getPackageManager().getPackageInfo(this.f139591b.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private String i() {
        try {
            return this.f139591b.getPackageManager().getPackageInfo(this.f139591b.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // jh.C14895d, jh.InterfaceC14896e
    public C15620a a() {
        C15151e c15151e = new C15151e();
        c15151e.e(f());
        c15151e.g(h());
        c15151e.f(g());
        c15151e.h(i());
        C15620a c15620aI = c15151e.i();
        return c15620aI.a() == null ? super.a() : c15620aI;
    }

    @Override // jh.C14895d, jh.InterfaceC14896e
    public String b() {
        return "Android";
    }

    @Override // jh.C14895d, jh.InterfaceC14896e
    public String c() {
        return Build.MODEL;
    }

    @Override // jh.C14895d, jh.InterfaceC14896e
    public String d() {
        return Build.MANUFACTURER;
    }

    @Override // jh.C14895d, jh.InterfaceC14896e
    public String getLocale() {
        return this.f139591b.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
    }

    @Override // jh.C14895d, jh.InterfaceC14896e
    public String getOSName() {
        return "Android" + Build.VERSION.SDK_INT;
    }

    @Override // jh.C14895d, jh.InterfaceC14896e
    public String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    public C14892a(Application application) {
        this.f139591b = application;
    }
}
