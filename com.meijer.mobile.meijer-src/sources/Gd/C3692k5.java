package Gd;

import android.os.SystemClock;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: Gd.k5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3692k5 implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    private static final Map f12101h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final String f12102a;

    /* renamed from: b, reason: collision with root package name */
    private int f12103b;

    /* renamed from: c, reason: collision with root package name */
    private double f12104c;

    /* renamed from: d, reason: collision with root package name */
    private long f12105d;

    /* renamed from: e, reason: collision with root package name */
    private long f12106e;

    /* renamed from: f, reason: collision with root package name */
    private long f12107f;

    /* renamed from: g, reason: collision with root package name */
    private long f12108g;

    private C3692k5(String str) {
        this.f12107f = 2147483647L;
        this.f12108g = -2147483648L;
        this.f12102a = str;
    }

    private final void a() {
        this.f12103b = 0;
        this.f12104c = 0.0d;
        this.f12105d = 0L;
        this.f12107f = 2147483647L;
        this.f12108g = -2147483648L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f12105d;
        if (j10 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        d(j10);
    }

    public static C3692k5 g(String str) {
        K5.a();
        if (!K5.b()) {
            return C3678i5.f12070i;
        }
        Map map = f12101h;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C3692k5("detectorTaskWithResource#run"));
        }
        return (C3692k5) map.get("detectorTaskWithResource#run");
    }

    public C3692k5 b() {
        this.f12105d = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void c(long j10) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f12106e;
        if (j11 != 0 && jElapsedRealtimeNanos - j11 >= 1000000) {
            a();
        }
        this.f12106e = jElapsedRealtimeNanos;
        this.f12103b++;
        this.f12104c += j10;
        this.f12107f = Math.min(this.f12107f, j10);
        this.f12108g = Math.max(this.f12108g, j10);
        if (this.f12103b % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f12102a, Long.valueOf(j10), Integer.valueOf(this.f12103b), Long.valueOf(this.f12107f), Long.valueOf(this.f12108g), Integer.valueOf((int) (this.f12104c / this.f12103b)));
            K5.a();
        }
        if (this.f12103b % HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR == 0) {
            a();
        }
    }

    public void d(long j10) {
        c((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }
}
