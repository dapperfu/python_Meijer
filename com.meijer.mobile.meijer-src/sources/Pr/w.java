package Pr;

import Ki.LocalThemeScope;
import Pr.w;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.Locale;
import ki.j1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.E0;
import p1.C16338g;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aY\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LKi/M;", "", "headerTitle", "headerCount", "Landroidx/compose/ui/Modifier;", "modifier", "", "h", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "imageUrl", "viewId", "imageDescription", "", "isSpecialOffers", "Lkotlin/Function0;", "onBannerClicked", "e", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "totalCouponsText", "j", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "coupon_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class w {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f26883a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC14902f f26884b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f26885c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pr.w$a$a, reason: collision with other inner class name */
        static final class C0494a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f26886a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f26887b;

            C0494a(LocalThemeScope localThemeScope, j1 j1Var) {
                this.f26886a = localThemeScope;
                this.f26887b = j1Var;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1903399202, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponBanner.<anonymous>.<anonymous>.<anonymous> (CouponListItemComposables.kt:117)");
                }
                LocalThemeScope localThemeScope = this.f26886a;
                q1.Label labelY = q1.Label.y(this.f26887b.getLabels().getEnabledLabel(), null, null, null, null, 0, false, 0, this.f26886a.getAdsTypography().getHeadings().getSeven().d(this.f26886a.getAdsColors().getAdsColorEnabled01()), null, 383, null);
                String upperCase = C16338g.c(Nr.g.f22655F, composer, 0).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, labelY, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

        a(LocalThemeScope localThemeScope, InterfaceC14902f interfaceC14902f, Function0<Unit> function0) {
            this.f26883a = localThemeScope;
            this.f26884b = interfaceC14902f;
            this.f26885c = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.f143329a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(902230645, i10, -1, "com.meijer.mobile.ui.coupon.composable.list.CouponBanner.<anonymous>.<anonymous> (CouponListItemComposables.kt:110)");
            }
            LocalThemeScope localThemeScope = this.f26883a;
            q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, this.f26884b.c(Modifier.INSTANCE, P0.e.INSTANCE.g()), false, null, 895, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f26885c);
            final Function0<Unit> function0 = this.f26885c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Pr.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(1903399202, true, new C0494a(this.f26883a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final java.lang.String r35, java.lang.String r36, java.lang.String r37, boolean r38, kotlin.jvm.functions.Function0<kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.w.e(Ki.M, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, String str3, boolean z10, Function0 function0, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, modifier, str, str2, str3, z10, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r27, final java.lang.String r28, final java.lang.String r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.w.h(Ki.M, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, String str, String str2, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, str, str2, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r29, final java.lang.String r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Pr.w.j(Ki.M, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
