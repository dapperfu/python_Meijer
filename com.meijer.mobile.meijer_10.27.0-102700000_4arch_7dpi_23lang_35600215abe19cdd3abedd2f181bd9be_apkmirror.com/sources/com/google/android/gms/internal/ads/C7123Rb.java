package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Rb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7123Rb {

    /* renamed from: a, reason: collision with root package name */
    private final Object f69894a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private C7055Pb f69895b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f69896c = false;

    public final Activity a() {
        synchronized (this.f69894a) {
            try {
                C7055Pb c7055Pb = this.f69895b;
                if (c7055Pb == null) {
                    return null;
                }
                return c7055Pb.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Context b() {
        synchronized (this.f69894a) {
            try {
                C7055Pb c7055Pb = this.f69895b;
                if (c7055Pb == null) {
                    return null;
                }
                return c7055Pb.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(InterfaceC7089Qb interfaceC7089Qb) {
        synchronized (this.f69894a) {
            try {
                if (this.f69895b == null) {
                    this.f69895b = new C7055Pb();
                }
                this.f69895b.f(interfaceC7089Qb);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Context context) {
        synchronized (this.f69894a) {
            try {
                if (!this.f69896c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        Qc.p.g("Can not cast Context to Application");
                        return;
                    }
                    if (this.f69895b == null) {
                        this.f69895b = new C7055Pb();
                    }
                    this.f69895b.g(application, context);
                    this.f69896c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(InterfaceC7089Qb interfaceC7089Qb) {
        synchronized (this.f69894a) {
            try {
                C7055Pb c7055Pb = this.f69895b;
                if (c7055Pb == null) {
                    return;
                }
                c7055Pb.h(interfaceC7089Qb);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
