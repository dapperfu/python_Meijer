package ml;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.cart.model.hybris.CartModifications;
import com.meijer.mobile.cart.model.hybris.orderdetails.OrderDetailResponse;
import com.meijer.mobile.digitalshopping.api.orders.model.orderdetails.UpdatePhoneNumberRequest;
import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.OrderHistoryResponse;
import com.meijer.mobile.gateway.common.api.Fields;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJF\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\b\u0001\u0010\u0011\u001a\u00060\u0004j\u0002`\u00102\b\b\u0003\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\b\u0001\u0010\u0011\u001a\u00060\u0004j\u0002`\u0010H§@¢\u0006\u0004\b\u0016\u0010\u0017J<\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\b\u0001\u0010\u0011\u001a\u00060\u0004j\u0002`\u0010H§@¢\u0006\u0004\b\u0019\u0010\u0017J<\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\b\u0001\u0010\u0011\u001a\u00060\u0004j\u0002`\u0010H§@¢\u0006\u0004\b\u001a\u0010\u0017J8\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\f\b\u0001\u0010\u000f\u001a\u00060\rj\u0002`\u000eH§@¢\u0006\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Lml/d;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "", "currentPage", "pageSize", "Lcom/meijer/mobile/gateway/common/api/Fields;", "fields", "Lretrofit2/Response;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/OrderHistoryResponse;", "f", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;IILcom/meijer/mobile/gateway/common/api/Fields;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/OrderDetailResponse;", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;ILcom/meijer/mobile/gateway/common/api/Fields;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "g", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/cart/model/hybris/CartModifications;", "d", "b", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderdetails/UpdatePhoneNumberRequest;", "updatePhoneNumberRequest", "h", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/digitalshopping/api/orders/model/orderdetails/UpdatePhoneNumberRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface d {
    @DELETE("orders/{orderId}/edit/cancel")
    @Headers({"Accept: application/json"})
    Object b(@Header("Authorization") BearerToken bearerToken, @Path("orderId") String str, @Query(PlaceTypes.STORE) int i10, Continuation<? super Response<Unit>> continuation);

    @Headers({"Accept: application/json"})
    @GET("orders/details/{orderId}")
    Object c(@Header("Authorization") BearerToken bearerToken, @Path("orderId") String str, @Query(PlaceTypes.STORE) int i10, @Query("fields") Fields fields, Continuation<? super Response<OrderDetailResponse>> continuation);

    @Headers({"Accept: application/json"})
    @POST("orders/{orderId}/edit")
    Object d(@Header("Authorization") BearerToken bearerToken, @Path("orderId") String str, @Query(PlaceTypes.STORE) int i10, Continuation<? super Response<CartModifications>> continuation);

    @Headers({"Accept: application/json"})
    @GET("orders")
    Object f(@Header("Authorization") BearerToken bearerToken, @Query("currentPage") int i10, @Query("pageSize") int i11, @Query("fields") Fields fields, Continuation<? super Response<OrderHistoryResponse>> continuation);

    @DELETE("orders/{orderId}/cancel")
    @Headers({"Accept: application/json"})
    Object g(@Header("Authorization") BearerToken bearerToken, @Path("orderId") String str, @Query(PlaceTypes.STORE) int i10, Continuation<? super Response<Unit>> continuation);

    @Headers({"Accept: application/json"})
    @PUT("orders/{orderId}/editPhone")
    Object h(@Header("Authorization") BearerToken bearerToken, @Body UpdatePhoneNumberRequest updatePhoneNumberRequest, @Path("orderId") String str, Continuation<? super Response<Unit>> continuation);

    static /* synthetic */ Object a(d dVar, BearerToken bearerToken, String str, int i10, Fields fields, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderDetailsWithUnfulfilledEntries");
        }
        if ((i11 & 8) != 0) {
            fields = Fields.FULL;
        }
        return dVar.c(bearerToken, str, i10, fields, continuation);
    }

    static /* synthetic */ Object e(d dVar, BearerToken bearerToken, int i10, int i11, Fields fields, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrders");
        }
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = 20;
        }
        int i14 = i11;
        if ((i12 & 8) != 0) {
            fields = Fields.FULL;
        }
        return dVar.f(bearerToken, i13, i14, fields, continuation);
    }
}
