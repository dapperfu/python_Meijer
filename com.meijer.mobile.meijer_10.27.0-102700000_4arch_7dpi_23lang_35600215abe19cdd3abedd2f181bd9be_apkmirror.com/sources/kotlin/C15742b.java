package kotlin;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\fR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\f¨\u0006\u0018"}, d2 = {"Ln0/b;", "", "<init>", "()V", "", "new", "current", "a", "(JJ)J", "timeNanos", "", "e", "(J)V", "f", "b", "()Ln0/b;", "J", "c", "()J", "setCompositionTimeNanos", "compositionTimeNanos", "d", "setMeasureTimeNanos", "measureTimeNanos", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C15742b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long compositionTimeNanos;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long measureTimeNanos;

    private final long a(long j10, long current) {
        if (current == 0) {
            return j10;
        }
        long j11 = 4;
        return ((current / j11) * 3) + (j10 / j11);
    }

    public final C15742b b() {
        C15742b c15742b = new C15742b();
        c15742b.compositionTimeNanos = this.compositionTimeNanos;
        c15742b.measureTimeNanos = this.measureTimeNanos;
        return c15742b;
    }

    /* renamed from: c, reason: from getter */
    public final long getCompositionTimeNanos() {
        return this.compositionTimeNanos;
    }

    /* renamed from: d, reason: from getter */
    public final long getMeasureTimeNanos() {
        return this.measureTimeNanos;
    }

    public final void e(long timeNanos) {
        this.compositionTimeNanos = a(timeNanos, this.compositionTimeNanos);
    }

    public final void f(long timeNanos) {
        this.measureTimeNanos = a(timeNanos, this.measureTimeNanos);
    }
}
