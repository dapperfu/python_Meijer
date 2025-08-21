package X4;

import O4.AbstractC4373v;
import O4.C4371t;
import O4.N;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public class M implements O4.G {

    /* renamed from: c, reason: collision with root package name */
    static final String f41573c = AbstractC4373v.i("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    final WorkDatabase f41574a;

    /* renamed from: b, reason: collision with root package name */
    final Y4.b f41575b;

    @Override // O4.G
    public com.google.common.util.concurrent.q<Void> a(Context context, final UUID uuid, final androidx.work.b bVar) {
        return C4371t.f(this.f41575b.c(), "updateProgress", new Function0() { // from class: X4.L
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return M.b(this.f41570a, uuid, bVar);
            }
        });
    }

    public M(WorkDatabase workDatabase, Y4.b bVar) {
        this.f41574a = workDatabase;
        this.f41575b = bVar;
    }

    public static /* synthetic */ Void b(M m10, UUID uuid, androidx.work.b bVar) {
        m10.getClass();
        String string = uuid.toString();
        AbstractC4373v abstractC4373vE = AbstractC4373v.e();
        String str = f41573c;
        abstractC4373vE.a(str, "Updating progress for " + uuid + " (" + bVar + ")");
        m10.f41574a.beginTransaction();
        try {
            WorkSpec workSpecJ = m10.f41574a.l().j(string);
            if (workSpecJ != null) {
                if (workSpecJ.state == N.c.RUNNING) {
                    m10.f41574a.k().b(new WorkProgress(string, bVar));
                } else {
                    AbstractC4373v.e().k(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                }
                m10.f41574a.setTransactionSuccessful();
                m10.f41574a.endTransaction();
                return null;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        } catch (Throwable th2) {
            try {
                AbstractC4373v.e().d(f41573c, "Error updating Worker progress", th2);
                throw th2;
            } catch (Throwable th3) {
                m10.f41574a.endTransaction();
                throw th3;
            }
        }
    }
}
