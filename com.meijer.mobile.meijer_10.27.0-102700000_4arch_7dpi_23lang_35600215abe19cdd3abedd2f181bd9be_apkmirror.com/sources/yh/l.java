package yh;

import com.meijer.mobile.accounts.service.models.network.PreferenceRequestJson;
import com.meijer.mobile.accounts.service.models.network.PreferenceResponseJson;
import com.meijer.mobile.authentication.core.model.BearerToken;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nJ0\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH§@¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lyh/l;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "", "externalShopperId", "preferenceKey", "Lretrofit2/Response;", "Lcom/meijer/mobile/accounts/service/models/network/PreferenceResponseJson;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/accounts/service/models/network/PreferenceRequestJson;", "preferenceList", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface l {
    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.digital.accounts.accountpreferencefull+json;version=1"})
    @PATCH("accounts/preferenceManagement/v1/accounts/{externalShopperId}/preferences")
    Object a(@Header("Authorization") BearerToken bearerToken, @Path("externalShopperId") String str, @Body List<PreferenceRequestJson> list, Continuation<? super Response<List<PreferenceResponseJson>>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.digital.accounts.accountpreferencefull+json;version=1"})
    @GET("accounts/preferenceManagement/v1/accounts/{externalShopperId}/preferences/{preferenceKey}")
    Object b(@Header("Authorization") BearerToken bearerToken, @Path("externalShopperId") String str, @Path("preferenceKey") String str2, Continuation<? super Response<PreferenceResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.digital.accounts.accountpreferencefull+json;version=1"})
    @GET("accounts/preferenceManagement/v1/accounts/{externalShopperId}/preferences")
    Object c(@Header("Authorization") BearerToken bearerToken, @Path("externalShopperId") String str, Continuation<? super Response<List<PreferenceResponseJson>>> continuation);
}
