package ho;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.mperks.networking.api.models.AutoClaimEnrollRequest;
import com.meijer.mobile.mperks.networking.api.models.AvailableAutoClaimOptionJson;
import com.meijer.mobile.mperks.networking.api.models.BuyRewardCouponRequest;
import com.meijer.mobile.mperks.networking.api.models.MperksAccountInfoResponse;
import com.meijer.mobile.mperks.networking.api.models.MperksAvailableRewardCouponsResponse;
import com.meijer.mobile.mperks.networking.api.models.MperksClaimRewardResponse;
import com.meijer.mobile.mperks.networking.api.models.MperksGetBalanceResponse;
import com.meijer.mobile.mperks.networking.api.models.MperksPointsExpiryResponse;
import com.meijer.mobile.mperks.networking.api.models.MperksRewardJson;
import com.meijer.mobile.mperks.networking.api.models.MperksTransactionHistoryResponse;
import com.meijer.mobile.mperks.networking.api.models.RewardIncludedUpcsResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JD\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0010J>\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0014H§@¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00160\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u0010J&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00160\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u0010J*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b \u0010!J \u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b#\u0010\u0010JB\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010$\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010%\u001a\u00020\u00042\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b(\u0010)J8\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001f0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010,\u001a\u00060*j\u0002`+2\b\b\u0001\u0010\u001e\u001a\u00020-H§@¢\u0006\u0004\b.\u0010/J*\u00102\u001a\b\u0012\u0004\u0012\u0002010\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020\u0006H§@¢\u0006\u0004\b2\u00103ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00064À\u0006\u0001"}, d2 = {"Lho/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "", "xContinuationToken", "", "maxItemCount", "", "includeAdjustmentDetails", "Lretrofit2/Response;", "Lcom/meijer/mobile/mperks/networking/api/models/MperksTransactionHistoryResponse;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/api/models/MperksGetBalanceResponse;", "g", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/api/models/MperksAvailableRewardCouponsResponse;", "h", "autoClaimType", "", "autoClaimAmount", "", "Lcom/meijer/mobile/mperks/networking/api/models/AvailableAutoClaimOptionJson;", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/api/models/MperksRewardJson;", "d", "k", "Lcom/meijer/mobile/mperks/networking/api/models/AutoClaimEnrollRequest;", "request", "Lcom/meijer/mobile/mperks/networking/api/models/MperksClaimRewardResponse;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/mperks/networking/api/models/AutoClaimEnrollRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/mperks/networking/api/models/MperksAccountInfoResponse;", "e", "continuationToken", "rewardId", "perPageCount", "Lcom/meijer/mobile/mperks/networking/api/models/RewardIncludedUpcsResponse;", "f", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "Lcom/meijer/mobile/mperks/networking/api/models/BuyRewardCouponRequest;", "j", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;JLcom/meijer/mobile/mperks/networking/api/models/BuyRewardCouponRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "days", "Lcom/meijer/mobile/mperks/networking/api/models/MperksPointsExpiryResponse;", "i", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ho.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC14561a {
    @GET("mperks40/customer/v1/transactions")
    Object a(@Header("Authorization") BearerToken bearerToken, @Header("x-continuation-token") String str, @Query("maxItemCount") Integer num, @Query("includeAdjustmentDetails") Boolean bool, Continuation<? super Response<MperksTransactionHistoryResponse>> continuation);

    @POST("mperks40/customer/v1/autoclaim/enroll")
    Object b(@Header("Authorization") BearerToken bearerToken, @Body AutoClaimEnrollRequest autoClaimEnrollRequest, Continuation<? super Response<MperksClaimRewardResponse>> continuation);

    @GET("mperks40/customer/v1/autoclaim/available")
    Object c(@Header("Authorization") BearerToken bearerToken, @Query("autoClaimType") String str, @Query("autoClaimAmount") Double d10, Continuation<? super Response<List<AvailableAutoClaimOptionJson>>> continuation);

    @GET("mperks40/customer/v1/rewards/available")
    Object d(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<List<MperksRewardJson>>> continuation);

    @GET("mperks40/customer/v1/account")
    Object e(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<MperksAccountInfoResponse>> continuation);

    @GET("mperks40/customer/v1/rewards/{rewardId}/earnrules/includedupcs")
    Object f(@Header("Authorization") BearerToken bearerToken, @Header("x-continuation-token") String str, @Path("rewardId") String str2, @Query("maxItemCount") Integer num, Continuation<? super Response<RewardIncludedUpcsResponse>> continuation);

    @GET("mperks40/customer/v1/pointbalance")
    Object g(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<MperksGetBalanceResponse>> continuation);

    @GET("mperks40/customer/v1/rewardcoupons/available")
    Object h(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<MperksAvailableRewardCouponsResponse>> continuation);

    @GET("mperks40/customer/v1/points/expiring")
    Object i(@Header("Authorization") BearerToken bearerToken, @Query("days") int i10, Continuation<? super Response<MperksPointsExpiryResponse>> continuation);

    @POST("mperks40/customer/v1/rewardcoupons/available/{couponId}/buy")
    Object j(@Header("Authorization") BearerToken bearerToken, @Path("couponId") long j10, @Body BuyRewardCouponRequest buyRewardCouponRequest, Continuation<? super Response<MperksClaimRewardResponse>> continuation);

    @GET("mperks40/customer/v1/rewards/inprogress")
    Object k(@Header("Authorization") BearerToken bearerToken, Continuation<? super Response<List<MperksRewardJson>>> continuation);
}
