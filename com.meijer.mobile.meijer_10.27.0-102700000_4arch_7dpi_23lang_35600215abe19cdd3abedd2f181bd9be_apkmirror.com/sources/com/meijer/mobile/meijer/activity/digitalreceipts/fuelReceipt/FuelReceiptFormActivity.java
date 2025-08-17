package com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt;

import Ji.LocalThemeScope;
import Oj.a;
import V2.CreationExtras;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptFormActivity;
import com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.P;
import e.C13589e;
import gi.InterfaceC14261a;
import hi.AbstractC14482i;
import hi.C14476c;
import hi.TrackingData;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/FuelReceiptFormActivity;", "Lcom/meijer/mobile/mperks/ux/MperksFeatureActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lgi/a;", "D", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P;", "E", "Lkotlin/Lazy;", "y1", "()Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P;", "fuelReceiptFormViewModel", "Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/P$a;", "fuelReceiptViewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class FuelReceiptFormActivity extends Hilt_FuelReceiptFormActivity {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Lazy fuelReceiptFormViewModel = new e0(Reflection.b(P.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptFormActivity$a$a, reason: collision with other inner class name */
        static final class C1568a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FuelReceiptFormActivity f105648a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<P.FuelReceiptViewState> f105649b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptFormActivity$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1569a extends FunctionReferenceImpl implements Function1<W, Unit> {
                C1569a(Object obj) {
                    super(1, obj, P.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/digitalreceipts/fuelReceipt/FuelReceiptResourceAction;)V", 0);
                }

                public final void a(W p02) {
                    Intrinsics.j(p02, "p0");
                    ((P) this.receiver).t(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(W w10) {
                    a(w10);
                    return Unit.f142422a;
                }
            }

            C1568a(FuelReceiptFormActivity fuelReceiptFormActivity, z1<P.FuelReceiptViewState> z1Var) {
                this.f105648a = fuelReceiptFormActivity;
                this.f105649b = z1Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(FuelReceiptFormActivity fuelReceiptFormActivity) {
                fuelReceiptFormActivity.setResult(0);
                fuelReceiptFormActivity.finish();
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(TrackingData track) {
                Intrinsics.j(track, "$this$track");
                track.n("Add Fuel Receipt");
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(TrackingData track) {
                Intrinsics.j(track, "$this$track");
                track.n("Add Fuel Receipt");
                return Unit.f142422a;
            }

            public final void e(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-313071620, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptFormActivity.onCreate.<anonymous>.<anonymous> (FuelReceiptFormActivity.kt:41)");
                }
                P.FuelReceiptViewState fuelReceiptViewStateC = a.c(this.f105649b);
                P pY1 = this.f105648a.y1();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(pY1);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1569a(pY1);
                    composer.t(objB);
                }
                KFunction kFunction = (KFunction) objB;
                composer.P();
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(this.f105649b) | composer.D(this.f105648a);
                final FuelReceiptFormActivity fuelReceiptFormActivity = this.f105648a;
                final z1<P.FuelReceiptViewState> z1Var = this.f105649b;
                Object objB2 = composer.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FuelReceiptFormActivity.a.C1568a.f(fuelReceiptFormActivity, z1Var);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function0 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f105648a);
                final FuelReceiptFormActivity fuelReceiptFormActivity2 = this.f105648a;
                Object objB3 = composer.B();
                if (zD2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FuelReceiptFormActivity.a.C1568a.l(fuelReceiptFormActivity2);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                z.A(AdsTheme, fuelReceiptViewStateC, null, function0, (Function0) objB3, (Function1) kFunction, composer, LocalThemeScope.f15770g | (i10 & 14), 2);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                e(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(FuelReceiptFormActivity fuelReceiptFormActivity, z1 z1Var) {
                if (a.c(z1Var).getLoadingState() instanceof a.NotLoading) {
                    fuelReceiptFormActivity.getAnalyticsEngine().h(C14476c.a("Add Another Fuel Receipt"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FuelReceiptFormActivity.a.C1568a.g((TrackingData) obj);
                        }
                    });
                } else if (a.c(z1Var).getLoadingState() instanceof a.Failed) {
                    fuelReceiptFormActivity.getAnalyticsEngine().h(C14476c.a("Try Another Receipt"), new Function1() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FuelReceiptFormActivity.a.C1568a.k((TrackingData) obj);
                        }
                    });
                }
                fuelReceiptFormActivity.setResult(-1);
                fuelReceiptFormActivity.finish();
                return Unit.f142422a;
            }
        }

        a() {
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(818536235, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.fuelReceipt.FuelReceiptFormActivity.onCreate.<anonymous> (FuelReceiptFormActivity.kt:37)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-313071620, true, new C1568a(FuelReceiptFormActivity.this, o1.b(FuelReceiptFormActivity.this.y1().r(), null, composer, 0, 1)), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final P.FuelReceiptViewState c(z1<P.FuelReceiptViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105650f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f105650f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f105650f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105651f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f105651f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f105651f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f105652f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105653g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f105652f = function0;
            this.f105653g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f105652f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f105653g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P y1() {
        return (P) this.fuelReceiptFormViewModel.getValue();
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getAnalyticsEngine().b(C14476c.h("Add Fuel Receipt"), new AbstractC14482i[0]);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(818536235, true, new a()), 1, null);
    }
}
