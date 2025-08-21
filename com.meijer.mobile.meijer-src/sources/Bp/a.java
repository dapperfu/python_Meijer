package Bp;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.receipt.service.api.models.CustomerSavingsRequest;
import com.meijer.mobile.receipt.service.api.models.CustomerSavingsResponseJson;
import com.meijer.mobile.receipt.service.api.models.DigitalReceiptsRequest;
import com.meijer.mobile.receipt.service.api.models.DigitalReceiptsResponseJson;
import com.meijer.mobile.receipt.service.api.models.ViewDigitalReceiptRequest;
import com.meijer.mobile.receipt.service.api.models.ViewDigitalReceiptResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"LBp/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptsRequest;", "getDigitalReceiptsRequest", "Lretrofit2/Response;", "Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptsResponseJson;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/receipt/service/api/models/DigitalReceiptsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authorizationToken", "Lcom/meijer/mobile/receipt/service/api/models/ViewDigitalReceiptRequest;", "body", "Lcom/meijer/mobile/receipt/service/api/models/ViewDigitalReceiptResponse;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/receipt/service/api/models/ViewDigitalReceiptRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/receipt/service/api/models/CustomerSavingsRequest;", "Lcom/meijer/mobile/receipt/service/api/models/CustomerSavingsResponseJson;", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/receipt/service/api/models/CustomerSavingsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {
    @Headers({"Accept: application/vnd.meijer.digitalmperks.viewdigitalreceipt-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.viewdigitalreceipt-v1.0+json"})
    @POST("digitalreceipt/ViewDigitalReceipt")
    Object a(@Header("Authorization") BearerToken bearerToken, @Body ViewDigitalReceiptRequest viewDigitalReceiptRequest, Continuation<? super Response<ViewDigitalReceiptResponse>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.digitalmperks.digitalreceipts-v2.0+json", "Accept: application/vnd.meijer.digitalmperks.digitalreceipts-v2.0+json"})
    @POST("digitalreceipt/DigitalReceiptsSummary")
    Object b(@Header("Authorization") BearerToken bearerToken, @Body DigitalReceiptsRequest digitalReceiptsRequest, Continuation<? super Response<DigitalReceiptsResponseJson>> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.customersavings-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.customersavings-v1.0+json"})
    @POST("mPerks/api/customer/CustomerSavings")
    Object c(@Header("Authorization") BearerToken bearerToken, @Body CustomerSavingsRequest customerSavingsRequest, Continuation<? super Response<CustomerSavingsResponseJson>> continuation);
}
