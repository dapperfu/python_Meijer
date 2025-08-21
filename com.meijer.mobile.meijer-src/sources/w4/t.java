package w4;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import w4.C17841s;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0006*\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\t*\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\u0003*\u00020\u00182\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u0006*\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\t*\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010 \u001a\u00020\u0003*\u00020\u001f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u0006*\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010(\u001a\u00020\t2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020**\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010-\u001a\u00020**\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0004\b-\u0010,¨\u0006."}, d2 = {"Lw4/s;", "", "other", "", "f", "(Lw4/s;Ljava/lang/Object;)Z", "", "k", "(Lw4/s;)I", "", "q", "(Lw4/s;)Ljava/lang/String;", "Lw4/s$a;", "c", "(Lw4/s$a;Ljava/lang/Object;)Z", "current", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "a", "(Ljava/lang/String;)Z", "h", "(Lw4/s$a;)I", "n", "(Lw4/s$a;)Ljava/lang/String;", "Lw4/s$c;", "d", "(Lw4/s$c;Ljava/lang/Object;)Z", "i", "(Lw4/s$c;)I", "o", "(Lw4/s$c;)Ljava/lang/String;", "Lw4/s$d;", "e", "(Lw4/s$d;Ljava/lang/Object;)Z", "j", "(Lw4/s$d;)I", "p", "(Lw4/s$d;)Ljava/lang/String;", "", "collection", "g", "(Ljava/util/Collection;)Ljava/lang/String;", "", "m", "(Ljava/util/Collection;)V", "l", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class t {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(((C17841s.a) t10).name, ((C17841s.a) t11).name);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(((C17841s.d) t10).name, ((C17841s.d) t11).name);
        }
    }

    private static final void l(Collection<?> collection) {
        StringsKt.j(CollectionsKt.B0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        StringsKt.j(" }", null, 1, null);
    }

    private static final void m(Collection<?> collection) {
        StringsKt.j(CollectionsKt.B0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        StringsKt.j("},", null, 1, null);
    }

    public static final boolean b(String current, String str) {
        Intrinsics.j(current, "current");
        if (Intrinsics.e(current, str)) {
            return true;
        }
        if (!a(current)) {
            return false;
        }
        String strSubstring = current.substring(1, current.length() - 1);
        Intrinsics.i(strSubstring, "substring(...)");
        return Intrinsics.e(StringsKt.C1(strSubstring).toString(), str);
    }

    public static final boolean c(C17841s.a aVar, Object obj) {
        Intrinsics.j(aVar, "<this>");
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof C17841s.a)) {
            return false;
        }
        C17841s.a aVar2 = (C17841s.a) obj;
        if (aVar.a() != aVar2.a() || !Intrinsics.e(aVar.name, aVar2.name) || aVar.notNull != aVar2.notNull) {
            return false;
        }
        String str = aVar.defaultValue;
        String str2 = aVar2.defaultValue;
        if (aVar.createdFrom == 1 && aVar2.createdFrom == 2 && str != null && !b(str, str2)) {
            return false;
        }
        if (aVar.createdFrom == 2 && aVar2.createdFrom == 1 && str2 != null && !b(str2, str)) {
            return false;
        }
        int i10 = aVar.createdFrom;
        return (i10 == 0 || i10 != aVar2.createdFrom || (str == null ? str2 == null : b(str, str2))) && aVar.affinity == aVar2.affinity;
    }

    public static final boolean d(C17841s.c cVar, Object obj) {
        Intrinsics.j(cVar, "<this>");
        if (cVar == obj) {
            return true;
        }
        if (!(obj instanceof C17841s.c)) {
            return false;
        }
        C17841s.c cVar2 = (C17841s.c) obj;
        if (Intrinsics.e(cVar.referenceTable, cVar2.referenceTable) && Intrinsics.e(cVar.onDelete, cVar2.onDelete) && Intrinsics.e(cVar.onUpdate, cVar2.onUpdate) && Intrinsics.e(cVar.columnNames, cVar2.columnNames)) {
            return Intrinsics.e(cVar.referenceColumnNames, cVar2.referenceColumnNames);
        }
        return false;
    }

    public static final boolean e(C17841s.d dVar, Object obj) {
        Intrinsics.j(dVar, "<this>");
        if (dVar == obj) {
            return true;
        }
        if (!(obj instanceof C17841s.d)) {
            return false;
        }
        C17841s.d dVar2 = (C17841s.d) obj;
        if (dVar.unique == dVar2.unique && Intrinsics.e(dVar.columns, dVar2.columns) && Intrinsics.e(dVar.orders, dVar2.orders)) {
            return StringsKt.W(dVar.name, "index_", false, 2, null) ? StringsKt.W(dVar2.name, "index_", false, 2, null) : Intrinsics.e(dVar.name, dVar2.name);
        }
        return false;
    }

    public static final boolean f(C17841s c17841s, Object obj) {
        Set<C17841s.d> set;
        Intrinsics.j(c17841s, "<this>");
        if (c17841s == obj) {
            return true;
        }
        if (!(obj instanceof C17841s)) {
            return false;
        }
        C17841s c17841s2 = (C17841s) obj;
        if (!Intrinsics.e(c17841s.name, c17841s2.name) || !Intrinsics.e(c17841s.columns, c17841s2.columns) || !Intrinsics.e(c17841s.foreignKeys, c17841s2.foreignKeys)) {
            return false;
        }
        Set<C17841s.d> set2 = c17841s.indices;
        if (set2 == null || (set = c17841s2.indices) == null) {
            return true;
        }
        return Intrinsics.e(set2, set);
    }

    public static final String g(Collection<?> collection) {
        Intrinsics.j(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return StringsKt.j(CollectionsKt.B0(collection, ",\n", "\n", "\n", 0, null, null, 56, null), null, 1, null) + "},";
    }

    public static final int h(C17841s.a aVar) {
        Intrinsics.j(aVar, "<this>");
        return (((((aVar.name.hashCode() * 31) + aVar.affinity) * 31) + (aVar.notNull ? 1231 : 1237)) * 31) + aVar.primaryKeyPosition;
    }

    public static final int i(C17841s.c cVar) {
        Intrinsics.j(cVar, "<this>");
        return (((((((cVar.referenceTable.hashCode() * 31) + cVar.onDelete.hashCode()) * 31) + cVar.onUpdate.hashCode()) * 31) + cVar.columnNames.hashCode()) * 31) + cVar.referenceColumnNames.hashCode();
    }

    public static final int j(C17841s.d dVar) {
        Intrinsics.j(dVar, "<this>");
        return ((((((StringsKt.W(dVar.name, "index_", false, 2, null) ? -1184239155 : dVar.name.hashCode()) * 31) + (dVar.unique ? 1 : 0)) * 31) + dVar.columns.hashCode()) * 31) + dVar.orders.hashCode();
    }

    public static final int k(C17841s c17841s) {
        Intrinsics.j(c17841s, "<this>");
        return (((c17841s.name.hashCode() * 31) + c17841s.columns.hashCode()) * 31) + c17841s.foreignKeys.hashCode();
    }

    public static final String n(C17841s.a aVar) {
        Intrinsics.j(aVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |Column {\n            |   name = '");
        sb2.append(aVar.name);
        sb2.append("',\n            |   type = '");
        sb2.append(aVar.type);
        sb2.append("',\n            |   affinity = '");
        sb2.append(aVar.affinity);
        sb2.append("',\n            |   notNull = '");
        sb2.append(aVar.notNull);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(aVar.primaryKeyPosition);
        sb2.append("',\n            |   defaultValue = '");
        String str = aVar.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return StringsKt.j(StringsKt.p(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final String o(C17841s.c cVar) {
        Intrinsics.j(cVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |ForeignKey {\n            |   referenceTable = '");
        sb2.append(cVar.referenceTable);
        sb2.append("',\n            |   onDelete = '");
        sb2.append(cVar.onDelete);
        sb2.append("',\n            |   onUpdate = '");
        sb2.append(cVar.onUpdate);
        sb2.append("',\n            |   columnNames = {");
        m(CollectionsKt.Y0(cVar.columnNames));
        Unit unit = Unit.f143329a;
        sb2.append(unit);
        sb2.append("\n            |   referenceColumnNames = {");
        l(CollectionsKt.Y0(cVar.referenceColumnNames));
        sb2.append(unit);
        sb2.append("\n            |}\n        ");
        return StringsKt.j(StringsKt.p(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final String p(C17841s.d dVar) {
        Intrinsics.j(dVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |Index {\n            |   name = '");
        sb2.append(dVar.name);
        sb2.append("',\n            |   unique = '");
        sb2.append(dVar.unique);
        sb2.append("',\n            |   columns = {");
        m(dVar.columns);
        Unit unit = Unit.f143329a;
        sb2.append(unit);
        sb2.append("\n            |   orders = {");
        l(dVar.orders);
        sb2.append(unit);
        sb2.append("\n            |}\n        ");
        return StringsKt.j(StringsKt.p(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final String q(C17841s c17841s) {
        List listM;
        Intrinsics.j(c17841s, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |TableInfo {\n            |    name = '");
        sb2.append(c17841s.name);
        sb2.append("',\n            |    columns = {");
        sb2.append(g(CollectionsKt.Z0(c17841s.columns.values(), new a())));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(g(c17841s.foreignKeys));
        sb2.append("\n            |    indices = {");
        Set<C17841s.d> set = c17841s.indices;
        if (set == null || (listM = CollectionsKt.Z0(set, new b())) == null) {
            listM = CollectionsKt.m();
        }
        sb2.append(g(listM));
        sb2.append("\n            |}\n        ");
        return StringsKt.p(sb2.toString(), null, 1, null);
    }

    private static final boolean a(String str) {
        if (str.length() == 0) {
            return false;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            int i13 = i12 + 1;
            if (i12 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt != '(') {
                if (cCharAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                    return false;
                }
            } else {
                i11++;
            }
            i10++;
            i12 = i13;
        }
        if (i11 != 0) {
            return false;
        }
        return true;
    }
}
