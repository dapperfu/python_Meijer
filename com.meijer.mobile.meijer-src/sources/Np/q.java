package Np;

import Ki.LocalThemeScope;
import Ki.Q;
import Np.q;
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

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u001aG\u0010\b\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "onCancelClicked", "onDiscardClicked", "onSaveClicked", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f22583a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f22584b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22585c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22586d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f22587e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Np.q$a$a, reason: collision with other inner class name */
        static final class C0374a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Modifier f22588a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f22589b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22590c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22591d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f22592e;

            C0374a(Modifier modifier, LocalThemeScope localThemeScope, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
                this.f22588a = modifier;
                this.f22589b = localThemeScope;
                this.f22590c = function0;
                this.f22591d = function02;
                this.f22592e = function03;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(2071478937, i10, -1, "com.meijer.mobile.scanner.ux.compose.UnsavedItemsDialogBox.<anonymous>.<anonymous> (UnsavedItemsDialogBox.kt:54)");
                }
                Modifier modifierI = D.i(this.f22588a, this.f22589b.getAdsSpacing().getSix().getDp());
                e.Companion companion = P0.e.INSTANCE;
                e.b bVarK = companion.k();
                LocalThemeScope localThemeScope = this.f22589b;
                Function0<Unit> function0 = this.f22590c;
                Function0<Unit> function02 = this.f22591d;
                Function0<Unit> function03 = this.f22592e;
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
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 383, null);
                String strC = C16338g.c(Mp.j.f20398i, composer, 0);
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, label, strC, null, composer, i11 | (i12 << 3), 4);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                C14890K.a(J.i(companion3, localThemeScope.getAdsSpacing().getFour().getDp()), composer, 0);
                si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 381, null), C16338g.c(Mp.j.f20397h, composer, 0), null, composer, i11 | (i12 << 3), 4);
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
                C14889J c14889j = C14889J.f139620a;
                C16208z0 c16208z0 = C16208z0.f154285a;
                String strC2 = C16338g.c(Mp.j.f20391b, composer, 0);
                Locale locale = Locale.ROOT;
                String upperCase = strC2.toUpperCase(locale);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                int i13 = C16208z0.f154286b;
                P0.k(localThemeScope, c16208z0, upperCase, function0, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
                C14890K.a(InterfaceC14888I.b(c14889j, companion3, 1.0f, false, 2, null), composer, 0);
                String upperCase2 = C16338g.c(Mp.j.f20393d, composer, 0).toUpperCase(locale);
                Intrinsics.i(upperCase2, "toUpperCase(...)");
                P0.k(localThemeScope, c16208z0, upperCase2, function02, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
                C14890K.a(J.z(companion3, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                String upperCase3 = C16338g.c(Mp.j.f20400k, composer, 0).toUpperCase(locale);
                Intrinsics.i(upperCase3, "toUpperCase(...)");
                P0.k(localThemeScope, c16208z0, upperCase3, function03, null, null, false, 0L, false, composer, i11 | (i13 << 3), 248);
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

        a(LocalThemeScope localThemeScope, Modifier modifier, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            this.f22583a = localThemeScope;
            this.f22584b = modifier;
            this.f22585c = function0;
            this.f22586d = function02;
            this.f22587e = function03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c() {
            return Unit.f143329a;
        }

        public final void b(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1863136934, i10, -1, "com.meijer.mobile.scanner.ux.compose.UnsavedItemsDialogBox.<anonymous> (UnsavedItemsDialogBox.kt:46)");
            }
            LocalThemeScope localThemeScope = this.f22583a;
            q1.ModalTemplate modalTemplateP = Assemble.getModalTemplate();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Np.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q.a.c();
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17265b.b(localThemeScope, modalTemplateP, (Function0) objB, null, ComposableLambdaKt.c(2071478937, true, new C0374a(this.f22584b, this.f22583a, this.f22585c, this.f22586d, this.f22587e), composer, 54), composer, LocalThemeScope.f17314g | 24960 | (q1.ModalTemplate.f142363d << 3), 4);
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

    public static final void b(final LocalThemeScope localThemeScope, Modifier modifier, final Function0<Unit> onCancelClicked, final Function0<Unit> onDiscardClicked, final Function0<Unit> onSaveClicked, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onCancelClicked, "onCancelClicked");
        Intrinsics.j(onDiscardClicked, "onDiscardClicked");
        Intrinsics.j(onSaveClicked, "onSaveClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(575594123);
        if ((i11 & Integer.MIN_VALUE) != 0) {
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
            i12 |= composerStartRestartGroup.D(onCancelClicked) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.D(onDiscardClicked) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onSaveClicked) ? 16384 : 8192;
        }
        int i14 = i12;
        if ((i14 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(575594123, i14, -1, "com.meijer.mobile.scanner.ux.compose.UnsavedItemsDialogBox (UnsavedItemsDialogBox.kt:44)");
            }
            Q.e(localThemeScope, C15158a0.f142009a, ComposableLambdaKt.c(1863136934, true, new a(localThemeScope, modifier2, onCancelClicked, onDiscardClicked, onSaveClicked), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 384 | (i14 & 14) | (C15158a0.f142010b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Np.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q.c(localThemeScope, modifier2, onCancelClicked, onDiscardClicked, onSaveClicked, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, Function0 function02, Function0 function03, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, function0, function02, function03, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
