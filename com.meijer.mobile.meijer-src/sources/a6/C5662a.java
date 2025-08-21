package a6;

import H1.h;
import H1.n;
import H1.o;
import H1.t;
import U0.f;
import U0.g;
import V0.C5489q0;
import V0.InterfaceC5459f1;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import d0.C13590y;
import g1.J;
import g1.PointerInputChange;
import g1.U;
import g1.r;
import kotlin.C13924m;
import kotlin.C18042t0;
import kotlin.C18048w0;
import kotlin.InterfaceC18044u0;
import kotlin.Metadata;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import r0.C16806i;
import r0.RoundedCornerShape;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"LZ5/d;", "settings", "Landroidx/compose/runtime/z1;", "LV0/f1;", "graphic", "LU0/f;", "offset", "Lkotlin/Function0;", "", "onClick", "Lkotlin/Function1;", "onDragFinished", "a", "(LZ5/d;Landroidx/compose/runtime/z1;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5662a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: a6.a$a, reason: collision with other inner class name */
    static final class C0942a extends Lambda implements Function1<H1.d, n> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<f> f45228f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0942a(InterfaceC5872l0<f> interfaceC5872l0) {
            super(1);
            this.f45228f = interfaceC5872l0;
        }

        public final long a(H1.d offset) {
            Intrinsics.j(offset, "$this$offset");
            return o.a(MathKt.d(f.m(this.f45228f.getValue().getPackedValue())), MathKt.d(f.n(this.f45228f.getValue().getPackedValue())));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ n invoke(H1.d dVar) {
            return n.c(a(dVar));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1", f = "FloatingButton.kt", l = {109}, m = "invokeSuspend")
    /* renamed from: a6.a$b */
    static final class b extends SuspendLambda implements Function2<J, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f45229a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f45230b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<f, Unit> f45231c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<f> f45232d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<h> f45233e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f45234f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<h> f45235g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f45236h;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: a6.a$b$a, reason: collision with other inner class name */
        static final class C0943a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1<f, Unit> f45237f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<f> f45238g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0943a(Function1<? super f, Unit> function1, InterfaceC5872l0<f> interfaceC5872l0) {
                super(0);
                this.f45237f = function1;
                this.f45238g = interfaceC5872l0;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f45237f.invoke(this.f45238g.getValue());
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @SourceDebugExtension
        /* renamed from: a6.a$b$b, reason: collision with other inner class name */
        static final class C0944b extends Lambda implements Function2<PointerInputChange, f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<f> f45239f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ J f45240g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<h> f45241h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ float f45242i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<h> f45243j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ float f45244k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0944b(InterfaceC5872l0<f> interfaceC5872l0, J j10, InterfaceC5872l0<h> interfaceC5872l02, float f10, InterfaceC5872l0<h> interfaceC5872l03, float f11) {
                super(2);
                this.f45239f = interfaceC5872l0;
                this.f45240g = j10;
                this.f45241h = interfaceC5872l02;
                this.f45242i = f10;
                this.f45243j = interfaceC5872l03;
                this.f45244k = f11;
            }

            public final void a(PointerInputChange change, long j10) {
                Intrinsics.j(change, "change");
                r.e(change);
                this.f45239f.setValue(f.d(g.a(RangesKt.n(f.m(this.f45239f.getValue().getPackedValue()) + f.m(j10), 0.0f, this.f45240g.I1(h.p(this.f45241h.getValue().getValue() - this.f45242i))), RangesKt.n(f.n(this.f45239f.getValue().getPackedValue()) + f.n(j10), 0.0f, this.f45240g.I1(h.p(this.f45243j.getValue().getValue() - this.f45244k))))));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, f fVar) {
                a(pointerInputChange, fVar.getPackedValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super f, Unit> function1, InterfaceC5872l0<f> interfaceC5872l0, InterfaceC5872l0<h> interfaceC5872l02, float f10, InterfaceC5872l0<h> interfaceC5872l03, float f11, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f45231c = function1;
            this.f45232d = interfaceC5872l0;
            this.f45233e = interfaceC5872l02;
            this.f45234f = f10;
            this.f45235g = interfaceC5872l03;
            this.f45236h = f11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f45231c, this.f45232d, this.f45233e, this.f45234f, this.f45235g, this.f45236h, continuation);
            bVar.f45230b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            return ((b) create(j10, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f45229a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                J j10 = (J) this.f45230b;
                C0943a c0943a = new C0943a(this.f45231c, this.f45232d);
                C0944b c0944b = new C0944b(this.f45232d, j10, this.f45233e, this.f45234f, this.f45235g, this.f45236h);
                this.f45229a = 1;
                if (C13924m.g(j10, null, c0943a, null, c0944b, this, 5, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: a6.a$c */
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f45245f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0<Unit> function0) {
            super(0);
            this.f45245f = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f45245f.invoke();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: a6.a$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<InterfaceC5459f1> f45246f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(z1<? extends InterfaceC5459f1> z1Var) {
            super(2);
            this.f45246f = z1Var;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1818417068, i10, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButton.<anonymous>.<anonymous> (FloatingButton.kt:135)");
            }
            C13590y.b(this.f45246f.getValue(), "Floating Button", F1.a(androidx.compose.foundation.layout.J.F(androidx.compose.foundation.b.d(Modifier.INSTANCE, C5489q0.INSTANCE.i(), null, 2, null), null, false, 3, null), "floatingButtonGraphic"), null, null, 0.0f, null, 0, composer, 56, 248);
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
    /* renamed from: a6.a$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Z5.d f45247f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<InterfaceC5459f1> f45248g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f45249h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f45250i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<f, Unit> f45251j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f45252k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f45253l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Z5.d dVar, z1<? extends InterfaceC5459f1> z1Var, long j10, Function0<Unit> function0, Function1<? super f, Unit> function1, int i10, int i11) {
            super(2);
            this.f45247f = dVar;
            this.f45248g = z1Var;
            this.f45249h = j10;
            this.f45250i = function0;
            this.f45251j = function1;
            this.f45252k = i10;
            this.f45253l = i11;
        }

        public final void a(Composer composer, int i10) {
            C5662a.a(this.f45247f, this.f45248g, this.f45249h, this.f45250i, this.f45251j, composer, J0.a(this.f45252k | 1), this.f45253l);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(Z5.d settings, z1<? extends InterfaceC5459f1> graphic, long j10, Function0<Unit> onClick, Function1<? super f, Unit> onDragFinished, Composer composer, int i10, int i11) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(graphic, "graphic");
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(onDragFinished, "onDragFinished");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1368059556);
        long jB = (i11 & 4) != 0 ? f.INSTANCE.b() : j10;
        if (ComposerKt.M()) {
            ComposerKt.U(-1368059556, i10, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButton (FloatingButton.kt:52)");
        }
        InterfaceC5872l0 interfaceC5872l0E = t1.e(h.l(h.p(((Configuration) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.f())).screenHeightDp)), null, 2, null);
        InterfaceC5872l0 interfaceC5872l0E2 = t1.e(h.l(h.p(((Configuration) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.f())).screenWidthDp)), null, 2, null);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB = composerStartRestartGroup.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = h.l(h.p(settings.getHeight()));
            composerStartRestartGroup.t(objB);
        }
        composerStartRestartGroup.U();
        float value = ((h) objB).getValue();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB2 = composerStartRestartGroup.B();
        if (objB2 == companion.a()) {
            objB2 = h.l(h.p(settings.getWidth()));
            composerStartRestartGroup.t(objB2);
        }
        composerStartRestartGroup.U();
        float value2 = ((h) objB2).getValue();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB3 = composerStartRestartGroup.B();
        if (objB3 == companion.a()) {
            objB3 = h.l(h.p(4));
            composerStartRestartGroup.t(objB3);
        }
        composerStartRestartGroup.U();
        float value3 = ((h) objB3).getValue();
        composerStartRestartGroup.startReplaceableGroup(1952321679);
        H1.d dVar = (H1.d) composerStartRestartGroup.o(C6034t0.g());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB4 = composerStartRestartGroup.B();
        if (objB4 == companion.a()) {
            objB4 = Float.valueOf(dVar.I1(((h) interfaceC5872l0E2.getValue()).getValue()));
            composerStartRestartGroup.t(objB4);
        }
        composerStartRestartGroup.U();
        float fFloatValue = ((Number) objB4).floatValue();
        composerStartRestartGroup.U();
        composerStartRestartGroup.startReplaceableGroup(1952321764);
        H1.d dVar2 = (H1.d) composerStartRestartGroup.o(C6034t0.g());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB5 = composerStartRestartGroup.B();
        if (objB5 == companion.a()) {
            objB5 = Float.valueOf(dVar2.I1(value2));
            composerStartRestartGroup.t(objB5);
        }
        composerStartRestartGroup.U();
        float fFloatValue2 = ((Number) objB5).floatValue();
        composerStartRestartGroup.U();
        composerStartRestartGroup.startReplaceableGroup(1952321845);
        H1.d dVar3 = (H1.d) composerStartRestartGroup.o(C6034t0.g());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB6 = composerStartRestartGroup.B();
        if (objB6 == companion.a()) {
            objB6 = Float.valueOf(dVar3.I1(value3));
            composerStartRestartGroup.t(objB6);
        }
        composerStartRestartGroup.U();
        float fFloatValue3 = ((Number) objB6).floatValue();
        composerStartRestartGroup.U();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB7 = composerStartRestartGroup.B();
        if (objB7 == companion.a()) {
            objB7 = f.d(f.j(jB, f.INSTANCE.b()) ? g.a((fFloatValue - fFloatValue2) - fFloatValue3, 0.0f) : jB);
            composerStartRestartGroup.t(objB7);
        }
        composerStartRestartGroup.U();
        long packedValue = ((f) objB7).getPackedValue();
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB8 = composerStartRestartGroup.B();
        if (objB8 == companion.a()) {
            InterfaceC5872l0 interfaceC5872l0E3 = t1.e(f.d(packedValue), null, 2, null);
            composerStartRestartGroup.t(interfaceC5872l0E3);
            objB8 = interfaceC5872l0E3;
        }
        composerStartRestartGroup.U();
        InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB8;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierA = F1.a(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(companion2, ((h) interfaceC5872l0E.getValue()).getValue()), ((h) interfaceC5872l0E2.getValue()).getValue()), C5489q0.INSTANCE.i(), null, 2, null), "floatingButtonArea");
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyI = C5804h.i(P0.e.INSTANCE.o(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        H1.d dVar4 = (H1.d) composerStartRestartGroup.o(C6034t0.g());
        t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
        Q1 q12 = (Q1) composerStartRestartGroup.o(C6034t0.t());
        InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
        Function0<InterfaceC5953g> function0A = companion3.a();
        Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C = A.c(modifierA);
        if (composerStartRestartGroup.k() == null) {
            C5859f.c();
        }
        composerStartRestartGroup.F();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.I(function0A);
        } else {
            composerStartRestartGroup.s();
        }
        composerStartRestartGroup.G();
        Composer composerA = D1.a(composerStartRestartGroup);
        long j11 = jB;
        D1.c(composerA, measurePolicyI, companion3.e());
        D1.c(composerA, dVar4, companion3.c());
        D1.c(composerA, tVar, companion3.d());
        D1.c(composerA, q12, companion3.h());
        composerStartRestartGroup.c();
        function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        C5806j c5806j = C5806j.f48836a;
        Modifier modifierF = androidx.compose.foundation.layout.J.F(D.i(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(companion2, value), value2), value3), null, false, 3, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zV = composerStartRestartGroup.V(interfaceC5872l0);
        Object objB9 = composerStartRestartGroup.B();
        if (zV || objB9 == companion.a()) {
            objB9 = new C0942a(interfaceC5872l0);
            composerStartRestartGroup.t(objB9);
        }
        composerStartRestartGroup.U();
        Modifier modifierA2 = androidx.compose.foundation.layout.A.a(modifierF, (Function1) objB9);
        Unit unit = Unit.f143329a;
        Object[] objArr = {onDragFinished, interfaceC5872l0, interfaceC5872l0E2, h.l(value2), interfaceC5872l0E, h.l(value)};
        composerStartRestartGroup.startReplaceableGroup(-568225417);
        boolean zV2 = false;
        for (int i12 = 0; i12 < 6; i12++) {
            zV2 |= composerStartRestartGroup.V(objArr[i12]);
        }
        Object objB10 = composerStartRestartGroup.B();
        if (zV2 || objB10 == Composer.INSTANCE.a()) {
            objB10 = new b(onDragFinished, interfaceC5872l0, interfaceC5872l0E2, value2, interfaceC5872l0E, value, null);
            composerStartRestartGroup.t(objB10);
        }
        composerStartRestartGroup.U();
        Modifier modifierA3 = F1.a(modifierA2.then(new SuspendPointerInputElement(unit, null, null, new U.a((Function2) objB10), 6, null)), "floatingButton");
        float f10 = 0;
        InterfaceC18044u0 interfaceC18044u0A = C18042t0.f169756a.a(h.p(f10), h.p(f10), 0.0f, 0.0f, composerStartRestartGroup, (C18042t0.f169757b << 12) | 54, 12);
        RoundedCornerShape roundedCornerShapeC = C16806i.c(h.p(settings.getCornerRadius()));
        long jI = C5489q0.INSTANCE.i();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zV3 = composerStartRestartGroup.V(onClick);
        Object objB11 = composerStartRestartGroup.B();
        if (zV3 || objB11 == Composer.INSTANCE.a()) {
            objB11 = new c(onClick);
            composerStartRestartGroup.t(objB11);
        }
        composerStartRestartGroup.U();
        C18048w0.a((Function0) objB11, modifierA3, null, roundedCornerShapeC, jI, 0L, interfaceC18044u0A, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1818417068, true, new d(graphic)), composerStartRestartGroup, 12607488, 36);
        composerStartRestartGroup.U();
        composerStartRestartGroup.v();
        composerStartRestartGroup.U();
        composerStartRestartGroup.U();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new e(settings, graphic, j11, onClick, onDragFinished, i10, i11));
    }
}
