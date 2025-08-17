package Jm;

import Tr.C5283b;
import cl.C6412d;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import gi.InterfaceC14261a;
import pu.InterfaceC16421a;
import qv.AbstractC16618K;
import um.C17279b;
import yo.C18264a;

/* loaded from: classes9.dex */
public final class u implements InterfaceC16421a<CouponsFragment> {
    public static void a(CouponsFragment couponsFragment, InterfaceC14261a interfaceC14261a) {
        couponsFragment.analyticsEngine = interfaceC14261a;
    }

    public static void b(CouponsFragment couponsFragment, C17279b c17279b) {
        couponsFragment.appBackgroundManager = c17279b;
    }

    public static void c(CouponsFragment couponsFragment, C18264a c18264a) {
        couponsFragment.appPrefManager = c18264a;
    }

    public static void d(CouponsFragment couponsFragment, hl.m mVar) {
        couponsFragment.cartRepository = mVar;
    }

    public static void e(CouponsFragment couponsFragment, C5283b c5283b) {
        couponsFragment.couponChangeManager = c5283b;
    }

    public static void f(CouponsFragment couponsFragment, C6412d c6412d) {
        couponsFragment.couponsRepository = c6412d;
    }

    public static void g(CouponsFragment couponsFragment, Al.g gVar) {
        couponsFragment.featureEntryPoint = gVar;
    }

    public static void h(CouponsFragment couponsFragment, yl.k kVar) {
        couponsFragment.featureManager = kVar;
    }

    public static void i(CouponsFragment couponsFragment, AbstractC16618K abstractC16618K) {
        couponsFragment.ioDispatcher = abstractC16618K;
    }

    public static void j(CouponsFragment couponsFragment, Cl.e eVar) {
        couponsFragment.meijerIntent = eVar;
    }

    public static void k(CouponsFragment couponsFragment, Ck.b bVar) {
        couponsFragment.rxJavaBus = bVar;
    }

    public static void l(CouponsFragment couponsFragment, Eq.b bVar) {
        couponsFragment.shoppingListRepository = bVar;
    }

    public static void m(CouponsFragment couponsFragment, Tq.j jVar) {
        couponsFragment.storeProvider = jVar;
    }

    public static void n(CouponsFragment couponsFragment, yo.k kVar) {
        couponsFragment.userManager = kVar;
    }
}
