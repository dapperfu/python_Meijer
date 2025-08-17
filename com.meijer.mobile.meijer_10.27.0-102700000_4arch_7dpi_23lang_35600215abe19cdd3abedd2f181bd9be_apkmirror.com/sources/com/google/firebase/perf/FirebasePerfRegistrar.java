package com.google.firebase.perf;

import Jf.e;
import Rf.a;
import Rf.d;
import androidx.annotation.Keep;
import bf.C6241A;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.g;
import bf.q;
import cg.h;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import com.google.firebase.n;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import pc.InterfaceC16286j;

@Keep
/* loaded from: classes7.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    public static /* synthetic */ a b(C6241A c6241a, InterfaceC6246d interfaceC6246d) {
        return new a((f) interfaceC6246d.a(f.class), (n) interfaceC6246d.f(n.class).get(), (Executor) interfaceC6246d.c(c6241a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d providesFirebasePerformance(InterfaceC6246d interfaceC6246d) {
        interfaceC6246d.a(a.class);
        return Sf.a.a().b(new Tf.a((f) interfaceC6246d.a(f.class), (e) interfaceC6246d.a(e.class), interfaceC6246d.f(c.class), interfaceC6246d.f(InterfaceC16286j.class))).a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C6245c<?>> getComponents() {
        final C6241A c6241aA = C6241A.a(af.d.class, Executor.class);
        return Arrays.asList(C6245c.e(d.class).h(LIBRARY_NAME).b(q.l(f.class)).b(q.n(c.class)).b(q.l(e.class)).b(q.n(InterfaceC16286j.class)).b(q.l(a.class)).f(new g() { // from class: Rf.b
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return FirebasePerfRegistrar.providesFirebasePerformance(interfaceC6246d);
            }
        }).d(), C6245c.e(a.class).h(EARLY_LIBRARY_NAME).b(q.l(f.class)).b(q.j(n.class)).b(q.k(c6241aA)).e().f(new g() { // from class: Rf.c
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return FirebasePerfRegistrar.b(c6241aA, interfaceC6246d);
            }
        }).d(), h.b(LIBRARY_NAME, "22.0.0"));
    }
}
