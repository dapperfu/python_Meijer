package androidx.compose.foundation.layout;

import P0.e;
import Z.W;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5811g;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0018\u001a\u00020\u0017*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\" \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001e\" \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u001a\u0010'\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010&\"\u001a\u0010+\u001a\u0004\u0018\u00010(*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0018\u0010.\u001a\u00020\u0000*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"", "propagate", "LZ/W;", "LP0/e;", "Landroidx/compose/ui/layout/MeasurePolicy;", "d", "(Z)LZ/W;", "alignment", "propagateMinConstraints", "g", "(LP0/e;Z)Landroidx/compose/ui/layout/MeasurePolicy;", "i", "(LP0/e;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/f0$a;", "Landroidx/compose/ui/layout/f0;", "placeable", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/t;", "layoutDirection", "", "boxWidth", "boxHeight", "", "h", "(Landroidx/compose/ui/layout/f0$a;Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/I;LH1/t;IILP0/e;)V", "Landroidx/compose/ui/Modifier;", "modifier", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "LZ/W;", "Cache1", "b", "Cache2", "c", "Landroidx/compose/ui/layout/MeasurePolicy;", "DefaultBoxMeasurePolicy", "getEmptyBoxMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "EmptyBoxMeasurePolicy", "Landroidx/compose/foundation/layout/g;", "e", "(Landroidx/compose/ui/layout/I;)Landroidx/compose/foundation/layout/g;", "boxChildDataNode", "f", "(Landroidx/compose/ui/layout/I;)Z", "matchesParentSize", "foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5662h {

    /* renamed from: a, reason: collision with root package name */
    private static final W<P0.e, MeasurePolicy> f48589a = d(true);

    /* renamed from: b, reason: collision with root package name */
    private static final W<P0.e, MeasurePolicy> f48590b = d(false);

    /* renamed from: c, reason: collision with root package name */
    private static final MeasurePolicy f48591c = new C5663i(P0.e.INSTANCE.o(), false);

    /* renamed from: d, reason: collision with root package name */
    private static final MeasurePolicy f48592d = b.f48595a;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.h$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f48593f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f48594g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier modifier, int i10) {
            super(2);
            this.f48593f = modifier;
            this.f48594g = i10;
        }

        public final void a(Composer composer, int i10) {
            C5662h.a(this.f48593f, composer, J0.a(this.f48594g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "<anonymous parameter 0>", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.h$b */
    static final class b implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final b f48595a = new b();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.layout.h$b$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f48596f = new a();

            a() {
                super(1);
            }

            public final void a(f0.a aVar) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        b() {
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, List<? extends androidx.compose.ui.layout.I> list, long j10) {
            return androidx.compose.ui.layout.K.G0(k10, H1.b.n(j10), H1.b.m(j10), null, a.f48596f, 4, null);
        }
    }

    private static final W<P0.e, MeasurePolicy> d(boolean z10) {
        W<P0.e, MeasurePolicy> w10 = new W<>(9);
        e.Companion companion = P0.e.INSTANCE;
        w10.x(companion.o(), new C5663i(companion.o(), z10));
        w10.x(companion.m(), new C5663i(companion.m(), z10));
        w10.x(companion.n(), new C5663i(companion.n(), z10));
        w10.x(companion.h(), new C5663i(companion.h(), z10));
        w10.x(companion.e(), new C5663i(companion.e(), z10));
        w10.x(companion.f(), new C5663i(companion.f(), z10));
        w10.x(companion.d(), new C5663i(companion.d(), z10));
        w10.x(companion.b(), new C5663i(companion.b(), z10));
        w10.x(companion.c(), new C5663i(companion.c(), z10));
        return w10;
    }

    @PublishedApi
    public static final MeasurePolicy g(P0.e eVar, boolean z10) {
        MeasurePolicy measurePolicyE = (z10 ? f48589a : f48590b).e(eVar);
        return measurePolicyE == null ? new C5663i(eVar, z10) : measurePolicyE;
    }

    public static final void a(Modifier modifier, Composer composer, int i10) {
        int i11;
        boolean z10;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-211209833);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-211209833, i11, -1, "androidx.compose.foundation.layout.Box (Box.kt:232)");
            }
            MeasurePolicy measurePolicy = f48592d;
            int iA = C5717f.a(composerStartRestartGroup, 0);
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicy, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            D1.c(composerA, modifierE, companion.f());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new a(modifier, i10));
        }
    }

    private static final C5661g e(androidx.compose.ui.layout.I i10) {
        Object objA = i10.getParentData();
        if (objA instanceof C5661g) {
            return (C5661g) objA;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(androidx.compose.ui.layout.I i10) {
        C5661g c5661gE = e(i10);
        if (c5661gE != null) {
            return c5661gE.getMatchParentSize();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(f0.a aVar, f0 f0Var, androidx.compose.ui.layout.I i10, H1.t tVar, int i11, int i12, P0.e eVar) {
        P0.e eVar2;
        P0.e alignment;
        C5661g c5661gE = e(i10);
        if (c5661gE != null && (alignment = c5661gE.getAlignment()) != null) {
            eVar2 = alignment;
        } else {
            eVar2 = eVar;
        }
        f0.a.j(aVar, f0Var, eVar2.a(H1.r.c((f0Var.getWidth() << 32) | (f0Var.getHeight() & 4294967295L)), H1.r.c((i12 & 4294967295L) | (i11 << 32)), tVar), 0.0f, 2, null);
    }

    @PublishedApi
    public static final MeasurePolicy i(P0.e eVar, boolean z10, Composer composer, int i10) {
        boolean z11;
        MeasurePolicy measurePolicy;
        if (ComposerKt.M()) {
            ComposerKt.U(56522820, i10, -1, "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:109)");
        }
        if (Intrinsics.e(eVar, P0.e.INSTANCE.o()) && !z10) {
            composer.startReplaceGroup(-1709785313);
            composer.P();
            measurePolicy = f48591c;
        } else {
            composer.startReplaceGroup(-1709737635);
            boolean z12 = false;
            if ((((i10 & 14) ^ 6) > 4 && composer.V(eVar)) || (i10 & 6) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((((i10 & 112) ^ 48) > 32 && composer.a(z10)) || (i10 & 48) == 32) {
                z12 = true;
            }
            boolean z13 = z11 | z12;
            Object objB = composer.B();
            if (z13 || objB == Composer.INSTANCE.a()) {
                objB = new C5663i(eVar, z10);
                composer.t(objB);
            }
            measurePolicy = (C5663i) objB;
            composer.P();
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return measurePolicy;
    }
}
