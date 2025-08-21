package W4;

import android.database.Cursor;
import androidx.room.AbstractC6266j;
import androidx.room.G;
import androidx.room.N;
import androidx.room.S;
import androidx.work.impl.model.WorkTag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w4.C17824b;

/* loaded from: classes4.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    private final G f40782a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6266j<WorkTag> f40783b;

    /* renamed from: c, reason: collision with root package name */
    private final S f40784c;

    class a extends AbstractC6266j<WorkTag> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6266j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g gVar, WorkTag workTag) {
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

    @Override // W4.q
    public List<String> a(String str) {
        N nC = N.c("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        nC.S1(1, str);
        this.f40782a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f40782a, nC, false, null);
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

    @Override // W4.q
    public void b(String str) {
        this.f40782a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f40784c.acquire();
        gVarAcquire.S1(1, str);
        try {
            this.f40782a.beginTransaction();
            try {
                gVarAcquire.a0();
                this.f40782a.setTransactionSuccessful();
            } finally {
                this.f40782a.endTransaction();
            }
        } finally {
            this.f40784c.release(gVarAcquire);
        }
    }

    @Override // W4.q
    public void c(WorkTag workTag) {
        this.f40782a.assertNotSuspendingTransaction();
        this.f40782a.beginTransaction();
        try {
            this.f40783b.insert((AbstractC6266j<WorkTag>) workTag);
            this.f40782a.setTransactionSuccessful();
        } finally {
            this.f40782a.endTransaction();
        }
    }

    public r(G g10) {
        this.f40782a = g10;
        this.f40783b = new a(g10);
        this.f40784c = new b(g10);
    }
}
