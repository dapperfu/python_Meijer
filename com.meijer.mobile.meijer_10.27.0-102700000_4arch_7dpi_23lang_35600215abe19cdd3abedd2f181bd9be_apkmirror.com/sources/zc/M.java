package zc;

import Ac.a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
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
import kv.InterfaceC15323a;
import pc.C16279c;
import pc.EnumC16282f;
import rc.i;
import uc.C17239a;
import uc.C17240b;
import uc.c;
import vc.C17544a;

/* loaded from: classes4.dex */
public class M implements InterfaceC18422d, Ac.a, InterfaceC18421c {

    /* renamed from: f, reason: collision with root package name */
    private static final C16279c f171729f = C16279c.b("proto");

    /* renamed from: a, reason: collision with root package name */
    private final W f171730a;

    /* renamed from: b, reason: collision with root package name */
    private final Bc.a f171731b;

    /* renamed from: c, reason: collision with root package name */
    private final Bc.a f171732c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC18423e f171733d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC15323a<String> f171734e;

    interface b<T, U> {
        U apply(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        final String f171735a;

        /* renamed from: b, reason: collision with root package name */
        final String f171736b;

        private c(String str, String str2) {
            this.f171735a = str;
            this.f171736b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    public static /* synthetic */ List A(SQLiteDatabase sQLiteDatabase) {
        return (List) b1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: zc.K
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.i((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ uc.f j0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (uc.f) b1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: zc.D
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.g(j10, (Cursor) obj);
            }
        });
    }

    private uc.f J0() {
        final long jA = this.f171731b.a();
        return (uc.f) L0(new b() { // from class: zc.C
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.j0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    private Long K0(SQLiteDatabase sQLiteDatabase, rc.p pVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(Cc.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) b1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: zc.n
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.K((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object O(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    private List<AbstractC18429k> S0(SQLiteDatabase sQLiteDatabase, final rc.p pVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lK0 = K0(sQLiteDatabase, pVar);
        if (lK0 == null) {
            return arrayList;
        }
        b1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lK0.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: zc.x
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.c0(this.f171792a, arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map<Long, Set<c>> U0(SQLiteDatabase sQLiteDatabase, List<AbstractC18429k> list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        b1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new b() { // from class: zc.z
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.T(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] V0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private <T> T Y0(d<T> dVar, b<Throwable, T> bVar) {
        long jA = this.f171732c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f171732c.a() >= this.f171733d.b() + jA) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static C16279c Z0(String str) {
        return str == null ? f171729f : C16279c.b(str);
    }

    private static String a1(Iterable<AbstractC18429k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC18429k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static /* synthetic */ List h(M m10, rc.p pVar, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC18429k> listS0 = m10.S0(sQLiteDatabase, pVar, m10.f171733d.d());
        for (EnumC16282f enumC16282f : EnumC16282f.values()) {
            if (enumC16282f != pVar.d()) {
                int iD = m10.f171733d.d() - listS0.size();
                if (iD <= 0) {
                    break;
                }
                listS0.addAll(m10.S0(sQLiteDatabase, pVar.f(enumC16282f), iD));
            }
        }
        return m10.R0(listS0, m10.U0(sQLiteDatabase, listS0));
    }

    public static /* synthetic */ List i(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(rc.p.a().b(cursor.getString(1)).d(Cc.a.b(cursor.getInt(2))).c(V0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ SQLiteDatabase l(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    private c.b l0(int i10) {
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
        C17544a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    private void m0(final SQLiteDatabase sQLiteDatabase) {
        Y0(new d() { // from class: zc.l
            @Override // zc.M.d
            public final Object a() {
                return M.J(sQLiteDatabase);
            }
        }, new b() { // from class: zc.w
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.O((Throwable) obj);
            }
        });
    }

    public static /* synthetic */ Object w(long j10, rc.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(Cc.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(Cc.a.a(pVar.d())));
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

    @Override // zc.InterfaceC18422d
    public void H1(final rc.p pVar, final long j10) {
        L0(new b() { // from class: zc.p
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.w(j10, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // zc.InterfaceC18422d
    public int L() {
        final long jA = this.f171731b.a() - this.f171733d.c();
        return ((Integer) L0(new b() { // from class: zc.J
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.Z(this.f171724a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // zc.InterfaceC18421c
    public void a() {
        L0(new b() { // from class: zc.q
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.e0(this.f171782a, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // zc.InterfaceC18421c
    public void b(final long j10, final c.b bVar, final String str) {
        L0(new b() { // from class: zc.r
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.R(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f171730a.close();
    }

    @Override // zc.InterfaceC18422d
    public Iterable<rc.p> p0() {
        return (Iterable) L0(new b() { // from class: zc.G
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.A((SQLiteDatabase) obj);
            }
        });
    }

    @Override // zc.InterfaceC18422d
    public boolean p1(final rc.p pVar) {
        return ((Boolean) L0(new b() { // from class: zc.o
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.u(this.f171778a, pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    SQLiteDatabase r0() {
        final W w10 = this.f171730a;
        Objects.requireNonNull(w10);
        return (SQLiteDatabase) Y0(new d() { // from class: zc.E
            @Override // zc.M.d
            public final Object a() {
                return w10.getWritableDatabase();
            }
        }, new b() { // from class: zc.F
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.l((Throwable) obj);
            }
        });
    }

    @Override // zc.InterfaceC18422d
    public Iterable<AbstractC18429k> t1(final rc.p pVar) {
        return (Iterable) L0(new b() { // from class: zc.m
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.h(this.f171776a, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    M(Bc.a aVar, Bc.a aVar2, AbstractC18423e abstractC18423e, W w10, InterfaceC15323a<String> interfaceC15323a) {
        this.f171730a = w10;
        this.f171731b = aVar;
        this.f171732c = aVar2;
        this.f171733d = abstractC18423e;
        this.f171734e = interfaceC15323a;
    }

    public static /* synthetic */ C17239a B(M m10, Map map, C17239a.C2575a c2575a, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b bVarL0 = m10.l0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(uc.c.c().c(bVarL0).b(j10).a());
        }
        m10.W0(c2575a, map);
        return c2575a.e(m10.J0()).d(m10.v0()).c(m10.f171734e.get()).b();
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

    private long F0() {
        return r0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public static /* synthetic */ Long H(M m10, rc.i iVar, rc.p pVar, SQLiteDatabase sQLiteDatabase) {
        boolean z10;
        byte[] bArr;
        if (m10.N0()) {
            m10.b(1L, c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long jN0 = m10.n0(sQLiteDatabase, pVar);
        int iE = m10.f171733d.e();
        byte[] bArrA = iVar.e().a();
        if (bArrA.length <= iE) {
            z10 = true;
        } else {
            z10 = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jN0));
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

    private boolean N0() {
        if (z0() * F0() >= this.f171733d.f()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object R(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) throws SQLException {
        if (!((Boolean) b1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.g())}), new b() { // from class: zc.y
            @Override // zc.M.b
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

    private List<AbstractC18429k> R0(List<AbstractC18429k> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC18429k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC18429k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a aVarP = next.b().p();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    aVarP.c(cVar.f171735a, cVar.f171736b);
                }
                listIterator.set(AbstractC18429k.a(next.c(), next.d(), aVarP.d()));
            }
        }
        return list;
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

    private void W0(C17239a.C2575a c2575a, Map<String, List<uc.c>> map) {
        for (Map.Entry<String, List<uc.c>> entry : map.entrySet()) {
            c2575a.a(uc.d.c().c(entry.getKey()).b(entry.getValue()).a());
        }
    }

    private byte[] X0(long j10) {
        return (byte[]) b1(r0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: zc.B
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.z((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Integer Z(final M m10, long j10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        String[] strArr = {String.valueOf(j10)};
        b1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: zc.s
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.m(this.f171786a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    static <T> T b1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object c0(M m10, List list, rc.p pVar, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            boolean z10 = false;
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z10 = true;
            }
            i.a aVarO = rc.i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z10) {
                aVarO.h(new rc.h(Z0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarO.h(new rc.h(Z0(cursor.getString(4)), m10.X0(j10)));
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
            list.add(AbstractC18429k.a(j10, pVar, aVarO.d()));
        }
        return null;
    }

    public static /* synthetic */ Object e0(M m10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m10.f171731b.a()).execute();
        return null;
    }

    public static /* synthetic */ uc.f g(long j10, Cursor cursor) {
        cursor.moveToNext();
        return uc.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static /* synthetic */ C17239a h0(final M m10, String str, final Map map, final C17239a.C2575a c2575a, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        return (C17239a) b1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: zc.A
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.B(this.f171715a, map, c2575a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long i0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ Object j(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.b(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object m(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.b(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    private long n0(SQLiteDatabase sQLiteDatabase, rc.p pVar) {
        Long lK0 = K0(sQLiteDatabase, pVar);
        if (lK0 != null) {
            return lK0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(Cc.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public static /* synthetic */ Object p(final M m10, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        b1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: zc.v
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.j(this.f171791a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Boolean u(M m10, rc.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long lK0 = m10.K0(sQLiteDatabase, pVar);
        if (lK0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) b1(m10.r0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lK0.toString()}), new b() { // from class: zc.u
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    private C17240b v0() {
        return C17240b.b().b(uc.e.c().b(q0()).c(AbstractC18423e.f171770a.f()).a()).a();
    }

    private long z0() {
        return r0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    <T> T L0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase sQLiteDatabaseR0 = r0();
        sQLiteDatabaseR0.beginTransaction();
        try {
            T tApply = bVar.apply(sQLiteDatabaseR0);
            sQLiteDatabaseR0.setTransactionSuccessful();
            return tApply;
        } finally {
            sQLiteDatabaseR0.endTransaction();
        }
    }

    @Override // zc.InterfaceC18422d
    public void M(Iterable<AbstractC18429k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        r0().compileStatement("DELETE FROM events WHERE _id in " + a1(iterable)).execute();
    }

    @Override // Ac.a
    public <T> T c(a.InterfaceC0009a<T> interfaceC0009a) {
        SQLiteDatabase sQLiteDatabaseR0 = r0();
        m0(sQLiteDatabaseR0);
        try {
            T tExecute = interfaceC0009a.execute();
            sQLiteDatabaseR0.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseR0.endTransaction();
        }
    }

    @Override // zc.InterfaceC18421c
    public C17239a d() {
        final C17239a.C2575a c2575aE = C17239a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C17239a) L0(new b() { // from class: zc.t
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.h0(this.f171787a, str, map, c2575aE, (SQLiteDatabase) obj);
            }
        });
    }

    long q0() {
        return z0() * F0();
    }

    @Override // zc.InterfaceC18422d
    public AbstractC18429k t0(final rc.p pVar, final rc.i iVar) {
        C17544a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long jLongValue = ((Long) L0(new b() { // from class: zc.I
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.H(this.f171721a, iVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC18429k.a(jLongValue, pVar, iVar);
    }

    @Override // zc.InterfaceC18422d
    public long u1(rc.p pVar) {
        return ((Long) b1(r0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(Cc.a.a(pVar.d()))}), new b() { // from class: zc.H
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.i0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // zc.InterfaceC18422d
    public void y1(Iterable<AbstractC18429k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + a1(iterable);
        final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
        L0(new b() { // from class: zc.L
            @Override // zc.M.b
            public final Object apply(Object obj) {
                return M.p(this.f171726a, str, str2, (SQLiteDatabase) obj);
            }
        });
    }
}
