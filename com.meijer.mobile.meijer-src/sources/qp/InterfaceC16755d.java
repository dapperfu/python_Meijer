package qp;

import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.product.model.constructor.SponsoredProductsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0006\bf\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bJl\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010Jv\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u009c\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0019\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lqp/d;", "", "", "adobeMCID", "digitalId", "pageId", "eventType", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "searchQuery", "environment", "filters", "Lretrofit2/Response;", "Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponse;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "category", "keyWords", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productCode", "", "price", "availability", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "sponsored_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qp.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC16755d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f158921a;

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @GET("sponsored-products/v1/products")
    Object b(@Query("retailer-visitor-id") String str, @Query("customer-id") String str2, @Query("page-id") String str3, @Query("event-type") String str4, @Query("regionId") int i10, @Query("category") String str5, @Query("keywords") String str6, @Query("environment") String str7, @Query("filters") String str8, Continuation<? super Response<SponsoredProductsResponse>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @GET("sponsored-products/v1/products")
    Object e(@Query("retailer-visitor-id") String str, @Query("customer-id") String str2, @Query("page-id") String str3, @Query("event-type") String str4, @Query("regionId") int i10, @Query("keywords") String str5, @Query("environment") String str6, @Query("filters") String str7, Continuation<? super Response<SponsoredProductsResponse>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @GET("sponsored-products/v1/products")
    Object f(@Query("retailer-visitor-id") String str, @Query("customer-id") String str2, @Query("page-id") String str3, @Query("event-type") String str4, @Query("regionId") int i10, @Query("keywords") String str5, @Query("environment") String str6, @Query("category") String str7, @Query("item") String str8, @Query("price") Double d10, @Query("availability") Integer num, @Query("filters") String str9, Continuation<? super Response<SponsoredProductsResponse>> continuation);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqp/d$a;", "", "<init>", "()V", "sponsored_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qp.d$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f158921a = new Companion();

        private Companion() {
        }
    }

    static /* synthetic */ Object a(InterfaceC16755d interfaceC16755d, String str, String str2, String str3, String str4, int i10, String str5, String str6, String str7, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCriteoSponsoredProducts");
        }
        if ((i11 & 4) != 0) {
            str3 = "viewSearchResult_API_app";
        }
        return interfaceC16755d.e(str, str2, str3, (i11 & 8) != 0 ? "viewSearchResult" : str4, i10, str5, (i11 & 64) != 0 ? "aa" : str6, (i11 & 128) != 0 ? null : str7, continuation);
    }

    static /* synthetic */ Object c(InterfaceC16755d interfaceC16755d, String str, String str2, String str3, String str4, int i10, String str5, String str6, String str7, String str8, Continuation continuation, int i11, Object obj) {
        if (obj == null) {
            return interfaceC16755d.b(str, str2, (i11 & 4) != 0 ? "viewCategory_API_app" : str3, (i11 & 8) != 0 ? "viewCategory" : str4, i10, str5, str6, (i11 & 128) != 0 ? "aa" : str7, (i11 & 256) != 0 ? null : str8, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCriteoSponsoredProductsDepartment");
    }

    static /* synthetic */ Object d(InterfaceC16755d interfaceC16755d, String str, String str2, String str3, String str4, int i10, String str5, String str6, String str7, String str8, Double d10, Integer num, String str9, Continuation continuation, int i11, Object obj) {
        String str10;
        InterfaceC16755d interfaceC16755d2;
        String str11;
        String str12;
        int i12;
        String str13;
        Continuation continuation2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCriteoSponsoredProducts");
        }
        String str14 = (i11 & 4) != 0 ? "viewItem_API_App" : str3;
        String str15 = (i11 & 8) != 0 ? "viewItem" : str4;
        String str16 = (i11 & 64) != 0 ? "aa" : str6;
        String str17 = (i11 & 128) != 0 ? null : str7;
        String str18 = (i11 & 256) != 0 ? null : str8;
        Double d11 = (i11 & 512) != 0 ? null : d10;
        Integer num2 = (i11 & 1024) != 0 ? null : num;
        if ((i11 & RecyclerView.m.FLAG_MOVED) != 0) {
            str10 = null;
            str11 = str;
            str12 = str2;
            i12 = i10;
            str13 = str5;
            continuation2 = continuation;
            interfaceC16755d2 = interfaceC16755d;
        } else {
            str10 = str9;
            interfaceC16755d2 = interfaceC16755d;
            str11 = str;
            str12 = str2;
            i12 = i10;
            str13 = str5;
            continuation2 = continuation;
        }
        return interfaceC16755d2.f(str11, str12, str14, str15, i12, str13, str16, str17, str18, d11, num2, str10, continuation2);
    }
}
