package as;

import H1.h;
import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import as.C6149c;
import ck.C6408b;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13457y;
import j0.C14802K;
import j0.C14815g;
import ji.q1;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15860s0;
import ni.P0;
import p1.C16190d;
import r0.C16692i;
import ri.j;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aM\u0010\f\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lak/a;", "title", "description", "actionButtonTitle", "", "image", "Lkotlin/Function0;", "", "onAction", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Lak/a;Lak/a;Lak/a;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "homescreen_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: as.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C6149c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: as.c$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f59431a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f59432b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f59433c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f59434d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f59435e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f59436f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f59437g;

        a(LocalThemeScope localThemeScope, Modifier modifier, int i10, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, Function0<Unit> function0) {
            this.f59431a = localThemeScope;
            this.f59432b = modifier;
            this.f59433c = i10;
            this.f59434d = abstractC5607a;
            this.f59435e = abstractC5607a2;
            this.f59436f = abstractC5607a3;
            this.f59437g = function0;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1320679674, i10, -1, "com.meijer.mobile.ui.homescreen.FeatureEntryPointHomeScreenCard.<anonymous> (FeatureEntryPointHomeScreen.kt:58)");
            }
            C5658d c5658d = C5658d.f48555a;
            float dp2 = this.f59431a.getAdsSpacing().getTwo().getDp();
            e.Companion companion = P0.e.INSTANCE;
            C5658d.m mVarQ = c5658d.q(dp2, companion.l());
            e.b bVarK = companion.k();
            Modifier modifier = this.f59432b;
            int i11 = this.f59433c;
            LocalThemeScope localThemeScope = this.f59431a;
            AbstractC5607a abstractC5607a = this.f59434d;
            AbstractC5607a abstractC5607a2 = this.f59435e;
            AbstractC5607a abstractC5607a3 = this.f59436f;
            final Function0<Unit> function0 = this.f59437g;
            MeasurePolicy measurePolicyA = C5665k.a(mVarQ, bVarK, composer, 48);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifier);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            float f10 = 12;
            C13457y.a(C16190d.c(i11, composer, 0), null, T0.e.a(J.i(J.h(modifier, 0.0f, 1, null), h.p(91)), C16692i.e(h.p(f10), h.p(f10), 0.0f, 0.0f, 12, null)), companion.e(), InterfaceC5784k.INSTANCE.a(), 0.0f, null, composer, 27696, 96);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierL = D.l(companion3, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getThree().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp());
            MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion.k(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierL);
            Function0<InterfaceC5811g> function0A2 = companion2.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A2);
            } else {
                composer.s();
            }
            Composer composerA2 = D1.a(composer);
            D1.c(composerA2, measurePolicyA2, companion2.e());
            D1.c(composerA2, interfaceC5742sR2, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion2.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion2.f());
            q1.Label label = new q1.Label(J.h(modifier, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix().f(FontWeight.INSTANCE.a()), null, 382, null);
            int i12 = AbstractC5607a.f45514b;
            String strA = C6408b.a(abstractC5607a, composer, i12);
            int i13 = LocalThemeScope.f15770g;
            int i14 = q1.Label.f140080j;
            j.h(localThemeScope, label, strA, null, composer, i13 | (i14 << 3), 4);
            C14802K.a(J.i(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            j.h(localThemeScope, new q1.Label(J.h(modifier, 0.0f, 1, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null), C6408b.a(abstractC5607a2, composer, i12), null, composer, i13 | (i14 << 3), 4);
            C14802K.a(J.i(companion3, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            C15860s0 c15860s0 = C15860s0.f151792a;
            String strA2 = C6408b.a(abstractC5607a3, composer, i12);
            String strA3 = C6408b.a(abstractC5607a3, composer, i12);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(function0);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: as.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C6149c.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            P0.k(localThemeScope, c15860s0, strA2, (Function0) objB, null, strA3, true, 0L, false, composer, 1572864 | i13 | (C15860s0.f151793b << 3), HttpResponseStatus.SUCCESS_OK);
            composer.v();
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
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
    public static final void b(final Ji.LocalThemeScope r24, androidx.compose.ui.Modifier r25, final ak.AbstractC5607a r26, final ak.AbstractC5607a r27, final ak.AbstractC5607a r28, final int r29, final kotlin.jvm.functions.Function0<kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: as.C6149c.b(Ji.M, androidx.compose.ui.Modifier, ak.a, ak.a, ak.a, int, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, int i10, Function0 function0, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, abstractC5607a, abstractC5607a2, abstractC5607a3, i10, function0, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }
}
