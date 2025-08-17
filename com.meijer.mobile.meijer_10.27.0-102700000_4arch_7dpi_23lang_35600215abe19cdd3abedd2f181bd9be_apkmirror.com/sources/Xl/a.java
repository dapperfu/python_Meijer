package Xl;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.home.service.models.departmentcard.DepartmentCardJson;
import com.meijer.mobile.home.service.models.homecard.HomeCardResponse;
import com.meijer.mobile.home.service.models.homecard.HomeCardResponseV2;
import com.meijer.mobile.home.service.models.homecard.HomeGetCardsResponseItem;
import com.meijer.mobile.home.service.models.homecard.ProductCarouselV3Json;
import com.meijer.mobile.home.service.models.mperks.HomeMperksDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JF\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\f\b\u0001\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000b\u0010\fJ^\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\f\b\u0001\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\f\b\u0001\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017JF\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\f\b\u0001\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0019\u0010\fJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH§@¢\u0006\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"LXl/a;", "", "", "path", "customerId", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "pageNum", "listType", "Lcom/meijer/mobile/home/service/models/homecard/HomeCardResponse;", "g", "(Ljava/lang/String;Ljava/lang/String;IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pageName", "sourceID", "Lcom/meijer/mobile/home/service/models/homecard/HomeCardResponseV2;", "a", "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/home/service/models/homecard/ProductCarouselV3Json;", "e", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/home/service/models/departmentcard/DepartmentCardJson;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/home/service/models/mperks/HomeMperksDto;", "f", "", "Lcom/meijer/mobile/home/service/models/homecard/HomeGetCardsResponseItem;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface a {
    @Headers({"Accept: application/vnd.meijer.digitalmperks.offers-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.offers-v1.0+json"})
    @GET("homecards/v1/cards/{path}")
    Object a(@Path("path") String str, @Query("customerId") String str2, @Query(PlaceTypes.STORE) int i10, @Query("pageNum") int i11, @Query("listType") int i12, @Query("pageName") String str3, @Query("retailer-visitor-id") String str4, Continuation<? super HomeCardResponseV2> continuation);

    @GET("homecards/v1/cards/{path}")
    Object b(@Path("path") String str, Continuation<? super DepartmentCardJson> continuation);

    @GET("homecards/v1/cards")
    Object c(Continuation<? super List<HomeGetCardsResponseItem>> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.offers-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.offers-v1.0+json"})
    @GET("homecards/v1/cards/{path}")
    Object e(@Path("path") String str, @Query("customerId") String str2, @Query(PlaceTypes.STORE) int i10, Continuation<? super ProductCarouselV3Json> continuation);

    @GET("homecards/v1/cards/{path}")
    Object f(@Path("path") String str, @Query("customerId") String str2, @Query(PlaceTypes.STORE) int i10, @Query("listType") int i11, @Query("pageNum") int i12, Continuation<? super HomeMperksDto> continuation);

    @Headers({"Accept: application/vnd.meijer.digitalmperks.offers-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.offers-v1.0+json"})
    @GET("homecards/v1/cards/{path}")
    Object g(@Path("path") String str, @Query("customerId") String str2, @Query(PlaceTypes.STORE) int i10, @Query("pageNum") int i11, @Query("listType") int i12, Continuation<? super HomeCardResponse> continuation);

    static /* synthetic */ Object d(a aVar, String str, String str2, int i10, int i11, int i12, Continuation continuation, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRewards");
        }
        if ((i13 & 16) != 0) {
            i12 = 1;
        }
        return aVar.f(str, str2, i10, i11, i12, continuation);
    }
}
