package W4;

import android.database.Cursor;
import androidx.room.AbstractC6266j;
import androidx.room.G;
import androidx.room.N;
import androidx.work.impl.model.Dependency;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w4.C17824b;

/* loaded from: classes4.dex */
public final class b implements W4.a {

    /* renamed from: a, reason: collision with root package name */
    private final G f40755a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6266j<Dependency> f40756b;

    class a extends AbstractC6266j<Dependency> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6266j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g gVar, Dependency dependency) {
            gVar.S1(1, dependency.getWorkSpecId());
            gVar.S1(2, dependency.getPrerequisiteId());
        }

        a(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        protected String createQuery() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public static List<Class<?>> e() {
        return Collections.EMPTY_LIST;
    }

    @Override // W4.a
    public void a(Dependency dependency) {
        this.f40755a.assertNotSuspendingTransaction();
        this.f40755a.beginTransaction();
        try {
            this.f40756b.insert((AbstractC6266j<Dependency>) dependency);
            this.f40755a.setTransactionSuccessful();
        } finally {
            this.f40755a.endTransaction();
        }
    }

    @Override // W4.a
    public List<String> b(String str) {
        N nC = N.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        nC.S1(1, str);
        this.f40755a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f40755a, nC, false, null);
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

    @Override // W4.a
    public boolean c(String str) {
        N nC = N.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        nC.S1(1, str);
        this.f40755a.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor cursorG = C17824b.g(this.f40755a, nC, false, null);
        try {
            if (cursorG.moveToFirst()) {
                z10 = cursorG.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    @Override // W4.a
    public boolean d(String str) {
        N nC = N.c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        nC.S1(1, str);
        this.f40755a.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor cursorG = C17824b.g(this.f40755a, nC, false, null);
        try {
            if (cursorG.moveToFirst()) {
                z10 = cursorG.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    public b(G g10) {
        this.f40755a = g10;
        this.f40756b = new a(g10);
    }
}
