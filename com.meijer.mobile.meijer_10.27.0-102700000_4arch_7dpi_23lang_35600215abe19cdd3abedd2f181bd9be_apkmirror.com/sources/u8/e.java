package u8;

import V7.AppVersion;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import g8.x;
import x8.InterfaceC18023a;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static final String f162799c = x.f133195a + "AppVersionTracker";

    /* renamed from: a, reason: collision with root package name */
    private final Context f162800a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC18023a f162801b;

    @SuppressLint({"NewApi"})
    public AppVersion a() {
        try {
            PackageInfo packageInfo = this.f162801b.a() >= 33 ? this.f162800a.getPackageManager().getPackageInfo(this.f162800a.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : this.f162800a.getPackageManager().getPackageInfo(this.f162800a.getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return new AppVersion(this.f162801b.a() >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode, packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e10) {
            if (x.f133196b) {
                x8.f.v(f162799c, "Failed to determine app version from PackageInfo", e10);
            }
            return null;
        }
    }

    public e(Context context, InterfaceC18023a interfaceC18023a) {
        this.f162800a = context;
        this.f162801b = interfaceC18023a;
    }
}
