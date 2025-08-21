package hk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhk/f;", "other", "a", "(Lhk/f;Lhk/f;)Lhk/f;", "models_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class g {
    public static final PaymentOption a(PaymentOption paymentOption, PaymentOption paymentOption2) {
        if (paymentOption == null) {
            return paymentOption2;
        }
        if (paymentOption2 == null || !Intrinsics.e(paymentOption.getAuthToken(), paymentOption2.getAuthToken())) {
            return paymentOption2 == null ? paymentOption : paymentOption2;
        }
        PaymentOption paymentOptionB = PaymentOption.b(paymentOption2, null, null, null, null, paymentOption.getCardCvNumber(), false, null, null, null, null, false, null, null, 8175, null);
        System.out.println((Object) ("USING CACHED CVV FOR UPDATED TOKEN " + paymentOptionB));
        return paymentOptionB;
    }
}
