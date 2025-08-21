package an;

import com.meijer.mobile.meijer.activity.find.fragment.ProductsFragment;
import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import yo.C18335a;

/* loaded from: classes10.dex */
public final class w0 implements InterfaceC15612a<ProductsFragment> {
    public static void a(ProductsFragment productsFragment, InterfaceC14523a interfaceC14523a) {
        productsFragment.analyticsEngine = interfaceC14523a;
    }

    public static void b(ProductsFragment productsFragment, C18335a c18335a) {
        productsFragment.appPrefManager = c18335a;
    }

    public static void c(ProductsFragment productsFragment, wr.f fVar) {
        productsFragment.cartInteractor = fVar;
    }

    public static void d(ProductsFragment productsFragment, Bl.g gVar) {
        productsFragment.featureEntryPoint = gVar;
    }

    public static void e(ProductsFragment productsFragment, zl.k kVar) {
        productsFragment.featureManager = kVar;
    }

    public static void f(ProductsFragment productsFragment, Dl.e eVar) {
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
