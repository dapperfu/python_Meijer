package X4;

import O4.AbstractC4373v;
import O4.C4362j;
import O4.InterfaceC4363k;
import P4.X;
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
import mv.C15805i;
import mv.C15830u0;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/impl/model/WorkSpec;", "spec", "Landroidx/work/c;", "worker", "LO4/k;", "foregroundUpdater", "LY4/b;", "taskExecutor", "", "b", "(Landroid/content/Context;Landroidx/work/impl/model/WorkSpec;Landroidx/work/c;LO4/k;LY4/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private static final String f41556a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lmv/O;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {42, 50}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Void>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f41557a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.work.c f41558b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WorkSpec f41559c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC4363k f41560d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f41561e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.work.c cVar, WorkSpec workSpec, InterfaceC4363k interfaceC4363k, Context context, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f41558b = cVar;
            this.f41559c = workSpec;
            this.f41560d = interfaceC4363k;
            this.f41561e = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f41558b, this.f41559c, this.f41560d, this.f41561e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Void> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f41557a;
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
                com.google.common.util.concurrent.q<C4362j> foregroundInfoAsync = this.f41558b.getForegroundInfoAsync();
                Intrinsics.i(foregroundInfoAsync, "worker.getForegroundInfoAsync()");
                androidx.work.c cVar = this.f41558b;
                this.f41557a = 1;
                obj = X.d(foregroundInfoAsync, cVar, this);
                if (obj != objF) {
                }
                return objF;
            }
            C4362j c4362j = (C4362j) obj;
            if (c4362j != null) {
                String str = I.f41556a;
                WorkSpec workSpec = this.f41559c;
                AbstractC4373v.e().a(str, "Updating notification for " + workSpec.workerClassName);
                com.google.common.util.concurrent.q<Void> qVarA = this.f41560d.a(this.f41561e, this.f41558b.getId(), c4362j);
                Intrinsics.i(qVarA, "foregroundUpdater.setFor…orker.id, foregroundInfo)");
                this.f41557a = 2;
                Object objA = androidx.concurrent.futures.e.a(qVarA, this);
                if (objA == objF) {
                    return objF;
                }
                return objA;
            }
            throw new IllegalStateException("Worker was marked important (" + this.f41559c.workerClassName + ") but did not provide ForegroundInfo");
        }
    }

    static {
        String strI = AbstractC4373v.i("WorkForegroundRunnable");
        Intrinsics.i(strI, "tagWithPrefix(\"WorkForegroundRunnable\")");
        f41556a = strI;
    }

    public static final Object b(Context context, WorkSpec workSpec, androidx.work.c cVar, InterfaceC4363k interfaceC4363k, Y4.b bVar, Continuation<? super Unit> continuation) {
        if (!workSpec.expedited || Build.VERSION.SDK_INT >= 31) {
            return Unit.f143329a;
        }
        Executor executorA = bVar.a();
        Intrinsics.i(executorA, "taskExecutor.mainThreadExecutor");
        Object objG = C15805i.g(C15830u0.b(executorA), new a(cVar, workSpec, interfaceC4363k, context, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }
}
