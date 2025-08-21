package ws;

import F1.j;
import Ki.I;
import Ki.LocalThemeScope;
import android.content.Context;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import c5.C6484c;
import com.fullstory.compose.FullStoryAnnotationsKt;
import dk.C13698b;
import j0.C14890K;
import j0.InterfaceC14902f;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import p1.C16338g;
import r0.C16806i;
import r1.C16819m;
import ws.C17923g;
import xs.C18219a;
import yr.W;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lxs/a;", "decorator", "", "shopperRating", "Lkotlin/Function1;", "", "onRatingChanged", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lxs/a;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rateandtip_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ws.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C17923g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ws.g$a */
    static final class a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f167539a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C18219a f167540b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f167541c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f167542d;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, C18219a c18219a, int i10, Function1<? super Integer, Unit> function1) {
            this.f167539a = localThemeScope;
            this.f167540b = c18219a;
            this.f167541c = i10;
            this.f167542d = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
            return Unit.f143329a;
        }

        public final void b(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(324034328, i10, -1, "com.meijer.mobile.ui.rateandtip.RateScreen.<anonymous> (RateScreen.kt:64)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            C14890K.a(J.i(companion, this.f167539a.getAdsSpacing().getNine().getDp()), composer, 0);
            C15669h.a aVar = new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            C18219a c18219a = this.f167540b;
            C6484c.e(aVar.f(c18219a != null ? c18219a.getShopperImageURL() : null).e(true).p(C17918b.f167503a).j(C17918b.f167503a).c(), C16338g.c(C17920d.f167518m, composer, 0), a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())), FullStoryAnnotationsKt.fsMask(T0.e.a(J.v(companion, H1.h.p(72)), C16806i.c(H1.h.p(36)))), null, null, null, InterfaceC5926k.INSTANCE.a(), 0.0f, null, 0, false, null, composer, 12582912, 0, 8048);
            C14890K.a(J.i(companion, this.f167539a.getAdsSpacing().getFive().getDp()), composer, 0);
            LocalThemeScope localThemeScope = this.f167539a;
            Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 2, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: ws.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C17923g.a.c((r1.u) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            Modifier modifierFsMask = FullStoryAnnotationsKt.fsMask(C16819m.d(modifierK, false, (Function1) objB, 1, null));
            I six = this.f167539a.getAdsTypography().getHeadings().getSix();
            j.Companion companion2 = F1.j.INSTANCE;
            q1.Label label = new q1.Label(modifierFsMask, null, null, F1.j.h(companion2.a()), 0, false, 0, six, null, 374, null);
            C18219a c18219a2 = this.f167540b;
            AbstractC6392a shopperName = c18219a2 != null ? c18219a2.getShopperName() : null;
            int i11 = AbstractC6392a.f60445b;
            String strA = C13698b.a(shopperName, composer, i11);
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            LocalThemeScope localThemeScope2 = this.f167539a;
            q1.Label label2 = new q1.Label(androidx.compose.foundation.layout.D.k(companion, localThemeScope2.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), this.f167539a.getAdsColors().getAdsColorText02(), null, F1.j.h(companion2.a()), 0, false, 0, this.f167539a.getAdsTypography().getBodyCompact().getOne(), null, 372, null);
            C18219a c18219a3 = this.f167540b;
            si.j.h(localThemeScope2, label2, C13698b.a(c18219a3 != null ? c18219a3.getFeedbackMessage() : null, composer, i11), null, composer, i12 | (i13 << 3), 4);
            C14890K.a(J.i(companion, this.f167539a.getAdsSpacing().getEight().getDp()), composer, 0);
            W.c(this.f167539a, this.f167541c, null, 0, this.f167542d, composer, i12, 6);
            C14890K.a(J.i(companion, H1.h.p(16)), composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            b(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
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
    public static final void b(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final xs.C18219a r20, final int r21, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ws.C17923g.b(Ki.M, androidx.compose.ui.Modifier, xs.a, int, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, C18219a c18219a, int i10, Function1 function1, int i11, int i12, Composer composer, int i13) {
        b(localThemeScope, modifier, c18219a, i10, function1, composer, J0.a(i11 | 1), i12);
        return Unit.f143329a;
    }
}
