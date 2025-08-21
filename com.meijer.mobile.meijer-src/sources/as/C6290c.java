package as;

import H1.h;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import as.C6290c;
import bk.AbstractC6392a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13590y;
import dk.C13698b;
import j0.C14890K;
import j0.C14903g;
import ki.q1;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16194s0;
import oi.P0;
import p1.C16335d;
import r0.C16806i;
import si.j;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aM\u0010\f\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lbk/a;", "title", "description", "actionButtonTitle", "", "image", "Lkotlin/Function0;", "", "onAction", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lbk/a;Lbk/a;Lbk/a;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "homescreen_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: as.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C6290c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: as.c$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f59631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f59632b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59633c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f59634d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f59635e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f59636f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f59637g;

        a(LocalThemeScope localThemeScope, Modifier modifier, int i10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, Function0<Unit> function0) {
            this.f59631a = localThemeScope;
            this.f59632b = modifier;
            this.f59633c = i10;
            this.f59634d = abstractC6392a;
            this.f59635e = abstractC6392a2;
            this.f59636f = abstractC6392a3;
            this.f59637g = function0;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1320679674, i10, -1, "com.meijer.mobile.ui.homescreen.FeatureEntryPointHomeScreenCard.<anonymous> (FeatureEntryPointHomeScreen.kt:58)");
            }
            C5800d c5800d = C5800d.f48779a;
            float dp2 = this.f59631a.getAdsSpacing().getTwo().getDp();
            e.Companion companion = P0.e.INSTANCE;
            C5800d.m mVarQ = c5800d.q(dp2, companion.l());
            e.b bVarK = companion.k();
            Modifier modifier = this.f59632b;
            int i11 = this.f59633c;
            LocalThemeScope localThemeScope = this.f59631a;
            AbstractC6392a abstractC6392a = this.f59634d;
            AbstractC6392a abstractC6392a2 = this.f59635e;
            AbstractC6392a abstractC6392a3 = this.f59636f;
            final Function0<Unit> function0 = this.f59637g;
            MeasurePolicy measurePolicyA = C5807k.a(mVarQ, bVarK, composer, 48);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifier);
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
            float f10 = 12;
            C13590y.a(C16335d.c(i11, composer, 0), null, T0.e.a(J.i(J.h(modifier, 0.0f, 1, null), h.p(91)), C16806i.e(h.p(f10), h.p(f10), 0.0f, 0.0f, 12, null)), companion.e(), InterfaceC5926k.INSTANCE.a(), 0.0f, null, composer, 27696, 96);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierL = D.l(companion3, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp());
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion.k(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierL);
            Function0<InterfaceC5953g> function0A2 = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyA2, companion2.e());
            D1.c(composerA2, interfaceC5884sR2, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion2.f());
            q1.Label label = new q1.Label(J.h(modifier, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix().g(FontWeight.INSTANCE.a()), null, 382, null);
            int i12 = AbstractC6392a.f60445b;
            String strA = C13698b.a(abstractC6392a, composer, i12);
            int i13 = LocalThemeScope.f17314g;
            int i14 = q1.Label.f142335j;
            j.h(localThemeScope, label, strA, null, composer, i13 | (i14 << 3), 4);
            C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            j.h(localThemeScope, new q1.Label(J.h(modifier, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null), C13698b.a(abstractC6392a2, composer, i12), null, composer, i13 | (i14 << 3), 4);
            C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            C16194s0 c16194s0 = C16194s0.f154251a;
            String strA2 = C13698b.a(abstractC6392a3, composer, i12);
            String strA3 = C13698b.a(abstractC6392a3, composer, i12);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(function0);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: as.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C6290c.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            P0.k(localThemeScope, c16194s0, strA2, (Function0) objB, null, strA3, true, 0L, false, composer, 1572864 | i13 | (C16194s0.f154252b << 3), HttpResponseStatus.SUCCESS_OK);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r24, androidx.compose.ui.Modifier r25, final bk.AbstractC6392a r26, final bk.AbstractC6392a r27, final bk.AbstractC6392a r28, final int r29, final kotlin.jvm.functions.Function0<kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: as.C6290c.b(Ki.M, androidx.compose.ui.Modifier, bk.a, bk.a, bk.a, int, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, int i10, Function0 function0, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, abstractC6392a, abstractC6392a2, abstractC6392a3, i10, function0, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }
}
