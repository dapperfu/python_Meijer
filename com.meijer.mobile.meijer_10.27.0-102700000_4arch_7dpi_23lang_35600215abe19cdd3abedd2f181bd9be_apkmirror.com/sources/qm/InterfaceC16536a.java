package qm;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.instoreshopping.service.store.models.SearchStoresResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lqm/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lretrofit2/Response;", "Lcom/meijer/mobile/instoreshopping/service/store/models/SearchStoresResponse;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "latitude", "longitude", "", "radiusInMiles", "maxResults", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;DDIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qm.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC16536a {
    @Headers({"Version:7"})
    @GET("storeinfo/api/mobile/near")
    Object a(@Header("Authorization") BearerToken bearerToken, @Query("latitude") double d10, @Query("longitude") double d11, @Query("miles") int i10, @Query("numToReturn") int i11, Continuation<? super Response<SearchStoresResponse>> continuation);

    @Headers({"Version:7"})
    @GET("storeinfo/api/mobile/stores")
    Object b(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<SearchStoresResponse>> continuation);
}
