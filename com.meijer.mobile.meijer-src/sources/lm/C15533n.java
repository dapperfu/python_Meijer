package lm;

import F1.j;
import Ki.LocalThemeScope;
import Ki.Q;
import P0.e;
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
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.home.ux.r0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
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
import lm.C15533n;
import oi.C16208z0;
import oi.P0;
import p1.C16338g;
import ti.C17265b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onAccept", "onDeny", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: lm.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C15533n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: lm.n$a */
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f149818a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f149819b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149820c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f149821d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: lm.n$a$a, reason: collision with other inner class name */
        static final class C2310a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f149822a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f149823b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ R0 f149824c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f149825d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f149826e;

            C2310a(Modifier modifier, LocalThemeScope localThemeScope, R0 r02, Function0<Unit> function0, Function0<Unit> function02) {
                this.f149822a = modifier;
                this.f149823b = localThemeScope;
                this.f149824c = r02;
                this.f149825d = function0;
                this.f149826e = function02;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1604809869, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.NotificationPermissionDialog.<anonymous>.<anonymous> (NotificationPermissionDialog.kt:52)");
                }
                Modifier modifierI = D.i(this.f149822a, this.f149823b.getAdsSpacing().getFive().getDp());
                LocalThemeScope localThemeScope = this.f149823b;
                R0 r02 = this.f149824c;
                Function0<Unit> function0 = this.f149825d;
                Function0<Unit> function02 = this.f149826e;
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
                String strC = C16338g.c(r0.f99354m, composer, 0);
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, labelY, strC, null, composer, i11 | (i12 << 3), 4);
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
                si.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), null, null, null, F1.j.h(companion4.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_SERVICE_UNAVAILABLE, null), C16338g.c(r0.f99350i, composer, 0), null, composer, i11 | (i12 << 3), 4);
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
                String strC2 = C16338g.c(r0.f99352k, composer, 0);
                int i13 = C16208z0.f154286b;
                P0.k(localThemeScope, c16208z0, strC2, function0, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
                P0.k(localThemeScope, c16208z0, C16338g.c(r0.f99353l, composer, 0), function02, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
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

        a(LocalThemeScope localThemeScope, Modifier modifier, Function0<Unit> function0, Function0<Unit> function02) {
            this.f149818a = localThemeScope;
            this.f149819b = modifier;
            this.f149820c = function0;
            this.f149821d = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() {
            return Unit.f143329a;
        }

        public final void b(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-725167104, i10, -1, "com.meijer.mobile.home.ux.views.alertdialogs.NotificationPermissionDialog.<anonymous> (NotificationPermissionDialog.kt:47)");
            }
            LocalThemeScope localThemeScope = this.f149818a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: lm.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15533n.a.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17265b.b(localThemeScope, modalTemplate, (Function0) objB, null, ComposableLambdaKt.c(-1604809869, true, new C2310a(this.f149819b, this.f149818a, Assemble, this.f149820c, this.f149821d), composer, 54), composer, LocalThemeScope.f17314g | 24960 | (q1.ModalTemplate.f142363d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            b(r02, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, Modifier modifier, final Function0<Unit> onAccept, final Function0<Unit> onDeny, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onAccept, "onAccept");
        Intrinsics.j(onDeny, "onDeny");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2097492891);
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
            i12 |= composerStartRestartGroup.D(onAccept) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onDeny) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2097492891, i12, -1, "com.meijer.mobile.home.ux.views.alertdialogs.NotificationPermissionDialog (NotificationPermissionDialog.kt:45)");
            }
            Q.e(localThemeScope, C15158a0.f142009a, ComposableLambdaKt.c(-725167104, true, new a(localThemeScope, modifier, onDeny, onAccept), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (C15158a0.f142010b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lm.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15533n.c(localThemeScope, modifier2, onAccept, onDeny, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
