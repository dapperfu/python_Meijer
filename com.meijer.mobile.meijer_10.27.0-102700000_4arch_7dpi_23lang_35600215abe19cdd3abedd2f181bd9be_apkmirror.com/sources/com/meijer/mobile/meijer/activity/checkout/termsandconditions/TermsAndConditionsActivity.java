package com.meijer.mobile.meijer.activity.checkout.termsandconditions;

import Am.C2906v;
import Am.C2908x;
import Ji.K;
import Ji.LocalThemeScope;
import V2.CreationExtras;
import android.os.Bundle;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.view.C6031t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity;
import com.meijer.mobile.meijer.activity.checkout.termsandconditions.f;
import e.C13589e;
import j0.InterfaceC14794C;
import kotlin.C17921a1;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16193g;
import qv.InterfaceC16622O;
import tv.C17154h;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/TermsAndConditionsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "D1", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f;", "s", "Lkotlin/Lazy;", "H1", "()Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f;", "viewModel", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TermsAndConditionsActivity extends Hilt_TermsAndConditionsActivity {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(f.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity$a$a, reason: collision with other inner class name */
        static final class C1535a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TermsAndConditionsActivity f105309a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity$a$a$a, reason: collision with other inner class name */
            static final class C1536a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105310a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ TermsAndConditionsActivity f105311b;

                C1536a(LocalThemeScope localThemeScope, TermsAndConditionsActivity termsAndConditionsActivity) {
                    this.f105310a = localThemeScope;
                    this.f105311b = termsAndConditionsActivity;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1705496414, i10, -1, "com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (TermsAndConditionsActivity.kt:53)");
                    }
                    LocalThemeScope localThemeScope = this.f105310a;
                    Modifier modifierH = J.h(Modifier.INSTANCE, 0.0f, 1, null);
                    String strC = C16193g.c(Y.f99585Gg, composer, 0);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f105311b);
                    final TermsAndConditionsActivity termsAndConditionsActivity = this.f105311b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.termsandconditions.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TermsAndConditionsActivity.a.C1535a.C1536a.c(termsAndConditionsActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    C2906v.c(localThemeScope, modifierH, strC, (Function0) objB, false, composer, LocalThemeScope.f15770g | 48, 8);
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
                public static final Unit c(TermsAndConditionsActivity termsAndConditionsActivity) {
                    termsAndConditionsActivity.finish();
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity$a$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105312a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ TermsAndConditionsActivity f105313b;

                b(LocalThemeScope localThemeScope, TermsAndConditionsActivity termsAndConditionsActivity) {
                    this.f105312a = localThemeScope;
                    this.f105313b = termsAndConditionsActivity;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1388329539, i10, -1, "com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (TermsAndConditionsActivity.kt:60)");
                    }
                    LocalThemeScope localThemeScope = this.f105312a;
                    Modifier modifierH = J.h(D.i(Modifier.INSTANCE, H1.h.p(16)), 0.0f, 1, null);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f105313b);
                    final TermsAndConditionsActivity termsAndConditionsActivity = this.f105313b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.termsandconditions.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TermsAndConditionsActivity.a.C1535a.b.c(termsAndConditionsActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    C2908x.b(localThemeScope, modifierH, (Function0) objB, C16193g.c(Y.f99547Eg, composer, 0), true, null, null, false, composer, LocalThemeScope.f15770g | 24624, 112);
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
                public static final Unit c(TermsAndConditionsActivity termsAndConditionsActivity) {
                    termsAndConditionsActivity.H1().p(f.a.b.f105335a);
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity$a$a$c */
            static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ TermsAndConditionsActivity f105314a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f105315b;

                c(TermsAndConditionsActivity termsAndConditionsActivity, LocalThemeScope localThemeScope) {
                    this.f105314a = termsAndConditionsActivity;
                    this.f105315b = localThemeScope;
                }

                public final void a(InterfaceC14794C paddingValues, Composer composer, int i10) {
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(paddingValues) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-482509115, i10, -1, "com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (TermsAndConditionsActivity.kt:70)");
                    }
                    this.f105314a.D1(this.f105315b, D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), composer, LocalThemeScope.f15770g, 0);
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity$onCreate$1$1$4$1", f = "TermsAndConditionsActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity$a$a$d */
            static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f105316a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ TermsAndConditionsActivity f105317b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(TermsAndConditionsActivity termsAndConditionsActivity, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f105317b = termsAndConditionsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f105317b, continuation);
                }

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$b;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/meijer/activity/checkout/termsandconditions/f$b;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity$onCreate$1$1$4$1$1", f = "TermsAndConditionsActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity$a$a$d$a, reason: collision with other inner class name */
                static final class C1537a extends SuspendLambda implements Function2<f.b, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f105318a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f105319b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ TermsAndConditionsActivity f105320c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1537a(TermsAndConditionsActivity termsAndConditionsActivity, Continuation<? super C1537a> continuation) {
                        super(2, continuation);
                        this.f105320c = termsAndConditionsActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1537a c1537a = new C1537a(this.f105320c, continuation);
                        c1537a.f105319b = obj;
                        return c1537a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(f.b bVar, Continuation<? super Unit> continuation) {
                        return ((C1537a) create(bVar, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f105318a == 0) {
                            ResultKt.b(obj);
                            if (((f.b) this.f105319b) instanceof f.b.a) {
                                this.f105320c.setResult(-1);
                                this.f105320c.finish();
                                return Unit.f142422a;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f105316a == 0) {
                        ResultKt.b(obj);
                        C17154h.J(C17154h.O(this.f105317b.H1().o(), new C1537a(this.f105317b, null)), C6031t.a(this.f105317b));
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            C1535a(TermsAndConditionsActivity termsAndConditionsActivity) {
                this.f105309a = termsAndConditionsActivity;
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
                    ComposerKt.U(653874243, i11, -1, "com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity.onCreate.<anonymous>.<anonymous> (TermsAndConditionsActivity.kt:50)");
                }
                C17921a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(1705496414, true, new C1536a(AdsTheme, this.f105309a), composer, 54), ComposableLambdaKt.c(-1388329539, true, new b(AdsTheme, this.f105309a), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-482509115, true, new c(this.f105309a, AdsTheme), composer, 54), composer, 3456, 12582912, 131058);
                Boolean bool = Boolean.FALSE;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f105309a);
                TermsAndConditionsActivity termsAndConditionsActivity = this.f105309a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new d(termsAndConditionsActivity, null);
                    composer.t(objB);
                }
                composer.P();
                androidx.compose.runtime.J.g(bool, (Function2) objB, composer, 6);
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

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1717300274, i10, -1, "com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity.onCreate.<anonymous> (TermsAndConditionsActivity.kt:49)");
            }
            K.b(null, ComposableLambdaKt.c(653874243, true, new C1535a(TermsAndConditionsActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105321f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f105321f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f105321f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105322f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f105322f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f105322f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f105323f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f105324g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f105323f = function0;
            this.f105324g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f105323f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f105324g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1(final Ji.LocalThemeScope r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.checkout.termsandconditions.TermsAndConditionsActivity.D1(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E1(TermsAndConditionsActivity termsAndConditionsActivity, LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        termsAndConditionsActivity.D1(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f H1() {
        return (f) this.viewModel.getValue();
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        H1().p(f.a.C1538a.f105334a);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1717300274, true, new a()), 1, null);
    }
}
