package com.meijer.mobile.meijer.activity.rewards;

import Al.n;
import Bi.m;
import Bj.o;
import Bj.p;
import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import Ji.Q;
import V0.C5346q0;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5662h;
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
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity;
import hi.C14476c;
import j0.InterfaceC14794C;
import je.C14886b;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
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
import tv.C17154h;
import tv.InterfaceC17144F;
import un.C17288c;
import wn.AbstractC17841a;
import xn.C18072a;
import xn.MccEnrollmentForm;
import yr.C18299z;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-²\u0006\f\u0010,\u001a\u00020+8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/rewards/AvailableMccDetailsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "", "phoneNumber", "", "K1", "(Ljava/lang/String;)V", "", "message", "M1", "(I)V", "N1", "Q1", "P1", "O1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "LZn/a;", "s", "LZn/a;", "getRewardsRepository", "()LZn/a;", "setRewardsRepository", "(LZn/a;)V", "rewardsRepository", "Lxn/a;", "t", "Lkotlin/Lazy;", "J1", "()Lxn/a;", "viewModel", "Lxn/f;", "u", "Lxn/f;", "enrollmentForm", "v", "a", "Lxn/a$b;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AvailableMccDetailsActivity extends Hilt_AvailableMccDetailsActivity {

    /* renamed from: w, reason: collision with root package name */
    public static final int f111579w = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Zn.a rewardsRepository;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(C18072a.class), new d(this), new c(this), new e(null, this));

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private MccEnrollmentForm enrollmentForm;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AvailableMccDetailsActivity f111584a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<C18072a.ViewState> f111585b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$a$a, reason: collision with other inner class name */
            static final class C1720a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111586a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AvailableMccDetailsActivity f111587b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1721a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111588a;

                    C1721a(LocalThemeScope localThemeScope) {
                        this.f111588a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(598484148, i10, -1, "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AvailableMccDetailsActivity.kt:83)");
                        }
                        Dr.g.g(this.f111588a, C16193g.c(Y.f100017d8, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f15770g, 126);
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
                        ComposerKt.U(1134109044, i10, -1, "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AvailableMccDetailsActivity.kt:82)");
                    }
                    LocalThemeScope localThemeScope = this.f111586a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(598484148, true, new C1721a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f111587b);
                    final AvailableMccDetailsActivity availableMccDetailsActivity = this.f111587b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.rewards.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AvailableMccDetailsActivity.b.a.C1720a.c(availableMccDetailsActivity);
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

                C1720a(LocalThemeScope localThemeScope, AvailableMccDetailsActivity availableMccDetailsActivity) {
                    this.f111586a = localThemeScope;
                    this.f111587b = availableMccDetailsActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(AvailableMccDetailsActivity availableMccDetailsActivity) {
                    if (!availableMccDetailsActivity.onNavigateUp()) {
                        availableMccDetailsActivity.finish();
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$a$b, reason: collision with other inner class name */
            static final class C1722b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111589a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AvailableMccDetailsActivity f111590b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<C18072a.ViewState> f111591c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C1723a extends FunctionReferenceImpl implements Function1<AbstractC17841a, Unit> {
                    C1723a(Object obj) {
                        super(1, obj, C18072a.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/rewards/viewmodel/action/AvailableMccDetailsAction;)V", 0);
                    }

                    public final void a(AbstractC17841a p02) {
                        Intrinsics.j(p02, "p0");
                        ((C18072a) this.receiver).s(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC17841a abstractC17841a) {
                        a(abstractC17841a);
                        return Unit.f142422a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$a$b$b, reason: collision with other inner class name */
                static final class C1724b implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f111592a;

                    C1724b(LocalThemeScope localThemeScope) {
                        this.f111592a = localThemeScope;
                    }

                    public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(1988747473, i10, -1, "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AvailableMccDetailsActivity.kt:104)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Bi.o oVar = Bi.o.f2584a;
                        m.d(this.f111592a, J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f15770g | 3120 | (q1.k.Large.f140090f << 6), 56);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
                        a(interfaceC14920X, composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                C1722b(LocalThemeScope localThemeScope, AvailableMccDetailsActivity availableMccDetailsActivity, z1<C18072a.ViewState> z1Var) {
                    this.f111589a = localThemeScope;
                    this.f111590b = availableMccDetailsActivity;
                    this.f111591c = z1Var;
                }

                public final void a(InterfaceC14794C contentPadding, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(contentPadding) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(577154203, i11, -1, "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AvailableMccDetailsActivity.kt:90)");
                    }
                    LocalThemeScope localThemeScope = this.f111589a;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH = D.h(J.f(companion, 0.0f, 1, null), contentPadding);
                    C18072a.ViewState viewStateC = b.c(this.f111591c);
                    C18072a c18072aJ1 = this.f111590b.J1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(c18072aJ1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1723a(c18072aJ1);
                        composer.t(objB);
                    }
                    composer.P();
                    int i12 = LocalThemeScope.f15770g;
                    C17288c.c(localThemeScope, modifierH, viewStateC, (Function1) ((KFunction) objB), composer, i12, 0);
                    if (b.c(this.f111591c).getLoadingState().getIsLoading()) {
                        C5662h.a(androidx.compose.foundation.b.d(J.f(companion, 0.0f, 1, null), C5346q0.q(this.f111589a.getAdsColors().getAdsColorUIBackground01().getColor(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 0);
                        LocalThemeScope localThemeScope2 = this.f111589a;
                        Q.e(localThemeScope2, Q0.b.f139711a, ComposableLambdaKt.c(1988747473, true, new C1724b(localThemeScope2), composer, 54), composer, i12 | 384 | (Q0.b.f139712b << 3));
                    }
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

            a(AvailableMccDetailsActivity availableMccDetailsActivity, z1<C18072a.ViewState> z1Var) {
                this.f111584a = availableMccDetailsActivity;
                this.f111585b = z1Var;
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
                    ComposerKt.U(2040235417, i11, -1, "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity.onCreate.<anonymous>.<anonymous> (AvailableMccDetailsActivity.kt:76)");
                }
                C17921a1.a(C18299z.c(FullStoryAnnotationsKt.fsUnmask(J.f(Modifier.INSTANCE, 0.0f, 1, null)), false, 1, null), null, ComposableLambdaKt.c(1134109044, true, new C1720a(AdsTheme, this.f111584a), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(577154203, true, new C1722b(AdsTheme, this.f111584a, this.f111585b), composer, 54), composer, 384, 12582912, 131066);
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
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$onCreate$1$2$1", f = "AvailableMccDetailsActivity.kt", l = {116}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$b, reason: collision with other inner class name */
        static final class C1725b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f111593a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AvailableMccDetailsActivity f111594b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1725b(AvailableMccDetailsActivity availableMccDetailsActivity, Continuation<? super C1725b> continuation) {
                super(2, continuation);
                this.f111594b = availableMccDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1725b(this.f111594b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxn/a$a;", "effect", "", "<anonymous>", "(Lxn/a$a;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$onCreate$1$2$1$1", f = "AvailableMccDetailsActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$b$a */
            static final class a extends SuspendLambda implements Function2<C18072a.AbstractC2721a, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f111595a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f111596b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AvailableMccDetailsActivity f111597c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(AvailableMccDetailsActivity availableMccDetailsActivity, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f111597c = availableMccDetailsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f111597c, continuation);
                    aVar.f111596b = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C18072a.AbstractC2721a abstractC2721a, Continuation<? super Unit> continuation) {
                    return ((a) create(abstractC2721a, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f111595a == 0) {
                        ResultKt.b(obj);
                        C18072a.AbstractC2721a abstractC2721a = (C18072a.AbstractC2721a) this.f111596b;
                        if (abstractC2721a instanceof C18072a.AbstractC2721a.CallMccHelpLine) {
                            this.f111597c.K1(((C18072a.AbstractC2721a.CallMccHelpLine) abstractC2721a).getPhoneNumber());
                        } else if (abstractC2721a instanceof C18072a.AbstractC2721a.DisplayErrorDialog) {
                            this.f111597c.M1(((C18072a.AbstractC2721a.DisplayErrorDialog) abstractC2721a).getMessage());
                        } else if (Intrinsics.e(abstractC2721a, C18072a.AbstractC2721a.c.f169705a)) {
                            this.f111597c.Q1();
                        } else if (Intrinsics.e(abstractC2721a, C18072a.AbstractC2721a.d.f169706a)) {
                            this.f111597c.N1();
                        } else if (Intrinsics.e(abstractC2721a, C18072a.AbstractC2721a.e.f169707a)) {
                            this.f111597c.O1();
                        } else if (Intrinsics.e(abstractC2721a, C18072a.AbstractC2721a.f.f169708a)) {
                            this.f111597c.P1();
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
                return ((C1725b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f111593a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<C18072a.AbstractC2721a> interfaceC17144FQ = this.f111594b.J1().q();
                    a aVar = new a(this.f111594b, null);
                    this.f111593a = 1;
                    if (C17154h.k(interfaceC17144FQ, aVar, this) == objF) {
                        return objF;
                    }
                }
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
                ComposerKt.U(2078051144, i10, -1, "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity.onCreate.<anonymous> (AvailableMccDetailsActivity.kt:74)");
            }
            K.b(null, ComposableLambdaKt.c(2040235417, true, new a(AvailableMccDetailsActivity.this, S2.a.c(AvailableMccDetailsActivity.this.J1().r(), null, null, null, composer, 0, 7)), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(AvailableMccDetailsActivity.this);
            AvailableMccDetailsActivity availableMccDetailsActivity = AvailableMccDetailsActivity.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new C1725b(availableMccDetailsActivity, null);
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.J.g("AvailableMccDetailsActivity", (Function2) objB, composer, 6);
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
        public static final C18072a.ViewState c(z1<C18072a.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111598f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f111598f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f111598f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111599f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f111599f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f111599f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f111600f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f111601g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f111600f = function0;
            this.f111601g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f111600f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f111601g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(int message) {
        new Pj.j(this, message, new Object[0]).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1() {
        setResult(3400);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1() {
        new Pj.j(this, Y.f99728O7, new Object[0]).r(Y.f99747P7, new Object[0]).g();
    }

    public final C18072a J1() {
        return (C18072a) this.viewModel.getValue();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.j(outState, "outState");
        super.onSaveInstanceState(outState);
        MccEnrollmentForm mccEnrollmentForm = this.enrollmentForm;
        if (mccEnrollmentForm == null) {
            Intrinsics.y("enrollmentForm");
            mccEnrollmentForm = null;
        }
        outState.putParcelable("enrollmentFormKey", mccEnrollmentForm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(String phoneNumber) {
        try {
            startActivity(getMeijerIntent().N(phoneNumber));
        } catch (ActivityNotFoundException unused) {
            new C14886b(this, p.f3057a).setCancelable(false).setMessage(Fh.h.f10720j1).setPositiveButton(getString(Fh.h.f10826y2), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.rewards.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    AvailableMccDetailsActivity.L1(dialogInterface, i10);
                }
            }).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N1() {
        getAnalyticsEngine().b(C14476c.a("event: mperks: rewards: mcard: apply today"), C14476c.c("mperks: rewards: mcard"), C14476c.g("mperks"));
        Cl.e meijerIntent = getMeijerIntent();
        String string = getString(n.f683g);
        Intrinsics.i(string, "getString(...)");
        meijerIntent.d0(this, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1() {
        getMeijerIntent().v(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r0 = 0
            if (r8 == 0) goto L26
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            java.lang.String r3 = "enrollmentFormKey"
            if (r1 < r2) goto L17
            java.lang.Class<xn.f> r1 = xn.MccEnrollmentForm.class
            java.lang.Object r8 = com.google.android.libraries.places.internal.a.a(r8, r3, r1)
            android.os.Parcelable r8 = (android.os.Parcelable) r8
            goto L22
        L17:
            android.os.Parcelable r8 = r8.getParcelable(r3)
            boolean r1 = r8 instanceof xn.MccEnrollmentForm
            if (r1 != 0) goto L20
            r8 = r0
        L20:
            xn.f r8 = (xn.MccEnrollmentForm) r8
        L22:
            xn.f r8 = (xn.MccEnrollmentForm) r8
            if (r8 != 0) goto L31
        L26:
            xn.f r1 = new xn.f
            r5 = 7
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r8 = r1
        L31:
            r7.enrollmentForm = r8
            com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b r8 = new com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b
            r8.<init>()
            r1 = 2078051144(0x7bdc8b48, float:2.2902605E36)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(r1, r2, r8)
            e.C13589e.b(r7, r0, r8, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity.onCreate(android.os.Bundle):void");
    }
}
