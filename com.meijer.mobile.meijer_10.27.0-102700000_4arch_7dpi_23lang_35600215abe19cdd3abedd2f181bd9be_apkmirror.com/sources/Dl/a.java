package Dl;

import com.meijer.mobile.fulfillment.flybuy.api.models.FlyBuyOrderResponse;
import com.meijer.mobile.fulfillment.flybuy.api.models.PickUpOrderUpdateRequest;
import com.meijer.mobile.fulfillment.flybuy.api.models.PickUpOrderUpdateResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"LDl/a;", "", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderUpdateRequest;", "pickUpOrderUpdateRequest", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "flyBuyOrderId", "Lretrofit2/Response;", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderUpdateResponse;", "b", "(Lcom/meijer/mobile/fulfillment/flybuy/api/models/PickUpOrderUpdateRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "orderId", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderResponse;", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface a {
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @GET("orders")
    Object a(@Query("partner_identifier") int i10, Continuation<? super Response<FlyBuyOrderResponse>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @PUT("orders/{flyBuyOrderId}")
    Object b(@Body PickUpOrderUpdateRequest pickUpOrderUpdateRequest, @Path("flyBuyOrderId") String str, Continuation<? super Response<PickUpOrderUpdateResponse>> continuation);
}
