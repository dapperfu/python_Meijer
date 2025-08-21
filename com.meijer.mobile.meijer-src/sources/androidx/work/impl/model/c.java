package androidx.work.impl.model;

import O4.N;
import android.annotation.SuppressLint;
import androidx.work.impl.model.WorkSpec;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import pv.InterfaceC16561f;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u0019\u0010\nJ\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b#\u0010\u0018J\u001f\u0010%\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0014H'¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000e2\u0006\u0010)\u001a\u00020\u0007H'¢\u0006\u0004\b+\u0010\u0011J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000e2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b,\u0010\u0011J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010)\u001a\u00020\u0007H'¢\u0006\u0004\b-\u0010\u0011J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b.\u0010\u0011J\u0015\u00101\u001a\b\u0012\u0004\u0012\u0002000/H'¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u001eH'¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0014H'¢\u0006\u0004\b6\u00107J\u001d\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u00108\u001a\u00020\u0014H'¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b;\u0010<J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010=\u001a\u00020\u0014H'¢\u0006\u0004\b>\u0010:J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b?\u0010<J\u0015\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH'¢\u0006\u0004\b@\u0010<J\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010A\u001a\u00020\u001eH'¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bD\u0010\u0006J\u000f\u0010E\u001a\u00020\u0014H'¢\u0006\u0004\bE\u00107J\u001f\u0010G\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u0014H'¢\u0006\u0004\bG\u0010&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006HÀ\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/c;", "", "Landroidx/work/impl/model/WorkSpec;", "workSpec", "", "f", "(Landroidx/work/impl/model/WorkSpec;)V", "", PreferencesHelper.PREF_ID, "a", "(Ljava/lang/String;)V", "j", "(Ljava/lang/String;)Landroidx/work/impl/model/WorkSpec;", "name", "", "Landroidx/work/impl/model/WorkSpec$b;", "q", "(Ljava/lang/String;)Ljava/util/List;", "LO4/N$c;", "state", "", "w", "(LO4/N$c;Ljava/lang/String;)I", "k", "(Ljava/lang/String;)I", "c", "Landroidx/work/b;", "output", "t", "(Ljava/lang/String;Landroidx/work/b;)V", "", "enqueueTime", "u", "(Ljava/lang/String;J)V", "A", "y", "overrideGeneration", "C", "(Ljava/lang/String;I)V", "i", "(Ljava/lang/String;)LO4/N$c;", "tag", "Landroidx/work/impl/model/WorkSpec$c;", "z", "m", "l", "h", "Lpv/f;", "", "r", "()Lpv/f;", "startTime", "p", "(Ljava/lang/String;J)I", "o", "()I", "schedulerLimit", "s", "(I)Ljava/util/List;", "x", "()Ljava/util/List;", "maxLimit", "n", "g", "v", "startingAt", "d", "(J)Ljava/util/List;", "b", "B", "stopReason", "e", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"UnknownNullness"})
/* loaded from: classes4.dex */
public interface c {
    int A(String id2);

    int B();

    void C(String id2, int overrideGeneration);

    void a(String id2);

    void b(WorkSpec workSpec);

    void c(String id2);

    List<WorkSpec> d(long startingAt);

    void e(String id2, int stopReason);

    void f(WorkSpec workSpec);

    List<WorkSpec> g();

    List<String> h(String name);

    N.c i(String id2);

    WorkSpec j(String id2);

    int k(String id2);

    List<String> l(String tag);

    List<androidx.work.b> m(String id2);

    List<WorkSpec> n(int maxLimit);

    int o();

    int p(String id2, long startTime);

    List<WorkSpec.IdAndState> q(String name);

    InterfaceC16561f<Boolean> r();

    List<WorkSpec> s(int schedulerLimit);

    void t(String id2, androidx.work.b output);

    void u(String id2, long enqueueTime);

    List<WorkSpec> v();

    int w(N.c state, String id2);

    List<WorkSpec> x();

    int y(String id2);

    List<WorkSpec.WorkInfoPojo> z(String tag);
}
