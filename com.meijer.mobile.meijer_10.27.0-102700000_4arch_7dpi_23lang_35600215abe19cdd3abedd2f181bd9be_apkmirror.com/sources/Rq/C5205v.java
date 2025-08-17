package Rq;

import android.webkit.JavascriptInterface;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtPanResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001BM\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R2\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R2\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"LRq/v;", "", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "Lkotlin/ParameterName;", "name", "ebtResponse", "", "onSuccessEbtResponse", "", "error", "onShowError", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "result", "callFromJs", "(Ljava/lang/String;)V", "a", "Lkotlin/jvm/functions/Function1;", "getOnSuccessEbtResponse", "()Lkotlin/jvm/functions/Function1;", "b", "getOnShowError", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Rq.v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C5205v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<EbtPanResponse, Unit> onSuccessEbtResponse;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<String, Unit> onShowError;

    /* JADX WARN: Multi-variable type inference failed */
    public C5205v(Function1<? super EbtPanResponse, Unit> onSuccessEbtResponse, Function1<? super String, Unit> onShowError) {
        Intrinsics.j(onSuccessEbtResponse, "onSuccessEbtResponse");
        Intrinsics.j(onShowError, "onShowError");
        this.onSuccessEbtResponse = onSuccessEbtResponse;
        this.onShowError = onShowError;
    }

    @JavascriptInterface
    public final void callFromJs(String result) {
        Intrinsics.j(result, "result");
        uw.a.INSTANCE.k(result, new Object[0]);
        EbtPanResponse ebtPanResponseI = Gm.e.f11650a.i(result);
        if (ebtPanResponseI != null) {
            if (Intrinsics.e(ebtPanResponseI.getErrorMessage(), "SUCCESS")) {
                this.onSuccessEbtResponse.invoke(ebtPanResponseI);
            } else {
                this.onShowError.invoke(ebtPanResponseI.getErrorMessage());
            }
        }
    }
}
