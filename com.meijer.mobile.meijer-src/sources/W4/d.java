package W4;

import android.database.Cursor;
import androidx.room.AbstractC6266j;
import androidx.room.G;
import androidx.room.N;
import androidx.work.impl.model.Preference;
import java.util.Collections;
import java.util.List;
import w4.C17824b;

/* loaded from: classes4.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final G f40758a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6266j<Preference> f40759b;

    class a extends AbstractC6266j<Preference> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6266j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g gVar, Preference preference) {
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

    @Override // W4.c
    public void a(Preference preference) {
        this.f40758a.assertNotSuspendingTransaction();
        this.f40758a.beginTransaction();
        try {
            this.f40759b.insert((AbstractC6266j<Preference>) preference);
            this.f40758a.setTransactionSuccessful();
        } finally {
            this.f40758a.endTransaction();
        }
    }

    @Override // W4.c
    public Long b(String str) {
        N nC = N.c("SELECT long_value FROM Preference where `key`=?", 1);
        nC.S1(1, str);
        this.f40758a.assertNotSuspendingTransaction();
        Long lValueOf = null;
        Cursor cursorG = C17824b.g(this.f40758a, nC, false, null);
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
        this.f40758a = g10;
        this.f40759b = new a(g10);
    }
}
