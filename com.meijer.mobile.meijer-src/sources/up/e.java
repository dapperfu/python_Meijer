package up;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.gateway.common.api.Fields;
import com.meijer.mobile.rateandtip.service.models.RateShopperRequestJson;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JB\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lup/e;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/gateway/common/api/Fields;", "fields", "Lcom/meijer/mobile/rateandtip/service/models/RateShopperRequestJson;", "rateShopperRequest", "Lretrofit2/Response;", "Ljava/lang/Void;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Lcom/meijer/mobile/gateway/common/api/Fields;Lcom/meijer/mobile/rateandtip/service/models/RateShopperRequestJson;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface e {
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("orders/{orderId}/rate-only")
    Object a(@Header("Authorization") BearerToken bearerToken, @Path("orderId") String str, @Query("fields") Fields fields, @Body RateShopperRequestJson rateShopperRequestJson, Continuation<? super Response<Void>> continuation);

    static /* synthetic */ Object b(e eVar, BearerToken bearerToken, String str, Fields fields, RateShopperRequestJson rateShopperRequestJson, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rateShopper");
        }
        if ((i10 & 4) != 0) {
            fields = Fields.DEFAULT;
        }
        return eVar.a(bearerToken, str, fields, rateShopperRequestJson, continuation);
    }
}
