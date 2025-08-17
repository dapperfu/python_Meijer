package Z5;

import H1.h;
import H1.n;
import H1.o;
import H1.t;
import U0.f;
import U0.g;
import V0.C5346q0;
import V0.InterfaceC5316f1;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
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
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import d0.C13457y;
import g1.J;
import g1.PointerInputChange;
import g1.U;
import g1.r;
import kotlin.C13814m;
import kotlin.C17976t0;
import kotlin.C17982w0;
import kotlin.InterfaceC17978u0;
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
import r0.C16692i;
import r0.RoundedCornerShape;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"LY5/d;", "settings", "Landroidx/compose/runtime/z1;", "LV0/f1;", "graphic", "LU0/f;", "offset", "Lkotlin/Function0;", "", "onClick", "Lkotlin/Function1;", "onDragFinished", "a", "(LY5/d;Landroidx/compose/runtime/z1;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: Z5.a$a, reason: collision with other inner class name */
    static final class C0897a extends Lambda implements Function1<H1.d, n> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<f> f42357f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0897a(InterfaceC5730l0<f> interfaceC5730l0) {
            super(1);
            this.f42357f = interfaceC5730l0;
        }

        public final long a(H1.d offset) {
            Intrinsics.j(offset, "$this$offset");
            return o.a(MathKt.d(f.m(this.f42357f.getValue().getPackedValue())), MathKt.d(f.n(this.f42357f.getValue().getPackedValue())));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ n invoke(H1.d dVar) {
            return n.c(a(dVar));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @DebugMetadata(c = "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButtonKt$FloatingButton$1$2$1", f = "FloatingButton.kt", l = {109}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<J, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f42358a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f42359b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<f, Unit> f42360c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<f> f42361d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<h> f42362e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f42363f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<h> f42364g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f42365h;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: Z5.a$b$a, reason: collision with other inner class name */
        static final class C0898a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1<f, Unit> f42366f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<f> f42367g;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0898a(Function1<? super f, Unit> function1, InterfaceC5730l0<f> interfaceC5730l0) {
                super(0);
                this.f42366f = function1;
                this.f42367g = interfaceC5730l0;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f42366f.invoke(this.f42367g.getValue());
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Z5.a$b$b, reason: collision with other inner class name */
        static final class C0899b extends Lambda implements Function2<PointerInputChange, f, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<f> f42368f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ J f42369g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<h> f42370h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ float f42371i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<h> f42372j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ float f42373k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0899b(InterfaceC5730l0<f> interfaceC5730l0, J j10, InterfaceC5730l0<h> interfaceC5730l02, float f10, InterfaceC5730l0<h> interfaceC5730l03, float f11) {
                super(2);
                this.f42368f = interfaceC5730l0;
                this.f42369g = j10;
                this.f42370h = interfaceC5730l02;
                this.f42371i = f10;
                this.f42372j = interfaceC5730l03;
                this.f42373k = f11;
            }

            public final void a(PointerInputChange change, long j10) {
                Intrinsics.j(change, "change");
                r.e(change);
                this.f42368f.setValue(f.d(g.a(RangesKt.n(f.m(this.f42368f.getValue().getPackedValue()) + f.m(j10), 0.0f, this.f42369g.I1(h.p(this.f42370h.getValue().getValue() - this.f42371i))), RangesKt.n(f.n(this.f42368f.getValue().getPackedValue()) + f.n(j10), 0.0f, this.f42369g.I1(h.p(this.f42372j.getValue().getValue() - this.f42373k))))));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, f fVar) {
                a(pointerInputChange, fVar.getPackedValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super f, Unit> function1, InterfaceC5730l0<f> interfaceC5730l0, InterfaceC5730l0<h> interfaceC5730l02, float f10, InterfaceC5730l0<h> interfaceC5730l03, float f11, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f42360c = function1;
            this.f42361d = interfaceC5730l0;
            this.f42362e = interfaceC5730l02;
            this.f42363f = f10;
            this.f42364g = interfaceC5730l03;
            this.f42365h = f11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f42360c, this.f42361d, this.f42362e, this.f42363f, this.f42364g, this.f42365h, continuation);
            bVar.f42359b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j10, Continuation<? super Unit> continuation) {
            return ((b) create(j10, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f42358a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                J j10 = (J) this.f42359b;
                C0898a c0898a = new C0898a(this.f42360c, this.f42361d);
                C0899b c0899b = new C0899b(this.f42361d, j10, this.f42362e, this.f42363f, this.f42364g, this.f42365h);
                this.f42358a = 1;
                if (C13814m.g(j10, null, c0898a, null, c0899b, this, 5, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42374f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function0<Unit> function0) {
            super(0);
            this.f42374f = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f42374f.invoke();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<InterfaceC5316f1> f42375f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(z1<? extends InterfaceC5316f1> z1Var) {
            super(2);
            this.f42375f = z1Var;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1818417068, i10, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButton.<anonymous>.<anonymous> (FloatingButton.kt:135)");
            }
            C13457y.b(this.f42375f.getValue(), "Floating Button", F1.a(androidx.compose.foundation.layout.J.F(androidx.compose.foundation.b.d(Modifier.INSTANCE, C5346q0.INSTANCE.i(), null, 2, null), null, false, 3, null), "floatingButtonGraphic"), null, null, 0.0f, null, 0, composer, 56, 248);
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
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Y5.d f42376f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<InterfaceC5316f1> f42377g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f42378h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f42379i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<f, Unit> f42380j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f42381k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f42382l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Y5.d dVar, z1<? extends InterfaceC5316f1> z1Var, long j10, Function0<Unit> function0, Function1<? super f, Unit> function1, int i10, int i11) {
            super(2);
            this.f42376f = dVar;
            this.f42377g = z1Var;
            this.f42378h = j10;
            this.f42379i = function0;
            this.f42380j = function1;
            this.f42381k = i10;
            this.f42382l = i11;
        }

        public final void a(Composer composer, int i10) {
            a.a(this.f42376f, this.f42377g, this.f42378h, this.f42379i, this.f42380j, composer, J0.a(this.f42381k | 1), this.f42382l);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(Y5.d settings, z1<? extends InterfaceC5316f1> graphic, long j10, Function0<Unit> onClick, Function1<? super f, Unit> onDragFinished, Composer composer, int i10, int i11) {
        Intrinsics.j(settings, "settings");
        Intrinsics.j(graphic, "graphic");
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(onDragFinished, "onDragFinished");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1368059556);
        long jB = (i11 & 4) != 0 ? f.INSTANCE.b() : j10;
        if (ComposerKt.M()) {
            ComposerKt.U(-1368059556, i10, -1, "com.adobe.marketing.mobile.services.ui.floatingbutton.views.FloatingButton (FloatingButton.kt:52)");
        }
        InterfaceC5730l0 interfaceC5730l0E = t1.e(h.l(h.p(((Configuration) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.f())).screenHeightDp)), null, 2, null);
        InterfaceC5730l0 interfaceC5730l0E2 = t1.e(h.l(h.p(((Configuration) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.f())).screenWidthDp)), null, 2, null);
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
        H1.d dVar = (H1.d) composerStartRestartGroup.o(C5892t0.g());
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objB4 = composerStartRestartGroup.B();
        if (objB4 == companion.a()) {
            objB4 = Float.valueOf(dVar.I1(((h) interfaceC5730l0E2.getValue()).getValue()));
            composerStartRestartGroup.t(objB4);
        }
        composerStartRestartGroup.U();
        float fFloatValue = ((Number) objB4).floatValue();
        composerStartRestartGroup.U();
        composerStartRestartGroup.startReplaceableGroup(1952321764);
        H1.d dVar2 = (H1.d) composerStartRestartGroup.o(C5892t0.g());
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
        H1.d dVar3 = (H1.d) composerStartRestartGroup.o(C5892t0.g());
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
            InterfaceC5730l0 interfaceC5730l0E3 = t1.e(f.d(packedValue), null, 2, null);
            composerStartRestartGroup.t(interfaceC5730l0E3);
            objB8 = interfaceC5730l0E3;
        }
        composerStartRestartGroup.U();
        InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB8;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierA = F1.a(androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(companion2, ((h) interfaceC5730l0E.getValue()).getValue()), ((h) interfaceC5730l0E2.getValue()).getValue()), C5346q0.INSTANCE.i(), null, 2, null), "floatingButtonArea");
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyI = C5662h.i(P0.e.INSTANCE.o(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        H1.d dVar4 = (H1.d) composerStartRestartGroup.o(C5892t0.g());
        t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
        Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
        InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
        Function0<InterfaceC5811g> function0A = companion3.a();
        Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifierA);
        if (composerStartRestartGroup.k() == null) {
            C5717f.c();
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
        C5664j c5664j = C5664j.f48612a;
        Modifier modifierF = androidx.compose.foundation.layout.J.F(D.i(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.J.i(companion2, value), value2), value3), null, false, 3, null);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zV = composerStartRestartGroup.V(interfaceC5730l0);
        Object objB9 = composerStartRestartGroup.B();
        if (zV || objB9 == companion.a()) {
            objB9 = new C0897a(interfaceC5730l0);
            composerStartRestartGroup.t(objB9);
        }
        composerStartRestartGroup.U();
        Modifier modifierA2 = androidx.compose.foundation.layout.A.a(modifierF, (Function1) objB9);
        Unit unit = Unit.f142422a;
        Object[] objArr = {onDragFinished, interfaceC5730l0, interfaceC5730l0E2, h.l(value2), interfaceC5730l0E, h.l(value)};
        composerStartRestartGroup.startReplaceableGroup(-568225417);
        boolean zV2 = false;
        for (int i12 = 0; i12 < 6; i12++) {
            zV2 |= composerStartRestartGroup.V(objArr[i12]);
        }
        Object objB10 = composerStartRestartGroup.B();
        if (zV2 || objB10 == Composer.INSTANCE.a()) {
            objB10 = new b(onDragFinished, interfaceC5730l0, interfaceC5730l0E2, value2, interfaceC5730l0E, value, null);
            composerStartRestartGroup.t(objB10);
        }
        composerStartRestartGroup.U();
        Modifier modifierA3 = F1.a(modifierA2.then(new SuspendPointerInputElement(unit, null, null, new U.a((Function2) objB10), 6, null)), "floatingButton");
        float f10 = 0;
        InterfaceC17978u0 interfaceC17978u0A = C17976t0.f168668a.a(h.p(f10), h.p(f10), 0.0f, 0.0f, composerStartRestartGroup, (C17976t0.f168669b << 12) | 54, 12);
        RoundedCornerShape roundedCornerShapeC = C16692i.c(h.p(settings.getCornerRadius()));
        long jI = C5346q0.INSTANCE.i();
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zV3 = composerStartRestartGroup.V(onClick);
        Object objB11 = composerStartRestartGroup.B();
        if (zV3 || objB11 == Composer.INSTANCE.a()) {
            objB11 = new c(onClick);
            composerStartRestartGroup.t(objB11);
        }
        composerStartRestartGroup.U();
        C17982w0.a((Function0) objB11, modifierA3, null, roundedCornerShapeC, jI, 0L, interfaceC17978u0A, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1818417068, true, new d(graphic)), composerStartRestartGroup, 12607488, 36);
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
