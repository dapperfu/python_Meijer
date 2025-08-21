package Km;

import Tr.C5371b;
import com.meijer.mobile.meijer.activity.coupons.fragment.CouponsFragment;
import dl.C13702d;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import mv.AbstractC15779K;
import vm.C17693b;
import yo.C18335a;

/* loaded from: classes10.dex */
public final class u implements InterfaceC15612a<CouponsFragment> {
    public static void a(CouponsFragment couponsFragment, InterfaceC14523a interfaceC14523a) {
        couponsFragment.analyticsEngine = interfaceC14523a;
    }

    public static void b(CouponsFragment couponsFragment, C17693b c17693b) {
        couponsFragment.appBackgroundManager = c17693b;
    }

    public static void c(CouponsFragment couponsFragment, C18335a c18335a) {
        couponsFragment.appPrefManager = c18335a;
    }

    public static void d(CouponsFragment couponsFragment, il.m mVar) {
        couponsFragment.cartRepository = mVar;
    }

    public static void e(CouponsFragment couponsFragment, C5371b c5371b) {
        couponsFragment.couponChangeManager = c5371b;
    }

    public static void f(CouponsFragment couponsFragment, C13702d c13702d) {
        couponsFragment.couponsRepository = c13702d;
    }

    public static void g(CouponsFragment couponsFragment, Bl.g gVar) {
        couponsFragment.featureEntryPoint = gVar;
    }

    public static void h(CouponsFragment couponsFragment, zl.k kVar) {
        couponsFragment.featureManager = kVar;
    }

    public static void i(CouponsFragment couponsFragment, AbstractC15779K abstractC15779K) {
        couponsFragment.ioDispatcher = abstractC15779K;
    }

    public static void j(CouponsFragment couponsFragment, Dl.e eVar) {
        couponsFragment.meijerIntent = eVar;
    }

    public static void k(CouponsFragment couponsFragment, Dk.b bVar) {
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
