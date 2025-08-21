package Bc;

import Cc.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import gv.InterfaceC14411a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import rc.C16883c;
import rc.EnumC16886f;
import tc.i;
import wc.C17856a;
import wc.C17857b;
import wc.c;
import xc.C18156a;

/* loaded from: classes4.dex */
public class M implements InterfaceC2922d, Cc.a, InterfaceC2921c {

    /* renamed from: f, reason: collision with root package name */
    private static final C16883c f2643f = C16883c.b("proto");

    /* renamed from: a, reason: collision with root package name */
    private final W f2644a;

    /* renamed from: b, reason: collision with root package name */
    private final Dc.a f2645b;

    /* renamed from: c, reason: collision with root package name */
    private final Dc.a f2646c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2923e f2647d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC14411a<String> f2648e;

    interface b<T, U> {
        U apply(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f2649a;

        /* renamed from: b, reason: collision with root package name */
        final String f2650b;

        private c(String str, String str2) {
            this.f2649a = str;
            this.f2650b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    public static /* synthetic */ List A(SQLiteDatabase sQLiteDatabase) {
        return (List) a1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: Bc.K
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.i((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ wc.f k0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (wc.f) a1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: Bc.D
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.g(j10, (Cursor) obj);
            }
        });
    }

    private wc.f H0() {
        final long jA = this.f2645b.a();
        return (wc.f) J0(new b() { // from class: Bc.C
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.k0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    private Long I0(SQLiteDatabase sQLiteDatabase, tc.p pVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(Ec.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) a1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: Bc.n
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.K((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object O(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    private List<AbstractC2929k> Q0(SQLiteDatabase sQLiteDatabase, final tc.p pVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lI0 = I0(sQLiteDatabase, pVar);
        if (lI0 == null) {
            return arrayList;
        }
        a1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lI0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: Bc.x
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.b0(this.f2706a, arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> S0(SQLiteDatabase sQLiteDatabase, List<AbstractC2929k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        a1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: Bc.z
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.T(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] T0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private <T> T X0(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.f2646c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f2646c.a() >= this.f2647d.b() + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static C16883c Y0(String str) {
        return str == null ? f2643f : C16883c.b(str);
    }

    private static String Z0(Iterable<AbstractC2929k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC2929k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static /* synthetic */ List h(M m10, tc.p pVar, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC2929k> listQ0 = m10.Q0(sQLiteDatabase, pVar, m10.f2647d.d());
        for (EnumC16886f enumC16886f : EnumC16886f.values()) {
            if (enumC16886f != pVar.d()) {
                int iD = m10.f2647d.d() - listQ0.size();
                if (iD <= 0) {
                    break;
                }
                listQ0.addAll(m10.Q0(sQLiteDatabase, pVar.f(enumC16886f), iD));
            }
        }
        return m10.P0(listQ0, m10.S0(sQLiteDatabase, listQ0));
    }

    public static /* synthetic */ List i(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(tc.p.a().b(cursor.getString(1)).d(Ec.a.b(cursor.getInt(2))).c(T0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ SQLiteDatabase l(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    private c.b m0(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.g()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.g()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.g()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.g()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.g()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.g()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.g()) {
            return bVar7;
        }
        C18156a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void n0(final SQLiteDatabase sQLiteDatabase) {
        X0(new d() { // from class: Bc.l
            @Override // Bc.M.d
            public final Object a() {
                return M.J(sQLiteDatabase);
            }
        }, new b() { // from class: Bc.w
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.O((Throwable) obj);
            }
        });
    }

    public static /* synthetic */ Object w(long j10, tc.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(Ec.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(Ec.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] z(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    @Override // Bc.InterfaceC2922d
    public int L() {
        final long jA = this.f2645b.a() - this.f2647d.c();
        return ((Integer) J0(new b() { // from class: Bc.J
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.Y(this.f2638a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // Bc.InterfaceC2922d
    public void V0(final tc.p pVar, final long j10) {
        J0(new b() { // from class: Bc.p
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.w(j10, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // Bc.InterfaceC2921c
    public void a() {
        J0(new b() { // from class: Bc.q
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.e0(this.f2696a, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // Bc.InterfaceC2921c
    public void b(final long j10, final c.b bVar, final String str) {
        J0(new b() { // from class: Bc.r
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.R(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // Bc.InterfaceC2922d
    public Iterable<AbstractC2929k> b1(final tc.p pVar) {
        return (Iterable) J0(new b() { // from class: Bc.m
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.h(this.f2690a, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2644a.close();
    }

    @Override // Bc.InterfaceC2922d
    public Iterable<tc.p> q0() {
        return (Iterable) J0(new b() { // from class: Bc.G
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.A((SQLiteDatabase) obj);
            }
        });
    }

    SQLiteDatabase s0() {
        final W w10 = this.f2644a;
        Objects.requireNonNull(w10);
        return (SQLiteDatabase) X0(new d() { // from class: Bc.E
            @Override // Bc.M.d
            public final Object a() {
                return w10.getWritableDatabase();
            }
        }, new b() { // from class: Bc.F
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.l((Throwable) obj);
            }
        });
    }

    @Override // Bc.InterfaceC2922d
    public boolean w1(final tc.p pVar) {
        return ((Boolean) J0(new b() { // from class: Bc.o
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.u(this.f2692a, pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    M(Dc.a aVar, Dc.a aVar2, AbstractC2923e abstractC2923e, W w10, InterfaceC14411a<String> interfaceC14411a) {
        this.f2644a = w10;
        this.f2645b = aVar;
        this.f2646c = aVar2;
        this.f2647d = abstractC2923e;
        this.f2648e = interfaceC14411a;
    }

    public static /* synthetic */ C17856a B(M m10, Map map, C17856a.C2657a c2657a, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b bVarM0 = m10.m0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(wc.c.c().c(bVarM0).b(j10).a());
        }
        m10.U0(c2657a, map);
        return c2657a.e(m10.H0()).d(m10.v0()).c(m10.f2648e.get()).b();
    }

    public static /* synthetic */ Boolean D(Cursor cursor) {
        boolean z10;
        if (cursor.getCount() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private long E0() {
        return s0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public static /* synthetic */ Long H(M m10, tc.i iVar, tc.p pVar, SQLiteDatabase sQLiteDatabase) {
        boolean z10;
        byte[] bArr;
        if (m10.K0()) {
            m10.b(1L, c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long jO0 = m10.o0(sQLiteDatabase, pVar);
        int iE = m10.f2647d.e();
        byte[] bArrA = iVar.e().a();
        if (bArrA.length <= iE) {
            z10 = true;
        } else {
            z10 = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jO0));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        if (z10) {
            bArr = bArrA;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(bArrA.length / iE);
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i10 - 1) * iE, Math.min(i10 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : iVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ Object J(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long K(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    private boolean K0() {
        if (x0() * E0() >= this.f2647d.f()) {
            return true;
        }
        return false;
    }

    private List<AbstractC2929k> P0(List<AbstractC2929k> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC2929k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC2929k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a aVarP = next.b().p();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarP.c(cVar.f2649a, cVar.f2650b);
                }
                listIterator.set(AbstractC2929k.a(next.c(), next.d(), aVarP.d()));
            }
        }
        return list;
    }

    public static /* synthetic */ Object R(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (!((Boolean) a1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.g())}), new b() { // from class: Bc.y
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.D((Cursor) obj);
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.g()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        }
        sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.g())});
        return null;
    }

    public static /* synthetic */ Object T(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    private void U0(C17856a.C2657a c2657a, Map<String, List<wc.c>> map) {
        for (Map.Entry<String, List<wc.c>> entry : map.entrySet()) {
            c2657a.a(wc.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] W0(long j10) {
        return (byte[]) a1(s0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: Bc.B
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.z((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Integer Y(final M m10, long j10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        String[] strArr = {String.valueOf(j10)};
        a1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: Bc.s
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.m(this.f2700a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    static <T> T a1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object b0(M m10, List list, tc.p pVar, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            boolean z10 = false;
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z10 = true;
            }
            i.a aVarO = tc.i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z10) {
                aVarO.h(new tc.h(Y0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarO.h(new tc.h(Y0(cursor.getString(4)), m10.W0(j10)));
            }
            if (!cursor.isNull(6)) {
                aVarO.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                aVarO.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                aVarO.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                aVarO.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                aVarO.k(cursor.getBlob(11));
            }
            list.add(AbstractC2929k.a(j10, pVar, aVarO.d()));
        }
        return null;
    }

    public static /* synthetic */ Object e0(M m10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m10.f2645b.a()).execute();
        return null;
    }

    public static /* synthetic */ wc.f g(long j10, Cursor cursor) {
        cursor.moveToNext();
        return wc.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static /* synthetic */ C17856a h0(final M m10, String str, final Map map, final C17856a.C2657a c2657a, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        return (C17856a) a1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: Bc.A
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.B(this.f2629a, map, c2657a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object j(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.b(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Long j0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ Object m(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.b(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    private long o0(SQLiteDatabase sQLiteDatabase, tc.p pVar) {
        Long lI0 = I0(sQLiteDatabase, pVar);
        if (lI0 != null) {
            return lI0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(Ec.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public static /* synthetic */ Object p(final M m10, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        a1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: Bc.v
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.j(this.f2705a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean u(M m10, tc.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long lI0 = m10.I0(sQLiteDatabase, pVar);
        if (lI0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) a1(m10.s0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lI0.toString()}), new b() { // from class: Bc.u
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    private C17857b v0() {
        return C17857b.b().b(wc.e.c().b(r0()).c(AbstractC2923e.f2684a.f()).a()).a();
    }

    private long x0() {
        return s0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @Override // Bc.InterfaceC2922d
    public long I1(tc.p pVar) {
        return ((Long) a1(s0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(Ec.a.a(pVar.d()))}), new b() { // from class: Bc.H
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.j0((Cursor) obj);
            }
        })).longValue();
    }

    <T> T J0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseS0 = s0();
        sQLiteDatabaseS0.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseS0);
            sQLiteDatabaseS0.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseS0.endTransaction();
        }
    }

    @Override // Bc.InterfaceC2922d
    public void M(Iterable<AbstractC2929k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        s0().compileStatement("DELETE FROM events WHERE _id in " + Z0(iterable)).execute();
    }

    @Override // Cc.a
    public <T> T c(a.InterfaceC0086a<T> interfaceC0086a) {
        SQLiteDatabase sQLiteDatabaseS0 = s0();
        n0(sQLiteDatabaseS0);
        try {
            T tExecute = interfaceC0086a.execute();
            sQLiteDatabaseS0.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseS0.endTransaction();
        }
    }

    @Override // Bc.InterfaceC2921c
    public C17856a d() {
        final C17856a.C2657a c2657aE = C17856a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C17856a) J0(new b() { // from class: Bc.t
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.h0(this.f2701a, str, map, c2657aE, (SQLiteDatabase) obj);
            }
        });
    }

    long r0() {
        return x0() * E0();
    }

    @Override // Bc.InterfaceC2922d
    public AbstractC2929k u1(final tc.p pVar, final tc.i iVar) {
        C18156a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long jLongValue = ((Long) J0(new b() { // from class: Bc.I
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.H(this.f2635a, iVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC2929k.a(jLongValue, pVar, iVar);
    }

    @Override // Bc.InterfaceC2922d
    public void x1(Iterable<AbstractC2929k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + Z0(iterable);
        final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
        J0(new b() { // from class: Bc.L
            @Override // Bc.M.b
            public final Object apply(Object obj) {
                return M.p(this.f2640a, str, str2, (SQLiteDatabase) obj);
            }
        });
    }
}
