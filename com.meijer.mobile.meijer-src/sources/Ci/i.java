package Ci;

import Ki.C;
import X0.Stroke;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\b\u0010\u0005\u001a'\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"LCi/a;", "Landroidx/compose/ui/Modifier;", "modifier", "", "l", "(LCi/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "n", "r", "t", "LCi/o;", "loadingStatus", "LKi/C;", "loadingIcon", "p", "(LCi/a;LCi/o;LKi/C;Landroidx/compose/runtime/Composer;II)V", BarcodePickDeserializer.FIELD_ICON, "h", "(LCi/a;LKi/C;Landroidx/compose/runtime/Composer;II)V", "", "baseRotation", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.f4630b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.f4631c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void h(final Ci.a r25, Ki.C r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ci.i.h(Ci.a, Ki.C, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Ci.a aVar, Stroke stroke, X0.f Canvas) {
        Intrinsics.j(Canvas, "$this$Canvas");
        X0.f.k1(Canvas, aVar.getTemplate().getColors().getBackgroundLoading().getColor(), 0.0f, 360.0f, false, 0L, 0L, 0.0f, stroke, null, 0, 880, null);
        X0.f.k1(Canvas, aVar.getTemplate().getColors().getFilledLoading().getColor(), 180.0f, 90.0f, false, 0L, 0L, 0.0f, stroke, null, 0, 880, null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Ci.a aVar, C c10, int i10, int i11, Composer composer, int i12) {
        h(aVar, c10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    @Deprecated
    public static final void l(final Ci.a aVar, final Modifier modifier, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(-559867589);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(aVar) : composerStartRestartGroup.D(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-559867589, i11, -1, "com.meijer.mobile.android_acres_library.composables.loading.LargeLoading (LoadingComposer.kt:67)");
            }
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.b(), P0.e.INSTANCE.g(), composerStartRestartGroup, 54);
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
            p(aVar, aVar.getLoadingStatus(), C.b.d.C0295d.f16959e, composerStartRestartGroup, (i11 & 14) | 384, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            C14890K.a(J.i(companion2, aVar.getLocalThemeScope().getAdsSpacing().getFive().getDp()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1539718383);
            if (!StringsKt.s0(aVar.getTitle())) {
                N1.b(aVar.getTitle(), D.m(companion2, 0.0f, 0.0f, 0.0f, aVar.getLocalThemeScope().getAdsSpacing().getThree().getDp(), 7, null), 0L, 0L, null, null, null, 0L, null, F1.j.h(F1.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.getLocalThemeScope().getAdsTypography().getHeadings().getSix().getStyle(), composerStartRestartGroup, 0, 0, 65020);
                C14890K.a(J.i(companion2, aVar.getLocalThemeScope().getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-1539705583);
            if (!StringsKt.s0(aVar.getDescription())) {
                N1.b(aVar.getDescription(), null, 0L, 0L, null, null, null, 0L, null, F1.j.h(F1.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.getLocalThemeScope().getAdsTypography().getBodyCompact().getOne().getStyle(), composerStartRestartGroup, 0, 0, 65022);
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ci.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.m(aVar, modifier, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Ci.a aVar, Modifier modifier, int i10, Composer composer, int i11) {
        l(aVar, modifier, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void n(final Ci.a aVar, final Modifier modifier, Composer composer, final int i10) {
        int i11;
        int i12;
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(649216663);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(aVar) : composerStartRestartGroup.D(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(649216663, i11, -1, "com.meijer.mobile.android_acres_library.composables.loading.LargeLoadingV2 (LoadingComposer.kt:100)");
            }
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.b(), P0.e.INSTANCE.g(), composerStartRestartGroup, 54);
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
            p(aVar, aVar.getLoadingStatus(), C.b.d.C0295d.f16959e, composerStartRestartGroup, (i11 & 14) | 384, 0);
            composerStartRestartGroup.startReplaceGroup(-1242025807);
            if (StringsKt.s0(aVar.getTitle())) {
                i12 = 0;
            } else {
                C14890K.a(J.i(Modifier.INSTANCE, aVar.getLocalThemeScope().getAdsSpacing().getFive().getDp()), composerStartRestartGroup, 0);
                i12 = 0;
                N1.b(aVar.getTitle(), null, 0L, 0L, null, null, null, 0L, null, F1.j.h(F1.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.getLocalThemeScope().getAdsTypography().getHeadings().getSix().getStyle(), composerStartRestartGroup, 0, 0, 65022);
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-1242015691);
            if (!StringsKt.s0(aVar.getDescription())) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                C14890K.a(J.i(companion2, aVar.getLocalThemeScope().getAdsSpacing().getThree().getDp()), composerStartRestartGroup, i12);
                C14890K.a(J.i(companion2, aVar.getLocalThemeScope().getAdsSpacing().getThree().getDp()), composerStartRestartGroup, i12);
                N1.b(aVar.getDescription(), null, 0L, 0L, null, null, null, 0L, null, F1.j.h(F1.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.getLocalThemeScope().getAdsTypography().getBodyCompact().getOne().getStyle(), composerStartRestartGroup, 0, 0, 65022);
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ci.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.o(aVar, modifier, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Ci.a aVar, Modifier modifier, int i10, Composer composer, int i11) {
        n(aVar, modifier, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void p(final Ci.a r23, final Ci.o r24, Ki.C r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ci.i.p(Ci.a, Ci.o, Ki.C, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Ci.a aVar, o oVar, C c10, int i10, int i11, Composer composer, int i12) {
        p(aVar, oVar, c10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void r(final Ci.a aVar, final Modifier modifier, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1224940271);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(aVar) : composerStartRestartGroup.D(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1224940271, i11, -1, "com.meijer.mobile.android_acres_library.composables.loading.SmallLoading (LoadingComposer.kt:128)");
            }
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.b(), P0.e.INSTANCE.i(), composerStartRestartGroup, 54);
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
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            p(aVar, aVar.getLoadingStatus(), null, composerStartRestartGroup, i11 & 14, 2);
            composerStartRestartGroup.startReplaceGroup(-2042342102);
            if (!StringsKt.s0(aVar.getDescription())) {
                C14890K.a(J.z(Modifier.INSTANCE, aVar.getLocalThemeScope().getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
                N1.b(aVar.getDescription(), null, 0L, 0L, null, null, null, 0L, null, F1.j.h(F1.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.getLocalThemeScope().getAdsTypography().getBodyCompact().getOne().getStyle(), composerStartRestartGroup, 0, 0, 65022);
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ci.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.s(aVar, modifier, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Ci.a aVar, Modifier modifier, int i10, Composer composer, int i11) {
        r(aVar, modifier, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void t(final Ci.a aVar, final Modifier modifier, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1365602841);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(aVar) : composerStartRestartGroup.D(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1365602841, i11, -1, "com.meijer.mobile.android_acres_library.composables.loading.SmallVerticalLoading (LoadingComposer.kt:147)");
            }
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.b(), P0.e.INSTANCE.g(), composerStartRestartGroup, 54);
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
            p(aVar, aVar.getLoadingStatus(), null, composerStartRestartGroup, i11 & 14, 2);
            composerStartRestartGroup.startReplaceGroup(-509091672);
            if (!StringsKt.s0(aVar.getDescription())) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                C14890K.a(J.i(companion2, aVar.getLocalThemeScope().getAdsSpacing().getThree().getDp()), composerStartRestartGroup, 0);
                N1.b(aVar.getDescription(), companion2, 0L, 0L, null, null, null, 0L, null, F1.j.h(F1.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.getLocalThemeScope().getAdsTypography().getBodyCompact().getOne().getStyle(), composerStartRestartGroup, 48, 0, 65020);
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ci.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.u(aVar, modifier, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Ci.a aVar, Modifier modifier, int i10, Composer composer, int i11) {
        t(aVar, modifier, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    private static final float i(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }
}
