package j0;

import androidx.compose.foundation.layout.AbstractC5667m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u0015\u0010\"\"\u0004\b#\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010%\u001a\u0004\b \u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lj0/H;", "", "", "weight", "", "fill", "Landroidx/compose/foundation/layout/m;", "crossAxisAlignment", "Lj0/o;", "flowLayoutData", "<init>", "(FZLandroidx/compose/foundation/layout/m;Lj0/o;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "d", "()F", "g", "(F)V", "b", "Z", "()Z", "f", "(Z)V", "c", "Landroidx/compose/foundation/layout/m;", "()Landroidx/compose/foundation/layout/m;", "e", "(Landroidx/compose/foundation/layout/m;)V", "Lj0/o;", "()Lj0/o;", "setFlowLayoutData", "(Lj0/o;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j0.H, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class RowColumnParentData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private float weight;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean fill;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private AbstractC5667m crossAxisAlignment;

    public RowColumnParentData() {
        this(0.0f, false, null, null, 15, null);
    }

    public final C14823o c() {
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) other;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && Intrinsics.e(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment) && Intrinsics.e(null, null);
    }

    public RowColumnParentData(float f10, boolean z10, AbstractC5667m abstractC5667m, C14823o c14823o) {
        this.weight = f10;
        this.fill = z10;
        this.crossAxisAlignment = abstractC5667m;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5667m getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getFill() {
        return this.fill;
    }

    /* renamed from: d, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    public final void e(AbstractC5667m abstractC5667m) {
        this.crossAxisAlignment = abstractC5667m;
    }

    public final void f(boolean z10) {
        this.fill = z10;
    }

    public final void g(float f10) {
        this.weight = f10;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill)) * 31;
        AbstractC5667m abstractC5667m = this.crossAxisAlignment;
        return (iHashCode + (abstractC5667m == null ? 0 : abstractC5667m.hashCode())) * 31;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ", flowLayoutData=" + ((Object) null) + ')';
    }

    public /* synthetic */ RowColumnParentData(float f10, boolean z10, AbstractC5667m abstractC5667m, C14823o c14823o, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : abstractC5667m, (i10 & 8) != 0 ? null : c14823o);
    }
}
