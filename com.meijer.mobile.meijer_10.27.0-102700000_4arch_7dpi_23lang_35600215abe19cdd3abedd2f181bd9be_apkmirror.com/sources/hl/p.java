package hl;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.cart.model.hybris.AvailablePartnerStoreLocationsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JH\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lhl/p;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "", "street", "city", "state", "zipCode", "Lretrofit2/Response;", "Lcom/meijer/mobile/cart/model/hybris/AvailablePartnerStoreLocationsResponse;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface p {
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @GET("partner/proximity")
    Object a(@Header("Authorization") BearerToken bearerToken, @Query("street") String str, @Query("city") String str2, @Query("state") String str3, @Query("zipcode") String str4, Continuation<? super Response<AvailablePartnerStoreLocationsResponse>> continuation);
}
