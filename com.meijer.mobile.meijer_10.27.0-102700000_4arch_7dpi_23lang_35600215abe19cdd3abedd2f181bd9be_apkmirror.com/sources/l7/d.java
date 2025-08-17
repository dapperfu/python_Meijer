package l7;

import Z.C5503a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p7.j;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<j> f148693a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final C5503a<j, List<Class<?>>> f148694b = new C5503a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        j andSet = this.f148693a.getAndSet(null);
        if (andSet == null) {
            andSet = new j(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f148694b) {
            list = this.f148694b.get(andSet);
        }
        this.f148693a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f148694b) {
            this.f148694b.put(new j(cls, cls2, cls3), list);
        }
    }
}
