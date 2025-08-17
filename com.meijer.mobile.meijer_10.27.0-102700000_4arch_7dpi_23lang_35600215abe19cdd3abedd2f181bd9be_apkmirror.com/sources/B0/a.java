package B0;

import V0.InterfaceC5359x0;
import android.view.View;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.node.C5813i;
import androidx.compose.ui.node.C5824u;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import h0.j;
import h0.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010-\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\"\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"LB0/a;", "LB0/g;", "LB0/d;", "Lh0/j;", "interactionSource", "", "bounded", "LH1/h;", "radius", "LV0/x0;", "color", "Lkotlin/Function0;", "LB0/b;", "rippleAlpha", "<init>", "(Lh0/j;ZFLV0/x0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/material/ripple/RippleContainer;", "Z2", "()Landroidx/compose/material/ripple/RippleContainer;", "LX0/f;", "", "Q2", "(LX0/f;)V", "Lh0/n$b;", "interaction", "LU0/k;", "size", "", "targetRadius", "P2", "(Lh0/n$b;JF)V", "X2", "(Lh0/n$b;)V", "u2", "()V", "x1", "z", "Landroidx/compose/material/ripple/RippleContainer;", "rippleContainer", "Landroidx/compose/material/ripple/RippleHostView;", "value", "A", "Landroidx/compose/material/ripple/RippleHostView;", "a3", "(Landroidx/compose/material/ripple/RippleHostView;)V", "rippleHostView", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a extends g implements d {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private RippleHostView rippleHostView;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private RippleContainer rippleContainer;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: B0.a$a, reason: collision with other inner class name */
    static final class C0028a extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        C0028a() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C5824u.a(a.this);
        }
    }

    public /* synthetic */ a(j jVar, boolean z10, float f10, InterfaceC5359x0 interfaceC5359x0, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z10, f10, interfaceC5359x0, function0);
    }

    @Override // B0.d
    public void x1() {
        a3(null);
    }

    private a(j jVar, boolean z10, float f10, InterfaceC5359x0 interfaceC5359x0, Function0<RippleAlpha> function0) {
        super(jVar, z10, f10, interfaceC5359x0, function0, null);
    }

    private final RippleContainer Z2() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            Intrinsics.g(rippleContainer);
            return rippleContainer;
        }
        RippleContainer rippleContainerC = h.c(h.e((View) C5813i.a(this, AndroidCompositionLocals_androidKt.k())));
        this.rippleContainer = rippleContainerC;
        Intrinsics.g(rippleContainerC);
        return rippleContainerC;
    }

    private final void a3(RippleHostView rippleHostView) {
        this.rippleHostView = rippleHostView;
        C5824u.a(this);
    }

    @Override // B0.g
    public void X2(n.b interaction) {
        RippleHostView rippleHostView = this.rippleHostView;
        if (rippleHostView != null) {
            rippleHostView.e();
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        RippleContainer rippleContainer = this.rippleContainer;
        if (rippleContainer != null) {
            rippleContainer.a(this);
        }
    }

    @Override // B0.g
    public void P2(n.b interaction, long size, float targetRadius) {
        RippleHostView rippleHostViewB = Z2().b(this);
        rippleHostViewB.b(interaction, getBounded(), size, MathKt.d(targetRadius), T2(), S2().invoke().getPressedAlpha(), new C0028a());
        a3(rippleHostViewB);
    }

    @Override // B0.g
    public void Q2(X0.f fVar) {
        Canvas canvasG = fVar.getDrawContext().g();
        RippleHostView rippleHostView = this.rippleHostView;
        if (rippleHostView != null) {
            rippleHostView.f(getRippleSize(), MathKt.d(getTargetRadius()), T2(), S2().invoke().getPressedAlpha());
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvasG));
        }
    }
}
