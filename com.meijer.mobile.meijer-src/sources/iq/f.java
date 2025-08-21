package iq;

import Ki.LocalThemeScope;
import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.z1;
import iq.C14839A;
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
import mv.InterfaceC15783O;
import pv.C16563h;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"LKi/M;", "Liq/A;", "viewModel", "", "d", "(LKi/M;Liq/A;Landroidx/compose/runtime/Composer;II)V", "Liq/E;", "viewState", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartRouteKt$CartRoute$2$1", f = "ShopAndScanCartRoute.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f139035a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f139036b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C14839A f139037c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f139038d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f139039e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liq/A$b;", "effect", "", "<anonymous>", "(Liq/A$b;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.shopandscan.presentation.view.cart.ShopAndScanCartRouteKt$CartRoute$2$1$1", f = "ShopAndScanCartRoute.kt", l = {}, m = "invokeSuspend")
        /* renamed from: iq.f$a$a, reason: collision with other inner class name */
        static final class C2206a extends SuspendLambda implements Function2<C14839A.b, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f139040a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f139041b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f139042c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C14839A f139043d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Context f139044e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2206a(Activity activity, C14839A c14839a, Context context, Continuation<? super C2206a> continuation) {
                super(2, continuation);
                this.f139042c = activity;
                this.f139043d = c14839a;
                this.f139044e = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C2206a c2206a = new C2206a(this.f139042c, this.f139043d, this.f139044e, continuation);
                c2206a.f139041b = obj;
                return c2206a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C14839A.b bVar, Continuation<? super Unit> continuation) {
                return ((C2206a) create(bVar, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f139040a == 0) {
                    ResultKt.b(obj);
                    if (((C14839A.b) this.f139041b) instanceof C14839A.b.a) {
                        Activity activity = this.f139042c;
                        if (activity != null) {
                            activity.startActivity(this.f139043d.I(this.f139044e));
                        }
                        return Unit.f143329a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C14839A c14839a, Activity activity, Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f139037c = c14839a;
            this.f139038d = activity;
            this.f139039e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f139037c, this.f139038d, this.f139039e, continuation);
            aVar.f139036b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f139035a == 0) {
                ResultKt.b(obj);
                C16563h.J(C16563h.O(this.f139037c.G(), new C2206a(this.f139038d, this.f139037c, this.f139039e, null)), (InterfaceC15783O) this.f139036b);
                return Unit.f143329a;
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
    public static final void d(Ki.LocalThemeScope r10, final iq.C14839A r11, androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: iq.f.d(Ki.M, iq.A, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Activity activity) {
        if (activity != null) {
            activity.finish();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(C14839A c14839a, AbstractC14842b event) {
        Intrinsics.j(event, "event");
        c14839a.L(event);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, C14839A c14839a, int i10, int i11, Composer composer, int i12) {
        d(localThemeScope, c14839a, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final ShopAndScanCartViewState e(z1<ShopAndScanCartViewState> z1Var) {
        return z1Var.getValue();
    }
}
