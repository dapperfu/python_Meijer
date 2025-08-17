package of;

import Td.AbstractC5232j;
import Td.C5233k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import pf.C16294b;

/* loaded from: classes7.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f153431a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f153432b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f153433c;

    /* renamed from: d, reason: collision with root package name */
    C5233k<Void> f153434d;

    /* renamed from: e, reason: collision with root package name */
    boolean f153435e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f153436f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f153437g;

    /* renamed from: h, reason: collision with root package name */
    private final C5233k<Void> f153438h;

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f153437g;
            zBooleanValue = bool != null ? bool.booleanValue() : e();
            f(zBooleanValue);
        } catch (Throwable th2) {
            throw th2;
        }
        return zBooleanValue;
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f153436f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f153437g = bool != null ? bool : a(this.f153432b.k());
        i(this.f153431a, bool);
        synchronized (this.f153433c) {
            try {
                if (d()) {
                    if (!this.f153435e) {
                        this.f153434d.e(null);
                        this.f153435e = true;
                    }
                } else if (this.f153435e) {
                    this.f153434d = new C5233k<>();
                    this.f153435e = false;
                }
            } finally {
            }
        }
    }

    private Boolean b() {
        if (!this.f153431a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f153436f = false;
        return Boolean.valueOf(this.f153431a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f153432b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z10) {
        lf.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f153437g == null ? "global Firebase setting" : this.f153436f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            lf.g.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    public void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f153438h.e(null);
    }

    public AbstractC5232j<Void> j() {
        AbstractC5232j<Void> abstractC5232jA;
        synchronized (this.f153433c) {
            abstractC5232jA = this.f153434d.a();
        }
        return abstractC5232jA;
    }

    public AbstractC5232j<Void> k() {
        return C16294b.b(this.f153438h.a(), j());
    }

    public F(com.google.firebase.f fVar) {
        Object obj = new Object();
        this.f153433c = obj;
        this.f153434d = new C5233k<>();
        this.f153435e = false;
        this.f153436f = false;
        this.f153438h = new C5233k<>();
        Context contextK = fVar.k();
        this.f153432b = fVar;
        this.f153431a = C16041i.q(contextK);
        Boolean boolB = b();
        this.f153437g = boolB == null ? a(contextK) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f153434d.e(null);
                    this.f153435e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean boolG = g(context);
        if (boolG == null) {
            this.f153436f = false;
            return null;
        }
        this.f153436f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolG));
    }

    @SuppressLint({"ApplySharedPref"})
    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
    }
}
