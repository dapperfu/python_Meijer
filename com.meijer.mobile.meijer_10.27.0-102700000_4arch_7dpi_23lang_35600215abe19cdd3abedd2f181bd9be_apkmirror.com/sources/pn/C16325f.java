package pn;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15339A;
import l0.InterfaceC15349i;
import pn.C16325f;
import qv.InterfaceC16622O;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import xk.C18066d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll0/A;", "listState", "", "buffer", "Lkotlin/Function0;", "", "onLoadMore", "e", "(Ll0/A;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: pn.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C16325f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.LazyScrollListenerKt$LazyScrollListener$1$1", f = "LazyScrollListener.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: pn.f$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f155974a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1<Boolean> f155975b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f155976c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pn.f$a$a, reason: collision with other inner class name */
        static final class C2422a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f155977a;

            C2422a(Function0<Unit> function0) {
                this.f155977a = function0;
            }

            public final Object a(boolean z10, Continuation<? super Unit> continuation) {
                if (z10) {
                    this.f155977a.invoke();
                }
                return Unit.f142422a;
            }

            @Override // tv.InterfaceC17153g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z1<Boolean> z1Var, Function0<Unit> function0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f155975b = z1Var;
            this.f155976c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f155975b, this.f155976c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean g(z1 z1Var) {
            return ((Boolean) z1Var.getValue()).booleanValue();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f155974a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final z1<Boolean> z1Var = this.f155975b;
                InterfaceC17152f interfaceC17152fQ = o1.q(new Function0() { // from class: pn.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(C16325f.a.g(z1Var));
                    }
                });
                C2422a c2422a = new C2422a(this.f155976c);
                this.f155974a = 1;
                if (interfaceC17152fQ.collect(c2422a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i10, int i11) {
        return i10 - i11;
    }

    public static final void e(final C15339A listState, final int i10, final Function0<Unit> onLoadMore, Composer composer, final int i11, final int i12) {
        int i13;
        Intrinsics.j(listState, "listState");
        Intrinsics.j(onLoadMore, "onLoadMore");
        Composer composerStartRestartGroup = composer.startRestartGroup(676606);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (composerStartRestartGroup.V(listState) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= composerStartRestartGroup.d(i10) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= composerStartRestartGroup.D(onLoadMore) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i14 != 0) {
                i10 = 10;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(676606, i13, -1, "com.meijer.mobile.meijer.activity.orders.screens.orderhistory.LazyScrollListener (LazyScrollListener.kt:22)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = o1.e(new Function0() { // from class: pn.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(C16325f.f(listState, i10));
                    }
                });
                composerStartRestartGroup.t(objB);
            }
            z1 z1Var = (z1) objB;
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = (i13 & 896) == 256;
            Object objB2 = composerStartRestartGroup.B();
            if (z10 || objB2 == companion.a()) {
                objB2 = new a(z1Var, onLoadMore, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            androidx.compose.runtime.J.g(z1Var, (Function2) objB2, composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final int i15 = i10;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: pn.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C16325f.i(listState, i15, onLoadMore, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(C15339A c15339a, int i10, Function0 function0, int i11, int i12, Composer composer, int i13) {
        e(c15339a, i10, function0, composer, J0.a(i11 | 1), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(C15339A c15339a, final int i10) {
        Integer numValueOf;
        l0.n nVarX = c15339a.x();
        final int totalItemsCount = nVarX.getTotalItemsCount();
        InterfaceC15349i interfaceC15349i = (InterfaceC15349i) CollectionsKt.F0(nVarX.h());
        Integer num = null;
        if (interfaceC15349i != null) {
            numValueOf = Integer.valueOf(interfaceC15349i.getIndex());
        } else {
            numValueOf = null;
        }
        int iB = C18066d.b(numValueOf, new Function0() { // from class: pn.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C16325f.g());
            }
        }) + 1;
        Integer numValueOf2 = Integer.valueOf(totalItemsCount - i10);
        if (i10 < totalItemsCount) {
            num = numValueOf2;
        }
        if (iB > C18066d.b(num, new Function0() { // from class: pn.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(C16325f.h(i10, totalItemsCount));
            }
        })) {
            return true;
        }
        return false;
    }
}
