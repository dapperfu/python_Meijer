package kotlin;

import H1.t;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5937w;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import androidx.recyclerview.widget.RecyclerView;
import j0.InterfaceC14882C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0083\u0001\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aB\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aZ\u0010&\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a{\u00103\u001a\u00020\u0003*\u00020(2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010+2\b\u0010/\u001a\u0004\u0018\u00010+2\b\u00100\u001a\u0004\u0018\u00010+2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u00104\u001aa\u00106\u001a\u00020\u0003*\u00020(2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u00105\u001a\u00020+2\b\u0010.\u001a\u0004\u0018\u00010+2\b\u0010/\u001a\u0004\u0018\u00010+2\b\u00100\u001a\u0004\u0018\u00010+2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u00107\"\u001a\u0010<\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;\"\u001a\u0010?\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010;\"\u001a\u0010B\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010;\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006C"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "textField", "label", "Lkotlin/Function1;", "placeholder", "leading", "trailing", "", "singleLine", "", "animationProgress", "Lj0/C;", "paddingValues", "a", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLj0/C;Landroidx/compose/runtime/Composer;I)V", "", "from", "l", "(II)I", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "LH1/b;", "constraints", "h", "(IIIIIJ)I", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "density", "g", "(IZIIIIJFLj0/C;)I", "Landroidx/compose/ui/layout/f0$a;", "width", "height", "Landroidx/compose/ui/layout/f0;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "labelEndPosition", "textPosition", "j", "(Landroidx/compose/ui/layout/f0$a;IILandroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;ZIIFF)V", "textPlaceable", "k", "(Landroidx/compose/ui/layout/f0$a;IILandroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/f0;ZFLj0/C;)V", "LH1/h;", "F", "getFirstBaselineOffset", "()F", "FirstBaselineOffset", "b", "getTextFieldBottomPadding", "TextFieldBottomPadding", "c", "i", "TextFieldTopPadding", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f168170a = H1.h.p(20);

    /* renamed from: b, reason: collision with root package name */
    private static final float f168171b = H1.h.p(10);

    /* renamed from: c, reason: collision with root package name */
    private static final float f168172c = H1.h.p(2);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f168173f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168174g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168175h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> f168176i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168177j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168178k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f168179l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f168180m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f168181n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f168182o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z10, float f10, InterfaceC14882C interfaceC14882C, int i10) {
            super(2);
            this.f168173f = modifier;
            this.f168174g = function2;
            this.f168175h = function22;
            this.f168176i = function3;
            this.f168177j = function23;
            this.f168178k = function24;
            this.f168179l = z10;
            this.f168180m = f10;
            this.f168181n = interfaceC14882C;
            this.f168182o = i10;
        }

        public final void a(Composer composer, int i10) {
            J1.a(this.f168173f, this.f168174g, this.f168175h, this.f168176i, this.f168177j, this.f168178k, this.f168179l, this.f168180m, this.f168181n, composer, J0.a(this.f168182o | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, boolean z10, float f10, InterfaceC14882C interfaceC14882C, Composer composer, int i10) {
        int i11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2112507061);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function22) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(function3) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.D(function23) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.D(function24) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= composerStartRestartGroup.b(f10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= composerStartRestartGroup.V(interfaceC14882C) ? 67108864 : 33554432;
        }
        if (composerStartRestartGroup.p((38347923 & i11) != 38347922, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-2112507061, i11, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:652)");
            }
            boolean z11 = ((3670016 & i11) == 1048576) | ((29360128 & i11) == 8388608) | ((234881024 & i11) == 67108864);
            Object objB = composerStartRestartGroup.B();
            if (z11 || objB == Composer.INSTANCE.a()) {
                objB = new K1(z10, f10, interfaceC14882C);
                composerStartRestartGroup.t(objB);
            }
            K1 k12 = (K1) objB;
            t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
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
            D1.c(composerA, k12, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            if (function23 != null) {
                composerStartRestartGroup.startReplaceGroup(79117075);
                Modifier modifierD = C17937B0.d(C5937w.b(Modifier.INSTANCE, "Leading"));
                MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.e(), false);
                int iA2 = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierD);
                Function0<InterfaceC5953g> function0A2 = companion.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.h()) {
                    composerStartRestartGroup.I(function0A2);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA2 = D1.a(composerStartRestartGroup);
                D1.c(composerA2, measurePolicyG, companion.e());
                D1.c(composerA2, interfaceC5884sR2, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion.b();
                if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion.f());
                C5806j c5806j = C5806j.f48836a;
                function23.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 12) & 14));
                composerStartRestartGroup.v();
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(79362130);
                composerStartRestartGroup.P();
            }
            if (function24 != null) {
                composerStartRestartGroup.startReplaceGroup(79404817);
                Modifier modifierD2 = C17937B0.d(C5937w.b(Modifier.INSTANCE, "Trailing"));
                MeasurePolicy measurePolicyG2 = C5804h.g(P0.e.INSTANCE.e(), false);
                int iA3 = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierD2);
                Function0<InterfaceC5953g> function0A3 = companion.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.h()) {
                    composerStartRestartGroup.I(function0A3);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA3 = D1.a(composerStartRestartGroup);
                D1.c(composerA3, measurePolicyG2, companion.e());
                D1.c(composerA3, interfaceC5884sR3, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion.b();
                if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion.f());
                C5806j c5806j2 = C5806j.f48836a;
                function24.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 15) & 14));
                composerStartRestartGroup.v();
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(79651794);
                composerStartRestartGroup.P();
            }
            float fG = D.g(interfaceC14882C, tVar);
            float f11 = D.f(interfaceC14882C, tVar);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (function23 != null) {
                i12 = 0;
                fG = H1.h.p(RangesKt.e(H1.h.p(fG - I1.d()), H1.h.p(0)));
            } else {
                i12 = 0;
            }
            float f12 = fG;
            if (function24 != null) {
                f11 = H1.h.p(RangesKt.e(H1.h.p(f11 - I1.d()), H1.h.p(i12)));
            }
            Modifier modifierM = D.m(companion2, f12, 0.0f, f11, 0.0f, 10, null);
            if (function3 != null) {
                composerStartRestartGroup.startReplaceGroup(80502775);
                function3.invoke(C5937w.b(companion2, "Hint").then(modifierM), composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 112));
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(80590226);
                composerStartRestartGroup.P();
            }
            if (function22 != null) {
                composerStartRestartGroup.startReplaceGroup(80624729);
                Modifier modifierThen = C5937w.b(companion2, "Label").then(modifierM);
                MeasurePolicy measurePolicyG3 = C5804h.g(P0.e.INSTANCE.o(), false);
                int iA4 = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR4 = composerStartRestartGroup.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen);
                Function0<InterfaceC5953g> function0A4 = companion.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.h()) {
                    composerStartRestartGroup.I(function0A4);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA4 = D1.a(composerStartRestartGroup);
                D1.c(composerA4, measurePolicyG3, companion.e());
                D1.c(composerA4, interfaceC5884sR4, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion.b();
                if (composerA4.h() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion.f());
                C5806j c5806j3 = C5806j.f48836a;
                function22.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 14));
                composerStartRestartGroup.v();
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(80710258);
                composerStartRestartGroup.P();
            }
            Modifier modifierThen2 = C5937w.b(companion2, "TextField").then(modifierM);
            MeasurePolicy measurePolicyG4 = C5804h.g(P0.e.INSTANCE.o(), true);
            int iA5 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR5 = composerStartRestartGroup.r();
            Modifier modifierE5 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen2);
            Function0<InterfaceC5953g> function0A5 = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A5);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA5 = D1.a(composerStartRestartGroup);
            D1.c(composerA5, measurePolicyG4, companion.e());
            D1.c(composerA5, interfaceC5884sR5, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion.b();
            if (composerA5.h() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                composerA5.t(Integer.valueOf(iA5));
                composerA5.n(Integer.valueOf(iA5), function2B5);
            }
            D1.c(composerA5, modifierE5, companion.f());
            C5806j c5806j4 = C5806j.f48836a;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new a(modifier, function2, function22, function3, function23, function24, z10, f10, interfaceC14882C, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i10, boolean z10, int i11, int i12, int i13, int i14, long j10, float f10, InterfaceC14882C interfaceC14882C) {
        float f11 = f168172c * f10;
        float top = interfaceC14882C.getTop() * f10;
        float bottom = interfaceC14882C.getBottom() * f10;
        int iMax = Math.max(i10, i14);
        return H1.c.f(j10, Math.max(MathKt.d(z10 ? i11 + f11 + iMax + bottom : top + iMax + bottom), Math.max(i12, i13)));
    }

    public static final float i() {
        return f168172c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(f0.a aVar, int i10, int i11, f0 f0Var, f0 f0Var2, f0 f0Var3, f0 f0Var4, f0 f0Var5, boolean z10, int i12, int i13, float f10, float f11) {
        if (f0Var4 != null) {
            f0.a.l(aVar, f0Var4, 0, P0.e.INSTANCE.i().a(f0Var4.getHeight(), i11), 0.0f, 4, null);
        }
        if (f0Var5 != null) {
            f0.a.l(aVar, f0Var5, i10 - f0Var5.getWidth(), P0.e.INSTANCE.i().a(f0Var5.getHeight(), i11), 0.0f, 4, null);
        }
        if (f0Var2 != null) {
            f0.a.l(aVar, f0Var2, I1.h(f0Var4), (z10 ? P0.e.INSTANCE.i().a(f0Var2.getHeight(), i11) : MathKt.d(I1.f() * f11)) - MathKt.d((r0 - i12) * f10), 0.0f, 4, null);
        }
        f0.a.l(aVar, f0Var, I1.h(f0Var4), i13, 0.0f, 4, null);
        if (f0Var3 != null) {
            f0.a.l(aVar, f0Var3, I1.h(f0Var4), i13, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(f0.a aVar, int i10, int i11, f0 f0Var, f0 f0Var2, f0 f0Var3, f0 f0Var4, boolean z10, float f10, InterfaceC14882C interfaceC14882C) {
        int iD = MathKt.d(interfaceC14882C.getTop() * f10);
        if (f0Var3 != null) {
            f0.a.l(aVar, f0Var3, 0, P0.e.INSTANCE.i().a(f0Var3.getHeight(), i11), 0.0f, 4, null);
        }
        if (f0Var4 != null) {
            f0.a.l(aVar, f0Var4, i10 - f0Var4.getWidth(), P0.e.INSTANCE.i().a(f0Var4.getHeight(), i11), 0.0f, 4, null);
        }
        f0.a.l(aVar, f0Var, I1.h(f0Var3), z10 ? P0.e.INSTANCE.i().a(f0Var.getHeight(), i11) : iD, 0.0f, 4, null);
        if (f0Var2 != null) {
            if (z10) {
                iD = P0.e.INSTANCE.i().a(f0Var2.getHeight(), i11);
            }
            f0.a.l(aVar, f0Var2, I1.h(f0Var3), iD, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i10, int i11, int i12, int i13, int i14, long j10) {
        return H1.c.g(j10, i10 + Math.max(i12, Math.max(i13, i14)) + i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(int i10, int i11) {
        if (i10 == Integer.MAX_VALUE) {
            return i10;
        }
        return i10 - i11;
    }
}
