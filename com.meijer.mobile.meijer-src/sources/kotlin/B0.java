package kotlin;

import kotlin.AbstractC6460q;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\r\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lc0/B0;", "Lc0/q;", "V", "Lc0/u0;", "", "delayMillis", "<init>", "(I)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "d", "(JLc0/q;Lc0/q;Lc0/q;)Lc0/q;", "f", "a", "I", "e", "()I", "c", "durationMillis", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B0<V extends AbstractC6460q> implements u0<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    @Override // kotlin.u0
    public int c() {
        return 0;
    }

    @Override // kotlin.r0
    public V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return initialVelocity;
    }

    @Override // kotlin.u0
    /* renamed from: e, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    public B0(int i10) {
        this.delayMillis = i10;
    }

    @Override // kotlin.r0
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        if (playTimeNanos < getDelayMillis() * 1000000) {
            return initialValue;
        }
        return targetValue;
    }
}
