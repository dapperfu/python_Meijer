package go;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.mperks.networking.api.models.BuyRewardCouponRequest;
import com.meijer.mobile.mperks.networking.domain.models.MperksClaimRewardResponseJson;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\b\u0001\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lgo/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "Lcom/meijer/mobile/mperks/networking/api/models/BuyRewardCouponRequest;", "request", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksClaimRewardResponseJson;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;JLcom/meijer/mobile/mperks/networking/api/models/BuyRewardCouponRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: go.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC14299a {
    @POST("mperks40/customer/v1/rewardcoupons/available/{couponId}/buy")
    Object a(@Header("Authorization") BearerToken bearerToken, @Path("couponId") long j10, @Body BuyRewardCouponRequest buyRewardCouponRequest, Continuation<? super MperksClaimRewardResponseJson> continuation);
}
