package W4;

import N4.N;
import O4.C4458t;
import O4.InterfaceC4460v;
import W4.C5402d;
import androidx.work.impl.WorkDatabase;
import io.constructor.data.local.PreferencesHelper;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LO4/O;", "workManagerImpl", "", "workSpecId", "", "d", "(LO4/O;Ljava/lang/String;)V", "j", "(LO4/O;)V", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "i", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V", "Ljava/util/UUID;", PreferencesHelper.PREF_ID, "LN4/z;", "e", "(Ljava/util/UUID;LO4/O;)LN4/z;", "tag", "h", "(Ljava/lang/String;LO4/O;)LN4/z;", "name", "f", "(Ljava/lang/String;LO4/O;)V", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* renamed from: W4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5402d {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: W4.d$a */
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ O4.O f38519f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ UUID f38520g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O4.O o10, UUID uuid) {
            super(0);
            this.f38519f = o10;
            this.f38520g = uuid;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WorkDatabase workDatabaseU = this.f38519f.u();
            Intrinsics.i(workDatabaseU, "workManagerImpl.workDatabase");
            final O4.O o10 = this.f38519f;
            final UUID uuid = this.f38520g;
            workDatabaseU.runInTransaction(new Runnable() { // from class: W4.c
                @Override // java.lang.Runnable
                public final void run() {
                    C5402d.a.b(o10, uuid);
                }
            });
            C5402d.j(this.f38519f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(O4.O o10, UUID uuid) {
            String string = uuid.toString();
            Intrinsics.i(string, "id.toString()");
            C5402d.d(o10, string);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: W4.d$b */
    static final class b extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ O4.O f38521f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f38522g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O4.O o10, String str) {
            super(0);
            this.f38521f = o10;
            this.f38522g = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            final WorkDatabase workDatabaseU = this.f38521f.u();
            Intrinsics.i(workDatabaseU, "workManagerImpl.workDatabase");
            final String str = this.f38522g;
            final O4.O o10 = this.f38521f;
            workDatabaseU.runInTransaction(new Runnable() { // from class: W4.e
                @Override // java.lang.Runnable
                public final void run() {
                    C5402d.b.b(workDatabaseU, str, o10);
                }
            });
            C5402d.j(this.f38521f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(WorkDatabase workDatabase, String str, O4.O o10) {
            Iterator<String> it = workDatabase.l().m(str).iterator();
            while (it.hasNext()) {
                C5402d.d(o10, it.next());
            }
        }
    }

    public static final N4.z e(UUID id2, O4.O workManagerImpl) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(workManagerImpl, "workManagerImpl");
        N4.K tracer = workManagerImpl.n().getTracer();
        X4.a aVarC = workManagerImpl.v().c();
        Intrinsics.i(aVarC, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return N4.D.c(tracer, "CancelWorkById", aVarC, new a(workManagerImpl, id2));
    }

    public static final void f(final String name, final O4.O workManagerImpl) {
        Intrinsics.j(name, "name");
        Intrinsics.j(workManagerImpl, "workManagerImpl");
        final WorkDatabase workDatabaseU = workManagerImpl.u();
        Intrinsics.i(workDatabaseU, "workManagerImpl.workDatabase");
        workDatabaseU.runInTransaction(new Runnable() { // from class: W4.b
            @Override // java.lang.Runnable
            public final void run() {
                C5402d.g(workDatabaseU, name, workManagerImpl);
            }
        });
    }

    public static final N4.z h(String tag, O4.O workManagerImpl) {
        Intrinsics.j(tag, "tag");
        Intrinsics.j(workManagerImpl, "workManagerImpl");
        N4.K tracer = workManagerImpl.n().getTracer();
        String str = "CancelWorkByTag_" + tag;
        X4.a aVarC = workManagerImpl.v().c();
        Intrinsics.i(aVarC, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        return N4.D.c(tracer, str, aVarC, new b(workManagerImpl, tag));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(O4.O o10, String str) {
        WorkDatabase workDatabaseU = o10.u();
        Intrinsics.i(workDatabaseU, "workManagerImpl.workDatabase");
        i(workDatabaseU, str);
        C4458t c4458tR = o10.r();
        Intrinsics.i(c4458tR, "workManagerImpl.processor");
        c4458tR.q(str, 1);
        Iterator<InterfaceC4460v> it = o10.s().iterator();
        while (it.hasNext()) {
            it.next().a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(WorkDatabase workDatabase, String str, O4.O o10) {
        Iterator<String> it = workDatabase.l().i(str).iterator();
        while (it.hasNext()) {
            d(o10, it.next());
        }
    }

    private static final void i(WorkDatabase workDatabase, String str) {
        androidx.work.impl.model.c cVarL = workDatabase.l();
        V4.a aVarG = workDatabase.g();
        List listS = CollectionsKt.s(str);
        while (!listS.isEmpty()) {
            String str2 = (String) CollectionsKt.M(listS);
            N.c cVarJ = cVarL.j(str2);
            if (cVarJ != N.c.SUCCEEDED && cVarJ != N.c.FAILED) {
                cVarL.l(str2);
            }
            listS.addAll(aVarG.b(str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(O4.O o10) {
        androidx.work.impl.a.f(o10.n(), o10.u(), o10.s());
    }
}
