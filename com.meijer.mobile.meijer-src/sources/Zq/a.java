package Zq;

import com.meijer.mobile.storeinfo.api.model.StoreInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"LZq/a;", "", "", "storeNumber", "Lretrofit2/Response;", "Lcom/meijer/mobile/storeinfo/api/model/StoreInfo;", "e", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "latitude", "longitude", "searchRadius", "maxStores", "dataVariant", "b", "(DDIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "zipCode", "d", "(Ljava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {
    @Headers({"Accept: application/json", "Content-Type: application/json", "Version: 9"})
    @GET("storeInfo/v2/stores/proximity")
    Object b(@Query("latitude") double d10, @Query("longitude") double d11, @Query("miles") int i10, @Query("numToReturn") int i11, @Query("dataVariant") int i12, Continuation<? super Response<StoreInfo>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json", "Version: 9"})
    @GET("storeInfo/v2/stores/proximity")
    Object d(@Query("zipCode") String str, @Query("miles") int i10, @Query("numToReturn") int i11, @Query("dataVariant") int i12, Continuation<? super Response<StoreInfo>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @GET("storeInfo/stores/{storeNumber}")
    Object e(@Path("storeNumber") int i10, Continuation<? super Response<StoreInfo>> continuation);

    static /* synthetic */ Object a(a aVar, String str, int i10, int i11, int i12, Continuation continuation, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNearbyStoresWithZipCode");
        }
        if ((i13 & 8) != 0) {
            i12 = 2;
        }
        return aVar.d(str, i10, i11, i12, continuation);
    }

    static /* synthetic */ Object c(a aVar, double d10, double d11, int i10, int i11, int i12, Continuation continuation, int i13, Object obj) {
        if (obj == null) {
            return aVar.b(d10, d11, i10, i11, (i13 & 16) != 0 ? 2 : i12, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNearbyStores");
    }
}
