package jd;

import Vd.C5517k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C6645b;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* renamed from: jd.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14996t {
    public static void a(Status status, C5517k<Void> c5517k) {
        b(status, null, c5517k);
    }

    public static <ResultT> void b(Status status, ResultT resultt, C5517k<ResultT> c5517k) {
        if (status.d1()) {
            c5517k.c(resultt);
        } else {
            c5517k.b(C6645b.a(status));
        }
    }

    @ResultIgnorabilityUnspecified
    public static <ResultT> boolean c(Status status, ResultT resultt, C5517k<ResultT> c5517k) {
        if (status.d1()) {
            return c5517k.e(resultt);
        }
        return c5517k.d(C6645b.a(status));
    }
}
