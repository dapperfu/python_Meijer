package Xl;

import com.meijer.mobile.home.service.models.contentManagementSystem.HomeCMSBannerResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Headers;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"LXl/b;", "", "Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface b {
    @Headers({"Accept: application/vnd.meijer.digitalmperks.homecontent-v1.0+json", "Content-Type: application/vnd.meijer.digitalmperks.homecontent-v1.0+json"})
    @GET("api/cms/home/content")
    Object a(Continuation<? super HomeCMSBannerResponse> continuation);
}
