package com.meijer.mobile.rateandtip.ux;

import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import Ki.Q;
import V0.C5489q0;
import V2.CreationExtras;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
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
import androidx.view.C6173t;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import bk.AbstractC6392a;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.rateandtip.ux.RateAndTipActivity;
import com.meijer.mobile.rateandtip.ux.y;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dk.C13698b;
import e.C13736d;
import e.C13737e;
import j0.InterfaceC14882C;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.AbstractC14656B;
import kotlin.C14667h;
import kotlin.C14675p;
import kotlin.C14678s;
import kotlin.C14680u;
import kotlin.C14683x;
import kotlin.C17983Z;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16553F;
import pv.InterfaceC16561f;
import tp.Builder;
import tp.C17278c;
import tp.EnumC17276a;
import xp.C18205b;
import xp.g;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006'²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002²\u0006\u000e\u0010&\u001a\u0004\u0018\u00010%8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/RateAndTipActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lcom/meijer/mobile/rateandtip/ux/y$c;", "event", "LKi/M;", "localThemeScope", "", "v1", "(Lcom/meijer/mobile/rateandtip/ux/y$c;LKi/M;)V", "Lxp/g;", "currentScreen", "w1", "(Lxp/g;)V", "x1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lcom/meijer/mobile/rateandtip/ux/y;", "v", "Lkotlin/Lazy;", "u1", "()Lcom/meijer/mobile/rateandtip/ux/y;", "viewModel", "Ltp/c;", "w", "Ltp/c;", "t1", "()Ltp/c;", "setRateAndTipUpdater", "(Ltp/c;)V", "rateAndTipUpdater", "Lcom/meijer/mobile/rateandtip/ux/y$d;", "viewState", "Li4/h;", "currentBackStack", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class RateAndTipActivity extends Hilt_RateAndTipActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(y.class), new d(this), new c(this), new e(null, this));

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public C17278c rateAndTipUpdater;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.rateandtip.ux.RateAndTipActivity$handleEvent$1", f = "RateAndTipActivity.kt", l = {221, 221}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f115988a;

        /* renamed from: b, reason: collision with root package name */
        Object f115989b;

        /* renamed from: c, reason: collision with root package name */
        int f115990c;

        /* renamed from: d, reason: collision with root package name */
        int f115991d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f115992e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ y.c f115993f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f115992e, this.f115993f, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LocalThemeScope localThemeScope, y.c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f115992e = localThemeScope;
            this.f115993f = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        
            if (Hi.i.i(r3, r5, null, null, true, r6, null, null, null, r14, 230, null) == r12) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r0 = r14.f115991d
                r1 = 0
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L30
                if (r0 == r3) goto L1f
                if (r0 != r2) goto L17
                java.lang.Object r0 = r14.f115988a
                Ki.M r0 = (Ki.LocalThemeScope) r0
                kotlin.ResultKt.b(r15)
                goto L76
            L17:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1f:
                int r0 = r14.f115990c
                java.lang.Object r3 = r14.f115989b
                Ki.M r3 = (Ki.LocalThemeScope) r3
                java.lang.Object r4 = r14.f115988a
                com.meijer.mobile.rateandtip.ux.y$c r4 = (com.meijer.mobile.rateandtip.ux.y.c) r4
                kotlin.ResultKt.b(r15)
                r5 = r4
                r4 = r3
                r3 = r15
                goto L4c
            L30:
                kotlin.ResultKt.b(r15)
                Ki.M r0 = r14.f115992e
                com.meijer.mobile.rateandtip.ux.y$c r4 = r14.f115993f
                r14.f115988a = r4
                r14.f115989b = r0
                r5 = 0
                r14.f115990c = r5
                r14.f115991d = r3
                r6 = 0
                java.lang.Object r3 = Ki.LocalThemeScope.g(r0, r6, r14, r3, r1)
                if (r3 != r12) goto L48
                goto L75
            L48:
                r13 = r4
                r4 = r0
                r0 = r5
                r5 = r13
            L4c:
                Hi.i r3 = (Hi.i) r3
                com.meijer.mobile.rateandtip.ux.y$c$b r5 = (com.meijer.mobile.rateandtip.ux.y.c.ShowErrorToast) r5
                java.lang.String r5 = r5.getErrorMessage()
                if (r5 != 0) goto L58
                java.lang.String r5 = ""
            L58:
                ki.q1$m$a$b r6 = ki.q1.m.a.b.f142368a
                r14.f115988a = r4
                r14.f115989b = r1
                r14.f115990c = r0
                r14.f115991d = r2
                r2 = 0
                r0 = r3
                r3 = 0
                r4 = 1
                r1 = r5
                r5 = r6
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 230(0xe6, float:3.22E-43)
                r11 = 0
                r9 = r14
                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r0 != r12) goto L76
            L75:
                return r12
            L76:
                kotlin.Unit r0 = kotlin.Unit.f143329a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.rateandtip.ux.RateAndTipActivity.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RateAndTipActivity f115995a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C14680u f115996b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<y.ViewState> f115997c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.rateandtip.ux.RateAndTipActivity$b$a$a, reason: collision with other inner class name */
            static final class C1830a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f115998a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C14680u f115999b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ RateAndTipActivity f116000c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<y.ViewState> f116001d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.rateandtip.ux.RateAndTipActivity$b$a$a$a, reason: collision with other inner class name */
                static final class C1831a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f116002a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ z1<y.ViewState> f116003b;

                    C1831a(LocalThemeScope localThemeScope, z1<y.ViewState> z1Var) {
                        this.f116002a = localThemeScope;
                        this.f116003b = z1Var;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-57225006, i10, -1, "com.meijer.mobile.rateandtip.ux.RateAndTipActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RateAndTipActivity.kt:119)");
                        }
                        LocalThemeScope localThemeScope = this.f116002a;
                        si.j.h(localThemeScope, new q1.Label(null, this.f116002a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), C13698b.a(b.d(this.f116003b).getScreenTitle(), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
                        ComposerKt.U(601517458, i10, -1, "com.meijer.mobile.rateandtip.ux.RateAndTipActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (RateAndTipActivity.kt:116)");
                    }
                    AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Aj.e.f1348a, new Object[0]);
                    C.f.d dVar = C.f.d.f17051e;
                    LocalThemeScope localThemeScope = this.f115998a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(-57225006, true, new C1831a(localThemeScope, this.f116001d), composer, 54);
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f115999b) | composer.D(this.f116000c);
                    final C14680u c14680u = this.f115999b;
                    final RateAndTipActivity rateAndTipActivity = this.f116000c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.rateandtip.ux.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RateAndTipActivity.b.a.C1830a.c(c14680u, rateAndTipActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, dVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1830a(LocalThemeScope localThemeScope, C14680u c14680u, RateAndTipActivity rateAndTipActivity, z1<y.ViewState> z1Var) {
                    this.f115998a = localThemeScope;
                    this.f115999b = c14680u;
                    this.f116000c = rateAndTipActivity;
                    this.f116001d = z1Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(C14680u c14680u, RateAndTipActivity rateAndTipActivity) {
                    if (!c14680u.V() && !rateAndTipActivity.onNavigateUp()) {
                        rateAndTipActivity.u1().R(y.a.d.f116109a);
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.rateandtip.ux.RateAndTipActivity$b$a$b, reason: collision with other inner class name */
            static final class C1832b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f116004a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ RateAndTipActivity f116005b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<y.ViewState> f116006c;

                C1832b(LocalThemeScope localThemeScope, RateAndTipActivity rateAndTipActivity, z1<y.ViewState> z1Var) {
                    this.f116004a = localThemeScope;
                    this.f116005b = rateAndTipActivity;
                    this.f116006c = z1Var;
                }

                public final void c(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1502585393, i10, -1, "com.meijer.mobile.rateandtip.ux.RateAndTipActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (RateAndTipActivity.kt:136)");
                    }
                    C17983Z.a(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f116004a.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
                    LocalThemeScope localThemeScope = this.f116004a;
                    AbstractC6392a primaryButtonText = b.d(this.f116006c).getPrimaryButtonText();
                    int i11 = AbstractC6392a.f60445b;
                    String strA = C13698b.a(primaryButtonText, composer, i11);
                    String strA2 = C13698b.a(b.d(this.f116006c).getSecondaryButtonText(), composer, i11);
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f116005b) | composer.V(this.f116006c);
                    final RateAndTipActivity rateAndTipActivity = this.f116005b;
                    final z1<y.ViewState> z1Var = this.f116006c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.rateandtip.ux.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RateAndTipActivity.b.a.C1832b.d(rateAndTipActivity, z1Var);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(-1633490746);
                    boolean zD2 = composer.D(this.f116005b) | composer.V(this.f116006c);
                    final RateAndTipActivity rateAndTipActivity2 = this.f116005b;
                    final z1<y.ViewState> z1Var2 = this.f116006c;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.rateandtip.ux.e
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RateAndTipActivity.b.a.C1832b.e(rateAndTipActivity2, z1Var2);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    i.b(localThemeScope, null, strA, strA2, function0, (Function0) objB2, b.d(this.f116006c).getPrimaryButtonEnabled(), b.d(this.f116006c).getIsLoading(), composer, LocalThemeScope.f17314g, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    c(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit d(RateAndTipActivity rateAndTipActivity, z1 z1Var) {
                    rateAndTipActivity.w1(b.d(z1Var).getCurrentScreen());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(RateAndTipActivity rateAndTipActivity, z1 z1Var) {
                    rateAndTipActivity.x1(b.d(z1Var).getCurrentScreen());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C14680u f116007a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f116008b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ RateAndTipActivity f116009c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<y.ViewState> f116010d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.rateandtip.ux.RateAndTipActivity$b$a$c$a, reason: collision with other inner class name */
                /* synthetic */ class C1833a extends FunctionReferenceImpl implements Function1<y.a, Unit> {
                    C1833a(Object obj) {
                        super(1, obj, y.class, "onAction", "onAction(Lcom/meijer/mobile/rateandtip/ux/RateAndTipViewModel$Action;)V", 0);
                    }

                    public final void a(y.a p02) {
                        Intrinsics.j(p02, "p0");
                        ((y) this.receiver).R(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(y.a aVar) {
                        a(aVar);
                        return Unit.f143329a;
                    }
                }

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.rateandtip.ux.RateAndTipActivity$b$a$c$b, reason: collision with other inner class name */
                static final class C1834b implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f116011a;

                    C1834b(LocalThemeScope localThemeScope) {
                        this.f116011a = localThemeScope;
                    }

                    public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(514578153, i10, -1, "com.meijer.mobile.rateandtip.ux.RateAndTipActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RateAndTipActivity.kt:170)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Ci.o oVar = Ci.o.f4629a;
                        Ci.m.d(this.f116011a, J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoading, oVar, null, null, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.Large.f142345f << 6), 56);
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

                c(C14680u c14680u, LocalThemeScope localThemeScope, RateAndTipActivity rateAndTipActivity, z1<y.ViewState> z1Var) {
                    this.f116007a = c14680u;
                    this.f116008b = localThemeScope;
                    this.f116009c = rateAndTipActivity;
                    this.f116010d = z1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(LocalThemeScope localThemeScope, RateAndTipActivity rateAndTipActivity, C14678s NavHost) {
                    Intrinsics.j(NavHost, "$this$NavHost");
                    C18205b.a(NavHost, localThemeScope, rateAndTipActivity.u1(), new C1833a(rateAndTipActivity.u1()));
                    return Unit.f143329a;
                }

                public final void b(InterfaceC14882C contentPadding, Composer composer, int i10) {
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
                        ComposerKt.U(-1275041479, i11, -1, "com.meijer.mobile.rateandtip.ux.RateAndTipActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (RateAndTipActivity.kt:150)");
                    }
                    C14680u c14680u = this.f116007a;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierH = androidx.compose.foundation.layout.D.h(companion, contentPadding);
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(this.f116008b) | composer.D(this.f116009c);
                    final LocalThemeScope localThemeScope = this.f116008b;
                    final RateAndTipActivity rateAndTipActivity = this.f116009c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.rateandtip.ux.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return RateAndTipActivity.b.a.c.c(localThemeScope, rateAndTipActivity, (C14678s) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    j4.k.b(c14680u, "RateAndTipRoute", modifierH, null, null, null, null, null, null, (Function1) objB, composer, 48, HttpResponseStatus.ERROR_GATEWAY_TIMEOUT);
                    if (b.d(this.f116010d).getIsLoading()) {
                        Modifier modifierD = androidx.compose.foundation.b.d(FullStoryAnnotationsKt.fsUnmask(J.f(companion, 0.0f, 1, null)), C5489q0.q(this.f116008b.getAdsColors().getAdsColorUIBackground01().getColor(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        LocalThemeScope localThemeScope2 = this.f116008b;
                        MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
                        int iA = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
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
                        Q.e(localThemeScope2, Q0.b.f141966a, ComposableLambdaKt.c(514578153, true, new C1834b(localThemeScope2), composer, 54), composer, LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
                        composer.v();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    b(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.rateandtip.ux.RateAndTipActivity$onCreate$1$1$4$1", f = "RateAndTipActivity.kt", l = {182}, m = "invokeSuspend")
            static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f116012a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ RateAndTipActivity f116013b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f116014c;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/rateandtip/ux/y$c;", "it", "", "<anonymous>", "(Lcom/meijer/mobile/rateandtip/ux/y$c;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.rateandtip.ux.RateAndTipActivity$onCreate$1$1$4$1$1", f = "RateAndTipActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.rateandtip.ux.RateAndTipActivity$b$a$d$a, reason: collision with other inner class name */
                static final class C1835a extends SuspendLambda implements Function2<y.c, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f116015a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f116016b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ RateAndTipActivity f116017c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f116018d;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1835a c1835a = new C1835a(this.f116017c, this.f116018d, continuation);
                        c1835a.f116016b = obj;
                        return c1835a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(y.c cVar, Continuation<? super Unit> continuation) {
                        return ((C1835a) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1835a(RateAndTipActivity rateAndTipActivity, LocalThemeScope localThemeScope, Continuation<? super C1835a> continuation) {
                        super(2, continuation);
                        this.f116017c = rateAndTipActivity;
                        this.f116018d = localThemeScope;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f116015a == 0) {
                            ResultKt.b(obj);
                            this.f116017c.v1((y.c) this.f116016b, this.f116018d);
                            return Unit.f143329a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f116013b, this.f116014c, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(RateAndTipActivity rateAndTipActivity, LocalThemeScope localThemeScope, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f116013b = rateAndTipActivity;
                    this.f116014c = localThemeScope;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f116012a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16561f interfaceC16561fO = C16563h.O(this.f116013b.u1().getEvents(), new C1835a(this.f116013b, this.f116014c, null));
                        this.f116012a = 1;
                        if (C16563h.j(interfaceC16561fO, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            a(RateAndTipActivity rateAndTipActivity, C14680u c14680u, z1<y.ViewState> z1Var) {
                this.f115995a = rateAndTipActivity;
                this.f115996b = c14680u;
                this.f115997c = z1Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:36:0x00f7  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
            /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(Ki.LocalThemeScope r32, androidx.compose.runtime.Composer r33, int r34) {
                /*
                    Method dump skipped, instructions count: 285
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.rateandtip.ux.RateAndTipActivity.b.a.a(Ki.M, androidx.compose.runtime.Composer, int):void");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.rateandtip.ux.RateAndTipActivity$onCreate$1$2$1", f = "RateAndTipActivity.kt", l = {187}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.rateandtip.ux.RateAndTipActivity$b$b, reason: collision with other inner class name */
        static final class C1836b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f116019a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ RateAndTipActivity f116020b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C14680u f116021c;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxp/g;", "screen", "", "<anonymous>", "(Lxp/g;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.rateandtip.ux.RateAndTipActivity$onCreate$1$2$1$1", f = "RateAndTipActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.rateandtip.ux.RateAndTipActivity$b$b$a */
            static final class a extends SuspendLambda implements Function2<xp.g, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f116022a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f116023b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C14680u f116024c;

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(xp.g gVar, C14683x c14683x) {
                    c14683x.f(true);
                    C14683x.e(c14683x, gVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), null, 2, null);
                    return Unit.f143329a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    a aVar = new a(this.f116024c, continuation);
                    aVar.f116023b = obj;
                    return aVar;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(C14680u c14680u, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f116024c = c14680u;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(xp.g gVar, Continuation<? super Unit> continuation) {
                    return ((a) create(gVar, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                    IntrinsicsKt.f();
                    if (this.f116022a == 0) {
                        ResultKt.b(obj);
                        final xp.g gVar = (xp.g) this.f116023b;
                        this.f116024c.S(gVar.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String(), new Function1() { // from class: com.meijer.mobile.rateandtip.ux.g
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return RateAndTipActivity.b.C1836b.a.k(gVar, (C14683x) obj2);
                            }
                        });
                        return Unit.f143329a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1836b(this.f116020b, this.f116021c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1836b(RateAndTipActivity rateAndTipActivity, C14680u c14680u, Continuation<? super C1836b> continuation) {
                super(2, continuation);
                this.f116020b = rateAndTipActivity;
                this.f116021c = c14680u;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1836b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f116019a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<xp.g> interfaceC16553FK = this.f116020b.u1().K();
                    a aVar = new a(this.f116021c, null);
                    this.f116019a = 1;
                    if (C16563h.k(interfaceC16553FK, aVar, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        b() {
        }

        public final void c(Composer composer, int i10) {
            C14675p destination;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1111417498, i10, -1, "com.meijer.mobile.rateandtip.ux.RateAndTipActivity.onCreate.<anonymous> (RateAndTipActivity.kt:105)");
            }
            z1 z1VarB = o1.b(RateAndTipActivity.this.u1().L(), null, composer, 0, 1);
            final C14680u c14680uE = j4.j.e(new AbstractC14656B[0], composer, 0);
            z1<C14667h> z1VarD = j4.j.d(c14680uE, composer, 0);
            y yVarU1 = RateAndTipActivity.this.u1();
            C14667h c14667hE = e(z1VarD);
            yVarU1.d0((c14667hE == null || (destination = c14667hE.getDestination()) == null) ? null : destination.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String());
            K.b(null, ComposableLambdaKt.c(1706822455, true, new a(RateAndTipActivity.this, c14680uE, z1VarB), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(RateAndTipActivity.this) | composer.D(c14680uE);
            RateAndTipActivity rateAndTipActivity = RateAndTipActivity.this;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new C1836b(rateAndTipActivity, c14680uE, null);
                composer.t(objB);
            }
            composer.P();
            androidx.compose.runtime.J.g("RateAndTipScreenFlow", (Function2) objB, composer, 6);
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(c14680uE) | composer.D(RateAndTipActivity.this);
            final RateAndTipActivity rateAndTipActivity2 = RateAndTipActivity.this;
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.rateandtip.ux.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RateAndTipActivity.b.f(c14680uE, rateAndTipActivity2);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            C13736d.a(true, (Function0) objB2, composer, 6, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y.ViewState d(z1<y.ViewState> z1Var) {
            return z1Var.getValue();
        }

        private static final C14667h e(z1<C14667h> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(C14680u c14680u, RateAndTipActivity rateAndTipActivity) {
            if (!c14680u.V()) {
                rateAndTipActivity.u1().R(y.a.d.f116109a);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f116025f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f116025f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f116025f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f116026f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f116026f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f116026f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f116027f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f116028g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f116027f = function0;
            this.f116028g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f116027f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f116028g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(y.c event, LocalThemeScope localThemeScope) {
        if (event instanceof y.c.FinishActivity) {
            y.c.FinishActivity finishActivity = (y.c.FinishActivity) event;
            t1().b(finishActivity.getRateAndTipBuilder(), finishActivity.getFlowType());
            finish();
        } else {
            if (!(event instanceof y.c.ShowErrorToast)) {
                throw new NoWhenBranchMatchedException();
            }
            C15809k.d(C6173t.a(this), null, null, new a(localThemeScope, event, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w1(xp.g currentScreen) {
        if (Intrinsics.e(currentScreen, g.a.f170931b)) {
            u1().R(y.a.g.f116112a);
        } else if (Intrinsics.e(currentScreen, g.c.f170933b)) {
            u1().R(y.a.j.f116115a);
        } else {
            if (!Intrinsics.e(currentScreen, g.b.f170932b)) {
                throw new NoWhenBranchMatchedException();
            }
            u1().R(y.a.h.f116113a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(xp.g currentScreen) {
        if (Intrinsics.e(currentScreen, g.a.f170931b)) {
            u1().R(y.a.e.f116110a);
        } else if (Intrinsics.e(currentScreen, g.c.f170933b)) {
            u1().R(y.a.i.f116114a);
        } else {
            if (!Intrinsics.e(currentScreen, g.b.f170932b)) {
                throw new NoWhenBranchMatchedException();
            }
            u1().R(y.a.d.f116109a);
        }
    }

    @Override // com.meijer.mobile.rateandtip.ux.Hilt_RateAndTipActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Parcelable parcelable;
        Object serializableExtra;
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.rateandtip.ux.rate_and_tip_builder", Builder.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.rateandtip.ux.rate_and_tip_builder");
            if (!(parcelableExtra instanceof Builder)) {
                parcelableExtra = null;
            }
            parcelable = (Builder) parcelableExtra;
        }
        Builder builder = (Builder) parcelable;
        if (builder == null) {
            builder = new Builder(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }
        Intent intent2 = getIntent();
        Intrinsics.i(intent2, "getIntent(...)");
        if (i10 >= 33) {
            serializableExtra = intent2.getSerializableExtra("com.meijer.mobile.rateandtip.ux.flow_type", EnumC17276a.class);
        } else {
            Object serializableExtra2 = intent2.getSerializableExtra("com.meijer.mobile.rateandtip.ux.flow_type");
            if (!(serializableExtra2 instanceof EnumC17276a)) {
                serializableExtra2 = null;
            }
            serializableExtra = (EnumC17276a) serializableExtra2;
        }
        EnumC17276a enumC17276a = (EnumC17276a) serializableExtra;
        if (enumC17276a == null) {
            enumC17276a = EnumC17276a.f163239c;
        }
        u1().O(builder, enumC17276a);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1111417498, true, new b()), 1, null);
    }

    public final C17278c t1() {
        C17278c c17278c = this.rateAndTipUpdater;
        if (c17278c != null) {
            return c17278c;
        }
        Intrinsics.x("rateAndTipUpdater");
        return null;
    }

    public final y u1() {
        return (y) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        FS.page("Tips Ratings").start();
    }
}
