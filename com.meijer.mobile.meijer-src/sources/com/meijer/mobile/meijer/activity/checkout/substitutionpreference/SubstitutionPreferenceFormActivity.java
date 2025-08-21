package com.meijer.mobile.meijer.activity.checkout.substitutionpreference;

import Bm.C3011v;
import Bm.C3013x;
import Ki.K;
import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutActivity;
import com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity;
import com.meijer.mobile.meijer.activity.checkout.substitutionpreference.v;
import e.C13737e;
import fj.SubstitutePreference;
import j0.InterfaceC14882C;
import kotlin.C17987a1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import mv.C0;
import mv.InterfaceC15783O;
import p1.C16338g;
import pv.C16563h;
import pv.P;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/SubstitutionPreferenceFormActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "Lmv/O;", "coroutineScope", "Lmv/C0;", "G1", "(Lmv/O;)Lmv/C0;", "", "H1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v;", "s", "Lkotlin/Lazy;", "F1", "()Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v;", "viewModel", "", "t", "Ljava/lang/String;", "activityExtra", "u", "a", "Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$g;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SubstitutionPreferenceFormActivity extends Hilt_SubstitutionPreferenceFormActivity {

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f106078v = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(v.class), new e(this), new d(this), new f(null, this));

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private String activityExtra;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/SubstitutionPreferenceFormActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "extras", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "EXTRA_SUBSTITUTION_PREFERENCES", "Ljava/lang/String;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Intent a(Context context, String extras) {
            Intrinsics.j(context, "context");
            Intent intentPutExtra = new Intent(context, (Class<?>) SubstitutionPreferenceFormActivity.class).putExtra("com.meijer.mobile.meijer.activity.checkout.substitutionPreference.EXTRA_SUBSTITUTION_PREFERENCES", extras);
            Intrinsics.i(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SubstitutionPreferenceFormActivity f106085a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<v.ViewState> f106086b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity$c$a$a, reason: collision with other inner class name */
            static final class C1541a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106087a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SubstitutionPreferenceFormActivity f106088b;

                C1541a(LocalThemeScope localThemeScope, SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity) {
                    this.f106087a = localThemeScope;
                    this.f106088b = substitutionPreferenceFormActivity;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(539614854, i10, -1, "com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SubstitutionPreferenceFormActivity.kt:57)");
                    }
                    LocalThemeScope localThemeScope = this.f106087a;
                    Modifier modifierH = J.h(Modifier.INSTANCE, 0.0f, 1, null);
                    String strC = C16338g.c(Y.f101146qg, composer, 0);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f106088b);
                    final SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity = this.f106088b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SubstitutionPreferenceFormActivity.c.a.C1541a.c(substitutionPreferenceFormActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    C3011v.c(localThemeScope, modifierH, strC, (Function0) objB, false, composer, LocalThemeScope.f17314g | 48, 8);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity) {
                    substitutionPreferenceFormActivity.finish();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106089a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SubstitutionPreferenceFormActivity f106090b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<v.ViewState> f106091c;

                b(LocalThemeScope localThemeScope, SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity, z1<v.ViewState> z1Var) {
                    this.f106089a = localThemeScope;
                    this.f106090b = substitutionPreferenceFormActivity;
                    this.f106091c = z1Var;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1592651621, i10, -1, "com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SubstitutionPreferenceFormActivity.kt:64)");
                    }
                    LocalThemeScope localThemeScope = this.f106089a;
                    Modifier modifierH = J.h(D.i(Modifier.INSTANCE, H1.h.p(16)), 0.0f, 1, null);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f106090b);
                    final SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity = this.f106090b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SubstitutionPreferenceFormActivity.c.a.b.c(substitutionPreferenceFormActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    String strC = C16338g.c(Y.f101007jh, composer, 0);
                    String str = this.f106090b.activityExtra;
                    SubstitutePreference selectedOption = c.c(this.f106091c).getSelectedOption();
                    C3013x.b(localThemeScope, modifierH, function0, strC, (Intrinsics.e(str, selectedOption != null ? selectedOption.getName() : null) || c.c(this.f106091c).getIsLoading()) ? false : true, null, null, false, composer, LocalThemeScope.f17314g | 48, 112);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity) {
                    substitutionPreferenceFormActivity.F1().E(v.e.b.f106151a);
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity$c$a$c, reason: collision with other inner class name */
            static final class C1542c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f106092a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SubstitutionPreferenceFormActivity f106093b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<v.ViewState> f106094c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity$c$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1543a extends FunctionReferenceImpl implements Function1<v.e, Unit> {
                    C1543a(Object obj) {
                        super(1, obj, v.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/SubstitutionPreferenceFormViewModel$Action;)V", 0);
                    }

                    public final void a(v.e p02) {
                        Intrinsics.j(p02, "p0");
                        ((v) this.receiver).E(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(v.e eVar) {
                        a(eVar);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity$c$a$c$b */
                /* synthetic */ class b extends AdaptedFunctionReference implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object>, SuspendFunction {
                    b(Object obj) {
                        super(2, obj, SubstitutionPreferenceFormActivity.class, "handleEvent", "handleEvent(Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;", 12);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return C1542c.c((SubstitutionPreferenceFormActivity) this.f143708a, interfaceC15783O, continuation);
                    }
                }

                C1542c(LocalThemeScope localThemeScope, SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity, z1<v.ViewState> z1Var) {
                    this.f106092a = localThemeScope;
                    this.f106093b = substitutionPreferenceFormActivity;
                    this.f106094c = z1Var;
                }

                public final void b(InterfaceC14882C paddingValues, Composer composer, int i10) {
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(paddingValues) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1566780307, i10, -1, "com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SubstitutionPreferenceFormActivity.kt:76)");
                    }
                    LocalThemeScope localThemeScope = this.f106092a;
                    Modifier modifierH = D.h(Modifier.INSTANCE, paddingValues);
                    v.ViewState viewStateC = c.c(this.f106094c);
                    v vVarF1 = this.f106093b.F1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(vVarF1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1543a(vVarF1);
                        composer.t(objB);
                    }
                    composer.P();
                    k.n(localThemeScope, modifierH, viewStateC, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g, 0);
                    Unit unit = Unit.f143329a;
                    SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity = this.f106093b;
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(substitutionPreferenceFormActivity);
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new b(substitutionPreferenceFormActivity);
                        composer.t(objB2);
                    }
                    composer.P();
                    androidx.compose.runtime.J.g(unit, (Function2) objB2, composer, 6);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    b(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ Object c(SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity, InterfaceC15783O interfaceC15783O, Continuation continuation) {
                    substitutionPreferenceFormActivity.G1(interfaceC15783O);
                    return Unit.f143329a;
                }
            }

            a(SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity, z1<v.ViewState> z1Var) {
                this.f106085a = substitutionPreferenceFormActivity;
                this.f106086b = z1Var;
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
                    ComposerKt.U(845479659, i11, -1, "com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity.onCreate.<anonymous>.<anonymous> (SubstitutionPreferenceFormActivity.kt:54)");
                }
                C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(539614854, true, new C1541a(AdsTheme, this.f106085a), composer, 54), ComposableLambdaKt.c(1592651621, true, new b(AdsTheme, this.f106085a, this.f106086b), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-1566780307, true, new C1542c(AdsTheme, this.f106085a, this.f106086b), composer, 54), composer, 3456, 12582912, 131058);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        c() {
        }

        public final void b(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-396146342, i10, -1, "com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity.onCreate.<anonymous> (SubstitutionPreferenceFormActivity.kt:52)");
            }
            composer.startReplaceGroup(1849434622);
            SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity = SubstitutionPreferenceFormActivity.this;
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = substitutionPreferenceFormActivity.F1().D().c();
                composer.t(objB);
            }
            composer.P();
            K.b(null, ComposableLambdaKt.c(845479659, true, new a(SubstitutionPreferenceFormActivity.this, o1.b((P) objB, null, composer, 0, 1)), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v.ViewState c(z1<v.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106095f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f106095f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f106095f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106096f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f106096f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f106096f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f106097f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f106098g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f106097f = function0;
            this.f106098g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f106097f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f106098g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$f;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/substitutionpreference/v$f;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.substitutionpreference.SubstitutionPreferenceFormActivity$handleEvent$1$1", f = "SubstitutionPreferenceFormActivity.kt", l = {}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<v.f, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f106081a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f106082b;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = SubstitutionPreferenceFormActivity.this.new b(continuation);
            bVar.f106082b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v.f fVar, Continuation<? super Unit> continuation) {
            return ((b) create(fVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f106081a == 0) {
                ResultKt.b(obj);
                if (Intrinsics.e((v.f) this.f106082b, v.f.a.f106152a)) {
                    if (SubstitutionPreferenceFormActivity.this.getFeatureManager().e(AbstractC18503f.i0.f172883h)) {
                        SubstitutionPreferenceFormActivity.this.finish();
                    } else {
                        SubstitutionPreferenceFormActivity substitutionPreferenceFormActivity = SubstitutionPreferenceFormActivity.this;
                        substitutionPreferenceFormActivity.startActivity(CheckoutActivity.Companion.b(CheckoutActivity.INSTANCE, substitutionPreferenceFormActivity, null, 2, null));
                    }
                    return Unit.f143329a;
                }
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v F1() {
        return (v) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0 G1(InterfaceC15783O coroutineScope) {
        return C16563h.J(C16563h.O(F1().D().b(), new b(null)), coroutineScope);
    }

    private final void H1() {
        String stringExtra;
        getLifecycle().a(F1());
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra("com.meijer.mobile.meijer.activity.checkout.substitutionPreference.EXTRA_SUBSTITUTION_PREFERENCES")) != null) {
            this.activityExtra = stringExtra;
            F1().E(new v.e.SelectSubstitutionPreference(SubstitutePreference.INSTANCE.f(stringExtra)));
        }
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        H1();
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-396146342, true, new c()), 1, null);
    }
}
