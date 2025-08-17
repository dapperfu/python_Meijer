package yh;

import com.meijer.mobile.accounts.service.models.network.AccountAddressJson;
import com.meijer.mobile.accounts.service.models.network.CreateAccountRequest;
import com.meijer.mobile.accounts.service.models.network.CreateOrUpdateVehicleInformationRequest;
import com.meijer.mobile.accounts.service.models.network.CustomerAccountPropertiesResponseJson;
import com.meijer.mobile.accounts.service.models.network.CustomerPreferenceJson;
import com.meijer.mobile.accounts.service.models.network.CustomerPreferenceUpdateRequest;
import com.meijer.mobile.accounts.service.models.network.CustomerPreferenceUpdateResponseJson;
import com.meijer.mobile.accounts.service.models.network.DiscretePreferenceChoiceJson;
import com.meijer.mobile.accounts.service.models.network.EmailVerificationSpiffsResponse;
import com.meijer.mobile.accounts.service.models.network.MeijerAccountJson;
import com.meijer.mobile.accounts.service.models.network.ResetPasswordRequestJson;
import com.meijer.mobile.accounts.service.models.network.UpdateAccountRequest;
import com.meijer.mobile.accounts.service.models.network.UpdateConfirmationResponseJson;
import com.meijer.mobile.accounts.service.models.network.UpdateMperksPhoneRequest;
import com.meijer.mobile.accounts.service.models.network.UpdateMperksPinRequest;
import com.meijer.mobile.accounts.service.models.network.UpdatePasswordRequest;
import com.meijer.mobile.accounts.service.models.network.UpdateStoreRequest;
import com.meijer.mobile.accounts.service.models.network.UpdateStoreResponseJson;
import com.meijer.mobile.accounts.service.models.network.ValidateEmailAvailabilityJson;
import com.meijer.mobile.accounts.service.models.network.ValidatePhoneAvailabilityJson;
import com.meijer.mobile.accounts.service.models.network.VehicleInformationJson;
import com.meijer.mobile.authentication.core.model.BearerToken;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0007J&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0007J&\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0007J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J*\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020!H§@¢\u0006\u0004\b#\u0010$J \u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\b\b\u0001\u0010&\u001a\u00020%H§@¢\u0006\u0004\b(\u0010)J \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\b\b\u0001\u0010*\u001a\u00020%H§@¢\u0006\u0004\b,\u0010)J*\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020-H§@¢\u0006\u0004\b0\u00101J*\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u000202H§@¢\u0006\u0004\b5\u00106J*\u00109\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00108\u001a\u000207H§@¢\u0006\u0004\b9\u0010:J*\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00108\u001a\u000207H§@¢\u0006\u0004\b;\u0010:J*\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010=\u001a\u00020<H§@¢\u0006\u0004\b>\u0010?J \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010A\u001a\u00020@H§@¢\u0006\u0004\bB\u0010CJ&\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u000f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bE\u0010\u0007J*\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010F\u001a\u00020DH§@¢\u0006\u0004\bG\u0010HJ*\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010F\u001a\u00020DH§@¢\u0006\u0004\bI\u0010HJ*\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010K\u001a\u00020JH§@¢\u0006\u0004\bL\u0010MJ \u0010O\u001a\b\u0012\u0004\u0012\u00020N0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\bO\u0010\u0007J \u0010R\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\b\b\u0001\u0010Q\u001a\u00020PH§@¢\u0006\u0004\bR\u0010Sø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006TÀ\u0006\u0001"}, d2 = {"Lyh/c;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lretrofit2/Response;", "Lcom/meijer/mobile/accounts/service/models/network/MeijerAccountJson;", "h", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Headers;", "globalHeaders", "Lcom/meijer/mobile/accounts/service/models/network/CustomerAccountPropertiesResponseJson;", "m", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lokhttp3/Headers;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/accounts/service/models/network/VehicleInformationJson;", "p", "", "Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceJson;", "l", "Lcom/meijer/mobile/accounts/service/models/network/DiscretePreferenceChoiceJson;", "u", "Lcom/meijer/mobile/accounts/service/models/network/UpdateMperksPinRequest;", "updateMperksPinRequest", "Lcom/meijer/mobile/accounts/service/models/network/UpdateConfirmationResponseJson;", "q", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/UpdateMperksPinRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/accounts/service/models/network/UpdateAccountRequest;", "updateAccountRequest", "d", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/UpdateAccountRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/accounts/service/models/network/UpdatePasswordRequest;", "updatePasswordRequest", "n", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/UpdatePasswordRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/accounts/service/models/network/UpdateMperksPhoneRequest;", "updateRequest", "t", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/UpdateMperksPhoneRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "emailAddress", "Lcom/meijer/mobile/accounts/service/models/network/ValidateEmailAvailabilityJson;", "f", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phoneNumber", "Lcom/meijer/mobile/accounts/service/models/network/ValidatePhoneAvailabilityJson;", "e", "Lcom/meijer/mobile/accounts/service/models/network/UpdateStoreRequest;", "request", "Lcom/meijer/mobile/accounts/service/models/network/UpdateStoreResponseJson;", "i", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/UpdateStoreRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceUpdateRequest;", "preferenceUpdateRequest", "Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceUpdateResponseJson;", "g", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/CustomerPreferenceUpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/accounts/service/models/network/CreateOrUpdateVehicleInformationRequest;", "createOrUpdateVehicleInformationRequest", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/CreateOrUpdateVehicleInformationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "", "vehicleId", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/accounts/service/models/network/ResetPasswordRequestJson;", "resetPasswordRequest", "j", "(Lcom/meijer/mobile/accounts/service/models/network/ResetPasswordRequestJson;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/accounts/service/models/network/AccountAddressJson;", "a", "accountAddress", "o", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/service/models/network/AccountAddressJson;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "", "accountAddressId", "v", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/accounts/service/models/network/EmailVerificationSpiffsResponse;", "s", "Lcom/meijer/mobile/accounts/service/models/network/CreateAccountRequest;", "createNewAccountRequest", "w", "(Lcom/meijer/mobile/accounts/service/models/network/CreateAccountRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface c {
    @Headers({"Content-Type: application/vnd.meijer.account.address-v1.0+json", "Accept: application/vnd.meijer.account.address-v1.0+json"})
    @GET("accounts/addresses/account/accountID")
    Object a(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<List<AccountAddressJson>>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.account.account-v1.0+json"})
    @POST("accounts/createVehicleInformation")
    Object b(@Header("Authorization") BearerToken bearerToken, @Body CreateOrUpdateVehicleInformationRequest createOrUpdateVehicleInformationRequest, Continuation<? super Response<UpdateConfirmationResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.account.account-v1.0+json"})
    @POST("accounts/deleteVehicleInformation")
    Object c(@Header("Authorization") BearerToken bearerToken, @Query("vehicleId") int i10, Continuation<? super Response<UpdateConfirmationResponseJson>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.account.accountUpdate-v1.0+json", "Accept: application/vnd.meijer.account.updateConfirmation-v1.0+json"})
    @POST("accounts/updateAccount")
    Object d(@Header("Authorization") BearerToken bearerToken, @Body UpdateAccountRequest updateAccountRequest, Continuation<? super Response<UpdateConfirmationResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.account.phoneNumberConflictStatus-v1.0+json"})
    @GET("accounts/getConflictTypeByPhone/{phone}")
    Object e(@Path("phone") String str, Continuation<? super Response<ValidatePhoneAvailabilityJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.account.account-v1.0+json"})
    @GET("accounts/conflictTypeByEmail/email")
    Object f(@Query("email") String str, Continuation<? super Response<ValidateEmailAvailabilityJson>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.account.CustomerPreferenceUpdate-v1.0+json", "Accept: application/vnd.meijer.account.CustomerPreferenceUpdateResponse-v1.0+json"})
    @POST("accounts/preferences/updateCustomerPreference")
    Object g(@Header("Authorization") BearerToken bearerToken, @Body CustomerPreferenceUpdateRequest customerPreferenceUpdateRequest, Continuation<? super Response<CustomerPreferenceUpdateResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.account.account-v1.0+json"})
    @GET("accounts/accounts/getAccount")
    Object h(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<MeijerAccountJson>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.account.storeUpdate-v1.0+json", "Accept: application/vnd.meijer.account.updateConfirmation-v1.0+json"})
    @POST("accounts/accounts/updateStore")
    Object i(@Header("Authorization") BearerToken bearerToken, @Body UpdateStoreRequest updateStoreRequest, Continuation<? super Response<UpdateStoreResponseJson>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.account.passwordUpdate-v1.0+json", "Accept: application/vnd.meijer.account.updateConfirmation-v1.0+json"})
    @POST("accounts/resetPassword")
    Object j(@Body ResetPasswordRequestJson resetPasswordRequestJson, Continuation<? super Response<UpdateConfirmationResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.account.account-v1.0+json"})
    @POST("accounts/updateVehicleInformation")
    Object k(@Header("Authorization") BearerToken bearerToken, @Body CreateOrUpdateVehicleInformationRequest createOrUpdateVehicleInformationRequest, Continuation<? super Response<UpdateConfirmationResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("accounts/preferences/getCustomerPreferences")
    Object l(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<List<CustomerPreferenceJson>>> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.accountproperties-v1.0+json"})
    @GET("accounts/mperksbarcode")
    Object m(@Header("Authorization") BearerToken bearerToken, @HeaderMap okhttp3.Headers headers, Continuation<? super Response<CustomerAccountPropertiesResponseJson>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.account.passwordUpdate-v1.0+json", "Accept: application/vnd.meijer.account.updateConfirmation-v1.0+json"})
    @POST("accounts/updatePassword")
    Object n(@Header("Authorization") BearerToken bearerToken, @Body UpdatePasswordRequest updatePasswordRequest, Continuation<? super Response<UpdateConfirmationResponseJson>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.account.address-v1.0+json", "Accept: application/vnd.meijer.account.updateConfirmation-v1.0+json"})
    @POST("accounts/addresses")
    Object o(@Header("Authorization") BearerToken bearerToken, @Body AccountAddressJson accountAddressJson, Continuation<? super Response<UpdateConfirmationResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.account.account-v1.0+json"})
    @GET("accounts/getVehicleInformation")
    Object p(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<VehicleInformationJson>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.account.updateMPerksPin-v1.0+json", "Accept: application/vnd.meijer.account.updateMPerksPinResponse-v1.0+json"})
    @POST("accounts/updateMperksPin")
    Object q(@Header("Authorization") BearerToken bearerToken, @Body UpdateMperksPinRequest updateMperksPinRequest, Continuation<? super Response<UpdateConfirmationResponseJson>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.account.address-v1.0+json", "Accept: application/vnd.meijer.account.address-v1.0+json"})
    @PUT("accounts/updateAddress")
    Object r(@Header("Authorization") BearerToken bearerToken, @Body AccountAddressJson accountAddressJson, Continuation<? super Response<UpdateConfirmationResponseJson>> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.emailverificationspiffs-v1.0+json"})
    @GET("mPerks/api/customer/EmailVerificationSpiffs")
    Object s(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<EmailVerificationSpiffsResponse>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/vnd.meijer.account.updateConfirmation-v1.0+json"})
    @POST("accounts/updateMperksPhone")
    Object t(@Header("Authorization") BearerToken bearerToken, @Body UpdateMperksPhoneRequest updateMperksPhoneRequest, Continuation<? super Response<UpdateConfirmationResponseJson>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @GET("accounts/preferences/getPreferenceDiscreteChoices")
    Object u(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<List<DiscretePreferenceChoiceJson>>> continuation);

    @DELETE("accounts/deleteAddress/{accountAddressId}")
    @Headers({"Content-Type: application/vnd.meijer.account.address-v1.0+json", "Accept: application/vnd.meijer.account.address-v1.0+json"})
    Object v(@Header("Authorization") BearerToken bearerToken, @Path("accountAddressId") long j10, Continuation<? super Response<UpdateConfirmationResponseJson>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.account.account-v1.0+json", "Accept: application/vnd.meijer.account.updateConfirmation-v1.0+json"})
    @POST("accounts/createAccountWithMperks")
    Object w(@Body CreateAccountRequest createAccountRequest, Continuation<? super Response<UpdateConfirmationResponseJson>> continuation);
}
