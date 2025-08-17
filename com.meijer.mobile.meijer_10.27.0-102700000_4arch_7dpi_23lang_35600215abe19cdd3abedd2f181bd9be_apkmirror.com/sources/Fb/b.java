package Fb;

import android.content.Context;
import android.content.pm.PackageManager;
import cb.C6380a;
import cb.C6381b;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static final C6380a f10367b = C6381b.a(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Context f10368a;

    public final int a() {
        try {
            return this.f10368a.getPackageManager().getPackageInfo(this.f10368a.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public b(Context context) {
        this.f10368a = context;
    }
}
