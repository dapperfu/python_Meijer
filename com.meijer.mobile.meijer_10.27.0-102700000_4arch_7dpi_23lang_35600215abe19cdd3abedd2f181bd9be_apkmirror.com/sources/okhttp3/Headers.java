package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 /2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\f/B\u0017\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0019H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00160(¢\u0006\u0004\b)\u0010*R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b.\u0010%¨\u00060"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "", "namesAndValues", "<init>", "([Ljava/lang/String;)V", "name", "get", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/Date;", "a", "(Ljava/lang/String;)Ljava/util/Date;", "", "index", "h", "(I)Ljava/lang/String;", "p", "", "names", "()Ljava/util/Set;", "", "q", "(Ljava/lang/String;)Ljava/util/List;", "", "iterator", "()Ljava/util/Iterator;", "Lokhttp3/Headers$a;", "k", "()Lokhttp3/Headers$a;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "", "o", "()Ljava/util/Map;", "[Ljava/lang/String;", "f", "()[Ljava/lang/String;", "size", "b", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final Headers f153997c = new Headers(new String[0]);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String[] namesAndValues;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0007J \u0010\u0013\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lokhttp3/Headers$a;", "", "<init>", "()V", "", "line", "c", "(Ljava/lang/String;)Lokhttp3/Headers$a;", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$a;", "e", "Lokhttp3/Headers;", "headers", "b", "(Lokhttp3/Headers;)Lokhttp3/Headers$a;", "d", "i", "j", "g", "(Ljava/lang/String;)Ljava/lang/String;", "f", "()Lokhttp3/Headers;", "", "Ljava/util/List;", "h", "()Ljava/util/List;", "namesAndValues", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<String> namesAndValues = new ArrayList(20);

        public final a a(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            return Rv.e.b(this, name, value);
        }

        public final a b(Headers headers) {
            Intrinsics.j(headers, "headers");
            return Rv.e.c(this, headers);
        }

        public final a c(String line) {
            Intrinsics.j(line, "line");
            int iO0 = StringsKt.o0(line, ':', 1, false, 4, null);
            if (iO0 != -1) {
                String strSubstring = line.substring(0, iO0);
                Intrinsics.i(strSubstring, "substring(...)");
                String strSubstring2 = line.substring(iO0 + 1);
                Intrinsics.i(strSubstring2, "substring(...)");
                d(strSubstring, strSubstring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                d("", line);
                return this;
            }
            String strSubstring3 = line.substring(1);
            Intrinsics.i(strSubstring3, "substring(...)");
            d("", strSubstring3);
            return this;
        }

        public final a d(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            return Rv.e.d(this, name, value);
        }

        public final a e(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            Rv.e.t(name);
            d(name, value);
            return this;
        }

        public final String g(String name) {
            Intrinsics.j(name, "name");
            return Rv.e.g(this, name);
        }

        public final List<String> h() {
            return this.namesAndValues;
        }

        public final a i(String name) {
            Intrinsics.j(name, "name");
            return Rv.e.n(this, name);
        }

        public final a j(String name, String value) {
            Intrinsics.j(name, "name");
            Intrinsics.j(value, "value");
            return Rv.e.o(this, name, value);
        }

        public final Headers f() {
            return Rv.e.e(this);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/Headers$b;", "", "<init>", "()V", "", "", "namesAndValues", "Lokhttp3/Headers;", "b", "([Ljava/lang/String;)Lokhttp3/Headers;", "", "a", "(Ljava/util/Map;)Lokhttp3/Headers;", "EMPTY", "Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.Headers$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        @JvmName
        public final Headers a(Map<String, String> map) {
            Intrinsics.j(map, "<this>");
            return Rv.e.p(map);
        }

        @JvmStatic
        @JvmName
        public final Headers b(String... namesAndValues) {
            Intrinsics.j(namesAndValues, "namesAndValues");
            return Rv.e.j((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }
    }

    @JvmStatic
    @JvmName
    public static final Headers n(String... strArr) {
        return INSTANCE.b(strArr);
    }

    public Headers(String[] namesAndValues) {
        Intrinsics.j(namesAndValues, "namesAndValues");
        this.namesAndValues = namesAndValues;
    }

    public final Date a(String name) {
        Intrinsics.j(name, "name");
        String str = get(name);
        if (str != null) {
            return Wv.c.a(str);
        }
        return null;
    }

    /* renamed from: f, reason: from getter */
    public final String[] getNamesAndValues() {
        return this.namesAndValues;
    }

    public final String get(String name) {
        Intrinsics.j(name, "name");
        return Rv.e.i(this.namesAndValues, name);
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(StringsKt.J(StringCompanionObject.f142841a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(h(i10));
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(treeSet);
        Intrinsics.i(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public final Map<String, List<String>> o() {
        TreeMap treeMap = new TreeMap(StringsKt.J(StringCompanionObject.f142841a));
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strH = h(i10);
            Locale US = Locale.US;
            Intrinsics.i(US, "US");
            String lowerCase = strH.toLowerCase(US);
            Intrinsics.i(lowerCase, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(p(i10));
        }
        return treeMap;
    }

    public final List<String> q(String name) {
        Intrinsics.j(name, "name");
        return Rv.e.s(this, name);
    }

    @JvmName
    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public boolean equals(Object other) {
        return Rv.e.f(this, other);
    }

    public final String h(int index) {
        return Rv.e.l(this, index);
    }

    public int hashCode() {
        return Rv.e.h(this);
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        return Rv.e.k(this);
    }

    public final a k() {
        return Rv.e.m(this);
    }

    public final String p(int index) {
        return Rv.e.r(this, index);
    }

    public String toString() {
        return Rv.e.q(this);
    }
}
