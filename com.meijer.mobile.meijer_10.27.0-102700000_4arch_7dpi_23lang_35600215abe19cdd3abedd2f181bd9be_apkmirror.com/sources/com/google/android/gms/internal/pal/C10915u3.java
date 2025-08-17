package com.google.android.gms.internal.pal;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: com.google.android.gms.internal.pal.u3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10915u3 {

    /* renamed from: c, reason: collision with root package name */
    private static final ConditionVariable f84067c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    protected static volatile U5 f84068d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile Random f84069e = null;

    /* renamed from: a, reason: collision with root package name */
    private final X3 f84070a;

    /* renamed from: b, reason: collision with root package name */
    protected volatile Boolean f84071b;

    private static Random e() {
        if (f84069e == null) {
            synchronized (C10915u3.class) {
                try {
                    if (f84069e == null) {
                        f84069e = new Random();
                    }
                } finally {
                }
            }
        }
        return f84069e;
    }

    public final void c(int i10, int i11, long j10, String str, Exception exc) {
        try {
            f84067c.block();
            if (!this.f84071b.booleanValue() || f84068d == null) {
                return;
            }
            D2 d2T = E4.t();
            d2T.m(this.f84070a.f82943a.getPackageName());
            d2T.p(j10);
            if (str != null) {
                d2T.n(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                d2T.q(stringWriter.toString());
                d2T.o(exc.getClass().getName());
            }
            T5 t5A = f84068d.a(((E4) d2T.j()).i());
            t5A.a(i10);
            if (i11 != -1) {
                t5A.b(i11);
            }
            t5A.c();
        } catch (Exception unused) {
        }
    }

    public C10915u3(X3 x32) {
        this.f84070a = x32;
        x32.k().execute(new RunnableC10899t3(this));
    }

    public static final int d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return e().nextInt();
        }
    }
}
