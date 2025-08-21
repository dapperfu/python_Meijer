package Bg;

import android.os.SystemClock;
import com.google.android.gms.common.internal.C6653j;
import com.google.android.gms.common.internal.r;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final C6653j f2740c = new C6653j("StreamingFormatChecker", "");

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList f2741a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private long f2742b = -1;

    public void a(Ag.a aVar) {
        if (aVar.e() == -1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f2741a.add(Long.valueOf(jElapsedRealtime));
            if (this.f2741a.size() > 5) {
                this.f2741a.removeFirst();
            }
            if (this.f2741a.size() == 5 && jElapsedRealtime - ((Long) r.l((Long) this.f2741a.peekFirst())).longValue() < 5000) {
                long j10 = this.f2742b;
                if (j10 == -1 || jElapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.f2742b = jElapsedRealtime;
                    f2740c.f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
