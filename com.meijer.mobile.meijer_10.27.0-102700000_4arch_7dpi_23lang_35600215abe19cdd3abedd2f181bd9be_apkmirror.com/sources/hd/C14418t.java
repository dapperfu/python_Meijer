package hd;

import Td.C5233k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C6520b;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* renamed from: hd.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14418t {
    public static void a(Status status, C5233k<Void> c5233k) {
        b(status, null, c5233k);
    }

    public static <ResultT> void b(Status status, ResultT resultt, C5233k<ResultT> c5233k) {
        if (status.d1()) {
            c5233k.c(resultt);
        } else {
            c5233k.b(C6520b.a(status));
        }
    }

    @ResultIgnorabilityUnspecified
    public static <ResultT> boolean c(Status status, ResultT resultt, C5233k<ResultT> c5233k) {
        if (status.d1()) {
            return c5233k.e(resultt);
        }
        return c5233k.d(C6520b.a(status));
    }
}
