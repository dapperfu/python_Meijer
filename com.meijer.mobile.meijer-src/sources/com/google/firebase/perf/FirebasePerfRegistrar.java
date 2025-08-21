package com.google.firebase.perf;

import Lf.e;
import Tf.a;
import Tf.d;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import com.google.firebase.n;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.c;
import df.C13672A;
import df.C13676c;
import df.InterfaceC13677d;
import df.g;
import df.q;
import eg.h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import rc.InterfaceC16890j;

@Keep
/* loaded from: classes8.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    public static /* synthetic */ a b(C13672A c13672a, InterfaceC13677d interfaceC13677d) {
        return new a((f) interfaceC13677d.a(f.class), (n) interfaceC13677d.g(n.class).get(), (Executor) interfaceC13677d.c(c13672a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d providesFirebasePerformance(InterfaceC13677d interfaceC13677d) {
        interfaceC13677d.a(a.class);
        return Uf.a.a().b(new Vf.a((f) interfaceC13677d.a(f.class), (e) interfaceC13677d.a(e.class), interfaceC13677d.g(c.class), interfaceC13677d.g(InterfaceC16890j.class))).a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C13676c<?>> getComponents() {
        final C13672A c13672aA = C13672A.a(cf.d.class, Executor.class);
        return Arrays.asList(C13676c.e(d.class).h(LIBRARY_NAME).b(q.l(f.class)).b(q.n(c.class)).b(q.l(e.class)).b(q.n(InterfaceC16890j.class)).b(q.l(a.class)).f(new g() { // from class: Tf.b
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return FirebasePerfRegistrar.providesFirebasePerformance(interfaceC13677d);
            }
        }).d(), C13676c.e(a.class).h(EARLY_LIBRARY_NAME).b(q.l(f.class)).b(q.j(n.class)).b(q.k(c13672aA)).e().f(new g() { // from class: Tf.c
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return FirebasePerfRegistrar.b(c13672aA, interfaceC13677d);
            }
        }).d(), h.b(LIBRARY_NAME, "22.0.0"));
    }
}
