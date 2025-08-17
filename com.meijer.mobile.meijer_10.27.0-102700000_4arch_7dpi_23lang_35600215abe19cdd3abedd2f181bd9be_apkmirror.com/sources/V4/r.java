package V4;

import android.database.Cursor;
import androidx.room.AbstractC6124j;
import androidx.room.G;
import androidx.room.N;
import androidx.room.S;
import androidx.work.impl.model.WorkTag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w4.C17754b;

/* loaded from: classes4.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    private final G f36901a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6124j<WorkTag> f36902b;

    /* renamed from: c, reason: collision with root package name */
    private final S f36903c;

    class a extends AbstractC6124j<WorkTag> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6124j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(A4.g gVar, WorkTag workTag) {
            gVar.S1(1, workTag.getTag());
            gVar.S1(2, workTag.getWorkSpecId());
        }

        a(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        protected String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    class b extends S {
        b(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public static List<Class<?>> e() {
        return Collections.EMPTY_LIST;
    }

    @Override // V4.q
    public List<String> a(String str) {
        N nC = N.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        nC.S1(1, str);
        this.f36901a.assertNotSuspendingTransaction();
        Cursor cursorG = C17754b.g(this.f36901a, nC, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    @Override // V4.q
    public void b(String str) {
        this.f36901a.assertNotSuspendingTransaction();
        A4.g gVarAcquire = this.f36903c.acquire();
        gVarAcquire.S1(1, str);
        try {
            this.f36901a.beginTransaction();
            try {
                gVarAcquire.b0();
                this.f36901a.setTransactionSuccessful();
            } finally {
                this.f36901a.endTransaction();
            }
        } finally {
            this.f36903c.release(gVarAcquire);
        }
    }

    @Override // V4.q
    public void c(WorkTag workTag) {
        this.f36901a.assertNotSuspendingTransaction();
        this.f36901a.beginTransaction();
        try {
            this.f36902b.insert((AbstractC6124j<WorkTag>) workTag);
            this.f36901a.setTransactionSuccessful();
        } finally {
            this.f36901a.endTransaction();
        }
    }

    public r(G g10) {
        this.f36901a = g10;
        this.f36902b = new a(g10);
        this.f36903c = new b(g10);
    }
}
