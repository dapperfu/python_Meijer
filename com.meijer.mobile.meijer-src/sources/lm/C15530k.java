package lm;

import F1.j;
import Ki.LocalThemeScope;
import Ki.Q;
import P0.e;
import android.R;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.meijer.mobile.home.ux.r0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import java.util.Locale;
import ki.C15158a0;
import ki.R0;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oi.C16208z0;
import oi.P0;
import p1.C16338g;
import ti.C17265b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onDismissRequest", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: lm.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15530k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lm.k$a */
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149805a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149806b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Modifier f149807c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: lm.k$a$a, reason: collision with other inner class name */
        static final class C2309a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f149808a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f149809b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ R0 f149810c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f149811d;

            C2309a(Modifier modifier, LocalThemeScope localThemeScope, R0 r02, Function0<Unit> function0) {
                this.f149808a = modifier;
                this.f149809b = localThemeScope;
                this.f149810c = r02;
                this.f149811d = function0;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1055050753, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.NotificationPermissionDeniedPrimerDialog.<anonymous>.<anonymous> (NotificationPermissionDeniedPrimerDialog.kt:51)");
                }
                Modifier modifierI = D.i(this.f149808a, this.f149809b.getAdsSpacing().getFive().getDp());
                LocalThemeScope localThemeScope = this.f149809b;
                R0 r02 = this.f149810c;
                Function0<Unit> function0 = this.f149811d;
                C5800d c5800d = C5800d.f48779a;
                C5800d.m mVarH = c5800d.h();
                e.Companion companion = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
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
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                q1.Label heading = r02.getLabels().getHeading();
                j.Companion companion4 = F1.j.INSTANCE;
                q1.Label labelY = q1.Label.y(heading, null, null, null, F1.j.h(companion4.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null);
                String strC = C16338g.c(r0.f99355n, composer, 0);
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, labelY, strC, null, composer, i11 | (i12 << 3), 4);
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
                si.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), null, null, null, F1.j.h(companion4.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null), C16338g.c(r0.f99351j, composer, 0), null, composer, i11 | (i12 << 3), 4);
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getSeven().getDp()), composer, 0);
                C5800d.e eVarC = c5800d.c();
                Modifier modifierH = J.h(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = G.b(eVarC, companion.l(), composer, 6);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
                Function0<InterfaceC5953g> function0A2 = companion2.a();
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
                D1.c(composerA2, measurePolicyB, companion2.e());
                D1.c(composerA2, interfaceC5884sR2, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion2.f());
                C14889J c14889j = C14889J.f139620a;
                C16208z0 c16208z0 = C16208z0.f154285a;
                String upperCase = C16338g.c(R.string.ok, composer, 6).toUpperCase(Locale.ROOT);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                P0.k(localThemeScope, c16208z0, upperCase, function0, null, null, false, 0L, false, composer, i11 | (C16208z0.f154286b << 3), 248);
                composer.v();
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

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, Modifier modifier) {
            this.f149805a = localThemeScope;
            this.f149806b = function0;
            this.f149807c = modifier;
        }

        public final void a(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-792264244, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.NotificationPermissionDeniedPrimerDialog.<anonymous> (NotificationPermissionDeniedPrimerDialog.kt:47)");
            }
            LocalThemeScope localThemeScope = this.f149805a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            Function0<Unit> function0 = this.f149806b;
            C17265b.b(localThemeScope, modalTemplate, function0, null, ComposableLambdaKt.c(-1055050753, true, new C2309a(this.f149807c, this.f149805a, Assemble, function0), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            a(r02, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, Modifier modifier, final Function0<Unit> onDismissRequest, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(741991793);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(onDismissRequest) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(741991793, i12, -1, "com.meijer.mobile.home.ux.views.alertdialogs.NotificationPermissionDeniedPrimerDialog (NotificationPermissionDeniedPrimerDialog.kt:45)");
            }
            Q.e(localThemeScope, C15158a0.f142009a, ComposableLambdaKt.c(-792264244, true, new a(localThemeScope, onDismissRequest, modifier), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (C15158a0.f142010b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lm.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15530k.c(localThemeScope, modifier2, onDismissRequest, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
