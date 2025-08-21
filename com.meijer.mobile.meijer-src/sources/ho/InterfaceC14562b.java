package ho;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.mperks.networking.api.models.GetRewardsRequest;
import com.meijer.mobile.mperks.networking.api.models.MperksCreditCardInfoResponse;
import com.meijer.mobile.mperks.networking.api.models.MperksRewardEarnedResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lho/b;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "Lretrofit2/Response;", "Lcom/meijer/mobile/mperks/networking/api/models/MperksCreditCardInfoResponse;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/api/models/GetRewardsRequest;", "request", "Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardEarnedResponse;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/mperks/networking/api/models/GetRewardsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ho.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC14562b {
    @Headers({"Accept: application/vnd.meijer.digitalmperks.earnedrewards-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.getrewards-v1.0+json"})
    @POST("api/reward/earned")
    Object a(@Header("Authorization") BearerToken bearerToken, @Body GetRewardsRequest getRewardsRequest, Continuation<? super Response<MperksRewardEarnedResponse>> continuation);

    @Headers({"Content:application/vnd.meijer.digitalmperks.mcardinfo-v1.0+json", "Accept: application/vnd.meijer.digitalmperks.mcardinfo-v1.0+json"})
    @GET("api/reward/mCard/info")
    Object b(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<MperksCreditCardInfoResponse>> continuation);
}
