package Hi;

import Hi.q;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.InterfaceC5998h;
import java.util.List;
import kotlin.C6418E;
import kotlin.C6439a;
import kotlin.C6441b;
import kotlin.C6453j;
import kotlin.C6456m;
import kotlin.InterfaceC6452i;
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
import mv.InterfaceC15783O;
import mv.Z;
import r1.C16813g;
import r1.C16819m;
import r1.s;
import r1.u;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001f\u0010 *N\b\u0002\u0010#\"#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u00042#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u001a¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006$"}, d2 = {"LHi/i;", "hostState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LHi/d;", "", "toast", "f", "(LHi/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "LHi/e;", "", "hasAction", "Landroidx/compose/ui/platform/h;", "accessibilityManager", "", "m", "(LHi/e;ZLandroidx/compose/ui/platform/h;)J", "current", "content", "d", "(LHi/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lc0/i;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Landroidx/compose/runtime/z1;", "j", "(Lc0/i;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "l", "(Lc0/i;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "Lkotlin/ParameterName;", "name", "FadeInFadeOutTransition", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class q {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Hi.d f13602a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Hi.d f13603b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<Hi.d> f13604c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Hi.c<Hi.d> f13605d;

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean l(Hi.d dVar) {
            dVar.g(true);
            return true;
        }

        a(Hi.d dVar, Hi.d dVar2, List<Hi.d> list, Hi.c<Hi.d> cVar) {
            this.f13602a = dVar;
            this.f13603b = dVar2;
            this.f13604c = list;
            this.f13605d = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(Hi.d dVar, FadeInFadeOutAnimationItem it) {
            Intrinsics.j(it, "it");
            return Intrinsics.e(it.c(), dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(final Hi.d dVar, u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            s.n0(semantics, C16813g.INSTANCE.b());
            s.n(semantics, null, new Function0() { // from class: Hi.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(q.a.l(dVar));
                }
            }, 1, null);
            return Unit.f143329a;
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
            boolean zE = Intrinsics.e(this.f13602a, this.f13603b);
            int i12 = zE ? 150 : 75;
            int i13 = (!zE || CollectionsKt.p0(this.f13604c).size() == 1) ? 0 : 75;
            n0 n0VarK = C6453j.k(i12, i13, C6418E.d());
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f13602a) | composer.D(this.f13605d);
            final Hi.d dVar = this.f13602a;
            final Hi.c<Hi.d> cVar = this.f13605d;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Hi.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q.a.f(dVar, cVar);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            z1 z1VarJ = q.j(n0VarK, zE, (Function0) objB, composer, 0, 0);
            z1 z1VarL = q.l(C6453j.k(i12, i13, C6418E.c()), zE, composer, 0);
            Modifier modifierC = androidx.compose.ui.graphics.d.c(Modifier.INSTANCE, ((Number) z1VarL.getValue()).floatValue(), ((Number) z1VarL.getValue()).floatValue(), ((Number) z1VarJ.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
            composer.startReplaceGroup(5004770);
            boolean zD2 = composer.D(this.f13602a);
            final Hi.d dVar2 = this.f13602a;
            Object objB2 = composer.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: Hi.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return q.a.k(dVar2, (u) obj);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierD = C16819m.d(modifierC, false, (Function1) objB2, 1, null);
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierD);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            children.invoke(composer, Integer.valueOf(i11 & 14));
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            e(function2, composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(final Hi.d dVar, Hi.c cVar) {
            if (!Intrinsics.e(dVar, cVar.getCurrent())) {
                CollectionsKt.J(cVar.b(), new Function1() { // from class: Hi.o
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
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function3<Hi.d, Composer, Integer, Unit> f13606a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Hi.d f13607b;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function3<? super Hi.d, ? super Composer, ? super Integer, Unit> function3, Hi.d dVar) {
            this.f13606a = function3;
            this.f13607b = dVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-641643428, i10, -1, "com.meijer.mobile.android_acres_library.composables.state.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ToastHostState.kt:323)");
            }
            Function3<Hi.d, Composer, Integer, Unit> function3 = this.f13606a;
            Hi.d dVar = this.f13607b;
            Intrinsics.g(dVar);
            function3.invoke(dVar, composer, 0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.state.ToastHostStateKt$ToastHost$1$1", f = "ToastHostState.kt", l = {170}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13608a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Hi.d f13609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5998h f13610c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Hi.d dVar, InterfaceC5998h interfaceC5998h, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f13609b = dVar;
            this.f13610c = interfaceC5998h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f13609b, this.f13610c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13608a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Hi.d dVar = this.f13609b;
                if (dVar != null) {
                    Hi.e duration = dVar.getDuration();
                    if (this.f13609b.getActionLabel() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long jM = q.m(duration, z10, this.f13610c);
                    this.f13608a = 1;
                    if (Z.b(jM, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
            this.f13609b.g(true);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.state.ToastHostStateKt$animatedOpacity$2$1", f = "ToastHostState.kt", l = {352}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13611a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6439a<Float, C6456m> f13612b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13613c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f13614d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f13615e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C6439a<Float, C6456m> c6439a, boolean z10, InterfaceC6452i<Float> interfaceC6452i, Function0<Unit> function0, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f13612b = c6439a;
            this.f13613c = z10;
            this.f13614d = interfaceC6452i;
            this.f13615e = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new e(this.f13612b, this.f13613c, this.f13614d, this.f13615e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f10;
            e eVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13611a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    eVar = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6439a<Float, C6456m> c6439a = this.f13612b;
                if (this.f13613c) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                Float fC = Boxing.c(f10);
                InterfaceC6452i<Float> interfaceC6452i = this.f13614d;
                this.f13611a = 1;
                eVar = this;
                if (C6439a.f(c6439a, fC, interfaceC6452i, null, null, eVar, 12, null) == objF) {
                    return objF;
                }
            }
            eVar.f13615e.invoke();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.android_acres_library.composables.state.ToastHostStateKt$animatedScale$1$1", f = "ToastHostState.kt", l = {365}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f13616a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6439a<Float, C6456m> f13617b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f13618c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f13619d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C6439a<Float, C6456m> c6439a, boolean z10, InterfaceC6452i<Float> interfaceC6452i, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f13617b = c6439a;
            this.f13618c = z10;
            this.f13619d = interfaceC6452i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f13617b, this.f13618c, this.f13619d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f10;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f13616a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6439a<Float, C6456m> c6439a = this.f13617b;
                if (this.f13618c) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                Float fC = Boxing.c(f10);
                InterfaceC6452i<Float> interfaceC6452i = this.f13619d;
                this.f13616a = 1;
                if (C6439a.f(c6439a, fC, interfaceC6452i, null, null, this, 12, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Hi.e.values().length];
            try {
                iArr[Hi.e.f13558c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Hi.e.f13557b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Hi.e.f13556a.ordinal()] = 3;
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
    private static final void d(final Hi.d r16, androidx.compose.ui.Modifier r17, final kotlin.jvm.functions.Function3<? super Hi.d, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hi.q.d(Hi.d, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Hi.d dVar, Modifier modifier, Function3 function3, int i10, int i11, Composer composer, int i12) {
        d(dVar, modifier, function3, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void f(final i hostState, Modifier modifier, Function3<? super Hi.d, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        final Function3<? super Hi.d, ? super Composer, ? super Integer, Unit> function32;
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
                function3 = Hi.a.f13548a.a();
            }
            Function3<? super Hi.d, ? super Composer, ? super Integer, Unit> function33 = function3;
            if (ComposerKt.M()) {
                ComposerKt.U(1741229660, i12, -1, "com.meijer.mobile.android_acres_library.composables.state.ToastHost (ToastHostState.kt:160)");
            }
            Hi.d dVarF = hostState.f();
            InterfaceC5998h interfaceC5998h = (InterfaceC5998h) composerStartRestartGroup.o(C6034t0.c());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(dVarF) | composerStartRestartGroup.D(interfaceC5998h);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new c(dVarF, interfaceC5998h, null);
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
            t0L.a(new Function2() { // from class: Hi.j
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k() {
        return Unit.f143329a;
    }

    public static final long m(Hi.e eVar, boolean z10, InterfaceC5998h interfaceC5998h) {
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
        return interfaceC5998h == null ? j11 : interfaceC5998h.a(j11, true, true, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1<Float> j(InterfaceC6452i<Float> interfaceC6452i, boolean z10, Function0<Unit> function0, Composer composer, int i10, int i11) {
        boolean z11;
        float f10;
        composer.startReplaceGroup(-1221616274);
        if ((i11 & 4) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Hi.l
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
            objB2 = C6441b.b(f10, 0.0f, 2, null);
            composer.t(objB2);
        }
        C6439a c6439a = (C6439a) objB2;
        composer.P();
        Boolean boolValueOf = Boolean.valueOf(z10);
        composer.startReplaceGroup(-1224400529);
        boolean zD = composer.D(c6439a);
        boolean z12 = false;
        if ((((i10 & 112) ^ 48) > 32 && composer.a(z10)) || (i10 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean zD2 = zD | z11 | composer.D(interfaceC6452i);
        if ((((i10 & 896) ^ 384) > 256 && composer.V(function02)) || (i10 & 384) == 256) {
            z12 = true;
        }
        boolean z13 = zD2 | z12;
        Object objB3 = composer.B();
        if (z13 || objB3 == companion.a()) {
            Object eVar = new e(c6439a, z10, interfaceC6452i, function02, null);
            composer.t(eVar);
            objB3 = eVar;
        }
        composer.P();
        J.g(boolValueOf, (Function2) objB3, composer, (i10 >> 3) & 14);
        z1<Float> z1VarG = c6439a.g();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z1<Float> l(InterfaceC6452i<Float> interfaceC6452i, boolean z10, Composer composer, int i10) {
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
            objB = C6441b.b(f10, 0.0f, 2, null);
            composer.t(objB);
        }
        C6439a c6439a = (C6439a) objB;
        composer.P();
        Boolean boolValueOf = Boolean.valueOf(z10);
        composer.startReplaceGroup(-1746271574);
        boolean zD = composer.D(c6439a);
        if ((((i10 & 112) ^ 48) > 32 && composer.a(z10)) || (i10 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean zD2 = zD | z11 | composer.D(interfaceC6452i);
        Object objB2 = composer.B();
        if (zD2 || objB2 == companion.a()) {
            objB2 = new f(c6439a, z10, interfaceC6452i, null);
            composer.t(objB2);
        }
        composer.P();
        J.g(boolValueOf, (Function2) objB2, composer, (i10 >> 3) & 14);
        z1<Float> z1VarG = c6439a.g();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarG;
    }
}
