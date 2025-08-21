package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Rb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7248Rb {

    /* renamed from: a, reason: collision with root package name */
    private final Object f70734a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private C7180Pb f70735b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f70736c = false;

    public final Activity a() {
        synchronized (this.f70734a) {
            try {
                C7180Pb c7180Pb = this.f70735b;
                if (c7180Pb == null) {
                    return null;
                }
                return c7180Pb.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Context b() {
        synchronized (this.f70734a) {
            try {
                C7180Pb c7180Pb = this.f70735b;
                if (c7180Pb == null) {
                    return null;
                }
                return c7180Pb.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(InterfaceC7214Qb interfaceC7214Qb) {
        synchronized (this.f70734a) {
            try {
                if (this.f70735b == null) {
                    this.f70735b = new C7180Pb();
                }
                this.f70735b.f(interfaceC7214Qb);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Context context) {
        synchronized (this.f70734a) {
            try {
                if (!this.f70736c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        Sc.p.g("Can not cast Context to Application");
                        return;
                    }
                    if (this.f70735b == null) {
                        this.f70735b = new C7180Pb();
                    }
                    this.f70735b.g(application, context);
                    this.f70736c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(InterfaceC7214Qb interfaceC7214Qb) {
        synchronized (this.f70734a) {
            try {
                C7180Pb c7180Pb = this.f70735b;
                if (c7180Pb == null) {
                    return;
                }
                c7180Pb.h(interfaceC7214Qb);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
