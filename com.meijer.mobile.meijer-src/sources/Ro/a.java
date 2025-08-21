package Ro;

import Co.ProductFullDetails;
import Co.l;
import Oo.SearchResult;
import Qo.l;
import com.meijer.mobile.product.model.search.api.Pagination;
import io.constructor.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nk.f;
import nk.i;
import zu.v;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\r2\n\u0010\u0010\u001a\u00060\bj\u0002`\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010#\u001a\u00020\r2\n\u0010\u001d\u001a\u00060\bj\u0002`\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J'\u0010)\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020\b¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020\r2\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00103R\u0014\u00105\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00104¨\u00066"}, d2 = {"LRo/a;", "", "Lzu/v;", "constructorIo", "LCs/b;", "userProvider", "<init>", "(Lzu/v;LCs/b;)V", "", "Lcom/meijer/mobile/product/model/fulldetails/DepartmentCode;", "categoryCode", "LOo/b;", "searchResult", "", "e", "(Ljava/lang/String;LOo/b;)V", "collectionId", "c", "h", "(LOo/b;)V", "query", "originalQuery", "i", "(Ljava/lang/String;Ljava/lang/String;)V", "Lnk/f;", "product", "d", "(Ljava/lang/String;Lnk/f;)V", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "", "revenue", "", "Lnk/i;", "products", "g", "(Ljava/lang/String;DLjava/util/List;)V", "LQo/l;", "productQuery", "", "position", "j", "(LQo/l;Lnk/f;I)V", "term", "f", "(Ljava/lang/String;)V", "searchTerm", "originalTerm", "b", "a", "Lzu/v;", "LCs/b;", "()Lzu/v;", "userConstructor", "repository_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v constructorIo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    public a(v constructorIo, Cs.b userProvider) {
        Intrinsics.j(constructorIo, "constructorIo");
        Intrinsics.j(userProvider, "userProvider");
        this.constructorIo = constructorIo;
        this.userProvider = userProvider;
    }

    private final v a() {
        return b.a(this.constructorIo, this.userProvider.a());
    }

    public final void b(String searchTerm, String originalTerm) {
        Intrinsics.j(searchTerm, "searchTerm");
        Intrinsics.j(originalTerm, "originalTerm");
        v.L(a(), searchTerm, originalTerm, "Search Suggestions", null, null, 24, null);
    }

    public final void c(String collectionId, SearchResult searchResult) {
        List listM;
        Pagination pagination;
        List<ProductFullDetails> listF;
        Intrinsics.j(collectionId, "collectionId");
        v vVarA = a();
        if (searchResult == null || (listF = searchResult.f()) == null) {
            listM = null;
        } else {
            List<ProductFullDetails> list = listF;
            listM = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listM.add(((ProductFullDetails) it.next()).getCode());
            }
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        int totalResults = 0;
        String[] strArr = (String[]) listM.toArray(new String[0]);
        if (searchResult != null && (pagination = searchResult.getPagination()) != null) {
            totalResults = pagination.getTotalResults();
        }
        v.V(vVarA, "collection_id", collectionId, strArr, totalResults, null, null, null, 112, null);
    }

    public final void d(String query, f product) {
        Intrinsics.j(query, "query");
        Intrinsics.j(product, "product");
        v.a0(a(), l.a(product).getName(), product.getCode(), Double.valueOf(l.a(product).D().getValue()), query, BuildConfig.DEFAULT_ITEM_SECTION, null, null, null, null, 480, null);
    }

    public final void e(String categoryCode, SearchResult searchResult) {
        List listM;
        Pagination pagination;
        List<ProductFullDetails> listF;
        Intrinsics.j(categoryCode, "categoryCode");
        v vVarA = a();
        if (searchResult == null || (listF = searchResult.f()) == null) {
            listM = null;
        } else {
            List<ProductFullDetails> list = listF;
            listM = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listM.add(((ProductFullDetails) it.next()).getCode());
            }
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        int totalResults = 0;
        String[] strArr = (String[]) listM.toArray(new String[0]);
        if (searchResult != null && (pagination = searchResult.getPagination()) != null) {
            totalResults = pagination.getTotalResults();
        }
        v.V(vVarA, "group_id", categoryCode, strArr, totalResults, null, null, null, 112, null);
    }

    public final void f(String term) {
        Intrinsics.j(term, "term");
        a().e0(term);
    }

    public final void g(String orderId, double revenue, List<? extends i> products) {
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(products, "products");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = products.iterator();
        while (true) {
            if (!it.hasNext()) {
                v.j0(a(), (String[]) arrayList.toArray(new String[0]), Double.valueOf(revenue), orderId, BuildConfig.DEFAULT_ITEM_SECTION, null, 16, null);
                return;
            }
            i iVar = (i) it.next();
            int iCeil = (int) Math.ceil(iVar.getQuantity());
            ArrayList arrayList2 = new ArrayList(iCeil);
            for (int i10 = 0; i10 < iCeil; i10++) {
                arrayList2.add(iVar.getProduct().getCode());
            }
            CollectionsKt.C(arrayList, arrayList2);
        }
    }

    public final void h(SearchResult searchResult) {
        Intrinsics.j(searchResult, "searchResult");
        v vVarA = a();
        String freeTextSearch = searchResult.getFreeTextSearch();
        List<ProductFullDetails> listF = searchResult.f();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductFullDetails) it.next()).getCode());
        }
        vVarA.s0(freeTextSearch, searchResult.getPagination().getTotalResults(), (String[]) arrayList.toArray(new String[0]));
    }

    public final void i(String query, String originalQuery) {
        Intrinsics.j(query, "query");
        Intrinsics.j(originalQuery, "originalQuery");
        a().w0(query, originalQuery, null);
    }

    public final void j(Qo.l productQuery, f product, int position) {
        Intrinsics.j(product, "product");
        if (productQuery instanceof l.Department) {
            v.Q(a(), "group_id", ((l.Department) productQuery).getDepartment().getId(), product.getCode(), position, BuildConfig.DEFAULT_ITEM_SECTION, null, null, 96, null);
        } else if (productQuery instanceof l.BrowseCollection) {
            v.Q(a(), "collection_id", ((l.BrowseCollection) productQuery).getCollection().getCollectionId(), product.getCode(), position, BuildConfig.DEFAULT_ITEM_SECTION, null, null, 96, null);
        } else if (productQuery instanceof l.Search) {
            v.o0(a(), Co.l.a(product).getName(), product.getCode(), ((l.Search) productQuery).getTerm(), BuildConfig.DEFAULT_ITEM_SECTION, null, 16, null);
        }
    }
}
