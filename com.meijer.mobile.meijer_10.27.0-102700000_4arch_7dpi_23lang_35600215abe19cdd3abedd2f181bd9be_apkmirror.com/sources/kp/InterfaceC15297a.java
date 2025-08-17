package kp;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.product.service.recommendations.models.PersonalizedProductsResponseV2Json;
import io.constructor.data.model.common.ResultData;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J`\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u000f\u0010\u0010JH\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\bH§@¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\f\b\u0001\u0010\u0014\u001a\u00060\u0004j\u0002`\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J8\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\f\b\u0001\u0010\u0014\u001a\u00060\u0004j\u0002`\u00132\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\bH§@¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\b\b\u0001\u0010\u0014\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0019\u0010\u0016JZ\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u001b\u0010\u0010JL\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004j\u0002`\u00130\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\f\b\u0001\u0010\t\u001a\u00060\u0007j\u0002`\bH§@¢\u0006\u0004\b\u001c\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lkp/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "", "externalShopperId", "recommendationType", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "pageName", "sourceID", "Lretrofit2/Response;", "", "Lio/constructor/data/model/common/ResultData;", "g", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upc", "d", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/meijer/mobile/product/service/recommendations/models/PersonalizedProductsResponseV2Json;", "f", "c", "recommendations_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kp.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC15297a {
    @Headers({"Accept: application/json"})
    @GET("product-recommendations/v1/customer/{customerId}/recommendations/{recommendationType}/{unitId}/upc")
    Object a(@Header("Authorization") BearerToken bearerToken, @Path("customerId") String str, @Path("recommendationType") String str2, @Path("unitId") int i10, Continuation<? super Response<List<String>>> continuation);

    @Headers({"Accept: application/json"})
    @GET("product-recommendations/v1/product/{upc}/recommendations/suggested-alternatives-recommendation/{storeId}")
    Object b(@Header("Authorization") BearerToken bearerToken, @Path("storeId") int i10, @Path("upc") String str, Continuation<? super Response<List<ResultData>>> continuation);

    @Headers({"Accept: application/json"})
    @GET("product-recommendations/v2/customer/{customerId}/recommendations/{recommendationType}/{unitId}/upc")
    Object c(@Header("Authorization") BearerToken bearerToken, @Path("customerId") String str, @Path("recommendationType") String str2, @Path("unitId") int i10, Continuation<? super Response<List<String>>> continuation);

    @Headers({"Accept: application/json"})
    @GET("product-recommendations/v1/product/{upc}/recommendations/substitution-recommendation/{storeId}")
    Object d(@Header("Authorization") BearerToken bearerToken, @Path("storeId") int i10, @Path("upc") String str, Continuation<? super Response<List<ResultData>>> continuation);

    @Headers({"Accept: application/json"})
    @GET("product-recommendations/v1/product/{upc}/recommendations/frequently-bought-together/{storeId}")
    Object e(@Path("upc") String str, @Path("storeId") int i10, Continuation<? super Response<List<ResultData>>> continuation);

    @Headers({"Accept: application/json"})
    @GET("product-recommendations/v2/customer/{customerId}/recommendations/{recommendationType}/{unitId}")
    Object f(@Header("Authorization") BearerToken bearerToken, @Path("customerId") String str, @Path("recommendationType") String str2, @Path("unitId") int i10, @Query("pageName") String str3, @Query("retailer-visitor-id") String str4, Continuation<? super Response<PersonalizedProductsResponseV2Json>> continuation);

    @Headers({"Accept: application/json"})
    @GET("product-recommendations/v1/customer/{customerId}/recommendations/{recommendationType}/{unitId}")
    Object g(@Header("Authorization") BearerToken bearerToken, @Path("customerId") String str, @Path("recommendationType") String str2, @Path("unitId") int i10, @Query("pageName") String str3, @Query("retailer-visitor-id") String str4, Continuation<? super Response<List<ResultData>>> continuation);
}
