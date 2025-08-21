package Mh;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import dk.C13698b;
import j0.C14889J;
import j0.C14890K;
import ki.InterfaceC15160b0;
import ki.a1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "LUh/b;", "bannerDecorator", "", "f", "(LKi/M;Landroidx/compose/ui/Modifier;LUh/b;Landroidx/compose/runtime/Composer;II)V", "Lbk/a;", "errorMessage", "d", "(LKi/M;Lbk/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Mh.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4156j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Mh.j$a */
    static final class a implements Function3<InterfaceC15160b0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f20076a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f20077b;

        a(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a) {
            this.f20076a = localThemeScope;
            this.f20077b = abstractC6392a;
        }

        public final void a(InterfaceC15160b0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-516889497, i10, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountErrorBanner.<anonymous>.<anonymous> (CreateAccountHeader.kt:93)");
            }
            Di.j.i(this.f20076a, null, C13698b.a(this.f20077b, composer, AbstractC6392a.f60445b), null, Assemble.getToastVariant().getError(), null, composer, LocalThemeScope.f17314g | (q1.m.Inline.f142376h << 12), 21);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15160b0 interfaceC15160b0, Composer composer, Integer num) {
            a(interfaceC15160b0, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, abstractC6392a, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ki.LocalThemeScope r32, androidx.compose.ui.Modifier r33, Uh.b r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mh.C4156j.f(Ki.M, androidx.compose.ui.Modifier, Uh.b, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(String str, r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.g0(semantics, str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, Uh.b bVar, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, bVar, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void d(final LocalThemeScope localThemeScope, final AbstractC6392a abstractC6392a, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        boolean zD2;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-315610440);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                zD2 = composerStartRestartGroup.V(abstractC6392a);
            } else {
                zD2 = composerStartRestartGroup.D(abstractC6392a);
            }
            if (zD2) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-315610440, i12, -1, "com.meijer.mobile.accounts.ux.composables.createaccount.CreateAccountErrorBanner (CreateAccountHeader.kt:90)");
            }
            Modifier modifierK = androidx.compose.foundation.layout.D.k(modifier, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
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
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            Ki.Q.e(localThemeScope, a1.f142015a, ComposableLambdaKt.c(-516889497, true, new a(localThemeScope, abstractC6392a), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (a1.f142016b << 3));
            composerStartRestartGroup.v();
            C14890K.a(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getSeven().getDp()), composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Mh.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4156j.e(localThemeScope, abstractC6392a, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
