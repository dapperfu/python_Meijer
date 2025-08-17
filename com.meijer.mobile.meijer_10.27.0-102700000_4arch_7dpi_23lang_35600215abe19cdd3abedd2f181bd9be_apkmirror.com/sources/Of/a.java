package Of;

import Ff.c;
import Z1.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23627a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f23628b;

    /* renamed from: c, reason: collision with root package name */
    private final c f23629c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23630d;

    public synchronized boolean b() {
        return this.f23630d;
    }

    private boolean c() {
        return this.f23628b.contains("firebase_data_collection_default_enabled") ? this.f23628b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f23627a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f23627a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f23627a = contextA;
        this.f23628b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f23629c = cVar;
        this.f23630d = c();
    }

    private static Context a(Context context) {
        return b.b(context);
    }
}
