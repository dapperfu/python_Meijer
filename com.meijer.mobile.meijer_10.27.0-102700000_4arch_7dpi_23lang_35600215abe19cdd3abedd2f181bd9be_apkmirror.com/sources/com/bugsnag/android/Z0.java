package com.bugsnag.android;

import com.bugsnag.android.C6482m0;
import java.io.IOException;
import java.lang.Thread;
import java.util.List;

/* loaded from: classes4.dex */
public class Z0 implements C6482m0.a {

    /* renamed from: a, reason: collision with root package name */
    private final a1 f63350a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6495t0 f63351b;

    public enum b {
        NEW("NEW"),
        BLOCKED("BLOCKED"),
        RUNNABLE("RUNNABLE"),
        TERMINATED("TERMINATED"),
        TIMED_WAITING("TIMED_WAITING"),
        WAITING("WAITING"),
        UNKNOWN("UNKNOWN");


        /* renamed from: a, reason: collision with root package name */
        private final String f63361a;

        private static b e(Thread.State state) {
            switch (a.f63352a[state.ordinal()]) {
                case 1:
                    return NEW;
                case 2:
                    return BLOCKED;
                case 3:
                    return RUNNABLE;
                case 4:
                    return TERMINATED;
                case 5:
                    return TIMED_WAITING;
                case 6:
                    return WAITING;
                default:
                    return UNKNOWN;
            }
        }

        public String b() {
            return this.f63361a;
        }

        b(String str) {
            this.f63361a = str;
        }

        public static b a(Thread thread) {
            return e(thread.getState());
        }
    }

    Z0(long j10, String str, d1 d1Var, boolean z10, b bVar, S0 s02, InterfaceC6495t0 interfaceC6495t0) {
        this.f63350a = new a1(j10, str, d1Var, z10, bVar.b(), s02);
        this.f63351b = interfaceC6495t0;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63352a;

        static {
            int[] iArr = new int[Thread.State.values().length];
            f63352a = iArr;
            try {
                iArr[Thread.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63352a[Thread.State.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63352a[Thread.State.RUNNABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63352a[Thread.State.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63352a[Thread.State.TIMED_WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63352a[Thread.State.WAITING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public boolean a() {
        return this.f63350a.getIsErrorReportingThread();
    }

    public List<R0> b() {
        return this.f63350a.a();
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 c6482m0) throws IOException {
        this.f63350a.toStream(c6482m0);
    }

    Z0(a1 a1Var, InterfaceC6495t0 interfaceC6495t0) {
        this.f63350a = a1Var;
        this.f63351b = interfaceC6495t0;
    }
}
