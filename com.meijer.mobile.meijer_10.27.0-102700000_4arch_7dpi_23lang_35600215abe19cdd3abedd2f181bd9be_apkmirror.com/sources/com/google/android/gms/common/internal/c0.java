package com.google.android.gms.common.internal;

import com.fullstory.FS;

/* loaded from: classes4.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f64832a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f64833b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC6521c f64834c;

    public c0(AbstractC6521c abstractC6521c, Object obj) {
        this.f64834c = abstractC6521c;
        this.f64832a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f64832a;
                if (this.f64833b) {
                    FS.log_w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f64833b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f64832a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f64834c.zzt) {
            this.f64834c.zzt.remove(this);
        }
    }
}
