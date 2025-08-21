package Ml;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.greenville.model.response.picklist.PicklistResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"LMl/b;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "", "storeId", "Lretrofit2/Response;", "Lcom/meijer/mobile/greenville/model/response/picklist/PicklistResponse;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface b {
    @GET("FrontEndPicklist/{storeId}")
    Object a(@Header("Authorization") BearerToken bearerToken, @Path("storeId") int i10, Continuation<? super Response<PicklistResponse>> continuation);
}
