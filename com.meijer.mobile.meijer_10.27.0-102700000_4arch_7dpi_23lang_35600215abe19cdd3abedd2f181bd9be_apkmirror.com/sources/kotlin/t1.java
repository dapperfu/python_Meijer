package kotlin;

import V0.C5346q0;
import V0.D1;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import d0.BorderStroke;
import d0.C13439f;
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
import r1.C16705m;
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
        final /* synthetic */ Modifier f168670f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ D1 f168671g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f168672h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f168673i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ BorderStroke f168674j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f168675k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168676l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.t1$a$a, reason: collision with other inner class name */
        static final class C2696a extends Lambda implements Function1<u, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final C2696a f168677f = new C2696a();

            C2696a() {
                super(1);
            }

            public final void a(u uVar) {
                s.e0(uVar, true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
                a(uVar);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "<anonymous>", "(Lg1/J;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.SurfaceKt$Surface$1$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function2<J, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f168678a;

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
                return ((b) create(j10, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f168678a == 0) {
                    ResultKt.b(obj);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, D1 d12, long j10, float f10, BorderStroke borderStroke, float f11, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f168670f = modifier;
            this.f168671g = d12;
            this.f168672h = j10;
            this.f168673i = f10;
            this.f168674j = borderStroke;
            this.f168675k = f11;
            this.f168676l = function2;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1822160838, i10, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:108)");
            }
            Modifier modifierThen = C16705m.c(t1.e(this.f168670f, this.f168671g, t1.f(this.f168672h, (InterfaceC17947j0) composer.o(C17950k0.d()), this.f168673i, composer, 0), this.f168674j, this.f168675k), false, C2696a.f168677f).then(new SuspendPointerInputElement(Unit.f142422a, null, null, new U.a(new b(null)), 6, null));
            Function2<Composer, Integer, Unit> function2 = this.f168676l;
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), true);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierThen);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
            function2.invoke(composer, 0);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f168679f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ D1 f168680g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f168681h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f168682i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ BorderStroke f168683j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f168684k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168685l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f168686m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f168687n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Modifier modifier, D1 d12, long j10, long j11, BorderStroke borderStroke, float f10, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f168679f = modifier;
            this.f168680g = d12;
            this.f168681h = j10;
            this.f168682i = j11;
            this.f168683j = borderStroke;
            this.f168684k = f10;
            this.f168685l = function2;
            this.f168686m = i10;
            this.f168687n = i11;
        }

        public final void a(Composer composer, int i10) {
            t1.a(this.f168679f, this.f168680g, this.f168681h, this.f168682i, this.f168683j, this.f168684k, this.f168685l, composer, J0.a(this.f168686m | 1), this.f168687n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f168688f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ D1 f168689g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f168690h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f168691i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ BorderStroke f168692j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f168693k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ h0.l f168694l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f168695m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168696n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168697o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, D1 d12, long j10, float f10, BorderStroke borderStroke, float f11, h0.l lVar, boolean z10, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f168688f = modifier;
            this.f168689g = d12;
            this.f168690h = j10;
            this.f168691i = f10;
            this.f168692j = borderStroke;
            this.f168693k = f11;
            this.f168694l = lVar;
            this.f168695m = z10;
            this.f168696n = function0;
            this.f168697o = function2;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2031491085, i10, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:214)");
            }
            Modifier modifierC = ClickableKt.c(t1.e(C17871B0.d(this.f168688f), this.f168689g, t1.f(this.f168690h, (InterfaceC17947j0) composer.o(C17950k0.d()), this.f168691i, composer, 0), this.f168692j, this.f168693k), this.f168694l, C17916Y0.f(false, 0.0f, 0L, 7, null), this.f168695m, null, null, this.f168696n, 24, null);
            Function2<Composer, Integer, Unit> function2 = this.f168697o;
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), true);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
            function2.invoke(composer, 0);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f168698f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168699g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f168700h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ D1 f168701i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f168702j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f168703k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ BorderStroke f168704l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ float f168705m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ h0.l f168706n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168707o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f168708p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f168709q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function0<Unit> function0, Modifier modifier, boolean z10, D1 d12, long j10, long j11, BorderStroke borderStroke, float f10, h0.l lVar, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f168698f = function0;
            this.f168699g = modifier;
            this.f168700h = z10;
            this.f168701i = d12;
            this.f168702j = j10;
            this.f168703k = j11;
            this.f168704l = borderStroke;
            this.f168705m = f10;
            this.f168706n = lVar;
            this.f168707o = function2;
            this.f168708p = i10;
            this.f168709q = i11;
        }

        public final void a(Composer composer, int i10) {
            t1.b(this.f168698f, this.f168699g, this.f168700h, this.f168701i, this.f168702j, this.f168703k, this.f168704l, this.f168705m, this.f168706n, this.f168707o, composer, J0.a(this.f168708p | 1), this.f168709q);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
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
            modifierE = C13439f.e(modifierE, borderStroke, d12);
        }
        return T0.e.a(androidx.compose.foundation.b.c(modifierB.then(modifierE), j10, d12), d12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(long j10, InterfaceC17947j0 interfaceC17947j0, float f10, Composer composer, int i10) {
        long jA;
        if (ComposerKt.M()) {
            ComposerKt.U(1561611256, i10, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:480)");
        }
        if (C5346q0.s(j10, C17877E0.f166879a.a(composer, 6).n()) && interfaceC17947j0 != null) {
            composer.startReplaceGroup(1082922676);
            jA = interfaceC17947j0.a(j10, f10, composer, (i10 & 14) | ((i10 >> 3) & 112) | ((i10 << 3) & 896));
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
