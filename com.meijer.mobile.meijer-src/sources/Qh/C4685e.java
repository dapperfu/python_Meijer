package Qh;

import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import Yh.AccountInformationDecorator;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import bk.C6393b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.profile.a;
import com.meijer.mobile.accounts.ux.profile.p;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import ki.q1;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\r\u001a\u00020\u0007*\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u0013\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LYh/a;", "accountInformation", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/accounts/ux/profile/a;", "", "onResourceAction", "e", "(LKi/M;LYh/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lbk/a;", "loadingErrorMessage", "g", "(LKi/M;Lbk/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LKi/C;", BarcodePickDeserializer.FIELD_ICON, "", "label", "j", "(LKi/M;LKi/C;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Qh.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4685e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Qh.e$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28260a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AccountInformationDecorator f28261b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> f28262c;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, AccountInformationDecorator accountInformationDecorator, Function1<? super com.meijer.mobile.accounts.ux.profile.a, Unit> function1) {
            this.f28260a = localThemeScope;
            this.f28261b = accountInformationDecorator;
            this.f28262c = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1928287258, i10, -1, "com.meijer.mobile.accounts.ux.composables.profile.AccountInformationCard.<anonymous> (AccountInformationCard.kt:65)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            float f11 = 8;
            Modifier modifierL = androidx.compose.foundation.layout.D.l(companion, H1.h.p(f10), H1.h.p(f11), H1.h.p(f11), H1.h.p(24));
            LocalThemeScope localThemeScope = this.f28260a;
            AccountInformationDecorator accountInformationDecorator = this.f28261b;
            Function1<com.meijer.mobile.accounts.ux.profile.a, Unit> function1 = this.f28262c;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierL);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            AbstractC6392a loadingErrorMessage = accountInformationDecorator.getLoadingErrorMessage();
            int i11 = LocalThemeScope.f17314g;
            int i12 = AbstractC6392a.f60445b;
            C4685e.g(localThemeScope, loadingErrorMessage, null, function1, composer, i11 | (i12 << 3), 2);
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            if (C6393b.a(accountInformationDecorator.getLoadingErrorMessage())) {
                composer.startReplaceGroup(-1634351040);
                C4685e.j(localThemeScope, C.b.a.f.f16921e, accountInformationDecorator.getEmail().c().e(), null, composer, (C.b.a.f.f16922f << 3) | i11, 4);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.i(), composer, 48);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
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
                D1.c(composerA2, measurePolicyB, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14889J c14889j = C14889J.f139620a;
                C18054z0.a(C16335d.c(Gh.e.f12657v, composer, 0), C16338g.c(Gh.h.f12675B3, composer, 0), null, localThemeScope.getAdsColors().getAdsColorIcon02().getColor(), composer, 0, 4);
                C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(12)), composer, 6);
                MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
                int iA3 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, companion);
                Function0<InterfaceC5953g> function0A3 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = D1.a(composer);
                D1.c(composerA3, measurePolicyA2, companion3.e());
                D1.c(composerA3, interfaceC5884sR3, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion3.f());
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 383, null);
                String strC = C16338g.c(Gh.h.f12675B3, composer, 0);
                int i13 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, strC, null, composer, i11 | (i13 << 3), 4);
                si.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(companion), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null), C16338g.c(Gh.h.f13009x1, composer, 0), null, composer, i11 | (i13 << 3), 4);
                composer.v();
                composer.v();
                composer.P();
            } else {
                composer.startReplaceGroup(-1634619965);
                C4692l.b(localThemeScope, accountInformationDecorator.getLoadingErrorMessage(), c14903g.c(companion, companion2.g()), composer, (i12 << 3) | i11, 0);
                composer.P();
            }
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r18, final Yh.AccountInformationDecorator r19, androidx.compose.ui.Modifier r20, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.C4685e.e(Ki.M, Yh.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, AccountInformationDecorator accountInformationDecorator, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, accountInformationDecorator, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r28, final bk.AbstractC6392a r29, androidx.compose.ui.Modifier r30, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.accounts.ux.profile.a, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.C4685e.g(Ki.M, bk.a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function1 function1) {
        function1.invoke(new a.OnEditClick(p.a.f95839a));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, abstractC6392a, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final Ki.LocalThemeScope r29, final Ki.C r30, final java.lang.String r31, androidx.compose.ui.Modifier r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Qh.C4685e.j(Ki.M, Ki.C, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Ki.C c10, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, c10, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
