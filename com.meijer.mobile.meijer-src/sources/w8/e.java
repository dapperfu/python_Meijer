package w8;

import X7.AppVersion;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import i8.x;
import z8.InterfaceC18460a;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f167008c = x.f137411a + "AppVersionTracker";

    /* renamed from: a, reason: collision with root package name */
    private final Context f167009a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC18460a f167010b;

    @SuppressLint({"NewApi"})
    public AppVersion a() {
        try {
            PackageInfo packageInfo = this.f167010b.a() >= 33 ? this.f167009a.getPackageManager().getPackageInfo(this.f167009a.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : this.f167009a.getPackageManager().getPackageInfo(this.f167009a.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return new AppVersion(this.f167010b.a() >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode, packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e10) {
            if (x.f137412b) {
                z8.f.v(f167008c, "Failed to determine app version from PackageInfo", e10);
            }
            return null;
        }
    }

    public e(Context context, InterfaceC18460a interfaceC18460a) {
        this.f167009a = context;
        this.f167010b = interfaceC18460a;
    }
}
