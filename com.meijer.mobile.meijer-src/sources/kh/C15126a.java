package kh;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import lh.C15495e;
import nh.C15943a;

/* renamed from: kh.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C15126a extends C15129d implements InterfaceC15130e {

    /* renamed from: b, reason: collision with root package name */
    private final Application f141846b;

    private String f() {
        return this.f141846b.getPackageName();
    }

    private String g() {
        try {
            PackageManager packageManager = this.f141846b.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f141846b.getPackageName(), 0)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return super.a().b();
        }
    }

    private String h() {
        try {
            return Build.VERSION.SDK_INT >= 28 ? String.valueOf(this.f141846b.getPackageManager().getPackageInfo(this.f141846b.getPackageName(), 0).getLongVersionCode()) : String.valueOf(this.f141846b.getPackageManager().getPackageInfo(this.f141846b.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private String i() {
        try {
            return this.f141846b.getPackageManager().getPackageInfo(this.f141846b.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // kh.C15129d, kh.InterfaceC15130e
    public C15943a a() {
        C15495e c15495e = new C15495e();
        c15495e.e(f());
        c15495e.g(h());
        c15495e.f(g());
        c15495e.h(i());
        C15943a c15943aI = c15495e.i();
        return c15943aI.a() == null ? super.a() : c15943aI;
    }

    @Override // kh.C15129d, kh.InterfaceC15130e
    public String b() {
        return "Android";
    }

    @Override // kh.C15129d, kh.InterfaceC15130e
    public String c() {
        return Build.MODEL;
    }

    @Override // kh.C15129d, kh.InterfaceC15130e
    public String d() {
        return Build.MANUFACTURER;
    }

    @Override // kh.C15129d, kh.InterfaceC15130e
    public String getLocale() {
        return this.f141846b.getResources().getConfiguration().getLocales().get(0).toLanguageTag();
    }

    @Override // kh.C15129d, kh.InterfaceC15130e
    public String getOSName() {
        return "Android" + Build.VERSION.SDK_INT;
    }

    @Override // kh.C15129d, kh.InterfaceC15130e
    public String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    public C15126a(Application application) {
        this.f141846b = application;
    }
}
