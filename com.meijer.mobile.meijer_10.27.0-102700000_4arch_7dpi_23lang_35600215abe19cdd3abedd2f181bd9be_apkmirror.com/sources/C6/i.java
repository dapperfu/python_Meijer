package C6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import y6.InterfaceC18172F;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u0000\"\u0004\b\u0000\u0010\b2\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0000H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010\u0003R\u0018\u00100\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0016\u00102\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000204038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u0014\u00109\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"LC6/i;", "LC6/g;", "<init>", "()V", "", "other", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "T", "value", "p", "(Ljava/lang/Object;)LC6/i;", "c", "()Ljava/lang/Object;", "y", "()LC6/g;", "x", "s", "F", "", "name", "x1", "(Ljava/lang/String;)LC6/g;", "j", "(Ljava/lang/String;)LC6/i;", "", "m", "(Z)LC6/i;", "", "d", "(D)LC6/i;", "", "g", "(I)LC6/i;", "", "h", "(J)LC6/i;", "LC6/e;", "i", "(LC6/e;)LC6/i;", "Ly6/F;", "l", "(Ly6/F;)LC6/i;", "b", "()LC6/i;", "", "close", "Ljava/lang/Object;", "root", "Z", "rootSet", "", "LC6/i$a;", "Ljava/util/List;", "stack", "getPath", "()Ljava/lang/String;", "path", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object root;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean rootSet;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<a> stack = new ArrayList();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LC6/i$a;", "", "<init>", "()V", "a", "b", "LC6/i$a$a;", "LC6/i$a$b;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LC6/i$a$a;", "LC6/i$a;", "", "", "list", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "()Ljava/util/List;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: C6.i$a$a, reason: collision with other inner class name */
        public static final class C0065a extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final List<Object> list;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0065a(List<Object> list) {
                super(null);
                Intrinsics.j(list, "list");
                this.list = list;
            }

            public final List<Object> a() {
                return this.list;
            }

            public String toString() {
                return "List (" + this.list.size() + ')';
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LC6/i$a$b;", "LC6/i$a;", "", "", "", "map", "name", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Map<String, Object> map;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private String name;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Map<String, Object> map, String str) {
                super(null);
                Intrinsics.j(map, "map");
                this.map = map;
                this.name = str;
            }

            public final Map<String, Object> a() {
                return this.map;
            }

            /* renamed from: b, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final void c(String str) {
                this.name = str;
            }

            public String toString() {
                return "Map (" + this.name + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // C6.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i D3() {
        return p(null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    private final Object a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 != null) {
            if (obj instanceof List) {
                if (!(obj2 instanceof List)) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() != list2.size()) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                IntRange intRangeN = CollectionsKt.n((Collection) obj);
                ArrayList arrayList = new ArrayList(CollectionsKt.x(intRangeN, 10));
                Iterator<Integer> it = intRangeN.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    arrayList.add(a(list.get(iNextInt), list2.get(iNextInt)));
                }
                return arrayList;
            }
            if (obj instanceof Map) {
                if (!(obj2 instanceof Map)) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                Set<String> setL = SetsKt.l(map.keySet(), map2.keySet());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.x(setL, 10));
                for (String str : setL) {
                    arrayList2.add(TuplesKt.a(str, a(map.get(str), map2.get(str))));
                }
                return MapsKt.y(arrayList2);
            }
            if (!Intrinsics.e(obj, obj2)) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
        }
        return obj;
    }

    private final <T> i p(T value) {
        a aVar = (a) CollectionsKt.F0(this.stack);
        if (!(aVar instanceof a.b)) {
            if (aVar instanceof a.C0065a) {
                ((a.C0065a) aVar).a().add(value);
                return this;
            }
            this.root = value;
            this.rootSet = true;
            return this;
        }
        a.b bVar = (a.b) aVar;
        String name = bVar.getName();
        if (name == null) {
            throw new IllegalStateException("Check failed.");
        }
        if (bVar.a().containsKey(name)) {
            bVar.a().put(name, a(bVar.a().get(name), value));
        } else {
            bVar.a().put(name, value);
        }
        bVar.c(null);
        return this;
    }

    @Override // C6.g
    public g F() {
        a aVarRemove = this.stack.remove(r0.size() - 1);
        if (!(aVarRemove instanceof a.b)) {
            throw new IllegalStateException("Check failed.");
        }
        p(((a.b) aVarRemove).a());
        return this;
    }

    public final Object c() {
        if (this.rootSet) {
            return this.root;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // C6.g
    public String getPath() {
        String name;
        List<a> list = this.stack;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (a aVar : list) {
            if (aVar instanceof a.C0065a) {
                name = String.valueOf(((a.C0065a) aVar).a().size());
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                name = ((a.b) aVar).getName();
                if (name == null) {
                    name = "?";
                }
            }
            arrayList.add(name);
        }
        return CollectionsKt.B0(arrayList, ".", null, null, 0, null, null, 62, null);
    }

    @Override // C6.g
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public i L1(e value) {
        Intrinsics.j(value, "value");
        return p(value);
    }

    @Override // C6.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public i f2(String value) {
        Intrinsics.j(value, "value");
        return p(value);
    }

    @Override // C6.g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public i I2(InterfaceC18172F value) {
        Intrinsics.j(value, "value");
        return p(null);
    }

    @Override // C6.g
    public g s() {
        this.stack.add(new a.b(new LinkedHashMap(), null));
        return this;
    }

    @Override // C6.g
    public g x() {
        a aVarRemove = this.stack.remove(r0.size() - 1);
        if (!(aVarRemove instanceof a.C0065a)) {
            throw new IllegalStateException("Check failed.");
        }
        p(((a.C0065a) aVarRemove).a());
        return this;
    }

    @Override // C6.g
    public g x1(String name) {
        Intrinsics.j(name, "name");
        a aVar = (a) CollectionsKt.D0(this.stack);
        if (!(aVar instanceof a.b)) {
            throw new IllegalStateException("Check failed.");
        }
        a.b bVar = (a.b) aVar;
        if (bVar.getName() != null) {
            throw new IllegalStateException("Check failed.");
        }
        bVar.c(name);
        return this;
    }

    @Override // C6.g
    public g y() {
        this.stack.add(new a.C0065a(new ArrayList()));
        return this;
    }

    @Override // C6.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public i d0(double value) {
        return p(Double.valueOf(value));
    }

    @Override // C6.g
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public i W(int value) {
        return p(Integer.valueOf(value));
    }

    @Override // C6.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public i U(long value) {
        return p(Long.valueOf(value));
    }

    @Override // C6.g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public i E0(boolean value) {
        return p(Boolean.valueOf(value));
    }
}
