package ll;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.cart.model.hybris.orderdetails.OrderDetailResponse;
import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.OrderHistoryResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JL\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\f\b\u0001\u0010\b\u001a\u00060\u0004j\u0002`\u00072\b\b\u0003\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\u0010\u001a\u00060\tj\u0002`\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lll/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "", "currentPage", "pageSize", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "fulfillmentType", "Lretrofit2/Response;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryResponse;", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;IIILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderDetailResponse;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ll.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC15422a {
    @Headers({"Accept: application/json"})
    @GET("orders/{orderId}")
    Object b(@Header("Authorization") BearerToken bearerToken, @Path("orderId") String str, Continuation<? super Response<OrderDetailResponse>> continuation);

    @Headers({"Accept: application/json"})
    @GET("orders")
    Object c(@Header("Authorization") BearerToken bearerToken, @Query("currentPage") int i10, @Query("pageSize") int i11, @Query(PlaceTypes.STORE) int i12, @Query("fulfillmentType") String str, Continuation<? super Response<OrderHistoryResponse>> continuation);

    static /* synthetic */ Object a(InterfaceC15422a interfaceC15422a, BearerToken bearerToken, int i10, int i11, int i12, String str, Continuation continuation, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getArchivedOrders");
        }
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        int i14 = i10;
        if ((i13 & 4) != 0) {
            i11 = 20;
        }
        int i15 = i11;
        if ((i13 & 16) != 0) {
            str = "all";
        }
        return interfaceC15422a.c(bearerToken, i14, i15, i12, str, continuation);
    }
}
