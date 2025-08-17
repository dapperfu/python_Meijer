package kotlin;

import kotlin.AbstractC6334q;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001d¨\u0006\u001f"}, d2 = {"Lc0/D0;", "Lc0/q;", "V", "Lc0/u0;", "", "durationMillis", "delayMillis", "Lc0/C;", "easing", "<init>", "(IILc0/C;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "d", "(JLc0/q;Lc0/q;Lc0/q;)Lc0/q;", "f", "a", "I", "c", "()I", "b", "e", "Lc0/C;", "getEasing", "()Lc0/C;", "Lc0/w0;", "Lc0/w0;", "anim", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D0<V extends AbstractC6334q> implements u0<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int delayMillis;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6290C easing;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w0<V> anim;

    @Override // kotlin.u0
    /* renamed from: c, reason: from getter */
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // kotlin.r0
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.anim.d(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // kotlin.u0
    /* renamed from: e, reason: from getter */
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // kotlin.r0
    public V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.anim.f(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    public D0(int i10, int i11, InterfaceC6290C interfaceC6290C) {
        this.durationMillis = i10;
        this.delayMillis = i11;
        this.easing = interfaceC6290C;
        this.anim = new w0<>(new C6298K(getDurationMillis(), getDelayMillis(), interfaceC6290C));
    }
}
