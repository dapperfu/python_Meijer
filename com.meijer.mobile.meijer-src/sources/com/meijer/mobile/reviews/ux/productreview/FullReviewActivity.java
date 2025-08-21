package com.meijer.mobile.reviews.ux.productreview;

import Gp.ReviewItem;
import Ki.C;
import Ki.LocalThemeScope;
import V2.CreationExtras;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.google.android.gms.common.api.a;
import com.meijer.mobile.reviews.ux.productreview.C12839c0;
import com.meijer.mobile.reviews.ux.productreview.FullReviewActivity;
import e.C13737e;
import j0.InterfaceC14882C;
import kotlin.C17987a1;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16338g;
import pv.C16563h;
import pv.InterfaceC16561f;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/FullReviewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lzl/k;", "v", "Lzl/k;", "getFeatureManager", "()Lzl/k;", "setFeatureManager", "(Lzl/k;)V", "featureManager", "Lcom/meijer/mobile/reviews/ux/productreview/c0;", "w", "Lkotlin/Lazy;", "t1", "()Lcom/meijer/mobile/reviews/ux/productreview/c0;", "vm", "LGp/e;", "s1", "()LGp/e;", "review", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FullReviewActivity extends Hilt_FullReviewActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy vm = new androidx.view.e0(Reflection.b(C12839c0.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.reviews.ux.productreview.FullReviewActivity$a$a, reason: collision with other inner class name */
        static final class C1850a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ FullReviewActivity f116381a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.reviews.ux.productreview.FullReviewActivity$a$a$a, reason: collision with other inner class name */
            static final class C1851a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f116382a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ FullReviewActivity f116383b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.reviews.ux.productreview.FullReviewActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1852a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f116384a;

                    C1852a(LocalThemeScope localThemeScope) {
                        this.f116384a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(772819702, i10, -1, "com.meijer.mobile.reviews.ux.productreview.FullReviewActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FullReviewActivity.kt:69)");
                        }
                        Dr.g.g(this.f116384a, C16338g.c(Lp.c.f19408s0, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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
                        ComposerKt.U(-185649610, i10, -1, "com.meijer.mobile.reviews.ux.productreview.FullReviewActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FullReviewActivity.kt:66)");
                    }
                    Modifier modifierH = androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null);
                    C.f.o oVar = C.f.o.f17066e;
                    AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(Cj.o.f5088t, new Object[0]);
                    LocalThemeScope localThemeScope = this.f116382a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(772819702, true, new C1852a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f116383b);
                    final FullReviewActivity fullReviewActivity = this.f116383b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.V
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FullReviewActivity.a.C1850a.C1851a.c(fullReviewActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, modifierH, null, null, composableLambdaC, (Function0) objB, oVar, 0.0f, false, abstractC6392aD, composer, LocalThemeScope.f17314g | 24624 | (C.f.o.f17067f << 18) | (AbstractC6392a.f60445b << 27), 198);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1851a(LocalThemeScope localThemeScope, FullReviewActivity fullReviewActivity) {
                    this.f116382a = localThemeScope;
                    this.f116383b = fullReviewActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(FullReviewActivity fullReviewActivity) {
                    fullReviewActivity.finish();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.reviews.ux.productreview.FullReviewActivity$a$a$b */
            static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ FullReviewActivity f116385a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f116386b;

                b(FullReviewActivity fullReviewActivity, LocalThemeScope localThemeScope) {
                    this.f116385a = fullReviewActivity;
                    this.f116386b = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit l(FullReviewActivity fullReviewActivity, int i10) {
                    Bl.o oVar = Bl.o.f3147a;
                    fullReviewActivity.startActivity(Bl.o.b(fullReviewActivity, i10, fullReviewActivity.s1().c()));
                    return Unit.f143329a;
                }

                public final void e(InterfaceC14882C paddingValues, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2108767279, i11, -1, "com.meijer.mobile.reviews.ux.productreview.FullReviewActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (FullReviewActivity.kt:74)");
                    }
                    Modifier modifierH = androidx.compose.foundation.layout.D.h(Modifier.INSTANCE, paddingValues);
                    ProductReviewDecorator productReviewDecorator = new ProductReviewDecorator(this.f116385a.s1().getTitle(), this.f116385a.s1().getReviewText(), a.e.API_PRIORITY_OTHER, this.f116385a.s1().getIsRecommended(), this.f116385a.s1().getDate(), this.f116385a.s1().getStarsRating(), this.f116385a.s1().getThumbsUpCount(), this.f116385a.s1().getThumbsDownCount(), this.f116385a.s1().c(), null, null, null, null, null, false, 32256, null);
                    boolean zE = this.f116385a.getFeatureManager().e(AbstractC18503f.C2788f.f172876h);
                    LocalThemeScope localThemeScope = this.f116386b;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f116385a);
                    final FullReviewActivity fullReviewActivity = this.f116385a;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.W
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FullReviewActivity.a.C1850a.b.f(fullReviewActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    Function0 function0 = (Function0) objB;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD2 = composer.D(this.f116385a);
                    final FullReviewActivity fullReviewActivity2 = this.f116385a;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.X
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FullReviewActivity.a.C1850a.b.g(fullReviewActivity2);
                            }
                        };
                        composer.t(objB2);
                    }
                    Function0 function02 = (Function0) objB2;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD3 = composer.D(this.f116385a);
                    final FullReviewActivity fullReviewActivity3 = this.f116385a;
                    Object objB3 = composer.B();
                    if (zD3 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: com.meijer.mobile.reviews.ux.productreview.Y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FullReviewActivity.a.C1850a.b.k(fullReviewActivity3);
                            }
                        };
                        composer.t(objB3);
                    }
                    Function0 function03 = (Function0) objB3;
                    composer.P();
                    composer.startReplaceGroup(5004770);
                    boolean zD4 = composer.D(this.f116385a);
                    final FullReviewActivity fullReviewActivity4 = this.f116385a;
                    Object objB4 = composer.B();
                    if (zD4 || objB4 == Composer.INSTANCE.a()) {
                        objB4 = new Function1() { // from class: com.meijer.mobile.reviews.ux.productreview.Z
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FullReviewActivity.a.C1850a.b.l(fullReviewActivity4, ((Integer) obj).intValue());
                            }
                        };
                        composer.t(objB4);
                    }
                    composer.P();
                    C12857l0.f(localThemeScope, modifierH, productReviewDecorator, zE, function0, function02, function03, (Function1) objB4, composer, LocalThemeScope.f17314g, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    e(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(FullReviewActivity fullReviewActivity) {
                    fullReviewActivity.t1().w(new C12839c0.a.ReportReview(fullReviewActivity.s1().getId()));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(FullReviewActivity fullReviewActivity) {
                    fullReviewActivity.t1().w(new C12839c0.a.VotePositive(fullReviewActivity.s1().getId()));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit k(FullReviewActivity fullReviewActivity) {
                    fullReviewActivity.t1().w(new C12839c0.a.VoteNegative(fullReviewActivity.s1().getId()));
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.FullReviewActivity$onCreate$1$1$3$1", f = "FullReviewActivity.kt", l = {130}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.reviews.ux.productreview.FullReviewActivity$a$a$c */
            static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f116387a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ FullReviewActivity f116388b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f116389c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f116390d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ String f116391e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ String f116392f;

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/c0$b;", "event", "", "<anonymous>", "(Lcom/meijer/mobile/reviews/ux/productreview/c0$b;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.FullReviewActivity$onCreate$1$1$3$1$1", f = "FullReviewActivity.kt", l = {}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.reviews.ux.productreview.FullReviewActivity$a$a$c$a, reason: collision with other inner class name */
                static final class C1853a extends SuspendLambda implements Function2<C12839c0.b, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f116393a;

                    /* renamed from: b, reason: collision with root package name */
                    /* synthetic */ Object f116394b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC15783O f116395c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f116396d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ String f116397e;

                    /* renamed from: f, reason: collision with root package name */
                    final /* synthetic */ String f116398f;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                    @DebugMetadata(c = "com.meijer.mobile.reviews.ux.productreview.FullReviewActivity$onCreate$1$1$3$1$1$1", f = "FullReviewActivity.kt", l = {115, 115}, m = "invokeSuspend")
                    /* renamed from: com.meijer.mobile.reviews.ux.productreview.FullReviewActivity$a$a$c$a$a, reason: collision with other inner class name */
                    static final class C1854a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f116399a;

                        /* renamed from: b, reason: collision with root package name */
                        final /* synthetic */ LocalThemeScope f116400b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ C12839c0.b f116401c;

                        /* renamed from: d, reason: collision with root package name */
                        final /* synthetic */ String f116402d;

                        /* renamed from: e, reason: collision with root package name */
                        final /* synthetic */ String f116403e;

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C1854a(this.f116400b, this.f116401c, this.f116402d, this.f116403e, continuation);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C1854a(LocalThemeScope localThemeScope, C12839c0.b bVar, String str, String str2, Continuation<? super C1854a> continuation) {
                            super(2, continuation);
                            this.f116400b = localThemeScope;
                            this.f116401c = bVar;
                            this.f116402d = str;
                            this.f116403e = str2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C1854a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
                        
                            if (Hi.i.i(r0, r2, null, null, false, r5, null, null, null, r13, 238, null) == r12) goto L19;
                         */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                            /*
                                r13 = this;
                                java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                                int r0 = r13.f116399a
                                r1 = 2
                                r2 = 1
                                if (r0 == 0) goto L1f
                                if (r0 == r2) goto L1a
                                if (r0 != r1) goto L12
                                kotlin.ResultKt.b(r14)
                                goto L58
                            L12:
                                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                                r0.<init>(r1)
                                throw r0
                            L1a:
                                kotlin.ResultKt.b(r14)
                                r0 = r14
                                goto L2f
                            L1f:
                                kotlin.ResultKt.b(r14)
                                Ki.M r0 = r13.f116400b
                                r13.f116399a = r2
                                r3 = 0
                                r4 = 0
                                java.lang.Object r0 = Ki.LocalThemeScope.g(r0, r3, r13, r2, r4)
                                if (r0 != r12) goto L2f
                                goto L57
                            L2f:
                                Hi.i r0 = (Hi.i) r0
                                com.meijer.mobile.reviews.ux.productreview.c0$b r2 = r13.f116401c
                                com.meijer.mobile.reviews.ux.productreview.c0$b$a r2 = (com.meijer.mobile.reviews.ux.productreview.C12839c0.b.FeedbackSubmissionEvent) r2
                                Kp.a r2 = r2.getFeedbackVote()
                                Kp.a r3 = Kp.a.f17595a
                                if (r2 != r3) goto L40
                                java.lang.String r2 = r13.f116402d
                                goto L42
                            L40:
                                java.lang.String r2 = r13.f116403e
                            L42:
                                ki.q1$m$a$d r5 = ki.q1.m.a.d.f142372a
                                r13.f116399a = r1
                                r1 = r2
                                r2 = 0
                                r3 = 0
                                r4 = 0
                                r6 = 0
                                r7 = 0
                                r8 = 0
                                r10 = 238(0xee, float:3.34E-43)
                                r11 = 0
                                r9 = r13
                                java.lang.Object r0 = Hi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                                if (r0 != r12) goto L58
                            L57:
                                return r12
                            L58:
                                kotlin.Unit r0 = kotlin.Unit.f143329a
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.reviews.ux.productreview.FullReviewActivity.a.C1850a.c.C1853a.C1854a.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C1853a c1853a = new C1853a(this.f116395c, this.f116396d, this.f116397e, this.f116398f, continuation);
                        c1853a.f116394b = obj;
                        return c1853a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(C12839c0.b bVar, Continuation<? super Unit> continuation) {
                        return ((C1853a) create(bVar, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1853a(InterfaceC15783O interfaceC15783O, LocalThemeScope localThemeScope, String str, String str2, Continuation<? super C1853a> continuation) {
                        super(2, continuation);
                        this.f116395c = interfaceC15783O;
                        this.f116396d = localThemeScope;
                        this.f116397e = str;
                        this.f116398f = str2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.f();
                        if (this.f116393a == 0) {
                            ResultKt.b(obj);
                            C12839c0.b bVar = (C12839c0.b) this.f116394b;
                            if (bVar instanceof C12839c0.b.FeedbackSubmissionEvent) {
                                if (((C12839c0.b.FeedbackSubmissionEvent) bVar).getIsSuccess()) {
                                    C15809k.d(this.f116395c, null, null, new C1854a(this.f116396d, bVar, this.f116397e, this.f116398f, null), 3, null);
                                }
                            } else if (!(bVar instanceof C12839c0.b.C1865b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f143329a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f116388b, this.f116389c, this.f116390d, this.f116391e, this.f116392f, continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(FullReviewActivity fullReviewActivity, InterfaceC15783O interfaceC15783O, LocalThemeScope localThemeScope, String str, String str2, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f116388b = fullReviewActivity;
                    this.f116389c = interfaceC15783O;
                    this.f116390d = localThemeScope;
                    this.f116391e = str;
                    this.f116392f = str2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f116387a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16561f interfaceC16561fO = C16563h.O(this.f116388b.t1().u(), new C1853a(this.f116389c, this.f116390d, this.f116391e, this.f116392f, null));
                        this.f116387a = 1;
                        if (C16563h.j(interfaceC16561fO, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            C1850a(FullReviewActivity fullReviewActivity) {
                this.f116381a = fullReviewActivity;
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
                    ComposerKt.U(1415122801, i11, -1, "com.meijer.mobile.reviews.ux.productreview.FullReviewActivity.onCreate.<anonymous>.<anonymous> (FullReviewActivity.kt:59)");
                }
                Object objB = composer.B();
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.a()) {
                    objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                    composer.t(objB);
                }
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB;
                String strC = C16338g.c(Lp.c.f19390j0, composer, 0);
                String strC2 = C16338g.c(Lp.c.f19420y0, composer, 0);
                C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(-185649610, true, new C1851a(AdsTheme, this.f116381a), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(2108767279, true, new b(this.f116381a, AdsTheme), composer, 54), composer, 384, 12582912, 131066);
                Boolean bool = Boolean.FALSE;
                composer.startReplaceGroup(-1224400529);
                boolean zD = composer.D(this.f116381a) | composer.D(interfaceC15783O) | ((i11 & 14) == 4 || ((i11 & 8) != 0 && composer.D(AdsTheme))) | composer.V(strC) | composer.V(strC2);
                FullReviewActivity fullReviewActivity = this.f116381a;
                Object objB2 = composer.B();
                if (zD || objB2 == companion.a()) {
                    Object cVar = new c(fullReviewActivity, interfaceC15783O, AdsTheme, strC, strC2, null);
                    composer.t(cVar);
                    objB2 = cVar;
                }
                composer.P();
                androidx.compose.runtime.J.g(bool, (Function2) objB2, composer, 6);
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

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(510794210, i10, -1, "com.meijer.mobile.reviews.ux.productreview.FullReviewActivity.onCreate.<anonymous> (FullReviewActivity.kt:58)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(1415122801, true, new C1850a(FullReviewActivity.this), composer, 54), composer, 48, 1);
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
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f116404f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f116404f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f116404f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<androidx.view.g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f116405f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f116405f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.view.g0 invoke() {
            return this.f116405f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f116406f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f116407g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f116406f = function0;
            this.f116407g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f116406f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f116407g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C12839c0 t1() {
        return (C12839c0) this.vm.getValue();
    }

    public final zl.k getFeatureManager() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReviewItem s1() {
        Object obj;
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) intent.getParcelableExtra("com.meijer.intent.extra.REVIEW", ReviewItem.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.intent.extra.REVIEW");
            if (!(parcelableExtra instanceof ReviewItem)) {
                parcelableExtra = null;
            }
            obj = (ReviewItem) parcelableExtra;
        }
        Intrinsics.g(obj);
        return (ReviewItem) obj;
    }

    @Override // com.meijer.mobile.reviews.ux.productreview.Hilt_FullReviewActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().a(t1());
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(510794210, true, new a()), 1, null);
    }
}
