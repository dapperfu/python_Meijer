package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\b\b\u0001\u0010\t*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lc0/e0;", "T", "Lc0/i;", "animationSpec", "", "startDelayNanos", "<init>", "(Lc0/i;J)V", "Lc0/q;", "V", "Lc0/o0;", "converter", "Lc0/r0;", "a", "(Lc0/o0;)Lc0/r0;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lc0/i;", "getAnimationSpec", "()Lc0/i;", "b", "J", "getStartDelayNanos", "()J", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6448e0<T> implements InterfaceC6452i<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6452i<T> animationSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long startDelayNanos;

    @Override // kotlin.InterfaceC6452i
    public <V extends AbstractC6460q> r0<V> a(o0<T, V> converter) {
        return new f0(this.animationSpec.a(converter), this.startDelayNanos);
    }

    public boolean equals(Object other) {
        if (!(other instanceof C6448e0)) {
            return false;
        }
        C6448e0 c6448e0 = (C6448e0) other;
        return c6448e0.startDelayNanos == this.startDelayNanos && Intrinsics.e(c6448e0.animationSpec, this.animationSpec);
    }

    public int hashCode() {
        return (this.animationSpec.hashCode() * 31) + Long.hashCode(this.startDelayNanos);
    }

    public C6448e0(InterfaceC6452i<T> interfaceC6452i, long j10) {
        this.animationSpec = interfaceC6452i;
        this.startDelayNanos = j10;
    }
}
