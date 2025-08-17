package zg;

import android.os.SystemClock;
import com.google.android.gms.common.internal.C6528j;
import com.google.android.gms.common.internal.r;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import yg.C18212a;

/* renamed from: zg.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C18455a {

    /* renamed from: c, reason: collision with root package name */
    private static final C6528j f171826c = new C6528j("StreamingFormatChecker", "");

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList f171827a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private long f171828b = -1;

    public void a(C18212a c18212a) {
        if (c18212a.e() == -1) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f171827a.add(Long.valueOf(jElapsedRealtime));
            if (this.f171827a.size() > 5) {
                this.f171827a.removeFirst();
            }
            if (this.f171827a.size() == 5 && jElapsedRealtime - ((Long) r.l((Long) this.f171827a.peekFirst())).longValue() < 5000) {
                long j10 = this.f171828b;
                if (j10 == -1 || jElapsedRealtime - j10 >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.f171828b = jElapsedRealtime;
                    f171826c.f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
