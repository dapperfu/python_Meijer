package ws;

import F1.j;
import Ji.I;
import Ji.LocalThemeScope;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.C6197c;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import j0.C14802K;
import j0.InterfaceC14814f;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.C15372h;
import p1.C16193g;
import r0.C16692i;
import r1.C16705m;
import ws.C17861g;
import xs.C18091a;
import yr.W;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lxs/a;", "decorator", "", "shopperRating", "Lkotlin/Function1;", "", "onRatingChanged", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Lxs/a;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rateandtip_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ws.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C17861g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ws.g$a */
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f166471a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18091a f166472b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f166473c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f166474d;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, C18091a c18091a, int i10, Function1<? super Integer, Unit> function1) {
            this.f166471a = localThemeScope;
            this.f166472b = c18091a;
            this.f166473c = i10;
            this.f166474d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f142422a;
        }

        public final void b(InterfaceC14814f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(324034328, i10, -1, "com.meijer.mobile.ui.rateandtip.RateScreen.<anonymous> (RateScreen.kt:64)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C14802K.a(J.i(companion, this.f166471a.getAdsSpacing().getNine().getDp()), composer, 0);
            C15372h.a aVar = new C15372h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            C18091a c18091a = this.f166472b;
            C6197c.e(aVar.f(c18091a != null ? c18091a.getShopperImageURL() : null).e(true).p(C17856b.f166435a).j(C17856b.f166435a).c(), C16193g.c(C17858d.f166450m, composer, 0), Z4.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), FullStoryAnnotationsKt.fsMask(T0.e.a(J.v(companion, H1.h.p(72)), C16692i.c(H1.h.p(36)))), null, null, null, InterfaceC5784k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 12582912, 0, 8048);
            C14802K.a(J.i(companion, this.f166471a.getAdsSpacing().getFive().getDp()), composer, 0);
            LocalThemeScope localThemeScope = this.f166471a;
            Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: ws.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17861g.a.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(C16705m.d(modifierK, false, (Function1) objB, 1, null));
            I six = this.f166471a.getAdsTypography().getHeadings().getSix();
            j.Companion companion2 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(modifierFsMask, null, null, F1.j.h(companion2.a()), 0, false, 0, six, null, 374, null);
            C18091a c18091a2 = this.f166472b;
            AbstractC5607a shopperName = c18091a2 != null ? c18091a2.getShopperName() : null;
            int i11 = AbstractC5607a.f45514b;
            String strA = C6408b.a(shopperName, composer, i11);
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f166471a;
            q1.Label label2 = new q1.Label(androidx.compose.foundation.layout.D.k(companion, localThemeScope2.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), this.f166471a.getAdsColors().getAdsColorText02(), null, F1.j.h(companion2.a()), 0, false, 0, this.f166471a.getAdsTypography().getBodyCompact().getOne(), null, 372, null);
            C18091a c18091a3 = this.f166472b;
            ri.j.h(localThemeScope2, label2, C6408b.a(c18091a3 != null ? c18091a3.getFeedbackMessage() : null, composer, i11), null, composer, i12 | (i13 << 3), 4);
            C14802K.a(J.i(companion, this.f166471a.getAdsSpacing().getEight().getDp()), composer, 0);
            W.c(this.f166471a, this.f166473c, null, 0, this.f166474d, composer, i12, 6);
            C14802K.a(J.i(companion, H1.h.p(16)), composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            b(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final xs.C18091a r20, final int r21, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws.C17861g.b(Ji.M, androidx.compose.ui.Modifier, xs.a, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, C18091a c18091a, int i10, Function1 function1, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, c18091a, i10, function1, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }
}
