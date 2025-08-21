package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes6.dex */
public abstract class H2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f85208a;

    /* renamed from: c, reason: collision with root package name */
    private final String f85210c;

    /* renamed from: d, reason: collision with root package name */
    private final String f85211d;

    /* renamed from: e, reason: collision with root package name */
    private final String f85212e;

    /* renamed from: h, reason: collision with root package name */
    private T f85215h;

    /* renamed from: b, reason: collision with root package name */
    private final Object f85209b = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f85213f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f85214g = false;

    protected abstract T a(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException;

    protected abstract void b() throws RemoteException;

    public final void d() {
        synchronized (this.f85209b) {
            if (this.f85215h == null) {
                return;
            }
            try {
                b();
            } catch (RemoteException e10) {
                FS.log_e(this.f85210c, "Could not finalize native handle", e10);
            }
        }
    }

    protected final T e() {
        DynamiteModule dynamiteModuleE;
        synchronized (this.f85209b) {
            T t10 = this.f85215h;
            if (t10 != null) {
                return t10;
            }
            try {
                dynamiteModuleE = DynamiteModule.e(this.f85208a, DynamiteModule.f65841g, this.f85211d);
            } catch (DynamiteModule.LoadingException unused) {
                String str = String.format("%s.%s", "com.google.android.gms.vision", this.f85212e);
                Wd.d.a("Cannot load thick client module, fall back to load optional module %s", str);
                try {
                    dynamiteModuleE = DynamiteModule.e(this.f85208a, DynamiteModule.f65836b, str);
                } catch (DynamiteModule.LoadingException e10) {
                    Wd.d.c(e10, "Error loading optional module %s", str);
                    if (!this.f85213f) {
                        Wd.d.a("Broadcasting download intent for dependency %s", this.f85212e);
                        String str2 = this.f85212e;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str2);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f85208a.sendBroadcast(intent);
                        this.f85213f = true;
                    }
                    dynamiteModuleE = null;
                }
            }
            if (dynamiteModuleE != null) {
                try {
                    this.f85215h = a(dynamiteModuleE, this.f85208a);
                } catch (RemoteException | DynamiteModule.LoadingException e11) {
                    FS.log_e(this.f85210c, "Error creating remote native handle", e11);
                }
            }
            boolean z10 = this.f85214g;
            if (!z10 && this.f85215h == null) {
                FS.log_w(this.f85210c, "Native handle not yet available. Reverting to no-op handle.");
                this.f85214g = true;
            } else if (z10 && this.f85215h != null) {
                FS.log_w(this.f85210c, "Native handle is now available.");
            }
            return this.f85215h;
        }
    }

    public H2(Context context, String str, String str2) {
        String str3;
        this.f85208a = context;
        this.f85210c = str;
        String strValueOf = String.valueOf(str2);
        if (strValueOf.length() != 0) {
            str3 = "com.google.android.gms.vision.dynamite.".concat(strValueOf);
        } else {
            str3 = new String("com.google.android.gms.vision.dynamite.");
        }
        this.f85211d = str3;
        this.f85212e = str2;
    }

    public final boolean c() {
        if (e() != null) {
            return true;
        }
        return false;
    }
}
