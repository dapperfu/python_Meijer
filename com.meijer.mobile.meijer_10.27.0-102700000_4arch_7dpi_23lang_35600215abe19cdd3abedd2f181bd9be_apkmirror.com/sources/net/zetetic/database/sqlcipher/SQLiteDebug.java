package net.zetetic.database.sqlcipher;

import android.util.Log;
import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes13.dex */
public final class SQLiteDebug {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f151348a = Log.isLoggable("SQLiteLog", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f151349b = Log.isLoggable("SQLiteStatements", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f151350c = Log.isLoggable("SQLiteTime", 2);

    public static class PagerStats {
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    private static native void nativeGetPagerStats(PagerStats pagerStats);

    public static class DbStats {

        /* renamed from: a, reason: collision with root package name */
        public String f151351a;

        /* renamed from: b, reason: collision with root package name */
        public long f151352b;

        /* renamed from: c, reason: collision with root package name */
        public long f151353c;

        /* renamed from: d, reason: collision with root package name */
        public int f151354d;

        /* renamed from: e, reason: collision with root package name */
        public String f151355e;

        public DbStats(String str, long j10, long j11, int i10, int i11, int i12, int i13) {
            this.f151351a = str;
            this.f151352b = j11 / 1024;
            this.f151353c = (j10 * j11) / 1024;
            this.f151354d = i10;
            this.f151355e = i11 + q2.f92724c + i12 + q2.f92724c + i13;
        }
    }

    private SQLiteDebug() {
    }
}
