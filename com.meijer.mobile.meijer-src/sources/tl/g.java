package tl;

import com.meijer.mobile.digitalshopping.api.timeslots.model.GetReservationSlotsOmsResponse;
import com.meijer.mobile.digitalshopping.api.timeslots.model.GetReservationSlotsOmsV1Request;
import com.meijer.mobile.digitalshopping.api.timeslots.model.GetReservationSlotsOmsV2Request;
import com.meijer.mobile.digitalshopping.api.timeslots.model.ValidateDtmReservationSlotRequest;
import com.meijer.mobile.digitalshopping.api.timeslots.model.ValidateReservationSlotOmsRequest;
import com.meijer.mobile.digitalshopping.api.timeslots.model.ValidateReservationSlotOmsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001JH\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H§@¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\n2\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Ltl/g;", "", "", "Lcom/meijer/mobile/authentication/core/AccessToken;", "accessToken", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsV2Request;", "getReservationSlotsOmsV2Request", "", "isEZCDEnabled", "isBunchaEnabled", "Lretrofit2/Response;", "", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsResponse;", "d", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsV2Request;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsV1Request;", "getReservationSlotsOmsV1Request", "c", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetReservationSlotsOmsV1Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ValidateReservationSlotOmsRequest;", "validateReservationSlotOmsRequest", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ValidateReservationSlotOmsResponse;", "b", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ValidateReservationSlotOmsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ValidateDtmReservationSlotRequest;", "validateDtmReservationSlotRequest", "a", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ValidateDtmReservationSlotRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface g {
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("oms/v2/timeslots/validate/by-fulfillment-type/pickup")
    Object a(@Header("access-token") String str, @Body ValidateDtmReservationSlotRequest validateDtmReservationSlotRequest, Continuation<? super Response<ValidateReservationSlotOmsResponse>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("oms/v1/timeslots/validate")
    Object b(@Header("access-token") String str, @Body ValidateReservationSlotOmsRequest validateReservationSlotOmsRequest, Continuation<? super Response<ValidateReservationSlotOmsResponse>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("oms/v1/timeslots")
    Object c(@Header("access-token") String str, @Body GetReservationSlotsOmsV1Request getReservationSlotsOmsV1Request, Continuation<? super Response<GetReservationSlotsOmsResponse>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("oms/v2/timeslots")
    Object d(@Header("access-token") String str, @Body GetReservationSlotsOmsV2Request getReservationSlotsOmsV2Request, @Header("x-ezcd-enabled") boolean z10, @Header("x-buncha-enabled") boolean z11, Continuation<? super Response<List<GetReservationSlotsOmsResponse>>> continuation);
}
