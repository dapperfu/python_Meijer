package Rq;

import android.webkit.JavascriptInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B,\u0012#\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\f\u0010\rR4\u0010\b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LRq/I;", "", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "getBalanceResult", "", "ebtGetBalanceResult", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "message", "callFromIframe", "(Ljava/lang/String;)V", "a", "Lkotlin/jvm/functions/Function1;", "getEbtGetBalanceResult", "()Lkotlin/jvm/functions/Function1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
final class I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<String, Unit> ebtGetBalanceResult;

    /* JADX WARN: Multi-variable type inference failed */
    public I(Function1<? super String, Unit> ebtGetBalanceResult) {
        Intrinsics.j(ebtGetBalanceResult, "ebtGetBalanceResult");
        this.ebtGetBalanceResult = ebtGetBalanceResult;
    }

    @JavascriptInterface
    public final void callFromIframe(String message) {
        Intrinsics.j(message, "message");
        uw.a.INSTANCE.a(message, new Object[0]);
        this.ebtGetBalanceResult.invoke(message);
    }
}
