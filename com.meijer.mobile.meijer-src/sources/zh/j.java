package zh;

import com.meijer.mobile.accounts.service.models.network.AndroidPayLoyaltyCardInfoResponseJson;
import com.meijer.mobile.accounts.service.models.network.RegisterNotificationDeviceRequest;
import com.meijer.mobile.accounts.service.models.network.RegisterNotificationDeviceResponseJson;
import com.meijer.mobile.authentication.core.model.BearerToken;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lzh/j;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lretrofit2/Response;", "Lcom/meijer/mobile/accounts/service/models/network/AndroidPayLoyaltyCardInfoResponseJson;", "d", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Lcom/meijer/mobile/accounts/service/models/network/RegisterNotificationDeviceRequest;", "registerDeviceRequest", "Lcom/meijer/mobile/accounts/service/models/network/RegisterNotificationDeviceResponseJson;", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/RegisterNotificationDeviceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "registrationId", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/RegisterNotificationDeviceRequest;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface j {
    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.account.SendEmailRequest-v1.0+json"})
    @POST("mperks/sendvalidationemail")
    Object a(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<Boolean>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.account.registerNotificationDevice-v2.0+json", "Accept: application/vnd.meijer.account.updateConfirmation-v1.0+json"})
    @PUT("credentials/registerNotificationDevice/{id}")
    Object b(@Header("Authorization") BearerToken bearerToken, @Body RegisterNotificationDeviceRequest registerNotificationDeviceRequest, @Path(PreferencesHelper.PREF_ID) long j10, Continuation<? super Response<RegisterNotificationDeviceResponseJson>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.account.registerNotificationDevice-v2.0+json", "Accept: application/vnd.meijer.account.updateConfirmation-v1.0+json"})
    @POST("credentials/registerNotificationDevice")
    Object c(@Header("Authorization") BearerToken bearerToken, @Body RegisterNotificationDeviceRequest registerNotificationDeviceRequest, Continuation<? super Response<RegisterNotificationDeviceResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.account.androidPayLoyaltyResponse-v1.0+json"})
    @GET("androidpay/loyaltyinfo")
    Object d(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<AndroidPayLoyaltyCardInfoResponseJson>> continuation);
}
