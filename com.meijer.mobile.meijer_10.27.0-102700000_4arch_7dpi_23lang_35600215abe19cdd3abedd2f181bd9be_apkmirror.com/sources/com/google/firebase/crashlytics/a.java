package com.google.firebase.crashlytics;

import Jf.e;
import Td.InterfaceC5228f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.firebase.f;
import df.C13510d;
import fg.InterfaceC13891a;
import ig.C14720b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import lf.C15407d;
import lf.InterfaceC15404a;
import lf.g;
import lf.l;
import of.C16033a;
import of.C16038f;
import of.C16041i;
import of.C16045m;
import of.C16057z;
import of.F;
import of.K;
import pf.i;
import tf.C17094b;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final C16057z f88686a;

    public void d(String str) {
        this.f88686a.p(str);
    }

    public void e(Throwable th2) {
        if (th2 == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f88686a.q(th2, Collections.EMPTY_MAP);
        }
    }

    public void f(boolean z10) {
        this.f88686a.u(Boolean.valueOf(z10));
    }

    public void g(String str, int i10) {
        this.f88686a.v(str, Integer.toString(i10));
    }

    public void h(String str, String str2) {
        this.f88686a.v(str, str2);
    }

    public void i(String str) {
        this.f88686a.w(str);
    }

    private a(C16057z c16057z) {
        this.f88686a = c16057z;
    }

    public static a b() {
        a aVar = (a) f.l().j(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static a c(f fVar, e eVar, If.a<InterfaceC15404a> aVar, If.a<Ze.a> aVar2, If.a<InterfaceC13891a> aVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) throws Resources.NotFoundException {
        Context contextK = fVar.k();
        String packageName = contextK.getPackageName();
        g.f().g("Initializing Firebase Crashlytics " + C16057z.n() + " for " + packageName);
        i iVar = new i(executorService, executorService2);
        uf.g gVar = new uf.g(contextK);
        F f10 = new F(fVar);
        K k10 = new K(contextK, packageName, eVar, f10);
        C15407d c15407d = new C15407d(aVar);
        C13510d c13510d = new C13510d(aVar2);
        C16045m c16045m = new C16045m(f10, gVar);
        C14720b.e(c16045m);
        C16057z c16057z = new C16057z(fVar, k10, c15407d, f10, c13510d.e(), c13510d.d(), gVar, c16045m, new l(aVar3), iVar);
        String strC = fVar.n().c();
        String strM = C16041i.m(contextK);
        List<C16038f> listJ = C16041i.j(contextK);
        g.f().b("Mapping file ID is: " + strM);
        for (C16038f c16038f : listJ) {
            g.f().b(String.format("Build id for %s on %s: %s", c16038f.c(), c16038f.a(), c16038f.b()));
        }
        try {
            C16033a c16033aA = C16033a.a(contextK, k10, strC, strM, listJ, new lf.f(contextK));
            g.f().i("Installer package name is: " + c16033aA.f153477d);
            wf.g gVarL = wf.g.l(contextK, strC, k10, new C17094b(), c16033aA.f153479f, c16033aA.f153480g, gVar, f10);
            gVarL.o(iVar).f(executorService3, new InterfaceC5228f() { // from class: df.g
                @Override // Td.InterfaceC5228f
                public final void onFailure(Exception exc) {
                    lf.g.f().e("Error fetching settings.", exc);
                }
            });
            if (c16057z.t(c16033aA, gVarL)) {
                c16057z.l(gVarL);
            }
            return new a(c16057z);
        } catch (PackageManager.NameNotFoundException e10) {
            g.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }
}
