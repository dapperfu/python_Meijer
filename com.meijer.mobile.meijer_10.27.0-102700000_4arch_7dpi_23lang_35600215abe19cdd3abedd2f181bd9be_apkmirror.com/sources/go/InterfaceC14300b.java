package go;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.mperks.networking.domain.models.MperksCreditCardInfoResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lgo/b;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authToken", "Lcom/meijer/mobile/mperks/networking/domain/models/MperksCreditCardInfoResponse;", "a", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: go.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC14300b {
    @Headers({"Content:application/vnd.meijer.digitalmperks.mcardinfo-v1.0+json", "Accept: application/vnd.meijer.digitalmperks.mcardinfo-v1.0+json"})
    @GET("api/reward/mCard/info")
    Object a(@Header("Authorization") BearerToken bearerToken, Continuation<? super MperksCreditCardInfoResponse> continuation);
}
