package Wn;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.mperks.creditcard.api.models.MCCOptInOutResponseJson;
import com.meijer.mobile.mperks.creditcard.api.models.OptInMccRequest;
import com.meijer.mobile.mperks.creditcard.api.models.RewardClubTermsRequest;
import com.meijer.mobile.mperks.creditcard.api.models.RewardClubTermsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"LWn/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lcom/meijer/mobile/mperks/creditcard/api/models/OptInMccRequest;", "request", "Lretrofit2/Response;", "Lcom/meijer/mobile/mperks/creditcard/api/models/MCCOptInOutResponseJson;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/mperks/creditcard/api/models/OptInMccRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsRequest;", "Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsResponse;", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "creditcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface a {
    @Headers({"Accept:application/vnd.meijer.digitalmperks.mcardOptIn-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.mcardOptIn-v1.0+json"})
    @POST("api/reward/mcard/OptIn")
    Object a(@Header("Authorization") BearerToken bearerToken, @Body OptInMccRequest optInMccRequest, Continuation<? super Response<MCCOptInOutResponseJson>> continuation);

    @Headers({"Accept:application/vnd.meijer.digitalmperks.mcardOptOut-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.mcardOptOut-v1.0+json"})
    @POST("api/reward/mcard/OptOut")
    Object b(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<MCCOptInOutResponseJson>> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.getclubterms-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.getclubterms-v1.0+json"})
    @POST("api/reward/club/terms")
    Object c(@Header("Authorization") BearerToken bearerToken, @Body RewardClubTermsRequest rewardClubTermsRequest, Continuation<? super Response<RewardClubTermsResponse>> continuation);
}
