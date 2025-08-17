package Zm;

import com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment;
import gi.InterfaceC14261a;
import pu.InterfaceC16421a;
import yo.C18264a;

/* loaded from: classes9.dex */
public final class w0 implements InterfaceC16421a<ProductsFragment> {
    public static void a(ProductsFragment productsFragment, InterfaceC14261a interfaceC14261a) {
        productsFragment.analyticsEngine = interfaceC14261a;
    }

    public static void b(ProductsFragment productsFragment, C18264a c18264a) {
        productsFragment.appPrefManager = c18264a;
    }

    public static void c(ProductsFragment productsFragment, wr.f fVar) {
        productsFragment.cartInteractor = fVar;
    }

    public static void d(ProductsFragment productsFragment, Al.g gVar) {
        productsFragment.featureEntryPoint = gVar;
    }

    public static void e(ProductsFragment productsFragment, yl.k kVar) {
        productsFragment.featureManager = kVar;
    }

    public static void f(ProductsFragment productsFragment, Cl.e eVar) {
        productsFragment.meijerIntent = eVar;
    }

    public static void g(ProductsFragment productsFragment, Ro.a aVar) {
        productsFragment.productAnalytics = aVar;
    }

    public static void h(ProductsFragment productsFragment, pp.e eVar) {
        productsFragment.sponsorshipsDataStore = eVar;
    }

    public static void i(ProductsFragment productsFragment, yo.k kVar) {
        productsFragment.userManager = kVar;
    }
}
