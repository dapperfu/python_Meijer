package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0001\u0010\n*\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lc0/d0;", "T", "Lc0/F;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFLjava/lang/Object;)V", "Lc0/q;", "V", "Lc0/o0;", "converter", "Lc0/C0;", "i", "(Lc0/o0;)Lc0/C0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "f", "()F", "b", "g", "c", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6320d0<T> implements InterfaceC6293F<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final T visibilityThreshold;

    public C6320d0() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public C6320d0(float f10, float f11, T t10) {
        this.dampingRatio = f10;
        this.stiffness = f11;
        this.visibilityThreshold = t10;
    }

    public boolean equals(Object other) {
        if (other instanceof C6320d0) {
            C6320d0 c6320d0 = (C6320d0) other;
            if (c6320d0.dampingRatio == this.dampingRatio && c6320d0.stiffness == this.stiffness && Intrinsics.e(c6320d0.visibilityThreshold, this.visibilityThreshold)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f, reason: from getter */
    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    /* renamed from: g, reason: from getter */
    public final float getStiffness() {
        return this.stiffness;
    }

    public final T h() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        T t10 = this.visibilityThreshold;
        return ((((t10 != null ? t10.hashCode() : 0) * 31) + Float.hashCode(this.dampingRatio)) * 31) + Float.hashCode(this.stiffness);
    }

    @Override // kotlin.InterfaceC6326i
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public <V extends AbstractC6334q> C0<V> a(o0<T, V> converter) {
        return new C0<>(this.dampingRatio, this.stiffness, C6327j.b(converter, this.visibilityThreshold));
    }

    public /* synthetic */ C6320d0(float f10, float f11, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }
}
