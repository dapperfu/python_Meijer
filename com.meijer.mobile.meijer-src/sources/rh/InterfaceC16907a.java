package rh;

import com.meijer.mobile.accountlinking.api.model.ValidatePhoneNumberRequest;
import com.meijer.mobile.accountlinking.api.model.ValidatePhoneNumberResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lrh/a;", "", "Lcom/meijer/mobile/accountlinking/api/model/ValidatePhoneNumberRequest;", "validatePhoneNumberRequest", "Lcom/meijer/mobile/accountlinking/api/model/ValidatePhoneNumberResponse;", "a", "(Lcom/meijer/mobile/accountlinking/api/model/ValidatePhoneNumberRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountlinking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rh.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC16907a {
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("validatephone")
    Object a(@Body ValidatePhoneNumberRequest validatePhoneNumberRequest, Continuation<? super ValidatePhoneNumberResponse> continuation);
}
