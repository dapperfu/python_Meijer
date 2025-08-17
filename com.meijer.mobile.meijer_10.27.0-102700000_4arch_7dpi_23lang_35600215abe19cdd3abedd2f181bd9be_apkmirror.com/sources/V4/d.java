package V4;

import android.database.Cursor;
import androidx.room.AbstractC6124j;
import androidx.room.G;
import androidx.room.N;
import androidx.work.impl.model.Preference;
import java.util.Collections;
import java.util.List;
import w4.C17754b;

/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final G f36877a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6124j<Preference> f36878b;

    class a extends AbstractC6124j<Preference> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6124j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(A4.g gVar, Preference preference) {
            gVar.S1(1, preference.getKey());
            if (preference.getValue() == null) {
                gVar.I(2);
            } else {
                gVar.C(2, preference.getValue().longValue());
            }
        }

        a(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        protected String createQuery() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public static List<Class<?>> c() {
        return Collections.EMPTY_LIST;
    }

    @Override // V4.c
    public void a(Preference preference) {
        this.f36877a.assertNotSuspendingTransaction();
        this.f36877a.beginTransaction();
        try {
            this.f36878b.insert((AbstractC6124j<Preference>) preference);
            this.f36877a.setTransactionSuccessful();
        } finally {
            this.f36877a.endTransaction();
        }
    }

    @Override // V4.c
    public Long b(String str) {
        N nC = N.c("SELECT long_value FROM Preference where `key`=?", 1);
        nC.S1(1, str);
        this.f36877a.assertNotSuspendingTransaction();
        Long lValueOf = null;
        Cursor cursorG = C17754b.g(this.f36877a, nC, false, null);
        try {
            if (cursorG.moveToFirst() && !cursorG.isNull(0)) {
                lValueOf = Long.valueOf(cursorG.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorG.close();
            nC.h();
        }
    }

    public d(G g10) {
        this.f36877a = g10;
        this.f36878b = new a(g10);
    }
}
