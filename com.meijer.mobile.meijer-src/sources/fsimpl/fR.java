package fsimpl;

/* loaded from: classes15.dex */
public class fR {

    /* renamed from: a, reason: collision with root package name */
    private static final Runtime f133487a = Runtime.getRuntime();

    public static int a(long j10, long j11) {
        return (int) ((j10 * 100) / j11);
    }

    public static long a() {
        return f133487a.maxMemory();
    }

    public static long a(long j10) {
        Runtime runtime = f133487a;
        return j10 - (runtime.totalMemory() - runtime.freeMemory());
    }
}
