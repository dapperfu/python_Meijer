package com.google.firebase.installations;

import Gf.i;
import af.InterfaceC5598a;
import androidx.annotation.Keep;
import bf.C6241A;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.q;
import cf.j;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes7.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ Jf.e a(InterfaceC6246d interfaceC6246d) {
        return new c((com.google.firebase.f) interfaceC6246d.a(com.google.firebase.f.class), interfaceC6246d.f(i.class), (ExecutorService) interfaceC6246d.c(C6241A.a(InterfaceC5598a.class, ExecutorService.class)), j.b((Executor) interfaceC6246d.c(C6241A.a(af.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6245c<?>> getComponents() {
        return Arrays.asList(C6245c.e(Jf.e.class).h(LIBRARY_NAME).b(q.l(com.google.firebase.f.class)).b(q.j(i.class)).b(q.k(C6241A.a(InterfaceC5598a.class, ExecutorService.class))).b(q.k(C6241A.a(af.b.class, Executor.class))).f(new bf.g() { // from class: Jf.f
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return FirebaseInstallationsRegistrar.a(interfaceC6246d);
            }
        }).d(), Gf.h.a(), cg.h.b(LIBRARY_NAME, "19.0.0"));
    }
}
