package G9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "", "a", "(Ljava/lang/Exception;)Ljava/lang/Throwable;", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {
    public static final Throwable a(Exception exc) {
        Intrinsics.j(exc, "<this>");
        Throwable cause = exc.getCause();
        while (true) {
            if ((cause != null ? cause.getCause() : null) == null || Intrinsics.e(cause.getCause(), cause)) {
                break;
            }
            cause = cause.getCause();
        }
        return cause;
    }
}
