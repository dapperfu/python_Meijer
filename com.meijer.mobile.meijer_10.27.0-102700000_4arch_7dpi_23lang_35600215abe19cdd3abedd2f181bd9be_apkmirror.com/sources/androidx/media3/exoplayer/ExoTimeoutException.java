package androidx.media3.exoplayer;

/* loaded from: classes.dex */
public final class ExoTimeoutException extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f55576a;

    private static String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }

    public ExoTimeoutException(int i10) {
        super(a(i10));
        this.f55576a = i10;
    }
}
