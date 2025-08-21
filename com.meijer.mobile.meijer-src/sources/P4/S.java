package P4;

import O4.EnumC4361i;
import O4.N;
import O4.O;
import X4.C5557f;
import X4.C5558g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LP4/t;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "LP4/v;", "schedulers", "Landroidx/work/impl/model/WorkSpec;", "newWorkSpec", "", "", "tags", "LO4/O$b;", "d", "(LP4/t;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Landroidx/work/impl/model/WorkSpec;Ljava/util/Set;)LO4/O$b;", "LP4/O;", "name", "LO4/P;", "workRequest", "LO4/z;", "c", "(LP4/O;Ljava/lang/String;LO4/P;)LO4/z;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class S {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ O f25490f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f25491g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ O4.P f25492h;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: P4.S$a$a, reason: collision with other inner class name */
        static final class C0422a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ O4.P f25493f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ O f25494g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f25495h;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0422a(O4.P p10, O o10, String str) {
                super(0);
                this.f25493f = p10;
                this.f25494g = o10;
                this.f25495h = str;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C5557f.b(new F(this.f25494g, this.f25495h, EnumC4361i.KEEP, CollectionsKt.e(this.f25493f)));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O o10, String str, O4.P p10) {
            super(0);
            this.f25490f = o10;
            this.f25491g = str;
            this.f25492h = p10;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C0422a c0422a = new C0422a(this.f25492h, this.f25490f, this.f25491g);
            androidx.work.impl.model.c cVarL = this.f25490f.u().l();
            List<WorkSpec.IdAndState> listQ = cVarL.q(this.f25491g);
            if (listQ.size() > 1) {
                throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
            }
            WorkSpec.IdAndState idAndState = (WorkSpec.IdAndState) CollectionsKt.u0(listQ);
            if (idAndState == null) {
                c0422a.invoke();
                return;
            }
            WorkSpec workSpecJ = cVarL.j(idAndState.id);
            if (workSpecJ == null) {
                throw new IllegalStateException("WorkSpec with " + idAndState.id + ", that matches a name \"" + this.f25491g + "\", wasn't found");
            }
            if (!workSpecJ.n()) {
                throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            }
            if (idAndState.state == N.c.CANCELLED) {
                cVarL.a(idAndState.id);
                c0422a.invoke();
                return;
            }
            WorkSpec workSpecE = WorkSpec.e(this.f25492h.getWorkSpec(), idAndState.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777214, null);
            C4584t processor = this.f25490f.r();
            Intrinsics.i(processor, "processor");
            WorkDatabase workDatabase = this.f25490f.u();
            Intrinsics.i(workDatabase, "workDatabase");
            androidx.work.a configuration = this.f25490f.n();
            Intrinsics.i(configuration, "configuration");
            List<InterfaceC4586v> schedulers = this.f25490f.s();
            Intrinsics.i(schedulers, "schedulers");
            S.d(processor, workDatabase, configuration, schedulers, workSpecE, this.f25492h.c());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "spec", "", "a", "(Landroidx/work/impl/model/WorkSpec;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements Function1<WorkSpec, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f25496f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(WorkSpec spec) {
            Intrinsics.j(spec, "spec");
            return spec.n() ? "Periodic" : "OneTime";
        }
    }

    public static final O4.z c(O o10, String name, O4.P workRequest) {
        Intrinsics.j(o10, "<this>");
        Intrinsics.j(name, "name");
        Intrinsics.j(workRequest, "workRequest");
        O4.K tracer = o10.n().getTracer();
        String str = "enqueueUniquePeriodic_" + name;
        Y4.a aVarC = o10.v().c();
        Intrinsics.i(aVarC, "workTaskExecutor.serialTaskExecutor");
        return O4.D.c(tracer, str, aVarC, new a(o10, name, workRequest));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O.b d(C4584t c4584t, final WorkDatabase workDatabase, androidx.work.a aVar, final List<? extends InterfaceC4586v> list, final WorkSpec workSpec, final Set<String> set) {
        final String str = workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String;
        final WorkSpec workSpecJ = workDatabase.l().j(str);
        if (workSpecJ == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (workSpecJ.state.b()) {
            return O.b.NOT_APPLIED;
        }
        if (workSpecJ.n() ^ workSpec.n()) {
            b bVar = b.f25496f;
            throw new UnsupportedOperationException("Can't update " + bVar.invoke(workSpecJ) + " Worker to " + bVar.invoke(workSpec) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zK = c4584t.k(str);
        if (!zK) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC4586v) it.next()).a(str);
            }
        }
        workDatabase.runInTransaction(new Runnable() { // from class: P4.Q
            @Override // java.lang.Runnable
            public final void run() {
                S.e(workDatabase, workSpecJ, workSpec, list, str, set, zK);
            }
        });
        if (!zK) {
            androidx.work.impl.a.f(aVar, workDatabase, list);
        }
        return zK ? O.b.APPLIED_FOR_NEXT_RUN : O.b.APPLIED_IMMEDIATELY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WorkDatabase workDatabase, WorkSpec workSpec, WorkSpec workSpec2, List list, String str, Set set, boolean z10) {
        androidx.work.impl.model.c cVarL = workDatabase.l();
        W4.q qVarM = workDatabase.m();
        WorkSpec workSpecE = WorkSpec.e(workSpec2, null, workSpec.state, null, null, null, null, 0L, 0L, 0L, null, workSpec.runAttemptCount, null, 0L, workSpec.lastEnqueueTime, 0L, 0L, false, null, workSpec.getPeriodCount(), workSpec.getGeneration() + 1, workSpec.getNextScheduleTimeOverride(), workSpec.getNextScheduleTimeOverrideGeneration(), 0, null, 12835837, null);
        if (workSpec2.getNextScheduleTimeOverrideGeneration() == 1) {
            workSpecE.p(workSpec2.getNextScheduleTimeOverride());
            workSpecE.q(workSpecE.getNextScheduleTimeOverrideGeneration() + 1);
        }
        cVarL.b(C5558g.d(list, workSpecE));
        qVarM.b(str);
        qVarM.d(str, set);
        if (z10) {
            return;
        }
        cVarL.p(str, -1L);
        workDatabase.k().a(str);
    }
}
