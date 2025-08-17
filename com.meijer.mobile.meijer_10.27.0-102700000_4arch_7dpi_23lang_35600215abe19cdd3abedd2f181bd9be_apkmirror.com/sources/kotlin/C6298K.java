package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b¨\u0006\u001e"}, d2 = {"Lc0/K;", "Lc0/G;", "", "duration", "delay", "Lc0/C;", "easing", "<init>", "(IILc0/C;)V", "", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "c", "(JFFF)F", "e", "(FFF)J", "d", "a", "I", "getDuration", "()I", "b", "getDelay", "Lc0/C;", "J", "durationNanos", "delayNanos", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6298K implements InterfaceC6294G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int duration;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6290C easing;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long delayNanos;

    @Override // kotlin.InterfaceC6294G
    public float c(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long j10 = playTimeNanos - this.delayNanos;
        long j11 = this.durationNanos;
        if (j10 < 0) {
            j10 = 0;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        float fA = this.easing.a(this.duration == 0 ? 1.0f : j10 / j11);
        return (initialValue * (1 - fA)) + (targetValue * fA);
    }

    @Override // kotlin.InterfaceC6294G
    public float d(long playTimeNanos, float initialValue, float targetValue, float initialVelocity) {
        long j10 = playTimeNanos - this.delayNanos;
        long j11 = this.durationNanos;
        if (j10 < 0) {
            j10 = 0;
        }
        long j12 = j10 > j11 ? j11 : j10;
        if (j12 == 0) {
            return initialVelocity;
        }
        return (c(j12, initialValue, targetValue, initialVelocity) - c(j12 - 1000000, initialValue, targetValue, initialVelocity)) * 1000.0f;
    }

    @Override // kotlin.InterfaceC6294G
    public long e(float initialValue, float targetValue, float initialVelocity) {
        return this.delayNanos + this.durationNanos;
    }

    public C6298K(int i10, int i11, InterfaceC6290C interfaceC6290C) {
        this.duration = i10;
        this.delay = i11;
        this.easing = interfaceC6290C;
        this.durationNanos = i10 * 1000000;
        this.delayNanos = i11 * 1000000;
    }
}
