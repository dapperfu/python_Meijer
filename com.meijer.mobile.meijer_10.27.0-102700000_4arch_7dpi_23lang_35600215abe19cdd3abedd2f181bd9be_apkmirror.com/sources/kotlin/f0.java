package kotlin;

import kotlin.AbstractC6334q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010!¨\u0006#"}, d2 = {"Lc0/f0;", "Lc0/q;", "V", "Lc0/r0;", "vectorizedAnimationSpec", "", "startDelayNanos", "<init>", "(Lc0/r0;J)V", "initialValue", "targetValue", "initialVelocity", "b", "(Lc0/q;Lc0/q;Lc0/q;)J", "playTimeNanos", "f", "(JLc0/q;Lc0/q;Lc0/q;)Lc0/q;", "d", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc0/r0;", "getVectorizedAnimationSpec", "()Lc0/r0;", "J", "getStartDelayNanos", "()J", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class f0<V extends AbstractC6334q> implements r0<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r0<V> vectorizedAnimationSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long startDelayNanos;

    @Override // kotlin.r0
    public boolean a() {
        return this.vectorizedAnimationSpec.a();
    }

    @Override // kotlin.r0
    public long b(V initialValue, V targetValue, V initialVelocity) {
        return this.vectorizedAnimationSpec.b(initialValue, targetValue, initialVelocity) + this.startDelayNanos;
    }

    @Override // kotlin.r0
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long j10 = this.startDelayNanos;
        return playTimeNanos < j10 ? initialValue : (V) this.vectorizedAnimationSpec.d(playTimeNanos - j10, initialValue, targetValue, initialVelocity);
    }

    public boolean equals(Object other) {
        if (!(other instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) other;
        return f0Var.startDelayNanos == this.startDelayNanos && Intrinsics.e(f0Var.vectorizedAnimationSpec, this.vectorizedAnimationSpec);
    }

    @Override // kotlin.r0
    public V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long j10 = this.startDelayNanos;
        return playTimeNanos < j10 ? initialVelocity : (V) this.vectorizedAnimationSpec.f(playTimeNanos - j10, initialValue, targetValue, initialVelocity);
    }

    public int hashCode() {
        return (this.vectorizedAnimationSpec.hashCode() * 31) + Long.hashCode(this.startDelayNanos);
    }

    public f0(r0<V> r0Var, long j10) {
        this.vectorizedAnimationSpec = r0Var;
        this.startDelayNanos = j10;
    }
}
