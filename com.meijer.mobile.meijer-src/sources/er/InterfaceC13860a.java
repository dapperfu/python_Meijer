package er;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.subscription.service.api.models.SubscriptionDetailsResponseJson;
import com.meijer.mobile.subscription.service.api.models.SubscriptionProductRequestJson;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Ler/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lcom/meijer/mobile/subscription/service/api/models/SubscriptionProductRequestJson;", "subscriptionProductRequest", "Lretrofit2/Response;", "Lcom/meijer/mobile/subscription/service/api/models/SubscriptionDetailsResponseJson;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/subscription/service/api/models/SubscriptionProductRequestJson;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "subscriptionId", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: er.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13860a {
    @DELETE("orders/subscriptions/v1/{subscriptionId}")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Object a(@Header("Authorization") BearerToken bearerToken, @Path("subscriptionId") String str, Continuation<? super Response<SubscriptionDetailsResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("orders/subscriptions/v1/")
    Object b(@Header("Authorization") BearerToken bearerToken, @Body SubscriptionProductRequestJson subscriptionProductRequestJson, Continuation<? super Response<SubscriptionDetailsResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("orders/subscriptions/v1/")
    Object c(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<List<SubscriptionDetailsResponseJson>>> continuation);
}
