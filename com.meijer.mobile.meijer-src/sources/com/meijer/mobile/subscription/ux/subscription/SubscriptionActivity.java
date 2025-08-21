package com.meijer.mobile.subscription.ux.subscription;

import Co.ProductFullDetails;
import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.subscription.ux.subscription.AbstractC13119k;
import com.meijer.mobile.subscription.ux.subscription.C;
import com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity;
import cr.SubscriptionDetails;
import e.C13736d;
import e.C13737e;
import j0.InterfaceC14900d;
import kotlin.AbstractC14656B;
import kotlin.C14659E;
import kotlin.C14678s;
import kotlin.C14680u;
import kotlin.C14683x;
import kotlin.C17957L0;
import kotlin.C17959M0;
import kotlin.EnumC17961N0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kr.C15410d;
import mi.C15726h;
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import or.C16287c;
import p1.C16338g;
import pr.AbstractC16490a;
import pr.C16493d;
import pr.EnumC16491b;
import pr.SubscriptionSummaryDecorator;
import pv.C16563h;
import pv.InterfaceC16553F;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006(²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/SubscriptionActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "resultCode", "", "r1", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LDl/e;", "v", "LDl/e;", "s1", "()LDl/e;", "setMeijerIntent$ux_release", "(LDl/e;)V", "meijerIntent", "Lcom/meijer/mobile/subscription/ux/subscription/E;", "w", "Lkotlin/Lazy;", "u1", "()Lcom/meijer/mobile/subscription/ux/subscription/E;", "subscriptionVM", "Lpr/d;", "x", "t1", "()Lpr/d;", "subscriptionSummaryVM", "Lmv/O;", "y", "Lmv/O;", "coroutineScope", "z", "a", "Lcom/meijer/mobile/subscription/ux/subscription/I;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SubscriptionActivity extends Hilt_SubscriptionActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy subscriptionVM = new e0(Reflection.b(E.class), new d(this), new c(this), new e(null, this));

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy subscriptionSummaryVM = new e0(Reflection.b(C16493d.class), new g(this), new f(this), new h(null, this));

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15783O coroutineScope;

    /* renamed from: A, reason: collision with root package name */
    public static final int f119932A = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ProductFullDetails f119939b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ nk.f f119940c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$onCreate$1$1$1", f = "SubscriptionActivity.kt", l = {l3.f93324d}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f119941a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscriptionActivity f119942b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C14680u f119943c;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/C;", "screen", "", "<anonymous>", "(Lcom/meijer/mobile/subscription/ux/subscription/C;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$onCreate$1$1$1$1", f = "SubscriptionActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$b$a$a, reason: collision with other inner class name */
            static final class C1936a extends SuspendLambda implements Function2<C, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f119944a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f119945b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ SubscriptionActivity f119946c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C14680u f119947d;

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(C c10, C14683x c14683x) {
                    c14683x.f(true);
                    c14683x.d(((C.c) c10).getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), new Function1() { // from class: com.meijer.mobile.subscription.ux.subscription.p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SubscriptionActivity.b.a.C1936a.o((C14659E) obj);
                        }
                    });
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit o(C14659E c14659e) {
                    c14659e.c(false);
                    return Unit.f143329a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1936a c1936a = new C1936a(this.f119946c, this.f119947d, continuation);
                    c1936a.f119945b = obj;
                    return c1936a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C c10, Continuation<? super Unit> continuation) {
                    return ((C1936a) create(c10, continuation)).invokeSuspend(Unit.f143329a);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1936a(SubscriptionActivity subscriptionActivity, C14680u c14680u, Continuation<? super C1936a> continuation) {
                    super(2, continuation);
                    this.f119946c = subscriptionActivity;
                    this.f119947d = c14680u;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                    IntrinsicsKt.f();
                    if (this.f119944a == 0) {
                        ResultKt.b(obj);
                        final C c10 = (C) this.f119945b;
                        if (c10 instanceof C.a) {
                            this.f119946c.finish();
                        } else if (c10 instanceof C.ExitSubscriptionWithResult) {
                            this.f119946c.r1(((C.ExitSubscriptionWithResult) c10).getResultCode());
                        } else if (c10 instanceof C.c) {
                            this.f119947d.S(((C.c) c10).getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), new Function1() { // from class: com.meijer.mobile.subscription.ux.subscription.o
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    return SubscriptionActivity.b.a.C1936a.l(c10, (C14683x) obj2);
                                }
                            });
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f119942b, this.f119943c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SubscriptionActivity subscriptionActivity, C14680u c14680u, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f119942b = subscriptionActivity;
                this.f119943c = c14680u;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f119941a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<C> interfaceC16553FX = this.f119942b.u1().x();
                    C1936a c1936a = new C1936a(this.f119942b, this.f119943c, null);
                    this.f119941a = 1;
                    if (C16563h.k(interfaceC16553FX, c1936a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$onCreate$1$2$1", f = "SubscriptionActivity.kt", l = {149}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$b$b, reason: collision with other inner class name */
        static final class C1937b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f119948a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f119949b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ SubscriptionActivity f119950c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<SubscriptionViewState> f119951d;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1937b(this.f119949b, this.f119950c, this.f119951d, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1937b(C17959M0 c17959m0, SubscriptionActivity subscriptionActivity, z1<SubscriptionViewState> z1Var, Continuation<? super C1937b> continuation) {
                super(2, continuation);
                this.f119949b = c17959m0;
                this.f119950c = subscriptionActivity;
                this.f119951d = z1Var;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1937b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f119948a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    if (b.f(this.f119951d).getDisplayHowItWorks()) {
                        C17959M0 c17959m0 = this.f119949b;
                        this.f119948a = 1;
                        if (c17959m0.i(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
                SubscriptionActivity subscriptionActivity = this.f119950c;
                subscriptionActivity.startActivity(subscriptionActivity.s1().u());
                this.f119950c.u1().M();
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class c implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C14680u f119952a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SubscriptionActivity f119953b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17959M0 f119954c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Function0<C0> f119955d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ SubscriptionNavConfig f119956e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<C0> f119957f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14900d, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119958a;

                a(LocalThemeScope localThemeScope) {
                    this.f119958a = localThemeScope;
                }

                public final void a(InterfaceC14900d AcresBottomSheet, Composer composer, int i10) {
                    Intrinsics.j(AcresBottomSheet, "$this$AcresBottomSheet");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1508153338, i10, -1, "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SubscriptionActivity.kt:169)");
                    }
                    C16287c.c(this.f119958a, null, composer, LocalThemeScope.f17314g, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14900d interfaceC14900d, Composer composer, Integer num) {
                    a(interfaceC14900d, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$b$c$b, reason: collision with other inner class name */
            static final class C1938b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C14680u f119959a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119960b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ SubscriptionNavConfig f119961c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ SubscriptionActivity f119962d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ Function0<C0> f119963e;

                public final void c(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-404071959, i10, -1, "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SubscriptionActivity.kt:172)");
                    }
                    C14680u c14680u = this.f119959a;
                    composer.startReplaceGroup(-1224400529);
                    boolean zD = composer.D(this.f119960b) | composer.D(this.f119961c) | composer.D(this.f119962d) | composer.V(this.f119963e);
                    final LocalThemeScope localThemeScope = this.f119960b;
                    final SubscriptionNavConfig subscriptionNavConfig = this.f119961c;
                    final SubscriptionActivity subscriptionActivity = this.f119962d;
                    final Function0<C0> function0 = this.f119963e;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.subscription.ux.subscription.u
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SubscriptionActivity.b.c.C1938b.d(localThemeScope, subscriptionNavConfig, subscriptionActivity, function0, (C14678s) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    j4.k.b(c14680u, "SubscriptionRoute", null, null, null, null, null, null, null, (Function1) objB, composer, 48, 508);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1938b(C14680u c14680u, LocalThemeScope localThemeScope, SubscriptionNavConfig subscriptionNavConfig, SubscriptionActivity subscriptionActivity, Function0<? extends C0> function0) {
                    this.f119959a = c14680u;
                    this.f119960b = localThemeScope;
                    this.f119961c = subscriptionNavConfig;
                    this.f119962d = subscriptionActivity;
                    this.f119963e = function0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(LocalThemeScope localThemeScope, SubscriptionNavConfig subscriptionNavConfig, SubscriptionActivity subscriptionActivity, final Function0 function0, C14678s NavHost) {
                    Intrinsics.j(NavHost, "$this$NavHost");
                    B.a(NavHost, localThemeScope, subscriptionNavConfig, subscriptionActivity.u1(), new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.v
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SubscriptionActivity.b.c.C1938b.e(function0);
                        }
                    });
                    return Unit.f143329a;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    c(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(Function0 function0) {
                    function0.invoke();
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            c(C14680u c14680u, SubscriptionActivity subscriptionActivity, C17959M0 c17959m0, Function0<? extends C0> function0, SubscriptionNavConfig subscriptionNavConfig, Function0<? extends C0> function02) {
                this.f119952a = c14680u;
                this.f119953b = subscriptionActivity;
                this.f119954c = c17959m0;
                this.f119955d = function0;
                this.f119956e = subscriptionNavConfig;
                this.f119957f = function02;
            }

            public final void e(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(-709450775, i11, -1, "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity.onCreate.<anonymous>.<anonymous> (SubscriptionActivity.kt:157)");
                }
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f119952a) | composer.D(this.f119953b);
                final C14680u c14680u = this.f119952a;
                final SubscriptionActivity subscriptionActivity = this.f119953b;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SubscriptionActivity.b.c.f(c14680u, subscriptionActivity);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C13736d.a(false, (Function0) objB, composer, 0, 1);
                C17959M0 c17959m0 = this.f119954c;
                String strC = C16338g.c(C15410d.f148759P, composer, 0);
                String strC2 = C16338g.c(C15410d.f148762S, composer, 0);
                String strC3 = C16338g.c(C15410d.f148756M, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zV = composer.V(this.f119955d);
                final Function0<C0> function0 = this.f119955d;
                Object objB2 = composer.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SubscriptionActivity.b.c.g(function0);
                        }
                    };
                    composer.t(objB2);
                }
                Function0 function02 = (Function0) objB2;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f119953b);
                final SubscriptionActivity subscriptionActivity2 = this.f119953b;
                Object objB3 = composer.B();
                if (zD2 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SubscriptionActivity.b.c.k(subscriptionActivity2);
                        }
                    };
                    composer.t(objB3);
                }
                Function0 function03 = (Function0) objB3;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zV2 = composer.V(this.f119955d);
                final Function0<C0> function04 = this.f119955d;
                Object objB4 = composer.B();
                if (zV2 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SubscriptionActivity.b.c.l(function04);
                        }
                    };
                    composer.t(objB4);
                }
                composer.P();
                C15726h.j(AdsTheme, null, c17959m0, strC, null, strC2, strC3, function02, function03, null, (Function0) objB4, false, 0.0f, 0.0f, 0.0f, ComposableLambdaKt.c(-1508153338, true, new a(AdsTheme), composer, 54), false, ComposableLambdaKt.c(-404071959, true, new C1938b(this.f119952a, AdsTheme, this.f119956e, this.f119953b, this.f119957f), composer, 54), composer, LocalThemeScope.f17314g | (i11 & 14) | (C17959M0.f168297e << 6), 12779520, 48393);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                e(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(C14680u c14680u, SubscriptionActivity subscriptionActivity) {
                if (!c14680u.V()) {
                    subscriptionActivity.finish();
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(SubscriptionActivity subscriptionActivity) {
                subscriptionActivity.u1().E(AbstractC13119k.l.f120029a);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(Function0 function0) {
                function0.invoke();
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$onCreate$1$closeIspSheet$1$1$1", f = "SubscriptionActivity.kt", l = {109}, m = "invokeSuspend")
        static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f119964a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f119965b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new d(this.f119965b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C17959M0 c17959m0, Continuation<? super d> continuation) {
                super(2, continuation);
                this.f119965b = c17959m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f119964a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f119965b;
                    this.f119964a = 1;
                    if (c17959m0.i(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity$onCreate$1$openIspSheet$1$1$1", f = "SubscriptionActivity.kt", l = {106}, m = "invokeSuspend")
        static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f119966a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17959M0 f119967b;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new e(this.f119967b, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(C17959M0 c17959m0, Continuation<? super e> continuation) {
                super(2, continuation);
                this.f119967b = c17959m0;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f119966a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17959M0 c17959m0 = this.f119967b;
                    this.f119966a = 1;
                    if (c17959m0.l(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        b(ProductFullDetails productFullDetails, nk.f fVar) {
            this.f119939b = productFullDetails;
            this.f119940c = fVar;
        }

        public final void e(Composer composer, int i10) {
            EnumC16491b enumC16491b;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1789219494, i10, -1, "com.meijer.mobile.subscription.ux.subscription.SubscriptionActivity.onCreate.<anonymous> (SubscriptionActivity.kt:85)");
            }
            SubscriptionActivity subscriptionActivity = SubscriptionActivity.this;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            subscriptionActivity.coroutineScope = (InterfaceC15783O) objB;
            C14680u c14680uE = j4.j.e(new AbstractC14656B[0], composer, 0);
            z1 z1VarC = S2.a.c(SubscriptionActivity.this.u1().B(), null, null, null, composer, 0, 7);
            SubscriptionSummaryDecorator subscriptionSummaryDecorator = (SubscriptionSummaryDecorator) S2.a.c(SubscriptionActivity.this.t1().p(), null, null, null, composer, 0, 7).getValue();
            ProductFullDetails productFullDetails = this.f119939b;
            AbstractC16490a.CreateSubscription createSubscription = new AbstractC16490a.CreateSubscription(this.f119940c);
            SubscriptionDetails subscriptionDetails = subscriptionSummaryDecorator != null ? subscriptionSummaryDecorator.getSubscriptionDetails() : null;
            if (subscriptionSummaryDecorator == null || subscriptionSummaryDecorator.getSubscriptionDetails() == null || (enumC16491b = EnumC16491b.f157068c) == null) {
                enumC16491b = EnumC16491b.f157067b;
            }
            SubscriptionSummaryDecorator subscriptionSummaryDecorator2 = new SubscriptionSummaryDecorator(productFullDetails, createSubscription, subscriptionDetails, enumC16491b);
            final C17959M0 c17959m0J = C17957L0.j(EnumC17961N0.f168314a, null, null, true, composer, 3078, 6);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(SubscriptionActivity.this) | composer.D(c17959m0J);
            final SubscriptionActivity subscriptionActivity2 = SubscriptionActivity.this;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SubscriptionActivity.b.g(subscriptionActivity2, c17959m0J);
                    }
                };
                composer.t(objB2);
            }
            Function0 function0 = (Function0) objB2;
            composer.P();
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(SubscriptionActivity.this) | composer.D(c17959m0J);
            final SubscriptionActivity subscriptionActivity3 = SubscriptionActivity.this;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SubscriptionActivity.b.k(subscriptionActivity3, c17959m0J);
                    }
                };
                composer.t(objB3);
            }
            Function0 function02 = (Function0) objB3;
            composer.P();
            Object objF = f(z1VarC);
            composer.startReplaceGroup(-1633490746);
            boolean zV = composer.V(objF) | composer.V(subscriptionSummaryDecorator2);
            final SubscriptionActivity subscriptionActivity4 = SubscriptionActivity.this;
            Object objB4 = composer.B();
            if (zV || objB4 == companion.a()) {
                objB4 = new SubscriptionNavConfig(f(z1VarC), subscriptionSummaryDecorator2, new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SubscriptionActivity.b.l(subscriptionActivity4);
                    }
                });
                composer.t(objB4);
            }
            SubscriptionNavConfig subscriptionNavConfig = (SubscriptionNavConfig) objB4;
            composer.P();
            Unit unit = Unit.f143329a;
            composer.startReplaceGroup(-1633490746);
            boolean zD3 = composer.D(SubscriptionActivity.this) | composer.D(c14680uE);
            SubscriptionActivity subscriptionActivity5 = SubscriptionActivity.this;
            Object objB5 = composer.B();
            if (zD3 || objB5 == companion.a()) {
                objB5 = new a(subscriptionActivity5, c14680uE, null);
                composer.t(objB5);
            }
            composer.P();
            androidx.compose.runtime.J.g(unit, (Function2) objB5, composer, 6);
            Boolean boolValueOf = Boolean.valueOf(f(z1VarC).getDisplayHowItWorks());
            composer.startReplaceGroup(-1746271574);
            boolean zV2 = composer.V(z1VarC) | composer.D(c17959m0J) | composer.D(SubscriptionActivity.this);
            SubscriptionActivity subscriptionActivity6 = SubscriptionActivity.this;
            Object objB6 = composer.B();
            if (zV2 || objB6 == companion.a()) {
                objB6 = new C1937b(c17959m0J, subscriptionActivity6, z1VarC, null);
                composer.t(objB6);
            }
            composer.P();
            androidx.compose.runtime.J.g(boolValueOf, (Function2) objB6, composer, 0);
            Ki.K.b(null, ComposableLambdaKt.c(-709450775, true, new c(c14680uE, SubscriptionActivity.this, c17959m0J, function02, subscriptionNavConfig, function0), composer, 54), composer, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            e(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SubscriptionViewState f(z1<SubscriptionViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0 g(SubscriptionActivity subscriptionActivity, C17959M0 c17959m0) {
            InterfaceC15783O interfaceC15783O;
            InterfaceC15783O interfaceC15783O2 = subscriptionActivity.coroutineScope;
            if (interfaceC15783O2 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O = null;
            } else {
                interfaceC15783O = interfaceC15783O2;
            }
            return C15809k.d(interfaceC15783O, null, null, new e(c17959m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C0 k(SubscriptionActivity subscriptionActivity, C17959M0 c17959m0) {
            InterfaceC15783O interfaceC15783O;
            InterfaceC15783O interfaceC15783O2 = subscriptionActivity.coroutineScope;
            if (interfaceC15783O2 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O = null;
            } else {
                interfaceC15783O = interfaceC15783O2;
            }
            return C15809k.d(interfaceC15783O, null, null, new d(c17959m0, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(SubscriptionActivity subscriptionActivity) {
            subscriptionActivity.finish();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119968f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f119968f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f119968f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119969f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f119969f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f119969f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f119970f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119971g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f119970f = function0;
            this.f119971g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f119970f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f119971g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119972f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f119972f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f119972f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119973f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f119973f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f119973f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f119974f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119975g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f119974f = function0;
            this.f119975g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f119974f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f119975g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1(int resultCode) {
        setResult(resultCode, new Intent());
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16493d t1() {
        return (C16493d) this.subscriptionSummaryVM.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E u1() {
        return (E) this.subscriptionVM.getValue();
    }

    public final Dl.e s1() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    @Override // com.meijer.mobile.subscription.ux.subscription.Hilt_SubscriptionActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object obj;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.PRODUCT", nk.f.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.PRODUCT");
            if (!(parcelableExtra instanceof nk.f)) {
                parcelableExtra = null;
            }
            obj = (nk.f) parcelableExtra;
        }
        Intrinsics.g(obj);
        nk.f fVar = (nk.f) obj;
        ProductFullDetails productFullDetailsA = Co.l.a(fVar);
        t1().r(productFullDetailsA);
        u1().O(productFullDetailsA);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1789219494, true, new b(productFullDetailsA, fVar)), 1, null);
    }
}
