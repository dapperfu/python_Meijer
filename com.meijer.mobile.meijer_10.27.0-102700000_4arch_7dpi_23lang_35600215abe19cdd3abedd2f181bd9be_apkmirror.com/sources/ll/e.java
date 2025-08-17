package ll;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.digitalshopping.api.orders.model.ordercancelable.OrderIsEditCancelableRequest;
import com.meijer.mobile.digitalshopping.api.orders.model.ordercancelable.OrderIsEditCancelableResponse;
import com.meijer.mobile.digitalshopping.api.orders.model.tipandrate.TipNotificationResponse;
import com.meijer.mobile.digitalshopping.api.orders.model.tipandrate.UpdateTipNotificationRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JZ\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJZ\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u0010\u0010\u000fJ4\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\u0012\u001a\u00060\u0006j\u0002`\u0011H§@¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Lll/e;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "", "mfcStore", "", "deliveryPartner", "fulfillmentType", "curbsidePartner", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableRequest;", "isOrderCancelableRequest", "Lretrofit2/Response;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableResponse;", "d", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/orders/model/ordercancelable/OrderIsEditCancelableRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "", "Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/TipNotificationResponse;", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/UpdateTipNotificationRequest;", "updateTipNotificationRequest", "", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/digitalshopping/api/orders/model/tipandrate/UpdateTipNotificationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface e {
    @Headers({"Accept: application/json"})
    @PUT("digitalorders/UpdateNotifications")
    Object a(@Header("Authorization") BearerToken bearerToken, @Body UpdateTipNotificationRequest updateTipNotificationRequest, Continuation<? super Response<Unit>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("hybris/v3/order/isEditable")
    Object b(@Header("Authorization") BearerToken bearerToken, @Header("x-mfc-store") Integer num, @Header("deliveryPartner") String str, @Header("fulfillmentType") String str2, @Header("curbsidePartner") String str3, @Body OrderIsEditCancelableRequest orderIsEditCancelableRequest, Continuation<? super Response<OrderIsEditCancelableResponse>> continuation);

    @Headers({"Accept: application/json"})
    @GET("digitalorders/TipsNotifications/{externalShopperId}")
    Object c(@Header("Authorization") BearerToken bearerToken, @Path("externalShopperId") String str, Continuation<? super Response<List<TipNotificationResponse>>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("hybris/v3/order/isCancelable")
    Object d(@Header("Authorization") BearerToken bearerToken, @Header("x-mfc-store") Integer num, @Header("deliveryPartner") String str, @Header("fulfillmentType") String str2, @Header("curbsidePartner") String str3, @Body OrderIsEditCancelableRequest orderIsEditCancelableRequest, Continuation<? super Response<OrderIsEditCancelableResponse>> continuation);
}
