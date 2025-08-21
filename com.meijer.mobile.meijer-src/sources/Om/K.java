package Om;

import Ki.LocalThemeScope;
import Om.K;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.Locale;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16208z0;
import p1.C16338g;
import ti.C17265b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "message", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onDone", "onCallSupport", "b", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lastAction", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class K {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<ki.R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f24552a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24553b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24554c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f24555d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Om.K$a$a, reason: collision with other inner class name */
        static final class C0398a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f24556a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki.R0 f24557b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f24558c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f24559d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f24560e;

            C0398a(LocalThemeScope localThemeScope, ki.R0 r02, String str, Function0<Unit> function0, Function0<Unit> function02) {
                this.f24556a = localThemeScope;
                this.f24557b = r02;
                this.f24558c = str;
                this.f24559d = function0;
                this.f24560e = function02;
            }

            public final void c(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(824333742, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationErrorMessageModal.<anonymous>.<anonymous>.<anonymous> (SelfRemediationErrorMessageModal.kt:51)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, this.f24556a.getAdsSpacing().getSix().getDp(), 0.0f, 2, null);
                LocalThemeScope localThemeScope = this.f24556a;
                ki.R0 r02 = this.f24557b;
                String str = this.f24558c;
                final Function0<Unit> function0 = this.f24559d;
                final Function0<Unit> function02 = this.f24560e;
                C5800d c5800d = C5800d.f48779a;
                C5800d.m mVarH = c5800d.h();
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getSix().getDp()), composer, 0);
                q1.Label heading = r02.getLabels().getHeading();
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101163rd, composer, 0);
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, heading, strC, null, composer, i11 | (i12 << 3), 4);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                si.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), null, null, null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null), str, null, composer, i11 | (i12 << 3), 4);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
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
                C14890K.a(InterfaceC14888I.b(C14889J.f139620a, companion, 1.0f, false, 2, null), composer, 0);
                C16208z0 c16208z0 = C16208z0.f154285a;
                String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f100603P1, composer, 0);
                Locale locale = Locale.ROOT;
                String upperCase = strC2.toUpperCase(locale);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(function0);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Om.I
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.a.C0398a.d(function0);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                int i13 = C16208z0.f154286b;
                oi.P0.k(localThemeScope, c16208z0, upperCase, (Function0) objB, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
                String upperCase2 = C16338g.c(com.meijer.mobile.meijer.Y.f100315A3, composer, 0).toUpperCase(locale);
                Intrinsics.i(upperCase2, "toUpperCase(...)");
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(function02);
                Object objB2 = composer.B();
                if (zV2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Om.J
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return K.a.C0398a.e(function02);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                oi.P0.k(localThemeScope, c16208z0, upperCase2, (Function0) objB2, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
                composer.v();
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                c(composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, String str, Function0<Unit> function02) {
            this.f24552a = localThemeScope;
            this.f24553b = function0;
            this.f24554c = str;
            this.f24555d = function02;
        }

        public final void b(ki.R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1140060155, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.compose.selfremediation.SelfRemediationErrorMessageModal.<anonymous>.<anonymous> (SelfRemediationErrorMessageModal.kt:47)");
            }
            LocalThemeScope localThemeScope = this.f24552a;
            q1.ModalTemplate modalTemplateP = Assemble.getModalTemplate();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f24553b);
            final Function0<Unit> function0 = this.f24553b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Om.H
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return K.a.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17265b.b(localThemeScope, modalTemplateP, (Function0) objB, null, ComposableLambdaKt.c(824333742, true, new C0398a(this.f24552a, Assemble, this.f24554c, this.f24555d, this.f24553b), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ki.R0 r02, Composer composer, Integer num) {
            b(r02, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r14, final java.lang.String r15, androidx.compose.ui.Modifier r16, final kotlin.jvm.functions.Function0<kotlin.Unit> r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Om.K.b(Ki.M, java.lang.String, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, str, modifier, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
