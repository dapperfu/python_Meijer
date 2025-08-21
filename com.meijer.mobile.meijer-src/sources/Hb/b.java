package Hb;

import android.content.Context;
import android.content.pm.PackageManager;
import eb.C13784a;
import eb.C13785b;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final C13784a f13494b = C13785b.a(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Context f13495a;

    public final int a() {
        try {
            return this.f13495a.getPackageManager().getPackageInfo(this.f13495a.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public b(Context context) {
        this.f13495a = context;
    }
}
