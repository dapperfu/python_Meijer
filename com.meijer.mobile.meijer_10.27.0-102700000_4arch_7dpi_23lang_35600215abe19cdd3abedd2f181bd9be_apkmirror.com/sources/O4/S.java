package O4;

import N4.EnumC4321i;
import N4.N;
import N4.O;
import W4.C5404f;
import W4.C5405g;
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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0016\u001a\u00020\u0015*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LO4/t;", "processor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Landroidx/work/a;", "configuration", "", "LO4/v;", "schedulers", "Landroidx/work/impl/model/WorkSpec;", "newWorkSpec", "", "", "tags", "LN4/O$b;", "d", "(LO4/t;Landroidx/work/impl/WorkDatabase;Landroidx/work/a;Ljava/util/List;Landroidx/work/impl/model/WorkSpec;Ljava/util/Set;)LN4/O$b;", "LO4/O;", "name", "LN4/P;", "workRequest", "LN4/z;", "c", "(LO4/O;Ljava/lang/String;LN4/P;)LN4/z;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class S {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ O f23150f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f23151g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ N4.P f23152h;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: O4.S$a$a, reason: collision with other inner class name */
        static final class C0373a extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ N4.P f23153f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ O f23154g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f23155h;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f142422a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0373a(N4.P p10, O o10, String str) {
                super(0);
                this.f23153f = p10;
                this.f23154g = o10;
                this.f23155h = str;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                C5404f.b(new F(this.f23154g, this.f23155h, EnumC4321i.KEEP, CollectionsKt.e(this.f23153f)));
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O o10, String str, N4.P p10) {
            super(0);
            this.f23150f = o10;
            this.f23151g = str;
            this.f23152h = p10;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C0373a c0373a = new C0373a(this.f23152h, this.f23150f, this.f23151g);
            androidx.work.impl.model.c cVarL = this.f23150f.u().l();
            List<WorkSpec.IdAndState> listR = cVarL.r(this.f23151g);
            if (listR.size() > 1) {
                throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
            }
            WorkSpec.IdAndState idAndState = (WorkSpec.IdAndState) CollectionsKt.u0(listR);
            if (idAndState == null) {
                c0373a.invoke();
                return;
            }
            WorkSpec workSpecK = cVarL.k(idAndState.id);
            if (workSpecK == null) {
                throw new IllegalStateException("WorkSpec with " + idAndState.id + ", that matches a name \"" + this.f23151g + "\", wasn't found");
            }
            if (!workSpecK.n()) {
                throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            }
            if (idAndState.state == N.c.CANCELLED) {
                cVarL.a(idAndState.id);
                c0373a.invoke();
                return;
            }
            WorkSpec workSpecE = WorkSpec.e(this.f23152h.getWorkSpec(), idAndState.id, null, null, null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, 16777214, null);
            C4458t processor = this.f23150f.r();
            Intrinsics.i(processor, "processor");
            WorkDatabase workDatabase = this.f23150f.u();
            Intrinsics.i(workDatabase, "workDatabase");
            androidx.work.a configuration = this.f23150f.n();
            Intrinsics.i(configuration, "configuration");
            List<InterfaceC4460v> schedulers = this.f23150f.s();
            Intrinsics.i(schedulers, "schedulers");
            S.d(processor, workDatabase, configuration, schedulers, workSpecE, this.f23152h.c());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/work/impl/model/WorkSpec;", "spec", "", "a", "(Landroidx/work/impl/model/WorkSpec;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements Function1<WorkSpec, String> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f23156f = new b();

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

    public static final N4.z c(O o10, String name, N4.P workRequest) {
        Intrinsics.j(o10, "<this>");
        Intrinsics.j(name, "name");
        Intrinsics.j(workRequest, "workRequest");
        N4.K tracer = o10.n().getTracer();
        String str = "enqueueUniquePeriodic_" + name;
        X4.a aVarC = o10.v().c();
        Intrinsics.i(aVarC, "workTaskExecutor.serialTaskExecutor");
        return N4.D.c(tracer, str, aVarC, new a(o10, name, workRequest));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O.b d(C4458t c4458t, final WorkDatabase workDatabase, androidx.work.a aVar, final List<? extends InterfaceC4460v> list, final WorkSpec workSpec, final Set<String> set) {
        final String str = workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String;
        final WorkSpec workSpecK = workDatabase.l().k(str);
        if (workSpecK == null) {
            throw new IllegalArgumentException("Worker with " + str + " doesn't exist");
        }
        if (workSpecK.state.b()) {
            return O.b.NOT_APPLIED;
        }
        if (workSpecK.n() ^ workSpec.n()) {
            b bVar = b.f23156f;
            throw new UnsupportedOperationException("Can't update " + bVar.invoke(workSpecK) + " Worker to " + bVar.invoke(workSpec) + " Worker. Update operation must preserve worker's type.");
        }
        final boolean zK = c4458t.k(str);
        if (!zK) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC4460v) it.next()).a(str);
            }
        }
        workDatabase.runInTransaction(new Runnable() { // from class: O4.Q
            @Override // java.lang.Runnable
            public final void run() {
                S.e(workDatabase, workSpecK, workSpec, list, str, set, zK);
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
        V4.q qVarM = workDatabase.m();
        WorkSpec workSpecE = WorkSpec.e(workSpec2, null, workSpec.state, null, null, null, null, 0L, 0L, 0L, null, workSpec.runAttemptCount, null, 0L, workSpec.lastEnqueueTime, 0L, 0L, false, null, workSpec.getPeriodCount(), workSpec.getGeneration() + 1, workSpec.getNextScheduleTimeOverride(), workSpec.getNextScheduleTimeOverrideGeneration(), 0, null, 12835837, null);
        if (workSpec2.getNextScheduleTimeOverrideGeneration() == 1) {
            workSpecE.p(workSpec2.getNextScheduleTimeOverride());
            workSpecE.q(workSpecE.getNextScheduleTimeOverrideGeneration() + 1);
        }
        cVarL.b(C5405g.d(list, workSpecE));
        qVarM.b(str);
        qVarM.d(str, set);
        if (z10) {
            return;
        }
        cVarL.q(str, -1L);
        workDatabase.k().a(str);
    }
}
