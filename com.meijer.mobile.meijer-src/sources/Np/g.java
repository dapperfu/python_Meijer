package Np;

import Ki.LocalThemeScope;
import Ki.Q;
import Np.g;
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
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
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

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onDismissClicked", "onChangePermissionClicked", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f22525a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f22526b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22527c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22528d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Np.g$a$a, reason: collision with other inner class name */
        static final class C0373a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f22529a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f22530b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22531c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22532d;

            C0373a(Modifier modifier, LocalThemeScope localThemeScope, Function0<Unit> function0, Function0<Unit> function02) {
                this.f22529a = modifier;
                this.f22530b = localThemeScope;
                this.f22531c = function0;
                this.f22532d = function02;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1079784275, i10, -1, "com.meijer.mobile.scanner.ux.compose.CameraPermissionDeclinedDialogBox.<anonymous>.<anonymous> (CameraPermissionDeclinedDialogBox.kt:53)");
                }
                Modifier modifierI = D.i(this.f22529a, this.f22530b.getAdsSpacing().getSix().getDp());
                e.Companion companion = P0.e.INSTANCE;
                e.b bVarK = companion.k();
                LocalThemeScope localThemeScope = this.f22530b;
                Function0<Unit> function0 = this.f22531c;
                Function0<Unit> function02 = this.f22532d;
                C5800d c5800d = C5800d.f48779a;
                MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), bVarK, composer, 48);
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
                q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null);
                String strC = C16338g.c(Mp.j.f20402m, composer, 0);
                int i11 = LocalThemeScope.f17314g;
                si.j.h(localThemeScope, label, strC, null, composer, i11 | (q1.Label.f142335j << 3), 4);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getEight().getDp()), composer, 0);
                MeasurePolicy measurePolicyB = G.b(c5800d.g(), companion.l(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion3);
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
                C14890K.a(InterfaceC14888I.b(C14889J.f139620a, companion3, 1.0f, false, 2, null), composer, 0);
                C16208z0 c16208z0 = C16208z0.f154285a;
                String strC2 = C16338g.c(Mp.j.f20394e, composer, 0);
                Locale locale = Locale.ROOT;
                String upperCase = strC2.toUpperCase(locale);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                int i12 = C16208z0.f154286b;
                P0.k(localThemeScope, c16208z0, upperCase, function0, null, null, false, 0L, false, composer, i11 | (i12 << 3), 248);
                C14890K.a(J.z(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                String upperCase2 = C16338g.c(Mp.j.f20392c, composer, 0).toUpperCase(locale);
                Intrinsics.i(upperCase2, "toUpperCase(...)");
                P0.k(localThemeScope, c16208z0, upperCase2, function02, null, null, false, 0L, false, composer, i11 | (i12 << 3), 248);
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
            this.f22525a = localThemeScope;
            this.f22526b = modifier;
            this.f22527c = function0;
            this.f22528d = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() {
            return Unit.f143329a;
        }

        public final void b(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1851644422, i10, -1, "com.meijer.mobile.scanner.ux.compose.CameraPermissionDeclinedDialogBox.<anonymous> (CameraPermissionDeclinedDialogBox.kt:45)");
            }
            LocalThemeScope localThemeScope = this.f22525a;
            q1.ModalTemplate modalTemplateP = Assemble.getModalTemplate();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Np.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.a.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17265b.b(localThemeScope, modalTemplateP, (Function0) objB, null, ComposableLambdaKt.c(-1079784275, true, new C0373a(this.f22526b, this.f22525a, this.f22527c, this.f22528d), composer, 54), composer, LocalThemeScope.f17314g | 24960 | (q1.ModalTemplate.f142363d << 3), 4);
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

    public static final void b(final LocalThemeScope localThemeScope, Modifier modifier, final Function0<Unit> onDismissClicked, final Function0<Unit> onChangePermissionClicked, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onDismissClicked, "onDismissClicked");
        Intrinsics.j(onChangePermissionClicked, "onChangePermissionClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2101765857);
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
            i12 |= composerStartRestartGroup.D(onDismissClicked) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onChangePermissionClicked) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2101765857, i12, -1, "com.meijer.mobile.scanner.ux.compose.CameraPermissionDeclinedDialogBox (CameraPermissionDeclinedDialogBox.kt:43)");
            }
            Q.e(localThemeScope, C15158a0.f142009a, ComposableLambdaKt.c(-1851644422, true, new a(localThemeScope, modifier, onDismissClicked, onChangePermissionClicked), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (C15158a0.f142010b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Np.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.c(localThemeScope, modifier2, onDismissClicked, onChangePermissionClicked, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
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
