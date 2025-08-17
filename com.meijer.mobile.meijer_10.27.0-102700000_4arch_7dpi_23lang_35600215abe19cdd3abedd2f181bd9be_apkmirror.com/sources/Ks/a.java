package Ks;

import com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdItemJson;
import com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdPrintPageJson;
import com.meijer.mobile.weeklyad.services.api.models.FlippWeeklyAdPublicationJson;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J:\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\u000fJ0\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b0\u00072\b\b\u0001\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"LKs/a;", "", "", "merchantID", "", "storeCode", "accessToken", "Lretrofit2/Response;", "", "Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdPublicationJson;", "e", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "publicationID", "Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdItemJson;", "d", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "productId", "b", "Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdPrintPageJson;", "c", "flipp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {
    @GET("product/{productId}")
    Object b(@Path("productId") int i10, @Query("access_token") String str, Continuation<? super Response<FlippWeeklyAdItemJson>> continuation);

    @GET("publication/{publicationID}/pages")
    Object c(@Path("publicationID") int i10, @Query("access_token") String str, Continuation<? super Response<List<FlippWeeklyAdPrintPageJson>>> continuation);

    @GET("publication/{publicationID}/products?display_type=1,3,5,7")
    Object d(@Path("publicationID") int i10, @Query("access_token") String str, Continuation<? super Response<List<FlippWeeklyAdItemJson>>> continuation);

    @GET("publications/{merchantID}?locale=en-US")
    Object e(@Path("merchantID") String str, @Query("store_code") int i10, @Query("access_token") String str2, Continuation<? super Response<List<FlippWeeklyAdPublicationJson>>> continuation);
}
