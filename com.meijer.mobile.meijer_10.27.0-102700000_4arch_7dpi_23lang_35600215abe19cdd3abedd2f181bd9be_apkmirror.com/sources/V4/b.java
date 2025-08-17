package V4;

import android.database.Cursor;
import androidx.room.AbstractC6124j;
import androidx.room.G;
import androidx.room.N;
import androidx.work.impl.model.Dependency;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w4.C17754b;

/* loaded from: classes4.dex */
public final class b implements V4.a {

    /* renamed from: a, reason: collision with root package name */
    private final G f36874a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6124j<Dependency> f36875b;

    class a extends AbstractC6124j<Dependency> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6124j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(A4.g gVar, Dependency dependency) {
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

    @Override // V4.a
    public void a(Dependency dependency) {
        this.f36874a.assertNotSuspendingTransaction();
        this.f36874a.beginTransaction();
        try {
            this.f36875b.insert((AbstractC6124j<Dependency>) dependency);
            this.f36874a.setTransactionSuccessful();
        } finally {
            this.f36874a.endTransaction();
        }
    }

    @Override // V4.a
    public List<String> b(String str) {
        N nC = N.c("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        nC.S1(1, str);
        this.f36874a.assertNotSuspendingTransaction();
        Cursor cursorG = C17754b.g(this.f36874a, nC, false, null);
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

    @Override // V4.a
    public boolean c(String str) {
        N nC = N.c("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        nC.S1(1, str);
        this.f36874a.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor cursorG = C17754b.g(this.f36874a, nC, false, null);
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

    @Override // V4.a
    public boolean d(String str) {
        N nC = N.c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        nC.S1(1, str);
        this.f36874a.assertNotSuspendingTransaction();
        boolean z10 = false;
        Cursor cursorG = C17754b.g(this.f36874a, nC, false, null);
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
        this.f36874a = g10;
        this.f36875b = new a(g10);
    }
}
