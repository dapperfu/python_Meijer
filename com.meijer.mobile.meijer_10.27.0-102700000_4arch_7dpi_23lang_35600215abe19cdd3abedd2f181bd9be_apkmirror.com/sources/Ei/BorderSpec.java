package Ei;

import V0.C5346q0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"LEi/n;", "", "", "hasBorder", "LH1/h;", "borderWidth", "LV0/q0;", "borderColor", "<init>", "(ZFJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "F", "()F", "J", "()J", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ei.n, reason: from toString */
/* loaded from: classes7.dex */
final /* data */ class BorderSpec {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasBorder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float borderWidth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long borderColor;

    public /* synthetic */ BorderSpec(boolean z10, float f10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, j10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderSpec)) {
            return false;
        }
        BorderSpec borderSpec = (BorderSpec) other;
        return this.hasBorder == borderSpec.hasBorder && H1.h.u(this.borderWidth, borderSpec.borderWidth) && C5346q0.s(this.borderColor, borderSpec.borderColor);
    }

    private BorderSpec(boolean z10, float f10, long j10) {
        this.hasBorder = z10;
        this.borderWidth = f10;
        this.borderColor = j10;
    }

    /* renamed from: a, reason: from getter */
    public final long getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: b, reason: from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getHasBorder() {
        return this.hasBorder;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.hasBorder) * 31) + H1.h.w(this.borderWidth)) * 31) + C5346q0.y(this.borderColor);
    }

    public String toString() {
        return "BorderSpec(hasBorder=" + this.hasBorder + ", borderWidth=" + ((Object) H1.h.z(this.borderWidth)) + ", borderColor=" + ((Object) C5346q0.z(this.borderColor)) + ')';
    }

    public /* synthetic */ BorderSpec(boolean z10, float f10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? H1.h.INSTANCE.c() : f10, (i10 & 4) != 0 ? C5346q0.INSTANCE.i() : j10, null);
    }
}
