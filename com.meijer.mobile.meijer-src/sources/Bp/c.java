package Bp;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.receipt.service.api.models.SubmitTransactionBarcodeRequest;
import com.meijer.mobile.receipt.service.api.models.SubmitTransactionRequest;
import com.meijer.mobile.receipt.service.api.models.SubmitTransactionResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"LBp/c;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lcom/meijer/mobile/receipt/service/api/models/SubmitTransactionRequest;", "request", "Lretrofit2/Response;", "Lcom/meijer/mobile/receipt/service/api/models/SubmitTransactionResponse;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/receipt/service/api/models/SubmitTransactionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/receipt/service/api/models/SubmitTransactionBarcodeRequest;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/receipt/service/api/models/SubmitTransactionBarcodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface c {
    @Headers({"Accept: application/vnd.meijer.digitalmperks.transaction-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.transaction-v1.0+json"})
    @POST("transaction/SubmitTransactionBarcode")
    Object a(@Header("Authorization") BearerToken bearerToken, @Body SubmitTransactionBarcodeRequest submitTransactionBarcodeRequest, Continuation<? super Response<SubmitTransactionResponse>> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.transaction-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.transaction-v1.0+json"})
    @POST("transaction/SubmitTransaction")
    Object b(@Header("Authorization") BearerToken bearerToken, @Body SubmitTransactionRequest submitTransactionRequest, Continuation<? super Response<SubmitTransactionResponse>> continuation);
}
