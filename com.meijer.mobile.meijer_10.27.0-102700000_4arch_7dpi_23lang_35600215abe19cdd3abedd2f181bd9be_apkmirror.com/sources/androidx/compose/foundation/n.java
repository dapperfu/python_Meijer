package androidx.compose.foundation;

import H1.t;
import androidx.compose.ui.node.AbstractC5817m;
import androidx.compose.ui.node.C5813i;
import androidx.compose.ui.node.C5815k;
import androidx.compose.ui.node.InterfaceC5812h;
import androidx.compose.ui.node.InterfaceC5814j;
import androidx.compose.ui.node.i0;
import androidx.compose.ui.node.j0;
import d0.J;
import d0.K;
import d0.L;
import kotlin.C13789G;
import kotlin.EnumC13827z;
import kotlin.InterfaceC13790H;
import kotlin.InterfaceC13808g;
import kotlin.InterfaceC13820s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BW\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u0018J]\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010)R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00106\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u0010\"R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00103R\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010)¨\u0006G"}, d2 = {"Landroidx/compose/foundation/n;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/i0;", "Lf0/H;", "state", "Lf0/z;", "orientation", "", "enabled", "reverseScrolling", "Lf0/s;", "flingBehavior", "Lh0/l;", "interactionSource", "Lf0/g;", "bringIntoViewSpec", "useLocalOverscrollFactory", "Ld0/J;", "userProvidedOverscrollEffect", "<init>", "(Lf0/H;Lf0/z;ZZLf0/s;Lh0/l;Lf0/g;ZLd0/J;)V", "", "T2", "()V", "U2", "()Ld0/J;", "t2", "u2", "o0", "overscrollEffect", "W2", "(Lf0/H;Lf0/z;ZLd0/J;ZZLf0/s;Lh0/l;Lf0/g;)V", "V2", "()Z", "B0", "q", "Lf0/H;", "r", "Lf0/z;", "s", "Z", "t", "u", "Lf0/s;", "v", "Lh0/l;", "w", "Lf0/g;", "x", "y", "Ld0/J;", "z", "o2", "shouldAutoInvalidate", "Landroidx/compose/foundation/gestures/i;", "A", "Landroidx/compose/foundation/gestures/i;", "scrollableNode", "Landroidx/compose/ui/node/j;", "B", "Landroidx/compose/ui/node/j;", "overscrollNode", "Ld0/K;", "C", "Ld0/K;", "localOverscrollFactory", "D", "localOverscrollFactoryCreatedOverscrollEffect", "E", "shouldReverseDirection", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class n extends AbstractC5817m implements InterfaceC5812h, i0 {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.foundation.gestures.i scrollableNode;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5814j overscrollNode;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private K localOverscrollFactory;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private J localOverscrollFactoryCreatedOverscrollEffect;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean shouldReverseDirection;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13790H state;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private EnumC13827z orientation;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean reverseScrolling;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13820s flingBehavior;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private h0.l interactionSource;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13808g bringIntoViewSpec;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean useLocalOverscrollFactory;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private J userProvidedOverscrollEffect;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            n nVar = n.this;
            nVar.localOverscrollFactory = (K) C5813i.a(nVar, L.a());
            n nVar2 = n.this;
            K k10 = nVar2.localOverscrollFactory;
            nVar2.localOverscrollFactoryCreatedOverscrollEffect = k10 != null ? k10.a() : null;
        }
    }

    private final void T2() {
        InterfaceC5814j interfaceC5814j = this.overscrollNode;
        if (interfaceC5814j != null) {
            if (interfaceC5814j == null || interfaceC5814j.getNode().getIsAttached()) {
                return;
            }
            K2(interfaceC5814j);
            return;
        }
        if (this.useLocalOverscrollFactory) {
            j0.a(this, new a());
        }
        J jU2 = U2();
        if (jU2 != null) {
            InterfaceC5814j interfaceC5814jA = jU2.getNode();
            if (interfaceC5814jA.getNode().getIsAttached()) {
                return;
            }
            this.overscrollNode = K2(interfaceC5814jA);
        }
    }

    public final J U2() {
        return this.useLocalOverscrollFactory ? this.localOverscrollFactoryCreatedOverscrollEffect : this.userProvidedOverscrollEffect;
    }

    public final boolean V2() {
        t tVarN = t.f12006a;
        if (getIsAttached()) {
            tVarN = C5815k.n(this);
        }
        return C13789G.f130137a.b(tVarN, this.orientation, this.reverseScrolling);
    }

    public final void W2(InterfaceC13790H state, EnumC13827z orientation, boolean useLocalOverscrollFactory, J overscrollEffect, boolean enabled, boolean reverseScrolling, InterfaceC13820s flingBehavior, h0.l interactionSource, InterfaceC13808g bringIntoViewSpec) {
        boolean z10;
        this.state = state;
        this.orientation = orientation;
        boolean z11 = true;
        if (this.useLocalOverscrollFactory != useLocalOverscrollFactory) {
            this.useLocalOverscrollFactory = useLocalOverscrollFactory;
            z10 = true;
        } else {
            z10 = false;
        }
        if (Intrinsics.e(this.userProvidedOverscrollEffect, overscrollEffect)) {
            z11 = false;
        } else {
            this.userProvidedOverscrollEffect = overscrollEffect;
        }
        if (z10 || (z11 && !useLocalOverscrollFactory)) {
            InterfaceC5814j interfaceC5814j = this.overscrollNode;
            if (interfaceC5814j != null) {
                N2(interfaceC5814j);
            }
            this.overscrollNode = null;
            T2();
        }
        this.enabled = enabled;
        this.reverseScrolling = reverseScrolling;
        this.flingBehavior = flingBehavior;
        this.interactionSource = interactionSource;
        this.bringIntoViewSpec = bringIntoViewSpec;
        this.shouldReverseDirection = V2();
        androidx.compose.foundation.gestures.i iVar = this.scrollableNode;
        if (iVar != null) {
            iVar.u3(state, orientation, U2(), enabled, this.shouldReverseDirection, flingBehavior, interactionSource, bringIntoViewSpec);
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        InterfaceC5814j interfaceC5814j = this.overscrollNode;
        if (interfaceC5814j != null) {
            N2(interfaceC5814j);
        }
    }

    public n(InterfaceC13790H interfaceC13790H, EnumC13827z enumC13827z, boolean z10, boolean z11, InterfaceC13820s interfaceC13820s, h0.l lVar, InterfaceC13808g interfaceC13808g, boolean z12, J j10) {
        this.state = interfaceC13790H;
        this.orientation = enumC13827z;
        this.enabled = z10;
        this.reverseScrolling = z11;
        this.flingBehavior = interfaceC13820s;
        this.interactionSource = lVar;
        this.bringIntoViewSpec = interfaceC13808g;
        this.useLocalOverscrollFactory = z12;
        this.userProvidedOverscrollEffect = j10;
    }

    @Override // androidx.compose.ui.node.i0
    public void B0() {
        K k10 = (K) C5813i.a(this, L.a());
        if (!Intrinsics.e(k10, this.localOverscrollFactory)) {
            this.localOverscrollFactory = k10;
            this.localOverscrollFactoryCreatedOverscrollEffect = null;
            InterfaceC5814j interfaceC5814j = this.overscrollNode;
            if (interfaceC5814j != null) {
                N2(interfaceC5814j);
            }
            this.overscrollNode = null;
            T2();
            androidx.compose.foundation.gestures.i iVar = this.scrollableNode;
            if (iVar != null) {
                iVar.u3(this.state, this.orientation, U2(), this.enabled, this.shouldReverseDirection, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
            }
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC5814j
    public void o0() {
        boolean zV2 = V2();
        if (this.shouldReverseDirection != zV2) {
            this.shouldReverseDirection = zV2;
            W2(this.state, this.orientation, this.useLocalOverscrollFactory, U2(), this.enabled, this.reverseScrolling, this.flingBehavior, this.interactionSource, this.bringIntoViewSpec);
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        this.shouldReverseDirection = V2();
        T2();
        if (this.scrollableNode == null) {
            this.scrollableNode = (androidx.compose.foundation.gestures.i) K2(new androidx.compose.foundation.gestures.i(this.state, U2(), this.flingBehavior, this.orientation, this.enabled, this.shouldReverseDirection, this.interactionSource, this.bringIntoViewSpec));
        }
    }
}
