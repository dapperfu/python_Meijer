package kotlin;

import kotlin.AbstractC6334q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lc0/z0;", "Lc0/q;", "V", "", "vectorValue", "Lc0/C;", "easing", "Lc0/t;", "arcMode", "<init>", "(Lc0/q;Lc0/C;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc0/q;", "c", "()Lc0/q;", "b", "Lc0/C;", "()Lc0/C;", "I", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.z0, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class VectorizedKeyframeSpecElementInfo<V extends AbstractC6334q> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final V vectorValue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6290C easing;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int arcMode;

    public /* synthetic */ VectorizedKeyframeSpecElementInfo(AbstractC6334q abstractC6334q, InterfaceC6290C interfaceC6290C, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6334q, interfaceC6290C, i10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VectorizedKeyframeSpecElementInfo)) {
            return false;
        }
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) other;
        return Intrinsics.e(this.vectorValue, vectorizedKeyframeSpecElementInfo.vectorValue) && Intrinsics.e(this.easing, vectorizedKeyframeSpecElementInfo.easing) && C6337t.c(this.arcMode, vectorizedKeyframeSpecElementInfo.arcMode);
    }

    private VectorizedKeyframeSpecElementInfo(V v10, InterfaceC6290C interfaceC6290C, int i10) {
        this.vectorValue = v10;
        this.easing = interfaceC6290C;
        this.arcMode = i10;
    }

    /* renamed from: a, reason: from getter */
    public final int getArcMode() {
        return this.arcMode;
    }

    /* renamed from: b, reason: from getter */
    public final InterfaceC6290C getEasing() {
        return this.easing;
    }

    public final V c() {
        return this.vectorValue;
    }

    public int hashCode() {
        return (((this.vectorValue.hashCode() * 31) + this.easing.hashCode()) * 31) + C6337t.d(this.arcMode);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.vectorValue + ", easing=" + this.easing + ", arcMode=" + ((Object) C6337t.e(this.arcMode)) + ')';
    }
}
