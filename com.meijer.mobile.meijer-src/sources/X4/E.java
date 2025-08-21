package X4;

import O4.C4371t;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "LY4/b;", "executor", "", "tag", "Lcom/google/common/util/concurrent/q;", "", "LO4/N;", "a", "(Landroidx/work/impl/WorkDatabase;LY4/b;Ljava/lang/String;)Lcom/google/common/util/concurrent/q;", "T", "Lkotlin/Function1;", "block", "b", "(Landroidx/work/impl/WorkDatabase;LY4/b;Lkotlin/jvm/functions/Function1;)Lcom/google/common/util/concurrent/q;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* loaded from: classes4.dex */
public final class E {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "db", "", "LO4/N;", "a", "(Landroidx/work/impl/WorkDatabase;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function1<WorkDatabase, List<? extends O4.N>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f41546f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f41546f = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<O4.N> invoke(WorkDatabase db2) {
            Intrinsics.j(db2, "db");
            List<O4.N> listApply = WorkSpec.f59451A.apply(db2.l().z(this.f41546f));
            Intrinsics.i(listApply, "WORK_INFO_MAPPER.apply(d…orkStatusPojoForTag(tag))");
            return listApply;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b<T> extends Lambda implements Function0<T> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<WorkDatabase, T> f41547f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ WorkDatabase f41548g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super WorkDatabase, ? extends T> function1, WorkDatabase workDatabase) {
            super(0);
            this.f41547f = function1;
            this.f41548g = workDatabase;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return this.f41547f.invoke(this.f41548g);
        }
    }

    public static final com.google.common.util.concurrent.q<List<O4.N>> a(WorkDatabase workDatabase, Y4.b executor, String tag) {
        Intrinsics.j(workDatabase, "<this>");
        Intrinsics.j(executor, "executor");
        Intrinsics.j(tag, "tag");
        return b(workDatabase, executor, new a(tag));
    }

    private static final <T> com.google.common.util.concurrent.q<T> b(WorkDatabase workDatabase, Y4.b bVar, Function1<? super WorkDatabase, ? extends T> function1) {
        Y4.a aVarC = bVar.c();
        Intrinsics.i(aVarC, "executor.serialTaskExecutor");
        return C4371t.f(aVarC, "loadStatusFuture", new b(function1, workDatabase));
    }
}
