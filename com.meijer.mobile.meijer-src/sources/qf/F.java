package qf;

import Vd.AbstractC5516j;
import Vd.C5517k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import rf.C16898b;

/* loaded from: classes8.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f158283a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f158284b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f158285c;

    /* renamed from: d, reason: collision with root package name */
    C5517k<Void> f158286d;

    /* renamed from: e, reason: collision with root package name */
    boolean f158287e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f158288f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f158289g;

    /* renamed from: h, reason: collision with root package name */
    private final C5517k<Void> f158290h;

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f158289g;
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
                this.f158288f = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f158289g = bool != null ? bool : a(this.f158284b.k());
        i(this.f158283a, bool);
        synchronized (this.f158285c) {
            try {
                if (d()) {
                    if (!this.f158287e) {
                        this.f158286d.e(null);
                        this.f158287e = true;
                    }
                } else if (this.f158287e) {
                    this.f158286d = new C5517k<>();
                    this.f158287e = false;
                }
            } finally {
            }
        }
    }

    private Boolean b() {
        if (!this.f158283a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f158288f = false;
        return Boolean.valueOf(this.f158283a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f158284b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z10) {
        nf.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", z10 ? "ENABLED" : "DISABLED", this.f158289g == null ? "global Firebase setting" : this.f158288f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
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
            nf.g.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    public void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f158290h.e(null);
    }

    public AbstractC5516j<Void> j() {
        AbstractC5516j<Void> abstractC5516jA;
        synchronized (this.f158285c) {
            abstractC5516jA = this.f158286d.a();
        }
        return abstractC5516jA;
    }

    public AbstractC5516j<Void> k() {
        return C16898b.b(this.f158290h.a(), j());
    }

    public F(com.google.firebase.f fVar) {
        Object obj = new Object();
        this.f158285c = obj;
        this.f158286d = new C5517k<>();
        this.f158287e = false;
        this.f158288f = false;
        this.f158290h = new C5517k<>();
        Context contextK = fVar.k();
        this.f158284b = fVar;
        this.f158283a = C16649i.q(contextK);
        Boolean boolB = b();
        this.f158289g = boolB == null ? a(contextK) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f158286d.e(null);
                    this.f158287e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean boolG = g(context);
        if (boolG == null) {
            this.f158288f = false;
            return null;
        }
        this.f158288f = true;
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
