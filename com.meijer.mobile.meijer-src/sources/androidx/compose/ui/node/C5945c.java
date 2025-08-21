package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.InterfaceC5907h;
import androidx.compose.ui.focus.InterfaceC5908i;
import androidx.compose.ui.layout.InterfaceC5933s;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifier;
import g1.C14314q;
import g1.EnumC14315s;
import j1.C14920a;
import java.util.HashSet;
import k1.C15078a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u001b\u0010\u001d\u001a\u00020\u00142\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\"\u0010\u0016J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0016J&\u0010*\u001a\u00020)*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u00100\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J#\u00103\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00101J#\u00104\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b4\u00101J#\u00105\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b5\u00101J\u0013\u00107\u001a\u00020\u0014*\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\u00020\u0014*\u000209H\u0016¢\u0006\u0004\b:\u0010;J*\u0010B\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0014H\u0016¢\u0006\u0004\bD\u0010\u0016J\u000f\u0010E\u001a\u00020\u0014H\u0016¢\u0006\u0004\bE\u0010\u0016J\u000f\u0010F\u001a\u00020\u0017H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0017H\u0016¢\u0006\u0004\bH\u0010GJ\u001f\u0010L\u001a\u0004\u0018\u00010J*\u00020I2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00142\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u001a\u0010S\u001a\u00020\u00142\u0006\u0010R\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00142\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bU\u0010QJ\u0017\u0010X\u001a\u00020\u00142\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u00142\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b_\u0010`R*\u0010\u0011\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010\u0013R\u0016\u0010i\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR:\u0010v\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030o0nj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030o`p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0018\u0010x\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010wR\u0014\u0010{\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u001d\u0010R\u001a\u00030\u0080\u00018VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R'\u0010\u0089\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0087\u0001*\b\u0012\u0004\u0012\u00028\u00000o8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bk\u0010\u0088\u0001R\u0016\u0010\u008b\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008c\u0001"}, d2 = {"Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/node/u0;", "Landroidx/compose/ui/node/q0;", "Lk1/h;", "Lk1/k;", "Landroidx/compose/ui/node/n0;", "Landroidx/compose/ui/node/C;", "Landroidx/compose/ui/node/v;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/focus/w;", "Landroidx/compose/ui/focus/B;", "Landroidx/compose/ui/node/OwnerScope;", "LT0/b;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/Modifier$b;", "element", "<init>", "(Landroidx/compose/ui/Modifier$b;)V", "", "Q2", "()V", "", "duringAttach", "N2", "(Z)V", "R2", "Lk1/j;", "T2", "(Lk1/j;)V", "t2", "u2", "z1", "O2", "S2", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "J", "(Landroidx/compose/ui/layout/s;Landroidx/compose/ui/layout/r;I)I", "width", "F", "N", "r", "LX0/c;", "I", "(LX0/c;)V", "Lr1/u;", "T1", "(Lr1/u;)V", "Lg1/q;", "pointerEvent", "Lg1/s;", "pass", "LH1/r;", "bounds", "s1", "(Lg1/q;Lg1/s;J)V", "M", "v1", "R1", "()Z", "n0", "LH1/d;", "", "parentData", "R", "(LH1/d;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "O", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "size", "f", "(J)V", "s", "Landroidx/compose/ui/focus/E;", "focusState", "U", "(Landroidx/compose/ui/focus/E;)V", "Landroidx/compose/ui/focus/u;", "focusProperties", "j1", "(Landroidx/compose/ui/focus/u;)V", "", "toString", "()Ljava/lang/String;", "value", "o", "Landroidx/compose/ui/Modifier$b;", "L2", "()Landroidx/compose/ui/Modifier$b;", "P2", "p", "Z", "invalidateCache", "Lk1/a;", "q", "Lk1/a;", "_providedValues", "Ljava/util/HashSet;", "Lk1/c;", "Lkotlin/collections/HashSet;", "Ljava/util/HashSet;", "M2", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "readValues", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lastOnPlacedCoordinates", "getDensity", "()LH1/d;", "density", "LH1/t;", "getLayoutDirection", "()LH1/t;", "layoutDirection", "LU0/k;", "b", "()J", "Lk1/g;", "t0", "()Lk1/g;", "providedValues", "T", "(Lk1/c;)Ljava/lang/Object;", "current", "e1", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5945c extends Modifier.c implements D, InterfaceC5965t, u0, q0, k1.h, k1.k, n0, C, InterfaceC5967v, InterfaceC5908i, androidx.compose.ui.focus.w, androidx.compose.ui.focus.B, OwnerScope, T0.b {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Modifier.b element;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean invalidateCache;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private C15078a _providedValues;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private HashSet<k1.c<?>> readValues;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private LayoutCoordinates lastOnPlacedCoordinates;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.c$a */
    static final class a extends Lambda implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C5945c.this.S2();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/node/c$b", "Landroidx/compose/ui/node/Owner$b;", "", "j", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.node.c$b */
    public static final class b implements Owner.b {
        b() {
        }

        @Override // androidx.compose.ui.node.Owner.b
        public void j() {
            if (C5945c.this.lastOnPlacedCoordinates == null) {
                C5945c c5945c = C5945c.this;
                c5945c.s(C5957k.j(c5945c, C5952f0.a(128)));
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.c$c, reason: collision with other inner class name */
    static final class C1068c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier.b f51711f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C5945c f51712g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1068c(Modifier.b bVar, C5945c c5945c) {
            super(0);
            this.f51711f = bVar;
            this.f51712g = c5945c;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((T0.g) this.f51711f).h(this.f51712g);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.c$d */
    static final class d extends Lambda implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Modifier.b element = C5945c.this.getElement();
            Intrinsics.h(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((k1.d) element).m(C5945c.this);
        }
    }

    public final void O2() {
        this.invalidateCache = true;
        C5966u.a(this);
    }

    @Override // androidx.compose.ui.Modifier.c
    public void t2() {
        N2(true);
    }

    @Override // androidx.compose.ui.node.InterfaceC5965t
    public void z1() {
        this.invalidateCache = true;
        C5966u.a(this);
    }

    private final void R2() {
        Modifier.b bVar = this.element;
        if (bVar instanceof T0.g) {
            C5957k.p(this).getSnapshotObserver().observeReads$ui_release(this, C5947d.f51729b, new C1068c(bVar, this));
        }
        this.invalidateCache = false;
    }

    private final void T2(k1.j<?> element) {
        C15078a c15078a = this._providedValues;
        if (c15078a != null && c15078a.a(element.getKey())) {
            c15078a.c(element);
            C5957k.p(this).getModifierLocalManager().f(this, element.getKey());
        } else {
            this._providedValues = new C15078a(element);
            if (C5947d.e(this)) {
                C5957k.p(this).getModifierLocalManager().a(this, element.getKey());
            }
        }
    }

    @Override // androidx.compose.ui.node.D
    public int F(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.B) bVar).F(interfaceC5933s, rVar, i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC5965t
    public void I(X0.c cVar) {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        T0.h hVar = (T0.h) bVar;
        if (this.invalidateCache && (bVar instanceof T0.g)) {
            R2();
        }
        hVar.I(cVar);
    }

    @Override // androidx.compose.ui.node.D
    public int J(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.B) bVar).J(interfaceC5933s, rVar, i10);
    }

    /* renamed from: L2, reason: from getter */
    public final Modifier.b getElement() {
        return this.element;
    }

    @Override // androidx.compose.ui.node.InterfaceC5956j, androidx.compose.ui.node.q0
    public void M() {
        if (this.element instanceof g1.I) {
            v1();
        }
    }

    public final HashSet<k1.c<?>> M2() {
        return this.readValues;
    }

    @Override // androidx.compose.ui.node.D
    public int N(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.B) bVar).N(interfaceC5933s, rVar, i10);
    }

    @Override // androidx.compose.ui.node.InterfaceC5967v
    public void O(LayoutCoordinates coordinates) {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((androidx.compose.ui.layout.S) bVar).O(coordinates);
    }

    @Override // androidx.compose.ui.node.n0
    public Object R(H1.d dVar, Object obj) {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((androidx.compose.ui.layout.c0) bVar).R(dVar, obj);
    }

    @Override // androidx.compose.ui.node.q0
    public boolean R1() {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((g1.I) bVar).getPointerInputFilter().c();
    }

    @Override // androidx.compose.ui.node.u0
    public void T1(r1.u uVar) {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        SemanticsConfiguration semanticsConfiguration = ((SemanticsModifier) bVar).getSemanticsConfiguration();
        Intrinsics.h(uVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((SemanticsConfiguration) uVar).f(semanticsConfiguration);
    }

    @Override // androidx.compose.ui.focus.InterfaceC5908i
    public void U(androidx.compose.ui.focus.E focusState) {
        Modifier.b bVar = this.element;
        if (!(bVar instanceof InterfaceC5907h)) {
            C14920a.b("onFocusEvent called on wrong node");
        }
        ((InterfaceC5907h) bVar).U(focusState);
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.B) bVar).a(k10, i10, j10);
    }

    @Override // T0.b
    public long b() {
        return H1.s.d(C5957k.j(this, C5952f0.a(128)).c());
    }

    @Override // androidx.compose.ui.node.C
    public void f(long size) {
        Modifier.b bVar = this.element;
        if (bVar instanceof androidx.compose.ui.layout.Y) {
            ((androidx.compose.ui.layout.Y) bVar).f(size);
        }
    }

    @Override // androidx.compose.ui.focus.w
    public void j1(androidx.compose.ui.focus.u focusProperties) {
        Modifier.b bVar = this.element;
        if (!(bVar instanceof androidx.compose.ui.focus.r)) {
            C14920a.b("applyFocusProperties called on wrong node");
        }
        ((androidx.compose.ui.focus.r) bVar).u(new androidx.compose.ui.focus.q(focusProperties));
    }

    @Override // androidx.compose.ui.node.q0
    public boolean n0() {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((g1.I) bVar).getPointerInputFilter().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [D0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [D0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // k1.h, k1.k
    public <T> T q(k1.c<T> cVar) {
        C5946c0 nodes;
        this.readValues.add(cVar);
        int iA = C5952f0.a(32);
        if (!getNode().getIsAttached()) {
            C14920a.b("visitAncestors called on an unattached node");
        }
        Modifier.c parent = getNode().getParent();
        LayoutNode layoutNodeO = C5957k.o(this);
        while (layoutNodeO != null) {
            if ((layoutNodeO.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        AbstractC5959m abstractC5959mH = parent;
                        ?? cVar2 = 0;
                        while (abstractC5959mH != 0) {
                            if (abstractC5959mH instanceof k1.h) {
                                k1.h hVar = (k1.h) abstractC5959mH;
                                if (hVar.t0().a(cVar)) {
                                    return (T) hVar.t0().b(cVar);
                                }
                            } else if ((abstractC5959mH.getKindSet() & iA) != 0 && (abstractC5959mH instanceof AbstractC5959m)) {
                                Modifier.c delegate = abstractC5959mH.getDelegate();
                                int i10 = 0;
                                abstractC5959mH = abstractC5959mH;
                                cVar2 = cVar2;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        cVar2 = cVar2;
                                        if (i10 == 1) {
                                            abstractC5959mH = delegate;
                                        } else {
                                            if (cVar2 == 0) {
                                                cVar2 = new D0.c(new Modifier.c[16], 0);
                                            }
                                            if (abstractC5959mH != 0) {
                                                cVar2.c(abstractC5959mH);
                                                abstractC5959mH = 0;
                                            }
                                            cVar2.c(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    abstractC5959mH = abstractC5959mH;
                                    cVar2 = cVar2;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC5959mH = C5957k.h(cVar2);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeO = layoutNodeO.getParent$ui_release();
            parent = (layoutNodeO == null || (nodes = layoutNodeO.getNodes()) == null) ? null : nodes.getTail();
        }
        return cVar.a().invoke();
    }

    @Override // androidx.compose.ui.node.D
    public int r(InterfaceC5933s interfaceC5933s, androidx.compose.ui.layout.r rVar, int i10) {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.B) bVar).r(interfaceC5933s, rVar, i10);
    }

    @Override // androidx.compose.ui.node.C
    public void s(LayoutCoordinates coordinates) {
        this.lastOnPlacedCoordinates = coordinates;
        Modifier.b bVar = this.element;
        if (bVar instanceof androidx.compose.ui.layout.V) {
            ((androidx.compose.ui.layout.V) bVar).s(coordinates);
        }
    }

    @Override // androidx.compose.ui.node.q0
    public void s1(C14314q pointerEvent, EnumC14315s pass, long bounds) {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((g1.I) bVar).getPointerInputFilter().e(pointerEvent, pass, bounds);
    }

    @Override // k1.h
    public k1.g t0() {
        C15078a c15078a = this._providedValues;
        return c15078a != null ? c15078a : k1.i.a();
    }

    public String toString() {
        return this.element.toString();
    }

    @Override // androidx.compose.ui.node.q0
    public void v1() {
        Modifier.b bVar = this.element;
        Intrinsics.h(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((g1.I) bVar).getPointerInputFilter().d();
    }

    public C5945c(Modifier.b bVar) {
        E2(g0.f(bVar));
        this.element = bVar;
        this.invalidateCache = true;
        this.readValues = new HashSet<>();
    }

    private final void N2(boolean duringAttach) {
        if (!getIsAttached()) {
            C14920a.b("initializeModifier called on unattached node");
        }
        Modifier.b bVar = this.element;
        if ((C5952f0.a(32) & getKindSet()) != 0) {
            if (bVar instanceof k1.d) {
                I2(new a());
            }
            if (bVar instanceof k1.j) {
                T2((k1.j) bVar);
            }
        }
        if ((C5952f0.a(4) & getKindSet()) != 0) {
            if (bVar instanceof T0.g) {
                this.invalidateCache = true;
            }
            if (!duringAttach) {
                G.a(this);
            }
        }
        if ((C5952f0.a(2) & getKindSet()) != 0) {
            if (C5947d.e(this)) {
                NodeCoordinator coordinator = getCoordinator();
                Intrinsics.g(coordinator);
                ((E) coordinator).R3(this);
                coordinator.f3();
            }
            if (!duringAttach) {
                G.a(this);
                C5957k.o(this).B0();
            }
        }
        if (bVar instanceof androidx.compose.ui.layout.i0) {
            ((androidx.compose.ui.layout.i0) bVar).o(C5957k.o(this));
        }
        if ((C5952f0.a(128) & getKindSet()) != 0) {
            if ((bVar instanceof androidx.compose.ui.layout.Y) && C5947d.e(this)) {
                C5957k.o(this).B0();
            }
            if (bVar instanceof androidx.compose.ui.layout.V) {
                this.lastOnPlacedCoordinates = null;
                if (C5947d.e(this)) {
                    C5957k.p(this).t(new b());
                }
            }
        }
        if ((C5952f0.a(256) & getKindSet()) != 0 && (bVar instanceof androidx.compose.ui.layout.S) && C5947d.e(this)) {
            C5957k.o(this).B0();
        }
        if (bVar instanceof androidx.compose.ui.focus.z) {
            ((androidx.compose.ui.focus.z) bVar).j().e().c(this);
        }
        if ((C5952f0.a(16) & getKindSet()) != 0 && (bVar instanceof g1.I)) {
            ((g1.I) bVar).getPointerInputFilter().f(getCoordinator());
        }
        if ((C5952f0.a(8) & getKindSet()) != 0) {
            C5957k.p(this).E();
        }
    }

    private final void Q2() {
        if (!getIsAttached()) {
            C14920a.b("unInitializeModifier called on unattached node");
        }
        Modifier.b bVar = this.element;
        if ((C5952f0.a(32) & getKindSet()) != 0) {
            if (bVar instanceof k1.j) {
                C5957k.p(this).getModifierLocalManager().d(this, ((k1.j) bVar).getKey());
            }
            if (bVar instanceof k1.d) {
                ((k1.d) bVar).m(C5947d.f51728a);
            }
        }
        if ((C5952f0.a(8) & getKindSet()) != 0) {
            C5957k.p(this).E();
        }
        if (bVar instanceof androidx.compose.ui.focus.z) {
            ((androidx.compose.ui.focus.z) bVar).j().e().s(this);
        }
    }

    public final void P2(Modifier.b bVar) {
        if (getIsAttached()) {
            Q2();
        }
        this.element = bVar;
        E2(g0.f(bVar));
        if (getIsAttached()) {
            N2(false);
        }
    }

    public final void S2() {
        if (getIsAttached()) {
            this.readValues.clear();
            C5957k.p(this).getSnapshotObserver().observeReads$ui_release(this, C5947d.f51730c, new d());
        }
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean e1() {
        return getIsAttached();
    }

    @Override // T0.b
    public H1.d getDensity() {
        return C5957k.o(this).getDensity();
    }

    @Override // T0.b
    public H1.t getLayoutDirection() {
        return C5957k.o(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.Modifier.c
    public void u2() {
        Q2();
    }
}
