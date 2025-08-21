package zh;

import Fh.EnrollmentOfferResendEmailResponse;
import com.meijer.mobile.authentication.core.model.BearerToken;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lzh/a;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lio/reactivex/l;", "LFh/d;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;)Lio/reactivex/l;", "Lokhttp3/ResponseBody;", "a", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zh.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC18489a {
    @Headers({"Accept: application/vnd.meijer.account.mperksBarcode-v1.0+jpeg"})
    @GET("accounts/mPerksBarcode")
    io.reactivex.l<ResponseBody> a(@Header("Authorization") BearerToken authorizationToken);

    @Headers({"Accept: application/vnd.meijer.account.updateConfirmation-v1.0+json", "Content-Type: application/vnd.meijer.account.sendEmailResponse-v1.0+json"})
    @POST("accounts/resendwelcomeemail")
    io.reactivex.l<EnrollmentOfferResendEmailResponse> b(@Header("Authorization") BearerToken authorizationToken);
}
