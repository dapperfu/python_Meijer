package kotlin;

import V0.C5489q0;
import V0.D1;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import d0.BorderStroke;
import d0.C13572f;
import g1.J;
import g1.U;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16819m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a^\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0082\u0001\u0010\u0015\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a8\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a,\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\tH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "LV0/D1;", "shape", "LV0/q0;", "color", "contentColor", "Ld0/h;", "border", "LH1/h;", "elevation", "Lkotlin/Function0;", "", "content", "a", "(Landroidx/compose/ui/Modifier;LV0/D1;JJLd0/h;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "onClick", "", "enabled", "Lh0/l;", "interactionSource", "b", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLV0/D1;JJLd0/h;FLh0/l;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "backgroundColor", "e", "(Landroidx/compose/ui/Modifier;LV0/D1;JLd0/h;F)Landroidx/compose/ui/Modifier;", "Lx0/j0;", "elevationOverlay", "absoluteElevation", "f", "(JLx0/j0;FLandroidx/compose/runtime/Composer;I)J", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class t1 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f169758f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ D1 f169759g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f169760h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f169761i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ BorderStroke f169762j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f169763k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169764l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.t1$a$a, reason: collision with other inner class name */
        static final class C2720a extends Lambda implements Function1<u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final C2720a f169765f = new C2720a();

            C2720a() {
                super(1);
            }

            public final void a(u uVar) {
                s.e0(uVar, true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                a(uVar);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "<anonymous>", "(Lg1/J;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<J, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f169766a;

            b(Continuation<? super b> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(J j10, Continuation<? super Unit> continuation) {
                return ((b) create(j10, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f169766a == 0) {
                    ResultKt.b(obj);
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, D1 d12, long j10, float f10, BorderStroke borderStroke, float f11, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f169758f = modifier;
            this.f169759g = d12;
            this.f169760h = j10;
            this.f169761i = f10;
            this.f169762j = borderStroke;
            this.f169763k = f11;
            this.f169764l = function2;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1822160838, i10, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:108)");
            }
            Modifier modifierThen = C16819m.c(t1.e(this.f169758f, this.f169759g, t1.f(this.f169760h, (InterfaceC18013j0) composer.o(C18016k0.d()), this.f169761i, composer, 0), this.f169762j, this.f169763k), false, C2720a.f169765f).then(new SuspendPointerInputElement(Unit.f143329a, null, null, new U.a(new b(null)), 6, null));
            Function2<Composer, Integer, Unit> function2 = this.f169764l;
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), true);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierThen);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            function2.invoke(composer, 0);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f169767f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ D1 f169768g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f169769h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f169770i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ BorderStroke f169771j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f169772k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169773l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f169774m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f169775n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, D1 d12, long j10, long j11, BorderStroke borderStroke, float f10, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f169767f = modifier;
            this.f169768g = d12;
            this.f169769h = j10;
            this.f169770i = j11;
            this.f169771j = borderStroke;
            this.f169772k = f10;
            this.f169773l = function2;
            this.f169774m = i10;
            this.f169775n = i11;
        }

        public final void a(Composer composer, int i10) {
            t1.a(this.f169767f, this.f169768g, this.f169769h, this.f169770i, this.f169771j, this.f169772k, this.f169773l, composer, J0.a(this.f169774m | 1), this.f169775n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f169776f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ D1 f169777g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f169778h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f169779i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ BorderStroke f169780j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f169781k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ h0.l f169782l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f169783m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f169784n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169785o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, D1 d12, long j10, float f10, BorderStroke borderStroke, float f11, h0.l lVar, boolean z10, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f169776f = modifier;
            this.f169777g = d12;
            this.f169778h = j10;
            this.f169779i = f10;
            this.f169780j = borderStroke;
            this.f169781k = f11;
            this.f169782l = lVar;
            this.f169783m = z10;
            this.f169784n = function0;
            this.f169785o = function2;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2031491085, i10, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:214)");
            }
            Modifier modifierC = ClickableKt.c(t1.e(C17937B0.d(this.f169776f), this.f169777g, t1.f(this.f169778h, (InterfaceC18013j0) composer.o(C18016k0.d()), this.f169779i, composer, 0), this.f169780j, this.f169781k), this.f169782l, C17982Y0.f(false, 0.0f, 0L, 7, null), this.f169783m, null, null, this.f169784n, 24, null);
            Function2<Composer, Integer, Unit> function2 = this.f169785o;
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), true);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            function2.invoke(composer, 0);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f169786f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f169787g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f169788h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ D1 f169789i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f169790j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f169791k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ BorderStroke f169792l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f169793m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ h0.l f169794n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f169795o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f169796p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f169797q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<Unit> function0, Modifier modifier, boolean z10, D1 d12, long j10, long j11, BorderStroke borderStroke, float f10, h0.l lVar, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f169786f = function0;
            this.f169787g = modifier;
            this.f169788h = z10;
            this.f169789i = d12;
            this.f169790j = j10;
            this.f169791k = j11;
            this.f169792l = borderStroke;
            this.f169793m = f10;
            this.f169794n = lVar;
            this.f169795o = function2;
            this.f169796p = i10;
            this.f169797q = i11;
        }

        public final void a(Composer composer, int i10) {
            t1.b(this.f169786f, this.f169787g, this.f169788h, this.f169789i, this.f169790j, this.f169791k, this.f169792l, this.f169793m, this.f169794n, this.f169795o, composer, J0.a(this.f169796p | 1), this.f169797q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r26, V0.D1 r27, long r28, long r30, d0.BorderStroke r32, float r33, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.t1.a(androidx.compose.ui.Modifier, V0.D1, long, long, d0.h, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(kotlin.jvm.functions.Function0<kotlin.Unit> r27, androidx.compose.ui.Modifier r28, boolean r29, V0.D1 r30, long r31, long r33, d0.BorderStroke r35, float r36, h0.l r37, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.t1.b(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, V0.D1, long, long, d0.h, float, h0.l, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier e(Modifier modifier, D1 d12, long j10, BorderStroke borderStroke, float f10) {
        Modifier modifierB = T0.l.b(modifier, f10, d12, false, 0L, 0L, 24, null);
        Modifier modifierE = Modifier.INSTANCE;
        if (borderStroke != null) {
            modifierE = C13572f.e(modifierE, borderStroke, d12);
        }
        return T0.e.a(androidx.compose.foundation.b.c(modifierB.then(modifierE), j10, d12), d12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j10, InterfaceC18013j0 interfaceC18013j0, float f10, Composer composer, int i10) {
        long jA;
        if (ComposerKt.M()) {
            ComposerKt.U(1561611256, i10, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:480)");
        }
        if (C5489q0.s(j10, C17943E0.f167967a.a(composer, 6).n()) && interfaceC18013j0 != null) {
            composer.startReplaceGroup(1082922676);
            jA = interfaceC18013j0.a(j10, f10, composer, (i10 & 14) | ((i10 >> 3) & 112) | ((i10 << 3) & 896));
            composer.P();
        } else {
            composer.startReplaceGroup(1082990783);
            composer.P();
            jA = j10;
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return jA;
    }
}
