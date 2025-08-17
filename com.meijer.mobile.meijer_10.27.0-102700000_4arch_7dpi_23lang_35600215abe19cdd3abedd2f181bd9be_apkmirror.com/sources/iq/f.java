package iq;

import Ji.LocalThemeScope;
import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.z1;
import iq.C14751A;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;
import tv.C17154h;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Liq/A;", "viewModel", "", "d", "(LJi/M;Liq/A;Landroidx/compose/runtime/Composer;II)V", "Liq/E;", "viewState", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartRouteKt$CartRoute$2$1", f = "ShopAndScanCartRoute.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f138393a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f138394b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C14751A f138395c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f138396d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f138397e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liq/A$b;", "effect", "", "<anonymous>", "(Liq/A$b;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartRouteKt$CartRoute$2$1$1", f = "ShopAndScanCartRoute.kt", l = {}, m = "invokeSuspend")
        /* renamed from: iq.f$a$a, reason: collision with other inner class name */
        static final class C2186a extends SuspendLambda implements Function2<C14751A.b, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f138398a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f138399b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f138400c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C14751A f138401d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Context f138402e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2186a(Activity activity, C14751A c14751a, Context context, Continuation<? super C2186a> continuation) {
                super(2, continuation);
                this.f138400c = activity;
                this.f138401d = c14751a;
                this.f138402e = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2186a c2186a = new C2186a(this.f138400c, this.f138401d, this.f138402e, continuation);
                c2186a.f138399b = obj;
                return c2186a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C14751A.b bVar, Continuation<? super Unit> continuation) {
                return ((C2186a) create(bVar, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f138398a == 0) {
                    ResultKt.b(obj);
                    if (((C14751A.b) this.f138399b) instanceof C14751A.b.a) {
                        Activity activity = this.f138400c;
                        if (activity != null) {
                            activity.startActivity(this.f138401d.I(this.f138402e));
                        }
                        return Unit.f142422a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C14751A c14751a, Activity activity, Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f138395c = c14751a;
            this.f138396d = activity;
            this.f138397e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f138395c, this.f138396d, this.f138397e, continuation);
            aVar.f138394b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f138393a == 0) {
                ResultKt.b(obj);
                C17154h.J(C17154h.O(this.f138395c.G(), new C2186a(this.f138396d, this.f138395c, this.f138397e, null)), (InterfaceC16622O) this.f138394b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(Ji.LocalThemeScope r10, final iq.C14751A r11, androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iq.f.d(Ji.M, iq.A, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Activity activity) {
        if (activity != null) {
            activity.finish();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(C14751A c14751a, AbstractC14754b event) {
        Intrinsics.j(event, "event");
        c14751a.L(event);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, C14751A c14751a, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, c14751a, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    private static final ShopAndScanCartViewState e(z1<ShopAndScanCartViewState> z1Var) {
        return z1Var.getValue();
    }
}
