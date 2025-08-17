package com.meijer.mobile.meijer.search;

import Go.SearchSuggestions;
import Rk.CouponOptions;
import Ul.HomeDepartment;
import ak.AbstractC5607a;
import com.meijer.mobile.meijer.activity.home.HomeDecorator;
import fi.GoogleAdData;
import hk.CartPreviewDecorator;
import java.util.List;
import kotlin.Metadata;
import vs.CartProductListDecorator;
import vs.ProductListDecorator;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0006R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0006R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0006R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0006R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0006R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0006R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0006R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0006R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0006R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0006R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0006R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0006R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0006R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0006R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0006R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0006R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0006R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0006R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0006R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0006R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0006R\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0006R\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0006R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\b0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0006R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0006R\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020U0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bV\u0010\u0006R\u001c\u0010Z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u0006R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020[0\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\u001eR\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020^0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u0006R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020a0\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006dÀ\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/search/b;", "LVi/o;", "Lcom/meijer/mobile/meijer/search/R1;", "Landroidx/compose/runtime/z1;", "LPp/b;", "y", "()Landroidx/compose/runtime/z1;", "searchType", "Lak/a;", "f", "substituteToolbarText", "p", "searchSaveButtonText", "", "d", "searchTerm", "", "b", "isLoggedIn", "Lcom/meijer/mobile/meijer/search/e;", "H", "searchMode", "Lcom/meijer/mobile/meijer/search/d;", "N", "loadingDecorator", "LGo/a;", "g", "searchSuggestions", "", "v", "()Ljava/util/List;", "recentSearches", "Lhk/a;", "m", "cartDecorator", "Lvs/f;", "E", "products", "Lfi/d;", "z", "googleAdSlot1", "r", "googleAdSlot2", "t", "googleAdSlot3", "s", "isSearchAppBarVisible", "k", "isBrowseDepartmentsButtonVisible", "B", "isViewFavoritesButtonVisible", "A", "isFulfillmentBarVisible", "F", "isCartVisible", "M", "isSaveButtonVisible", "n", "isSaveButtonEnabled", "D", "isBazaarvoicePLPEnabled", "c", "isSponsoredProductBuyAgainEnabled", "q", "isSponsoredProductFavOnSaleEnabled", "K", "isResultsExplanationLayoutVisible", "L", "isResultsExplanationBodyVisible", "G", "resultsExplanationTitleText", "l", "shopByDepartmentCarouselViewAllTitle", "C", "resultsExplanationBodyText", "o", "isSortAndFilterLayoutVisible", "I", "isZeroResultsTopCarouselVisible", "h", "searchResultsHeaderText", "u", "filterAndSortButtonText", "j", "isFilterAndSortButtonVisible", "LRk/a;", "i", "couponOptions", "Lvs/b;", "J", "itemToSubstitute", "LUl/g;", "e", "departmentsList", "LOj/a;", "w", "departmentsLoadingState", "Lcom/meijer/mobile/meijer/activity/home/HomeDecorator;", "x", "homeDecorator", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.search.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC12578b extends Vi.o<R1> {
    androidx.compose.runtime.z1<Boolean> A();

    androidx.compose.runtime.z1<Boolean> B();

    androidx.compose.runtime.z1<AbstractC5607a> C();

    androidx.compose.runtime.z1<Boolean> D();

    List<ProductListDecorator> E();

    androidx.compose.runtime.z1<Boolean> F();

    androidx.compose.runtime.z1<AbstractC5607a> G();

    androidx.compose.runtime.z1<InterfaceC12587e> H();

    androidx.compose.runtime.z1<Boolean> I();

    androidx.compose.runtime.z1<CartProductListDecorator> J();

    androidx.compose.runtime.z1<Boolean> K();

    androidx.compose.runtime.z1<Boolean> L();

    androidx.compose.runtime.z1<Boolean> M();

    androidx.compose.runtime.z1<LoadingDecorator> N();

    androidx.compose.runtime.z1<Boolean> b();

    androidx.compose.runtime.z1<Boolean> c();

    androidx.compose.runtime.z1<String> d();

    List<HomeDepartment> e();

    androidx.compose.runtime.z1<AbstractC5607a> f();

    androidx.compose.runtime.z1<SearchSuggestions> g();

    androidx.compose.runtime.z1<AbstractC5607a> h();

    androidx.compose.runtime.z1<CouponOptions> i();

    androidx.compose.runtime.z1<Boolean> j();

    androidx.compose.runtime.z1<Boolean> k();

    androidx.compose.runtime.z1<AbstractC5607a> l();

    androidx.compose.runtime.z1<CartPreviewDecorator> m();

    androidx.compose.runtime.z1<Boolean> n();

    androidx.compose.runtime.z1<Boolean> o();

    androidx.compose.runtime.z1<AbstractC5607a> p();

    androidx.compose.runtime.z1<Boolean> q();

    androidx.compose.runtime.z1<GoogleAdData> r();

    androidx.compose.runtime.z1<Boolean> s();

    androidx.compose.runtime.z1<GoogleAdData> t();

    androidx.compose.runtime.z1<AbstractC5607a> u();

    List<String> v();

    androidx.compose.runtime.z1<Oj.a> w();

    androidx.compose.runtime.z1<HomeDecorator> x();

    androidx.compose.runtime.z1<Pp.b> y();

    androidx.compose.runtime.z1<GoogleAdData> z();
}
