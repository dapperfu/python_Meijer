package P5;

import Q5.B;
import Q5.C4667a;
import Q5.l;
import Q5.m;
import R5.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LP5/k;", "LP5/e;", "LP5/g;", "definition", "<init>", "(LP5/g;)V", "", "key", "matcher", "", "value", "LQ5/e;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)LQ5/e;", "a", "()LQ5/e;", "b", "LP5/g;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class k extends e {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, String> f25631d = MapsKt.o(TuplesKt.a("eq", "equals"), TuplesKt.a("ne", "notEquals"), TuplesKt.a("gt", "greaterThan"), TuplesKt.a("ge", "greaterEqual"), TuplesKt.a("lt", "lessThan"), TuplesKt.a("le", "lessEqual"), TuplesKt.a("co", "contains"), TuplesKt.a("nc", "notContains"), TuplesKt.a("sw", "startsWith"), TuplesKt.a("ew", "endsWith"), TuplesKt.a("ex", "exists"), TuplesKt.a("nx", "notExist"));

    /* renamed from: e, reason: collision with root package name */
    private static final Set<String> f25632e = SetsKt.i("ne", "nc");

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final JSONDefinition definition;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"LP5/k$a;", "", "<init>", "()V", "", "", "MATCHER_MAPPING", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "LOG_TAG", "Ljava/lang/String;", "", "NEGATIVE_MATCHERS", "Ljava/util/Set;", "OPERATION_NAME_AND", "OPERATION_NAME_OR", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: P5.k$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Map<String, String> a() {
            return k.f25631d;
        }
    }

    public k(JSONDefinition definition) {
        Intrinsics.j(definition, "definition");
        this.definition = definition;
    }

    private final Q5.e c(String key, String matcher, Object value) {
        Pair pair;
        String str = f25631d.get(matcher);
        if (str == null) {
            t.b("LaunchRulesEngine", "MatcherCondition", "Failed to build Evaluable from [type:matcher] json, [definition.matcher = " + matcher + "] is not supported.", new Object[0]);
            return null;
        }
        if (value == null) {
            return new B(new m("{{" + key + "}}", Object.class), str);
        }
        if (value instanceof String) {
            pair = new Pair(String.class, "{{string(" + key + ")}}");
        } else if (value instanceof Integer) {
            pair = new Pair(Number.class, "{{int(" + key + ")}}");
        } else if (value instanceof Double) {
            pair = new Pair(Number.class, "{{double(" + key + ")}}");
        } else if (value instanceof Boolean) {
            pair = new Pair(Boolean.class, "{{bool(" + key + ")}}");
        } else if (value instanceof Float) {
            pair = new Pair(Number.class, "{{double(" + key + ")}}");
        } else {
            pair = new Pair(Object.class, "{{" + key + "}}");
        }
        Class cls = (Class) pair.a();
        String str2 = (String) pair.b();
        Intrinsics.h(cls, "null cannot be cast to non-null type java.lang.Class<*>");
        return new C4667a(new m(str2, cls), str, new l(value));
    }

    @Override // P5.e
    public /* synthetic */ Q5.e a() {
        if (this.definition.getMatcher() == null || this.definition.getKey() == null) {
            t.b("LaunchRulesEngine", "MatcherCondition", "[key] or [matcher] is not String, failed to build Evaluable from definition JSON: \n " + this.definition, new Object[0]);
            return null;
        }
        List<Object> listJ = this.definition.j();
        if (listJ == null) {
            listJ = CollectionsKt.m();
        }
        int size = listJ.size();
        if (size == 0) {
            return c(this.definition.getKey(), this.definition.getMatcher(), null);
        }
        if (size == 1) {
            return c(this.definition.getKey(), this.definition.getMatcher(), listJ.get(0));
        }
        if (2 > size || size > Integer.MAX_VALUE) {
            return null;
        }
        List<Object> list = listJ;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c(this.definition.getKey(), this.definition.getMatcher(), it.next()));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Q5.h(arrayList, f25632e.contains(this.definition.getMatcher()) ? "and" : "or");
    }
}
