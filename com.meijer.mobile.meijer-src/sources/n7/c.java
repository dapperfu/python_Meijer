package n7;

import Z.C5603a;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.q;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import k7.C15109g;
import r7.j;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final q<?, ?, ?> f152087c = new q<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new C15109g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    private final C5603a<j, q<?, ?, ?>> f152088a = new C5603a<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<j> f152089b = new AtomicReference<>();

    private j b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        j andSet = this.f152089b.getAndSet(null);
        if (andSet == null) {
            andSet = new j();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public boolean c(q<?, ?, ?> qVar) {
        return f152087c.equals(qVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, q<?, ?, ?> qVar) {
        synchronized (this.f152088a) {
            C5603a<j, q<?, ?, ?>> c5603a = this.f152088a;
            j jVar = new j(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f152087c;
            }
            c5603a.put(jVar, qVar);
        }
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        q<Data, TResource, Transcode> qVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f152088a) {
            qVar = (q) this.f152088a.get(jVarB);
        }
        this.f152089b.set(jVarB);
        return qVar;
    }
}
