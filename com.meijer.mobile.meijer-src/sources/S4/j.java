package S4;

import O4.AbstractC4373v;
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
import mv.AbstractC15779K;
import mv.C0;
import mv.C15784P;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010*$\b\u0002\u0010\u0015\"\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¨\u0006\u0016"}, d2 = {"LS4/i;", "Landroidx/work/impl/model/WorkSpec;", "spec", "Lmv/K;", "dispatcher", "LS4/f;", "listener", "Lmv/C0;", "c", "(LS4/i;Landroidx/work/impl/model/WorkSpec;Lmv/K;LS4/f;)Lmv/C0;", "Landroid/content/Context;", "context", "LS4/d;", "a", "(Landroid/content/Context;)LS4/d;", "", "Ljava/lang/String;", "TAG", "Lkotlin/Function1;", "LS4/b;", "", "OnConstraintState", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f34434a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {67}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34435a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f34436b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WorkSpec f34437c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f34438d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LS4/b;", "it", "", "a", "(LS4/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: S4.j$a$a, reason: collision with other inner class name */
        static final class C0770a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f34439a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WorkSpec f34440b;

            C0770a(f fVar, WorkSpec workSpec) {
                this.f34439a = fVar;
                this.f34440b = workSpec;
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(b bVar, Continuation<? super Unit> continuation) {
                this.f34439a.d(this.f34440b, bVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar, WorkSpec workSpec, f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f34436b = iVar;
            this.f34437c = workSpec;
            this.f34438d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f34436b, this.f34437c, this.f34438d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34435a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16561f<b> interfaceC16561fB = this.f34436b.b(this.f34437c);
                C0770a c0770a = new C0770a(this.f34438d, this.f34437c);
                this.f34435a = 1;
                if (interfaceC16561fB.collect(c0770a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    static {
        String strI = AbstractC4373v.i("WorkConstraintsTracker");
        Intrinsics.i(strI, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f34434a = strI;
    }

    public static final d a(Context context) {
        Intrinsics.j(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return new d((ConnectivityManager) systemService, 0L, 2, null);
    }

    public static final C0 c(i iVar, WorkSpec spec, AbstractC15779K dispatcher, f listener) {
        Intrinsics.j(iVar, "<this>");
        Intrinsics.j(spec, "spec");
        Intrinsics.j(dispatcher, "dispatcher");
        Intrinsics.j(listener, "listener");
        return C15809k.d(C15784P.a(dispatcher), null, null, new a(iVar, spec, listener, null), 3, null);
    }
}
