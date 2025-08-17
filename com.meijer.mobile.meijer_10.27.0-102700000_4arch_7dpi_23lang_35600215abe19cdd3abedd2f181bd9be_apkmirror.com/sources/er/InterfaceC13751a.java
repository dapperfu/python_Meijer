package er;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.subscription.service.api.models.SubscriptionDetailsResponseJson;
import com.meijer.mobile.subscription.service.api.models.SubscriptionProductRequestJson;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Ler/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lcom/meijer/mobile/subscription/service/api/models/SubscriptionProductRequestJson;", "subscriptionProductRequest", "Lretrofit2/Response;", "Lcom/meijer/mobile/subscription/service/api/models/SubscriptionDetailsResponseJson;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/subscription/service/api/models/SubscriptionProductRequestJson;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: er.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13751a {
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("orders/subscriptions/v1/")
    Object a(@Header("Authorization") BearerToken bearerToken, @Body SubscriptionProductRequestJson subscriptionProductRequestJson, Continuation<? super Response<SubscriptionDetailsResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("orders/subscriptions/v1/")
    Object b(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<List<SubscriptionDetailsResponseJson>>> continuation);
}
