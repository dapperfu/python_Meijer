package V4;

import android.database.Cursor;
import androidx.room.AbstractC6124j;
import androidx.room.G;
import androidx.room.N;
import androidx.work.impl.model.WorkName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w4.C17754b;

/* loaded from: classes4.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    private final G f36889a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6124j<WorkName> f36890b;

    class a extends AbstractC6124j<WorkName> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6124j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(A4.g gVar, WorkName workName) {
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

    @Override // V4.i
    public void a(WorkName workName) {
        this.f36889a.assertNotSuspendingTransaction();
        this.f36889a.beginTransaction();
        try {
            this.f36890b.insert((AbstractC6124j<WorkName>) workName);
            this.f36889a.setTransactionSuccessful();
        } finally {
            this.f36889a.endTransaction();
        }
    }

    @Override // V4.i
    public List<String> b(String str) {
        N nC = N.c("SELECT name FROM workname WHERE work_spec_id=?", 1);
        nC.S1(1, str);
        this.f36889a.assertNotSuspendingTransaction();
        Cursor cursorG = C17754b.g(this.f36889a, nC, false, null);
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
        this.f36889a = g10;
        this.f36890b = new a(g10);
    }
}
