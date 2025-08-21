package ap;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.product.service.constructor.api.model.GetConstructorProductsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J@\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lap/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "", "couponId", "sourceId", "", "storeId", "Lretrofit2/Response;", "Lcom/meijer/mobile/product/service/constructor/api/model/GetConstructorProductsResponse;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "constructor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ap.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC6284a {
    @Headers({"Content-Type: application/json"})
    @GET("products")
    Object a(@Header("Authorization") BearerToken bearerToken, @Query("couponId") long j10, @Query("sourceId") long j11, @Query("storeId") int i10, Continuation<? super Response<GetConstructorProductsResponse>> continuation);
}
