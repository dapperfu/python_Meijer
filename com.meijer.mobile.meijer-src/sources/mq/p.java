package mq;

import Ki.LocalThemeScope;
import Ki.Q;
import Ki.T;
import P0.e;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import eq.Asset;
import eq.C13838d;
import j0.C14889J;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import java.util.List;
import ki.C15158a0;
import ki.InterfaceC15154X;
import ki.InterfaceC15205y;
import ki.Q0;
import ki.R0;
import ki.j1;
import ki.q1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.InterfaceC15433c;
import mq.p;
import mq.y;
import mv.InterfaceC15783O;
import oi.E0;
import p1.C16338g;
import pv.C16563h;
import pv.P;
import ti.C17265b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001f\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006!²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Lmq/y;", "viewModel", "Landroidx/compose/ui/Modifier;", "modifier", "", "F", "(LKi/M;Lmq/y;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lmq/y$c;", "viewState", "Lkotlin/Function1;", "Lmq/y$b;", "sendEvent", "D", "(LKi/M;Lmq/y$c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "showDeveloperOptions", "u", "(LKi/M;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lmq/a;", "option", "LKi/T;", "textColor", "LV0/q0;", "iconColor", "s", "(LKi/M;Landroidx/compose/ui/Modifier;Lmq/a;LKi/T;JLandroidx/compose/runtime/Composer;II)V", "q", "(LKi/M;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "loadingText", "o", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151383a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f151384b;

        a(LocalThemeScope localThemeScope, String str) {
            this.f151383a = localThemeScope;
            this.f151384b = str;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-878638448, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.CancelTripLoadingSpinner.<anonymous>.<anonymous> (ShopAndScanOptionsMenuScreen.kt:372)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            Ci.m.d(this.f151383a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, Ci.o.f4629a, this.f151384b, null, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.Large.f142345f << 6), 48);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<R0, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151385a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<y.b, Unit> f151386b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151387a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ R0 f151388b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1<y.b, Unit> f151389c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: mq.p$b$a$a, reason: collision with other inner class name */
            static final class C2328a implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f151390a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function1<y.b, Unit> f151391b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: mq.p$b$a$a$a, reason: collision with other inner class name */
                static final class C2329a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f151392a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ j1 f151393b;

                    C2329a(LocalThemeScope localThemeScope, j1 j1Var) {
                        this.f151392a = localThemeScope;
                        this.f151393b = j1Var;
                    }

                    public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-1657398661, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.CancelTripModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopAndScanOptionsMenuScreen.kt:338)");
                        }
                        si.j.h(this.f151392a, this.f151393b.getLabels().getEnabledLabel(), C16338g.c(com.meijer.mobile.shopandscan.e.f117898Z0, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                        a(interfaceC14888I, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C2328a(LocalThemeScope localThemeScope, Function1<? super y.b, Unit> function1) {
                    this.f151390a = localThemeScope;
                    this.f151391b = function1;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(Function1 function1) {
                    function1.invoke(y.b.C2333b.f151436a);
                    return Unit.f143329a;
                }

                public final void b(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(1201426894, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.CancelTripModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopAndScanOptionsMenuScreen.kt:331)");
                    }
                    LocalThemeScope localThemeScope = this.f151390a;
                    q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(50)), 0.0f, 0.0f, H1.h.p(20), 0.0f, 11, null), false, null, 895, null);
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f151391b);
                    final Function1<y.b, Unit> function1 = this.f151391b;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: mq.r
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return p.b.a.C2328a.c(function1);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-1657398661, true, new C2329a(this.f151390a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                    b(j1Var, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: mq.p$b$a$b, reason: collision with other inner class name */
            static final class C2330b implements Function3<j1, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f151394a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Function1<y.b, Unit> f151395b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: mq.p$b$a$b$a, reason: collision with other inner class name */
                static final class C2331a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f151396a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ j1 f151397b;

                    C2331a(LocalThemeScope localThemeScope, j1 j1Var) {
                        this.f151396a = localThemeScope;
                        this.f151397b = j1Var;
                    }

                    public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                        Intrinsics.j(AdsButton, "$this$AdsButton");
                        if ((i10 & 17) == 16 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(627068082, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.CancelTripModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopAndScanOptionsMenuScreen.kt:353)");
                        }
                        si.j.h(this.f151396a, this.f151397b.getLabels().getDestructiveLabel(), C16338g.c(com.meijer.mobile.shopandscan.e.f117901a1, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                        a(interfaceC14888I, composer, num.intValue());
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C2330b(LocalThemeScope localThemeScope, Function1<? super y.b, Unit> function1) {
                    this.f151394a = localThemeScope;
                    this.f151395b = function1;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(Function1 function1) {
                    function1.invoke(y.b.a.f151435a);
                    return Unit.f143329a;
                }

                public final void b(j1 Assemble, Composer composer, int i10) {
                    Intrinsics.j(Assemble, "$this$Assemble");
                    if (ComposerKt.M()) {
                        ComposerKt.U(-820643003, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.CancelTripModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopAndScanOptionsMenuScreen.kt:346)");
                    }
                    LocalThemeScope localThemeScope = this.f151394a;
                    q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, H1.h.p(50)), 0.0f, 0.0f, H1.h.p(24), 0.0f, 11, null), false, null, 895, null);
                    composer.startReplaceGroup(5004770);
                    boolean zV = composer.V(this.f151395b);
                    final Function1<y.b, Unit> function1 = this.f151395b;
                    Object objB = composer.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: mq.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return p.b.a.C2330b.c(function1);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(627068082, true, new C2331a(this.f151394a, Assemble), composer, 54), composer, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                    b(j1Var, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, R0 r02, Function1<? super y.b, Unit> function1) {
                this.f151387a = localThemeScope;
                this.f151388b = r02;
                this.f151389c = function1;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-549061744, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.CancelTripModal.<anonymous>.<anonymous> (ShopAndScanOptionsMenuScreen.kt:300)");
                }
                e.Companion companion = P0.e.INSTANCE;
                e.b bVarK = companion.k();
                LocalThemeScope localThemeScope = this.f151387a;
                R0 r02 = this.f151388b;
                Function1<y.b, Unit> function1 = this.f151389c;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                C5800d c5800d = C5800d.f48779a;
                MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), bVarK, composer, 48);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
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
                float f10 = 22;
                q1.Label labelY = q1.Label.y(r02.getLabels().getHeading(), r02.getLabels().getHeading().getModifier().then(androidx.compose.foundation.layout.D.l(companion2, H1.h.p(f10), H1.h.p(24), H1.h.p(f10), H1.h.p(20))), null, null, null, 0, false, 0, null, null, 510, null);
                String strC = C16338g.c(com.meijer.mobile.shopandscan.e.f117901a1, composer, 0);
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope, labelY, strC, null, composer, (i12 << 3) | i11, 4);
                si.j.h(localThemeScope, q1.Label.y(r02.getLabels().getBody(), r02.getLabels().getBody().getModifier().then(androidx.compose.foundation.layout.D.k(companion2, H1.h.p(f10), 0.0f, 2, null)), null, null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, null, null, HttpResponseStatus.ERROR_BAD_GATEWAY, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117896Y0, composer, 0), null, composer, i11 | (i12 << 3), 4);
                Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), 0.0f, H1.h.p(25), 0.0f, H1.h.p(8), 5, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.c(), companion.l(), composer, 6);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierM);
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
                InterfaceC15205y.a.c cVar = InterfaceC15205y.a.c.f142545a;
                ComposableLambda composableLambdaC = ComposableLambdaKt.c(1201426894, true, new C2328a(localThemeScope, function1), composer, 54);
                int i13 = InterfaceC15205y.a.c.f142546b;
                Q.e(localThemeScope, cVar, composableLambdaC, composer, i11 | 384 | (i13 << 3));
                Q.e(localThemeScope, cVar, ComposableLambdaKt.c(-820643003, true, new C2330b(localThemeScope, function1), composer, 54), composer, i11 | 384 | (i13 << 3));
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

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Function1<? super y.b, Unit> function1) {
            this.f151385a = localThemeScope;
            this.f151386b = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(y.b.C2333b.f151436a);
            return Unit.f143329a;
        }

        public final void b(R0 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1171991325, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.CancelTripModal.<anonymous> (ShopAndScanOptionsMenuScreen.kt:296)");
            }
            LocalThemeScope localThemeScope = this.f151385a;
            q1.ModalTemplate modalTemplate = Assemble.getModalTemplate();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f151386b);
            final Function1<y.b, Unit> function1 = this.f151386b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: mq.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.b.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C17265b.b(localThemeScope, modalTemplate, (Function0) objB, null, ComposableLambdaKt.c(-549061744, true, new a(this.f151385a, Assemble, this.f151386b), composer, 54), composer, LocalThemeScope.f17314g | 24576 | (q1.ModalTemplate.f142363d << 3), 4);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final c f151398f = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(MenuOption menuOption) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f151399f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f151400g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, List list) {
            super(1);
            this.f151399f = function1;
            this.f151400g = list;
        }

        public final Object a(int i10) {
            return this.f151399f.invoke(this.f151400g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f151401f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151402g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list, LocalThemeScope localThemeScope) {
            super(4);
            this.f151401f = list;
            this.f151402g = localThemeScope;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            MenuOption menuOption = (MenuOption) this.f151401f.get(i10);
            composer.startReplaceGroup(-536346475);
            LocalThemeScope localThemeScope = this.f151402g;
            p.s(localThemeScope, null, menuOption, localThemeScope.getAdsColors().getAdsColorText02(), this.f151402g.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, LocalThemeScope.f17314g | (T.f17342b << 9), 1);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final f f151403f = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(MenuOption menuOption) {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f151404f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f151405g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function1 function1, List list) {
            super(1);
            this.f151404f = function1;
            this.f151405g = list;
        }

        public final Object a(int i10) {
            return this.f151404f.invoke(this.f151405g.get(i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class h extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f151406f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151407g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list, LocalThemeScope localThemeScope) {
            super(4);
            this.f151406f = list;
            this.f151407g = localThemeScope;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= composer.d(i10) ? 32 : 16;
            }
            if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            MenuOption menuOption = (MenuOption) this.f151406f.get(i10);
            composer.startReplaceGroup(-1555099040);
            LocalThemeScope localThemeScope = this.f151407g;
            p.s(localThemeScope, null, menuOption, localThemeScope.getAdsColors().getAdsColorText02(), this.f151407g.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, LocalThemeScope.f17314g | (T.f17342b << 9), 1);
            composer.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
            a(interfaceC15433c, num.intValue(), composer, num2.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class i implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151408a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y.ViewState f151409b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<y.b, Unit> f151410c;

        /* JADX WARN: Multi-variable type inference failed */
        i(LocalThemeScope localThemeScope, y.ViewState viewState, Function1<? super y.b, Unit> function1) {
            this.f151408a = localThemeScope;
            this.f151409b = viewState;
            this.f151410c = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function1 function1) {
            function1.invoke(y.b.c.f151437a);
            return Unit.f143329a;
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2021899564, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.options.OptionsMenuContent.<anonymous> (ShopAndScanOptionsMenuScreen.kt:123)");
            }
            LocalThemeScope localThemeScope = this.f151408a;
            AbstractC6392a appBarTitle = this.f151409b.getAppBarTitle();
            Asset navigationIcon = this.f151409b.getNavigationIcon();
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f151410c);
            final Function1<y.b, Unit> function1 = this.f151410c;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: mq.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return p.i.c(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C13838d.d(localThemeScope, appBarTitle, navigationIcon, null, (Function0) objB, null, composer, 196608 | LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3), 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151411a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y.ViewState f151412b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<y.b, Unit> f151413c;

        /* JADX WARN: Multi-variable type inference failed */
        j(LocalThemeScope localThemeScope, y.ViewState viewState, Function1<? super y.b, Unit> function1) {
            this.f151411a = localThemeScope;
            this.f151412b = viewState;
            this.f151413c = function1;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = (composer.V(paddingValues) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-941783091, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.options.OptionsMenuContent.<anonymous> (ShopAndScanOptionsMenuScreen.kt:132)");
            }
            LocalThemeScope localThemeScope = this.f151411a;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierH = androidx.compose.foundation.layout.D.h(companion, paddingValues);
            boolean showDeveloperOptions = this.f151412b.getShowDeveloperOptions();
            Function1<y.b, Unit> function1 = this.f151413c;
            int i12 = LocalThemeScope.f17314g;
            p.u(localThemeScope, modifierH, showDeveloperOptions, function1, composer, i12, 0);
            composer.startReplaceGroup(1184557434);
            if (this.f151412b.getDisplayCancelTripDialog()) {
                p.q(this.f151411a, this.f151413c, composer, i12);
            }
            composer.P();
            if (this.f151412b.getDisplayCancelTripLoading()) {
                p.o(this.f151411a, androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.f(androidx.compose.foundation.layout.D.h(companion, paddingValues), 0.0f, 1, null), this.f151411a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117904b1, composer, 0), composer, i12, 0);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.options.ShopAndScanOptionsMenuScreenKt$OptionsMenuScreen$2$1", f = "ShopAndScanOptionsMenuScreen.kt", l = {}, m = "invokeSuspend")
    static final class k extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f151414a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f151415b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y f151416c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f151417d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f151418e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmq/y$a;", "effect", "", "<anonymous>", "(Lmq/y$a;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.options.ShopAndScanOptionsMenuScreenKt$OptionsMenuScreen$2$1$1", f = "ShopAndScanOptionsMenuScreen.kt", l = {}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<y.a, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f151419a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f151420b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f151421c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ y f151422d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Context f151423e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Activity activity, y yVar, Context context, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f151421c = activity;
                this.f151422d = yVar;
                this.f151423e = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f151421c, this.f151422d, this.f151423e, continuation);
                aVar.f151420b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(y.a aVar, Continuation<? super Unit> continuation) {
                return ((a) create(aVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f151419a == 0) {
                    ResultKt.b(obj);
                    if (((y.a) this.f151420b) instanceof y.a.C2332a) {
                        Activity activity = this.f151421c;
                        if (activity != null) {
                            activity.startActivity(this.f151422d.x(this.f151423e));
                        }
                        return Unit.f143329a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(y yVar, Activity activity, Context context, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f151416c = yVar;
            this.f151417d = activity;
            this.f151418e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            k kVar = new k(this.f151416c, this.f151417d, this.f151418e, continuation);
            kVar.f151415b = obj;
            return kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((k) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f151414a == 0) {
                ResultKt.b(obj);
                C16563h.J(C16563h.O(this.f151416c.y().a(), new a(this.f151417d, this.f151416c, this.f151418e, null)), (InterfaceC15783O) this.f151415b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(List list, LocalThemeScope localThemeScope, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), null, new g(f.f151403f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new h(list, localThemeScope)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(Function1 function1) {
        function1.invoke(y.b.d.f151438a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, Function1 function1, int i10, int i11, Composer composer, int i12) {
        u(localThemeScope, modifier, z10, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void D(final Ki.LocalThemeScope r33, final mq.y.ViewState r34, androidx.compose.ui.Modifier r35, final kotlin.jvm.functions.Function1<? super mq.y.b, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.p.D(Ki.M, mq.y$c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(LocalThemeScope localThemeScope, y.ViewState viewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        D(localThemeScope, viewState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void F(final LocalThemeScope localThemeScope, final y viewModel, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(290742472);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(viewModel) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(290742472, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.options.OptionsMenuScreen (ShopAndScanOptionsMenuScreen.kt:85)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = viewModel.y().b();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            z1 z1VarB = o1.b((P) objB, null, composerStartRestartGroup, 0, 1);
            Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            Activity activity = context instanceof Activity ? (Activity) context : null;
            y.ViewState viewStateG = G(z1VarB);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(viewModel);
            Object objB2 = composerStartRestartGroup.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function1() { // from class: mq.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return p.H(viewModel, (y.b) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            D(localThemeScope, viewStateG, modifier3, (Function1) objB2, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14) | (AbstractC6392a.f60445b << 3) | (i12 & 896), 0);
            Boolean bool = Boolean.TRUE;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD2 = composerStartRestartGroup.D(viewModel) | composerStartRestartGroup.D(activity) | composerStartRestartGroup.D(context);
            Object objB3 = composerStartRestartGroup.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new k(viewModel, activity, context, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(bool, (Function2) objB3, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: mq.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.I(localThemeScope, viewModel, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(y yVar, y.b event) {
        Intrinsics.j(event, "event");
        yVar.A(event);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(LocalThemeScope localThemeScope, y yVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        F(localThemeScope, yVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, modifier, str, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void q(final LocalThemeScope localThemeScope, final Function1<? super y.b, Unit> sendEvent, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(sendEvent, "sendEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(352110430);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(sendEvent) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(352110430, i11, -1, "com.meijer.mobile.shopandscan.presentation.view.options.CancelTripModal (ShopAndScanOptionsMenuScreen.kt:294)");
            }
            Q.e(localThemeScope, C15158a0.f142009a, ComposableLambdaKt.c(-1171991325, true, new b(localThemeScope, sendEvent), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (C15158a0.f142010b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: mq.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.r(localThemeScope, sendEvent, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, Function1 function1, int i10, Composer composer, int i11) {
        q(localThemeScope, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final Ki.LocalThemeScope r24, androidx.compose.ui.Modifier r25, mq.MenuOption r26, final Ki.T r27, final long r28, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.p.s(Ki.M, androidx.compose.ui.Modifier, mq.a, Ki.T, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(LocalThemeScope localThemeScope, Modifier modifier, MenuOption menuOption, T t10, long j10, int i10, int i11, Composer composer, int i12) {
        s(localThemeScope, modifier, menuOption, t10, j10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(final Ki.LocalThemeScope r30, androidx.compose.ui.Modifier r31, final boolean r32, final kotlin.jvm.functions.Function1<? super mq.y.b, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.p.u(Ki.M, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function1 function1) {
        function1.invoke(y.b.i.f151443a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(Function1 function1) {
        function1.invoke(y.b.g.f151441a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Function1 function1) {
        function1.invoke(y.b.f.f151440a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(List list, LocalThemeScope localThemeScope, l0.w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), null, new d(c.f151398f, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new e(list, localThemeScope)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(Function1 function1) {
        function1.invoke(y.b.h.f151442a);
        return Unit.f143329a;
    }

    private static final y.ViewState G(z1<y.ViewState> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(final LocalThemeScope localThemeScope, Modifier modifier, final String str, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1479777627);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(str)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1479777627, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.options.CancelTripLoadingSpinner (ShopAndScanOptionsMenuScreen.kt:369)");
            }
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-878638448, true, new a(localThemeScope, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: mq.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return p.p(localThemeScope, modifier2, str, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
