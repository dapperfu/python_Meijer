package com.google.android.gms.common.internal;

import com.fullstory.FS;

/* loaded from: classes4.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f65672a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f65673b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC6646c f65674c;

    public c0(AbstractC6646c abstractC6646c, Object obj) {
        this.f65674c = abstractC6646c;
        this.f65672a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f65672a;
                if (this.f65673b) {
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
            this.f65673b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f65672a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f65674c.zzt) {
            this.f65674c.zzt.remove(this);
        }
    }
}
