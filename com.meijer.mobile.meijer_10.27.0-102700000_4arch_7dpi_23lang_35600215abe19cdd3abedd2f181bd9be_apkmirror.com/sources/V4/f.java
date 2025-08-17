package V4;

import android.database.Cursor;
import androidx.room.AbstractC6124j;
import androidx.room.G;
import androidx.room.N;
import androidx.room.S;
import androidx.work.impl.model.SystemIdInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w4.C17753a;
import w4.C17754b;

/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final G f36880a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6124j<SystemIdInfo> f36881b;

    /* renamed from: c, reason: collision with root package name */
    private final S f36882c;

    /* renamed from: d, reason: collision with root package name */
    private final S f36883d;

    class a extends AbstractC6124j<SystemIdInfo> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6124j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(A4.g gVar, SystemIdInfo systemIdInfo) {
            gVar.S1(1, systemIdInfo.workSpecId);
            gVar.C(2, systemIdInfo.getGeneration());
            gVar.C(3, systemIdInfo.systemId);
        }

        a(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }
    }

    class b extends S {
        b(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    class c extends S {
        c(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public static List<Class<?>> h() {
        return Collections.EMPTY_LIST;
    }

    @Override // V4.e
    public SystemIdInfo b(String str, int i10) {
        N nC = N.c("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        nC.S1(1, str);
        nC.C(2, i10);
        this.f36880a.assertNotSuspendingTransaction();
        Cursor cursorG = C17754b.g(this.f36880a, nC, false, null);
        try {
            return cursorG.moveToFirst() ? new SystemIdInfo(cursorG.getString(C17753a.e(cursorG, "work_spec_id")), cursorG.getInt(C17753a.e(cursorG, "generation")), cursorG.getInt(C17753a.e(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    @Override // V4.e
    public List<String> c() {
        N nC = N.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f36880a.assertNotSuspendingTransaction();
        Cursor cursorG = C17754b.g(this.f36880a, nC, false, null);
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

    @Override // V4.e
    public void d(SystemIdInfo systemIdInfo) {
        this.f36880a.assertNotSuspendingTransaction();
        this.f36880a.beginTransaction();
        try {
            this.f36881b.insert((AbstractC6124j<SystemIdInfo>) systemIdInfo);
            this.f36880a.setTransactionSuccessful();
        } finally {
            this.f36880a.endTransaction();
        }
    }

    @Override // V4.e
    public void f(String str, int i10) {
        this.f36880a.assertNotSuspendingTransaction();
        A4.g gVarAcquire = this.f36882c.acquire();
        gVarAcquire.S1(1, str);
        gVarAcquire.C(2, i10);
        try {
            this.f36880a.beginTransaction();
            try {
                gVarAcquire.b0();
                this.f36880a.setTransactionSuccessful();
            } finally {
                this.f36880a.endTransaction();
            }
        } finally {
            this.f36882c.release(gVarAcquire);
        }
    }

    @Override // V4.e
    public void g(String str) {
        this.f36880a.assertNotSuspendingTransaction();
        A4.g gVarAcquire = this.f36883d.acquire();
        gVarAcquire.S1(1, str);
        try {
            this.f36880a.beginTransaction();
            try {
                gVarAcquire.b0();
                this.f36880a.setTransactionSuccessful();
            } finally {
                this.f36880a.endTransaction();
            }
        } finally {
            this.f36883d.release(gVarAcquire);
        }
    }

    public f(G g10) {
        this.f36880a = g10;
        this.f36881b = new a(g10);
        this.f36882c = new b(g10);
        this.f36883d = new c(g10);
    }
}
