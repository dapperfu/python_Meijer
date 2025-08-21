package ep;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.gateway.common.api.Fields;
import com.meijer.mobile.product.model.hybris.api.models.HybrisProduct;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jd\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lep/b;", "", "", "productCode", "", "storeId", "cartId", "userId", "Lcom/meijer/mobile/gateway/common/api/Fields;", "fields", "pageName", "sourceID", "Lretrofit2/Response;", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "b", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Lcom/meijer/mobile/gateway/common/api/Fields;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ep.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13830b {
    @Headers({"Accept: application/json"})
    @GET("products/{productCode}")
    Object b(@Path("productCode") String str, @Query(PlaceTypes.STORE) int i10, @Query("cartId") Integer num, @Query("userId") String str2, @Query("fields") Fields fields, @Query("pageName") String str3, @Query("retailer-visitor-id") String str4, Continuation<? super Response<HybrisProduct>> continuation);

    static /* synthetic */ Object a(InterfaceC13830b interfaceC13830b, String str, int i10, Integer num, String str2, Fields fields, String str3, String str4, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getProductDetailsFull");
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if ((i11 & 16) != 0) {
            fields = Fields.FULL;
        }
        if ((i11 & 32) != 0) {
            str3 = null;
        }
        if ((i11 & 64) != 0) {
            str4 = null;
        }
        return interfaceC13830b.b(str, i10, num, str2, fields, str3, str4, continuation);
    }
}
