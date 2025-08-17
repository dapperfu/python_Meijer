package hl;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.digitalshopping.api.cart.model.AvailablePartnerStoreLocationOMSRequest;
import com.meijer.mobile.digitalshopping.api.cart.model.AvailablePartnerStoreLocationOmsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J>\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lhl/y;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "", "isEZCDEnabled", "isBunchaEnabled", "Lcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOMSRequest;", "availablePartnerStoreLocationOMSRequest", "Lretrofit2/Response;", "Lcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOmsResponse;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;ZZLcom/meijer/mobile/digitalshopping/api/cart/model/AvailablePartnerStoreLocationOMSRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface y {
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("oms/v2/address-qualification")
    Object a(@Header("Authorization") BearerToken bearerToken, @Header("x-ezcd-enabled") boolean z10, @Header("x-buncha-enabled") boolean z11, @Body AvailablePartnerStoreLocationOMSRequest availablePartnerStoreLocationOMSRequest, Continuation<? super Response<AvailablePartnerStoreLocationOmsResponse>> continuation);
}
