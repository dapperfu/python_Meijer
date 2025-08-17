package androidx.test.espresso.idling;

import android.os.SystemClock;
import android.text.TextUtils;
import com.fullstory.FS;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class CountingIdlingResource {

    /* renamed from: a, reason: collision with root package name */
    private final String f58807a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f58808b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f58809c;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f58810d;

    /* renamed from: e, reason: collision with root package name */
    private volatile long f58811e;

    public CountingIdlingResource(String str) {
        this(str, false);
    }

    public CountingIdlingResource(String str, boolean z10) {
        this.f58808b = new AtomicInteger(0);
        this.f58810d = 0L;
        this.f58811e = 0L;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("resourceName cannot be empty or null!");
        }
        this.f58807a = str;
        this.f58809c = z10;
    }

    public void a() {
        int iDecrementAndGet = this.f58808b.decrementAndGet();
        if (iDecrementAndGet == 0) {
            this.f58811e = SystemClock.uptimeMillis();
        }
        if (this.f58809c) {
            if (iDecrementAndGet == 0) {
                FS.log_i("CountingIdlingResource", "Resource: " + this.f58807a + " went idle! (Time spent not idle: " + (this.f58811e - this.f58810d) + ")");
            } else {
                FS.log_i("CountingIdlingResource", "Resource: " + this.f58807a + " in-use-count decremented to: " + iDecrementAndGet);
            }
        }
        if (iDecrementAndGet > -1) {
            return;
        }
        throw new IllegalStateException("Counter has been corrupted! counterVal=" + iDecrementAndGet);
    }

    public void b() {
        int andIncrement = this.f58808b.getAndIncrement();
        if (andIncrement == 0) {
            this.f58810d = SystemClock.uptimeMillis();
        }
        if (this.f58809c) {
            FS.log_i("CountingIdlingResource", "Resource: " + this.f58807a + " in-use-count incremented to: " + (andIncrement + 1));
        }
    }

    public boolean c() {
        return this.f58808b.get() == 0;
    }
}
