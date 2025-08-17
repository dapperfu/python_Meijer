package i3;

import android.media.metrics.LogSessionId;
import d3.C13466a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class E1 {

    /* renamed from: d, reason: collision with root package name */
    public static final E1 f136993d = new E1("");

    /* renamed from: a, reason: collision with root package name */
    public final String f136994a;

    /* renamed from: b, reason: collision with root package name */
    private final a f136995b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f136996c;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public LogSessionId f136997a = LogSessionId.LOG_SESSION_ID_NONE;

        public void a(LogSessionId logSessionId) {
            C13466a.g(this.f136997a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.f136997a = logSessionId;
        }
    }

    public synchronized LogSessionId a() {
        return ((a) C13466a.e(this.f136995b)).f136997a;
    }

    public synchronized void b(LogSessionId logSessionId) {
        ((a) C13466a.e(this.f136995b)).a(logSessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E1)) {
            return false;
        }
        E1 e12 = (E1) obj;
        return Objects.equals(this.f136994a, e12.f136994a) && Objects.equals(this.f136995b, e12.f136995b) && Objects.equals(this.f136996c, e12.f136996c);
    }

    public int hashCode() {
        return Objects.hash(this.f136994a, this.f136995b, this.f136996c);
    }

    public E1(String str) {
        a aVar;
        this.f136994a = str;
        if (d3.P.f127086a >= 31) {
            aVar = new a();
        } else {
            aVar = null;
        }
        this.f136995b = aVar;
        this.f136996c = new Object();
    }
}
