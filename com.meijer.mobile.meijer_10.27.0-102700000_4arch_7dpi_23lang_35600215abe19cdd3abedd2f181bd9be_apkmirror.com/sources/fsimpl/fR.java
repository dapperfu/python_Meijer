package fsimpl;

/* loaded from: classes14.dex */
public class fR {

    /* renamed from: a, reason: collision with root package name */
    private static final Runtime f132237a = Runtime.getRuntime();

    public static int a(long j10, long j11) {
        return (int) ((j10 * 100) / j11);
    }

    public static long a() {
        return f132237a.maxMemory();
    }

    public static long a(long j10) {
        Runtime runtime = f132237a;
        return j10 - (runtime.totalMemory() - runtime.freeMemory());
    }
}
