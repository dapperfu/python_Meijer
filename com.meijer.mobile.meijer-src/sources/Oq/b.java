package Oq;

import com.meijer.mobile.shoppinglist.teacherlists.service.response.supplies.SuppliesListResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"LOq/b;", "", "", "classroomId", "storeId", "Lretrofit2/Response;", "Lcom/meijer/mobile/shoppinglist/teacherlists/service/response/supplies/SuppliesListResponse;", "a", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {
    @Headers({"Accept: application/json"})
    @GET("items")
    Object a(@Query("listId") int i10, @Query("storeId") int i11, Continuation<? super Response<SuppliesListResponse>> continuation);
}
