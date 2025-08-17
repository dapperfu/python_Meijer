package R4;

import N4.AbstractC4333v;
import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.AbstractC16618K;
import qv.C0;
import qv.C16623P;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010*$\b\u0002\u0010\u0015\"\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¨\u0006\u0016"}, d2 = {"LR4/i;", "Landroidx/work/impl/model/WorkSpec;", "spec", "Lqv/K;", "dispatcher", "LR4/f;", "listener", "Lqv/C0;", "c", "(LR4/i;Landroidx/work/impl/model/WorkSpec;Lqv/K;LR4/f;)Lqv/C0;", "Landroid/content/Context;", "context", "LR4/d;", "a", "(Landroid/content/Context;)LR4/d;", "", "Ljava/lang/String;", "TAG", "Lkotlin/Function1;", "LR4/b;", "", "OnConstraintState", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f31896a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {67}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f31897a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f31898b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WorkSpec f31899c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f31900d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR4/b;", "it", "", "a", "(LR4/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: R4.j$a$a, reason: collision with other inner class name */
        static final class C0720a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f31901a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WorkSpec f31902b;

            C0720a(f fVar, WorkSpec workSpec) {
                this.f31901a = fVar;
                this.f31902b = workSpec;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, Continuation<? super Unit> continuation) {
                this.f31901a.e(this.f31902b, bVar);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, WorkSpec workSpec, f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31898b = iVar;
            this.f31899c = workSpec;
            this.f31900d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f31898b, this.f31899c, this.f31900d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f31897a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f<b> interfaceC17152fB = this.f31898b.b(this.f31899c);
                C0720a c0720a = new C0720a(this.f31900d, this.f31899c);
                this.f31897a = 1;
                if (interfaceC17152fB.collect(c0720a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    static {
        String strI = AbstractC4333v.i("WorkConstraintsTracker");
        Intrinsics.i(strI, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f31896a = strI;
    }

    public static final d a(Context context) {
        Intrinsics.j(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new d((ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final C0 c(i iVar, WorkSpec spec, AbstractC16618K dispatcher, f listener) {
        Intrinsics.j(iVar, "<this>");
        Intrinsics.j(spec, "spec");
        Intrinsics.j(dispatcher, "dispatcher");
        Intrinsics.j(listener, "listener");
        return C16648k.d(C16623P.a(dispatcher), null, null, new a(iVar, spec, listener, null), 3, null);
    }
}
