package ps;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import kotlin.C17932e0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import ps.C16381K;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lps/g;", "navigationHelper", "Lx0/e0;", "drawerState", "Lqv/O;", "coroutineScope", "", "b", "(Lps/g;Lx0/e0;Lqv/O;Landroidx/compose/runtime/Composer;I)V", "navigation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ps.K, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C16381K {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerToggleEffectKt$NavigationDrawerToggleEffect$1$1", f = "NavigationDrawerToggleEffect.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ps.K$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f156388a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C16395g f156389b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f156390c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17932e0 f156391d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerToggleEffectKt$NavigationDrawerToggleEffect$1$1$1$1", f = "NavigationDrawerToggleEffect.kt", l = {25}, m = "invokeSuspend")
        /* renamed from: ps.K$a$a, reason: collision with other inner class name */
        static final class C2426a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f156392a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17932e0 f156393b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2426a(C17932e0 c17932e0, Continuation<? super C2426a> continuation) {
                super(2, continuation);
                this.f156393b = c17932e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2426a(this.f156393b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C2426a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f156392a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17932e0 c17932e0 = this.f156393b;
                    this.f156392a = 1;
                    if (c17932e0.b(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.ui.navigation.NavigationDrawerToggleEffectKt$NavigationDrawerToggleEffect$1$1$2$1", f = "NavigationDrawerToggleEffect.kt", l = {29}, m = "invokeSuspend")
        /* renamed from: ps.K$a$b */
        static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f156394a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C17932e0 f156395b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C17932e0 c17932e0, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f156395b = c17932e0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new b(this.f156395b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f156394a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    C17932e0 c17932e0 = this.f156395b;
                    this.f156394a = 1;
                    if (c17932e0.f(this) == objF) {
                        return objF;
                    }
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C16395g c16395g, InterfaceC16622O interfaceC16622O, C17932e0 c17932e0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f156389b = c16395g;
            this.f156390c = interfaceC16622O;
            this.f156391d = c17932e0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(InterfaceC16622O interfaceC16622O, C17932e0 c17932e0) {
            C16648k.d(interfaceC16622O, null, null, new C2426a(c17932e0, null), 3, null);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(InterfaceC16622O interfaceC16622O, C17932e0 c17932e0) {
            C16648k.d(interfaceC16622O, null, null, new b(c17932e0, null), 3, null);
            return Unit.f142422a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f156389b, this.f156390c, this.f156391d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f156388a == 0) {
                ResultKt.b(obj);
                C16395g c16395g = this.f156389b;
                final InterfaceC16622O interfaceC16622O = this.f156390c;
                final C17932e0 c17932e0 = this.f156391d;
                c16395g.l(new Function0() { // from class: ps.I
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16381K.a.k(interfaceC16622O, c17932e0);
                    }
                });
                C16395g c16395g2 = this.f156389b;
                final InterfaceC16622O interfaceC16622O2 = this.f156390c;
                final C17932e0 c17932e02 = this.f156391d;
                c16395g2.m(new Function0() { // from class: ps.J
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C16381K.a.l(interfaceC16622O2, c17932e02);
                    }
                });
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void b(final C16395g navigationHelper, final C17932e0 drawerState, final InterfaceC16622O coroutineScope, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(navigationHelper, "navigationHelper");
        Intrinsics.j(drawerState, "drawerState");
        Intrinsics.j(coroutineScope, "coroutineScope");
        Composer composerStartRestartGroup = composer.startRestartGroup(1746683297);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(navigationHelper) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(drawerState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(coroutineScope) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1746683297, i11, -1, "com.meijer.mobile.ui.navigation.NavigationDrawerToggleEffect (NavigationDrawerToggleEffect.kt:21)");
            }
            Boolean bool = Boolean.TRUE;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD = ((i11 & 112) == 32) | composerStartRestartGroup.D(navigationHelper) | composerStartRestartGroup.D(coroutineScope);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new a(navigationHelper, coroutineScope, drawerState, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(bool, (Function2) objB, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: ps.H
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16381K.c(navigationHelper, drawerState, coroutineScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(C16395g c16395g, C17932e0 c17932e0, InterfaceC16622O interfaceC16622O, int i10, Composer composer, int i11) {
        b(c16395g, c17932e0, interfaceC16622O, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }
}
