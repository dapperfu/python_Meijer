package com.meijer.mobile.weeklyad;

import Ji.C;
import Ji.K;
import Ji.LocalThemeScope;
import Ji.Q;
import Js.WeeklyAdItem;
import Js.WeeklyAdPublication;
import P0.e;
import Ps.o;
import V2.CreationExtras;
import ak.AbstractC5607a;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WayfinderView;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import ck.C6408b;
import com.flipp.sfml.views.SourceImageView;
import com.flipp.sfml.views.ZoomScrollView;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.weeklyad.WeeklyAdViewActivity;
import e.C13589e;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.List;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.C17967q;
import kotlin.C17970r;
import kotlin.EnumC17975t;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import p1.C16193g;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17144F;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0018\u0010\u0005J#\u0010\u001d\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0019\u0010#\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u001f\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001e\u0010V\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010U¨\u0006]²\u0006\u000e\u0010X\u001a\u0004\u0018\u00010W8\nX\u008a\u0084\u0002²\u0006\f\u0010Z\u001a\u00020Y8\nX\u008a\u0084\u0002²\u0006\f\u0010\\\u001a\u00020[8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/weeklyad/WeeklyAdViewActivity;", "Landroidx/activity/ComponentActivity;", "Lcom/flipp/sfml/views/SourceImageView$e;", "Lcom/flipp/sfml/views/SourceImageView$d;", "<init>", "()V", "LJs/b;", "weeklyAdItem", "LJs/e;", "weeklyAdPublication", "", "v1", "(LJs/b;LJs/e;)V", "", "isYouTube", "", "url", "x1", "(ZLjava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "Landroid/view/View;", "view", "LRa/w;", "sourceArea", "L", "(Landroid/view/View;LRa/w;)V", "p0", "p1", "Y0", "LRa/b;", "o", "(LRa/b;)Z", "Landroid/graphics/drawable/Drawable;", "E0", "(LRa/b;)Landroid/graphics/drawable/Drawable;", "LAl/g;", "v", "LAl/g;", "getFeatureEntryPoint", "()LAl/g;", "setFeatureEntryPoint", "(LAl/g;)V", "featureEntryPoint", "LCl/e;", "w", "LCl/e;", "getMeijerIntent", "()LCl/e;", "setMeijerIntent", "(LCl/e;)V", "meijerIntent", "Lgi/a;", "x", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "LTq/j;", "y", "LTq/j;", "t1", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "LSa/f;", "z", "LSa/f;", "storeFrontAnalyticsManager", "LPs/o;", "A", "Lkotlin/Lazy;", "u1", "()LPs/o;", "viewModel", "", "Lcom/flipp/sfml/views/a;", "B", "Ljava/util/List;", "storeFrontHeroItems", "LRa/z;", "storeFront", "LPs/o$i;", "viewState", "LPs/o$g$a;", "errorOrLoading", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class WeeklyAdViewActivity extends Hilt_WeeklyAdViewActivity implements SourceImageView.e, SourceImageView.d {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(Ps.o.class), new c(this), new b(this), new d(null, this));

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private List<com.flipp.sfml.views.a> storeFrontHeroItems;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Al.g featureEntryPoint;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Sa.f storeFrontAnalyticsManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeeklyAdPublication f119231b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdViewActivity$onCreate$1$1$1", f = "WeeklyAdViewActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$a, reason: collision with other inner class name */
        static final class C1949a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f119232a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WeeklyAdViewActivity f119233b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17970r f119234c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1949a(this.f119233b, this.f119234c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1949a(WeeklyAdViewActivity weeklyAdViewActivity, C17970r c17970r, Continuation<? super C1949a> continuation) {
                super(2, continuation);
                this.f119233b = weeklyAdViewActivity;
                this.f119234c = c17970r;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C1949a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f119232a == 0) {
                    ResultKt.b(obj);
                    this.f119233b.u1().J(new o.f.BottomSheetScrollStateChange(this.f119234c.getBottomSheetState().e().ordinal()));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C17970r f119235a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WeeklyAdViewActivity f119236b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f119237c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<o.ViewState> f119238d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<Ra.z> f119239e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<o.Companion.a> f119240f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$a, reason: collision with other inner class name */
            static final class C1950a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119241a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdViewActivity f119242b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f119243c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C17970r f119244d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ z1<o.ViewState> f119245e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1951a extends FunctionReferenceImpl implements Function1<o.f, Unit> {
                    C1951a(Object obj) {
                        super(1, obj, Ps.o.class, "onAction", "onAction(Lcom/meijer/mobile/weeklyad/viewmodel/WeeklyAdViewViewModel$Action;)V", 0);
                    }

                    public final void a(o.f p02) {
                        Intrinsics.j(p02, "p0");
                        ((Ps.o) this.receiver).J(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(o.f fVar) {
                        a(fVar);
                        return Unit.f142422a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdViewActivity$onCreate$1$2$1$2$1$1", f = "WeeklyAdViewActivity.kt", l = {143, 145}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$a$b, reason: collision with other inner class name */
                static final class C1952b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f119246a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17970r f119247b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1952b(this.f119247b, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1952b(C17970r c17970r, Continuation<? super C1952b> continuation) {
                        super(2, continuation);
                        this.f119247b = c17970r;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C1952b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
                    
                        if (r5.a(r4) == r0) goto L17;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
                    
                        if (r5.b(r4) == r0) goto L17;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
                    
                        return r0;
                     */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                        /*
                            r4 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                            int r1 = r4.f119246a
                            r2 = 2
                            r3 = 1
                            if (r1 == 0) goto L1b
                            if (r1 == r3) goto L17
                            if (r1 != r2) goto Lf
                            goto L17
                        Lf:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r0)
                            throw r5
                        L17:
                            kotlin.ResultKt.b(r5)
                            goto L48
                        L1b:
                            kotlin.ResultKt.b(r5)
                            x0.r r5 = r4.f119247b
                            x0.s r5 = r5.getBottomSheetState()
                            boolean r5 = r5.g()
                            if (r5 == 0) goto L39
                            x0.r r5 = r4.f119247b
                            x0.s r5 = r5.getBottomSheetState()
                            r4.f119246a = r3
                            java.lang.Object r5 = r5.a(r4)
                            if (r5 != r0) goto L48
                            goto L47
                        L39:
                            x0.r r5 = r4.f119247b
                            x0.s r5 = r5.getBottomSheetState()
                            r4.f119246a = r2
                            java.lang.Object r5 = r5.b(r4)
                            if (r5 != r0) goto L48
                        L47:
                            return r0
                        L48:
                            kotlin.Unit r5 = kotlin.Unit.f142422a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.weeklyad.WeeklyAdViewActivity.a.b.C1950a.C1952b.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                C1950a(LocalThemeScope localThemeScope, WeeklyAdViewActivity weeklyAdViewActivity, InterfaceC16622O interfaceC16622O, C17970r c17970r, z1<o.ViewState> z1Var) {
                    this.f119241a = localThemeScope;
                    this.f119242b = weeklyAdViewActivity;
                    this.f119243c = interfaceC16622O;
                    this.f119244d = c17970r;
                    this.f119245e = z1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC16622O interfaceC16622O, C17970r c17970r) {
                    C16648k.d(interfaceC16622O, null, null, new C1952b(c17970r, null), 3, null);
                    return Unit.f142422a;
                }

                public final void b(InterfaceC14814f BottomSheetScaffold, Composer composer, int i10) {
                    Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(349158507, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdViewActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdViewActivity.kt:136)");
                    }
                    LocalThemeScope localThemeScope = this.f119241a;
                    o.ViewState viewStateF = a.f(this.f119245e);
                    Ps.o oVarU1 = this.f119242b.u1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(oVarU1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1951a(oVarU1);
                        composer.t(objB);
                    }
                    composer.P();
                    Function1 function1 = (Function1) ((KFunction) objB);
                    composer.startReplaceGroup(-1633490746);
                    boolean zD2 = composer.D(this.f119243c) | composer.V(this.f119244d);
                    final InterfaceC16622O interfaceC16622O = this.f119243c;
                    final C17970r c17970r = this.f119244d;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.weeklyad.v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WeeklyAdViewActivity.a.b.C1950a.c(interfaceC16622O, c17970r);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    Hs.o.g(localThemeScope, null, viewStateF, function1, (Function0) objB2, composer, LocalThemeScope.f15770g, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
                    b(interfaceC14814f, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$b, reason: collision with other inner class name */
            static final class C1953b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119248a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdViewActivity f119249b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<o.ViewState> f119250c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$b$a, reason: collision with other inner class name */
                static final class C1954a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f119251a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ z1<o.ViewState> f119252b;

                    C1954a(LocalThemeScope localThemeScope, z1<o.ViewState> z1Var) {
                        this.f119251a = localThemeScope;
                        this.f119252b = z1Var;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1923116760, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdViewActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WeeklyAdViewActivity.kt:157)");
                        }
                        LocalThemeScope localThemeScope = this.f119251a;
                        z1<o.ViewState> z1Var = this.f119252b;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
                        int iA = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                        InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion2.a();
                        if (composer.k() == null) {
                            C5717f.c();
                        }
                        composer.F();
                        if (composer.h()) {
                            composer.I(function0A);
                        } else {
                            composer.s();
                        }
                        Composer composerA = D1.a(composer);
                        D1.c(composerA, measurePolicyA, companion2.e());
                        D1.c(composerA, interfaceC5742sR, companion2.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion2.f());
                        C14815g c14815g = C14815g.f139108a;
                        Dr.g.g(localThemeScope, C16193g.c(Bs.a.f3259g, composer, 0), null, false, C6408b.a(a.f(z1Var).e(), composer, AbstractC5607a.f45514b), 0, null, 0, composer, LocalThemeScope.f15770g, 118);
                        composer.v();
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
                        ComposerKt.U(-1432937576, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdViewActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdViewActivity.kt:155)");
                    }
                    LocalThemeScope localThemeScope = this.f119248a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1923116760, true, new C1954a(localThemeScope, this.f119250c), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f119249b);
                    final WeeklyAdViewActivity weeklyAdViewActivity = this.f119249b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.weeklyad.w
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WeeklyAdViewActivity.a.b.C1953b.c(weeklyAdViewActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.f.d.f15507e, 0.0f, false, AbstractC5607a.INSTANCE.d(com.meijer.mobile.weeklyad.c.f119277b, new Object[0]), composer, LocalThemeScope.f15770g | 24576 | (C.f.d.f15508f << 18) | (AbstractC5607a.f45514b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1953b(LocalThemeScope localThemeScope, WeeklyAdViewActivity weeklyAdViewActivity, z1<o.ViewState> z1Var) {
                    this.f119248a = localThemeScope;
                    this.f119249b = weeklyAdViewActivity;
                    this.f119250c = z1Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f142422a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(WeeklyAdViewActivity weeklyAdViewActivity) {
                    if (!weeklyAdViewActivity.onNavigateUp()) {
                        weeklyAdViewActivity.finish();
                    }
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119253a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdViewActivity f119254b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<Ra.z> f119255c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<o.Companion.a> f119256d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$c$a, reason: collision with other inner class name */
                static final class C1955a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14794C f119257a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f119258b;

                    C1955a(InterfaceC14794C interfaceC14794C, LocalThemeScope localThemeScope) {
                        this.f119257a = interfaceC14794C;
                        this.f119258b = localThemeScope;
                    }

                    public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(2034513435, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdViewActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WeeklyAdViewActivity.kt:177)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Bi.o oVar = Bi.o.f2584a;
                        Bi.m.d(this.f119258b, D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), this.f119257a), largeLoading, oVar, C16193g.c(com.meijer.mobile.weeklyad.c.f119279d, composer, 0), null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.Large.f140090f << 6), 48);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$c$b, reason: collision with other inner class name */
                public /* synthetic */ class C1956b {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[o.Companion.a.values().length];
                        try {
                            iArr[o.Companion.a.f29259a.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[o.Companion.a.f29260b.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[o.Companion.a.f29261c.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                c(LocalThemeScope localThemeScope, WeeklyAdViewActivity weeklyAdViewActivity, z1<? extends Ra.z> z1Var, z1<? extends o.Companion.a> z1Var2) {
                    this.f119253a = localThemeScope;
                    this.f119254b = weeklyAdViewActivity;
                    this.f119255c = z1Var;
                    this.f119256d = z1Var2;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final WayfinderView d(WeeklyAdViewActivity weeklyAdViewActivity, Context context) {
                    Intrinsics.j(context, "context");
                    Sa.c cVar = (Sa.c) Qa.c.c(Sa.c.class);
                    Context applicationContext = weeklyAdViewActivity.getApplicationContext();
                    Intrinsics.i(applicationContext, "getApplicationContext(...)");
                    cVar.c(new C12989a(applicationContext));
                    return new WayfinderView(context);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(z1 z1Var, WeeklyAdViewActivity weeklyAdViewActivity, WayfinderView wayfinderView) {
                    Intrinsics.j(wayfinderView, "wayfinderView");
                    if (a.e(z1Var) != null) {
                        ViewGroup viewGroupB = new Sa.g(weeklyAdViewActivity, a.e(z1Var)).c(weeklyAdViewActivity.storeFrontAnalyticsManager).d(weeklyAdViewActivity).f(weeklyAdViewActivity).e(weeklyAdViewActivity.storeFrontHeroItems).b();
                        Intrinsics.h(viewGroupB, "null cannot be cast to non-null type com.flipp.sfml.views.ZoomScrollView");
                        ZoomScrollView zoomScrollView = (ZoomScrollView) viewGroupB;
                        Sa.f fVar = weeklyAdViewActivity.storeFrontAnalyticsManager;
                        if (fVar != null) {
                            fVar.q(zoomScrollView);
                        }
                        Sa.f fVar2 = weeklyAdViewActivity.storeFrontAnalyticsManager;
                        if (fVar2 != null) {
                            fVar2.s(wayfinderView);
                        }
                        wayfinderView.addView(zoomScrollView, 0, new FrameLayout.LayoutParams(-1, -1));
                    }
                    return Unit.f142422a;
                }

                public final void c(InterfaceC14794C contentPadding, Composer composer, int i10) {
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
                        ComposerKt.U(-1685961502, i11, -1, "com.meijer.mobile.weeklyad.WeeklyAdViewActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdViewActivity.kt:174)");
                    }
                    int i12 = C1956b.$EnumSwitchMapping$0[a.g(this.f119256d).ordinal()];
                    if (i12 == 1) {
                        composer.startReplaceGroup(-1131236408);
                        LocalThemeScope localThemeScope = this.f119253a;
                        Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(2034513435, true, new C1955a(contentPadding, localThemeScope), composer, 54), composer, (Q0.b.f139712b << 3) | LocalThemeScope.f15770g | 384);
                        composer.P();
                    } else if (i12 == 2) {
                        composer.startReplaceGroup(-1130556454);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierD = androidx.compose.foundation.b.d(D.h(J.f(companion, 0.0f, 1, null), contentPadding), this.f119253a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
                        LocalThemeScope localThemeScope2 = this.f119253a;
                        e.Companion companion2 = P0.e.INSTANCE;
                        MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
                        int iA = C5717f.a(composer, 0);
                        InterfaceC5742s interfaceC5742sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
                        InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                        Function0<InterfaceC5811g> function0A = companion3.a();
                        if (composer.k() == null) {
                            C5717f.c();
                        }
                        composer.F();
                        if (composer.h()) {
                            composer.I(function0A);
                        } else {
                            composer.s();
                        }
                        Composer composerA = D1.a(composer);
                        D1.c(composerA, measurePolicyG, companion3.e());
                        D1.c(composerA, interfaceC5742sR, companion3.g());
                        Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion3.f());
                        ri.j.h(localThemeScope2, new q1.Label(C5664j.f48612a.g(companion, companion2.e()), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSix(), null, 382, null), C16193g.c(Bs.a.f3257e, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                        composer.v();
                        composer.P();
                    } else {
                        if (i12 != 3) {
                            composer.startReplaceGroup(-1006321912);
                            composer.P();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer.startReplaceGroup(-1129666475);
                        Modifier modifierH = D.h(Modifier.INSTANCE, contentPadding);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f119254b);
                        final WeeklyAdViewActivity weeklyAdViewActivity = this.f119254b;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.weeklyad.x
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return WeeklyAdViewActivity.a.b.c.d(weeklyAdViewActivity, (Context) obj);
                                }
                            };
                            composer.t(objB);
                        }
                        Function1 function1 = (Function1) objB;
                        composer.P();
                        composer.startReplaceGroup(-1633490746);
                        boolean zV = composer.V(this.f119255c) | composer.D(this.f119254b);
                        final z1<Ra.z> z1Var = this.f119255c;
                        final WeeklyAdViewActivity weeklyAdViewActivity2 = this.f119254b;
                        Object objB2 = composer.B();
                        if (zV || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function1() { // from class: com.meijer.mobile.weeklyad.y
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return WeeklyAdViewActivity.a.b.c.e(z1Var, weeklyAdViewActivity2, (WayfinderView) obj);
                                }
                            };
                            composer.t(objB2);
                        }
                        composer.P();
                        androidx.compose.ui.viewinterop.e.a(function1, modifierH, (Function1) objB2, composer, 0, 0);
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
                    c(interfaceC14794C, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(C17970r c17970r, WeeklyAdViewActivity weeklyAdViewActivity, InterfaceC16622O interfaceC16622O, z1<o.ViewState> z1Var, z1<? extends Ra.z> z1Var2, z1<? extends o.Companion.a> z1Var3) {
                this.f119235a = c17970r;
                this.f119236b = weeklyAdViewActivity;
                this.f119237c = interfaceC16622O;
                this.f119238d = z1Var;
                this.f119239e = z1Var2;
                this.f119240f = z1Var3;
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
                    ComposerKt.U(-1527186852, i11, -1, "com.meijer.mobile.weeklyad.WeeklyAdViewActivity.onCreate.<anonymous>.<anonymous> (WeeklyAdViewActivity.kt:134)");
                }
                C17967q.b(ComposableLambdaKt.c(349158507, true, new C1950a(AdsTheme, this.f119236b, this.f119237c, this.f119235a, this.f119238d), composer, 54), FullStoryAnnotationsKt.fsUnmask(J.f(Modifier.INSTANCE, 0.0f, 1, null)), this.f119235a, ComposableLambdaKt.c(-1432937576, true, new C1953b(AdsTheme, this.f119236b, this.f119238d), composer, 54), null, null, 0, false, null, 0.0f, 0L, 0L, H1.h.p(48), 0L, 0L, ComposableLambdaKt.c(-1685961502, true, new c(AdsTheme, this.f119236b, this.f119239e, this.f119240f), composer, 54), composer, 199686, 196992, 28624);
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
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdViewActivity$onCreate$1$3$1", f = "WeeklyAdViewActivity.kt", l = {248}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f119259a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WeeklyAdViewActivity f119260b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ WeeklyAdPublication f119261c;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPs/o$h;", "effect", "", "<anonymous>", "(LPs/o$h;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdViewActivity$onCreate$1$3$1$1", f = "WeeklyAdViewActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$c$a, reason: collision with other inner class name */
            static final class C1957a extends SuspendLambda implements Function2<o.h, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f119262a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f119263b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ WeeklyAdViewActivity f119264c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ WeeklyAdPublication f119265d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1957a c1957a = new C1957a(this.f119264c, this.f119265d, continuation);
                    c1957a.f119263b = obj;
                    return c1957a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1957a(WeeklyAdViewActivity weeklyAdViewActivity, WeeklyAdPublication weeklyAdPublication, Continuation<? super C1957a> continuation) {
                    super(2, continuation);
                    this.f119264c = weeklyAdViewActivity;
                    this.f119265d = weeklyAdPublication;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(o.h hVar, Continuation<? super Unit> continuation) {
                    return ((C1957a) create(hVar, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f119262a == 0) {
                        ResultKt.b(obj);
                        o.h hVar = (o.h) this.f119263b;
                        if (hVar instanceof o.h.AdTapped) {
                            this.f119264c.v1(((o.h.AdTapped) hVar).getWeeklyAdItem(), this.f119265d);
                        } else if (hVar instanceof o.h.ExternalUrlTapped) {
                            this.f119264c.getMeijerIntent().d0(this.f119264c, ((o.h.ExternalUrlTapped) hVar).getUrl());
                        } else if (hVar instanceof o.h.VideoTapped) {
                            o.h.VideoTapped videoTapped = (o.h.VideoTapped) hVar;
                            this.f119264c.x1(videoTapped.getIsYoutube(), videoTapped.getUrl());
                        } else if (hVar instanceof o.h.ShowDetails) {
                            WeeklyAdViewActivity weeklyAdViewActivity = this.f119264c;
                            o.h.ShowDetails showDetails = (o.h.ShowDetails) hVar;
                            weeklyAdViewActivity.startActivity(weeklyAdViewActivity.getFeatureEntryPoint().C(showDetails.getWeeklyAdItem().getItemId(), showDetails.getWeeklyAdItem().getFlyerId(), this.f119265d, showDetails.getWeeklyAdItem().o()));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f142422a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new c(this.f119260b, this.f119261c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(WeeklyAdViewActivity weeklyAdViewActivity, WeeklyAdPublication weeklyAdPublication, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f119260b = weeklyAdViewActivity;
                this.f119261c = weeklyAdPublication;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f119259a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC17144F<o.h> interfaceC17144FD = this.f119260b.u1().D();
                    C1957a c1957a = new C1957a(this.f119260b, this.f119261c, null);
                    this.f119259a = 1;
                    if (C17154h.k(interfaceC17144FD, c1957a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        a(WeeklyAdPublication weeklyAdPublication) {
            this.f119231b = weeklyAdPublication;
        }

        public final void d(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1845585485, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdViewActivity.onCreate.<anonymous> (WeeklyAdViewActivity.kt:121)");
            }
            C17970r c17970rK = C17967q.k(C17967q.l(EnumC17975t.f168664a, null, null, composer, 6, 6), null, composer, 0, 2);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB;
            z1 z1VarA = o1.a(WeeklyAdViewActivity.this.u1().F(), null, null, composer, 48, 2);
            z1 z1VarB = o1.b(WeeklyAdViewActivity.this.u1().G(), null, composer, 0, 1);
            z1 z1VarA2 = o1.a(WeeklyAdViewActivity.this.u1().E(), o.Companion.a.f29261c, null, composer, 48, 2);
            EnumC17975t enumC17975tE = c17970rK.getBottomSheetState().e();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(WeeklyAdViewActivity.this) | composer.V(c17970rK);
            WeeklyAdViewActivity weeklyAdViewActivity = WeeklyAdViewActivity.this;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new C1949a(weeklyAdViewActivity, c17970rK, null);
                composer.t(objB2);
            }
            composer.P();
            androidx.compose.runtime.J.g(enumC17975tE, (Function2) objB2, composer, 0);
            K.b(null, ComposableLambdaKt.c(-1527186852, true, new b(c17970rK, WeeklyAdViewActivity.this, interfaceC16622O, z1VarB, z1VarA, z1VarA2), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(WeeklyAdViewActivity.this) | composer.D(this.f119231b);
            WeeklyAdViewActivity weeklyAdViewActivity2 = WeeklyAdViewActivity.this;
            WeeklyAdPublication weeklyAdPublication = this.f119231b;
            Object objB3 = composer.B();
            if (zD2 || objB3 == companion.a()) {
                objB3 = new c(weeklyAdViewActivity2, weeklyAdPublication, null);
                composer.t(objB3);
            }
            composer.P();
            androidx.compose.runtime.J.g("WeeklyAdViewActivity", (Function2) objB3, composer, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Ra.z e(z1<? extends Ra.z> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o.ViewState f(z1<o.ViewState> z1Var) {
            return z1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o.Companion.a g(z1<? extends o.Companion.a> z1Var) {
            return z1Var.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119266f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f119266f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f119266f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119267f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f119267f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f119267f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f119268f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f119269g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f119268f = function0;
            this.f119269g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f119268f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f119269g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.flipp.sfml.views.SourceImageView.d
    public Drawable E0(Ra.b p02) {
        return null;
    }

    @Override // com.flipp.sfml.views.SourceImageView.e
    public void Y0(View p02, Ra.w p12) {
    }

    @Override // com.flipp.sfml.views.SourceImageView.d
    public boolean o(Ra.b p02) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Ps.o u1() {
        return (Ps.o) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w1(Tq.k kVar, WeeklyAdPublication weeklyAdPublication, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("weekly ad");
        track.h("postalcode", kVar.getZipCode());
        track.h("storeid", String.valueOf(kVar.getStoreId()));
        track.h("flyerevent", "open");
        track.h("flyerid", String.valueOf(weeklyAdPublication.getFlyerID()));
        track.h("flyerTypeName", weeklyAdPublication.getTitle());
        track.h("flyerInternalRunName", String.valueOf(weeklyAdPublication.getFlyerRunId()));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("weekly ad");
        track.n("weekly ad");
        return Unit.f142422a;
    }

    @Override // com.flipp.sfml.views.SourceImageView.e
    public void L(View view, Ra.w sourceArea) {
        Ra.b bVarI;
        if (sourceArea == null || (bVarI = sourceArea.i()) == null) {
            return;
        }
        u1().J(new o.f.FlyerClicked((int) bVarI.e()));
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final Al.g getFeatureEntryPoint() {
        Al.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.y("featureEntryPoint");
        return null;
    }

    public final Cl.e getMeijerIntent() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    public final Tq.j t1() {
        Tq.j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.y("storeProvider");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(WeeklyAdItem weeklyAdItem, WeeklyAdPublication weeklyAdPublication) {
        startActivity(getFeatureEntryPoint().C(weeklyAdItem.getItemId(), weeklyAdItem.getFlyerId(), weeklyAdPublication, weeklyAdItem.o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(boolean isYouTube, String url) {
        getAnalyticsEngine().h(C14476c.a("event: weekly ad: video start"), new Function1() { // from class: com.meijer.mobile.weeklyad.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WeeklyAdViewActivity.y1((TrackingData) obj);
            }
        });
        if (isYouTube) {
            startActivity(getMeijerIntent().r(url));
        }
    }

    @Override // com.meijer.mobile.weeklyad.Hilt_WeeklyAdViewActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object obj;
        super.onCreate(savedInstanceState);
        getLifecycle().a(u1());
        Intent intent = getIntent();
        Intrinsics.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = (Parcelable) intent.getParcelableExtra("com.meijer.mobile.meijer.activity.weeklyad.publication", WeeklyAdPublication.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("com.meijer.mobile.meijer.activity.weeklyad.publication");
            if (!(parcelableExtra instanceof WeeklyAdPublication)) {
                parcelableExtra = null;
            }
            obj = (WeeklyAdPublication) parcelableExtra;
        }
        Intrinsics.g(obj);
        final WeeklyAdPublication weeklyAdPublication = (WeeklyAdPublication) obj;
        this.storeFrontHeroItems = new ArrayList();
        u1().H(weeklyAdPublication);
        this.storeFrontAnalyticsManager = new Sa.f();
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1845585485, true, new a(weeklyAdPublication)), 1, null);
        final Tq.k kVarH = t1().h();
        getAnalyticsEngine().h(C14476c.a("WeeklyAd Open"), new Function1() { // from class: com.meijer.mobile.weeklyad.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return WeeklyAdViewActivity.w1(kVarH, weeklyAdPublication, (TrackingData) obj2);
            }
        });
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        Sa.f fVar = this.storeFrontAnalyticsManager;
        if (fVar != null) {
            fVar.r(false);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        Sa.f fVar = this.storeFrontAnalyticsManager;
        if (fVar != null) {
            fVar.r(true);
        }
    }
}
