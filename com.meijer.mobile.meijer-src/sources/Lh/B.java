package Lh;

import Ki.LocalThemeScope;
import Lh.B;
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
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import ki.InterfaceC15166e0;
import ki.q1;
import ki.s1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "", "isNotificationEnabled", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onToggleChanged", "b", "(LKi/M;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class B {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18435a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18436b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f18437c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Lh.B$a$a, reason: collision with other inner class name */
        static final class C0330a implements Function3<InterfaceC15166e0, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18438a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f18439b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f18440c;

            C0330a(LocalThemeScope localThemeScope, boolean z10, Function0<Unit> function0) {
                this.f18438a = localThemeScope;
                this.f18439b = z10;
                this.f18440c = function0;
            }

            public final void b(InterfaceC15166e0 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-1524136954, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.AppNotificationsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppNotificationsCard.kt:62)");
                }
                LocalThemeScope localThemeScope = this.f18438a;
                q1.s.Switch defaultToggleButton = Assemble.getToggleButtons().getDefaultToggleButton();
                boolean z10 = this.f18439b;
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f18440c);
                final Function0<Unit> function0 = this.f18440c;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Lh.A
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return B.a.C0330a.c(function0, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                wi.s.b(localThemeScope, defaultToggleButton, z10, true, false, (Function1) objB, composer, LocalThemeScope.f17314g | 3072 | (q1.s.Switch.f142438e << 3), 8);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15166e0 interfaceC15166e0, Composer composer, Integer num) {
                b(interfaceC15166e0, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function0 function0, boolean z10) {
                function0.invoke();
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, boolean z10, Function0<Unit> function0) {
            this.f18435a = localThemeScope;
            this.f18436b = z10;
            this.f18437c = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1304243437, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.AppNotificationsCard.<anonymous> (AppNotificationsCard.kt:50)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(companion, H1.h.p(32), H1.h.p(33));
            LocalThemeScope localThemeScope = this.f18435a;
            boolean z10 = this.f18436b;
            Function0<Unit> function0 = this.f18437c;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
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
            C5800d.f fVarE = c5800d.e();
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(fVarE, companion2.l(), composer, 6);
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
            C14889J c14889j = C14889J.f139620a;
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null);
            String strC = C16338g.c(Gh.h.f12965r, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            int i12 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
            Ki.Q.e(localThemeScope, s1.i.f142482a, ComposableLambdaKt.c(-1524136954, true, new C0330a(localThemeScope, z10, function0), composer, 54), composer, i11 | 384 | (s1.i.f142483b << 3));
            composer.v();
            float f10 = 8;
            C14890K.a(androidx.compose.foundation.layout.J.i(companion, H1.h.p(f10)), composer, 6);
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, 0.0f, H1.h.p(48), H1.h.p(f10), 3, null), localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), null, 380, null), C16338g.c(Gh.h.f13010x2, composer, 0), null, composer, i11 | (i12 << 3), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final Ki.LocalThemeScope r19, final boolean r20, androidx.compose.ui.Modifier r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.B.b(Ki.M, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, boolean z10, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, z10, modifier, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
