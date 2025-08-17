package Zk;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.coupons.api.models.CategoriesResponse;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest;
import com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse;
import com.meijer.mobile.coupons.api.models.CouponsRequest;
import com.meijer.mobile.coupons.api.models.CouponsResponseJson;
import com.meijer.mobile.coupons.api.models.GetAdsResponse;
import com.meijer.mobile.coupons.api.models.HideCouponRequest;
import com.meijer.mobile.coupons.api.models.SpecialOffersUrlResponse;
import com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsRequest;
import com.meijer.mobile.coupons.api.models.WeeklyAdRelatedCouponsResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\tJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0014\u0010\u0013J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001c\u001a\u00020\u001b2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H§@¢\u0006\u0004\b\"\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, d2 = {"LZk/b;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "request", "Lretrofit2/Response;", "Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/coupons/api/models/CouponsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "", "categoryFilter", "Lcom/meijer/mobile/coupons/api/models/CategoriesResponse;", "h", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponRequest;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "f", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lcom/meijer/mobile/coupons/api/models/HideCouponRequest;", "", "i", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/coupons/api/models/HideCouponRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsRequest;", "body", "Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsResponse;", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/coupons/api/models/WeeklyAdRelatedCouponsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/GetAdsResponse;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/SpecialOffersUrlResponse;", "g", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface b {
    @Headers({"Accept: application/vnd.meijer.digitalmperks.couponads-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.couponads-v1.0+json"})
    @GET("api/cms/coupon/ads")
    Object a(Continuation<? super GetAdsResponse> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.offers-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.offers-v1.0+json"})
    @POST("api/offers")
    Object b(@Header("Authorization") BearerToken bearerToken, @Body CouponsRequest couponsRequest, Continuation<? super Response<CouponsResponseJson>> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.weeklyadrelatedoffers-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.weeklyadrelatedoffers-v1.0+json"})
    @POST("api/weeklyad/relatedOffers")
    Object c(@Header("Authorization") BearerToken bearerToken, @Body WeeklyAdRelatedCouponsRequest weeklyAdRelatedCouponsRequest, Continuation<? super WeeklyAdRelatedCouponsResponse> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.offers-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.offers-v1.0+json"})
    @POST("api/offers/ClippedOffers")
    Object d(@Header("Authorization") BearerToken bearerToken, @Body CouponsRequest couponsRequest, Continuation<? super Response<CouponsResponseJson>> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.unclip-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.unclip-v1.0+json"})
    @POST("api/offers/Unclip")
    Object e(@Header("Authorization") BearerToken bearerToken, @Body ClipUnclipCouponRequest clipUnclipCouponRequest, Continuation<? super Response<ClipUnclipCouponResponse>> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.clip-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.clip-v1.0+json"})
    @POST("api/offers/Clip")
    Object f(@Header("Authorization") BearerToken bearerToken, @Body ClipUnclipCouponRequest clipUnclipCouponRequest, Continuation<? super Response<ClipUnclipCouponResponse>> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.cmsspecialoffers-v1.0+json"})
    @GET("api/cms/specialoffers/image")
    Object g(Continuation<? super SpecialOffersUrlResponse> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.categories-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.categories-v1.0+json"})
    @GET("api/offers/Categories")
    Object h(@Header("Authorization") BearerToken bearerToken, @Query("clipFilter") String str, Continuation<? super Response<CategoriesResponse>> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.hideoffers-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.hideoffers-v1.0+json"})
    @POST("api/offers/Hide")
    Object i(@Header("Authorization") BearerToken bearerToken, @Body HideCouponRequest hideCouponRequest, Continuation<? super Response<Unit>> continuation);
}
