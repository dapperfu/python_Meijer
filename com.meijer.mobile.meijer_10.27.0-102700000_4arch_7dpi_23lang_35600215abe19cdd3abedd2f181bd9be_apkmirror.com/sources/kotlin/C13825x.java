package kotlin;

import H1.z;
import h1.C14326c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Lf0/x;", "", "<init>", "()V", "", "timeMillis", "LU0/f;", "delta", "", "a", "(JJ)V", "LH1/y;", "b", "()J", "Lh1/c;", "Lh1/c;", "xVelocityTracker", "yVelocityTracker", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C13825x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14326c xVelocityTracker = new C14326c(true);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14326c yVelocityTracker = new C14326c(true);

    public final void a(long timeMillis, long delta) {
        this.xVelocityTracker.a(timeMillis, Float.intBitsToFloat((int) (delta >> 32)));
        this.yVelocityTracker.a(timeMillis, Float.intBitsToFloat((int) (delta & 4294967295L)));
    }

    public final long b() {
        return z.a(this.xVelocityTracker.d(Float.MAX_VALUE), this.yVelocityTracker.d(Float.MAX_VALUE));
    }
}
