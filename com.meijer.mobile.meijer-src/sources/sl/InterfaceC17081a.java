package sl;

import com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.OrderSubstitutionRequest;
import com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.OrderSubstitutionResponse;
import com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.UpdateSubstitutionAcceptanceRequest;
import com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.UpdateSubstitutionAcceptanceResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lsl/a;", "", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionRequest;", "orderSubstitutionRequest", "Lretrofit2/Response;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionResponse;", "b", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/UpdateSubstitutionAcceptanceRequest;", "updateSubstitutionAcceptanceRequest", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/UpdateSubstitutionAcceptanceResponse;", "a", "(Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/UpdateSubstitutionAcceptanceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sl.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC17081a {
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("mfcorchestration/v1/SubstituteAcceptance")
    Object a(@Body UpdateSubstitutionAcceptanceRequest updateSubstitutionAcceptanceRequest, Continuation<? super Response<UpdateSubstitutionAcceptanceResponse>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("mfcorchestration/v1/getOrderDetails")
    Object b(@Body OrderSubstitutionRequest orderSubstitutionRequest, Continuation<? super Response<OrderSubstitutionResponse>> continuation);
}
