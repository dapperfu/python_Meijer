package zh;

import com.meijer.mobile.accounts.service.models.network.CustomerPropertiesResponseJson;
import com.meijer.mobile.authentication.core.model.BearerToken;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lzh/k;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lretrofit2/Response;", "Lcom/meijer/mobile/accounts/service/models/network/CustomerPropertiesResponseJson;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface k {
    @Headers({"Accept: application/vnd.meijer.digitalmperks.properties-v1.0+json"})
    @GET("customer/properties")
    Object a(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<CustomerPropertiesResponseJson>> continuation);
}
