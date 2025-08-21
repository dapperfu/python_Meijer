package com.google.firebase.crashlytics;

import Lf.e;
import android.content.res.Resources;
import bf.InterfaceC6375a;
import cf.InterfaceC6504a;
import cf.b;
import cf.c;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import df.C13672A;
import df.C13676c;
import df.InterfaceC13677d;
import df.q;
import eg.h;
import hg.InterfaceC14521a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kg.C15124b;
import kg.InterfaceC15125c;
import nf.InterfaceC15938a;
import nf.g;
import rf.i;

/* loaded from: classes8.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    private final C13672A<ExecutorService> f89523a = C13672A.a(InterfaceC6504a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    private final C13672A<ExecutorService> f89524b = C13672A.a(b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    private final C13672A<ExecutorService> f89525c = C13672A.a(c.class, ExecutorService.class);

    /* JADX INFO: Access modifiers changed from: private */
    public a b(InterfaceC13677d interfaceC13677d) throws Resources.NotFoundException {
        i.f(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVarC = a.c((f) interfaceC13677d.a(f.class), (e) interfaceC13677d.a(e.class), interfaceC13677d.i(InterfaceC15938a.class), interfaceC13677d.i(InterfaceC6375a.class), interfaceC13677d.i(InterfaceC14521a.class), (ExecutorService) interfaceC13677d.c(this.f89523a), (ExecutorService) interfaceC13677d.c(this.f89524b), (ExecutorService) interfaceC13677d.c(this.f89525c));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            g.f().b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return aVarC;
    }

    static {
        C15124b.a(InterfaceC15125c.a.f141840a);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C13676c<?>> getComponents() {
        return Arrays.asList(C13676c.e(a.class).h("fire-cls").b(q.l(f.class)).b(q.l(e.class)).b(q.k(this.f89523a)).b(q.k(this.f89524b)).b(q.k(this.f89525c)).b(q.a(InterfaceC15938a.class)).b(q.a(InterfaceC6375a.class)).b(q.a(InterfaceC14521a.class)).f(new df.g() { // from class: ff.f
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return this.f131705a.b(interfaceC13677d);
            }
        }).e().d(), h.b("fire-cls", BuildConfig.VERSION_NAME));
    }
}
