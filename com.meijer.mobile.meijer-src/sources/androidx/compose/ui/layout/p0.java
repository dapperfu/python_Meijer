package androidx.compose.ui.layout;

import androidx.compose.runtime.AbstractC5869k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0014\u001a8\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a@\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/r0;", "LH1/b;", "Landroidx/compose/ui/layout/J;", "Lkotlin/ExtensionFunctionType;", "measurePolicy", "", "a", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/layout/q0;", "state", "b", "(Landroidx/compose/ui/layout/q0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "maxSlotsToRetainForReuse", "Landroidx/compose/ui/layout/s0;", "c", "(I)Landroidx/compose/ui/layout/s0;", "androidx/compose/ui/layout/p0$a", "Landroidx/compose/ui/layout/p0$a;", "ReusedSlotId", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f51346a = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/layout/p0$a", "", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public String toString() {
            return "ReusedSlotId";
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f51347f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<r0, H1.b, J> f51348g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f51349h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f51350i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, Function2<? super r0, ? super H1.b, ? extends J> function2, int i10, int i11) {
            super(2);
            this.f51347f = modifier;
            this.f51348g = function2;
            this.f51349h = i10;
            this.f51350i = i11;
        }

        public final void a(Composer composer, int i10) {
            p0.a(this.f51347f, this.f51348g, composer, J0.a(this.f51349h | 1), this.f51350i);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q0 f51351f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(q0 q0Var) {
            super(0);
            this.f51351f = q0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f51351f.d();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ q0 f51352f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f51353g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<r0, H1.b, J> f51354h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f51355i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f51356j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(q0 q0Var, Modifier modifier, Function2<? super r0, ? super H1.b, ? extends J> function2, int i10, int i11) {
            super(2);
            this.f51352f = q0Var;
            this.f51353g = modifier;
            this.f51354h = function2;
            this.f51355i = i10;
            this.f51356j = i11;
        }

        public final void a(Composer composer, int i10) {
            p0.b(this.f51352f, this.f51353g, this.f51354h, composer, J0.a(this.f51355i | 1), this.f51356j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final s0 c(int i10) {
        return new C5929n(i10);
    }

    public static final void a(Modifier modifier, Function2<? super r0, ? super H1.b, ? extends J> function2, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        boolean z10;
        Function2<? super r0, ? super H1.b, ? extends J> function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1298353104);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i12 & 1)) {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-1298353104, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:82)");
            }
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new q0();
                composerStartRestartGroup.t(objB);
            }
            function22 = function2;
            b((q0) objB, modifier2, function22, composerStartRestartGroup, (i12 << 3) & 1008, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier = modifier2;
        } else {
            function22 = function2;
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(modifier, function22, i10, i11));
        }
    }

    public static final void b(q0 q0Var, Modifier modifier, Function2<? super r0, ? super H1.b, ? extends J> function2, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-511989831);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(q0Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i12 & 1)) {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-511989831, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:115)");
            }
            int iA = C5859f.a(composerStartRestartGroup, 0);
            AbstractC5869k abstractC5869kD = C5859f.d(composerStartRestartGroup, 0);
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Function0<LayoutNode> function0A = LayoutNode.INSTANCE.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, q0Var, q0Var.g());
            D1.c(composerA, abstractC5869kD, q0Var.e());
            D1.c(composerA, function2, q0Var.f());
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            D1.c(composerA, interfaceC5884sR, companion.g());
            D1.c(composerA, modifierE, companion.f());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            composerStartRestartGroup.v();
            if (!composerStartRestartGroup.j()) {
                composerStartRestartGroup.startReplaceGroup(-26326018);
                boolean zD = composerStartRestartGroup.D(q0Var);
                Object objB = composerStartRestartGroup.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new c(q0Var);
                    composerStartRestartGroup.t(objB);
                }
                androidx.compose.runtime.J.i((Function0) objB, composerStartRestartGroup, 0);
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(-26267397);
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new d(q0Var, modifier2, function2, i10, i11));
        }
    }
}
