package jd;

import android.os.Looper;
import java.util.concurrent.Executor;
import jd.C14987j;

/* renamed from: jd.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14988k {
    public static <L> C14987j<L> a(L l10, Looper looper, String str) {
        com.google.android.gms.common.internal.r.m(l10, "Listener must not be null");
        com.google.android.gms.common.internal.r.m(looper, "Looper must not be null");
        com.google.android.gms.common.internal.r.m(str, "Listener type must not be null");
        return new C14987j<>(looper, l10, str);
    }

    public static <L> C14987j<L> b(L l10, Executor executor, String str) {
        com.google.android.gms.common.internal.r.m(l10, "Listener must not be null");
        com.google.android.gms.common.internal.r.m(executor, "Executor must not be null");
        com.google.android.gms.common.internal.r.m(str, "Listener type must not be null");
        return new C14987j<>(executor, l10, str);
    }

    public static <L> C14987j.a<L> c(L l10, String str) {
        com.google.android.gms.common.internal.r.m(l10, "Listener must not be null");
        com.google.android.gms.common.internal.r.m(str, "Listener type must not be null");
        com.google.android.gms.common.internal.r.g(str, "Listener type must not be empty");
        return new C14987j.a<>(l10, str);
    }
}
