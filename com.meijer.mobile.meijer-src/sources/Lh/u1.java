package Lh;

import Gh.a;
import Ih.A;
import Ki.LocalThemeScope;
import Vh.GasPriceItem;
import Vh.StoreCardDecorator;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import java.util.ArrayList;
import java.util.List;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import u1.TextLayoutResult;
import yr.C18370z;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0017\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u0019\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001b\u0010\u001a\u001a%\u0010\u001c\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001c\u0010\u001a\u001a+\u0010 \u001a\u00020\u0007*\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b \u0010!\u001a\u001d\u0010\"\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\"\u0010#\u001a+\u0010$\u001a\u00020\u0007*\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b$\u0010!\u001a-\u0010(\u001a\u00020\u0007*\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b(\u0010)\u001a%\u0010*\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b*\u0010\u001a\u001a%\u0010+\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b+\u0010\u001a\u001a\u001b\u0010-\u001a\u00020\u0007*\u00020\u00002\u0006\u0010,\u001a\u00020\u0015H\u0003¢\u0006\u0004\b-\u0010.\u001a\u001d\u0010/\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b/\u0010#\u001a\u001d\u00100\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b0\u0010#¨\u00064²\u0006\u000e\u00101\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00102\u001a\u0004\u0018\u00010%8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00103\u001a\u00020%8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LIh/A$a;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "V", "(LKi/M;LIh/A$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Y", "(LKi/M;LIh/A$a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LVh/e;", "decorator", "Lbk/a;", "errorMessage", "T", "(LKi/M;LVh/e;Lbk/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "P", "(LKi/M;Lbk/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "isNoPharmacyNoGas", "N", "(LKi/M;LVh/e;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "R", "(LKi/M;LVh/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "L", "H", "", "LVh/a;", "gasPriceItems", "x", "(LKi/M;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "B", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "z", "", "grade", "price", "v", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "D", "t", "isOpen", "F", "(LKi/M;ZLandroidx/compose/runtime/Composer;I)V", "J", "a0", "isTextOverflow", "lastAction", "state", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class u1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18898a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A.YourMeijerStoreCardViewState f18899b;

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(272348489, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.YourMeijerStoreCard.<anonymous> (YourMeijerStoreCard.kt:85)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f18898a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f18898a;
            A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState = this.f18899b;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            int i11 = LocalThemeScope.f17314g;
            u1.a0(localThemeScope, null, composer, i11, 1);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (yourMeijerStoreCardViewState.getIsLoading()) {
                composer.startReplaceGroup(1626661942);
                yr.N.b(localThemeScope, null, composer, i11, 1);
                composer.P();
            } else {
                composer.startReplaceGroup(1626713526);
                u1.Y(localThemeScope, yourMeijerStoreCardViewState, null, composer, i11, 2);
                composer.P();
            }
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(LocalThemeScope localThemeScope, A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState) {
            this.f18898a = localThemeScope;
            this.f18899b = yourMeijerStoreCardViewState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, List list, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        z(localThemeScope, list, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void B(Ki.LocalThemeScope r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.B(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void D(final Ki.LocalThemeScope r32, final Vh.StoreCardDecorator r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.D(Ki.M, Vh.e, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, StoreCardDecorator storeCardDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        D(localThemeScope, storeCardDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void F(LocalThemeScope localThemeScope, final boolean z10, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(1732723371);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1732723371, i11, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.OpenClosedStatus (YourMeijerStoreCard.kt:440)");
            }
            if (z10) {
                composerStartRestartGroup.startReplaceGroup(-1649883884);
                si.j.h(localThemeScope2, new q1.Label(C18370z.f(Modifier.INSTANCE, "store_open", null, 2, null), localThemeScope2.getAdsColors().getAdsColorSupportSuccess(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getEight(), null, 380, null), C16338g.c(Gh.h.f12822W3, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composerStartRestartGroup.P();
                localThemeScope2 = localThemeScope;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1649557454);
                localThemeScope2 = localThemeScope;
                si.j.h(localThemeScope2, new q1.Label(C18370z.f(Modifier.INSTANCE, "store_closed", null, 2, null), localThemeScope.getAdsColors().getAdsColorSupportError(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 380, null), C16338g.c(Gh.h.f12808U3, composerStartRestartGroup, 0), null, composerStartRestartGroup, LocalThemeScope.f17314g | (i11 & 14) | (q1.Label.f142335j << 3), 4);
                composerStartRestartGroup.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Lh.k1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u1.G(localThemeScope2, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(LocalThemeScope localThemeScope, boolean z10, int i10, Composer composer, int i11) {
        F(localThemeScope, z10, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void H(final Ki.LocalThemeScope r16, final Vh.StoreCardDecorator r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.H(Ki.M, Vh.e, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, StoreCardDecorator storeCardDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        H(localThemeScope, storeCardDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void J(Ki.LocalThemeScope r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.J(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        J(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void L(final Ki.LocalThemeScope r16, final Vh.StoreCardDecorator r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.L(Ki.M, Vh.e, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(LocalThemeScope localThemeScope, StoreCardDecorator storeCardDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        L(localThemeScope, storeCardDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void N(final Ki.LocalThemeScope r24, final Vh.StoreCardDecorator r25, final boolean r26, androidx.compose.ui.Modifier r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.N(Ki.M, Vh.e, boolean, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(LocalThemeScope localThemeScope, StoreCardDecorator storeCardDecorator, boolean z10, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        N(localThemeScope, storeCardDecorator, z10, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void P(final Ki.LocalThemeScope r28, final bk.AbstractC6392a r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.P(Ki.M, bk.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        P(localThemeScope, abstractC6392a, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void R(final Ki.LocalThemeScope r28, final Vh.StoreCardDecorator r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.R(Ki.M, Vh.e, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(LocalThemeScope localThemeScope, StoreCardDecorator storeCardDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        R(localThemeScope, storeCardDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void T(final Ki.LocalThemeScope r19, final Vh.StoreCardDecorator r20, final bk.AbstractC6392a r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.T(Ki.M, Vh.e, bk.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(LocalThemeScope localThemeScope, StoreCardDecorator storeCardDecorator, AbstractC6392a abstractC6392a, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        T(localThemeScope, storeCardDecorator, abstractC6392a, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void V(final Ki.LocalThemeScope r21, final Ih.A.YourMeijerStoreCardViewState r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.V(Ki.M, Ih.A$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(Function1 function1, A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState) {
        function1.invoke(new a.NavigateToStoreDetails(yourMeijerStoreCardViewState.getDecorator().getStoreId(), yourMeijerStoreCardViewState.getDecorator().getName()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(LocalThemeScope localThemeScope, A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        V(localThemeScope, yourMeijerStoreCardViewState, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(final LocalThemeScope localThemeScope, final A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-169384645);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(yourMeijerStoreCardViewState) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-169384645, i12, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.YourMeijerStoreContent (YourMeijerStoreCard.kt:102)");
            }
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
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
            D1.c(composerA, measurePolicyA, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion2, localThemeScope.getAdsSpacing().getFive().getDp()), composerStartRestartGroup, 0);
            if (yourMeijerStoreCardViewState.e()) {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(247680914);
                StoreCardDecorator decorator = yourMeijerStoreCardViewState.getDecorator();
                int i14 = LocalThemeScope.f17314g;
                int i15 = i12 & 14;
                N(localThemeScope, decorator, false, null, composer2, i14 | 384 | i15, 4);
                composer2.startReplaceGroup(1254918403);
                if (yourMeijerStoreCardViewState.g()) {
                    C14890K.a(androidx.compose.foundation.layout.J.i(companion2, localThemeScope.getAdsSpacing().getFive().getDp()), composer2, 0);
                    L(localThemeScope, yourMeijerStoreCardViewState.getDecorator(), androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), composer2, i14 | 384 | i15, 0);
                    composer2 = composer2;
                }
                composer2.P();
                if (yourMeijerStoreCardViewState.f()) {
                    C14890K.a(androidx.compose.foundation.layout.J.i(companion2, localThemeScope.getAdsSpacing().getFive().getDp()), composer2, 0);
                    Composer composer3 = composer2;
                    x(localThemeScope, yourMeijerStoreCardViewState.getDecorator().a(), null, composer3, i14 | i15, 2);
                    composer2 = composer3;
                }
                composer2.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(247496278);
                composer2 = composerStartRestartGroup;
                T(localThemeScope, yourMeijerStoreCardViewState.getDecorator(), yourMeijerStoreCardViewState.getErrorMessage(), null, composer2, LocalThemeScope.f17314g | (i12 & 14) | (AbstractC6392a.f60445b << 6), 4);
                composer2.P();
            }
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Lh.m1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u1.Z(localThemeScope, yourMeijerStoreCardViewState, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(LocalThemeScope localThemeScope, A.YourMeijerStoreCardViewState yourMeijerStoreCardViewState, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        Y(localThemeScope, yourMeijerStoreCardViewState, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a0(Ki.LocalThemeScope r39, androidx.compose.ui.Modifier r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.a0(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d0(InterfaceC5872l0 interfaceC5872l0, TextLayoutResult textLayoutResult) {
        Intrinsics.j(textLayoutResult, "textLayoutResult");
        c0(interfaceC5872l0, textLayoutResult.g());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e0(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        a0(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void t(final Ki.LocalThemeScope r32, final Vh.StoreCardDecorator r33, androidx.compose.ui.Modifier r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.t(Ki.M, Vh.e, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, StoreCardDecorator storeCardDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, storeCardDecorator, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void v(final Ki.LocalThemeScope r37, final java.lang.String r38, final java.lang.String r39, androidx.compose.ui.Modifier r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.v(Ki.M, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, str, str2, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void x(final Ki.LocalThemeScope r16, final java.util.List<Vh.GasPriceItem> r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.u1.x(Ki.M, java.util.List, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, List list, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        x(localThemeScope, list, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void z(final LocalThemeScope localThemeScope, final List<GasPriceItem> list, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1466693330);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(list) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1466693330, i12, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.GasSectionBody (YourMeijerStoreCard.kt:320)");
            }
            Modifier modifierF = C18370z.f(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.layout.J.h(modifier, 0.0f, 1, null), localThemeScope.getAdsSpacing().getSix().getDp(), 0.0f, 2, null), "gas_section_body", null, 2, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composerStartRestartGroup, 6);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierF);
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
            composerStartRestartGroup.startReplaceGroup(-410272152);
            List<GasPriceItem> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
            for (GasPriceItem gasPriceItem : list2) {
                v(localThemeScope, gasPriceItem.getLabel(), gasPriceItem.getPrice(), null, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14), 4);
                arrayList.add(Unit.f143329a);
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Lh.f1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u1.A(localThemeScope, list, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean b0(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void c0(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
