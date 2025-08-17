package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\b\b\u0001\u0010\f*\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lc0/M;", "T", "Lc0/i;", "Lc0/B;", "animation", "Lc0/Y;", "repeatMode", "Lc0/g0;", "initialStartOffset", "<init>", "(Lc0/B;Lc0/Y;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lc0/q;", "V", "Lc0/o0;", "converter", "Lc0/r0;", "a", "(Lc0/o0;)Lc0/r0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lc0/B;", "getAnimation", "()Lc0/B;", "b", "Lc0/Y;", "getRepeatMode", "()Lc0/Y;", "c", "J", "getInitialStartOffset-Rmkjzm4", "()J", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6300M<T> implements InterfaceC6326i<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f60906d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6289B<T> animation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC6311Y repeatMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long initialStartOffset;

    public /* synthetic */ C6300M(InterfaceC6289B interfaceC6289B, EnumC6311Y enumC6311Y, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6289B, enumC6311Y, j10);
    }

    private C6300M(InterfaceC6289B<T> interfaceC6289B, EnumC6311Y enumC6311Y, long j10) {
        this.animation = interfaceC6289B;
        this.repeatMode = enumC6311Y;
        this.initialStartOffset = j10;
    }

    @Override // kotlin.InterfaceC6326i
    public <V extends AbstractC6334q> r0<V> a(o0<T, V> converter) {
        return new y0(this.animation.a((o0) converter), this.repeatMode, this.initialStartOffset, null);
    }

    public boolean equals(Object other) {
        if (other instanceof C6300M) {
            C6300M c6300m = (C6300M) other;
            if (Intrinsics.e(c6300m.animation, this.animation) && c6300m.repeatMode == this.repeatMode && g0.d(c6300m.initialStartOffset, this.initialStartOffset)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.animation.hashCode() * 31) + this.repeatMode.hashCode()) * 31) + g0.e(this.initialStartOffset);
    }
}
