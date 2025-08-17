package com.google.firebase.crashlytics;

import Jf.e;
import af.InterfaceC5598a;
import af.b;
import af.c;
import android.content.res.Resources;
import bf.C6241A;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.q;
import cg.h;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import fg.InterfaceC13891a;
import ig.C14720b;
import ig.InterfaceC14721c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import lf.InterfaceC15404a;
import lf.g;
import pf.i;

/* loaded from: classes7.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    private final C6241A<ExecutorService> f88683a = C6241A.a(InterfaceC5598a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    private final C6241A<ExecutorService> f88684b = C6241A.a(b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    private final C6241A<ExecutorService> f88685c = C6241A.a(c.class, ExecutorService.class);

    /* JADX INFO: Access modifiers changed from: private */
    public a b(InterfaceC6246d interfaceC6246d) throws Resources.NotFoundException {
        i.f(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVarC = a.c((f) interfaceC6246d.a(f.class), (e) interfaceC6246d.a(e.class), interfaceC6246d.i(InterfaceC15404a.class), interfaceC6246d.i(Ze.a.class), interfaceC6246d.i(InterfaceC13891a.class), (ExecutorService) interfaceC6246d.c(this.f88683a), (ExecutorService) interfaceC6246d.c(this.f88684b), (ExecutorService) interfaceC6246d.c(this.f88685c));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            g.f().b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return aVarC;
    }

    static {
        C14720b.a(InterfaceC14721c.a.f137751a);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6245c<?>> getComponents() {
        return Arrays.asList(C6245c.e(a.class).h("fire-cls").b(q.l(f.class)).b(q.l(e.class)).b(q.k(this.f88683a)).b(q.k(this.f88684b)).b(q.k(this.f88685c)).b(q.a(InterfaceC15404a.class)).b(q.a(Ze.a.class)).b(q.a(InterfaceC13891a.class)).f(new bf.g() { // from class: df.f
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return this.f127376a.b(interfaceC6246d);
            }
        }).e().d(), h.b("fire-cls", BuildConfig.VERSION_NAME));
    }
}
