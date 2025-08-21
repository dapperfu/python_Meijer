package P4;

import O4.AbstractC4373v;
import O4.C4371t;
import O4.InterfaceC4354b;
import O4.InterfaceC4363k;
import O4.N;
import P4.V;
import W4.WorkGenerationalId;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.model.WorkSpec;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15805i;
import mv.F0;
import mv.InterfaceC15769A;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002(.B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u001d\u0010\u001f\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0!¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b&\u0010\rR\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010VR\u0014\u0010W\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102R\u0014\u0010Z\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010YR\u0011\u0010]\u001a\u00020[8F¢\u0006\u0006\u001a\u0004\bS\u0010\\¨\u0006^"}, d2 = {"LP4/V;", "", "LP4/V$a;", "builder", "<init>", "(LP4/V$a;)V", "LP4/V$b;", "v", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/c$a;", "result", "", "r", "(Landroidx/work/c$a;)Z", "", "stopReason", "u", "(I)Z", "n", "z", "()Z", "", "workSpecId", "", "p", "(Ljava/lang/String;)V", "s", "t", "y", "", "tags", "k", "(Ljava/util/List;)Ljava/lang/String;", "Lcom/google/common/util/concurrent/q;", "q", "()Lcom/google/common/util/concurrent/q;", "o", "(I)V", "x", "Landroidx/work/impl/model/WorkSpec;", "a", "Landroidx/work/impl/model/WorkSpec;", "m", "()Landroidx/work/impl/model/WorkSpec;", "workSpec", "Landroid/content/Context;", "b", "Landroid/content/Context;", "appContext", "c", "Ljava/lang/String;", "Landroidx/work/WorkerParameters$a;", "d", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "Landroidx/work/c;", "e", "Landroidx/work/c;", "builderWorker", "LY4/b;", "f", "LY4/b;", "workTaskExecutor", "Landroidx/work/a;", "g", "Landroidx/work/a;", "configuration", "LO4/b;", "h", "LO4/b;", "clock", "LV4/a;", "i", "LV4/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "j", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/impl/model/c;", "Landroidx/work/impl/model/c;", "workSpecDao", "LW4/a;", "l", "LW4/a;", "dependencyDao", "Ljava/util/List;", "workDescription", "Lmv/A;", "Lmv/A;", "workerJob", "LW4/h;", "()LW4/h;", "workGenerationalId", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WorkSpec workSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String workSpecId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters.a runtimeExtras;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.c builderWorker;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Y4.b workTaskExecutor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.a configuration;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4354b clock;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final V4.a foregroundProcessor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final WorkDatabase workDatabase;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final androidx.work.impl.model.c workSpecDao;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final W4.a dependencyDao;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List<String> tags;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String workDescription;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15769A workerJob;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b\u001d\u0010/R$\u00107\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b'\u00109\"\u0004\b:\u0010;¨\u0006<"}, d2 = {"LP4/V$a;", "", "Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "LY4/b;", "workTaskExecutor", "LV4/a;", "foregroundProcessor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "", "tags", "<init>", "(Landroid/content/Context;Landroidx/work/a;LY4/b;LV4/a;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/model/WorkSpec;Ljava/util/List;)V", "Landroidx/work/WorkerParameters$a;", "runtimeExtras", "k", "(Landroidx/work/WorkerParameters$a;)LP4/V$a;", "LP4/V;", "a", "()LP4/V;", "Landroidx/work/a;", "c", "()Landroidx/work/a;", "b", "LY4/b;", "i", "()LY4/b;", "LV4/a;", "d", "()LV4/a;", "Landroidx/work/impl/WorkDatabase;", "g", "()Landroidx/work/impl/WorkDatabase;", "e", "Landroidx/work/impl/model/WorkSpec;", "h", "()Landroidx/work/impl/model/WorkSpec;", "f", "Ljava/util/List;", "()Ljava/util/List;", "Landroid/content/Context;", "()Landroid/content/Context;", "appContext", "Landroidx/work/c;", "Landroidx/work/c;", "j", "()Landroidx/work/c;", "setWorker", "(Landroidx/work/c;)V", "worker", "Landroidx/work/WorkerParameters$a;", "()Landroidx/work/WorkerParameters$a;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$a;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final androidx.work.a configuration;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Y4.b workTaskExecutor;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final V4.a foregroundProcessor;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final WorkDatabase workDatabase;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final WorkSpec workSpec;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final List<String> tags;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final Context appContext;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private androidx.work.c worker;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private WorkerParameters.a runtimeExtras;

        @SuppressLint({"LambdaLast"})
        public a(Context context, androidx.work.a configuration, Y4.b workTaskExecutor, V4.a foregroundProcessor, WorkDatabase workDatabase, WorkSpec workSpec, List<String> tags) {
            Intrinsics.j(context, "context");
            Intrinsics.j(configuration, "configuration");
            Intrinsics.j(workTaskExecutor, "workTaskExecutor");
            Intrinsics.j(foregroundProcessor, "foregroundProcessor");
            Intrinsics.j(workDatabase, "workDatabase");
            Intrinsics.j(workSpec, "workSpec");
            Intrinsics.j(tags, "tags");
            this.configuration = configuration;
            this.workTaskExecutor = workTaskExecutor;
            this.foregroundProcessor = foregroundProcessor;
            this.workDatabase = workDatabase;
            this.workSpec = workSpec;
            this.tags = tags;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.i(applicationContext, "context.applicationContext");
            this.appContext = applicationContext;
            this.runtimeExtras = new WorkerParameters.a();
        }

        public final V a() {
            return new V(this);
        }

        /* renamed from: b, reason: from getter */
        public final Context getAppContext() {
            return this.appContext;
        }

        /* renamed from: c, reason: from getter */
        public final androidx.work.a getConfiguration() {
            return this.configuration;
        }

        /* renamed from: d, reason: from getter */
        public final V4.a getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        /* renamed from: e, reason: from getter */
        public final WorkerParameters.a getRuntimeExtras() {
            return this.runtimeExtras;
        }

        public final List<String> f() {
            return this.tags;
        }

        /* renamed from: g, reason: from getter */
        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        /* renamed from: h, reason: from getter */
        public final WorkSpec getWorkSpec() {
            return this.workSpec;
        }

        /* renamed from: i, reason: from getter */
        public final Y4.b getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        /* renamed from: j, reason: from getter */
        public final androidx.work.c getWorker() {
            return this.worker;
        }

        public final a k(WorkerParameters.a runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LP4/V$b;", "", "<init>", "()V", "a", "b", "c", "LP4/V$b$a;", "LP4/V$b$b;", "LP4/V$b$c;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LP4/V$b$a;", "LP4/V$b;", "Landroidx/work/c$a;", "result", "<init>", "(Landroidx/work/c$a;)V", "a", "Landroidx/work/c$a;", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final c.a result;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c.a result) {
                super(null);
                Intrinsics.j(result, "result");
                this.result = result;
            }

            /* renamed from: a, reason: from getter */
            public final c.a getResult() {
                return this.result;
            }

            public /* synthetic */ a(c.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? new c.a.C1171a() : aVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LP4/V$b$b;", "LP4/V$b;", "Landroidx/work/c$a;", "result", "<init>", "(Landroidx/work/c$a;)V", "a", "Landroidx/work/c$a;", "()Landroidx/work/c$a;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: P4.V$b$b, reason: collision with other inner class name */
        public static final class C0423b extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final c.a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0423b(c.a result) {
                super(null);
                Intrinsics.j(result, "result");
                this.result = result;
            }

            /* renamed from: a, reason: from getter */
            public final c.a getResult() {
                return this.result;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"LP4/V$b$c;", "LP4/V$b;", "", "reason", "<init>", "(I)V", "a", "I", "()I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final int reason;

            public c() {
                this(0, 1, null);
            }

            public c(int i10) {
                super(null);
                this.reason = i10;
            }

            /* renamed from: a, reason: from getter */
            public final int getReason() {
                return this.reason;
            }

            public /* synthetic */ c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? -256 : i10);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)Z"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.WorkerWrapper$launch$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f25526a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LP4/V$b;", "<anonymous>", "(Lmv/O;)LP4/V$b;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super b>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f25528a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ V f25529b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(V v10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f25529b = v10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f25529b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super b> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f25528a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                V v10 = this.f25529b;
                this.f25528a = 1;
                Object objV = v10.v(this);
                if (objV == objF) {
                    return objF;
                }
                return objV;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean g(b bVar, V v10) {
            boolean zU;
            if (bVar instanceof b.C0423b) {
                zU = v10.r(((b.C0423b) bVar).getResult());
            } else if (bVar instanceof b.a) {
                v10.x(((b.a) bVar).getResult());
                zU = false;
            } else {
                if (!(bVar instanceof b.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                zU = v10.u(((b.c) bVar).getReason());
            }
            return Boolean.valueOf(zU);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return V.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Boolean> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final b aVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f25526a;
            int i11 = 1;
            c.a aVar2 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15769A interfaceC15769A = V.this.workerJob;
                    a aVar3 = new a(V.this, null);
                    this.f25526a = 1;
                    obj = C15805i.g(interfaceC15769A, aVar3, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                aVar = (b) obj;
            } catch (WorkerStoppedException e10) {
                aVar = new b.c(e10.getReason());
            } catch (CancellationException unused) {
                aVar = new b.a(aVar2, i11, objArr3 == true ? 1 : 0);
            } catch (Throwable th2) {
                AbstractC4373v.e().d(X.f25545a, "Unexpected error in WorkerWrapper", th2);
                aVar = new b.a(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = V.this.workDatabase;
            final V v10 = V.this;
            Object objRunInTransaction = workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: P4.W
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return V.c.g(aVar, v10);
                }
            });
            Intrinsics.i(objRunInTransaction, "workDatabase.runInTransa…          }\n            )");
            return objRunInTransaction;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", l = {299}, m = "runWorker")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f25530a;

        /* renamed from: b, reason: collision with root package name */
        Object f25531b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f25532c;

        /* renamed from: e, reason: collision with root package name */
        int f25534e;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f25532c = obj;
            this.f25534e |= Integer.MIN_VALUE;
            return V.this.v(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.work.c f25535f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f25536g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f25537h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ V f25538i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.work.c cVar, boolean z10, String str, V v10) {
            super(1);
            this.f25535f = cVar;
            this.f25536g = z10;
            this.f25537h = str;
            this.f25538i = v10;
        }

        public final void a(Throwable th2) {
            if (th2 instanceof WorkerStoppedException) {
                this.f25535f.stop(((WorkerStoppedException) th2).getReason());
            }
            if (!this.f25536g || this.f25537h == null) {
                return;
            }
            this.f25538i.configuration.getTracer().b(this.f25537h, this.f25538i.getWorkSpec().hashCode());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "Landroidx/work/c$a;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lmv/O;)Landroidx/work/c$a;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", l = {HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 311}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super c.a>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f25539a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.work.c f25541c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC4363k f25542d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.work.c cVar, InterfaceC4363k interfaceC4363k, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f25541c = cVar;
            this.f25542d = interfaceC4363k;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return V.this.new f(this.f25541c, this.f25542d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super c.a> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            f fVar;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f25539a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                fVar = this;
            } else {
                ResultKt.b(obj);
                Context context = V.this.appContext;
                WorkSpec workSpec = V.this.getWorkSpec();
                androidx.work.c cVar = this.f25541c;
                InterfaceC4363k interfaceC4363k = this.f25542d;
                Y4.b bVar = V.this.workTaskExecutor;
                this.f25539a = 1;
                fVar = this;
                if (X4.I.b(context, workSpec, cVar, interfaceC4363k, bVar, fVar) != objF) {
                }
                return objF;
            }
            String str = X.f25545a;
            V v10 = V.this;
            AbstractC4373v.e().a(str, "Starting work for " + v10.getWorkSpec().workerClassName);
            com.google.common.util.concurrent.q<c.a> qVarStartWork = fVar.f25541c.startWork();
            Intrinsics.i(qVarStartWork, "worker.startWork()");
            androidx.work.c cVar2 = fVar.f25541c;
            fVar.f25539a = 2;
            Object objD = X.d(qVarStartWork, cVar2, this);
            if (objD == objF) {
                return objF;
            }
            return objD;
        }
    }

    public V(a builder) {
        Intrinsics.j(builder, "builder");
        WorkSpec workSpec = builder.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String;
        this.runtimeExtras = builder.getRuntimeExtras();
        this.builderWorker = builder.getWorker();
        this.workTaskExecutor = builder.getWorkTaskExecutor();
        androidx.work.a configuration = builder.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = builder.getForegroundProcessor();
        WorkDatabase workDatabase = builder.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.l();
        this.dependencyDao = workDatabase.g();
        List<String> listF = builder.f();
        this.tags = listF;
        this.workDescription = k(listF);
        this.workerJob = F0.b(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean A(V v10) {
        boolean z10;
        if (v10.workSpecDao.i(v10.workSpecId) == N.c.ENQUEUED) {
            v10.workSpecDao.w(N.c.RUNNING, v10.workSpecId);
            v10.workSpecDao.A(v10.workSpecId);
            v10.workSpecDao.e(v10.workSpecId, -256);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private final String k(List<String> tags) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + CollectionsKt.B0(tags, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    private final boolean n(c.a result) {
        if (result instanceof c.a.C1172c) {
            String str = X.f25545a;
            AbstractC4373v.e().f(str, "Worker result SUCCESS for " + this.workDescription);
            return this.workSpec.n() ? t() : y(result);
        }
        if (result instanceof c.a.b) {
            String str2 = X.f25545a;
            AbstractC4373v.e().f(str2, "Worker result RETRY for " + this.workDescription);
            return s(-256);
        }
        String str3 = X.f25545a;
        AbstractC4373v.e().f(str3, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.n()) {
            return t();
        }
        if (result == null) {
            result = new c.a.C1171a();
        }
        return x(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean r(c.a result) {
        N.c cVarI = this.workSpecDao.i(this.workSpecId);
        this.workDatabase.k().a(this.workSpecId);
        if (cVarI == null) {
            return false;
        }
        if (cVarI == N.c.RUNNING) {
            return n(result);
        }
        if (cVarI.b()) {
            return false;
        }
        return s(-512);
    }

    private final boolean s(int stopReason) {
        this.workSpecDao.w(N.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.u(this.workSpecId, this.clock.a());
        this.workSpecDao.C(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.p(this.workSpecId, -1L);
        this.workSpecDao.e(this.workSpecId, stopReason);
        return true;
    }

    private final boolean t() {
        this.workSpecDao.u(this.workSpecId, this.clock.a());
        this.workSpecDao.w(N.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.y(this.workSpecId);
        this.workSpecDao.C(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.c(this.workSpecId);
        this.workSpecDao.p(this.workSpecId, -1L);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(int stopReason) {
        N.c cVarI = this.workSpecDao.i(this.workSpecId);
        if (cVarI == null || cVarI.b()) {
            String str = X.f25545a;
            AbstractC4373v.e().a(str, "Status for " + this.workSpecId + " is " + cVarI + " ; not doing any work");
            return false;
        }
        String str2 = X.f25545a;
        AbstractC4373v.e().a(str2, "Status for " + this.workSpecId + " is " + cVarI + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.w(N.c.ENQUEUED, this.workSpecId);
        this.workSpecDao.e(this.workSpecId, stopReason);
        this.workSpecDao.p(this.workSpecId, -1L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(kotlin.coroutines.Continuation<? super P4.V.b> r23) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.V.v(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean w(V v10) {
        WorkSpec workSpec = v10.workSpec;
        if (workSpec.state != N.c.ENQUEUED) {
            String str = X.f25545a;
            AbstractC4373v.e().a(str, v10.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!workSpec.n() && !v10.workSpec.m()) || v10.clock.a() >= v10.workSpec.c()) {
            return Boolean.FALSE;
        }
        AbstractC4373v.e().a(X.f25545a, "Delaying execution for " + v10.workSpec.workerClassName + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    private final boolean y(c.a result) {
        this.workSpecDao.w(N.c.SUCCEEDED, this.workSpecId);
        Intrinsics.h(result, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        androidx.work.b bVarD = ((c.a.C1172c) result).d();
        Intrinsics.i(bVarD, "success.outputData");
        this.workSpecDao.t(this.workSpecId, bVarD);
        long jA = this.clock.a();
        for (String str : this.dependencyDao.b(this.workSpecId)) {
            if (this.workSpecDao.i(str) == N.c.BLOCKED && this.dependencyDao.c(str)) {
                String str2 = X.f25545a;
                AbstractC4373v.e().f(str2, "Setting status to enqueued for " + str);
                this.workSpecDao.w(N.c.ENQUEUED, str);
                this.workSpecDao.u(str, jA);
            }
        }
        return false;
    }

    private final boolean z() {
        Object objRunInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: P4.U
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return V.A(this.f25498a);
            }
        });
        Intrinsics.i(objRunInTransaction, "workDatabase.runInTransa…e\n            }\n        )");
        return ((Boolean) objRunInTransaction).booleanValue();
    }

    public final WorkGenerationalId l() {
        return W4.p.a(this.workSpec);
    }

    /* renamed from: m, reason: from getter */
    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    public final void o(int stopReason) {
        this.workerJob.d(new WorkerStoppedException(stopReason));
    }

    public final com.google.common.util.concurrent.q<Boolean> q() {
        return C4371t.k(this.workTaskExecutor.b().n0(F0.b(null, 1, null)), null, new c(null), 2, null);
    }

    public final boolean x(c.a result) {
        Intrinsics.j(result, "result");
        p(this.workSpecId);
        androidx.work.b bVarD = ((c.a.C1171a) result).d();
        Intrinsics.i(bVarD, "failure.outputData");
        this.workSpecDao.C(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.t(this.workSpecId, bVarD);
        return false;
    }

    private final void p(String workSpecId) {
        List listS = CollectionsKt.s(workSpecId);
        while (!listS.isEmpty()) {
            String str = (String) CollectionsKt.M(listS);
            if (this.workSpecDao.i(str) != N.c.CANCELLED) {
                this.workSpecDao.w(N.c.FAILED, str);
            }
            listS.addAll(this.dependencyDao.b(str));
        }
    }
}
