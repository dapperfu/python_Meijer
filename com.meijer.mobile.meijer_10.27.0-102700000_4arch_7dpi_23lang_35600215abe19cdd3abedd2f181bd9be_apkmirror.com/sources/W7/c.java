package W7;

import android.database.Cursor;
import androidx.room.AbstractC6122h;
import androidx.room.AbstractC6124j;
import androidx.room.C6118d;
import androidx.room.G;
import androidx.room.N;
import androidx.room.S;
import com.dynatrace.agent.storage.db.EventRecord;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import w4.C17753a;
import w4.C17754b;
import w4.C17770r;

/* loaded from: classes4.dex */
public final class c implements W7.b {

    /* renamed from: a, reason: collision with root package name */
    private final G f38577a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6124j<EventRecord> f38578b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6122h<EventRecord> f38579c;

    /* renamed from: d, reason: collision with root package name */
    private final S f38580d;

    /* renamed from: e, reason: collision with root package name */
    private final S f38581e;

    class a implements Callable<List<EventMetadata>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f38582a;

        a(N n10) {
            this.f38582a = n10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<EventMetadata> call() throws Exception {
            Cursor cursorG = C17754b.g(c.this.f38577a, this.f38582a, false, null);
            try {
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList.add(new EventMetadata(cursorG.getLong(0), cursorG.getLong(1), cursorG.getInt(2) != 0, cursorG.getInt(3)));
                }
                return arrayList;
            } finally {
                cursorG.close();
                this.f38582a.h();
            }
        }
    }

    class b implements Callable<List<EventRecord>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f38584a;

        b(N n10) {
            this.f38584a = n10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<EventRecord> call() throws Exception {
            Cursor cursorG = C17754b.g(c.this.f38577a, this.f38584a, false, null);
            try {
                int iE = C17753a.e(cursorG, PreferencesHelper.PREF_ID);
                int iE2 = C17753a.e(cursorG, "event");
                int iE3 = C17753a.e(cursorG, "timestamp");
                int iE4 = C17753a.e(cursorG, "isPriorityData");
                int iE5 = C17753a.e(cursorG, "eventSizeBytes");
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList.add(new EventRecord(cursorG.getLong(iE), cursorG.getString(iE2), cursorG.getLong(iE3), cursorG.getInt(iE4) != 0, cursorG.getInt(iE5)));
                }
                return arrayList;
            } finally {
                cursorG.close();
                this.f38584a.h();
            }
        }
    }

    /* renamed from: W7.c$c, reason: collision with other inner class name */
    class CallableC0830c implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f38586a;

        CallableC0830c(List list) {
            this.f38586a = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            StringBuilder sbB = C17770r.b();
            sbB.append("DELETE FROM events WHERE id IN (");
            C17770r.a(sbB, this.f38586a.size());
            sbB.append(")");
            A4.g gVarCompileStatement = c.this.f38577a.compileStatement(sbB.toString());
            Iterator it = this.f38586a.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                gVarCompileStatement.C(i10, ((Long) it.next()).longValue());
                i10++;
            }
            c.this.f38577a.beginTransaction();
            try {
                gVarCompileStatement.b0();
                c.this.f38577a.setTransactionSuccessful();
                return Unit.f142422a;
            } finally {
                c.this.f38577a.endTransaction();
            }
        }
    }

    class d extends AbstractC6124j<EventRecord> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6124j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(A4.g gVar, EventRecord eventRecord) {
            gVar.C(1, eventRecord.getId());
            gVar.S1(2, eventRecord.getEvent());
            gVar.C(3, eventRecord.getTimestamp());
            gVar.C(4, eventRecord.getIsPriorityData() ? 1L : 0L);
            gVar.C(5, eventRecord.getEventSizeBytes());
        }

        d(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        protected String createQuery() {
            return "INSERT OR ABORT INTO `events` (`id`,`event`,`timestamp`,`isPriorityData`,`eventSizeBytes`) VALUES (nullif(?, 0),?,?,?,?)";
        }
    }

    class e extends AbstractC6122h<EventRecord> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6122h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(A4.g gVar, EventRecord eventRecord) {
            gVar.C(1, eventRecord.getId());
        }

        e(G g10) {
            super(g10);
        }

        @Override // androidx.room.AbstractC6122h, androidx.room.S
        protected String createQuery() {
            return "DELETE FROM `events` WHERE `id` = ?";
        }
    }

    class f extends S {
        f(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "DELETE FROM events WHERE ? < ? - timestamp";
        }
    }

    class g extends S {
        g(G g10) {
            super(g10);
        }

        @Override // androidx.room.S
        public String createQuery() {
            return "DELETE FROM events";
        }
    }

    class h implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventRecord f38592a;

        h(EventRecord eventRecord) {
            this.f38592a = eventRecord;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            c.this.f38577a.beginTransaction();
            try {
                c.this.f38578b.insert((AbstractC6124j) this.f38592a);
                c.this.f38577a.setTransactionSuccessful();
                return Unit.f142422a;
            } finally {
                c.this.f38577a.endTransaction();
            }
        }
    }

    class i implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f38594a;

        i(List list) {
            this.f38594a = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            c.this.f38577a.beginTransaction();
            try {
                c.this.f38579c.handleMultiple(this.f38594a);
                c.this.f38577a.setTransactionSuccessful();
                return Unit.f142422a;
            } finally {
                c.this.f38577a.endTransaction();
            }
        }
    }

    class j implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f38596a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f38597b;

        j(long j10, long j11) {
            this.f38596a = j10;
            this.f38597b = j11;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            A4.g gVarAcquire = c.this.f38580d.acquire();
            gVarAcquire.C(1, this.f38596a);
            gVarAcquire.C(2, this.f38597b);
            try {
                c.this.f38577a.beginTransaction();
                try {
                    gVarAcquire.b0();
                    c.this.f38577a.setTransactionSuccessful();
                    return Unit.f142422a;
                } finally {
                    c.this.f38577a.endTransaction();
                }
            } finally {
                c.this.f38580d.release(gVarAcquire);
            }
        }
    }

    class k implements Callable<Unit> {
        k() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            A4.g gVarAcquire = c.this.f38581e.acquire();
            try {
                c.this.f38577a.beginTransaction();
                try {
                    gVarAcquire.b0();
                    c.this.f38577a.setTransactionSuccessful();
                    return Unit.f142422a;
                } finally {
                    c.this.f38577a.endTransaction();
                }
            } finally {
                c.this.f38581e.release(gVarAcquire);
            }
        }
    }

    public static List<Class<?>> m() {
        return Collections.EMPTY_LIST;
    }

    @Override // W7.b
    public Object a(List<EventRecord> list, Continuation<? super Unit> continuation) {
        return C6118d.c(this.f38577a, true, new i(list), continuation);
    }

    @Override // W7.b
    public Object b(EventRecord eventRecord, Continuation<? super Unit> continuation) {
        return C6118d.c(this.f38577a, true, new h(eventRecord), continuation);
    }

    @Override // W7.b
    public Object c(Continuation<? super Unit> continuation) {
        return C6118d.c(this.f38577a, true, new k(), continuation);
    }

    @Override // W7.b
    public Object d(boolean z10, int i10, Continuation<? super List<EventMetadata>> continuation) {
        N nC = N.c("SELECT id, timestamp, isPriorityData, eventSizeBytes FROM events WHERE isPriorityData = ? LIMIT ?", 2);
        nC.C(1, z10 ? 1L : 0L);
        nC.C(2, i10);
        return C6118d.b(this.f38577a, false, C17754b.a(), new a(nC), continuation);
    }

    @Override // W7.b
    public Object f(List<Long> list, Continuation<? super Unit> continuation) {
        return C6118d.c(this.f38577a, true, new CallableC0830c(list), continuation);
    }

    @Override // W7.b
    public Object g(long j10, long j11, Continuation<? super Unit> continuation) {
        return C6118d.c(this.f38577a, true, new j(j11, j10), continuation);
    }

    public c(G g10) {
        this.f38577a = g10;
        this.f38578b = new d(g10);
        this.f38579c = new e(g10);
        this.f38580d = new f(g10);
        this.f38581e = new g(g10);
    }

    @Override // W7.b
    public Object e(List<Long> list, Continuation<? super List<EventRecord>> continuation) {
        StringBuilder sbB = C17770r.b();
        sbB.append("SELECT * FROM events WHERE id IN (");
        int size = list.size();
        C17770r.a(sbB, size);
        sbB.append(")");
        N nC = N.c(sbB.toString(), size);
        Iterator<Long> it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            nC.C(i10, it.next().longValue());
            i10++;
        }
        return C6118d.b(this.f38577a, false, C17754b.a(), new b(nC), continuation);
    }
}
