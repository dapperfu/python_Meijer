package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.AbstractC11298g;
import com.google.crypto.tink.internal.L;
import com.google.crypto.tink.internal.TinkBugException;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    private static final w f88232b = (w) TinkBugException.a(new TinkBugException.a() { // from class: com.google.crypto.tink.internal.u
        @Override // com.google.crypto.tink.internal.TinkBugException.a
        public final Object get() {
            return w.b();
        }
    });

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<L> f88233a = new AtomicReference<>(new L.b().e());

    public synchronized <SerializationT extends K> void j(AbstractC11297f<SerializationT> abstractC11297f) throws GeneralSecurityException {
        this.f88233a.set(new L.b(this.f88233a.get()).f(abstractC11297f).e());
    }

    public synchronized <KeyT extends Ie.j, SerializationT extends K> void k(AbstractC11298g<KeyT, SerializationT> abstractC11298g) throws GeneralSecurityException {
        this.f88233a.set(new L.b(this.f88233a.get()).g(abstractC11298g).e());
    }

    public synchronized <SerializationT extends K> void l(y<SerializationT> yVar) throws GeneralSecurityException {
        this.f88233a.set(new L.b(this.f88233a.get()).h(yVar).e());
    }

    public synchronized <ParametersT extends Ie.x, SerializationT extends K> void m(z<ParametersT, SerializationT> zVar) throws GeneralSecurityException {
        this.f88233a.set(new L.b(this.f88233a.get()).i(zVar).e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w b() throws GeneralSecurityException {
        w wVar = new w();
        wVar.k(AbstractC11298g.a(new AbstractC11298g.b() { // from class: com.google.crypto.tink.internal.v
            @Override // com.google.crypto.tink.internal.AbstractC11298g.b
            public final K a(Ie.j jVar, Ie.C c10) {
                return ((C11301j) jVar).e(c10);
            }
        }, C11301j.class, G.class));
        return wVar;
    }

    public static w c() {
        return f88232b;
    }

    public <SerializationT extends K> boolean d(SerializationT serializationt) {
        return this.f88233a.get().e(serializationt);
    }

    public <SerializationT extends K> boolean e(SerializationT serializationt) {
        return this.f88233a.get().f(serializationt);
    }

    public <SerializationT extends K> Ie.j f(SerializationT serializationt, Ie.C c10) throws GeneralSecurityException {
        return this.f88233a.get().g(serializationt, c10);
    }

    public <SerializationT extends K> Ie.x h(SerializationT serializationt) throws GeneralSecurityException {
        return this.f88233a.get().h(serializationt);
    }

    public <KeyT extends Ie.j, SerializationT extends K> SerializationT n(KeyT keyt, Class<SerializationT> cls, Ie.C c10) throws GeneralSecurityException {
        return (SerializationT) this.f88233a.get().i(keyt, cls, c10);
    }

    public <ParametersT extends Ie.x, SerializationT extends K> SerializationT o(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        return (SerializationT) this.f88233a.get().j(parameterst, cls);
    }

    public Ie.j g(G g10, Ie.C c10) throws GeneralSecurityException {
        if (!d(g10)) {
            return new C11301j(g10, c10);
        }
        return f(g10, c10);
    }

    public Ie.x i(H h10) throws GeneralSecurityException {
        if (!e(h10)) {
            return new C11302k(h10);
        }
        return h(h10);
    }
}
