package kotlin;

import B0.RippleAlpha;
import V0.C5346q0;
import V0.InterfaceC5359x0;
import androidx.compose.ui.node.AbstractC5817m;
import androidx.compose.ui.node.C5813i;
import androidx.compose.ui.node.InterfaceC5812h;
import androidx.compose.ui.node.InterfaceC5814j;
import androidx.compose.ui.node.i0;
import androidx.compose.ui.node.j0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Lx0/Y;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/node/h;", "Landroidx/compose/ui/node/i0;", "Lh0/j;", "interactionSource", "", "bounded", "LH1/h;", "radius", "LV0/x0;", "color", "<init>", "(Lh0/j;ZFLV0/x0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "W2", "()V", "U2", "V2", "t2", "B0", "q", "Lh0/j;", "r", "Z", "s", "F", "t", "LV0/x0;", "Landroidx/compose/ui/node/j;", "u", "Landroidx/compose/ui/node/j;", "rippleNode", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17915Y extends AbstractC5817m implements InterfaceC5812h, i0 {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final h0.j interactionSource;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5359x0 color;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5814j rippleNode;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LV0/q0;", "a", "()J"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.Y$a */
    static final class a implements InterfaceC5359x0 {
        a() {
        }

        @Override // V0.InterfaceC5359x0
        public final long a() {
            long jA = C17915Y.this.color.a();
            if (jA != 16) {
                return jA;
            }
            RippleConfiguration rippleConfiguration = (RippleConfiguration) C5813i.a(C17915Y.this, C17916Y0.d());
            return (rippleConfiguration == null || rippleConfiguration.getColor() == 16) ? C17914X0.f167532a.b(((C5346q0) C5813i.a(C17915Y.this, C17894N.a())).getValue(), ((Colors) C5813i.a(C17915Y.this, C17876E.e())).o()) : rippleConfiguration.getColor();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LB0/b;", "c", "()LB0/b;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.Y$b */
    static final class b extends Lambda implements Function0<RippleAlpha> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final RippleAlpha invoke() {
            RippleAlpha rippleAlpha;
            RippleConfiguration rippleConfiguration = (RippleConfiguration) C5813i.a(C17915Y.this, C17916Y0.d());
            return (rippleConfiguration == null || (rippleAlpha = rippleConfiguration.getRippleAlpha()) == null) ? C17914X0.f167532a.a(((C5346q0) C5813i.a(C17915Y.this, C17894N.a())).getValue(), ((Colors) C5813i.a(C17915Y.this, C17876E.e())).o()) : rippleAlpha;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.Y$c */
    static final class c extends Lambda implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        c() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (((RippleConfiguration) C5813i.a(C17915Y.this, C17916Y0.d())) == null) {
                C17915Y.this.V2();
            } else if (C17915Y.this.rippleNode == null) {
                C17915Y.this.U2();
            }
        }
    }

    public /* synthetic */ C17915Y(h0.j jVar, boolean z10, float f10, InterfaceC5359x0 interfaceC5359x0, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z10, f10, interfaceC5359x0);
    }

    private C17915Y(h0.j jVar, boolean z10, float f10, InterfaceC5359x0 interfaceC5359x0) {
        this.interactionSource = jVar;
        this.bounded = z10;
        this.radius = f10;
        this.color = interfaceC5359x0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U2() {
        this.rippleNode = K2(B0.f.c(this.interactionSource, this.bounded, this.radius, new a(), new b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V2() {
        InterfaceC5814j interfaceC5814j = this.rippleNode;
        if (interfaceC5814j != null) {
            N2(interfaceC5814j);
        }
        this.rippleNode = null;
    }

    private final void W2() {
        j0.a(this, new c());
    }

    @Override // androidx.compose.ui.node.i0
    public void B0() {
        W2();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        W2();
    }
}
