package w4;

import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import w4.C17841s;

@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a+\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u000e\u001a)\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!¨\u0006#"}, d2 = {"", "type", "", "a", "(Ljava/lang/String;)I", "LA4/b;", "connection", "tableName", "Lw4/s;", "g", "(LA4/b;Ljava/lang/String;)Lw4/s;", "", "Lw4/s$c;", "d", "(LA4/b;Ljava/lang/String;)Ljava/util/Set;", "LA4/d;", "stmt", "", "Lw4/f;", "c", "(LA4/d;)Ljava/util/List;", "", "Lw4/s$a;", "b", "(LA4/b;Ljava/lang/String;)Ljava/util/Map;", "Lw4/s$d;", "f", "name", "", "unique", "e", "(LA4/b;Ljava/lang/String;Z)Lw4/s$d;", "", "[Ljava/lang/String;", "FTS_OPTIONS", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w4.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17839q {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f166913a = {"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: w4.q$a */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d((Integer) ((Map.Entry) t10).getKey(), (Integer) ((Map.Entry) t11).getKey());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: w4.q$b */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d((Integer) ((Map.Entry) t10).getKey(), (Integer) ((Map.Entry) t11).getKey());
        }
    }

    public static final int a(String str) {
        if (str == null) {
            return 5;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.i(upperCase, "toUpperCase(...)");
        if (StringsKt.d0(upperCase, "INT", false, 2, null)) {
            return 3;
        }
        if (StringsKt.d0(upperCase, "CHAR", false, 2, null) || StringsKt.d0(upperCase, "CLOB", false, 2, null) || StringsKt.d0(upperCase, "TEXT", false, 2, null)) {
            return 2;
        }
        if (StringsKt.d0(upperCase, "BLOB", false, 2, null)) {
            return 5;
        }
        return (StringsKt.d0(upperCase, "REAL", false, 2, null) || StringsKt.d0(upperCase, "FLOA", false, 2, null) || StringsKt.d0(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
    }

    private static final Map<String, C17841s.a> b(A4.b bVar, String str) {
        A4.d dVarS3 = bVar.S3("PRAGMA table_info(`" + str + "`)");
        try {
            if (!dVarS3.N3()) {
                Map<String, C17841s.a> mapK = MapsKt.k();
                AutoCloseableKt.a(dVarS3, null);
                return mapK;
            }
            int iA = C17836n.a(dVarS3, "name");
            int iA2 = C17836n.a(dVarS3, "type");
            int iA3 = C17836n.a(dVarS3, "notnull");
            int iA4 = C17836n.a(dVarS3, "pk");
            int iA5 = C17836n.a(dVarS3, "dflt_value");
            Map mapD = MapsKt.d();
            do {
                String strO2 = dVarS3.O2(iA);
                mapD.put(strO2, new C17841s.a(strO2, dVarS3.O2(iA2), dVarS3.getLong(iA3) != 0, (int) dVarS3.getLong(iA4), dVarS3.isNull(iA5) ? null : dVarS3.O2(iA5), 2));
            } while (dVarS3.N3());
            Map<String, C17841s.a> mapC = MapsKt.c(mapD);
            AutoCloseableKt.a(dVarS3, null);
            return mapC;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AutoCloseableKt.a(dVarS3, th2);
                throw th3;
            }
        }
    }

    private static final List<C17828f> c(A4.d dVar) {
        int iA = C17836n.a(dVar, PreferencesHelper.PREF_ID);
        int iA2 = C17836n.a(dVar, "seq");
        int iA3 = C17836n.a(dVar, "from");
        int iA4 = C17836n.a(dVar, "to");
        List listC = CollectionsKt.c();
        while (dVar.N3()) {
            listC.add(new C17828f((int) dVar.getLong(iA), (int) dVar.getLong(iA2), dVar.O2(iA3), dVar.O2(iA4)));
        }
        return CollectionsKt.Y0(CollectionsKt.a(listC));
    }

    private static final Set<C17841s.c> d(A4.b bVar, String str) {
        A4.d dVarS3 = bVar.S3("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int iA = C17836n.a(dVarS3, PreferencesHelper.PREF_ID);
            int iA2 = C17836n.a(dVarS3, "seq");
            int iA3 = C17836n.a(dVarS3, "table");
            int iA4 = C17836n.a(dVarS3, "on_delete");
            int iA5 = C17836n.a(dVarS3, "on_update");
            List<C17828f> listC = c(dVarS3);
            dVarS3.reset();
            Set setB = SetsKt.b();
            while (dVarS3.N3()) {
                if (dVarS3.getLong(iA2) == 0) {
                    int i10 = (int) dVarS3.getLong(iA);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<C17828f> arrayList3 = new ArrayList();
                    for (Object obj : listC) {
                        if (((C17828f) obj).getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() == i10) {
                            arrayList3.add(obj);
                        }
                    }
                    for (C17828f c17828f : arrayList3) {
                        arrayList.add(c17828f.getFrom());
                        arrayList2.add(c17828f.getTo());
                    }
                    setB.add(new C17841s.c(dVarS3.O2(iA3), dVarS3.O2(iA4), dVarS3.O2(iA5), arrayList, arrayList2));
                }
            }
            Set<C17841s.c> setA = SetsKt.a(setB);
            AutoCloseableKt.a(dVarS3, null);
            return setA;
        } finally {
        }
    }

    private static final C17841s.d e(A4.b bVar, String str, boolean z10) {
        A4.d dVarS3 = bVar.S3("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iA = C17836n.a(dVarS3, "seqno");
            int iA2 = C17836n.a(dVarS3, "cid");
            int iA3 = C17836n.a(dVarS3, "name");
            int iA4 = C17836n.a(dVarS3, "desc");
            if (iA != -1 && iA2 != -1 && iA3 != -1 && iA4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (dVarS3.N3()) {
                    if (((int) dVarS3.getLong(iA2)) >= 0) {
                        int i10 = (int) dVarS3.getLong(iA);
                        String strO2 = dVarS3.O2(iA3);
                        String str2 = dVarS3.getLong(iA4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i10), strO2);
                        linkedHashMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                List listZ0 = CollectionsKt.Z0(linkedHashMap.entrySet(), new a());
                ArrayList arrayList = new ArrayList(CollectionsKt.x(listZ0, 10));
                Iterator it = listZ0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listJ1 = CollectionsKt.j1(arrayList);
                List listZ02 = CollectionsKt.Z0(linkedHashMap2.entrySet(), new b());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listZ02, 10));
                Iterator it2 = listZ02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                C17841s.d dVar = new C17841s.d(str, z10, listJ1, CollectionsKt.j1(arrayList2));
                AutoCloseableKt.a(dVarS3, null);
                return dVar;
            }
            AutoCloseableKt.a(dVarS3, null);
            return null;
        } finally {
        }
    }

    private static final Set<C17841s.d> f(A4.b bVar, String str) {
        A4.d dVarS3 = bVar.S3("PRAGMA index_list(`" + str + "`)");
        try {
            int iA = C17836n.a(dVarS3, "name");
            int iA2 = C17836n.a(dVarS3, "origin");
            int iA3 = C17836n.a(dVarS3, "unique");
            if (iA != -1 && iA2 != -1 && iA3 != -1) {
                Set setB = SetsKt.b();
                while (dVarS3.N3()) {
                    if (Intrinsics.e("c", dVarS3.O2(iA2))) {
                        C17841s.d dVarE = e(bVar, dVarS3.O2(iA), dVarS3.getLong(iA3) == 1);
                        if (dVarE == null) {
                            AutoCloseableKt.a(dVarS3, null);
                            return null;
                        }
                        setB.add(dVarE);
                    }
                }
                Set<C17841s.d> setA = SetsKt.a(setB);
                AutoCloseableKt.a(dVarS3, null);
                return setA;
            }
            AutoCloseableKt.a(dVarS3, null);
            return null;
        } finally {
        }
    }

    public static final C17841s g(A4.b connection, String tableName) {
        Intrinsics.j(connection, "connection");
        Intrinsics.j(tableName, "tableName");
        return new C17841s(tableName, b(connection, tableName), d(connection, tableName), f(connection, tableName));
    }
}
