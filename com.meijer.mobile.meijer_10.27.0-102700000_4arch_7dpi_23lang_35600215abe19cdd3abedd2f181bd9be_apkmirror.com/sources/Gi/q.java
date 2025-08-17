package Gi;

import Gi.q;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.InterfaceC5856h;
import java.util.List;
import kotlin.C6292E;
import kotlin.C6313a;
import kotlin.C6315b;
import kotlin.C6327j;
import kotlin.C6330m;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n0;
import qv.InterfaceC16622O;
import qv.Z;
import r1.C16699g;
import r1.C16705m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001f\u0010 *N\b\u0002\u0010#\"#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u00042#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006$"}, d2 = {"LGi/i;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGi/d;", "", "toast", "f", "(LGi/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "LGi/e;", "", "hasAction", "Landroidx/compose/ui/platform/h;", "accessibilityManager", "", "m", "(LGi/e;ZLandroidx/compose/ui/platform/h;)J", "current", "content", "d", "(LGi/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lc0/i;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Landroidx/compose/runtime/z1;", "j", "(Lc0/i;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "l", "(Lc0/i;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "Lkotlin/ParameterName;", "name", "FadeInFadeOutTransition", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Gi.d f11527a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Gi.d f11528b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Gi.d> f11529c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Gi.c<Gi.d> f11530d;

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(Gi.d dVar) {
            dVar.g(true);
            return true;
        }

        a(Gi.d dVar, Gi.d dVar2, List<Gi.d> list, Gi.c<Gi.d> cVar) {
            this.f11527a = dVar;
            this.f11528b = dVar2;
            this.f11529c = list;
            this.f11530d = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(Gi.d dVar, FadeInFadeOutAnimationItem it) {
            Intrinsics.j(it, "it");
            return Intrinsics.e(it.c(), dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(final Gi.d dVar, u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            s.n0(semantics, C16699g.INSTANCE.b());
            s.n(semantics, null, new Function0() { // from class: Gi.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(q.a.l(dVar));
                }
            }, 1, null);
            return Unit.f142422a;
        }

        public final void e(Function2<? super Composer, ? super Integer, Unit> children, Composer composer, int i10) {
            int i11;
            Intrinsics.j(children, "children");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.D(children) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-729381245, i11, -1, "com.meijer.mobile.android_acres_library.composables.state.FadeInFadeOutWithScale.<anonymous>.<anonymous> (ToastHostState.kt:275)");
            }
            boolean zE = Intrinsics.e(this.f11527a, this.f11528b);
            int i12 = zE ? 150 : 75;
            int i13 = (!zE || CollectionsKt.p0(this.f11529c).size() == 1) ? 0 : 75;
            n0 n0VarK = C6327j.k(i12, i13, C6292E.d());
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f11527a) | composer.D(this.f11530d);
            final Gi.d dVar = this.f11527a;
            final Gi.c<Gi.d> cVar = this.f11530d;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Gi.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q.a.f(dVar, cVar);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            z1 z1VarJ = q.j(n0VarK, zE, (Function0) objB, composer, 0, 0);
            z1 z1VarL = q.l(C6327j.k(i12, i13, C6292E.c()), zE, composer, 0);
            Modifier modifierC = androidx.compose.ui.graphics.d.c(Modifier.INSTANCE, ((Number) z1VarL.getValue()).floatValue(), ((Number) z1VarL.getValue()).floatValue(), ((Number) z1VarJ.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(this.f11527a);
            final Gi.d dVar2 = this.f11527a;
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Gi.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.a.k(dVar2, (u) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierD = C16705m.d(modifierC, false, (Function1) objB2, 1, null);
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
            children.invoke(composer, Integer.valueOf(i11 & 14));
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            e(function2, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(final Gi.d dVar, Gi.c cVar) {
            if (!Intrinsics.e(dVar, cVar.getCurrent())) {
                CollectionsKt.J(cVar.b(), new Function1() { // from class: Gi.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(q.a.g(dVar, (FadeInFadeOutAnimationItem) obj));
                    }
                });
                H0 scope = cVar.getScope();
                if (scope != null) {
                    scope.invalidate();
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function3<Gi.d, Composer, Integer, Unit> f11531a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Gi.d f11532b;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function3<? super Gi.d, ? super Composer, ? super Integer, Unit> function3, Gi.d dVar) {
            this.f11531a = function3;
            this.f11532b = dVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-641643428, i10, -1, "com.meijer.mobile.android_acres_library.composables.state.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToastHostState.kt:323)");
            }
            Function3<Gi.d, Composer, Integer, Unit> function3 = this.f11531a;
            Gi.d dVar = this.f11532b;
            Intrinsics.g(dVar);
            function3.invoke(dVar, composer, 0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.state.ToastHostStateKt$ToastHost$1$1", f = "ToastHostState.kt", l = {170}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f11533a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Gi.d f11534b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5856h f11535c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Gi.d dVar, InterfaceC5856h interfaceC5856h, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f11534b = dVar;
            this.f11535c = interfaceC5856h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f11534b, this.f11535c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f11533a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Gi.d dVar = this.f11534b;
                if (dVar != null) {
                    Gi.e duration = dVar.getDuration();
                    if (this.f11534b.getActionLabel() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long jM = q.m(duration, z10, this.f11535c);
                    this.f11533a = 1;
                    if (Z.b(jM, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
            this.f11534b.g(true);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.state.ToastHostStateKt$animatedOpacity$2$1", f = "ToastHostState.kt", l = {352}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f11536a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6313a<Float, C6330m> f11537b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11538c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6326i<Float> f11539d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f11540e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C6313a<Float, C6330m> c6313a, boolean z10, InterfaceC6326i<Float> interfaceC6326i, Function0<Unit> function0, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f11537b = c6313a;
            this.f11538c = z10;
            this.f11539d = interfaceC6326i;
            this.f11540e = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f11537b, this.f11538c, this.f11539d, this.f11540e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f10;
            e eVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f11536a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    eVar = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6313a<Float, C6330m> c6313a = this.f11537b;
                if (this.f11538c) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                Float fC = Boxing.c(f10);
                InterfaceC6326i<Float> interfaceC6326i = this.f11539d;
                this.f11536a = 1;
                eVar = this;
                if (C6313a.f(c6313a, fC, interfaceC6326i, null, null, eVar, 12, null) == objF) {
                    return objF;
                }
            }
            eVar.f11540e.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.state.ToastHostStateKt$animatedScale$1$1", f = "ToastHostState.kt", l = {365}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f11541a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6313a<Float, C6330m> f11542b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f11543c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6326i<Float> f11544d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C6313a<Float, C6330m> c6313a, boolean z10, InterfaceC6326i<Float> interfaceC6326i, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f11542b = c6313a;
            this.f11543c = z10;
            this.f11544d = interfaceC6326i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f11542b, this.f11543c, this.f11544d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f11541a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6313a<Float, C6330m> c6313a = this.f11542b;
                if (this.f11543c) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                Float fC = Boxing.c(f10);
                InterfaceC6326i<Float> interfaceC6326i = this.f11544d;
                this.f11541a = 1;
                if (C6313a.f(c6313a, fC, interfaceC6326i, null, null, this, 12, null) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gi.e.values().length];
            try {
                iArr[Gi.e.f11483c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gi.e.f11482b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gi.e.f11481a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c4 A[LOOP:2: B:79:0x01c2->B:80:0x01c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(final Gi.d r16, androidx.compose.ui.Modifier r17, final kotlin.jvm.functions.Function3<? super Gi.d, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Gi.q.d(Gi.d, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Gi.d dVar, Modifier modifier, Function3 function3, int i10, int i11, Composer composer, int i12) {
        d(dVar, modifier, function3, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void f(final i hostState, Modifier modifier, Function3<? super Gi.d, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        final Function3<? super Gi.d, ? super Composer, ? super Integer, Unit> function32;
        Intrinsics.j(hostState, "hostState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1741229660);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.V(hostState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(function3) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
            function32 = function3;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i14 != 0) {
                function3 = Gi.a.f11473a.a();
            }
            Function3<? super Gi.d, ? super Composer, ? super Integer, Unit> function33 = function3;
            if (ComposerKt.M()) {
                ComposerKt.U(1741229660, i12, -1, "com.meijer.mobile.android_acres_library.composables.state.ToastHost (ToastHostState.kt:160)");
            }
            Gi.d dVarF = hostState.f();
            InterfaceC5856h interfaceC5856h = (InterfaceC5856h) composerStartRestartGroup.o(C5892t0.c());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(dVarF) | composerStartRestartGroup.D(interfaceC5856h);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new c(dVarF, interfaceC5856h, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            J.g(dVarF, (Function2) objB, composerStartRestartGroup, 0);
            Modifier modifier3 = modifier;
            d(hostState.f(), modifier3, function33, composerStartRestartGroup, i12 & 1008, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
            function32 = function33;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Gi.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return q.g(hostState, modifier2, function32, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(i iVar, Modifier modifier, Function3 function3, int i10, int i11, Composer composer, int i12) {
        f(iVar, modifier, function3, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k() {
        return Unit.f142422a;
    }

    public static final long m(Gi.e eVar, boolean z10, InterfaceC5856h interfaceC5856h) {
        long j10;
        Intrinsics.j(eVar, "<this>");
        int i10 = d.$EnumSwitchMapping$0[eVar.ordinal()];
        if (i10 == 1) {
            j10 = Long.MAX_VALUE;
        } else if (i10 == 2) {
            j10 = 10000;
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j10 = 4000;
        }
        long j11 = j10;
        return interfaceC5856h == null ? j11 : interfaceC5856h.a(j11, true, true, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1<Float> j(InterfaceC6326i<Float> interfaceC6326i, boolean z10, Function0<Unit> function0, Composer composer, int i10, int i11) {
        boolean z11;
        float f10;
        composer.startReplaceGroup(-1221616274);
        if ((i11 & 4) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Gi.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q.k();
                    }
                };
                composer.t(objB);
            }
            function0 = (Function0) objB;
            composer.P();
        }
        Function0<Unit> function02 = function0;
        if (ComposerKt.M()) {
            ComposerKt.U(-1221616274, i10, -1, "com.meijer.mobile.android_acres_library.composables.state.animatedOpacity (ToastHostState.kt:348)");
        }
        composer.startReplaceGroup(1849434622);
        Object objB2 = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB2 == companion.a()) {
            if (!z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            objB2 = C6315b.b(f10, 0.0f, 2, null);
            composer.t(objB2);
        }
        C6313a c6313a = (C6313a) objB2;
        composer.P();
        Boolean boolValueOf = Boolean.valueOf(z10);
        composer.startReplaceGroup(-1224400529);
        boolean zD = composer.D(c6313a);
        boolean z12 = false;
        if ((((i10 & 112) ^ 48) > 32 && composer.a(z10)) || (i10 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean zD2 = zD | z11 | composer.D(interfaceC6326i);
        if ((((i10 & 896) ^ 384) > 256 && composer.V(function02)) || (i10 & 384) == 256) {
            z12 = true;
        }
        boolean z13 = zD2 | z12;
        Object objB3 = composer.B();
        if (z13 || objB3 == companion.a()) {
            Object eVar = new e(c6313a, z10, interfaceC6326i, function02, null);
            composer.t(eVar);
            objB3 = eVar;
        }
        composer.P();
        J.g(boolValueOf, (Function2) objB3, composer, (i10 >> 3) & 14);
        z1<Float> z1VarG = c6313a.g();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1<Float> l(InterfaceC6326i<Float> interfaceC6326i, boolean z10, Composer composer, int i10) {
        boolean z11;
        float f10;
        composer.startReplaceGroup(-360766949);
        if (ComposerKt.M()) {
            ComposerKt.U(-360766949, i10, -1, "com.meijer.mobile.android_acres_library.composables.state.animatedScale (ToastHostState.kt:361)");
        }
        composer.startReplaceGroup(1849434622);
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            if (!z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.8f;
            }
            objB = C6315b.b(f10, 0.0f, 2, null);
            composer.t(objB);
        }
        C6313a c6313a = (C6313a) objB;
        composer.P();
        Boolean boolValueOf = Boolean.valueOf(z10);
        composer.startReplaceGroup(-1746271574);
        boolean zD = composer.D(c6313a);
        if ((((i10 & 112) ^ 48) > 32 && composer.a(z10)) || (i10 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean zD2 = zD | z11 | composer.D(interfaceC6326i);
        Object objB2 = composer.B();
        if (zD2 || objB2 == companion.a()) {
            objB2 = new f(c6313a, z10, interfaceC6326i, null);
            composer.t(objB2);
        }
        composer.P();
        J.g(boolValueOf, (Function2) objB2, composer, (i10 >> 3) & 14);
        z1<Float> z1VarG = c6313a.g();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarG;
    }
}
