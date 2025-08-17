package D8;

import android.app.Application;
import g8.x;
import java.util.concurrent.atomic.AtomicBoolean;
import t8.C17073a;
import x8.f;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: g, reason: collision with root package name */
    private static final String f5070g = x.f133195a + "AppStartController";

    /* renamed from: a, reason: collision with root package name */
    private final t8.b f5071a;

    /* renamed from: b, reason: collision with root package name */
    private final c f5072b;

    /* renamed from: c, reason: collision with root package name */
    private final b f5073c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f5074d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final a f5075e;

    /* renamed from: f, reason: collision with root package name */
    private final Application f5076f;

    public void a(C17073a c17073a, String str) {
        if (this.f5074d.compareAndSet(false, true)) {
            throw null;
        }
    }

    public void b() {
        a(this.f5071a.a(), null);
    }

    public void c() {
        if (this.f5074d.compareAndSet(false, true)) {
            this.f5076f.unregisterActivityLifecycleCallbacks(this.f5075e);
            if (x.f133196b) {
                f.u(f5070g, "AppStart action dropped");
            }
        }
    }

    a d() {
        return this.f5075e;
    }

    public d(t8.b bVar, c cVar, b bVar2, Application application) {
        this.f5071a = bVar;
        this.f5072b = cVar;
        this.f5073c = bVar2;
        this.f5076f = application;
        this.f5075e = new a(this, bVar);
    }
}
