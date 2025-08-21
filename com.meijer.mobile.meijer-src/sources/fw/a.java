package fw;

import gw.C14416e;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgw/e;", "", "a", "(Lgw/e;)Z", "logging-interceptor"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {
    public static final boolean a(C14416e c14416e) {
        Intrinsics.j(c14416e, "<this>");
        try {
            C14416e c14416e2 = new C14416e();
            c14416e.g(c14416e2, 0L, RangesKt.l(c14416e.getSize(), 64L));
            for (int i10 = 0; i10 < 16; i10++) {
                if (c14416e2.i2()) {
                    return true;
                }
                int iK2 = c14416e2.K2();
                if (Character.isISOControl(iK2) && !Character.isWhitespace(iK2)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
