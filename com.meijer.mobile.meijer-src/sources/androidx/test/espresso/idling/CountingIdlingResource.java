package androidx.test.espresso.idling;

import android.os.SystemClock;
import android.text.TextUtils;
import com.fullstory.FS;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class CountingIdlingResource {

    /* renamed from: a, reason: collision with root package name */
    private final String f58993a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f58994b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f58995c;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f58996d;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f58997e;

    public CountingIdlingResource(String str) {
        this(str, false);
    }

    public CountingIdlingResource(String str, boolean z10) {
        this.f58994b = new AtomicInteger(0);
        this.f58996d = 0L;
        this.f58997e = 0L;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("resourceName cannot be empty or null!");
        }
        this.f58993a = str;
        this.f58995c = z10;
    }

    public void a() {
        int iDecrementAndGet = this.f58994b.decrementAndGet();
        if (iDecrementAndGet == 0) {
            this.f58997e = SystemClock.uptimeMillis();
        }
        if (this.f58995c) {
            if (iDecrementAndGet == 0) {
                FS.log_i("CountingIdlingResource", "Resource: " + this.f58993a + " went idle! (Time spent not idle: " + (this.f58997e - this.f58996d) + ")");
            } else {
                FS.log_i("CountingIdlingResource", "Resource: " + this.f58993a + " in-use-count decremented to: " + iDecrementAndGet);
            }
        }
        if (iDecrementAndGet > -1) {
            return;
        }
        throw new IllegalStateException("Counter has been corrupted! counterVal=" + iDecrementAndGet);
    }

    public void b() {
        int andIncrement = this.f58994b.getAndIncrement();
        if (andIncrement == 0) {
            this.f58996d = SystemClock.uptimeMillis();
        }
        if (this.f58995c) {
            FS.log_i("CountingIdlingResource", "Resource: " + this.f58993a + " in-use-count incremented to: " + (andIncrement + 1));
        }
    }

    public boolean c() {
        return this.f58994b.get() == 0;
    }
}
