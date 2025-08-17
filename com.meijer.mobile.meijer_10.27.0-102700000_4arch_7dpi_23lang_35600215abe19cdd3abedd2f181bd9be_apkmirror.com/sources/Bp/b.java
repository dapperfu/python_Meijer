package Bp;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.receipt.service.api.models.NextGenDigitalReceiptJson;
import com.meijer.mobile.receipt.service.api.models.NextGenReceiptByIdResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JD\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\u000e\u001a\u00060\u0004j\u0002`\rH§@¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"LBp/b;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "", "startDate", "endDate", "sortOrder", "Lretrofit2/Response;", "", "Lcom/meijer/mobile/receipt/service/api/models/NextGenDigitalReceiptJson;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/receipt/models/NextGenReceiptId;", "nextGenReceiptId", "Lcom/meijer/mobile/receipt/service/api/models/NextGenReceiptByIdResponse;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {
    @GET("api/ReceiptListByCustomerId")
    Object a(@Header("Authorization") BearerToken bearerToken, @Query("startDate") String str, @Query("endDate") String str2, @Query("sortOrder") String str3, Continuation<? super Response<List<NextGenDigitalReceiptJson>>> continuation);

    @GET("api/GetReceiptById/{receiptId}")
    Object b(@Header("Authorization") BearerToken bearerToken, @Path("receiptId") String str, Continuation<? super Response<NextGenReceiptByIdResponse>> continuation);
}
