package net.zetetic.database.sqlcipher;

import android.util.Log;
import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes14.dex */
public final class SQLiteDebug {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f152357a = Log.isLoggable("SQLiteLog", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f152358b = Log.isLoggable("SQLiteStatements", 2);

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f152359c = Log.isLoggable("SQLiteTime", 2);

    public static class PagerStats {
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    private static native void nativeGetPagerStats(PagerStats pagerStats);

    public static class DbStats {

        /* renamed from: a, reason: collision with root package name */
        public String f152360a;

        /* renamed from: b, reason: collision with root package name */
        public long f152361b;

        /* renamed from: c, reason: collision with root package name */
        public long f152362c;

        /* renamed from: d, reason: collision with root package name */
        public int f152363d;

        /* renamed from: e, reason: collision with root package name */
        public String f152364e;

        public DbStats(String str, long j10, long j11, int i10, int i11, int i12, int i13) {
            this.f152360a = str;
            this.f152361b = j11 / 1024;
            this.f152362c = (j10 * j11) / 1024;
            this.f152363d = i10;
            this.f152364e = i11 + q2.f93563c + i12 + q2.f93563c + i13;
        }
    }

    private SQLiteDebug() {
    }
}
