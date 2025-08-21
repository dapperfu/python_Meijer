package zh;

import com.meijer.mobile.accounts.service.models.network.AccountAddressResponseJson;
import com.meijer.mobile.accounts.service.models.network.AccountJson;
import com.meijer.mobile.accounts.service.models.network.AddOrUpdateAccountAddressRequest;
import com.meijer.mobile.accounts.service.models.network.CreateAccountV2Request;
import com.meijer.mobile.accounts.service.models.network.CreateAccountV2ResponseJson;
import com.meijer.mobile.accounts.service.models.network.UpdateAccountRequestV2;
import com.meijer.mobile.authentication.core.model.BearerToken;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\b\u0001\u0010\n\u001a\u00060\bj\u0002`\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\b\u0001\u0010\n\u001a\u00060\bj\u0002`\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00042\f\b\u0001\u0010\n\u001a\u00060\bj\u0002`\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0016\u0010\u000fJB\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\b\u0001\u0010\n\u001a\u00060\bj\u0002`\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0003\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJL\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\b\u0001\u0010\n\u001a\u00060\bj\u0002`\t2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0003\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001f\u0010 J8\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\b\u0001\u0010\n\u001a\u00060\bj\u0002`\t2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\"\u0010#J.\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\b\u0001\u0010\n\u001a\u00060\bj\u0002`\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b$\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006%À\u0006\u0001"}, d2 = {"Lzh/b;", "", "Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2Request;", "createNewAccountRequest", "Lretrofit2/Response;", "Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2ResponseJson;", "c", "(Lcom/meijer/mobile/accounts/service/models/network/CreateAccountV2Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lcom/meijer/mobile/accounts/service/models/network/AccountJson;", "g", "(Ljava/lang/String;Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/accounts/service/models/network/UpdateAccountRequestV2;", "updateAccountRequest", "f", "(Ljava/lang/String;Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/UpdateAccountRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/accounts/service/models/network/AccountAddressResponseJson;", "a", "Lcom/meijer/mobile/accounts/service/models/network/AddOrUpdateAccountAddressRequest;", "addOrUpdateAccountAddressRequest", "", "skipAddressVerification", "b", "(Ljava/lang/String;Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/AddOrUpdateAccountAddressRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "accountAddressId", "d", "(Ljava/lang/String;ILcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/AddOrUpdateAccountAddressRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "h", "(Ljava/lang/String;ILcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface b {
    @Headers({"Content-Type: application/json"})
    @GET("accounts/accountmanagement/v1/accounts/{accountId}/addresses")
    Object a(@Path("accountId") String str, @Header("Authorization") BearerToken bearerToken, Continuation<? super Response<List<AccountAddressResponseJson>>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.digital.accounts.addaccountaddressrequest+json;version=1"})
    @POST("accounts/accountmanagement/v1/accounts/{accountId}/addresses")
    Object b(@Path("accountId") String str, @Header("Authorization") BearerToken bearerToken, @Body AddOrUpdateAccountAddressRequest addOrUpdateAccountAddressRequest, @Query("skipVerification") boolean z10, Continuation<? super Response<AccountAddressResponseJson>> continuation);

    @Headers({"Content-Type: application/json"})
    @POST("accounts/accountmanagement/v1/accounts")
    Object c(@Body CreateAccountV2Request createAccountV2Request, Continuation<? super Response<CreateAccountV2ResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.digital.accounts.updateaccountaddressrequest+json;version=1"})
    @PATCH("accounts/accountmanagement/v1/accounts/{accountId}/addresses/{accountAddressId}")
    Object d(@Path("accountId") String str, @Path("accountAddressId") int i10, @Header("Authorization") BearerToken bearerToken, @Body AddOrUpdateAccountAddressRequest addOrUpdateAccountAddressRequest, @Query("skipVerification") boolean z10, Continuation<? super Response<AccountAddressResponseJson>> continuation);

    @Headers({"Content-Type: application/json"})
    @POST("accounts/accountmanagement/v1/accounts/{accountId}/actions/sendEmailVerification")
    Object e(@Path("accountId") String str, @Header("Authorization") BearerToken bearerToken, Continuation<? super Response<Unit>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.digital.accounts.account+json;version=1"})
    @PATCH("accounts/accountmanagement/v1/accounts/{accountId}")
    Object f(@Path("accountId") String str, @Header("Authorization") BearerToken bearerToken, @Body UpdateAccountRequestV2 updateAccountRequestV2, Continuation<? super Response<AccountJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.digital.accounts.account+json;version=1"})
    @GET("accounts/accountmanagement/v1/accounts/{accountId}")
    Object g(@Path("accountId") String str, @Header("Authorization") BearerToken bearerToken, Continuation<? super Response<AccountJson>> continuation);

    @DELETE("accounts/accountmanagement/v1/accounts/{accountId}/addresses/{accountAddressId}")
    @Headers({"Content-Type: application/json"})
    Object h(@Path("accountId") String str, @Path("accountAddressId") int i10, @Header("Authorization") BearerToken bearerToken, Continuation<? super Response<Unit>> continuation);
}
