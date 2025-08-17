package Np;

import Ji.LocalThemeScope;
import Ji.Q;
import Np.g;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.util.Locale;
import ji.C14924a0;
import ji.R0;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ni.C15874z0;
import ni.P0;
import p1.C16193g;
import si.C16977b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onDismissClicked", "onChangePermissionClicked", "b", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f22569a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f22570b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22571c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22572d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Np.g$a$a, reason: collision with other inner class name */
        static final class C0368a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f22573a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f22574b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22575c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22576d;

            C0368a(Modifier modifier, LocalThemeScope localThemeScope, Function0<Unit> function0, Function0<Unit> function02) {
                this.f22573a = modifier;
                this.f22574b = localThemeScope;
                this.f22575c = function0;
                this.f22576d = function02;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1079784275, i10, -1, "com.meijer.mobile.scanner.ux.compose.CameraPermissionDeclinedDialogBox.<anonymous>.<anonymous> (CameraPermissionDeclinedDialogBox.kt:53)");
                }
                Modifier modifierI = D.i(this.f22573a, this.f22574b.getAdsSpacing().getSix().getDp());
                e.Companion companion = P0.e.INSTANCE;
                e.b bVarK = companion.k();
                LocalThemeScope localThemeScope = this.f22574b;
                Function0<Unit> function0 = this.f22575c;
                Function0<Unit> function02 = this.f22576d;
                C5658d c5658d = C5658d.f48555a;
                MeasurePolicy measurePolicyA = C5665k.a(c5658d.h(), bVarK, composer, 48);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5742sR, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                q1.Label label = new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null);
                String strC = C16193g.c(Mp.j.f21203m, composer, 0);
                int i11 = LocalThemeScope.f15770g;
                ri.j.h(localThemeScope, label, strC, null, composer, i11 | (q1.Label.f140080j << 3), 4);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                C14802K.a(J.i(companion3, localThemeScope.getAdsSpacing().getEight().getDp()), composer, 0);
                MeasurePolicy measurePolicyB = G.b(c5658d.g(), companion.l(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion3);
                Function0<InterfaceC5811g> function0A2 = companion2.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyB, companion2.e());
                D1.c(composerA2, interfaceC5742sR2, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion2.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion2.f());
                C14802K.a(InterfaceC14800I.b(C14801J.f139030a, companion3, 1.0f, false, 2, null), composer, 0);
                C15874z0 c15874z0 = C15874z0.f151826a;
                String strC2 = C16193g.c(Mp.j.f21195e, composer, 0);
                Locale locale = Locale.ROOT;
                String upperCase = strC2.toUpperCase(locale);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                int i12 = C15874z0.f151827b;
                P0.k(localThemeScope, c15874z0, upperCase, function0, null, null, false, 0L, false, composer, i11 | (i12 << 3), 248);
                C14802K.a(J.z(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                String upperCase2 = C16193g.c(Mp.j.f21193c, composer, 0).toUpperCase(locale);
                Intrinsics.i(upperCase2, "toUpperCase(...)");
                P0.k(localThemeScope, c15874z0, upperCase2, function02, null, null, false, 0L, false, composer, i11 | (i12 << 3), 248);
                composer.v();
                composer.v();
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

        a(LocalThemeScope localThemeScope, Modifier modifier, Function0<Unit> function0, Function0<Unit> function02) {
            this.f22569a = localThemeScope;
            this.f22570b = modifier;
            this.f22571c = function0;
            this.f22572d = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() {
            return Unit.f142422a;
        }

        public final void b(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1851644422, i10, -1, "com.meijer.mobile.scanner.ux.compose.CameraPermissionDeclinedDialogBox.<anonymous> (CameraPermissionDeclinedDialogBox.kt:45)");
            }
            LocalThemeScope localThemeScope = this.f22569a;
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
            C16977b.b(localThemeScope, modalTemplateP, (Function0) objB, null, ComposableLambdaKt.c(-1079784275, true, new C0368a(this.f22570b, this.f22569a, this.f22571c, this.f22572d), composer, 54), composer, LocalThemeScope.f15770g | 24960 | (q1.ModalTemplate.f140108d << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(R0 r02, Composer composer, Integer num) {
            b(r02, composer, num.intValue());
            return Unit.f142422a;
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
            Q.e(localThemeScope, C14924a0.f139754a, ComposableLambdaKt.c(-1851644422, true, new a(localThemeScope, modifier, onDismissClicked, onChangePermissionClicked), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (C14924a0.f139755b << 3));
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
        return Unit.f142422a;
    }
}
