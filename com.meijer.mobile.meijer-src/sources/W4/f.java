package W4;

import android.database.Cursor;
import androidx.room.AbstractC6266j;
import androidx.room.G;
import androidx.room.N;
import androidx.room.S;
import androidx.work.impl.model.SystemIdInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import w4.C17823a;
import w4.C17824b;

/* loaded from: classes4.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    private final G f40761a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6266j<SystemIdInfo> f40762b;

    /* renamed from: c, reason: collision with root package name */
    private final S f40763c;

    /* renamed from: d, reason: collision with root package name */
    private final S f40764d;

    class a extends AbstractC6266j<SystemIdInfo> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6266j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g gVar, SystemIdInfo systemIdInfo) {
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

    @Override // W4.e
    public SystemIdInfo a(String str, int i10) {
        N nC = N.c("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        nC.S1(1, str);
        nC.C(2, i10);
        this.f40761a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f40761a, nC, false, null);
        try {
            return cursorG.moveToFirst() ? new SystemIdInfo(cursorG.getString(C17823a.e(cursorG, "work_spec_id")), cursorG.getInt(C17823a.e(cursorG, "generation")), cursorG.getInt(C17823a.e(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    @Override // W4.e
    public List<String> b() {
        N nC = N.c("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f40761a.assertNotSuspendingTransaction();
        Cursor cursorG = C17824b.g(this.f40761a, nC, false, null);
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

    @Override // W4.e
    public void c(SystemIdInfo systemIdInfo) {
        this.f40761a.assertNotSuspendingTransaction();
        this.f40761a.beginTransaction();
        try {
            this.f40762b.insert((AbstractC6266j<SystemIdInfo>) systemIdInfo);
            this.f40761a.setTransactionSuccessful();
        } finally {
            this.f40761a.endTransaction();
        }
    }

    @Override // W4.e
    public void f(String str, int i10) {
        this.f40761a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f40763c.acquire();
        gVarAcquire.S1(1, str);
        gVarAcquire.C(2, i10);
        try {
            this.f40761a.beginTransaction();
            try {
                gVarAcquire.a0();
                this.f40761a.setTransactionSuccessful();
            } finally {
                this.f40761a.endTransaction();
            }
        } finally {
            this.f40763c.release(gVarAcquire);
        }
    }

    @Override // W4.e
    public void g(String str) {
        this.f40761a.assertNotSuspendingTransaction();
        B4.g gVarAcquire = this.f40764d.acquire();
        gVarAcquire.S1(1, str);
        try {
            this.f40761a.beginTransaction();
            try {
                gVarAcquire.a0();
                this.f40761a.setTransactionSuccessful();
            } finally {
                this.f40761a.endTransaction();
            }
        } finally {
            this.f40764d.release(gVarAcquire);
        }
    }

    public f(G g10) {
        this.f40761a = g10;
        this.f40762b = new a(g10);
        this.f40763c = new b(g10);
        this.f40764d = new c(g10);
    }
}
