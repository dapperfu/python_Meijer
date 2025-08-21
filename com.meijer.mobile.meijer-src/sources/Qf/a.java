package Qf;

import Hf.c;
import Z1.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28115a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f28116b;

    /* renamed from: c, reason: collision with root package name */
    private final c f28117c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f28118d;

    public synchronized boolean b() {
        return this.f28118d;
    }

    private boolean c() {
        return this.f28116b.contains("firebase_data_collection_default_enabled") ? this.f28116b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f28115a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f28115a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f28115a = contextA;
        this.f28116b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f28117c = cVar;
        this.f28118d = c();
    }

    private static Context a(Context context) {
        return b.b(context);
    }
}
