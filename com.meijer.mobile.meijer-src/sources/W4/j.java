package W4;

import android.database.Cursor;
import androidx.room.AbstractC6266j;
import androidx.room.G;
import androidx.room.N;
import androidx.work.impl.model.WorkName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w4.C17824b;

/* loaded from: classes4.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    private final G f40770a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6266j<WorkName> f40771b;

    class a extends AbstractC6266j<WorkName> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6266j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g gVar, WorkName workName) {
            gVar.S1(1, workName.getName());
            gVar.S1(2, workName.getWorkSpecId());
        }

        a(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        protected String createQuery() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public static List<Class<?>> c() {
        return Collections.EMPTY_LIST;
    }

    @Override // W4.i
    public void a(WorkName workName) {
        this.f40770a.assertNotSuspendingTransaction();
        this.f40770a.beginTransaction();
        try {
            this.f40771b.insert((AbstractC6266j<WorkName>) workName);
            this.f40770a.setTransactionSuccessful();
        } finally {
            this.f40770a.endTransaction();
        }
    }

    @Override // W4.i
    public List<String> b(String str) {
        N nC = N.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        nC.S1(1, str);
        this.f40770a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f40770a, nC, false, null);
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

    public j(G g10) {
        this.f40770a = g10;
        this.f40771b = new a(g10);
    }
}
