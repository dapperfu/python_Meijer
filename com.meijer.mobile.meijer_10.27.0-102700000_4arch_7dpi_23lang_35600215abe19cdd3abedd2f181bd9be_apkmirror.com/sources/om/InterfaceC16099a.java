package om;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.instoreshopping.service.productimages.model.request.EDaAProductImageRequest;
import com.meijer.mobile.instoreshopping.service.productimages.model.response.EDaAItemDetailsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lom/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "Lcom/meijer/mobile/instoreshopping/service/productimages/model/request/EDaAProductImageRequest;", "request", "Lretrofit2/Response;", "", "Lcom/meijer/mobile/instoreshopping/service/productimages/model/response/EDaAItemDetailsResponse;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/instoreshopping/service/productimages/model/request/EDaAProductImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: om.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC16099a {
    @POST("item")
    Object a(@Header("Authorization") BearerToken bearerToken, @Body EDaAProductImageRequest eDaAProductImageRequest, Continuation<? super Response<List<EDaAItemDetailsResponse>>> continuation);
}
