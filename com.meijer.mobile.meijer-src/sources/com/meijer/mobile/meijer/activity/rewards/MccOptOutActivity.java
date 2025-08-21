package com.meijer.mobile.meijer.activity.rewards;

import Cj.o;
import Ds.m;
import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import V2.CreationExtras;
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
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.home.HomeViewModel;
import com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity;
import e.C13737e;
import ii.C14756c;
import ii.TrackingData;
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
import mv.InterfaceC15783O;
import p1.C16338g;
import pv.C16563h;
import pv.InterfaceC16553F;
import un.AbstractC17449a;
import yn.h;
import yr.C18370z;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/rewards/MccOptOutActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "", "J1", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "error", "I1", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lyn/h;", "s", "Lkotlin/Lazy;", "G1", "()Lyn/h;", "viewModel", "Lyn/h$b;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class MccOptOutActivity extends Hilt_MccOptOutActivity {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(yn.h.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a, reason: collision with other inner class name */
        static final class C1740a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MccOptOutActivity f112506a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<h.ViewState> f112507b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a$a, reason: collision with other inner class name */
            static final class C1741a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112508a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MccOptOutActivity f112509b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1742a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f112510a;

                    C1742a(LocalThemeScope localThemeScope) {
                        this.f112510a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-593527372, i10, -1, "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MccOptOutActivity.kt:67)");
                        }
                        Dr.g.g(this.f112510a, C16338g.c(Y.f100859c8, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-136684940, i10, -1, "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MccOptOutActivity.kt:66)");
                    }
                    LocalThemeScope localThemeScope = this.f112508a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-593527372, true, new C1742a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f112509b);
                    final MccOptOutActivity mccOptOutActivity = this.f112509b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.rewards.i
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MccOptOutActivity.a.C1740a.C1741a.c(mccOptOutActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.f.d.f17051e, 0.0f, false, AbstractC6392a.INSTANCE.d(o.f5080p, new Object[0]), composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1741a(LocalThemeScope localThemeScope, MccOptOutActivity mccOptOutActivity) {
                    this.f112508a = localThemeScope;
                    this.f112509b = mccOptOutActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(MccOptOutActivity mccOptOutActivity) {
                    if (!mccOptOutActivity.onNavigateUp()) {
                        mccOptOutActivity.finish();
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a$b */
            static final class b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112511a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MccOptOutActivity f112512b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<h.ViewState> f112513c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C1743a extends FunctionReferenceImpl implements Function1<AbstractC17449a, Unit> {
                    C1743a(Object obj) {
                        super(1, obj, yn.h.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/rewards/actions/MccOptOutAction;)V", 0);
                    }

                    public final void a(AbstractC17449a p02) {
                        Intrinsics.j(p02, "p0");
                        ((yn.h) this.receiver).s(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC17449a abstractC17449a) {
                        a(abstractC17449a);
                        return Unit.f143329a;
                    }
                }

                b(LocalThemeScope localThemeScope, MccOptOutActivity mccOptOutActivity, z1<h.ViewState> z1Var) {
                    this.f112511a = localThemeScope;
                    this.f112512b = mccOptOutActivity;
                    this.f112513c = z1Var;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1516470253, i10, -1, "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MccOptOutActivity.kt:74)");
                    }
                    LocalThemeScope localThemeScope = this.f112511a;
                    boolean optOutAccepted = a.c(this.f112513c).getOptOutAccepted();
                    yn.h hVarG1 = this.f112512b.G1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(hVarG1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1743a(hVarG1);
                        composer.t(objB);
                    }
                    composer.P();
                    wn.c.c(localThemeScope, null, optOutAccepted, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g, 1);
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

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a$c */
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112514a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ MccOptOutActivity f112515b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<h.ViewState> f112516c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1744a extends FunctionReferenceImpl implements Function1<AbstractC17449a, Unit> {
                    C1744a(Object obj) {
                        super(1, obj, yn.h.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/rewards/actions/MccOptOutAction;)V", 0);
                    }

                    public final void a(AbstractC17449a p02) {
                        Intrinsics.j(p02, "p0");
                        ((yn.h) this.receiver).s(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC17449a abstractC17449a) {
                        a(abstractC17449a);
                        return Unit.f143329a;
                    }
                }

                c(LocalThemeScope localThemeScope, MccOptOutActivity mccOptOutActivity, z1<h.ViewState> z1Var) {
                    this.f112514a = localThemeScope;
                    this.f112515b = mccOptOutActivity;
                    this.f112516c = z1Var;
                }

                public final void a(InterfaceC14882C contentPadding, Composer composer, int i10) {
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
                    LocalThemeScope localThemeScope = this.f112514a;
                    Modifier modifierH = D.h(Modifier.INSTANCE, contentPadding);
                    h.ViewState viewStateC = a.c(this.f112516c);
                    yn.h hVarG1 = this.f112515b.G1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(hVarG1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1744a(hVarG1);
                        composer.t(objB);
                    }
                    composer.P();
                    wn.g.c(localThemeScope, modifierH, viewStateC, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g | (Pj.a.f26096c << 6), 0);
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

            C1740a(MccOptOutActivity mccOptOutActivity, z1<h.ViewState> z1Var) {
                this.f112506a = mccOptOutActivity;
                this.f112507b = z1Var;
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
                C17987a1.a(C18370z.c(J.f(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), 0.0f, 1, null), false, 1, null), null, ComposableLambdaKt.c(-136684940, true, new C1741a(AdsTheme, this.f112506a), composer, 54), ComposableLambdaKt.c(-1516470253, true, new b(AdsTheme, this.f112506a, this.f112507b), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(1685700379, true, new c(AdsTheme, this.f112506a, this.f112507b), composer, 54), composer, 3456, 12582912, 131058);
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$onCreate$1$2$1", f = "MccOptOutActivity.kt", l = {90}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112517a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MccOptOutActivity f112518b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(MccOptOutActivity mccOptOutActivity, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f112518b = mccOptOutActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f112518b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyn/h$a;", "effect", "", "<anonymous>", "(Lyn/h$a;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$onCreate$1$2$1$1", f = "MccOptOutActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.MccOptOutActivity$a$b$a, reason: collision with other inner class name */
            static final class C1745a extends SuspendLambda implements Function2<h.a, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f112519a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f112520b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ MccOptOutActivity f112521c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1745a(MccOptOutActivity mccOptOutActivity, Continuation<? super C1745a> continuation) {
                    super(2, continuation);
                    this.f112521c = mccOptOutActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1745a c1745a = new C1745a(this.f112521c, continuation);
                    c1745a.f112520b = obj;
                    return c1745a;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(h.a aVar, Continuation<? super Unit> continuation) {
                    return ((C1745a) create(aVar, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f112519a == 0) {
                        ResultKt.b(obj);
                        h.a aVar = (h.a) this.f112520b;
                        if (aVar instanceof h.a.OptOutFailed) {
                            this.f112521c.I1(((h.a.OptOutFailed) aVar).getException());
                        } else if (Intrinsics.e(aVar, h.a.b.f171553a)) {
                            this.f112521c.J1();
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112517a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<h.a> interfaceC16553FQ = this.f112518b.G1().q();
                    C1745a c1745a = new C1745a(this.f112518b, null);
                    this.f112517a = 1;
                    if (C16563h.k(interfaceC16553FQ, c1745a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
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
            K.b(null, ComposableLambdaKt.c(1357546265, true, new C1740a(MccOptOutActivity.this, S2.a.c(MccOptOutActivity.this.G1().r(), null, null, null, composer, 0, 7)), composer, 54), composer, 48, 1);
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
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h.ViewState c(z1<h.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112522f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f112522f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f112522f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112523f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f112523f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f112523f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f112524f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112525g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f112524f = function0;
            this.f112525g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f112524f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f112525g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J1() {
        m.a(this, "You have successfully opted out.", new Object[0]);
        setResult(3301);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yn.h G1() {
        return (yn.h) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("mperks");
        track.h("siteparentcategory", HomeViewModel.MperksLoadingKey);
        track.h("hier1", "mperks: rewards: mcard: opt out are you sure page");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I1(RetrofitException error) {
        if (error == null) {
            new Qj.j(this, getString(Y.f101115p5)).g();
        } else {
            new Qj.j(this, error.c(this)).g();
        }
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-598870456, true, new a()), 1, null);
        getAnalyticsEngine().b(C14756c.h("mperks: rewards: mcard: opt out are you sure page"), new Function1() { // from class: com.meijer.mobile.meijer.activity.rewards.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MccOptOutActivity.H1((TrackingData) obj);
            }
        });
    }
}
