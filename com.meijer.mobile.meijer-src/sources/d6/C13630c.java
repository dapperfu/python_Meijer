package d6;

import H1.h;
import P0.e;
import R5.t;
import V0.C5489q0;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.W;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import c6.C6488a;
import c6.C6489b;
import j0.C14889J;
import kotlin.C13928q;
import kotlin.C18051y;
import kotlin.C6304d;
import kotlin.C6433U;
import kotlin.EnumC13937z;
import kotlin.InterfaceC6305e;
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
import mv.InterfaceC15783O;
import r0.C16806i;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\r\u001a\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a*\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lc0/U;", "", "visibility", "Lb6/f;", "inAppMessageSettings", "Lb6/b;", "gestureTracker", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "", "onCreated", "Lkotlin/Function0;", "onDisposed", "a", "(Lc0/U;Lb6/f;Lb6/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroid/content/Context;", "Landroid/app/Activity;", "c", "(Landroid/content/Context;)Landroid/app/Activity;", "LH1/d;", "density", "", "contentViewWidthPx", "LH1/h;", "d", "(LH1/d;ILb6/f;)F", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: d6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13630c {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    /* renamed from: d6.c$a */
    static final class a extends Lambda implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f128101f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f128102g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b6.f f128103h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<h> f128104i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ H1.d f128105j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<h> f128106k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ View f128107l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Float> f128108m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f128109n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Float> f128110o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f128111p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f128112q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ boolean f128113r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ b6.b f128114s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Float> f128115t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f128116u;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @SourceDebugExtension
        /* renamed from: d6.c$a$a, reason: collision with other inner class name */
        static final class C2009a extends Lambda implements Function1<LayoutCoordinates, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b6.f f128117f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<h> f128118g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ H1.d f128119h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<h> f128120i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ View f128121j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2009a(b6.f fVar, InterfaceC5872l0<h> interfaceC5872l0, H1.d dVar, InterfaceC5872l0<h> interfaceC5872l02, View view) {
                super(1);
                this.f128117f = fVar;
                this.f128118g = interfaceC5872l0;
                this.f128119h = dVar;
                this.f128120i = interfaceC5872l02;
                this.f128121j = view;
            }

            public final void a(LayoutCoordinates it) {
                Intrinsics.j(it, "it");
                if (!this.f128117f.getFitToContent()) {
                    this.f128118g.setValue(h.l(h.p(h.p(this.f128119h.K(this.f128121j.getHeight()) * this.f128117f.getHeight()) / 100)));
                }
                this.f128120i.setValue(h.l(C13630c.d(this.f128119h, this.f128121j.getWidth(), this.f128117f)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                a(layoutCoordinates);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: d6.c$a$b */
        static final class b extends Lambda implements Function1<Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Float> f128122f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC5872l0<Float> interfaceC5872l0) {
                super(1);
                this.f128122f = interfaceC5872l0;
            }

            public final void b(float f10) {
                InterfaceC5872l0<Float> interfaceC5872l0 = this.f128122f;
                interfaceC5872l0.setValue(Float.valueOf(interfaceC5872l0.getValue().floatValue() + f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                b(f10.floatValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$3", f = "MessageFrame.kt", l = {}, m = "invokeSuspend")
        /* renamed from: d6.c$a$c, reason: collision with other inner class name */
        static final class C2010c extends SuspendLambda implements Function3<InterfaceC15783O, Float, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f128123a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ float f128124b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b6.b f128125c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Float> f128126d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Float> f128127e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Float> f128128f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2010c(b6.b bVar, InterfaceC5872l0<Float> interfaceC5872l0, InterfaceC5872l0<Float> interfaceC5872l02, InterfaceC5872l0<Float> interfaceC5872l03, Continuation<? super C2010c> continuation) {
                super(3, continuation);
                this.f128125c = bVar;
                this.f128126d = interfaceC5872l0;
                this.f128127e = interfaceC5872l02;
                this.f128128f = interfaceC5872l03;
            }

            public final Object d(InterfaceC15783O interfaceC15783O, float f10, Continuation<? super Unit> continuation) {
                C2010c c2010c = new C2010c(this.f128125c, this.f128126d, this.f128127e, this.f128128f, continuation);
                c2010c.f128124b = f10;
                return c2010c.invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Float f10, Continuation<? super Unit> continuation) {
                return d(interfaceC15783O, f10.floatValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f128123a == 0) {
                    ResultKt.b(obj);
                    this.f128125c.b(this.f128126d.getValue().floatValue(), this.f128127e.getValue().floatValue(), this.f128124b);
                    this.f128128f.setValue(Boxing.c(0.0f));
                    this.f128127e.setValue(Boxing.c(0.0f));
                    this.f128126d.setValue(Boxing.c(0.0f));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: d6.c$a$d */
        static final class d extends Lambda implements Function1<Float, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Float> f128129f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(InterfaceC5872l0<Float> interfaceC5872l0) {
                super(1);
                this.f128129f = interfaceC5872l0;
            }

            public final void b(float f10) {
                InterfaceC5872l0<Float> interfaceC5872l0 = this.f128129f;
                interfaceC5872l0.setValue(Float.valueOf(interfaceC5872l0.getValue().floatValue() + f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f10) {
                b(f10.floatValue());
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.message.views.MessageFrameKt$MessageFrame$1$2$5", f = "MessageFrame.kt", l = {}, m = "invokeSuspend")
        /* renamed from: d6.c$a$e */
        static final class e extends SuspendLambda implements Function3<InterfaceC15783O, Float, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f128130a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ float f128131b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b6.b f128132c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Float> f128133d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Float> f128134e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Float> f128135f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(b6.b bVar, InterfaceC5872l0<Float> interfaceC5872l0, InterfaceC5872l0<Float> interfaceC5872l02, InterfaceC5872l0<Float> interfaceC5872l03, Continuation<? super e> continuation) {
                super(3, continuation);
                this.f128132c = bVar;
                this.f128133d = interfaceC5872l0;
                this.f128134e = interfaceC5872l02;
                this.f128135f = interfaceC5872l03;
            }

            public final Object d(InterfaceC15783O interfaceC15783O, float f10, Continuation<? super Unit> continuation) {
                e eVar = new e(this.f128132c, this.f128133d, this.f128134e, this.f128135f, continuation);
                eVar.f128131b = f10;
                return eVar.invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Float f10, Continuation<? super Unit> continuation) {
                return d(interfaceC15783O, f10.floatValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f128130a == 0) {
                    ResultKt.b(obj);
                    this.f128132c.b(this.f128133d.getValue().floatValue(), this.f128134e.getValue().floatValue(), this.f128131b);
                    this.f128135f.setValue(Boxing.c(0.0f));
                    this.f128134e.setValue(Boxing.c(0.0f));
                    this.f128133d.setValue(Boxing.c(0.0f));
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: d6.c$a$f */
        static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<h> f128136f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<h> f128137g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ b6.f f128138h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1<WebView, Unit> f128139i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ int f128140j;

            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @SourceDebugExtension
            /* renamed from: d6.c$a$f$a, reason: collision with other inner class name */
            static final class C2011a extends Lambda implements Function1<String, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ b6.f f128141f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<h> f128142g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2011a(b6.f fVar, InterfaceC5872l0<h> interfaceC5872l0) {
                    super(1);
                    this.f128141f = fVar;
                    this.f128142g = interfaceC5872l0;
                }

                public final void a(String str) {
                    Unit unit;
                    Integer numV;
                    if (this.f128141f.getFitToContent()) {
                        if (str == null || (numV = StringsKt.v(str)) == null) {
                            unit = null;
                        } else {
                            this.f128142g.setValue(h.l(h.p(numV.intValue())));
                            unit = Unit.f143329a;
                        }
                        if (unit == null) {
                            t.f("Services", "MessageFrame", "Invalid height value received: " + str, new Object[0]);
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    a(str);
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            f(InterfaceC5872l0<h> interfaceC5872l0, InterfaceC5872l0<h> interfaceC5872l02, b6.f fVar, Function1<? super WebView, Unit> function1, int i10) {
                super(2);
                this.f128136f = interfaceC5872l0;
                this.f128137g = interfaceC5872l02;
                this.f128138h = fVar;
                this.f128139i = function1;
                this.f128140j = i10;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-582408732, i10, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageFrame.<anonymous>.<anonymous>.<anonymous> (MessageFrame.kt:180)");
                }
                Modifier modifierZ = J.z(J.i(Modifier.INSTANCE, this.f128136f.getValue().getValue()), this.f128137g.getValue().getValue());
                b6.f fVar = this.f128138h;
                C13629b.a(modifierZ, fVar, new C2011a(fVar, this.f128136f), this.f128139i, composer, (this.f128140j & 7168) | 64);
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

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @SourceDebugExtension
        /* renamed from: d6.c$a$g */
        static final class g extends Lambda implements Function1<F, E> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f128143f;

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"d6/c$a$g$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
            @SourceDebugExtension
            /* renamed from: d6.c$a$g$a, reason: collision with other inner class name */
            public static final class C2012a implements E {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function0 f128144a;

                public C2012a(Function0 function0) {
                    this.f128144a = function0;
                }

                @Override // androidx.compose.runtime.E
                public void dispose() {
                    this.f128144a.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(Function0<Unit> function0) {
                super(1);
                this.f128143f = function0;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E invoke(F DisposableEffect) {
                Intrinsics.j(DisposableEffect, "$this$DisposableEffect");
                return new C2012a(this.f128143f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(float f10, float f11, b6.f fVar, InterfaceC5872l0<h> interfaceC5872l0, H1.d dVar, InterfaceC5872l0<h> interfaceC5872l02, View view, InterfaceC5872l0<Float> interfaceC5872l03, boolean z10, InterfaceC5872l0<Float> interfaceC5872l04, Function0<Unit> function0, int i10, boolean z11, b6.b bVar, InterfaceC5872l0<Float> interfaceC5872l05, Function1<? super WebView, Unit> function1) {
            super(3);
            this.f128101f = f10;
            this.f128102g = f11;
            this.f128103h = fVar;
            this.f128104i = interfaceC5872l0;
            this.f128105j = dVar;
            this.f128106k = interfaceC5872l02;
            this.f128107l = view;
            this.f128108m = interfaceC5872l03;
            this.f128109n = z10;
            this.f128110o = interfaceC5872l04;
            this.f128111p = function0;
            this.f128112q = i10;
            this.f128113r = z11;
            this.f128114s = bVar;
            this.f128115t = interfaceC5872l05;
            this.f128116u = function1;
        }

        public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-813844469, i10, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageFrame.<anonymous> (MessageFrame.kt:116)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierB = A.b(W.a(J.f(companion, 0.0f, 1, null), new C2009a(this.f128103h, this.f128104i, this.f128105j, this.f128106k, this.f128107l)), this.f128101f, this.f128102g);
            C5489q0.Companion companion2 = C5489q0.INSTANCE;
            Modifier modifierA = F1.a(androidx.compose.foundation.b.d(modifierB, companion2.i(), null, 2, null), "messageFrame");
            C5800d.e eVarA = c6.c.f61431a.a(this.f128103h.getHorizontalAlignment());
            e.c cVarA = C6488a.f61412a.a(this.f128103h.getVerticalAlignment());
            b6.f fVar = this.f128103h;
            InterfaceC5872l0<Float> interfaceC5872l0 = this.f128108m;
            boolean z10 = this.f128109n;
            InterfaceC5872l0<Float> interfaceC5872l02 = this.f128110o;
            Function0<Unit> function0 = this.f128111p;
            int i11 = this.f128112q;
            boolean z11 = this.f128113r;
            b6.b bVar = this.f128114s;
            InterfaceC5872l0<Float> interfaceC5872l03 = this.f128115t;
            InterfaceC5872l0<h> interfaceC5872l04 = this.f128104i;
            InterfaceC5872l0<h> interfaceC5872l05 = this.f128106k;
            Function1<WebView, Unit> function1 = this.f128116u;
            composer.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(eVarA, cVarA, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composer.o(C6034t0.g());
            H1.t tVar = (H1.t) composer.o(C6034t0.m());
            Q1 q12 = (Q1) composer.o(C6034t0.t());
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C = androidx.compose.ui.layout.A.c(modifierA);
            if (composer.k() == null) {
                C5859f.c();
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
            C14889J c14889j = C14889J.f139620a;
            long jI = companion2.i();
            float fP = h.p(0);
            Modifier modifierA2 = T0.e.a(companion, C16806i.c(h.p(fVar.getCornerRadius())));
            if (z11) {
                modifierA2 = T0.a.a(modifierA2, 0.99f);
            }
            composer.startReplaceableGroup(1157296644);
            boolean zV = composer.V(interfaceC5872l0);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new b(interfaceC5872l0);
                composer.t(objB);
            }
            composer.U();
            Modifier modifierH = C13928q.h(modifierA2, C13928q.i((Function1) objB, composer, 0), EnumC13937z.f131420b, z10, null, false, null, new C2010c(bVar, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, null), false, 184, null);
            composer.startReplaceableGroup(1157296644);
            boolean zV2 = composer.V(interfaceC5872l02);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new d(interfaceC5872l02);
                composer.t(objB2);
            }
            composer.U();
            C18051y.a(C13928q.h(modifierH, C13928q.i((Function1) objB2, composer, 0), EnumC13937z.f131419a, z10, null, false, null, new e(bVar, interfaceC5872l0, interfaceC5872l02, interfaceC5872l03, null), false, 184, null), null, jI, 0L, null, fP, ComposableLambdaKt.composableLambda(composer, -582408732, true, new f(interfaceC5872l04, interfaceC5872l05, fVar, function1, i11)), composer, 1769856, 26);
            Unit unit = Unit.f143329a;
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
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            a(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: d6.c$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6433U<Boolean> f128145f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b6.f f128146g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b6.b f128147h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f128148i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f128149j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f128150k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C6433U<Boolean> c6433u, b6.f fVar, b6.b bVar, Function1<? super WebView, Unit> function1, Function0<Unit> function0, int i10) {
            super(2);
            this.f128145f = c6433u;
            this.f128146g = fVar;
            this.f128147h = bVar;
            this.f128148i = function1;
            this.f128149j = function0;
            this.f128150k = i10;
        }

        public final void a(Composer composer, int i10) {
            C13630c.a(this.f128145f, this.f128146g, this.f128147h, this.f128148i, this.f128149j, composer, J0.a(this.f128150k | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: d6.c$c, reason: collision with other inner class name */
    static final class C2013c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6433U<Boolean> f128151f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b6.f f128152g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b6.b f128153h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f128154i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f128155j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f128156k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2013c(C6433U<Boolean> c6433u, b6.f fVar, b6.b bVar, Function1<? super WebView, Unit> function1, Function0<Unit> function0, int i10) {
            super(2);
            this.f128151f = c6433u;
            this.f128152g = fVar;
            this.f128153h = bVar;
            this.f128154i = function1;
            this.f128155j = function0;
            this.f128156k = i10;
        }

        public final void a(Composer composer, int i10) {
            C13630c.a(this.f128151f, this.f128152g, this.f128153h, this.f128154i, this.f128155j, composer, J0.a(this.f128156k | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(C6433U<Boolean> visibility, b6.f inAppMessageSettings, b6.b gestureTracker, Function1<? super WebView, Unit> onCreated, Function0<Unit> onDisposed, Composer composer, int i10) {
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
            t0L.a(new C2013c(visibility, inAppMessageSettings, gestureTracker, onCreated, onDisposed, i10));
            return;
        }
        H1.d dVar = (H1.d) composerStartRestartGroup.o(C6034t0.g());
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
        InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB2 = composerStartRestartGroup.B();
        if (objB2 == companion.a()) {
            objB2 = t1.e(h.l(d(dVar, viewFindViewById.getWidth(), inAppMessageSettings)), null, 2, null);
            composerStartRestartGroup.t(objB2);
        }
        composerStartRestartGroup.U();
        InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) objB2;
        c6.d dVar2 = c6.d.f61434a;
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
        InterfaceC5872l0 interfaceC5872l03 = (InterfaceC5872l0) objB4;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB5 = composerStartRestartGroup.B();
        if (objB5 == companion.a()) {
            objB5 = t1.e(fValueOf, null, 2, null);
            composerStartRestartGroup.t(objB5);
        }
        composerStartRestartGroup.U();
        InterfaceC5872l0 interfaceC5872l04 = (InterfaceC5872l0) objB5;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB6 = composerStartRestartGroup.B();
        if (objB6 == companion.a()) {
            objB6 = t1.e(fValueOf, null, 2, null);
            composerStartRestartGroup.t(objB6);
        }
        composerStartRestartGroup.U();
        InterfaceC5872l0 interfaceC5872l05 = (InterfaceC5872l0) objB6;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB7 = composerStartRestartGroup.B();
        if (objB7 == companion.a()) {
            objB7 = false;
            composerStartRestartGroup.t(objB7);
        }
        composerStartRestartGroup.U();
        C6304d.d(visibility, null, C6489b.f61415a.a(inAppMessageSettings.getDisplayAnimation()), gestureTracker.getCurrentExitTransition(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -813844469, true, new a(fA, fB, inAppMessageSettings, interfaceC5872l0, dVar, interfaceC5872l02, viewFindViewById, interfaceC5872l03, zBooleanValue, interfaceC5872l04, onDisposed, i10, ((Boolean) objB7).booleanValue(), gestureTracker, interfaceC5872l05, onCreated)), composerStartRestartGroup, 196608 | C6433U.f60755d | (i10 & 14), 18);
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
    public static final float d(H1.d dVar, int i10, b6.f fVar) {
        return dVar.K(Math.min((i10 * fVar.getWidth()) / 100, fVar.getMaxWidth()));
    }
}
