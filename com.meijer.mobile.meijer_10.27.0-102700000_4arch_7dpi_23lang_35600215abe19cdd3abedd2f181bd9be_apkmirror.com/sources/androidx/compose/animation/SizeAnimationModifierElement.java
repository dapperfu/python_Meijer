package androidx.compose.animation;

import H1.r;
import androidx.compose.ui.node.Y;
import kotlin.InterfaceC6293F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BW\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00128\u0010\u000e\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(RI\u0010\u000e\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/animation/l;", "Lc0/F;", "LH1/r;", "animationSpec", "LP0/e;", "alignment", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "initialValue", "targetValue", "", "finishedListener", "<init>", "(Lc0/F;LP0/e;Lkotlin/jvm/functions/Function2;)V", "n", "()Landroidx/compose/animation/l;", "node", "o", "(Landroidx/compose/animation/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lc0/F;", "getAnimationSpec", "()Lc0/F;", "c", "LP0/e;", "getAlignment", "()LP0/e;", "d", "Lkotlin/jvm/functions/Function2;", "getFinishedListener", "()Lkotlin/jvm/functions/Function2;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class SizeAnimationModifierElement extends Y<l> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC6293F<r> animationSpec;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final P0.e alignment;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function2<r, r, Unit> finishedListener;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) other;
        return Intrinsics.e(this.animationSpec, sizeAnimationModifierElement.animationSpec) && Intrinsics.e(this.alignment, sizeAnimationModifierElement.alignment) && Intrinsics.e(this.finishedListener, sizeAnimationModifierElement.finishedListener);
    }

    public int hashCode() {
        int iHashCode = ((this.animationSpec.hashCode() * 31) + this.alignment.hashCode()) * 31;
        Function2<r, r, Unit> function2 = this.finishedListener;
        return iHashCode + (function2 == null ? 0 : function2.hashCode());
    }

    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.animationSpec + ", alignment=" + this.alignment + ", finishedListener=" + this.finishedListener + ')';
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public l b() {
        return new l(this.animationSpec, this.alignment, this.finishedListener);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(l node) {
        node.R2(this.animationSpec);
        node.S2(this.finishedListener);
        node.P2(this.alignment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SizeAnimationModifierElement(InterfaceC6293F<r> interfaceC6293F, P0.e eVar, Function2<? super r, ? super r, Unit> function2) {
        this.animationSpec = interfaceC6293F;
        this.alignment = eVar;
        this.finishedListener = function2;
    }
}
