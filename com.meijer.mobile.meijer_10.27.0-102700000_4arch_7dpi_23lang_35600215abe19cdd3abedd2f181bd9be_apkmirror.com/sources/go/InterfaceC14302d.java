package go;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.mperks.networking.domain.models.MperksPointsExpiryResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lgo/d;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "", "days", "Lretrofit2/Response;", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksPointsExpiryResponse;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: go.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC14302d {
    @GET("mperks40/customer/v1/points/expiring")
    Object a(@Header("Authorization") BearerToken bearerToken, @Query("days") int i10, Continuation<? super Response<MperksPointsExpiryResponse>> continuation);
}
