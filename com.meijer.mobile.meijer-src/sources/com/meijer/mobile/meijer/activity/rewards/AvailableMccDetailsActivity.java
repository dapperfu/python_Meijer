package com.meijer.mobile.meijer.activity.rewards;

import Bl.n;
import Ci.m;
import Cj.o;
import Cj.p;
import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import Ki.Q;
import V0.C5489q0;
import V2.CreationExtras;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.foundation.layout.C5804h;
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
import ao.C6282a;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity;
import ii.C14756c;
import j0.InterfaceC14882C;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
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
import le.C15485b;
import mv.InterfaceC15783O;
import p1.C16338g;
import pv.C16563h;
import pv.InterfaceC16553F;
import vn.C17702c;
import xn.AbstractC18200a;
import yn.C18334a;
import yn.MccEnrollmentForm;
import yr.C18370z;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-²\u0006\f\u0010,\u001a\u00020+8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/rewards/AvailableMccDetailsActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "<init>", "()V", "", "phoneNumber", "", "K1", "(Ljava/lang/String;)V", "", "message", "M1", "(I)V", "N1", "Q1", "P1", "O1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Lao/a;", "s", "Lao/a;", "getRewardsRepository", "()Lao/a;", "setRewardsRepository", "(Lao/a;)V", "rewardsRepository", "Lyn/a;", "t", "Lkotlin/Lazy;", "J1", "()Lyn/a;", "viewModel", "Lyn/f;", "u", "Lyn/f;", "enrollmentForm", "v", "a", "Lyn/a$b;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class AvailableMccDetailsActivity extends Hilt_AvailableMccDetailsActivity {

    /* renamed from: w, reason: collision with root package name */
    public static final int f112448w = 8;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public C6282a rewardsRepository;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(C18334a.class), new d(this), new c(this), new e(null, this));

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private MccEnrollmentForm enrollmentForm;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AvailableMccDetailsActivity f112453a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ z1<C18334a.ViewState> f112454b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$a$a, reason: collision with other inner class name */
            static final class C1729a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112455a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AvailableMccDetailsActivity f112456b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1730a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f112457a;

                    C1730a(LocalThemeScope localThemeScope) {
                        this.f112457a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(598484148, i10, -1, "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AvailableMccDetailsActivity.kt:83)");
                        }
                        Dr.g.g(this.f112457a, C16338g.c(Y.f100939g8, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
                        ComposerKt.U(1134109044, i10, -1, "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (AvailableMccDetailsActivity.kt:82)");
                    }
                    LocalThemeScope localThemeScope = this.f112455a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(598484148, true, new C1730a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f112456b);
                    final AvailableMccDetailsActivity availableMccDetailsActivity = this.f112456b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.rewards.b
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AvailableMccDetailsActivity.b.a.C1729a.c(availableMccDetailsActivity);
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

                C1729a(LocalThemeScope localThemeScope, AvailableMccDetailsActivity availableMccDetailsActivity) {
                    this.f112455a = localThemeScope;
                    this.f112456b = availableMccDetailsActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(AvailableMccDetailsActivity availableMccDetailsActivity) {
                    if (!availableMccDetailsActivity.onNavigateUp()) {
                        availableMccDetailsActivity.finish();
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$a$b, reason: collision with other inner class name */
            static final class C1731b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112458a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ AvailableMccDetailsActivity f112459b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<C18334a.ViewState> f112460c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C1732a extends FunctionReferenceImpl implements Function1<AbstractC18200a, Unit> {
                    C1732a(Object obj) {
                        super(1, obj, C18334a.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/rewards/viewmodel/action/AvailableMccDetailsAction;)V", 0);
                    }

                    public final void a(AbstractC18200a p02) {
                        Intrinsics.j(p02, "p0");
                        ((C18334a) this.receiver).s(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AbstractC18200a abstractC18200a) {
                        a(abstractC18200a);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$a$b$b, reason: collision with other inner class name */
                static final class C1733b implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f112461a;

                    C1733b(LocalThemeScope localThemeScope) {
                        this.f112461a = localThemeScope;
                    }

                    public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(1988747473, i10, -1, "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AvailableMccDetailsActivity.kt:104)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Ci.o oVar = Ci.o.f4629a;
                        m.d(this.f112461a, J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.Large.f142345f << 6), 56);
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

                C1731b(LocalThemeScope localThemeScope, AvailableMccDetailsActivity availableMccDetailsActivity, z1<C18334a.ViewState> z1Var) {
                    this.f112458a = localThemeScope;
                    this.f112459b = availableMccDetailsActivity;
                    this.f112460c = z1Var;
                }

                public final void a(InterfaceC14882C contentPadding, Composer composer, int i10) {
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
                    LocalThemeScope localThemeScope = this.f112458a;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH = D.h(J.f(companion, 0.0f, 1, null), contentPadding);
                    C18334a.ViewState viewStateC = b.c(this.f112460c);
                    C18334a c18334aJ1 = this.f112459b.J1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(c18334aJ1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1732a(c18334aJ1);
                        composer.t(objB);
                    }
                    composer.P();
                    int i12 = LocalThemeScope.f17314g;
                    C17702c.c(localThemeScope, modifierH, viewStateC, (Function1) ((KFunction) objB), composer, i12, 0);
                    if (b.c(this.f112460c).getLoadingState().getIsLoading()) {
                        C5804h.a(androidx.compose.foundation.b.d(J.f(companion, 0.0f, 1, null), C5489q0.q(this.f112458a.getAdsColors().getAdsColorUIBackground01().getColor(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 0);
                        LocalThemeScope localThemeScope2 = this.f112458a;
                        Q.e(localThemeScope2, Q0.b.f141966a, ComposableLambdaKt.c(1988747473, true, new C1733b(localThemeScope2), composer, 54), composer, i12 | 384 | (Q0.b.f141967b << 3));
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

            a(AvailableMccDetailsActivity availableMccDetailsActivity, z1<C18334a.ViewState> z1Var) {
                this.f112453a = availableMccDetailsActivity;
                this.f112454b = z1Var;
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
                C17987a1.a(C18370z.c(FullStoryAnnotationsKt.fsUnmask(J.f(Modifier.INSTANCE, 0.0f, 1, null)), false, 1, null), null, ComposableLambdaKt.c(1134109044, true, new C1729a(AdsTheme, this.f112453a), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(577154203, true, new C1731b(AdsTheme, this.f112453a, this.f112454b), composer, 54), composer, 384, 12582912, 131066);
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
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$onCreate$1$2$1", f = "AvailableMccDetailsActivity.kt", l = {116}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$b, reason: collision with other inner class name */
        static final class C1734b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112462a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AvailableMccDetailsActivity f112463b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1734b(AvailableMccDetailsActivity availableMccDetailsActivity, Continuation<? super C1734b> continuation) {
                super(2, continuation);
                this.f112463b = availableMccDetailsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1734b(this.f112463b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyn/a$a;", "effect", "", "<anonymous>", "(Lyn/a$a;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$onCreate$1$2$1$1", f = "AvailableMccDetailsActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity$b$b$a */
            static final class a extends SuspendLambda implements Function2<C18334a.AbstractC2761a, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f112464a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f112465b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AvailableMccDetailsActivity f112466c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(AvailableMccDetailsActivity availableMccDetailsActivity, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f112466c = availableMccDetailsActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f112466c, continuation);
                    aVar.f112465b = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C18334a.AbstractC2761a abstractC2761a, Continuation<? super Unit> continuation) {
                    return ((a) create(abstractC2761a, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f112464a == 0) {
                        ResultKt.b(obj);
                        C18334a.AbstractC2761a abstractC2761a = (C18334a.AbstractC2761a) this.f112465b;
                        if (abstractC2761a instanceof C18334a.AbstractC2761a.CallMccHelpLine) {
                            this.f112466c.K1(((C18334a.AbstractC2761a.CallMccHelpLine) abstractC2761a).getPhoneNumber());
                        } else if (abstractC2761a instanceof C18334a.AbstractC2761a.DisplayErrorDialog) {
                            this.f112466c.M1(((C18334a.AbstractC2761a.DisplayErrorDialog) abstractC2761a).getMessage());
                        } else if (Intrinsics.e(abstractC2761a, C18334a.AbstractC2761a.c.f171482a)) {
                            this.f112466c.Q1();
                        } else if (Intrinsics.e(abstractC2761a, C18334a.AbstractC2761a.d.f171483a)) {
                            this.f112466c.N1();
                        } else if (Intrinsics.e(abstractC2761a, C18334a.AbstractC2761a.e.f171484a)) {
                            this.f112466c.O1();
                        } else if (Intrinsics.e(abstractC2761a, C18334a.AbstractC2761a.f.f171485a)) {
                            this.f112466c.P1();
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
                return ((C1734b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112462a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<C18334a.AbstractC2761a> interfaceC16553FQ = this.f112463b.J1().q();
                    a aVar = new a(this.f112463b, null);
                    this.f112462a = 1;
                    if (C16563h.k(interfaceC16553FQ, aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
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
                objB = new C1734b(availableMccDetailsActivity, null);
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
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C18334a.ViewState c(z1<C18334a.ViewState> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112467f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f112467f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f112467f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112468f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f112468f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f112468f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f112469f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112470g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f112469f = function0;
            this.f112470g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f112469f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f112470g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M1(int message) {
        new Qj.j(this, message, new Object[0]).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P1() {
        setResult(3400);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1() {
        new Qj.j(this, Y.f100647R7, new Object[0]).r(Y.f100666S7, new Object[0]).g();
    }

    public final C18334a J1() {
        return (C18334a) this.viewModel.getValue();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.j(outState, "outState");
        super.onSaveInstanceState(outState);
        MccEnrollmentForm mccEnrollmentForm = this.enrollmentForm;
        if (mccEnrollmentForm == null) {
            Intrinsics.x("enrollmentForm");
            mccEnrollmentForm = null;
        }
        outState.putParcelable("enrollmentFormKey", mccEnrollmentForm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1(String phoneNumber) {
        try {
            startActivity(getMeijerIntent().N(phoneNumber));
        } catch (ActivityNotFoundException unused) {
            new C15485b(this, p.f5102a).setCancelable(false).setMessage(Gh.h.f12911j1).setPositiveButton(getString(Gh.h.f13017y2), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.meijer.activity.rewards.a
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
        getAnalyticsEngine().h(C14756c.a("event: mperks: rewards: mcard: apply today"), C14756c.c("mperks: rewards: mcard"), C14756c.g("mperks"));
        Dl.e meijerIntent = getMeijerIntent();
        String string = getString(n.f3141g);
        Intrinsics.i(string, "getString(...)");
        meijerIntent.e0(this, string);
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
            java.lang.Class<yn.f> r1 = yn.MccEnrollmentForm.class
            java.lang.Object r8 = com.google.android.libraries.places.internal.a.a(r8, r3, r1)
            android.os.Parcelable r8 = (android.os.Parcelable) r8
            goto L22
        L17:
            android.os.Parcelable r8 = r8.getParcelable(r3)
            boolean r1 = r8 instanceof yn.MccEnrollmentForm
            if (r1 != 0) goto L20
            r8 = r0
        L20:
            yn.f r8 = (yn.MccEnrollmentForm) r8
        L22:
            yn.f r8 = (yn.MccEnrollmentForm) r8
            if (r8 != 0) goto L31
        L26:
            yn.f r1 = new yn.f
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
            e.C13737e.b(r7, r0, r8, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.rewards.AvailableMccDetailsActivity.onCreate(android.os.Bundle):void");
    }
}
