package W4;

import androidx.room.AbstractC6266j;
import androidx.room.G;
import androidx.room.S;
import androidx.work.impl.model.WorkProgress;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final G f40773a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6266j<WorkProgress> f40774b;

    /* renamed from: c, reason: collision with root package name */
    private final S f40775c;

    /* renamed from: d, reason: collision with root package name */
    private final S f40776d;

    class a extends AbstractC6266j<WorkProgress> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6266j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g gVar, WorkProgress workProgress) {
            gVar.S1(1, workProgress.getWorkSpecId());
            gVar.y2(2, androidx.work.b.h(workProgress.getProgress()));
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

    @Override // W4.k
    public void a(String str) {
        this.f40773a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f40775c.acquire();
        gVarAcquire.S1(1, str);
        try {
            this.f40773a.beginTransaction();
            try {
                gVarAcquire.a0();
                this.f40773a.setTransactionSuccessful();
            } finally {
                this.f40773a.endTransaction();
            }
        } finally {
            this.f40775c.release(gVarAcquire);
        }
    }

    @Override // W4.k
    public void b(WorkProgress workProgress) {
        this.f40773a.assertNotSuspendingTransaction();
        this.f40773a.beginTransaction();
        try {
            this.f40774b.insert((AbstractC6266j<WorkProgress>) workProgress);
            this.f40773a.setTransactionSuccessful();
        } finally {
            this.f40773a.endTransaction();
        }
    }

    @Override // W4.k
    public void deleteAll() {
        this.f40773a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f40776d.acquire();
        try {
            this.f40773a.beginTransaction();
            try {
                gVarAcquire.a0();
                this.f40773a.setTransactionSuccessful();
            } finally {
                this.f40773a.endTransaction();
            }
        } finally {
            this.f40776d.release(gVarAcquire);
        }
    }

    public l(G g10) {
        this.f40773a = g10;
        this.f40774b = new a(g10);
        this.f40775c = new b(g10);
        this.f40776d = new c(g10);
    }
}
