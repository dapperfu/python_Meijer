package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.AbstractC11423g;
import com.google.crypto.tink.internal.L;
import com.google.crypto.tink.internal.TinkBugException;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes8.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    private static final w f89072b = (w) TinkBugException.a(new TinkBugException.a() { // from class: com.google.crypto.tink.internal.u
        @Override // com.google.crypto.tink.internal.TinkBugException.a
        public final Object get() {
            return w.b();
        }
    });

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<L> f89073a = new AtomicReference<>(new L.b().e());

    public synchronized <SerializationT extends K> void j(AbstractC11422f<SerializationT> abstractC11422f) throws GeneralSecurityException {
        this.f89073a.set(new L.b(this.f89073a.get()).f(abstractC11422f).e());
    }

    public synchronized <KeyT extends Ke.j, SerializationT extends K> void k(AbstractC11423g<KeyT, SerializationT> abstractC11423g) throws GeneralSecurityException {
        this.f89073a.set(new L.b(this.f89073a.get()).g(abstractC11423g).e());
    }

    public synchronized <SerializationT extends K> void l(y<SerializationT> yVar) throws GeneralSecurityException {
        this.f89073a.set(new L.b(this.f89073a.get()).h(yVar).e());
    }

    public synchronized <ParametersT extends Ke.x, SerializationT extends K> void m(z<ParametersT, SerializationT> zVar) throws GeneralSecurityException {
        this.f89073a.set(new L.b(this.f89073a.get()).i(zVar).e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w b() throws GeneralSecurityException {
        w wVar = new w();
        wVar.k(AbstractC11423g.a(new AbstractC11423g.b() { // from class: com.google.crypto.tink.internal.v
            @Override // com.google.crypto.tink.internal.AbstractC11423g.b
            public final K a(Ke.j jVar, Ke.C c10) {
                return ((C11426j) jVar).e(c10);
            }
        }, C11426j.class, G.class));
        return wVar;
    }

    public static w c() {
        return f89072b;
    }

    public <SerializationT extends K> boolean d(SerializationT serializationt) {
        return this.f89073a.get().e(serializationt);
    }

    public <SerializationT extends K> boolean e(SerializationT serializationt) {
        return this.f89073a.get().f(serializationt);
    }

    public <SerializationT extends K> Ke.j f(SerializationT serializationt, Ke.C c10) throws GeneralSecurityException {
        return this.f89073a.get().g(serializationt, c10);
    }

    public <SerializationT extends K> Ke.x h(SerializationT serializationt) throws GeneralSecurityException {
        return this.f89073a.get().h(serializationt);
    }

    public <KeyT extends Ke.j, SerializationT extends K> SerializationT n(KeyT keyt, Class<SerializationT> cls, Ke.C c10) throws GeneralSecurityException {
        return (SerializationT) this.f89073a.get().i(keyt, cls, c10);
    }

    public <ParametersT extends Ke.x, SerializationT extends K> SerializationT o(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        return (SerializationT) this.f89073a.get().j(parameterst, cls);
    }

    public Ke.j g(G g10, Ke.C c10) throws GeneralSecurityException {
        if (!d(g10)) {
            return new C11426j(g10, c10);
        }
        return f(g10, c10);
    }

    public Ke.x i(H h10) throws GeneralSecurityException {
        if (!e(h10)) {
            return new C11427k(h10);
        }
        return h(h10);
    }
}
