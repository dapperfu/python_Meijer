package c6;

import H1.h;
import P0.e;
import Q5.t;
import V0.C5346q0;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.W;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import b6.C6201a;
import b6.C6202b;
import j0.C14801J;
import kotlin.C13818q;
import kotlin.C17985y;
import kotlin.C6165d;
import kotlin.C6307U;
import kotlin.EnumC13827z;
import kotlin.InterfaceC6166e;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qv.InterfaceC16622O;
import r0.C16692i;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\r\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a*\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lc0/U;", "", "visibility", "La6/f;", "inAppMessageSettings", "La6/b;", "gestureTracker", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "", "onCreated", "Lkotlin/Function0;", "onDisposed", "a", "(Lc0/U;La6/f;La6/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "Landroid/app/Activity;", "c", "(Landroid/content/Context;)Landroid/app/Activity;", "LH1/d;", "density", "", "contentViewWidthPx", "LH1/h;", "d", "(LH1/d;ILa6/f;)F", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: c6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6368c {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    /* renamed from: c6.c$a */
    static final class a extends Lambda implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f61534f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f61535g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a6.f f61536h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<h> f61537i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ H1.d f61538j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<h> f61539k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ View f61540l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Float> f61541m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f61542n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Float> f61543o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f61544p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f61545q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f61546r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ a6.b f61547s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Float> f61548t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f61549u;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @SourceDebugExtension
        /* renamed from: c6.c$a$a, reason: collision with other inner class name */
        static final class C1210a extends Lambda implements Function1<LayoutCoordinates, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ a6.f f61550f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<h> f61551g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ H1.d f61552h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<h> f61553i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ View f61554j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1210a(a6.f fVar, InterfaceC5730l0<h> interfaceC5730l0, H1.d dVar, InterfaceC5730l0<h> interfaceC5730l02, View view) {
                super(1);
                this.f61550f = fVar;
                this.f61551g = interfaceC5730l0;
                this.f61552h = dVar;
                this.f61553i = interfaceC5730l02;
                this.f61554j = view;
            }

            public final void a(LayoutCoordinates it) {
                Intrinsics.j(it, "it");
                if (!this.f61550f.getFitToContent()) {
                    this.f61551g.setValue(h.l(h.p(h.p(this.f61552h.K(this.f61554j.getHeight()) * this.f61550f.getHeight()) / 100)));
                }
                this.f61553i.setValue(h.l(C6368c.d(this.f61552h, this.f61554j.getWidth(), this.f61550f)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                a(layoutCoordinates);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: c6.c$a$b */
        static final class b extends Lambda implements Function1<Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Float> f61555f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC5730l0<Float> interfaceC5730l0) {
                super(1);
                this.f61555f = interfaceC5730l0;
            }

            public final void b(float f10) {
                InterfaceC5730l0<Float> interfaceC5730l0 = this.f61555f;
                interfaceC5730l0.setValue(Float.valueOf(interfaceC5730l0.getValue().floatValue() + f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                b(f10.floatValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$3", f = "MessageFrame.kt", l = {}, m = "invokeSuspend")
        /* renamed from: c6.c$a$c, reason: collision with other inner class name */
        static final class C1211c extends SuspendLambda implements Function3<InterfaceC16622O, Float, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f61556a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ float f61557b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a6.b f61558c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Float> f61559d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Float> f61560e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Float> f61561f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1211c(a6.b bVar, InterfaceC5730l0<Float> interfaceC5730l0, InterfaceC5730l0<Float> interfaceC5730l02, InterfaceC5730l0<Float> interfaceC5730l03, Continuation<? super C1211c> continuation) {
                super(3, continuation);
                this.f61558c = bVar;
                this.f61559d = interfaceC5730l0;
                this.f61560e = interfaceC5730l02;
                this.f61561f = interfaceC5730l03;
            }

            public final Object d(InterfaceC16622O interfaceC16622O, float f10, Continuation<? super Unit> continuation) {
                C1211c c1211c = new C1211c(this.f61558c, this.f61559d, this.f61560e, this.f61561f, continuation);
                c1211c.f61557b = f10;
                return c1211c.invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Float f10, Continuation<? super Unit> continuation) {
                return d(interfaceC16622O, f10.floatValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f61556a == 0) {
                    ResultKt.b(obj);
                    this.f61558c.b(this.f61559d.getValue().floatValue(), this.f61560e.getValue().floatValue(), this.f61557b);
                    this.f61561f.setValue(Boxing.c(0.0f));
                    this.f61560e.setValue(Boxing.c(0.0f));
                    this.f61559d.setValue(Boxing.c(0.0f));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: c6.c$a$d */
        static final class d extends Lambda implements Function1<Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Float> f61562f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(InterfaceC5730l0<Float> interfaceC5730l0) {
                super(1);
                this.f61562f = interfaceC5730l0;
            }

            public final void b(float f10) {
                InterfaceC5730l0<Float> interfaceC5730l0 = this.f61562f;
                interfaceC5730l0.setValue(Float.valueOf(interfaceC5730l0.getValue().floatValue() + f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                b(f10.floatValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$5", f = "MessageFrame.kt", l = {}, m = "invokeSuspend")
        /* renamed from: c6.c$a$e */
        static final class e extends SuspendLambda implements Function3<InterfaceC16622O, Float, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f61563a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ float f61564b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a6.b f61565c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Float> f61566d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Float> f61567e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<Float> f61568f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(a6.b bVar, InterfaceC5730l0<Float> interfaceC5730l0, InterfaceC5730l0<Float> interfaceC5730l02, InterfaceC5730l0<Float> interfaceC5730l03, Continuation<? super e> continuation) {
                super(3, continuation);
                this.f61565c = bVar;
                this.f61566d = interfaceC5730l0;
                this.f61567e = interfaceC5730l02;
                this.f61568f = interfaceC5730l03;
            }

            public final Object d(InterfaceC16622O interfaceC16622O, float f10, Continuation<? super Unit> continuation) {
                e eVar = new e(this.f61565c, this.f61566d, this.f61567e, this.f61568f, continuation);
                eVar.f61564b = f10;
                return eVar.invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Float f10, Continuation<? super Unit> continuation) {
                return d(interfaceC16622O, f10.floatValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f61563a == 0) {
                    ResultKt.b(obj);
                    this.f61565c.b(this.f61566d.getValue().floatValue(), this.f61567e.getValue().floatValue(), this.f61564b);
                    this.f61568f.setValue(Boxing.c(0.0f));
                    this.f61567e.setValue(Boxing.c(0.0f));
                    this.f61566d.setValue(Boxing.c(0.0f));
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: c6.c$a$f */
        static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<h> f61569f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<h> f61570g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ a6.f f61571h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1<WebView, Unit> f61572i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f61573j;

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @SourceDebugExtension
            /* renamed from: c6.c$a$f$a, reason: collision with other inner class name */
            static final class C1212a extends Lambda implements Function1<String, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ a6.f f61574f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<h> f61575g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1212a(a6.f fVar, InterfaceC5730l0<h> interfaceC5730l0) {
                    super(1);
                    this.f61574f = fVar;
                    this.f61575g = interfaceC5730l0;
                }

                public final void a(String str) {
                    Unit unit;
                    Integer numV;
                    if (this.f61574f.getFitToContent()) {
                        if (str == null || (numV = StringsKt.v(str)) == null) {
                            unit = null;
                        } else {
                            this.f61575g.setValue(h.l(h.p(numV.intValue())));
                            unit = Unit.f142422a;
                        }
                        if (unit == null) {
                            t.f("Services", "MessageFrame", "Invalid height value received: " + str, new Object[0]);
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    a(str);
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            f(InterfaceC5730l0<h> interfaceC5730l0, InterfaceC5730l0<h> interfaceC5730l02, a6.f fVar, Function1<? super WebView, Unit> function1, int i10) {
                super(2);
                this.f61569f = interfaceC5730l0;
                this.f61570g = interfaceC5730l02;
                this.f61571h = fVar;
                this.f61572i = function1;
                this.f61573j = i10;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-582408732, i10, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageFrame.<anonymous>.<anonymous>.<anonymous> (MessageFrame.kt:180)");
                }
                Modifier modifierZ = J.z(J.i(Modifier.INSTANCE, this.f61569f.getValue().getValue()), this.f61570g.getValue().getValue());
                a6.f fVar = this.f61571h;
                C6367b.a(modifierZ, fVar, new C1212a(fVar, this.f61569f), this.f61572i, composer, (this.f61573j & 7168) | 64);
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

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @SourceDebugExtension
        /* renamed from: c6.c$a$g */
        static final class g extends Lambda implements Function1<F, E> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f61576f;

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"c6/c$a$g$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            @SourceDebugExtension
            /* renamed from: c6.c$a$g$a, reason: collision with other inner class name */
            public static final class C1213a implements E {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function0 f61577a;

                public C1213a(Function0 function0) {
                    this.f61577a = function0;
                }

                @Override // androidx.compose.runtime.E
                public void dispose() {
                    this.f61577a.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(Function0<Unit> function0) {
                super(1);
                this.f61576f = function0;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E invoke(F DisposableEffect) {
                Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
                return new C1213a(this.f61576f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(float f10, float f11, a6.f fVar, InterfaceC5730l0<h> interfaceC5730l0, H1.d dVar, InterfaceC5730l0<h> interfaceC5730l02, View view, InterfaceC5730l0<Float> interfaceC5730l03, boolean z10, InterfaceC5730l0<Float> interfaceC5730l04, Function0<Unit> function0, int i10, boolean z11, a6.b bVar, InterfaceC5730l0<Float> interfaceC5730l05, Function1<? super WebView, Unit> function1) {
            super(3);
            this.f61534f = f10;
            this.f61535g = f11;
            this.f61536h = fVar;
            this.f61537i = interfaceC5730l0;
            this.f61538j = dVar;
            this.f61539k = interfaceC5730l02;
            this.f61540l = view;
            this.f61541m = interfaceC5730l03;
            this.f61542n = z10;
            this.f61543o = interfaceC5730l04;
            this.f61544p = function0;
            this.f61545q = i10;
            this.f61546r = z11;
            this.f61547s = bVar;
            this.f61548t = interfaceC5730l05;
            this.f61549u = function1;
        }

        public final void a(InterfaceC6166e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-813844469, i10, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageFrame.<anonymous> (MessageFrame.kt:116)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierB = A.b(W.a(J.f(companion, 0.0f, 1, null), new C1210a(this.f61536h, this.f61537i, this.f61538j, this.f61539k, this.f61540l)), this.f61534f, this.f61535g);
            C5346q0.Companion companion2 = C5346q0.INSTANCE;
            Modifier modifierA = F1.a(androidx.compose.foundation.b.d(modifierB, companion2.i(), null, 2, null), "messageFrame");
            C5658d.e eVarA = b6.c.f59944a.a(this.f61536h.getHorizontalAlignment());
            e.c cVarA = C6201a.f59925a.a(this.f61536h.getVerticalAlignment());
            a6.f fVar = this.f61536h;
            InterfaceC5730l0<Float> interfaceC5730l0 = this.f61541m;
            boolean z10 = this.f61542n;
            InterfaceC5730l0<Float> interfaceC5730l02 = this.f61543o;
            Function0<Unit> function0 = this.f61544p;
            int i11 = this.f61545q;
            boolean z11 = this.f61546r;
            a6.b bVar = this.f61547s;
            InterfaceC5730l0<Float> interfaceC5730l03 = this.f61548t;
            InterfaceC5730l0<h> interfaceC5730l04 = this.f61537i;
            InterfaceC5730l0<h> interfaceC5730l05 = this.f61539k;
            Function1<WebView, Unit> function1 = this.f61549u;
            composer.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(eVarA, cVarA, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composer.o(C5892t0.g());
            H1.t tVar = (H1.t) composer.o(C5892t0.m());
            Q1 q12 = (Q1) composer.o(C5892t0.t());
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = androidx.compose.ui.layout.A.c(modifierA);
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            composer.G();
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, dVar, companion3.c());
            D1.c(composerA, tVar, companion3.d());
            D1.c(composerA, q12, companion3.h());
            composer.c();
            function3C.invoke(V0.a(V0.b(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            C14801J c14801j = C14801J.f139030a;
            long jI = companion2.i();
            float fP = h.p(0);
            Modifier modifierA2 = T0.e.a(companion, C16692i.c(h.p(fVar.getCornerRadius())));
            if (z11) {
                modifierA2 = T0.a.a(modifierA2, 0.99f);
            }
            composer.startReplaceableGroup(1157296644);
            boolean zV = composer.V(interfaceC5730l0);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new b(interfaceC5730l0);
                composer.t(objB);
            }
            composer.U();
            Modifier modifierH = C13818q.h(modifierA2, C13818q.i((Function1) objB, composer, 0), EnumC13827z.f130586b, z10, null, false, null, new C1211c(bVar, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, null), false, 184, null);
            composer.startReplaceableGroup(1157296644);
            boolean zV2 = composer.V(interfaceC5730l02);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new d(interfaceC5730l02);
                composer.t(objB2);
            }
            composer.U();
            C17985y.a(C13818q.h(modifierH, C13818q.i((Function1) objB2, composer, 0), EnumC13827z.f130585a, z10, null, false, null, new e(bVar, interfaceC5730l0, interfaceC5730l02, interfaceC5730l03, null), false, 184, null), null, jI, 0L, null, fP, ComposableLambdaKt.composableLambda(composer, -582408732, true, new f(interfaceC5730l04, interfaceC5730l05, fVar, function1, i11)), composer, 1769856, 26);
            Unit unit = Unit.f142422a;
            composer.startReplaceableGroup(1157296644);
            boolean zV3 = composer.V(function0);
            Object objB3 = composer.B();
            if (zV3 || objB3 == Composer.INSTANCE.a()) {
                objB3 = new g(function0);
                composer.t(objB3);
            }
            composer.U();
            androidx.compose.runtime.J.c(unit, (Function1) objB3, composer, 6);
            composer.U();
            composer.v();
            composer.U();
            composer.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
            a(interfaceC6166e, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: c6.c$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6307U<Boolean> f61578f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a6.f f61579g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a6.b f61580h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f61581i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f61582j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f61583k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C6307U<Boolean> c6307u, a6.f fVar, a6.b bVar, Function1<? super WebView, Unit> function1, Function0<Unit> function0, int i10) {
            super(2);
            this.f61578f = c6307u;
            this.f61579g = fVar;
            this.f61580h = bVar;
            this.f61581i = function1;
            this.f61582j = function0;
            this.f61583k = i10;
        }

        public final void a(Composer composer, int i10) {
            C6368c.a(this.f61578f, this.f61579g, this.f61580h, this.f61581i, this.f61582j, composer, J0.a(this.f61583k | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: c6.c$c, reason: collision with other inner class name */
    static final class C1214c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6307U<Boolean> f61584f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ a6.f f61585g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a6.b f61586h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f61587i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f61588j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f61589k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C1214c(C6307U<Boolean> c6307u, a6.f fVar, a6.b bVar, Function1<? super WebView, Unit> function1, Function0<Unit> function0, int i10) {
            super(2);
            this.f61584f = c6307u;
            this.f61585g = fVar;
            this.f61586h = bVar;
            this.f61587i = function1;
            this.f61588j = function0;
            this.f61589k = i10;
        }

        public final void a(Composer composer, int i10) {
            C6368c.a(this.f61584f, this.f61585g, this.f61586h, this.f61587i, this.f61588j, composer, J0.a(this.f61589k | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(C6307U<Boolean> visibility, a6.f inAppMessageSettings, a6.b gestureTracker, Function1<? super WebView, Unit> onCreated, Function0<Unit> onDisposed, Composer composer, int i10) {
        Float fValueOf = Float.valueOf(0.0f);
        Intrinsics.j(visibility, "visibility");
        Intrinsics.j(inAppMessageSettings, "inAppMessageSettings");
        Intrinsics.j(gestureTracker, "gestureTracker");
        Intrinsics.j(onCreated, "onCreated");
        Intrinsics.j(onDisposed, "onDisposed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1004155363);
        if (ComposerKt.M()) {
            ComposerKt.U(1004155363, i10, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageFrame (MessageFrame.kt:65)");
        }
        Activity activityC = c((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()));
        if (activityC == null) {
            onDisposed.invoke();
            t.a("Services", "MessageFrame", "Unable to get the current activity. Dismissing the message.", new Object[0]);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            T0 t0L = composerStartRestartGroup.l();
            if (t0L == null) {
                return;
            }
            t0L.a(new C1214c(visibility, inAppMessageSettings, gestureTracker, onCreated, onDisposed, i10));
            return;
        }
        H1.d dVar = (H1.d) composerStartRestartGroup.o(C5892t0.g());
        View viewFindViewById = activityC.findViewById(R.id.content);
        float fK = dVar.K(viewFindViewById.getHeight());
        float fK2 = dVar.K(viewFindViewById.getWidth());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB = composerStartRestartGroup.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = t1.e(h.l(h.p(h.p(inAppMessageSettings.getHeight() * fK) / 100)), null, 2, null);
            composerStartRestartGroup.t(objB);
        }
        composerStartRestartGroup.U();
        InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB2 = composerStartRestartGroup.B();
        if (objB2 == companion.a()) {
            objB2 = t1.e(h.l(d(dVar, viewFindViewById.getWidth(), inAppMessageSettings)), null, 2, null);
            composerStartRestartGroup.t(objB2);
        }
        composerStartRestartGroup.U();
        InterfaceC5730l0 interfaceC5730l02 = (InterfaceC5730l0) objB2;
        b6.d dVar2 = b6.d.f59947a;
        float fA = dVar2.a(inAppMessageSettings.getHorizontalAlignment(), inAppMessageSettings.getHorizontalInset(), fK2);
        float fB = dVar2.b(inAppMessageSettings.getVerticalAlignment(), inAppMessageSettings.getVerticalInset(), fK);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB3 = composerStartRestartGroup.B();
        if (objB3 == companion.a()) {
            objB3 = Boolean.valueOf(!inAppMessageSettings.i().isEmpty());
            composerStartRestartGroup.t(objB3);
        }
        composerStartRestartGroup.U();
        boolean zBooleanValue = ((Boolean) objB3).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB4 = composerStartRestartGroup.B();
        if (objB4 == companion.a()) {
            objB4 = t1.e(fValueOf, null, 2, null);
            composerStartRestartGroup.t(objB4);
        }
        composerStartRestartGroup.U();
        InterfaceC5730l0 interfaceC5730l03 = (InterfaceC5730l0) objB4;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB5 = composerStartRestartGroup.B();
        if (objB5 == companion.a()) {
            objB5 = t1.e(fValueOf, null, 2, null);
            composerStartRestartGroup.t(objB5);
        }
        composerStartRestartGroup.U();
        InterfaceC5730l0 interfaceC5730l04 = (InterfaceC5730l0) objB5;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB6 = composerStartRestartGroup.B();
        if (objB6 == companion.a()) {
            objB6 = t1.e(fValueOf, null, 2, null);
            composerStartRestartGroup.t(objB6);
        }
        composerStartRestartGroup.U();
        InterfaceC5730l0 interfaceC5730l05 = (InterfaceC5730l0) objB6;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB7 = composerStartRestartGroup.B();
        if (objB7 == companion.a()) {
            objB7 = false;
            composerStartRestartGroup.t(objB7);
        }
        composerStartRestartGroup.U();
        C6165d.d(visibility, null, C6202b.f59928a.a(inAppMessageSettings.getDisplayAnimation()), gestureTracker.getCurrentExitTransition(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -813844469, true, new a(fA, fB, inAppMessageSettings, interfaceC5730l0, dVar, interfaceC5730l02, viewFindViewById, interfaceC5730l03, zBooleanValue, interfaceC5730l04, onDisposed, i10, ((Boolean) objB7).booleanValue(), gestureTracker, interfaceC5730l05, onCreated)), composerStartRestartGroup, 196608 | C6307U.f60956d | (i10 & 14), 18);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L2 = composerStartRestartGroup.l();
        if (t0L2 == null) {
            return;
        }
        t0L2.a(new b(visibility, inAppMessageSettings, gestureTracker, onCreated, onDisposed, i10));
    }

    private static final Activity c(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.i(context, "context.baseContext");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(H1.d dVar, int i10, a6.f fVar) {
        return dVar.K(Math.min((i10 * fVar.getWidth()) / 100, fVar.getMaxWidth()));
    }
}
