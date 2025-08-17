package com.meijer.mobile.meijer.activity.digitalreceipts;

import Ji.LocalThemeScope;
import Rm.w;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.meijer.activity.digitalreceipts.SavingsDetailActivity;
import e.C13589e;
import gi.InterfaceC14261a;
import hi.C14476c;
import j0.InterfaceC14794C;
import kotlin.C17921a1;
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
import p1.C16193g;
import zp.CustomerSavings;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/digitalreceipts/SavingsDetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Lgi/a;", "v", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "LRm/w;", "w", "Lkotlin/Lazy;", "q1", "()LRm/w;", "viewModel", "x", "a", "LRm/w$b;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SavingsDetailActivity extends Hilt_SavingsDetailActivity {

    /* renamed from: y, reason: collision with root package name */
    public static final int f105549y = 8;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(Rm.w.class), new d(this), new c(this), new e(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SavingsDetailActivity f105553a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<w.ViewState> f105554b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SavingsDetailActivity$b$a$a, reason: collision with other inner class name */
            static final class C1556a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105555a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SavingsDetailActivity f105556b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SavingsDetailActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1557a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f105557a;

                    C1557a(LocalThemeScope localThemeScope) {
                        this.f105557a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(23881187, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.SavingsDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SavingsDetailActivity.kt:64)");
                        }
                        Dr.g.g(this.f105557a, C16193g.c(com.meijer.mobile.meijer.Y.f99885Wc, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-489307485, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.SavingsDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SavingsDetailActivity.kt:62)");
                    }
                    LocalThemeScope localThemeScope = this.f105555a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(23881187, true, new C1557a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f105556b);
                    final SavingsDetailActivity savingsDetailActivity = this.f105556b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.digitalreceipts.u
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SavingsDetailActivity.b.a.C1556a.c(savingsDetailActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, null, 0.0f, false, AbstractC5607a.INSTANCE.d(Bj.o.f3035p, new Object[0]), composer, LocalThemeScope.f15770g | 24576 | (AbstractC5607a.f45514b << 27), 231);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1556a(LocalThemeScope localThemeScope, SavingsDetailActivity savingsDetailActivity) {
                    this.f105555a = localThemeScope;
                    this.f105556b = savingsDetailActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(SavingsDetailActivity savingsDetailActivity) {
                    if (!savingsDetailActivity.onNavigateUp()) {
                        savingsDetailActivity.finish();
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SavingsDetailActivity$b$a$b, reason: collision with other inner class name */
            static final class C1558b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105558a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SavingsDetailActivity f105559b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<w.ViewState> f105560c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.digitalreceipts.SavingsDetailActivity$b$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C1559a extends FunctionReferenceImpl implements Function1<w.a, Unit> {
                    C1559a(Object obj) {
                        super(1, obj, Rm.w.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/digitalreceipts/viewmodel/SavingsDetailViewModel$Action;)V", 0);
                    }

                    public final void a(w.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((Rm.w) this.receiver).o(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(w.a aVar) {
                        a(aVar);
                        return Unit.f142422a;
                    }
                }

                C1558b(LocalThemeScope localThemeScope, SavingsDetailActivity savingsDetailActivity, z1<w.ViewState> z1Var) {
                    this.f105558a = localThemeScope;
                    this.f105559b = savingsDetailActivity;
                    this.f105560c = z1Var;
                }

                public final void a(InterfaceC14794C contentPadding, Composer composer, int i10) {
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(contentPadding) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(721221962, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.SavingsDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SavingsDetailActivity.kt:71)");
                    }
                    LocalThemeScope localThemeScope = this.f105558a;
                    Modifier modifierD = androidx.compose.foundation.b.d(androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, contentPadding), this.f105558a.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
                    w.ViewState viewStateC = b.c(this.f105560c);
                    Rm.w wVarQ1 = this.f105559b.q1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(wVarQ1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1559a(wVarQ1);
                        composer.t(objB);
                    }
                    composer.P();
                    Tm.q.j(localThemeScope, modifierD, viewStateC, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                    a(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(SavingsDetailActivity savingsDetailActivity, z1<w.ViewState> z1Var) {
                this.f105553a = savingsDetailActivity;
                this.f105554b = z1Var;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1542323896, i11, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.SavingsDetailActivity.onCreate.<anonymous>.<anonymous> (SavingsDetailActivity.kt:57)");
                }
                C17921a1.a(androidx.compose.foundation.layout.J.f(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), 0.0f, 1, null), null, ComposableLambdaKt.c(-489307485, true, new C1556a(AdsTheme, this.f105553a), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(721221962, true, new C1558b(AdsTheme, this.f105553a, this.f105554b), composer, 54), composer, 384, 12582912, 131066);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b() {
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(660551287, i10, -1, "com.meijer.mobile.meijer.activity.digitalreceipts.SavingsDetailActivity.onCreate.<anonymous> (SavingsDetailActivity.kt:55)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(-1542323896, true, new a(SavingsDetailActivity.this, o1.b(SavingsDetailActivity.this.q1().m(), null, composer, 0, 1)), composer, 54), composer, 48, 1);
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
        public static final w.ViewState c(z1<w.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105561f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f105561f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f105561f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105562f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f105562f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f105562f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f105563f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105564g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f105563f = function0;
            this.f105564g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f105563f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f105564g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.digitalreceipts.Hilt_SavingsDetailActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Parcelable parcelable;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("savingsDetailsTag", CustomerSavings.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("savingsDetailsTag");
            if (!(parcelableExtra instanceof CustomerSavings)) {
                parcelableExtra = null;
            }
            parcelable = (CustomerSavings) parcelableExtra;
        }
        CustomerSavings customerSavings = (CustomerSavings) parcelable;
        if (customerSavings == null) {
            customerSavings = new CustomerSavings(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0, null, l3.f92484c, null);
        }
        q1().n(customerSavings);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(660551287, true, new b()), 1, null);
    }

    public final Rm.w q1() {
        return (Rm.w) this.viewModel.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        getAnalyticsEngine().b(C14476c.h("receipts and savings: savings"), C14476c.g("receipt and savings"));
    }
}
