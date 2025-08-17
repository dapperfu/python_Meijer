package so;

import com.meijer.mobile.onlineshopping.errors.DigitalShoppingApiException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lso/a;", "", "", "cause", "Lcom/meijer/mobile/onlineshopping/errors/DigitalShoppingApiException;", "c", "(Ljava/lang/Throwable;)Lcom/meijer/mobile/onlineshopping/errors/DigitalShoppingApiException;", "", "getMessage", "()Ljava/lang/String;", "message", "d", "reason", "a", "subject", "errors_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: so.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC16987a {
    default String a() {
        return null;
    }

    default String d() {
        return null;
    }

    String getMessage();

    static /* synthetic */ DigitalShoppingApiException b(InterfaceC16987a interfaceC16987a, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toException");
        }
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        return interfaceC16987a.c(th2);
    }

    default DigitalShoppingApiException c(Throwable cause) {
        return new DigitalShoppingApiException(this, cause);
    }
}
