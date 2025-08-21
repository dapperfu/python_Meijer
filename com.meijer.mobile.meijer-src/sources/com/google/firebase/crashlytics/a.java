package com.google.firebase.crashlytics;

import Lf.e;
import Vd.InterfaceC5512f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import bf.InterfaceC6375a;
import com.google.firebase.f;
import ff.C13983d;
import hg.InterfaceC14521a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kg.C15124b;
import nf.C15941d;
import nf.InterfaceC15938a;
import nf.g;
import nf.l;
import qf.C16641a;
import qf.C16646f;
import qf.C16649i;
import qf.C16653m;
import qf.C16665z;
import qf.F;
import qf.K;
import rf.i;
import vf.C17669b;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final C16665z f89526a;

    public void d(String str) {
        this.f89526a.p(str);
    }

    public void e(Throwable th2) {
        if (th2 == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f89526a.q(th2, Collections.EMPTY_MAP);
        }
    }

    public void f(boolean z10) {
        this.f89526a.u(Boolean.valueOf(z10));
    }

    public void g(String str, int i10) {
        this.f89526a.v(str, Integer.toString(i10));
    }

    public void h(String str, String str2) {
        this.f89526a.v(str, str2);
    }

    public void i(String str) {
        this.f89526a.w(str);
    }

    private a(C16665z c16665z) {
        this.f89526a = c16665z;
    }

    public static a b() {
        a aVar = (a) f.l().j(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static a c(f fVar, e eVar, Kf.a<InterfaceC15938a> aVar, Kf.a<InterfaceC6375a> aVar2, Kf.a<InterfaceC14521a> aVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) throws Resources.NotFoundException {
        Context contextK = fVar.k();
        String packageName = contextK.getPackageName();
        g.f().g("Initializing Firebase Crashlytics " + C16665z.n() + " for " + packageName);
        i iVar = new i(executorService, executorService2);
        wf.g gVar = new wf.g(contextK);
        F f10 = new F(fVar);
        K k10 = new K(contextK, packageName, eVar, f10);
        C15941d c15941d = new C15941d(aVar);
        C13983d c13983d = new C13983d(aVar2);
        C16653m c16653m = new C16653m(f10, gVar);
        C15124b.e(c16653m);
        C16665z c16665z = new C16665z(fVar, k10, c15941d, f10, c13983d.e(), c13983d.d(), gVar, c16653m, new l(aVar3), iVar);
        String strC = fVar.n().c();
        String strM = C16649i.m(contextK);
        List<C16646f> listJ = C16649i.j(contextK);
        g.f().b("Mapping file ID is: " + strM);
        for (C16646f c16646f : listJ) {
            g.f().b(String.format("Build id for %s on %s: %s", c16646f.c(), c16646f.a(), c16646f.b()));
        }
        try {
            C16641a c16641aA = C16641a.a(contextK, k10, strC, strM, listJ, new nf.f(contextK));
            g.f().i("Installer package name is: " + c16641aA.f158329d);
            yf.g gVarL = yf.g.l(contextK, strC, k10, new C17669b(), c16641aA.f158331f, c16641aA.f158332g, gVar, f10);
            gVarL.o(iVar).f(executorService3, new InterfaceC5512f() { // from class: ff.g
                @Override // Vd.InterfaceC5512f
                public final void onFailure(Exception exc) {
                    nf.g.f().e("Error fetching settings.", exc);
                }
            });
            if (c16665z.t(c16641aA, gVarL)) {
                c16665z.l(gVarL);
            }
            return new a(c16665z);
        } catch (PackageManager.NameNotFoundException e10) {
            g.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }
}
