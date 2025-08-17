package X5;

import U5.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0001¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\nH\u0001¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LX5/c;", "", "<init>", "()V", "LU5/n;", "presentation", "", "d", "(LU5/n;)V", "c", "", "b", "()Ljava/util/List;", "", "", "Ljava/lang/ref/WeakReference;", "a", "Ljava/util/Map;", "visiblePresentations", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Lazy<c> f39151c = LazyKt.b(a.f39153f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, WeakReference<n<?>>> visiblePresentations;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LX5/c;", "c", "()LX5/c;"}, k = 3, mv = {1, 5, 1})
    static final class a extends Lambda implements Function0<c> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f39153f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return new c(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LX5/c$b;", "", "<init>", "()V", "LX5/c;", "INSTANCE$delegate", "Lkotlin/Lazy;", "a", "()LX5/c;", "INSTANCE", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: X5.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final c a() {
            return (c) c.f39151c.getValue();
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
        this.visiblePresentations = new LinkedHashMap();
    }

    public final List<n<?>> b() {
        Map<String, WeakReference<n<?>>> map = this.visiblePresentations;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, WeakReference<n<?>>> entry : map.entrySet()) {
            if (entry.getValue().get() == null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.visiblePresentations.remove((String) it.next());
        }
        Collection<WeakReference<n<?>>> collectionValues = this.visiblePresentations.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            n nVar = (n) ((WeakReference) it2.next()).get();
            if (nVar != null) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    public final void c(n<?> presentation) {
        Intrinsics.j(presentation, "presentation");
        this.visiblePresentations.remove(presentation.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
    }

    public final void d(n<?> presentation) {
        Intrinsics.j(presentation, "presentation");
        this.visiblePresentations.put(presentation.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), new WeakReference<>(presentation));
    }
}
