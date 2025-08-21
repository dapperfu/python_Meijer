package uh;

import com.meijer.mobile.accounts.payments.api.models.network.AccountAddressDTO;
import com.meijer.mobile.accounts.payments.api.models.network.AccountCreditCardDTOV2;
import com.meijer.mobile.accounts.payments.api.models.network.SavePaymentInfoResponse;
import com.meijer.mobile.accounts.payments.api.models.network.UpdateConfirmationDTO;
import com.meijer.mobile.accounts.payments.api.models.network.UpdatePaymentInfoRequest;
import com.meijer.mobile.authentication.core.model.BearerToken;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\bJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Luh/h;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lretrofit2/Response;", "", "Lcom/meijer/mobile/accounts/payments/api/models/network/AccountCreditCardDTOV2;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/accounts/payments/api/models/network/AccountAddressDTO;", "a", "Lcom/meijer/mobile/accounts/payments/api/models/network/UpdatePaymentInfoRequest;", "updatePaymentInfoRequest", "Lcom/meijer/mobile/accounts/payments/api/models/network/SavePaymentInfoResponse;", "d", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/accounts/payments/api/models/network/UpdatePaymentInfoRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cardId", "Lcom/meijer/mobile/accounts/payments/api/models/network/UpdateConfirmationDTO;", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface h {
    @GET("accounts/addresses/account/accountID")
    Object a(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<List<AccountAddressDTO>>> continuation);

    @Headers({"Accept: application/vnd.meijer.account.card-v2.0+json"})
    @GET("accounts/cards/account/accountID")
    Object b(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<List<AccountCreditCardDTOV2>>> continuation);

    @DELETE("accounts/deleteCard/{cardId}")
    Object c(@Header("Authorization") BearerToken bearerToken, @Path("cardId") long j10, Continuation<? super Response<UpdateConfirmationDTO>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.account.card-v2.0+json", "Accept: application/vnd.meijer.account.updateConfirmation-v2.0+json"})
    @PUT("accounts/cards/updatepaymentinfo")
    Object d(@Header("Authorization") BearerToken bearerToken, @Body UpdatePaymentInfoRequest updatePaymentInfoRequest, Continuation<? super Response<SavePaymentInfoResponse>> continuation);
}
