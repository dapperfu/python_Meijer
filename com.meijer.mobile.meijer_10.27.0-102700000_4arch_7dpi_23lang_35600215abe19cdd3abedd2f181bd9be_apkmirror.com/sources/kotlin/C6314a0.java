package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lc0/a0;", "T", "Lc0/B;", "", "delay", "<init>", "(I)V", "Lc0/q;", "V", "Lc0/o0;", "converter", "Lc0/u0;", "a", "(Lc0/o0;)Lc0/u0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getDelay", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6314a0<T> implements InterfaceC6289B<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int delay;

    public C6314a0() {
        this(0, 1, null);
    }

    public C6314a0(int i10) {
        this.delay = i10;
    }

    @Override // kotlin.InterfaceC6326i
    public <V extends AbstractC6334q> u0<V> a(o0<T, V> converter) {
        return new B0(this.delay);
    }

    public boolean equals(Object other) {
        return (other instanceof C6314a0) && ((C6314a0) other).delay == this.delay;
    }

    /* renamed from: hashCode, reason: from getter */
    public int getDelay() {
        return this.delay;
    }

    public /* synthetic */ C6314a0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
