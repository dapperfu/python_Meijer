package androidx.compose.ui.layout;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Landroidx/compose/ui/layout/O;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/N;", "measurePolicy", "<init>", "(Landroidx/compose/ui/layout/N;)V", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "i", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "width", "g", "e", "j", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/ui/layout/N;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/N;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.layout.O, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class MultiContentMeasurePolicyImpl implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final N measurePolicy;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MultiContentMeasurePolicyImpl) && Intrinsics.e(this.measurePolicy, ((MultiContentMeasurePolicyImpl) other).measurePolicy);
    }

    public int hashCode() {
        return this.measurePolicy.hashCode();
    }

    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.measurePolicy + ')';
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public J d(K k10, List<? extends I> list, long j10) {
        return this.measurePolicy.d(k10, androidx.compose.ui.node.X.a(k10), j10);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int e(InterfaceC5791s interfaceC5791s, List<? extends r> list, int i10) {
        return this.measurePolicy.e(interfaceC5791s, androidx.compose.ui.node.X.a(interfaceC5791s), i10);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int g(InterfaceC5791s interfaceC5791s, List<? extends r> list, int i10) {
        return this.measurePolicy.g(interfaceC5791s, androidx.compose.ui.node.X.a(interfaceC5791s), i10);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int i(InterfaceC5791s interfaceC5791s, List<? extends r> list, int i10) {
        return this.measurePolicy.i(interfaceC5791s, androidx.compose.ui.node.X.a(interfaceC5791s), i10);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int j(InterfaceC5791s interfaceC5791s, List<? extends r> list, int i10) {
        return this.measurePolicy.j(interfaceC5791s, androidx.compose.ui.node.X.a(interfaceC5791s), i10);
    }

    public MultiContentMeasurePolicyImpl(N n10) {
        this.measurePolicy = n10;
    }
}
