package kotlin;

import kotlin.AbstractC6460q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J/\u0010\u0019\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u001a\u0010#\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0014\u0010'\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010&¨\u0006("}, d2 = {"Lc0/y0;", "Lc0/q;", "V", "Lc0/r0;", "Lc0/u0;", "animation", "Lc0/Y;", "repeatMode", "Lc0/g0;", "initialStartOffset", "<init>", "(Lc0/u0;Lc0/Y;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "playTimeNanos", "h", "(J)J", "start", "startVelocity", "end", "i", "(JLc0/q;Lc0/q;Lc0/q;)Lc0/q;", "initialValue", "targetValue", "initialVelocity", "d", "f", "b", "(Lc0/q;Lc0/q;Lc0/q;)J", "a", "Lc0/u0;", "Lc0/Y;", "c", "J", "getDurationNanos$animation_core_release", "()J", "durationNanos", "initialOffsetNanos", "", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y0<V extends AbstractC6460q> implements r0<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u0<V> animation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC6437Y repeatMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long durationNanos;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long initialOffsetNanos;

    public /* synthetic */ y0(u0 u0Var, EnumC6437Y enumC6437Y, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(u0Var, enumC6437Y, j10);
    }

    @Override // kotlin.r0
    public boolean a() {
        return true;
    }

    private y0(u0<V> u0Var, EnumC6437Y enumC6437Y, long j10) {
        this.animation = u0Var;
        this.repeatMode = enumC6437Y;
        this.durationNanos = (u0Var.getDelayMillis() + u0Var.c()) * 1000000;
        this.initialOffsetNanos = j10 * 1000000;
    }

    private final long h(long playTimeNanos) {
        long j10 = this.initialOffsetNanos;
        if (playTimeNanos + j10 <= 0) {
            return 0L;
        }
        long j11 = playTimeNanos + j10;
        long j12 = this.durationNanos;
        long j13 = j11 / j12;
        return (this.repeatMode == EnumC6437Y.f60775a || j13 % ((long) 2) == 0) ? j11 - (j13 * j12) : ((j13 + 1) * j12) - j11;
    }

    private final V i(long playTimeNanos, V start, V startVelocity, V end) {
        long j10 = this.initialOffsetNanos;
        long j11 = playTimeNanos + j10;
        long j12 = this.durationNanos;
        return j11 > j12 ? this.animation.f(j12 - j10, start, end, startVelocity) : startVelocity;
    }

    @Override // kotlin.r0
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.animation.d(h(playTimeNanos), initialValue, targetValue, i(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    @Override // kotlin.r0
    public V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.animation.f(h(playTimeNanos), initialValue, targetValue, i(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    @Override // kotlin.r0
    public long b(V initialValue, V targetValue, V initialVelocity) {
        return Long.MAX_VALUE;
    }
}
