package com.meijer.mobile.reviews.ux.rateandreview;

import Ji.C;
import Ji.LocalThemeScope;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import com.meijer.mobile.reviews.ux.rateandreview.C12784m0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pi.C16307b;
import r1.C16705m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u001aE\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "toolbarTitle", "Lkotlin/Function0;", "", "onBackPressed", "iconButtonLabel", "", "isCloseNavigateButton", "d", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "h", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "string", "f", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.reviews.ux.rateandreview.m0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C12784m0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.m0$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116401a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f116402b;

        a(LocalThemeScope localThemeScope, String str) {
            this.f116401a = localThemeScope;
            this.f116402b = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-40280445, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.AppBar.<anonymous> (RateTermsAndConditionsScreen.kt:60)");
            }
            LocalThemeScope localThemeScope = this.f116401a;
            ri.j.h(localThemeScope, new q1.Label(null, this.f116401a.getAdsColors().getAdsColorInverse(), null, null, F1.t.INSTANCE.b(), false, 1, localThemeScope.getAdsTypography().getHeadings().getSix(), null, HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY, null), this.f116402b, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.reviews.ux.rateandreview.m0$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f116403a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f116404b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f116405c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f116406d;

        b(LocalThemeScope localThemeScope, boolean z10, String str, Function0<Unit> function0) {
            this.f116403a = localThemeScope;
            this.f116404b = z10;
            this.f116405c = str;
            this.f116406d = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(String str, r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.s0(semantics, Role.INSTANCE.a());
            r1.s.g0(semantics, str);
            return Unit.f142422a;
        }

        public final void c(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(487113605, i10, -1, "com.meijer.mobile.reviews.ux.rateandreview.AppBar.<anonymous> (RateTermsAndConditionsScreen.kt:71)");
            }
            LocalThemeScope localThemeScope = this.f116403a;
            Ji.C c10 = this.f116404b ? C.f.o.f15522e : C.f.d.f15507e;
            Ji.T adsColorUIBackground01 = localThemeScope.getAdsColors().getAdsColorUIBackground01();
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f116405c);
            final String str = this.f116405c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.reviews.ux.rateandreview.n0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C12784m0.b.d(str, (r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierD = C16705m.d(companion, false, (Function1) objB, 1, null);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f116406d);
            final Function0<Unit> function0 = this.f116406d;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.reviews.ux.rateandreview.o0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C12784m0.b.e(function0);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C16307b.b(localThemeScope, new q1.h.DrawableIcon(c10, null, null, null, 0.0f, adsColorUIBackground01, androidx.compose.foundation.layout.D.m(ClickableKt.d(modifierD, false, null, null, (Function0) objB2, 7, null), H1.h.p(8), 0.0f, 0.0f, 0.0f, 14, null), 30, null), null, null, composer, LocalThemeScope.f15770g | (q1.h.DrawableIcon.f140067h << 3), 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0222 A[LOOP:0: B:52:0x021f->B:54:0x0222, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0295 A[LOOP:1: B:56:0x0292->B:58:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(Ji.LocalThemeScope r42, androidx.compose.ui.Modifier r43, androidx.compose.runtime.Composer r44, final int r45, final int r46) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.C12784m0.h(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final Ji.LocalThemeScope r20, androidx.compose.ui.Modifier r21, final java.lang.String r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, final java.lang.String r24, boolean r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.C12784m0.d(Ji.M, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, Modifier modifier, String str, Function0 function0, String str2, boolean z10, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, modifier, str, function0, str2, z10, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r28, androidx.compose.ui.Modifier r29, final java.lang.String r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.rateandreview.C12784m0.f(Ji.M, androidx.compose.ui.Modifier, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, modifier, str, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        h(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
