package Mr;

import H1.n;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.recyclerview.widget.RecyclerView;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import j0.InterfaceC14898b;
import kotlin.C13914c;
import kotlin.EnumC13937z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a]\u0010\f\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lf0/c;", "LMr/a;", "anchoredDraggableState", "Lkotlin/Function1;", "Lj0/b;", "", "Lkotlin/ExtensionFunctionType;", "action", "content", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Lf0/c;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class g {
    public static final void c(final LocalThemeScope localThemeScope, Modifier modifier, final C13914c<a> anchoredDraggableState, final Function3<? super InterfaceC14898b, ? super Composer, ? super Integer, Unit> action, final Function3<? super InterfaceC14898b, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(anchoredDraggableState, "anchoredDraggableState");
        Intrinsics.j(action, "action");
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-346389723);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 48;
            modifier2 = modifier;
        } else if ((i10 & 48) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.V(modifier2) ? 32 : 16) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(anchoredDraggableState) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(action) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(content) ? 16384 : 8192;
        }
        int i14 = i12;
        if ((i14 & 9361) == 9360 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.M()) {
                ComposerKt.U(-346389723, i14, -1, "com.meijer.mobile.ui.common.swipetoreveal.SwipeToRevealAction (SwipeToReveal.kt:53)");
            }
            Modifier modifierH = J.h(modifier4, 0.0f, 1, null);
            e.Companion companion = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5806j c5806j = C5806j.f48836a;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierG = c5806j.g(c5806j.h(companion3), companion.f());
            MeasurePolicy measurePolicyG2 = C5804h.g(companion.o(), false);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierG);
            Function0<InterfaceC5953g> function0A2 = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyG2, companion2.e());
            D1.c(composerA2, interfaceC5884sR2, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion2.f());
            action.invoke(c5806j, composerStartRestartGroup, Integer.valueOf(6 | ((i14 >> 6) & 112)));
            composerStartRestartGroup.v();
            Modifier modifierG2 = c5806j.g(companion3, companion.h());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i14 & 896) == 256;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Mr.e
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g.d(anchoredDraggableState, (H1.d) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Modifier modifier5 = modifier4;
            Modifier modifierM = androidx.compose.foundation.gestures.a.m(A.a(modifierG2, (Function1) objB), anchoredDraggableState, true, EnumC13937z.f131420b, false, null, null, null, BinsView.TOTE_HEIGHT_DP, null);
            MeasurePolicy measurePolicyG3 = C5804h.g(companion.o(), false);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
            Function0<InterfaceC5953g> function0A3 = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = D1.a(composerStartRestartGroup);
            D1.c(composerA3, measurePolicyG3, companion2.e());
            D1.c(composerA3, interfaceC5884sR3, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion2.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion2.f());
            content.invoke(c5806j, composerStartRestartGroup, Integer.valueOf(6 | ((i14 >> 9) & 112)));
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier3 = modifier5;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Mr.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.e(localThemeScope, modifier3, anchoredDraggableState, action, content, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n d(C13914c c13914c, H1.d offset) {
        Intrinsics.j(offset, "$this$offset");
        return n.c(n.f(((-MathKt.d(c13914c.A())) << 32) | (0 & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, C13914c c13914c, Function3 function3, Function3 function32, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, c13914c, function3, function32, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
