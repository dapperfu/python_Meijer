package Bm;

import Bm.X;
import Ki.C;
import Ki.LocalThemeScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import dk.C13698b;
import j0.InterfaceC14888I;
import ki.q1;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;
import pi.C16453n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aI\u0010\u000b\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Lbk/a;", "preAuthAmount", "Lkotlin/Function0;", "", "onToolTipClicked", "temporaryHoldWithAmount", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/d$e;Lbk/a;Lkotlin/jvm/functions/Function0;Lbk/a;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class X {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f3313a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f3314b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f3315c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f3316d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Bm.X$a$a, reason: collision with other inner class name */
        static final class C0071a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f3317a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f3318b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f3319c;

            C0071a(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Function0<Unit> function0) {
                this.f3317a = localThemeScope;
                this.f3318b = abstractC6392a;
                this.f3319c = function0;
            }

            public final void b(InterfaceC14888I AdsRow, Composer composer, int i10) {
                String strC;
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-123163501, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.CreditCardPreAuthInformation.<anonymous>.<anonymous> (CreditCardPreAuthInformation.kt:55)");
                }
                LocalThemeScope localThemeScope = this.f3317a;
                Ki.I two = localThemeScope.getAdsTypography().getBody().getTwo();
                Ki.T adsColorText02 = this.f3317a.getAdsColors().getAdsColorText02();
                Modifier.Companion companion = Modifier.INSTANCE;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, H1.h.p(4), 0.0f, 11, null), adsColorText02, null, null, 0, false, 0, two, null, 380, null);
                if (this.f3318b != null) {
                    composer.startReplaceGroup(-1261398145);
                    strC = C13698b.a(this.f3318b, composer, AbstractC6392a.f60445b);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-1261312864);
                    strC = C16338g.c(com.meijer.mobile.meijer.Y.f101246vg, composer, 0);
                    composer.P();
                }
                si.j.h(localThemeScope, label, strC, null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
                Z0.c cVarC = C16335d.c(C.i.h.f17101d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0);
                String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f101077n7, composer, 0);
                long color = this.f3317a.getAdsColors().getAdsColorBrandPrimary().getColor();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f3319c);
                final Function0<Unit> function0 = this.f3319c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Bm.W
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return X.a.C0071a.c(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C18054z0.a(cVarC, strC2, ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), color, composer, 0, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                b(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, Function0<Unit> function0) {
            this.f3313a = localThemeScope;
            this.f3314b = abstractC6392a;
            this.f3315c = abstractC6392a2;
            this.f3316d = function0;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1975723949, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.CreditCardPreAuthInformation.<anonymous> (CreditCardPreAuthInformation.kt:49)");
            }
            LocalThemeScope localThemeScope = this.f3313a;
            q1.Row row = new q1.Row(Modifier.INSTANCE, null, P0.e.INSTANCE.i(), 2, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-123163501, true, new C0071a(this.f3313a, this.f3314b, this.f3316d), composer, 54);
            int i11 = LocalThemeScope.f17314g;
            C16453n.i(localThemeScope, row, composableLambdaC, composer, i11 | 384 | (q1.Row.f142392d << 3));
            if (this.f3314b == null) {
                LocalThemeScope localThemeScope2 = this.f3313a;
                si.j.h(localThemeScope2, new q1.Label(null, this.f3313a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 381, null), C13698b.a(this.f3315c, composer, AbstractC6392a.f60445b), null, composer, (q1.Label.f142335j << 3) | i11, 4);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1 A[PHI: r12
      0x00b1: PHI (r12v13 int) = (r12v0 int), (r12v6 int), (r12v7 int) binds: [B:61:0x00af, B:71:0x00c9, B:70:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r14, androidx.compose.ui.Modifier r15, androidx.compose.foundation.layout.C5800d.e r16, final bk.AbstractC6392a r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, bk.AbstractC6392a r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bm.X.b(Ki.M, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.d$e, bk.a, kotlin.jvm.functions.Function0, bk.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, C5800d.e eVar, AbstractC6392a abstractC6392a, Function0 function0, AbstractC6392a abstractC6392a2, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, eVar, abstractC6392a, function0, abstractC6392a2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
