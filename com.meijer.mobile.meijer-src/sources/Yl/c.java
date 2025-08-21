package Yl;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.home.service.models.homecard.LegacyHomeCardsRequest;
import com.meijer.mobile.home.service.models.homecard.LegacyHomeCardsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"LYl/c;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lcom/meijer/mobile/home/service/models/homecard/LegacyHomeCardsRequest;", "homeRequest", "Lretrofit2/Response;", "Lcom/meijer/mobile/home/service/models/homecard/LegacyHomeCardsResponse;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/home/service/models/homecard/LegacyHomeCardsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface c {
    @Headers({"Accept: application/vnd.meijer.digitalmperks.mobilehomescreen-v3.0+json", "Content-Type: application/vnd.meijer.digitalmperks.mobilehomescreen-v3.0+json"})
    @POST("home/MobileCards")
    Object a(@Header("Authorization") BearerToken bearerToken, @Body LegacyHomeCardsRequest legacyHomeCardsRequest, Continuation<? super Response<LegacyHomeCardsResponse>> continuation);
}
