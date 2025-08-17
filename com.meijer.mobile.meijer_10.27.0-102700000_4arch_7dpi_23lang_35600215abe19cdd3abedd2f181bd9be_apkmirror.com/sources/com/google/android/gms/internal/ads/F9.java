package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes6.dex */
public final class F9 {

    /* renamed from: c, reason: collision with root package name */
    private static final ConditionVariable f66746c = new ConditionVariable();

    /* renamed from: d, reason: collision with root package name */
    protected static volatile C7803dd0 f66747d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile Random f66748e = null;

    /* renamed from: a, reason: collision with root package name */
    private final C8863na f66749a;

    /* renamed from: b, reason: collision with root package name */
    protected volatile Boolean f66750b;

    public final void c(int i10, int i11, long j10, String str, Exception exc) {
        try {
            f66746c.block();
            if (!this.f66750b.booleanValue() || f66747d == null) {
                return;
            }
            Q7 q7B0 = U7.b0();
            q7B0.u(this.f66749a.f77076a.getPackageName());
            q7B0.y(j10);
            if (str != null) {
                q7B0.v(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                q7B0.z(stringWriter.toString());
                q7B0.x(exc.getClass().getName());
            }
            C7590bd0 c7590bd0A = f66747d.a(((U7) q7B0.p()).j());
            c7590bd0A.a(i10);
            if (i11 != -1) {
                c7590bd0A.b(i11);
            }
            c7590bd0A.c();
        } catch (Exception unused) {
        }
    }

    public F9(C8863na c8863na) {
        this.f66749a = c8863na;
        c8863na.k().execute(new E9(this));
    }

    public static final int d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (f66748e == null) {
                synchronized (F9.class) {
                    try {
                        if (f66748e == null) {
                            f66748e = new Random();
                        }
                    } finally {
                    }
                }
            }
            return f66748e.nextInt();
        }
    }
}
