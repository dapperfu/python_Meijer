package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import java.io.IOException;
import java.lang.Thread;
import java.util.List;

/* loaded from: classes4.dex */
public class k1 implements C6624v0.a {

    /* renamed from: a, reason: collision with root package name */
    private final l1 f64282a;

    /* renamed from: b, reason: collision with root package name */
    private final D0 f64283b;

    public enum b {
        NEW("NEW"),
        BLOCKED("BLOCKED"),
        RUNNABLE("RUNNABLE"),
        TERMINATED("TERMINATED"),
        TIMED_WAITING("TIMED_WAITING"),
        WAITING("WAITING"),
        UNKNOWN("UNKNOWN");


        /* renamed from: a, reason: collision with root package name */
        private final String f64293a;

        private static b e(Thread.State state) {
            switch (a.f64284a[state.ordinal()]) {
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
            return this.f64293a;
        }

        b(String str) {
            this.f64293a = str;
        }

        public static b a(Thread thread) {
            return e(thread.getState());
        }
    }

    k1(String str, String str2, ErrorType errorType, boolean z10, b bVar, d1 d1Var, D0 d02) {
        this.f64282a = new l1(str, str2, errorType, z10, bVar.b(), d1Var);
        this.f64283b = d02;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64284a;

        static {
            int[] iArr = new int[Thread.State.values().length];
            f64284a = iArr;
            try {
                iArr[Thread.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64284a[Thread.State.BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64284a[Thread.State.RUNNABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64284a[Thread.State.TERMINATED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64284a[Thread.State.TIMED_WAITING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64284a[Thread.State.WAITING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public boolean a() {
        return this.f64282a.getIsErrorReportingThread();
    }

    public List<c1> b() {
        return this.f64282a.a();
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 c6624v0) throws IOException {
        this.f64282a.toStream(c6624v0);
    }

    k1(l1 l1Var, D0 d02) {
        this.f64282a = l1Var;
        this.f64283b = d02;
    }
}
