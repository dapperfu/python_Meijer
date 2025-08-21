package n7;

import Z.C5603a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import r7.j;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<j> f152090a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final C5603a<j, List<Class<?>>> f152091b = new C5603a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        j andSet = this.f152090a.getAndSet(null);
        if (andSet == null) {
            andSet = new j(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f152091b) {
            list = this.f152091b.get(andSet);
        }
        this.f152090a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f152091b) {
            this.f152091b.put(new j(cls, cls2, cls3), list);
        }
    }
}
