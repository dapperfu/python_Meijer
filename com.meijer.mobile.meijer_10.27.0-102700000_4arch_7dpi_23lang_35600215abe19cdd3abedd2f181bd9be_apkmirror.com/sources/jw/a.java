package jw;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kw.C15328e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkw/e;", "", "a", "(Lkw/e;)Z", "logging-interceptor"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {
    public static final boolean a(C15328e c15328e) {
        Intrinsics.j(c15328e, "<this>");
        try {
            C15328e c15328e2 = new C15328e();
            c15328e.g(c15328e2, 0L, RangesKt.l(c15328e.getSize(), 64L));
            for (int i10 = 0; i10 < 16; i10++) {
                if (c15328e2.j2()) {
                    return true;
                }
                int iL2 = c15328e2.L2();
                if (Character.isISOControl(iL2) && !Character.isWhitespace(iL2)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
