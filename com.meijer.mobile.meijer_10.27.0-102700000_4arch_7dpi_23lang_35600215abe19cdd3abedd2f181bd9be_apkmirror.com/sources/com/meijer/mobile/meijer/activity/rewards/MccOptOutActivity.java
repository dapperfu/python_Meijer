package com.meijer.mobile.meijer.activity.rewards;

import Bj.o;
import Ds.m;
import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.os.Bundle;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity;
import e.C13589e;
import hi.C14476c;
import hi.TrackingData;
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
import qv.InterfaceC16622O;
import tn.AbstractC17125a;
import tv.C17154h;
import tv.InterfaceC17144F;
import xn.h;
import yr.C18299z;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/rewards/MccOptOutActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "", "J1", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "error", "I1", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lxn/h;", "s", "Lkotlin/Lazy;", "G1", "()Lxn/h;", "viewModel", "Lxn/h$b;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MccOptOutActivity extends Hilt_MccOptOutActivity {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(xn.h.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a, reason: collision with other inner class name */
        static final class C1731a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MccOptOutActivity f111637a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<h.ViewState> f111638b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a$a, reason: collision with other inner class name */
            static final class C1732a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111639a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MccOptOutActivity f111640b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1733a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111641a;

                    C1733a(LocalThemeScope localThemeScope) {
                        this.f111641a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-593527372, i10, -1, "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MccOptOutActivity.kt:67)");
                        }
                        Dr.g.g(this.f111641a, C16193g.c(Y.f99937Z7, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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
                        ComposerKt.U(-136684940, i10, -1, "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MccOptOutActivity.kt:66)");
                    }
                    LocalThemeScope localThemeScope = this.f111639a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-593527372, true, new C1733a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f111640b);
                    final MccOptOutActivity mccOptOutActivity = this.f111640b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.rewards.i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MccOptOutActivity.a.C1731a.C1732a.c(mccOptOutActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.f.d.f15507e, 0.0f, false, AbstractC5607a.INSTANCE.d(o.f3035p, new Object[0]), composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1732a(LocalThemeScope localThemeScope, MccOptOutActivity mccOptOutActivity) {
                    this.f111639a = localThemeScope;
                    this.f111640b = mccOptOutActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(MccOptOutActivity mccOptOutActivity) {
                    if (!mccOptOutActivity.onNavigateUp()) {
                        mccOptOutActivity.finish();
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111642a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MccOptOutActivity f111643b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<h.ViewState> f111644c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C1734a extends FunctionReferenceImpl implements Function1<AbstractC17125a, Unit> {
                    C1734a(Object obj) {
                        super(1, obj, xn.h.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/rewards/actions/MccOptOutAction;)V", 0);
                    }

                    public final void a(AbstractC17125a p02) {
                        Intrinsics.j(p02, "p0");
                        ((xn.h) this.receiver).s(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC17125a abstractC17125a) {
                        a(abstractC17125a);
                        return Unit.f142422a;
                    }
                }

                b(LocalThemeScope localThemeScope, MccOptOutActivity mccOptOutActivity, z1<h.ViewState> z1Var) {
                    this.f111642a = localThemeScope;
                    this.f111643b = mccOptOutActivity;
                    this.f111644c = z1Var;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1516470253, i10, -1, "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MccOptOutActivity.kt:74)");
                    }
                    LocalThemeScope localThemeScope = this.f111642a;
                    boolean optOutAccepted = a.c(this.f111644c).getOptOutAccepted();
                    xn.h hVarG1 = this.f111643b.G1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(hVarG1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1734a(hVarG1);
                        composer.t(objB);
                    }
                    composer.P();
                    vn.c.c(localThemeScope, null, optOutAccepted, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g, 1);
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

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a$c */
            static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111645a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MccOptOutActivity f111646b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<h.ViewState> f111647c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1735a extends FunctionReferenceImpl implements Function1<AbstractC17125a, Unit> {
                    C1735a(Object obj) {
                        super(1, obj, xn.h.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/rewards/actions/MccOptOutAction;)V", 0);
                    }

                    public final void a(AbstractC17125a p02) {
                        Intrinsics.j(p02, "p0");
                        ((xn.h) this.receiver).s(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC17125a abstractC17125a) {
                        a(abstractC17125a);
                        return Unit.f142422a;
                    }
                }

                c(LocalThemeScope localThemeScope, MccOptOutActivity mccOptOutActivity, z1<h.ViewState> z1Var) {
                    this.f111645a = localThemeScope;
                    this.f111646b = mccOptOutActivity;
                    this.f111647c = z1Var;
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
                        ComposerKt.U(1685700379, i10, -1, "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MccOptOutActivity.kt:80)");
                    }
                    LocalThemeScope localThemeScope = this.f111645a;
                    Modifier modifierH = D.h(Modifier.INSTANCE, contentPadding);
                    h.ViewState viewStateC = a.c(this.f111647c);
                    xn.h hVarG1 = this.f111646b.G1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(hVarG1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1735a(hVarG1);
                        composer.t(objB);
                    }
                    composer.P();
                    vn.g.c(localThemeScope, modifierH, viewStateC, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g | (Oj.a.f23966c << 6), 0);
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

            C1731a(MccOptOutActivity mccOptOutActivity, z1<h.ViewState> z1Var) {
                this.f111637a = mccOptOutActivity;
                this.f111638b = z1Var;
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
                    ComposerKt.U(1357546265, i11, -1, "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity.onCreate.<anonymous>.<anonymous> (MccOptOutActivity.kt:60)");
                }
                C17921a1.a(C18299z.c(J.f(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), 0.0f, 1, null), false, 1, null), null, ComposableLambdaKt.c(-136684940, true, new C1732a(AdsTheme, this.f111637a), composer, 54), ComposableLambdaKt.c(-1516470253, true, new b(AdsTheme, this.f111637a, this.f111638b), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(1685700379, true, new c(AdsTheme, this.f111637a, this.f111638b), composer, 54), composer, 3456, 12582912, 131058);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$onCreate$1$2$1", f = "MccOptOutActivity.kt", l = {90}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111648a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MccOptOutActivity f111649b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MccOptOutActivity mccOptOutActivity, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f111649b = mccOptOutActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f111649b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxn/h$a;", "effect", "", "<anonymous>", "(Lxn/h$a;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$onCreate$1$2$1$1", f = "MccOptOutActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$b$a, reason: collision with other inner class name */
            static final class C1736a extends SuspendLambda implements Function2<h.a, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f111650a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f111651b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ MccOptOutActivity f111652c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1736a(MccOptOutActivity mccOptOutActivity, Continuation<? super C1736a> continuation) {
                    super(2, continuation);
                    this.f111652c = mccOptOutActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1736a c1736a = new C1736a(this.f111652c, continuation);
                    c1736a.f111651b = obj;
                    return c1736a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(h.a aVar, Continuation<? super Unit> continuation) {
                    return ((C1736a) create(aVar, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f111650a == 0) {
                        ResultKt.b(obj);
                        h.a aVar = (h.a) this.f111651b;
                        if (aVar instanceof h.a.OptOutFailed) {
                            this.f111652c.I1(((h.a.OptOutFailed) aVar).getException());
                        } else if (Intrinsics.e(aVar, h.a.b.f169776a)) {
                            this.f111652c.J1();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111648a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<h.a> interfaceC17144FQ = this.f111649b.G1().q();
                    C1736a c1736a = new C1736a(this.f111649b, null);
                    this.f111648a = 1;
                    if (C17154h.k(interfaceC17144FQ, c1736a, this) == objF) {
                        return objF;
                    }
                }
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
                ComposerKt.U(-598870456, i10, -1, "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity.onCreate.<anonymous> (MccOptOutActivity.kt:58)");
            }
            K.b(null, ComposableLambdaKt.c(1357546265, true, new C1731a(MccOptOutActivity.this, S2.a.c(MccOptOutActivity.this.G1().r(), null, null, null, composer, 0, 7)), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(MccOptOutActivity.this);
            MccOptOutActivity mccOptOutActivity = MccOptOutActivity.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new b(mccOptOutActivity, null);
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.J.g("MccOptOutActivity", (Function2) objB, composer, 6);
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
        public static final h.ViewState c(z1<h.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111653f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f111653f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111653f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111654f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f111654f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f111654f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111655f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111656g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111655f = function0;
            this.f111656g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111655f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111656g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1() {
        m.a(this, "You have successfully opted out.", new Object[0]);
        setResult(3301);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xn.h G1() {
        return (xn.h) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mperks");
        track.h("siteparentcategory", HomeViewModel.MperksLoadingKey);
        track.h("hier1", "mperks: rewards: mcard: opt out are you sure page");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1(RetrofitException error) {
        if (error == null) {
            new Pj.j(this, getString(Y.f100253p5)).g();
        } else {
            new Pj.j(this, error.c(this)).g();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-598870456, true, new a()), 1, null);
        getAnalyticsEngine().h(C14476c.h("mperks: rewards: mcard: opt out are you sure page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.rewards.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MccOptOutActivity.H1((TrackingData) obj);
            }
        });
    }
}
