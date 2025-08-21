package i3;

import android.media.metrics.LogSessionId;
import d3.C13599a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class E1 {

    /* renamed from: d, reason: collision with root package name */
    public static final E1 f136750d = new E1("");

    /* renamed from: a, reason: collision with root package name */
    public final String f136751a;

    /* renamed from: b, reason: collision with root package name */
    private final a f136752b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f136753c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public LogSessionId f136754a = LogSessionId.LOG_SESSION_ID_NONE;

        public void a(LogSessionId logSessionId) {
            C13599a.g(this.f136754a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f136754a = logSessionId;
        }
    }

    public synchronized LogSessionId a() {
        return ((a) C13599a.e(this.f136752b)).f136754a;
    }

    public synchronized void b(LogSessionId logSessionId) {
        ((a) C13599a.e(this.f136752b)).a(logSessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E1)) {
            return false;
        }
        E1 e12 = (E1) obj;
        return Objects.equals(this.f136751a, e12.f136751a) && Objects.equals(this.f136752b, e12.f136752b) && Objects.equals(this.f136753c, e12.f136753c);
    }

    public int hashCode() {
        return Objects.hash(this.f136751a, this.f136752b, this.f136753c);
    }

    public E1(String str) {
        a aVar;
        this.f136751a = str;
        if (d3.P.f127888a >= 31) {
            aVar = new a();
        } else {
            aVar = null;
        }
        this.f136752b = aVar;
        this.f136753c = new Object();
    }
}
