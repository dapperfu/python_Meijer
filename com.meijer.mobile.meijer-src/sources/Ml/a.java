package Ml;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.greenville.model.request.item.add.AddItemRequest;
import com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest;
import com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest;
import com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest;
import com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest;
import com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest;
import com.meijer.mobile.greenville.model.response.TransactionResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"LMl/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;", "request", "Lretrofit2/Response;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "d", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/trip/cancel/CancelTripRequest;", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/greenville/model/request/trip/cancel/CancelTripRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;", "f", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;", "e", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {
    @POST("NextGenPOSBasket")
    Object a(@Header("Authorization") BearerToken bearerToken, @Body UpdateItemRequest updateItemRequest, Continuation<? super Response<TransactionResponse>> continuation);

    @POST("NextGenPOSBasket")
    Object b(@Header("Authorization") BearerToken bearerToken, @Body RemoveItemRequest removeItemRequest, Continuation<? super Response<TransactionResponse>> continuation);

    @POST("NextGenPOSBasket")
    Object c(@Header("Authorization") BearerToken bearerToken, @Body CancelTripRequest cancelTripRequest, Continuation<? super Response<TransactionResponse>> continuation);

    @POST("NextGenPOSBasket")
    Object d(@Header("Authorization") BearerToken bearerToken, @Body StartTripRequest startTripRequest, Continuation<? super Response<TransactionResponse>> continuation);

    @POST("NextGenPOSBasket/Status")
    Object e(@Header("Authorization") BearerToken bearerToken, @Body TransferStatusRequest transferStatusRequest, Continuation<? super Response<TransactionResponse>> continuation);

    @POST("NextGenPOSBasket")
    Object f(@Header("Authorization") BearerToken bearerToken, @Body AddItemRequest addItemRequest, Continuation<? super Response<TransactionResponse>> continuation);
}
