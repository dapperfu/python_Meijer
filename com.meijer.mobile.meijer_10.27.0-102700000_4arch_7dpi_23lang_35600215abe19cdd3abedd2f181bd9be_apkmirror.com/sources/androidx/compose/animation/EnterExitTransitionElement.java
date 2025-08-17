package androidx.compose.animation;

import H1.n;
import H1.r;
import androidx.compose.ui.node.Y;
import kotlin.C6331n;
import kotlin.EnumC6171k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.k0;
import kotlin.p;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R:\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R:\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\b\u0013\u0010F\"\u0004\bG\u0010HR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006O"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "Landroidx/compose/ui/node/Y;", "Landroidx/compose/animation/g;", "Lc0/k0;", "Lb0/k;", "transition", "Lc0/k0$a;", "LH1/r;", "Lc0/n;", "sizeAnimation", "LH1/n;", "offsetAnimation", "slideAnimation", "Landroidx/compose/animation/h;", "enter", "Landroidx/compose/animation/j;", "exit", "Lkotlin/Function0;", "", "isEnabled", "Lb0/p;", "graphicsLayerBlock", "<init>", "(Lc0/k0;Lc0/k0$a;Lc0/k0$a;Lc0/k0$a;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function0;Lb0/p;)V", "n", "()Landroidx/compose/animation/g;", "node", "", "o", "(Landroidx/compose/animation/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lc0/k0;", "getTransition", "()Lc0/k0;", "c", "Lc0/k0$a;", "getSizeAnimation", "()Lc0/k0$a;", "setSizeAnimation", "(Lc0/k0$a;)V", "d", "getOffsetAnimation", "setOffsetAnimation", "e", "getSlideAnimation", "setSlideAnimation", "f", "Landroidx/compose/animation/h;", "getEnter", "()Landroidx/compose/animation/h;", "setEnter", "(Landroidx/compose/animation/h;)V", "g", "Landroidx/compose/animation/j;", "getExit", "()Landroidx/compose/animation/j;", "setExit", "(Landroidx/compose/animation/j;)V", "h", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "setEnabled", "(Lkotlin/jvm/functions/Function0;)V", "i", "Lb0/p;", "getGraphicsLayerBlock", "()Lb0/p;", "setGraphicsLayerBlock", "(Lb0/p;)V", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class EnterExitTransitionElement extends Y<g> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final k0<EnumC6171k> transition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private k0<EnumC6171k>.a<r, C6331n> sizeAnimation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private k0<EnumC6171k>.a<n, C6331n> offsetAnimation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private k0<EnumC6171k>.a<n, C6331n> slideAnimation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private h enter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private j exit;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private Function0<Boolean> isEnabled;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private p graphicsLayerBlock;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) other;
        return Intrinsics.e(this.transition, enterExitTransitionElement.transition) && Intrinsics.e(this.sizeAnimation, enterExitTransitionElement.sizeAnimation) && Intrinsics.e(this.offsetAnimation, enterExitTransitionElement.offsetAnimation) && Intrinsics.e(this.slideAnimation, enterExitTransitionElement.slideAnimation) && Intrinsics.e(this.enter, enterExitTransitionElement.enter) && Intrinsics.e(this.exit, enterExitTransitionElement.exit) && Intrinsics.e(this.isEnabled, enterExitTransitionElement.isEnabled) && Intrinsics.e(this.graphicsLayerBlock, enterExitTransitionElement.graphicsLayerBlock);
    }

    public int hashCode() {
        int iHashCode = this.transition.hashCode() * 31;
        k0<EnumC6171k>.a<r, C6331n> aVar = this.sizeAnimation;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        k0<EnumC6171k>.a<n, C6331n> aVar2 = this.offsetAnimation;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        k0<EnumC6171k>.a<n, C6331n> aVar3 = this.slideAnimation;
        return ((((((((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.isEnabled.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", isEnabled=" + this.isEnabled + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public g b() {
        return new g(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.isEnabled, this.graphicsLayerBlock);
    }

    @Override // androidx.compose.ui.node.Y
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void c(g node) {
        node.V2(this.transition);
        node.T2(this.sizeAnimation);
        node.S2(this.offsetAnimation);
        node.U2(this.slideAnimation);
        node.O2(this.enter);
        node.P2(this.exit);
        node.N2(this.isEnabled);
        node.Q2(this.graphicsLayerBlock);
    }

    public EnterExitTransitionElement(k0<EnumC6171k> k0Var, k0<EnumC6171k>.a<r, C6331n> aVar, k0<EnumC6171k>.a<n, C6331n> aVar2, k0<EnumC6171k>.a<n, C6331n> aVar3, h hVar, j jVar, Function0<Boolean> function0, p pVar) {
        this.transition = k0Var;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = hVar;
        this.exit = jVar;
        this.isEnabled = function0;
        this.graphicsLayerBlock = pVar;
    }
}
