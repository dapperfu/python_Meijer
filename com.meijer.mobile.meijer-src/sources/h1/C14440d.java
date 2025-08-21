package h1;

import H1.y;
import H1.z;
import U0.f;
import h1.C14439c;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R(\u0010\u001d\u001a\u00020\u00068\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001e\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Lh1/d;", "", "<init>", "()V", "", "timeMillis", "LU0/f;", "position", "", "a", "(JJ)V", "LH1/y;", "maximumVelocity", "b", "(J)J", "e", "Lh1/c$a;", "Lh1/c$a;", "strategy", "Lh1/c;", "Lh1/c;", "xVelocityTracker", "c", "yVelocityTracker", "d", "J", "()J", "f", "(J)V", "currentPointerPositionAccumulator", "g", "lastMoveEventTimeStamp", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: h1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14440d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C14439c.a strategy;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14439c xVelocityTracker;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14439c yVelocityTracker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long currentPointerPositionAccumulator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long lastMoveEventTimeStamp;

    public final void a(long timeMillis, long position) {
        this.xVelocityTracker.a(timeMillis, Float.intBitsToFloat((int) (position >> 32)));
        this.yVelocityTracker.a(timeMillis, Float.intBitsToFloat((int) (position & 4294967295L)));
    }

    /* renamed from: c, reason: from getter */
    public final long getCurrentPointerPositionAccumulator() {
        return this.currentPointerPositionAccumulator;
    }

    /* renamed from: d, reason: from getter */
    public final long getLastMoveEventTimeStamp() {
        return this.lastMoveEventTimeStamp;
    }

    public final void e() {
        this.xVelocityTracker.e();
        this.yVelocityTracker.e();
        this.lastMoveEventTimeStamp = 0L;
    }

    public final void f(long j10) {
        this.currentPointerPositionAccumulator = j10;
    }

    public final void g(long j10) {
        this.lastMoveEventTimeStamp = j10;
    }

    public C14440d() {
        C14439c.a aVar;
        if (C14441e.h()) {
            aVar = C14439c.a.f134648b;
        } else {
            aVar = C14439c.a.f134647a;
        }
        this.strategy = aVar;
        this.xVelocityTracker = new C14439c(false, aVar, 1, null);
        this.yVelocityTracker = new C14439c(false, aVar, 1, null);
        this.currentPointerPositionAccumulator = f.INSTANCE.c();
    }

    public final long b(long maximumVelocity) {
        boolean z10;
        if (y.h(maximumVelocity) > 0.0f && y.i(maximumVelocity) > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C14920a.b("maximumVelocity should be a positive value. You specified=" + ((Object) y.n(maximumVelocity)));
        }
        return z.a(this.xVelocityTracker.d(y.h(maximumVelocity)), this.yVelocityTracker.d(y.i(maximumVelocity)));
    }
}
