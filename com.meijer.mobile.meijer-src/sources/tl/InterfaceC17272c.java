package tl;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.digitalshopping.api.timeslots.model.DTMFulfillmentSlotRequest;
import com.meijer.mobile.digitalshopping.api.timeslots.model.FulfillmentSlotRequest;
import com.meijer.mobile.digitalshopping.api.timeslots.model.GetDTMReservationSlotsResponse;
import com.meijer.mobile.digitalshopping.api.timeslots.model.ReservationSlotValidationResponse;
import com.meijer.mobile.digitalshopping.api.timeslots.model.Schedules;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001Jf\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010J>\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\r2\f\b\u0001\u0010\u0012\u001a\u00060\u0006j\u0002`\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0017\u0010\u0018Jt\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0019\u001a\u00020\u00062\f\b\u0001\u0010\u001b\u001a\u00060\u0004j\u0002`\u001aH§@¢\u0006\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Ltl/c;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "", "mfcStore", "", "deliveryPartner", "fulfillmentType", "fulfillmentEligibility", "curbsidePartner", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/FulfillmentSlotRequest;", "fulfillmentSlotRequest", "Lretrofit2/Response;", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/Schedules;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/FulfillmentSlotRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/authentication/core/AccessToken;", "accessToken", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/DTMFulfillmentSlotRequest;", "dtmFulfillmentSlotRequest", "", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/GetDTMReservationSlotsResponse;", "a", "(Ljava/lang/String;Lcom/meijer/mobile/digitalshopping/api/timeslots/model/DTMFulfillmentSlotRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "slotId", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/ReservationSlotValidationResponse;", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tl.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC17272c {
    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("oms/v2/timeslots/by-fulfillment-type/{fulfillmentType}")
    Object a(@Header("access-token") String str, @Body DTMFulfillmentSlotRequest dTMFulfillmentSlotRequest, @Path("fulfillmentType") String str2, Continuation<? super Response<List<GetDTMReservationSlotsResponse>>> continuation);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @POST("hybris/v3/fulfillment/reservationslots")
    Object b(@Header("Authorization") BearerToken bearerToken, @Header("x-mfc-store") Integer num, @Header("deliveryPartner") String str, @Header("fulfillmentType") String str2, @Header("fulfillmentEligibility") String str3, @Header("curbsidePartner") String str4, @Body FulfillmentSlotRequest fulfillmentSlotRequest, Continuation<? super Response<Schedules>> continuation);

    @Headers({"Content-Type: application/json", "Accept: application/json", "READ_TIMEOUT_MILLIS:120000"})
    @GET("hybris/v3/fulfillment/reservationslots/validate/{id}")
    Object c(@Header("Authorization") BearerToken bearerToken, @Header("x-mfc-store") Integer num, @Header("deliveryPartner") String str, @Header("fulfillmentType") String str2, @Header("fulfillmentEligibility") String str3, @Header("curbsidePartner") String str4, @Path(PreferencesHelper.PREF_ID) String str5, @Query("storeId") int i10, Continuation<? super Response<ReservationSlotValidationResponse>> continuation);
}
