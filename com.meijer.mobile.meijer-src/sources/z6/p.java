package z6;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import z6.w;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0002\"#BY\b\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lz6/p;", "Lz6/w$b;", "", "", "Lz6/a;", "customScalarAdapters", "", "falseVariables", "Lz6/q;", "deferredFragmentIdentifiers", "", "Lz6/s;", "errors", "", "unsafe", "<init>", "(Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;Z)V", "Lz6/p$a;", "h", "()Lz6/p$a;", "c", "Ljava/util/Set;", "d", "e", "Ljava/util/List;", "f", "Z", "g", "Ljava/util/Map;", "adaptersMap", "Lz6/w$c;", "getKey", "()Lz6/w$c;", "key", "b", "a", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class p implements w.b {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final p f172485i = new a().b();

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final p f172486j = new a().g(true).b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Set<String> falseVariables;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final Set<DeferredFragmentIdentifier> deferredFragmentIdentifiers;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final List<Error> errors;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean unsafe;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<String, InterfaceC18452a<?>> adaptersMap;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00002\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u001d\u0010\u000f\u001a\u00020\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u0003J\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#¨\u0006$"}, d2 = {"Lz6/p$a;", "", "<init>", "()V", "", "", "falseVariables", "f", "(Ljava/util/Set;)Lz6/p$a;", "Lz6/q;", "deferredFragmentIdentifiers", "d", "", "Lz6/s;", "errors", "e", "(Ljava/util/List;)Lz6/p$a;", "Lz6/p;", "customScalarAdapters", "a", "(Lz6/p;)Lz6/p$a;", "", "unsafe", "g", "(Z)Lz6/p$a;", "", "c", "b", "()Lz6/p;", "", "Lz6/a;", "Ljava/util/Map;", "adaptersMap", "Z", "Ljava/util/Set;", "Ljava/util/List;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Map<String, InterfaceC18452a<?>> adaptersMap = new LinkedHashMap();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean unsafe;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Set<String> falseVariables;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private Set<DeferredFragmentIdentifier> deferredFragmentIdentifiers;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private List<Error> errors;

        public final a a(p customScalarAdapters) {
            Intrinsics.j(customScalarAdapters, "customScalarAdapters");
            this.adaptersMap.putAll(customScalarAdapters.adaptersMap);
            return this;
        }

        public final p b() {
            return new p(this.adaptersMap, this.falseVariables, this.deferredFragmentIdentifiers, this.errors, this.unsafe, null);
        }

        public final void c() {
            this.adaptersMap.clear();
        }

        public final a d(Set<DeferredFragmentIdentifier> deferredFragmentIdentifiers) {
            this.deferredFragmentIdentifiers = deferredFragmentIdentifiers;
            return this;
        }

        public final a e(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        public final a f(Set<String> falseVariables) {
            this.falseVariables = falseVariables;
            return this;
        }

        public final a g(boolean unsafe) {
            this.unsafe = unsafe;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz6/p$b;", "Lz6/w$c;", "Lz6/p;", "<init>", "()V", "Empty", "Lz6/p;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: z6.p$b, reason: from kotlin metadata */
    public static final class Companion implements w.c<p> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ p(Map map, Set set, Set set2, List list, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, set, set2, list, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private p(Map<String, ? extends InterfaceC18452a<?>> map, Set<String> set, Set<DeferredFragmentIdentifier> set2, List<Error> list, boolean z10) {
        this.falseVariables = set;
        this.deferredFragmentIdentifiers = set2;
        this.errors = list;
        this.unsafe = z10;
        this.adaptersMap = map;
    }

    @Override // z6.w.b
    public w.c<?> getKey() {
        return INSTANCE;
    }

    public final a h() {
        return new a().a(this).f(this.falseVariables).d(this.deferredFragmentIdentifiers);
    }
}
