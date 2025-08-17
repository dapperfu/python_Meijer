package Ed;

import android.os.SystemClock;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: Ed.k5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3500k5 implements Closeable {

    /* renamed from: h, reason: collision with root package name */
    private static final Map f8549h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final String f8550a;

    /* renamed from: b, reason: collision with root package name */
    private int f8551b;

    /* renamed from: c, reason: collision with root package name */
    private double f8552c;

    /* renamed from: d, reason: collision with root package name */
    private long f8553d;

    /* renamed from: e, reason: collision with root package name */
    private long f8554e;

    /* renamed from: f, reason: collision with root package name */
    private long f8555f;

    /* renamed from: g, reason: collision with root package name */
    private long f8556g;

    private C3500k5(String str) {
        this.f8555f = 2147483647L;
        this.f8556g = -2147483648L;
        this.f8550a = str;
    }

    private final void a() {
        this.f8551b = 0;
        this.f8552c = 0.0d;
        this.f8553d = 0L;
        this.f8555f = 2147483647L;
        this.f8556g = -2147483648L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j10 = this.f8553d;
        if (j10 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        d(j10);
    }

    public static C3500k5 g(String str) {
        K5.a();
        if (!K5.b()) {
            return C3486i5.f8518i;
        }
        Map map = f8549h;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C3500k5("detectorTaskWithResource#run"));
        }
        return (C3500k5) map.get("detectorTaskWithResource#run");
    }

    public C3500k5 b() {
        this.f8553d = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    public void c(long j10) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f8554e;
        if (j11 != 0 && jElapsedRealtimeNanos - j11 >= 1000000) {
            a();
        }
        this.f8554e = jElapsedRealtimeNanos;
        this.f8551b++;
        this.f8552c += j10;
        this.f8555f = Math.min(this.f8555f, j10);
        this.f8556g = Math.max(this.f8556g, j10);
        if (this.f8551b % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f8550a, Long.valueOf(j10), Integer.valueOf(this.f8551b), Long.valueOf(this.f8555f), Long.valueOf(this.f8556g), Integer.valueOf((int) (this.f8552c / this.f8551b)));
            K5.a();
        }
        if (this.f8551b % HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR == 0) {
            a();
        }
    }

    public void d(long j10) {
        c((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }
}
