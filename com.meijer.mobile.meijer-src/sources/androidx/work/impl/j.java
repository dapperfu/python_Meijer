package androidx.work.impl;

import O4.H;
import P4.C4584t;
import P4.InterfaceC4586v;
import P4.M;
import P4.O;
import U4.n;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import mv.AbstractC15779K;
import mv.C15784P;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aá\u0001\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0097\u0001\b\u0002\u0010\u0012\u001a\u0090\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\fj\u0002`\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aE\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u001b* \u0002\u0010\u001c\"\u008c\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f2\u008c\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f¨\u0006\u001d"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "LY4/b;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "LU4/n;", "trackers", "LP4/t;", "processor", "Lkotlin/Function6;", "Lkotlin/ParameterName;", "name", "", "LP4/v;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "LP4/O;", "d", "(Landroid/content/Context;Landroidx/work/a;LY4/b;Landroidx/work/impl/WorkDatabase;LU4/n;LP4/t;Lkotlin/jvm/functions/Function6;)LP4/O;", "b", "(Landroid/content/Context;Landroidx/work/a;LY4/b;Landroidx/work/impl/WorkDatabase;LU4/n;LP4/t;)Ljava/util/List;", "taskExecutor", "Lmv/O;", "f", "(LY4/b;)Lmv/O;", "SchedulersCreator", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function6<Context, androidx.work.a, Y4.b, WorkDatabase, n, C4584t, List<? extends InterfaceC4586v>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f59439b = new a();

        a() {
            super(6, j.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        @Override // kotlin.jvm.functions.Function6
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<InterfaceC4586v> h(Context p02, androidx.work.a p12, Y4.b p22, WorkDatabase p32, n p42, C4584t p52) {
            Intrinsics.j(p02, "p0");
            Intrinsics.j(p12, "p1");
            Intrinsics.j(p22, "p2");
            Intrinsics.j(p32, "p3");
            Intrinsics.j(p42, "p4");
            Intrinsics.j(p52, "p5");
            return j.b(p02, p12, p22, p32, p42, p52);
        }
    }

    @JvmOverloads
    @JvmName
    public static final O c(Context context, androidx.work.a configuration) {
        Intrinsics.j(context, "context");
        Intrinsics.j(configuration, "configuration");
        return e(context, configuration, null, null, null, null, null, 124, null);
    }

    @JvmOverloads
    @JvmName
    public static final O d(Context context, androidx.work.a configuration, Y4.b workTaskExecutor, WorkDatabase workDatabase, n trackers, C4584t processor, Function6<? super Context, ? super androidx.work.a, ? super Y4.b, ? super WorkDatabase, ? super n, ? super C4584t, ? extends List<? extends InterfaceC4586v>> schedulersCreator) {
        Intrinsics.j(context, "context");
        Intrinsics.j(configuration, "configuration");
        Intrinsics.j(workTaskExecutor, "workTaskExecutor");
        Intrinsics.j(workDatabase, "workDatabase");
        Intrinsics.j(trackers, "trackers");
        Intrinsics.j(processor, "processor");
        Intrinsics.j(schedulersCreator, "schedulersCreator");
        return new O(context.getApplicationContext(), configuration, workTaskExecutor, workDatabase, schedulersCreator.h(context, configuration, workTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static /* synthetic */ O e(Context context, androidx.work.a aVar, Y4.b bVar, WorkDatabase workDatabase, n nVar, C4584t c4584t, Function6 function6, int i10, Object obj) {
        n nVar2;
        if ((i10 & 4) != 0) {
            bVar = new Y4.c(aVar.getTaskExecutor());
        }
        Y4.b bVar2 = bVar;
        if ((i10 & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.i(applicationContext, "context.applicationContext");
            Y4.a aVarC = bVar2.c();
            Intrinsics.i(aVarC, "workTaskExecutor.serialTaskExecutor");
            workDatabase = companion.b(applicationContext, aVarC, aVar.getClock(), context.getResources().getBoolean(H.f23101a));
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            Intrinsics.i(applicationContext2, "context.applicationContext");
            nVar2 = new n(applicationContext2, bVar2, null, null, null, null, 60, null);
        } else {
            nVar2 = nVar;
        }
        return d(context, aVar, bVar2, workDatabase, nVar2, (i10 & 32) != 0 ? new C4584t(context.getApplicationContext(), aVar, bVar2, workDatabase) : c4584t, (i10 & 64) != 0 ? a.f59439b : function6);
    }

    @JvmName
    public static final InterfaceC15783O f(Y4.b taskExecutor) {
        Intrinsics.j(taskExecutor, "taskExecutor");
        AbstractC15779K abstractC15779KB = taskExecutor.b();
        Intrinsics.i(abstractC15779KB, "taskExecutor.taskCoroutineDispatcher");
        return C15784P.a(abstractC15779KB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<InterfaceC4586v> b(Context context, androidx.work.a aVar, Y4.b bVar, WorkDatabase workDatabase, n nVar, C4584t c4584t) {
        InterfaceC4586v interfaceC4586vC = androidx.work.impl.a.c(context, workDatabase, aVar);
        Intrinsics.i(interfaceC4586vC, "createBestAvailableBackg…kDatabase, configuration)");
        return CollectionsKt.p(interfaceC4586vC, new Q4.b(context, aVar, nVar, c4584t, new M(c4584t, bVar), bVar));
    }
}
