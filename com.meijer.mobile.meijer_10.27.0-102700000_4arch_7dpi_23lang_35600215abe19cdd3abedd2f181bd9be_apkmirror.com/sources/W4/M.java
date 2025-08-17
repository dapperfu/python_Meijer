package W4;

import N4.AbstractC4333v;
import N4.C4331t;
import N4.N;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public class M implements N4.G {

    /* renamed from: c, reason: collision with root package name */
    static final String f38503c = AbstractC4333v.i("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    final WorkDatabase f38504a;

    /* renamed from: b, reason: collision with root package name */
    final X4.b f38505b;

    @Override // N4.G
    public com.google.common.util.concurrent.q<Void> a(Context context, final UUID uuid, final androidx.work.b bVar) {
        return C4331t.f(this.f38505b.c(), "updateProgress", new Function0() { // from class: W4.L
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return M.b(this.f38500a, uuid, bVar);
            }
        });
    }

    public M(WorkDatabase workDatabase, X4.b bVar) {
        this.f38504a = workDatabase;
        this.f38505b = bVar;
    }

    public static /* synthetic */ Void b(M m10, UUID uuid, androidx.work.b bVar) {
        m10.getClass();
        String string = uuid.toString();
        AbstractC4333v abstractC4333vE = AbstractC4333v.e();
        String str = f38503c;
        abstractC4333vE.a(str, "Updating progress for " + uuid + " (" + bVar + ")");
        m10.f38504a.beginTransaction();
        try {
            WorkSpec workSpecK = m10.f38504a.l().k(string);
            if (workSpecK != null) {
                if (workSpecK.state == N.c.RUNNING) {
                    m10.f38504a.k().b(new WorkProgress(string, bVar));
                } else {
                    AbstractC4333v.e().k(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                }
                m10.f38504a.setTransactionSuccessful();
                m10.f38504a.endTransaction();
                return null;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        } catch (Throwable th2) {
            try {
                AbstractC4333v.e().d(f38503c, "Error updating Worker progress", th2);
                throw th2;
            } catch (Throwable th3) {
                m10.f38504a.endTransaction();
                throw th3;
            }
        }
    }
}
