package com.meijer.mobile.meijer.activity.find.productdetail;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.activity.find.productdetail.X0;
import com.meijer.mobile.meijer.activity.find.productdetail.X1;
import j0.InterfaceC14888I;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LKi/M;", "", "cartEntryCount", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/find/productdetail/X0;", "", "onNavigationRequest", "c", "(LKi/M;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class X1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108298a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<X0, Unit> f108299b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f108300c;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super X0, Unit> function1, int i10) {
            this.f108298a = localThemeScope;
            this.f108299b = function1;
            this.f108300c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit d(Function1 function1) {
            function1.invoke(X0.e.f108289a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1) {
            function1.invoke(X0.a.f108285a);
            return Unit.f143329a;
        }

        public final void c(InterfaceC14888I AdsTopBar, Composer composer, int i10) {
            Intrinsics.j(AdsTopBar, "$this$AdsTopBar");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-607788809, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailsToolbar.<anonymous> (ProductDetailsToolbar.kt:55)");
            }
            composer.startReplaceGroup(30507371);
            composer.P();
            LocalThemeScope localThemeScope = this.f108298a;
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f108299b);
            final Function1<X0, Unit> function1 = this.f108299b;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.V1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return X1.a.d(function1);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            int i11 = LocalThemeScope.f17314g;
            Dr.s.q(localThemeScope, null, (Function0) objB, composer, i11, 1);
            LocalThemeScope localThemeScope2 = this.f108298a;
            Integer numValueOf = Integer.valueOf(this.f108300c);
            composer.startReplaceGroup(5004770);
            boolean zV2 = composer.V(this.f108299b);
            final Function1<X0, Unit> function12 = this.f108299b;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.W1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return X1.a.e(function12);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Dr.s.k(localThemeScope2, numValueOf, null, (Function0) objB2, composer, i11, 2);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            c(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f108301a;

        b(LocalThemeScope localThemeScope) {
            this.f108301a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1590882723, i10, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailsToolbar.<anonymous> (ProductDetailsToolbar.kt:51)");
            }
            Dr.g.g(this.f108301a, C16338g.c(com.meijer.mobile.meijer.Y.f100519Kc, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

    public static final void c(final LocalThemeScope localThemeScope, final int i10, final Function1<? super X0, Unit> onNavigationRequest, Composer composer, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onNavigationRequest, "onNavigationRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(1124120989);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(onNavigationRequest) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1124120989, i12, -1, "com.meijer.mobile.meijer.activity.find.productdetail.ProductDetailsToolbar (ProductDetailsToolbar.kt:49)");
            }
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100572N8, new Object[0]);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-607788809, true, new a(localThemeScope, onNavigationRequest, i10), composerStartRestartGroup, 54);
            ComposableLambda composableLambdaC2 = ComposableLambdaKt.c(-1590882723, true, new b(localThemeScope), composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i12 & 896) == 256;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.T1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return X1.d(onNavigationRequest);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Dr.g.f(localThemeScope, null, composableLambdaC, null, composableLambdaC2, (Function0) objB, null, 0.0f, false, abstractC6392aD, composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 24960 | (AbstractC6392a.f60445b << 27), 229);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.find.productdetail.U1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return X1.e(localThemeScope, i10, onNavigationRequest, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function1 function1) {
        function1.invoke(X0.d.f108288a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, int i10, Function1 function1, int i11, Composer composer, int i12) {
        c(localThemeScope, i10, function1, composer, androidx.compose.runtime.J0.a(i11 | 1));
        return Unit.f143329a;
    }
}
