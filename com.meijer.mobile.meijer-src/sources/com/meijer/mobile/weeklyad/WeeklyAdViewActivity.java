package com.meijer.mobile.weeklyad;

import Js.WeeklyAdItem;
import Js.WeeklyAdPublication;
import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import Ki.Q;
import P0.e;
import Ps.o;
import V2.CreationExtras;
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
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
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
import com.flipp.sfml.views.SourceImageView;
import com.flipp.sfml.views.ZoomScrollView;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.weeklyad.WeeklyAdViewActivity;
import dk.C13698b;
import e.C13737e;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import java.util.ArrayList;
import java.util.List;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
import kotlin.C18033q;
import kotlin.C18036r;
import kotlin.EnumC18041t;
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
import mv.C15809k;
import mv.InterfaceC15783O;
import p1.C16338g;
import pv.C16563h;
import pv.InterfaceC16553F;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0018\u0010\u0005J#\u0010\u001d\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0019\u0010#\u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u001f\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010'R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010M\u001a\u0004\bN\u0010OR\u001e\u0010U\u001a\n\u0012\u0004\u0012\u00020R\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006\\²\u0006\u000e\u0010W\u001a\u0004\u0018\u00010V8\nX\u008a\u0084\u0002²\u0006\f\u0010Y\u001a\u00020X8\nX\u008a\u0084\u0002²\u0006\f\u0010[\u001a\u00020Z8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/weeklyad/WeeklyAdViewActivity;", "Landroidx/activity/ComponentActivity;", "Lcom/flipp/sfml/views/SourceImageView$e;", "Lcom/flipp/sfml/views/SourceImageView$d;", "<init>", "()V", "LJs/b;", "weeklyAdItem", "LJs/e;", "weeklyAdPublication", "", "v1", "(LJs/b;LJs/e;)V", "", "isYouTube", "", "url", "x1", "(ZLjava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "Landroid/view/View;", "view", "LTa/w;", "sourceArea", "V0", "(Landroid/view/View;LTa/w;)V", "p0", "p1", "b0", "LTa/b;", "u0", "(LTa/b;)Z", "Landroid/graphics/drawable/Drawable;", "A", "(LTa/b;)Landroid/graphics/drawable/Drawable;", "LBl/g;", "v", "LBl/g;", "getFeatureEntryPoint", "()LBl/g;", "setFeatureEntryPoint", "(LBl/g;)V", "featureEntryPoint", "LDl/e;", "w", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "Lhi/a;", "x", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "LTq/j;", "y", "LTq/j;", "t1", "()LTq/j;", "setStoreProvider", "(LTq/j;)V", "storeProvider", "LUa/f;", "z", "LUa/f;", "storeFrontAnalyticsManager", "LPs/o;", "Lkotlin/Lazy;", "u1", "()LPs/o;", "viewModel", "", "Lcom/flipp/sfml/views/a;", "B", "Ljava/util/List;", "storeFrontHeroItems", "LTa/z;", "storeFront", "LPs/o$i;", "viewState", "LPs/o$g$a;", "errorOrLoading", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class WeeklyAdViewActivity extends Hilt_WeeklyAdViewActivity implements SourceImageView.e, SourceImageView.d {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(Ps.o.class), new c(this), new b(this), new d(null, this));

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private List<com.flipp.sfml.views.a> storeFrontHeroItems;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Bl.g featureEntryPoint;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public Tq.j storeProvider;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Ua.f storeFrontAnalyticsManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeeklyAdPublication f120204b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdViewActivity$onCreate$1$1$1", f = "WeeklyAdViewActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$a, reason: collision with other inner class name */
        static final class C1956a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f120205a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WeeklyAdViewActivity f120206b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C18036r f120207c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1956a(this.f120206b, this.f120207c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1956a(WeeklyAdViewActivity weeklyAdViewActivity, C18036r c18036r, Continuation<? super C1956a> continuation) {
                super(2, continuation);
                this.f120206b = weeklyAdViewActivity;
                this.f120207c = c18036r;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1956a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f120205a == 0) {
                    ResultKt.b(obj);
                    this.f120206b.u1().J(new o.f.BottomSheetScrollStateChange(this.f120207c.getBottomSheetState().e().ordinal()));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C18036r f120208a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WeeklyAdViewActivity f120209b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f120210c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<o.ViewState> f120211d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ z1<Ta.z> f120212e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<o.Companion.a> f120213f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$a, reason: collision with other inner class name */
            static final class C1957a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f120214a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdViewActivity f120215b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f120216c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C18036r f120217d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ z1<o.ViewState> f120218e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$a$a, reason: collision with other inner class name */
                /* synthetic */ class C1958a extends FunctionReferenceImpl implements Function1<o.f, Unit> {
                    C1958a(Object obj) {
                        super(1, obj, Ps.o.class, "onAction", "onAction(Lcom/meijer/mobile/weeklyad/viewmodel/WeeklyAdViewViewModel$Action;)V", 0);
                    }

                    public final void a(o.f p02) {
                        Intrinsics.j(p02, "p0");
                        ((Ps.o) this.receiver).J(p02);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(o.f fVar) {
                        a(fVar);
                        return Unit.f143329a;
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdViewActivity$onCreate$1$2$1$2$1$1", f = "WeeklyAdViewActivity.kt", l = {143, 145}, m = "invokeSuspend")
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$a$b, reason: collision with other inner class name */
                static final class C1959b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f120219a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C18036r f120220b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1959b(this.f120220b, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1959b(C18036r c18036r, Continuation<? super C1959b> continuation) {
                        super(2, continuation);
                        this.f120220b = c18036r;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C1959b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                            int r1 = r4.f120219a
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
                            x0.r r5 = r4.f120220b
                            x0.s r5 = r5.getBottomSheetState()
                            boolean r5 = r5.g()
                            if (r5 == 0) goto L39
                            x0.r r5 = r4.f120220b
                            x0.s r5 = r5.getBottomSheetState()
                            r4.f120219a = r3
                            java.lang.Object r5 = r5.a(r4)
                            if (r5 != r0) goto L48
                            goto L47
                        L39:
                            x0.r r5 = r4.f120220b
                            x0.s r5 = r5.getBottomSheetState()
                            r4.f120219a = r2
                            java.lang.Object r5 = r5.b(r4)
                            if (r5 != r0) goto L48
                        L47:
                            return r0
                        L48:
                            kotlin.Unit r5 = kotlin.Unit.f143329a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.weeklyad.WeeklyAdViewActivity.a.b.C1957a.C1959b.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                C1957a(LocalThemeScope localThemeScope, WeeklyAdViewActivity weeklyAdViewActivity, InterfaceC15783O interfaceC15783O, C18036r c18036r, z1<o.ViewState> z1Var) {
                    this.f120214a = localThemeScope;
                    this.f120215b = weeklyAdViewActivity;
                    this.f120216c = interfaceC15783O;
                    this.f120217d = c18036r;
                    this.f120218e = z1Var;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC15783O interfaceC15783O, C18036r c18036r) {
                    C15809k.d(interfaceC15783O, null, null, new C1959b(c18036r, null), 3, null);
                    return Unit.f143329a;
                }

                public final void b(InterfaceC14902f BottomSheetScaffold, Composer composer, int i10) {
                    Intrinsics.j(BottomSheetScaffold, "$this$BottomSheetScaffold");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(349158507, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdViewActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdViewActivity.kt:136)");
                    }
                    LocalThemeScope localThemeScope = this.f120214a;
                    o.ViewState viewStateF = a.f(this.f120218e);
                    Ps.o oVarU1 = this.f120215b.u1();
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(oVarU1);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new C1958a(oVarU1);
                        composer.t(objB);
                    }
                    composer.P();
                    Function1 function1 = (Function1) ((KFunction) objB);
                    composer.startReplaceGroup(-1633490746);
                    boolean zD2 = composer.D(this.f120216c) | composer.V(this.f120217d);
                    final InterfaceC15783O interfaceC15783O = this.f120216c;
                    final C18036r c18036r = this.f120217d;
                    Object objB2 = composer.B();
                    if (zD2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function0() { // from class: com.meijer.mobile.weeklyad.v
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WeeklyAdViewActivity.a.b.C1957a.c(interfaceC15783O, c18036r);
                            }
                        };
                        composer.t(objB2);
                    }
                    composer.P();
                    Hs.o.g(localThemeScope, null, viewStateF, function1, (Function0) objB2, composer, LocalThemeScope.f17314g, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                    b(interfaceC14902f, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$b, reason: collision with other inner class name */
            static final class C1960b implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f120221a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdViewActivity f120222b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<o.ViewState> f120223c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$b$a, reason: collision with other inner class name */
                static final class C1961a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f120224a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ z1<o.ViewState> f120225b;

                    C1961a(LocalThemeScope localThemeScope, z1<o.ViewState> z1Var) {
                        this.f120224a = localThemeScope;
                        this.f120225b = z1Var;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(1923116760, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdViewActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WeeklyAdViewActivity.kt:157)");
                        }
                        LocalThemeScope localThemeScope = this.f120224a;
                        z1<o.ViewState> z1Var = this.f120225b;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                        int iA = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
                        D1.c(composerA, measurePolicyA, companion2.e());
                        D1.c(composerA, interfaceC5884sR, companion2.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion2.f());
                        C14903g c14903g = C14903g.f139698a;
                        Dr.g.g(localThemeScope, C16338g.c(Bs.a.f3665g, composer, 0), null, false, C13698b.a(a.f(z1Var).e(), composer, AbstractC6392a.f60445b), 0, null, 0, composer, LocalThemeScope.f17314g, 118);
                        composer.v();
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
                        ComposerKt.U(-1432937576, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdViewActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (WeeklyAdViewActivity.kt:155)");
                    }
                    LocalThemeScope localThemeScope = this.f120221a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(1923116760, true, new C1961a(localThemeScope, this.f120223c), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f120222b);
                    final WeeklyAdViewActivity weeklyAdViewActivity = this.f120222b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.weeklyad.w
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WeeklyAdViewActivity.a.b.C1960b.c(weeklyAdViewActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.f.d.f17051e, 0.0f, false, AbstractC6392a.INSTANCE.d(com.meijer.mobile.weeklyad.c.f120250b, new Object[0]), composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1960b(LocalThemeScope localThemeScope, WeeklyAdViewActivity weeklyAdViewActivity, z1<o.ViewState> z1Var) {
                    this.f120221a = localThemeScope;
                    this.f120222b = weeklyAdViewActivity;
                    this.f120223c = z1Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(WeeklyAdViewActivity weeklyAdViewActivity) {
                    if (!weeklyAdViewActivity.onNavigateUp()) {
                        weeklyAdViewActivity.finish();
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f120226a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ WeeklyAdViewActivity f120227b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ z1<Ta.z> f120228c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ z1<o.Companion.a> f120229d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$c$a, reason: collision with other inner class name */
                static final class C1962a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ InterfaceC14882C f120230a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f120231b;

                    C1962a(InterfaceC14882C interfaceC14882C, LocalThemeScope localThemeScope) {
                        this.f120230a = interfaceC14882C;
                        this.f120231b = localThemeScope;
                    }

                    public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
                        Intrinsics.j(Assemble, "$this$Assemble");
                        if (ComposerKt.M()) {
                            ComposerKt.U(2034513435, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdViewActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WeeklyAdViewActivity.kt:177)");
                        }
                        q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
                        Ci.o oVar = Ci.o.f4629a;
                        Ci.m.d(this.f120231b, D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), this.f120230a), largeLoading, oVar, C16338g.c(com.meijer.mobile.weeklyad.c.f120252d, composer, 0), null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 48);
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

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$b$c$b, reason: collision with other inner class name */
                public /* synthetic */ class C1963b {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[o.Companion.a.values().length];
                        try {
                            iArr[o.Companion.a.f27141a.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[o.Companion.a.f27142b.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[o.Companion.a.f27143c.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                c(LocalThemeScope localThemeScope, WeeklyAdViewActivity weeklyAdViewActivity, z1<? extends Ta.z> z1Var, z1<? extends o.Companion.a> z1Var2) {
                    this.f120226a = localThemeScope;
                    this.f120227b = weeklyAdViewActivity;
                    this.f120228c = z1Var;
                    this.f120229d = z1Var2;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final WayfinderView d(WeeklyAdViewActivity weeklyAdViewActivity, Context context) {
                    Intrinsics.j(context, "context");
                    Ua.c cVar = (Ua.c) Sa.c.c(Ua.c.class);
                    Context applicationContext = weeklyAdViewActivity.getApplicationContext();
                    Intrinsics.i(applicationContext, "getApplicationContext(...)");
                    cVar.c(new C13120a(applicationContext));
                    return new WayfinderView(context);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(z1 z1Var, WeeklyAdViewActivity weeklyAdViewActivity, WayfinderView wayfinderView) {
                    Intrinsics.j(wayfinderView, "wayfinderView");
                    if (a.e(z1Var) != null) {
                        ViewGroup viewGroupB = new Ua.g(weeklyAdViewActivity, a.e(z1Var)).c(weeklyAdViewActivity.storeFrontAnalyticsManager).d(weeklyAdViewActivity).f(weeklyAdViewActivity).e(weeklyAdViewActivity.storeFrontHeroItems).b();
                        Intrinsics.h(viewGroupB, "null cannot be cast to non-null type com.flipp.sfml.views.ZoomScrollView");
                        ZoomScrollView zoomScrollView = (ZoomScrollView) viewGroupB;
                        Ua.f fVar = weeklyAdViewActivity.storeFrontAnalyticsManager;
                        if (fVar != null) {
                            fVar.q(zoomScrollView);
                        }
                        Ua.f fVar2 = weeklyAdViewActivity.storeFrontAnalyticsManager;
                        if (fVar2 != null) {
                            fVar2.s(wayfinderView);
                        }
                        wayfinderView.addView(zoomScrollView, 0, new FrameLayout.LayoutParams(-1, -1));
                    }
                    return Unit.f143329a;
                }

                public final void c(InterfaceC14882C contentPadding, Composer composer, int i10) {
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
                    int i12 = C1963b.$EnumSwitchMapping$0[a.g(this.f120229d).ordinal()];
                    if (i12 == 1) {
                        composer.startReplaceGroup(-1131236408);
                        LocalThemeScope localThemeScope = this.f120226a;
                        Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(2034513435, true, new C1962a(contentPadding, localThemeScope), composer, 54), composer, (Q0.b.f141967b << 3) | LocalThemeScope.f17314g | 384);
                        composer.P();
                    } else if (i12 == 2) {
                        composer.startReplaceGroup(-1130556454);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierD = androidx.compose.foundation.b.d(D.h(J.f(companion, 0.0f, 1, null), contentPadding), this.f120226a.getAdsColors().getAdsColorUIBackground02().getColor(), null, 2, null);
                        LocalThemeScope localThemeScope2 = this.f120226a;
                        e.Companion companion2 = P0.e.INSTANCE;
                        MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
                        int iA = C5859f.a(composer, 0);
                        InterfaceC5884s interfaceC5884sR = composer.r();
                        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
                        InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
                        Function0<InterfaceC5953g> function0A = companion3.a();
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
                        D1.c(composerA, measurePolicyG, companion3.e());
                        D1.c(composerA, interfaceC5884sR, companion3.g());
                        Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
                        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                            composerA.t(Integer.valueOf(iA));
                            composerA.n(Integer.valueOf(iA), function2B);
                        }
                        D1.c(composerA, modifierE, companion3.f());
                        si.j.h(localThemeScope2, new q1.Label(C5806j.f48836a.g(companion, companion2.e()), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSix(), null, 382, null), C16338g.c(Bs.a.f3663e, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
                        boolean zD = composer.D(this.f120227b);
                        final WeeklyAdViewActivity weeklyAdViewActivity = this.f120227b;
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
                        boolean zV = composer.V(this.f120228c) | composer.D(this.f120227b);
                        final z1<Ta.z> z1Var = this.f120228c;
                        final WeeklyAdViewActivity weeklyAdViewActivity2 = this.f120227b;
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
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    c(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(C18036r c18036r, WeeklyAdViewActivity weeklyAdViewActivity, InterfaceC15783O interfaceC15783O, z1<o.ViewState> z1Var, z1<? extends Ta.z> z1Var2, z1<? extends o.Companion.a> z1Var3) {
                this.f120208a = c18036r;
                this.f120209b = weeklyAdViewActivity;
                this.f120210c = interfaceC15783O;
                this.f120211d = z1Var;
                this.f120212e = z1Var2;
                this.f120213f = z1Var3;
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
                C18033q.b(ComposableLambdaKt.c(349158507, true, new C1957a(AdsTheme, this.f120209b, this.f120210c, this.f120208a, this.f120211d), composer, 54), FullStoryAnnotationsKt.fsUnmask(J.f(Modifier.INSTANCE, 0.0f, 1, null)), this.f120208a, ComposableLambdaKt.c(-1432937576, true, new C1960b(AdsTheme, this.f120209b, this.f120211d), composer, 54), null, null, 0, false, null, 0.0f, 0L, 0L, H1.h.p(48), 0L, 0L, ComposableLambdaKt.c(-1685961502, true, new c(AdsTheme, this.f120209b, this.f120212e, this.f120213f), composer, 54), composer, 199686, 196992, 28624);
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
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdViewActivity$onCreate$1$3$1", f = "WeeklyAdViewActivity.kt", l = {248}, m = "invokeSuspend")
        static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f120232a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WeeklyAdViewActivity f120233b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ WeeklyAdPublication f120234c;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPs/o$h;", "effect", "", "<anonymous>", "(LPs/o$h;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.weeklyad.WeeklyAdViewActivity$onCreate$1$3$1$1", f = "WeeklyAdViewActivity.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.weeklyad.WeeklyAdViewActivity$a$c$a, reason: collision with other inner class name */
            static final class C1964a extends SuspendLambda implements Function2<o.h, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f120235a;

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f120236b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ WeeklyAdViewActivity f120237c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ WeeklyAdPublication f120238d;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C1964a c1964a = new C1964a(this.f120237c, this.f120238d, continuation);
                    c1964a.f120236b = obj;
                    return c1964a;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1964a(WeeklyAdViewActivity weeklyAdViewActivity, WeeklyAdPublication weeklyAdPublication, Continuation<? super C1964a> continuation) {
                    super(2, continuation);
                    this.f120237c = weeklyAdViewActivity;
                    this.f120238d = weeklyAdPublication;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(o.h hVar, Continuation<? super Unit> continuation) {
                    return ((C1964a) create(hVar, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.f();
                    if (this.f120235a == 0) {
                        ResultKt.b(obj);
                        o.h hVar = (o.h) this.f120236b;
                        if (hVar instanceof o.h.AdTapped) {
                            this.f120237c.v1(((o.h.AdTapped) hVar).getWeeklyAdItem(), this.f120238d);
                        } else if (hVar instanceof o.h.ExternalUrlTapped) {
                            this.f120237c.getMeijerIntent().e0(this.f120237c, ((o.h.ExternalUrlTapped) hVar).getUrl());
                        } else if (hVar instanceof o.h.VideoTapped) {
                            o.h.VideoTapped videoTapped = (o.h.VideoTapped) hVar;
                            this.f120237c.x1(videoTapped.getIsYoutube(), videoTapped.getUrl());
                        } else if (hVar instanceof o.h.ShowDetails) {
                            WeeklyAdViewActivity weeklyAdViewActivity = this.f120237c;
                            o.h.ShowDetails showDetails = (o.h.ShowDetails) hVar;
                            weeklyAdViewActivity.startActivity(weeklyAdViewActivity.getFeatureEntryPoint().C(showDetails.getWeeklyAdItem().getItemId(), showDetails.getWeeklyAdItem().getFlyerId(), this.f120238d, showDetails.getWeeklyAdItem().o()));
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
                return new c(this.f120233b, this.f120234c, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(WeeklyAdViewActivity weeklyAdViewActivity, WeeklyAdPublication weeklyAdPublication, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f120233b = weeklyAdViewActivity;
                this.f120234c = weeklyAdPublication;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f120232a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16553F<o.h> interfaceC16553FD = this.f120233b.u1().D();
                    C1964a c1964a = new C1964a(this.f120233b, this.f120234c, null);
                    this.f120232a = 1;
                    if (C16563h.k(interfaceC16553FD, c1964a, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        a(WeeklyAdPublication weeklyAdPublication) {
            this.f120204b = weeklyAdPublication;
        }

        public final void d(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1845585485, i10, -1, "com.meijer.mobile.weeklyad.WeeklyAdViewActivity.onCreate.<anonymous> (WeeklyAdViewActivity.kt:121)");
            }
            C18036r c18036rK = C18033q.k(C18033q.l(EnumC18041t.f169752a, null, null, composer, 6, 6), null, composer, 0, 2);
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB;
            z1 z1VarA = o1.a(WeeklyAdViewActivity.this.u1().F(), null, null, composer, 48, 2);
            z1 z1VarB = o1.b(WeeklyAdViewActivity.this.u1().G(), null, composer, 0, 1);
            z1 z1VarA2 = o1.a(WeeklyAdViewActivity.this.u1().E(), o.Companion.a.f27143c, null, composer, 48, 2);
            EnumC18041t enumC18041tE = c18036rK.getBottomSheetState().e();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(WeeklyAdViewActivity.this) | composer.V(c18036rK);
            WeeklyAdViewActivity weeklyAdViewActivity = WeeklyAdViewActivity.this;
            Object objB2 = composer.B();
            if (zD || objB2 == companion.a()) {
                objB2 = new C1956a(weeklyAdViewActivity, c18036rK, null);
                composer.t(objB2);
            }
            composer.P();
            androidx.compose.runtime.J.g(enumC18041tE, (Function2) objB2, composer, 0);
            K.b(null, ComposableLambdaKt.c(-1527186852, true, new b(c18036rK, WeeklyAdViewActivity.this, interfaceC15783O, z1VarB, z1VarA, z1VarA2), composer, 54), composer, 48, 1);
            composer.startReplaceGroup(-1633490746);
            boolean zD2 = composer.D(WeeklyAdViewActivity.this) | composer.D(this.f120204b);
            WeeklyAdViewActivity weeklyAdViewActivity2 = WeeklyAdViewActivity.this;
            WeeklyAdPublication weeklyAdPublication = this.f120204b;
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
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Ta.z e(z1<? extends Ta.z> z1Var) {
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
        final /* synthetic */ ComponentActivity f120239f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f120239f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f120239f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f120240f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f120240f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f120240f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f120241f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f120242g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f120241f = function0;
            this.f120242g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f120241f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f120242g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.flipp.sfml.views.SourceImageView.d
    public Drawable A(Ta.b p02) {
        return null;
    }

    @Override // com.flipp.sfml.views.SourceImageView.e
    public void b0(View p02, Ta.w p12) {
    }

    @Override // com.flipp.sfml.views.SourceImageView.d
    public boolean u0(Ta.b p02) {
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("weekly ad");
        track.n("weekly ad");
        return Unit.f143329a;
    }

    @Override // com.flipp.sfml.views.SourceImageView.e
    public void V0(View view, Ta.w sourceArea) {
        Ta.b bVarI;
        if (sourceArea == null || (bVarI = sourceArea.i()) == null) {
            return;
        }
        u1().J(new o.f.FlyerClicked((int) bVarI.e()));
    }

    public final InterfaceC14523a getAnalyticsEngine() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final Bl.g getFeatureEntryPoint() {
        Bl.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.x("featureEntryPoint");
        return null;
    }

    public final Dl.e getMeijerIntent() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    public final Tq.j t1() {
        Tq.j jVar = this.storeProvider;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.x("storeProvider");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(WeeklyAdItem weeklyAdItem, WeeklyAdPublication weeklyAdPublication) {
        startActivity(getFeatureEntryPoint().C(weeklyAdItem.getItemId(), weeklyAdItem.getFlyerId(), weeklyAdPublication, weeklyAdItem.o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(boolean isYouTube, String url) {
        getAnalyticsEngine().b(C14756c.a("event: weekly ad: video start"), new Function1() { // from class: com.meijer.mobile.weeklyad.u
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
        this.storeFrontAnalyticsManager = new Ua.f();
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1845585485, true, new a(weeklyAdPublication)), 1, null);
        final Tq.k kVarH = t1().h();
        getAnalyticsEngine().b(C14756c.a("WeeklyAd Open"), new Function1() { // from class: com.meijer.mobile.weeklyad.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return WeeklyAdViewActivity.w1(kVarH, weeklyAdPublication, (TrackingData) obj2);
            }
        });
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        Ua.f fVar = this.storeFrontAnalyticsManager;
        if (fVar != null) {
            fVar.r(false);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        Ua.f fVar = this.storeFrontAnalyticsManager;
        if (fVar != null) {
            fVar.r(true);
        }
    }
}
