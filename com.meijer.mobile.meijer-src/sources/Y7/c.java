package Y7;

import android.database.Cursor;
import androidx.room.AbstractC6264h;
import androidx.room.AbstractC6266j;
import androidx.room.C6260d;
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
import w4.C17823a;
import w4.C17824b;
import w4.C17840r;

/* loaded from: classes4.dex */
public final class c implements Y7.b {

    /* renamed from: a, reason: collision with root package name */
    private final G f42976a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC6266j<EventRecord> f42977b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6264h<EventRecord> f42978c;

    /* renamed from: d, reason: collision with root package name */
    private final S f42979d;

    /* renamed from: e, reason: collision with root package name */
    private final S f42980e;

    class a implements Callable<List<EventMetadata>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f42981a;

        a(N n10) {
            this.f42981a = n10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<EventMetadata> call() throws Exception {
            Cursor cursorG = C17824b.g(c.this.f42976a, this.f42981a, false, null);
            try {
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList.add(new EventMetadata(cursorG.getLong(0), cursorG.getLong(1), cursorG.getInt(2) != 0, cursorG.getInt(3)));
                }
                return arrayList;
            } finally {
                cursorG.close();
                this.f42981a.h();
            }
        }
    }

    class b implements Callable<List<EventRecord>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ N f42983a;

        b(N n10) {
            this.f42983a = n10;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<EventRecord> call() throws Exception {
            Cursor cursorG = C17824b.g(c.this.f42976a, this.f42983a, false, null);
            try {
                int iE = C17823a.e(cursorG, PreferencesHelper.PREF_ID);
                int iE2 = C17823a.e(cursorG, "event");
                int iE3 = C17823a.e(cursorG, "timestamp");
                int iE4 = C17823a.e(cursorG, "isPriorityData");
                int iE5 = C17823a.e(cursorG, "eventSizeBytes");
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList.add(new EventRecord(cursorG.getLong(iE), cursorG.getString(iE2), cursorG.getLong(iE3), cursorG.getInt(iE4) != 0, cursorG.getInt(iE5)));
                }
                return arrayList;
            } finally {
                cursorG.close();
                this.f42983a.h();
            }
        }
    }

    /* renamed from: Y7.c$c, reason: collision with other inner class name */
    class CallableC0909c implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f42985a;

        CallableC0909c(List list) {
            this.f42985a = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            StringBuilder sbB = C17840r.b();
            sbB.append("DELETE FROM events WHERE id IN (");
            C17840r.a(sbB, this.f42985a.size());
            sbB.append(")");
            B4.g gVarCompileStatement = c.this.f42976a.compileStatement(sbB.toString());
            Iterator it = this.f42985a.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                gVarCompileStatement.C(i10, ((Long) it.next()).longValue());
                i10++;
            }
            c.this.f42976a.beginTransaction();
            try {
                gVarCompileStatement.a0();
                c.this.f42976a.setTransactionSuccessful();
                return Unit.f143329a;
            } finally {
                c.this.f42976a.endTransaction();
            }
        }
    }

    class d extends AbstractC6266j<EventRecord> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6266j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g gVar, EventRecord eventRecord) {
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

    class e extends AbstractC6264h<EventRecord> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.room.AbstractC6264h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void bind(B4.g gVar, EventRecord eventRecord) {
            gVar.C(1, eventRecord.getId());
        }

        e(G g10) {
            super(g10);
        }

        @Override // androidx.room.AbstractC6264h, androidx.room.S
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
        final /* synthetic */ EventRecord f42991a;

        h(EventRecord eventRecord) {
            this.f42991a = eventRecord;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            c.this.f42976a.beginTransaction();
            try {
                c.this.f42977b.insert((AbstractC6266j) this.f42991a);
                c.this.f42976a.setTransactionSuccessful();
                return Unit.f143329a;
            } finally {
                c.this.f42976a.endTransaction();
            }
        }
    }

    class i implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f42993a;

        i(List list) {
            this.f42993a = list;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            c.this.f42976a.beginTransaction();
            try {
                c.this.f42978c.handleMultiple(this.f42993a);
                c.this.f42976a.setTransactionSuccessful();
                return Unit.f143329a;
            } finally {
                c.this.f42976a.endTransaction();
            }
        }
    }

    class j implements Callable<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f42995a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f42996b;

        j(long j10, long j11) {
            this.f42995a = j10;
            this.f42996b = j11;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            B4.g gVarAcquire = c.this.f42979d.acquire();
            gVarAcquire.C(1, this.f42995a);
            gVarAcquire.C(2, this.f42996b);
            try {
                c.this.f42976a.beginTransaction();
                try {
                    gVarAcquire.a0();
                    c.this.f42976a.setTransactionSuccessful();
                    return Unit.f143329a;
                } finally {
                    c.this.f42976a.endTransaction();
                }
            } finally {
                c.this.f42979d.release(gVarAcquire);
            }
        }
    }

    class k implements Callable<Unit> {
        k() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit call() throws Exception {
            B4.g gVarAcquire = c.this.f42980e.acquire();
            try {
                c.this.f42976a.beginTransaction();
                try {
                    gVarAcquire.a0();
                    c.this.f42976a.setTransactionSuccessful();
                    return Unit.f143329a;
                } finally {
                    c.this.f42976a.endTransaction();
                }
            } finally {
                c.this.f42980e.release(gVarAcquire);
            }
        }
    }

    public static List<Class<?>> l() {
        return Collections.EMPTY_LIST;
    }

    @Override // Y7.b
    public Object a(List<EventRecord> list, Continuation<? super Unit> continuation) {
        return C6260d.c(this.f42976a, true, new i(list), continuation);
    }

    @Override // Y7.b
    public Object b(EventRecord eventRecord, Continuation<? super Unit> continuation) {
        return C6260d.c(this.f42976a, true, new h(eventRecord), continuation);
    }

    @Override // Y7.b
    public Object c(boolean z10, int i10, Continuation<? super List<EventMetadata>> continuation) {
        N nC = N.c("SELECT id, timestamp, isPriorityData, eventSizeBytes FROM events WHERE isPriorityData = ? LIMIT ?", 2);
        nC.C(1, z10 ? 1L : 0L);
        nC.C(2, i10);
        return C6260d.b(this.f42976a, false, C17824b.a(), new a(nC), continuation);
    }

    @Override // Y7.b
    public Object deleteAll(Continuation<? super Unit> continuation) {
        return C6260d.c(this.f42976a, true, new k(), continuation);
    }

    @Override // Y7.b
    public Object e(List<Long> list, Continuation<? super Unit> continuation) {
        return C6260d.c(this.f42976a, true, new CallableC0909c(list), continuation);
    }

    @Override // Y7.b
    public Object f(long j10, long j11, Continuation<? super Unit> continuation) {
        return C6260d.c(this.f42976a, true, new j(j11, j10), continuation);
    }

    public c(G g10) {
        this.f42976a = g10;
        this.f42977b = new d(g10);
        this.f42978c = new e(g10);
        this.f42979d = new f(g10);
        this.f42980e = new g(g10);
    }

    @Override // Y7.b
    public Object d(List<Long> list, Continuation<? super List<EventRecord>> continuation) {
        StringBuilder sbB = C17840r.b();
        sbB.append("SELECT * FROM events WHERE id IN (");
        int size = list.size();
        C17840r.a(sbB, size);
        sbB.append(")");
        N nC = N.c(sbB.toString(), size);
        Iterator<Long> it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            nC.C(i10, it.next().longValue());
            i10++;
        }
        return C6260d.b(this.f42976a, false, C17824b.a(), new b(nC), continuation);
    }
}
