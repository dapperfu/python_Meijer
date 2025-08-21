package ep;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.product.model.hybris.api.models.HybrisDepartment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H§@¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lep/a;", "", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lretrofit2/Response;", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisDepartment;", "a", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ep.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13829a {
    @Headers({"Accept: application/json"})
    @GET("aem/v1/categories")
    Object a(@Query(PlaceTypes.STORE) int i10, Continuation<? super Response<HybrisDepartment>> continuation);
}
