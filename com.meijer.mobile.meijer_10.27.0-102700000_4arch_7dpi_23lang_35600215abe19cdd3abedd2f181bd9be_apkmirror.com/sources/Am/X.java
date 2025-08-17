package Am;

import Am.X;
import Ji.C;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import ck.C6408b;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16088n;
import p1.C16190d;
import p1.C16193g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001aI\u0010\u000b\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Lak/a;", "preAuthAmount", "Lkotlin/Function0;", "", "onToolTipClicked", "temporaryHoldWithAmount", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/d$e;Lak/a;Lkotlin/jvm/functions/Function0;Lak/a;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class X {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f855a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f856b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f857c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f858d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Am.X$a$a, reason: collision with other inner class name */
        static final class C0020a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f859a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f860b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f861c;

            C0020a(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, Function0<Unit> function0) {
                this.f859a = localThemeScope;
                this.f860b = abstractC5607a;
                this.f861c = function0;
            }

            public final void b(InterfaceC14800I AdsRow, Composer composer, int i10) {
                String strC;
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-123163501, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.CreditCardPreAuthInformation.<anonymous>.<anonymous> (CreditCardPreAuthInformation.kt:55)");
                }
                LocalThemeScope localThemeScope = this.f859a;
                Ji.I two = localThemeScope.getAdsTypography().getBody().getTwo();
                Ji.T adsColorText02 = this.f859a.getAdsColors().getAdsColorText02();
                Modifier.Companion companion = Modifier.INSTANCE;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, H1.h.p(4), 0.0f, 11, null), adsColorText02, null, null, 0, false, 0, two, null, 380, null);
                if (this.f860b != null) {
                    composer.startReplaceGroup(-1261398145);
                    strC = C6408b.a(this.f860b, composer, AbstractC5607a.f45514b);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-1261312864);
                    strC = C16193g.c(com.meijer.mobile.meijer.Y.f100324sg, composer, 0);
                    composer.P();
                }
                ri.j.h(localThemeScope, label, strC, null, composer, (q1.Label.f140080j << 3) | LocalThemeScope.f15770g, 4);
                Z0.c cVarC = C16190d.c(C.i.h.f15557d.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), composer, 0);
                String strC2 = C16193g.c(com.meijer.mobile.meijer.Y.f100155k7, composer, 0);
                long color = this.f859a.getAdsColors().getAdsColorBrandPrimary().getColor();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f861c);
                final Function0<Unit> function0 = this.f861c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Am.W
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return X.a.C0020a.c(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C17988z0.a(cVarC, strC2, ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), color, composer, 0, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                b(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function0 function0) {
                function0.invoke();
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Function0<Unit> function0) {
            this.f855a = localThemeScope;
            this.f856b = abstractC5607a;
            this.f857c = abstractC5607a2;
            this.f858d = function0;
        }

        public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1975723949, i10, -1, "com.meijer.mobile.meijer.activity.checkout.composables.CreditCardPreAuthInformation.<anonymous> (CreditCardPreAuthInformation.kt:49)");
            }
            LocalThemeScope localThemeScope = this.f855a;
            q1.Row row = new q1.Row(Modifier.INSTANCE, null, P0.e.INSTANCE.i(), 2, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-123163501, true, new C0020a(this.f855a, this.f856b, this.f858d), composer, 54);
            int i11 = LocalThemeScope.f15770g;
            C16088n.i(localThemeScope, row, composableLambdaC, composer, i11 | 384 | (q1.Row.f140137d << 3));
            if (this.f856b == null) {
                LocalThemeScope localThemeScope2 = this.f855a;
                ri.j.h(localThemeScope2, new q1.Label(null, this.f855a.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 381, null), C6408b.a(this.f857c, composer, AbstractC5607a.f45514b), null, composer, (q1.Label.f140080j << 3) | i11, 4);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
            a(interfaceC14800I, composer, num.intValue());
            return Unit.f142422a;
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
    public static final void b(final Ji.LocalThemeScope r14, androidx.compose.ui.Modifier r15, androidx.compose.foundation.layout.C5658d.e r16, final ak.AbstractC5607a r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, ak.AbstractC5607a r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Am.X.b(Ji.M, androidx.compose.ui.Modifier, androidx.compose.foundation.layout.d$e, ak.a, kotlin.jvm.functions.Function0, ak.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, C5658d.e eVar, AbstractC5607a abstractC5607a, Function0 function0, AbstractC5607a abstractC5607a2, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, eVar, abstractC5607a, function0, abstractC5607a2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
