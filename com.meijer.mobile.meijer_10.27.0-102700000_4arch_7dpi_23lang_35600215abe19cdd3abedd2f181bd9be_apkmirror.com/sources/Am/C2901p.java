package Am;

import Am.C2901p;
import Ji.LocalThemeScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import j0.C14802K;
import j0.InterfaceC14800I;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a?\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "cardType", "actionText", "Lkotlin/Function0;", "", "onActionTextClicked", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Am.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C2901p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Am.p$a */
    static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f1023a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1024b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f1025c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f1026d;

        a(LocalThemeScope localThemeScope, String str, String str2, Function0<Unit> function0) {
            this.f1023a = localThemeScope;
            this.f1024b = str;
            this.f1025c = str2;
            this.f1026d = function0;
        }

        public final void b(InterfaceC14800I AdsRow, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(AdsRow) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(578356931, i11, -1, "com.meijer.mobile.meijer.activity.checkout.composables.CardHeaderSection.<anonymous> (CardHeaderSection.kt:43)");
            }
            LocalThemeScope localThemeScope = this.f1023a;
            q1.Label label = new q1.Label(null, this.f1023a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 381, null);
            String str = this.f1024b;
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, str, null, composer, i12 | (i13 << 3), 4);
            Modifier.Companion companion = Modifier.INSTANCE;
            C14802K.a(InterfaceC14800I.b(AdsRow, companion, 1.0f, false, 2, null), composer, 0);
            if (this.f1025c.length() > 0) {
                LocalThemeScope localThemeScope2 = this.f1023a;
                Ji.I seven = localThemeScope2.getAdsTypography().getHeadings().getSeven();
                Ji.T adsColorBrandPrimary = this.f1023a.getAdsColors().getAdsColorBrandPrimary();
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f1026d);
                final Function0<Unit> function0 = this.f1026d;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Am.o
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C2901p.a.c(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                ri.j.h(localThemeScope2, new q1.Label(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), adsColorBrandPrimary, null, null, 0, false, 0, seven, null, 380, null), this.f1025c, null, composer, i12 | (i13 << 3), 4);
            }
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r14, androidx.compose.ui.Modifier r15, java.lang.String r16, java.lang.String r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Am.C2901p.b(Ji.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, Function0 function0, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, str, str2, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
