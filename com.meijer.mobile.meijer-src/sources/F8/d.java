package F8;

import android.app.Application;
import i8.x;
import java.util.concurrent.atomic.AtomicBoolean;
import v8.C17648a;
import z8.f;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: g, reason: collision with root package name */
    private static final String f9103g = x.f137411a + "AppStartController";

    /* renamed from: a, reason: collision with root package name */
    private final v8.b f9104a;

    /* renamed from: b, reason: collision with root package name */
    private final c f9105b;

    /* renamed from: c, reason: collision with root package name */
    private final b f9106c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f9107d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f9108e;

    /* renamed from: f, reason: collision with root package name */
    private final Application f9109f;

    public void a(C17648a c17648a, String str) {
        if (this.f9107d.compareAndSet(false, true)) {
            throw null;
        }
    }

    public void b() {
        a(this.f9104a.a(), null);
    }

    public void c() {
        if (this.f9107d.compareAndSet(false, true)) {
            this.f9109f.unregisterActivityLifecycleCallbacks(this.f9108e);
            if (x.f137412b) {
                f.u(f9103g, "AppStart action dropped");
            }
        }
    }

    a d() {
        return this.f9108e;
    }

    public d(v8.b bVar, c cVar, b bVar2, Application application) {
        this.f9104a = bVar;
        this.f9105b = cVar;
        this.f9106c = bVar2;
        this.f9109f = application;
        this.f9108e = new a(this, bVar);
    }
}
