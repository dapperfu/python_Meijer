package W4;

import N4.AbstractC4333v;
import N4.C4322j;
import N4.InterfaceC4323k;
import O4.X;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.model.WorkSpec;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16644i;
import qv.C16669u0;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/impl/model/WorkSpec;", "spec", "Landroidx/work/c;", "worker", "LN4/k;", "foregroundUpdater", "LX4/b;", "taskExecutor", "", "b", "(Landroid/content/Context;Landroidx/work/impl/model/WorkSpec;Landroidx/work/c;LN4/k;LX4/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38486a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lqv/O;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, 50}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Void>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f38487a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.c f38488b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WorkSpec f38489c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC4323k f38490d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f38491e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.work.c cVar, WorkSpec workSpec, InterfaceC4323k interfaceC4323k, Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f38488b = cVar;
            this.f38489c = workSpec;
            this.f38490d = interfaceC4323k;
            this.f38491e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f38488b, this.f38489c, this.f38490d, this.f38491e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Void> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f38487a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                com.google.common.util.concurrent.q<C4322j> foregroundInfoAsync = this.f38488b.getForegroundInfoAsync();
                Intrinsics.i(foregroundInfoAsync, "worker.getForegroundInfoAsync()");
                androidx.work.c cVar = this.f38488b;
                this.f38487a = 1;
                obj = X.d(foregroundInfoAsync, cVar, this);
                if (obj != objF) {
                }
                return objF;
            }
            C4322j c4322j = (C4322j) obj;
            if (c4322j != null) {
                String str = I.f38486a;
                WorkSpec workSpec = this.f38489c;
                AbstractC4333v.e().a(str, "Updating notification for " + workSpec.workerClassName);
                com.google.common.util.concurrent.q<Void> qVarA = this.f38490d.a(this.f38491e, this.f38488b.getId(), c4322j);
                Intrinsics.i(qVarA, "foregroundUpdater.setFor…orker.id, foregroundInfo)");
                this.f38487a = 2;
                Object objA = androidx.concurrent.futures.e.a(qVarA, this);
                if (objA == objF) {
                    return objF;
                }
                return objA;
            }
            throw new IllegalStateException("Worker was marked important (" + this.f38489c.workerClassName + ") but did not provide ForegroundInfo");
        }
    }

    static {
        String strI = AbstractC4333v.i("WorkForegroundRunnable");
        Intrinsics.i(strI, "tagWithPrefix(\"WorkForegroundRunnable\")");
        f38486a = strI;
    }

    public static final Object b(Context context, WorkSpec workSpec, androidx.work.c cVar, InterfaceC4323k interfaceC4323k, X4.b bVar, Continuation<? super Unit> continuation) {
        if (!workSpec.expedited || Build.VERSION.SDK_INT >= 31) {
            return Unit.f142422a;
        }
        Executor executorA = bVar.a();
        Intrinsics.i(executorA, "taskExecutor.mainThreadExecutor");
        Object objG = C16644i.g(C16669u0.b(executorA), new a(cVar, workSpec, interfaceC4323k, context, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }
}
