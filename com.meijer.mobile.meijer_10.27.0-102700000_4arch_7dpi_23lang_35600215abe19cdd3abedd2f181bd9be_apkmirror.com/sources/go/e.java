package go;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.mperks.networking.api.models.GetRewardsRequest;
import com.meijer.mobile.mperks.networking.domain.models.MperksRewardEarnedResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lgo/e;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "Lcom/meijer/mobile/mperks/networking/api/models/GetRewardsRequest;", "request", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksRewardEarnedResponse;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/mperks/networking/api/models/GetRewardsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface e {
    @Headers({"Accept: application/vnd.meijer.digitalmperks.earnedrewards-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.getrewards-v1.0+json"})
    @POST("api/reward/earned")
    Object a(@Header("Authorization") BearerToken bearerToken, @Body GetRewardsRequest getRewardsRequest, Continuation<? super MperksRewardEarnedResponse> continuation);
}
