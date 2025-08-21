package com.meijer.mobile.meijer.activity.rewards;

import Bl.p;
import Cj.o;
import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import e.C13737e;
import g.AbstractC14276c;
import g.C14274a;
import g.InterfaceC14275b;
import hi.InterfaceC14523a;
import ii.C14756c;
import j0.InterfaceC14882C;
import kotlin.C17987a1;
import kotlin.Function;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import mv.InterfaceC15783O;
import ok.MccProgram;
import p1.C16338g;
import pv.C16563h;
import pv.InterfaceC16553F;
import vn.C17695B;
import vn.C17697D;
import yn.e;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060²\u0006\f\u0010/\u001a\u00020.8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/rewards/InProgressMccDetailActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lg/a;", "result", "", "t1", "(Lg/a;)V", "p1", "u1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LDl/e;", "v", "LDl/e;", "q1", "()LDl/e;", "setDeeplinkParser", "(LDl/e;)V", "deeplinkParser", "Lhi/a;", "w", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "Lyn/e;", "x", "Lkotlin/Lazy;", "s1", "()Lyn/e;", "viewModel", "Lg/c;", "Landroid/content/Intent;", "y", "Lg/c;", "mccOptOutResultLauncher", "Lok/b;", "r1", "()Lok/b;", "mccProgram", "Lyn/e$c;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InProgressMccDetailActivity extends Hilt_InProgressMccDetailActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Dl.e deeplinkParser;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(yn.e.class), new d(this), new c(this), new e(null, this));

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final AbstractC14276c<Intent> mccOptOutResultLauncher = registerForActivityResult(new h.i(), new a());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a implements InterfaceC14275b, FunctionAdapter {
        a() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC14275b) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, InProgressMccDetailActivity.this, InProgressMccDetailActivity.class, "handleMccOptOutResult", "handleMccOptOutResult(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // g.InterfaceC14275b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void a(C14274a p02) {
            Intrinsics.j(p02, "p0");
            InProgressMccDetailActivity.this.t1(p02);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InProgressMccDetailActivity f112486a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$b$a$a, reason: collision with other inner class name */
            static final class C1735a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112487a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InProgressMccDetailActivity f112488b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1736a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f112489a;

                    C1736a(LocalThemeScope localThemeScope) {
                        this.f112489a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-66555276, i10, -1, "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InProgressMccDetailActivity.kt:91)");
                        }
                        Dr.g.g(this.f112489a, C16338g.c(Y.f101098o8, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
                        ComposerKt.U(469069620, i10, -1, "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (InProgressMccDetailActivity.kt:90)");
                    }
                    LocalThemeScope localThemeScope = this.f112487a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-66555276, true, new C1736a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f112488b);
                    final InProgressMccDetailActivity inProgressMccDetailActivity = this.f112488b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.rewards.e
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InProgressMccDetailActivity.b.a.C1735a.c(inProgressMccDetailActivity);
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

                C1735a(LocalThemeScope localThemeScope, InProgressMccDetailActivity inProgressMccDetailActivity) {
                    this.f112487a = localThemeScope;
                    this.f112488b = inProgressMccDetailActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InProgressMccDetailActivity inProgressMccDetailActivity) {
                    if (!inProgressMccDetailActivity.onNavigateUp()) {
                        inProgressMccDetailActivity.finish();
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$b$a$b, reason: collision with other inner class name */
            static final class C1737b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112490a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ z1<e.ViewState> f112491b;

                C1737b(LocalThemeScope localThemeScope, z1<e.ViewState> z1Var) {
                    this.f112490a = localThemeScope;
                    this.f112491b = z1Var;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1127452499, i10, -1, "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (InProgressMccDetailActivity.kt:98)");
                    }
                    C17695B.b(this.f112490a, null, a.c(this.f112491b), composer, LocalThemeScope.f17314g, 1);
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
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f112492a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InProgressMccDetailActivity f112493b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<e.ViewState> f112494c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$b$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1738a extends FunctionReferenceImpl implements Function1<e.a, Unit> {
                    C1738a(Object obj) {
                        super(1, obj, yn.e.class, "onAction", "onAction(Lcom/meijer/mobile/meijer/activity/rewards/viewmodel/meijercreditcard/InProgressMccDetailViewModel$Action;)V", 0);
                    }

                    public final void a(e.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((yn.e) this.receiver).q(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(e.a aVar) {
                        a(aVar);
                        return Unit.f143329a;
                    }
                }

                c(LocalThemeScope localThemeScope, InProgressMccDetailActivity inProgressMccDetailActivity, z1<e.ViewState> z1Var) {
                    this.f112492a = localThemeScope;
                    this.f112493b = inProgressMccDetailActivity;
                    this.f112494c = z1Var;
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
                        ComposerKt.U(-87885221, i10, -1, "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (InProgressMccDetailActivity.kt:101)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH = D.h(companion, contentPadding);
                    LocalThemeScope localThemeScope = this.f112492a;
                    InProgressMccDetailActivity inProgressMccDetailActivity = this.f112493b;
                    z1<e.ViewState> z1Var = this.f112494c;
                    MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                    int iA = C5859f.a(composer, 0);
                    InterfaceC5884s interfaceC5884sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
                    InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                    Function0<InterfaceC5953g> function0A = companion2.a();
                    if (composer.k() == null) {
                        C5859f.c();
                    }
                    composer.F();
                    if (composer.h()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = D1.a(composer);
                    D1.c(composerA, measurePolicyG, companion2.e());
                    D1.c(composerA, interfaceC5884sR, companion2.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                    if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    C5806j c5806j = C5806j.f48836a;
                    C5804h.a(androidx.compose.foundation.b.d(J.i(J.h(companion, 0.0f, 1, null), H1.h.p(HttpResponseStatus.SUCCESS_OK)), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), null, 2, null), composer, 0);
                    e.ViewState viewStateC = a.c(z1Var);
                    yn.e eVarS1 = inProgressMccDetailActivity.s1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(eVarS1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1738a(eVarS1);
                        composer.t(objB);
                    }
                    composer.P();
                    C17697D.b(localThemeScope, null, viewStateC, (Function1) ((KFunction) objB), composer, LocalThemeScope.f17314g, 1);
                    composer.v();
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

            a(InProgressMccDetailActivity inProgressMccDetailActivity) {
                this.f112486a = inProgressMccDetailActivity;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(1375195993, i11, -1, "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity.onCreate.<anonymous>.<anonymous> (InProgressMccDetailActivity.kt:82)");
                }
                z1 z1VarB = o1.b(this.f112486a.s1().o(), null, composer, 0, 1);
                C17987a1.a(androidx.compose.foundation.b.d(FullStoryAnnotationsKt.fsUnmask(J.f(Modifier.INSTANCE, 0.0f, 1, null)), AdsTheme.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null), null, ComposableLambdaKt.c(469069620, true, new C1735a(AdsTheme, this.f112486a), composer, 54), ComposableLambdaKt.c(1127452499, true, new C1737b(AdsTheme, z1VarB), composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-87885221, true, new c(AdsTheme, this.f112486a, z1VarB), composer, 54), composer, 3456, 12582912, 131058);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final e.ViewState c(z1<e.ViewState> z1Var) {
                return z1Var.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$onCreate$1$2$1", f = "InProgressMccDetailActivity.kt", l = {119}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$b$b, reason: collision with other inner class name */
        static final class C1739b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f112495a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InProgressMccDetailActivity f112496b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1739b(InProgressMccDetailActivity inProgressMccDetailActivity, Continuation<? super C1739b> continuation) {
                super(2, continuation);
                this.f112496b = inProgressMccDetailActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1739b(this.f112496b, continuation);
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyn/e$b;", "effect", "", "<anonymous>", "(Lyn/e$b;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$onCreate$1$2$1$1", f = "InProgressMccDetailActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity$b$b$a */
            static final class a extends SuspendLambda implements Function2<e.b, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f112497a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f112498b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InProgressMccDetailActivity f112499c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(InProgressMccDetailActivity inProgressMccDetailActivity, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f112499c = inProgressMccDetailActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f112499c, continuation);
                    aVar.f112498b = obj;
                    return aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(e.b bVar, Continuation<? super Unit> continuation) {
                    return ((a) create(bVar, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f112497a == 0) {
                        ResultKt.b(obj);
                        e.b bVar = (e.b) this.f112498b;
                        if (Intrinsics.e(bVar, e.b.a.f171536a)) {
                            this.f112499c.p1();
                        } else if (Intrinsics.e(bVar, e.b.C2764b.f171537a)) {
                            this.f112499c.u1();
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
                return ((C1739b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f112495a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<e.b> interfaceC16553FN = this.f112496b.s1().n();
                    a aVar = new a(this.f112496b, null);
                    this.f112495a = 1;
                    if (C16563h.k(interfaceC16553FN, aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        b() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1413011720, i10, -1, "com.meijer.mobile.meijer.activity.rewards.InProgressMccDetailActivity.onCreate.<anonymous> (InProgressMccDetailActivity.kt:81)");
            }
            K.b(null, ComposableLambdaKt.c(1375195993, true, new a(InProgressMccDetailActivity.this), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(InProgressMccDetailActivity.this);
            InProgressMccDetailActivity inProgressMccDetailActivity = InProgressMccDetailActivity.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new C1739b(inProgressMccDetailActivity, null);
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.J.g("InProgressMccDetailActivity", (Function2) objB, composer, 6);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112500f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f112500f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f112500f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112501f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f112501f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f112501f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f112502f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f112503g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f112502f = function0;
            this.f112503g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f112502f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f112503g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final InterfaceC14523a getAnalyticsEngine() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final Dl.e q1() {
        Dl.e eVar = this.deeplinkParser;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("deeplinkParser");
        return null;
    }

    public final yn.e s1() {
        return (yn.e) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p1() {
        q1().v(this);
    }

    private final MccProgram r1() {
        Parcelable parcelable;
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.EXTRA_MCC_PROGRAM", MccProgram.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.EXTRA_MCC_PROGRAM");
            if (!(parcelableExtra instanceof MccProgram)) {
                parcelableExtra = null;
            }
            parcelable = (MccProgram) parcelableExtra;
        }
        MccProgram mccProgram = (MccProgram) parcelable;
        if (mccProgram == null) {
            return new MccProgram(null, 0.0f, 0.0f, 7, null);
        }
        return mccProgram;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1(C14274a result) {
        if (result.getResultCode() == 3301) {
            setResult(3301);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1() {
        getAnalyticsEngine().h(C14756c.a("event: mperks: rewards: mcard: DR opt out"), C14756c.c("mperks: rewards: mcard"), C14756c.g("mperks"));
        this.mccOptOutResultLauncher.a(p.f3148a.b(this));
    }

    @Override // com.meijer.mobile.meijer.activity.rewards.Hilt_InProgressMccDetailActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        s1().p(r1());
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1413011720, true, new b()), 1, null);
    }
}
