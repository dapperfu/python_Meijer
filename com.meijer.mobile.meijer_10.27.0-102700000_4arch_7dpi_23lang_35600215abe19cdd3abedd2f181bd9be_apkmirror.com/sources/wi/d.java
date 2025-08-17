package wi;

import Ji.LocalThemeScope;
import Ji.T;
import P0.e;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AbstractC5774a;
import androidx.compose.ui.layout.C5775b;
import androidx.compose.ui.layout.C5795w;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import h0.k;
import h0.l;
import j0.InterfaceC14810b;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import ji.q1;
import kotlin.C17916Y0;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wi.d;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\u0016\u001a\u00020\u0003*\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lji/q1$b;", "template", "Lkotlin/Function0;", "", "onClick", "Lkotlin/Function1;", "Lj0/b;", "Lkotlin/ExtensionFunctionType;", "badge", "content", "e", "(Lji/q1$b;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LJi/T;", "backgroundColor", "Lji/q1$j;", "labelTemplate", "", "quantity", "maxQuantity", "c", "(LJi/M;Landroidx/compose/ui/Modifier;LJi/T;Lji/q1$j;Ljava/lang/Integer;ILandroidx/compose/runtime/Composer;II)V", "LH1/h;", "a", "F", "BadgeRadius", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final float f166121a = H1.h.p(4);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f166122a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f166123b;

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(final K Layout, List<? extends I> measurables, long j10) {
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurables, "measurables");
            List<? extends I> list = measurables;
            for (I i10 : list) {
                if (Intrinsics.e(C5795w.a(i10), "badge")) {
                    final f0 f0VarK0 = i10.k0(H1.b.d(j10, 0, 0, 0, 0, 11, null));
                    for (I i11 : list) {
                        if (Intrinsics.e(C5795w.a(i11), "anchor")) {
                            final f0 f0VarK02 = i11.k0(j10);
                            int iL0 = f0VarK02.l0(C5775b.a());
                            int iL02 = f0VarK02.l0(C5775b.b());
                            int width = f0VarK02.getWidth();
                            int height = f0VarK02.getHeight();
                            Map<AbstractC5774a, Integer> mapO = MapsKt.o(TuplesKt.a(C5775b.a(), Integer.valueOf(iL0)), TuplesKt.a(C5775b.b(), Integer.valueOf(iL02)));
                            final float f10 = this.f166122a;
                            final float f11 = this.f166123b;
                            return Layout.g1(width, height, mapO, new Function1() { // from class: wi.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return d.a.b(f0VarK0, Layout, f10, f11, f0VarK02, (f0.a) obj);
                                }
                            });
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        a(float f10, float f11) {
            this.f166122a = f10;
            this.f166123b = f11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(f0 f0Var, K k10, float f10, float f11, f0 f0Var2, f0.a layout) {
            Intrinsics.j(layout, "$this$layout");
            if (f0Var.getWidth() <= k10.E0(d.f166121a) * 2) {
                f10 = f11;
            }
            f0.a.l(layout, f0Var2, 0, 0, 0.0f, 4, null);
            f0.a.l(layout, f0Var, f0Var2.getWidth() + k10.E0(f10), ((-f0Var.getHeight()) / 2) + 10, 0.0f, 4, null);
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r16, androidx.compose.ui.Modifier r17, Ji.T r18, final ji.q1.Label r19, final java.lang.Integer r20, int r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.d.c(Ji.M, androidx.compose.ui.Modifier, Ji.T, ji.q1$j, java.lang.Integer, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(LocalThemeScope localThemeScope, Modifier modifier, T t10, q1.Label label, Integer num, int i10, int i11, int i12, Composer composer, int i13) {
        c(localThemeScope, modifier, t10, label, num, i10, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    public static final void e(final q1.Badge template, final Function0<Unit> onClick, final Function3<? super InterfaceC14810b, ? super Composer, ? super Integer, Unit> badge, final Function3<? super InterfaceC14810b, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(template, "template");
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(badge, "badge");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1888855053);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(template) : composerStartRestartGroup.D(template) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onClick) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(badge) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(content) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        int i12 = i11;
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1888855053, i12, -1, "com.meijer.mobile.android_acres_library.composables.AdsBadgedBoxLayout (AdsBadge.kt:43)");
            }
            float fP = H1.h.p(-8);
            float fP2 = H1.h.p(-13);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = template.getInteractionSource();
                if (objB == null) {
                    objB = k.a();
                }
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Modifier modifierC = ClickableKt.c(template.getModifier(), (l) objB, C17916Y0.f(false, 0.0f, 0L, 6, null), false, null, null, onClick, 28, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new a(fP2, fP);
                composerStartRestartGroup.t(objB2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objB2;
            composerStartRestartGroup.P();
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierC);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicy, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierB = C5795w.b(companion3, "anchor");
            int i13 = (i12 & 7168) | 6;
            e.Companion companion4 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion4.o(), false);
            int iA2 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB);
            Function0<InterfaceC5811g> function0A2 = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyG, companion2.e());
            D1.c(composerA2, interfaceC5742sR2, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion2.f());
            C5664j c5664j = C5664j.f48612a;
            content.invoke(c5664j, composerStartRestartGroup, Integer.valueOf(((i13 >> 6) & 112) | 6));
            composerStartRestartGroup.v();
            Modifier modifierB2 = C5795w.b(companion3, "badge");
            int i14 = ((i12 << 3) & 7168) | 6;
            MeasurePolicy measurePolicyG2 = C5662h.g(companion4.o(), false);
            int iA3 = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB2);
            Function0<InterfaceC5811g> function0A3 = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = D1.a(composerStartRestartGroup);
            D1.c(composerA3, measurePolicyG2, companion2.e());
            D1.c(composerA3, interfaceC5742sR3, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion2.b();
            if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion2.f());
            badge.invoke(c5664j, composerStartRestartGroup, Integer.valueOf(((i14 >> 6) & 112) | 6));
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: wi.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d.f(template, onClick, badge, content, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(q1.Badge badge, Function0 function0, Function3 function3, Function3 function32, int i10, Composer composer, int i11) {
        e(badge, function0, function3, function32, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
