package Tk;

import com.meijer.mobile.coupon.service.complexpromos.api.models.ProductComplexPromoJson;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J8\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0001\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"LTk/a;", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lretrofit2/Response;", "", "Lcom/meijer/mobile/coupon/service/complexpromos/api/models/ProductComplexPromoJson;", "a", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complexpromos_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface a {
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @GET("complexpromos/v1/{upc}/{unitId}")
    Object a(@Path("upc") String str, @Path("unitId") int i10, Continuation<? super Response<List<ProductComplexPromoJson>>> continuation);
}
