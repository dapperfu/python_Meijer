package l7;

import Z.C5503a;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.q;
import i7.C14706g;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p7.j;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final q<?, ?, ?> f148690c = new q<>(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new C14706g(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    private final C5503a<j, q<?, ?, ?>> f148691a = new C5503a<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<j> f148692b = new AtomicReference<>();

    private j b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        j andSet = this.f148692b.getAndSet(null);
        if (andSet == null) {
            andSet = new j();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public boolean c(q<?, ?, ?> qVar) {
        return f148690c.equals(qVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, q<?, ?, ?> qVar) {
        synchronized (this.f148691a) {
            C5503a<j, q<?, ?, ?>> c5503a = this.f148691a;
            j jVar = new j(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f148690c;
            }
            c5503a.put(jVar, qVar);
        }
    }

    public <Data, TResource, Transcode> q<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        q<Data, TResource, Transcode> qVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f148691a) {
            qVar = (q) this.f148691a.get(jVarB);
        }
        this.f148692b.set(jVarB);
        return qVar;
    }
}
