package com.google.android.gms.internal.vision;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes6.dex */
public abstract class H2<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f84368a;

    /* renamed from: c, reason: collision with root package name */
    private final String f84370c;

    /* renamed from: d, reason: collision with root package name */
    private final String f84371d;

    /* renamed from: e, reason: collision with root package name */
    private final String f84372e;

    /* renamed from: h, reason: collision with root package name */
    private T f84375h;

    /* renamed from: b, reason: collision with root package name */
    private final Object f84369b = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f84373f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f84374g = false;

    protected abstract T a(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException;

    protected abstract void b() throws RemoteException;

    public final void d() {
        synchronized (this.f84369b) {
            if (this.f84375h == null) {
                return;
            }
            try {
                b();
            } catch (RemoteException e10) {
                FS.log_e(this.f84370c, "Could not finalize native handle", e10);
            }
        }
    }

    protected final T e() {
        DynamiteModule dynamiteModuleE;
        synchronized (this.f84369b) {
            T t10 = this.f84375h;
            if (t10 != null) {
                return t10;
            }
            try {
                dynamiteModuleE = DynamiteModule.e(this.f84368a, DynamiteModule.f65001g, this.f84371d);
            } catch (DynamiteModule.LoadingException unused) {
                String str = String.format("%s.%s", "com.google.android.gms.vision", this.f84372e);
                Ud.d.a("Cannot load thick client module, fall back to load optional module %s", str);
                try {
                    dynamiteModuleE = DynamiteModule.e(this.f84368a, DynamiteModule.f64996b, str);
                } catch (DynamiteModule.LoadingException e10) {
                    Ud.d.c(e10, "Error loading optional module %s", str);
                    if (!this.f84373f) {
                        Ud.d.a("Broadcasting download intent for dependency %s", this.f84372e);
                        String str2 = this.f84372e;
                        Intent intent = new Intent();
                        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
                        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", str2);
                        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
                        this.f84368a.sendBroadcast(intent);
                        this.f84373f = true;
                    }
                    dynamiteModuleE = null;
                }
            }
            if (dynamiteModuleE != null) {
                try {
                    this.f84375h = a(dynamiteModuleE, this.f84368a);
                } catch (RemoteException | DynamiteModule.LoadingException e11) {
                    FS.log_e(this.f84370c, "Error creating remote native handle", e11);
                }
            }
            boolean z10 = this.f84374g;
            if (!z10 && this.f84375h == null) {
                FS.log_w(this.f84370c, "Native handle not yet available. Reverting to no-op handle.");
                this.f84374g = true;
            } else if (z10 && this.f84375h != null) {
                FS.log_w(this.f84370c, "Native handle is now available.");
            }
            return this.f84375h;
        }
    }

    public H2(Context context, String str, String str2) {
        String str3;
        this.f84368a = context;
        this.f84370c = str;
        String strValueOf = String.valueOf(str2);
        if (strValueOf.length() != 0) {
            str3 = "com.google.android.gms.vision.dynamite.".concat(strValueOf);
        } else {
            str3 = new String("com.google.android.gms.vision.dynamite.");
        }
        this.f84371d = str3;
        this.f84372e = str2;
    }

    public final boolean c() {
        if (e() != null) {
            return true;
        }
        return false;
    }
}
