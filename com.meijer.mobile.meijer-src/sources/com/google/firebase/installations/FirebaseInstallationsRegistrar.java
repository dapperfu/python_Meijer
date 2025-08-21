package com.google.firebase.installations;

import If.i;
import androidx.annotation.Keep;
import cf.InterfaceC6504a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import df.C13672A;
import df.C13676c;
import df.InterfaceC13677d;
import df.q;
import ef.j;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes8.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ Lf.e a(InterfaceC13677d interfaceC13677d) {
        return new c((com.google.firebase.f) interfaceC13677d.a(com.google.firebase.f.class), interfaceC13677d.g(i.class), (ExecutorService) interfaceC13677d.c(C13672A.a(InterfaceC6504a.class, ExecutorService.class)), j.b((Executor) interfaceC13677d.c(C13672A.a(cf.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C13676c<?>> getComponents() {
        return Arrays.asList(C13676c.e(Lf.e.class).h(LIBRARY_NAME).b(q.l(com.google.firebase.f.class)).b(q.j(i.class)).b(q.k(C13672A.a(InterfaceC6504a.class, ExecutorService.class))).b(q.k(C13672A.a(cf.b.class, Executor.class))).f(new df.g() { // from class: Lf.f
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return FirebaseInstallationsRegistrar.a(interfaceC13677d);
            }
        }).d(), If.h.a(), eg.h.b(LIBRARY_NAME, "19.0.0"));
    }
}
