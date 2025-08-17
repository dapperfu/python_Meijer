package V4;

import androidx.room.AbstractC6124j;
import androidx.room.G;
import androidx.room.S;
import androidx.work.impl.model.WorkProgress;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final G f36892a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6124j<WorkProgress> f36893b;

    /* renamed from: c, reason: collision with root package name */
    private final S f36894c;

    /* renamed from: d, reason: collision with root package name */
    private final S f36895d;

    class a extends AbstractC6124j<WorkProgress> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6124j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(A4.g gVar, WorkProgress workProgress) {
            gVar.S1(1, workProgress.getWorkSpecId());
            gVar.z2(2, androidx.work.b.h(workProgress.getProgress()));
        }

        a(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    class b extends S {
        b(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends S {
        c(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public static List<Class<?>> c() {
        return Collections.EMPTY_LIST;
    }

    @Override // V4.k
    public void a(String str) {
        this.f36892a.assertNotSuspendingTransaction();
        A4.g gVarAcquire = this.f36894c.acquire();
        gVarAcquire.S1(1, str);
        try {
            this.f36892a.beginTransaction();
            try {
                gVarAcquire.b0();
                this.f36892a.setTransactionSuccessful();
            } finally {
                this.f36892a.endTransaction();
            }
        } finally {
            this.f36894c.release(gVarAcquire);
        }
    }

    @Override // V4.k
    public void b(WorkProgress workProgress) {
        this.f36892a.assertNotSuspendingTransaction();
        this.f36892a.beginTransaction();
        try {
            this.f36893b.insert((AbstractC6124j<WorkProgress>) workProgress);
            this.f36892a.setTransactionSuccessful();
        } finally {
            this.f36892a.endTransaction();
        }
    }

    @Override // V4.k
    public void deleteAll() {
        this.f36892a.assertNotSuspendingTransaction();
        A4.g gVarAcquire = this.f36895d.acquire();
        try {
            this.f36892a.beginTransaction();
            try {
                gVarAcquire.b0();
                this.f36892a.setTransactionSuccessful();
            } finally {
                this.f36892a.endTransaction();
            }
        } finally {
            this.f36895d.release(gVarAcquire);
        }
    }

    public l(G g10) {
        this.f36892a = g10;
        this.f36893b = new a(g10);
        this.f36894c = new b(g10);
        this.f36895d = new c(g10);
    }
}
