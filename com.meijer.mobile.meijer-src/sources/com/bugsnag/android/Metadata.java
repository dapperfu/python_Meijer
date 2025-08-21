package com.bugsnag.android;

import R6.TrimMetrics;
import com.bugsnag.android.C6624v0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0017B+\b\u0007\u0012 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00030\u0003¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\f\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00030\u0003¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)J2\u0010*\u001a\u00020\u00002 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00030\u0003HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020%HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b2\u00103R2\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00030\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u00104\u001a\u0004\b5\u0010\"R\u0017\u0010:\u001a\u0002068\u0006¢\u0006\f\n\u0004\b\u0015\u00107\u001a\u0004\b8\u00109R0\u0010A\u001a\b\u0012\u0004\u0012\u00020<0;2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020<0;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lcom/bugsnag/android/H0;", "Lcom/bugsnag/android/v0$a;", "", "", "", PlaceTypes.STORE, "<init>", "(Ljava/util/Map;)V", "map", "key", "newValue", "", "l", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)V", "Lcom/bugsnag/android/v0;", "writer", "toStream", "(Lcom/bugsnag/android/v0;)V", "section", "", "value", "b", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "c", "(Ljava/lang/String;)V", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "i", "(Ljava/lang/String;)Ljava/util/Map;", "h", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "n", "()Ljava/util/Map;", "e", "()Lcom/bugsnag/android/H0;", "", "maxStringLength", "LR6/v;", "o", "(I)LR6/v;", "f", "(Ljava/util/Map;)Lcom/bugsnag/android/H0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "k", "Lcom/bugsnag/android/O0;", "Lcom/bugsnag/android/O0;", "g", "()Lcom/bugsnag/android/O0;", "jsonStreamer", "", "Ljava/util/regex/Pattern;", "j", "()Ljava/util/Set;", "m", "(Ljava/util/Set;)V", "redactedKeys", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.H0, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class Metadata implements C6624v0.a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Map<String, Object>> store;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final O0 jsonStreamer;

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\b0\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/bugsnag/android/H0$a;", "", "<init>", "()V", "", "", "result", "key", "", "map", "", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "", "Lcom/bugsnag/android/H0;", "data", "b", "([Lcom/bugsnag/android/H0;)Lcom/bugsnag/android/H0;", "", "c", "(Ljava/util/List;)Ljava/util/Map;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.H0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<String, Object> c(List<? extends Map<String, ? extends Object>> data) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                CollectionsKt.C(arrayList, ((Map) it.next()).keySet());
            }
            Set setO1 = CollectionsKt.o1(arrayList);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map<String, ? extends Object> map : data) {
                Iterator it2 = setO1.iterator();
                while (it2.hasNext()) {
                    a(concurrentHashMap, (String) it2.next(), map);
                }
            }
            return concurrentHashMap;
        }

        private Companion() {
        }

        public final Metadata b(Metadata... data) {
            ArrayList arrayList = new ArrayList(data.length);
            int length = data.length;
            int i10 = 0;
            int i11 = 0;
            while (i11 < length) {
                Metadata metadata = data[i11];
                i11++;
                arrayList.add(metadata.n());
            }
            ArrayList arrayList2 = new ArrayList();
            int length2 = data.length;
            while (i10 < length2) {
                Metadata metadata2 = data[i10];
                i10++;
                CollectionsKt.C(arrayList2, metadata2.getJsonStreamer().c());
            }
            Metadata metadata3 = new Metadata(TypeIntrinsics.d(c(arrayList)));
            metadata3.m(CollectionsKt.o1(arrayList2));
            return metadata3;
        }

        private final void a(Map<String, Object> result, String key, Map<String, ? extends Object> map) {
            Object obj = result.get(key);
            Object obj2 = map.get(key);
            if (obj2 != null) {
                if ((obj instanceof Map) && (obj2 instanceof Map)) {
                    result.put(key, c(CollectionsKt.p((Map) obj, (Map) obj2)));
                    return;
                } else {
                    result.put(key, obj2);
                    return;
                }
            }
            if (obj != null) {
                result.put(key, obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public Metadata() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Metadata) && Intrinsics.e(this.store, ((Metadata) other).store);
    }

    public final Metadata f(Map<String, Map<String, Object>> store) {
        return new Metadata(store);
    }

    public int hashCode() {
        return this.store.hashCode();
    }

    public String toString() {
        return "Metadata(store=" + this.store + ')';
    }

    @JvmOverloads
    public Metadata(Map<String, Map<String, Object>> map) {
        this.store = map;
        this.jsonStreamer = new O0();
    }

    public void a(String section, String key, Object value) {
        if (value == null) {
            d(section, key);
            return;
        }
        Map<String, Object> concurrentHashMap = this.store.get(section);
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        this.store.put(section, concurrentHashMap);
        l(concurrentHashMap, key, value);
    }

    public void c(String section) {
        this.store.remove(section);
    }

    public void d(String section, String key) {
        Map<String, Object> map = this.store.get(section);
        if (map != null) {
            map.remove(key);
        }
        if (map == null || map.isEmpty()) {
            this.store.remove(section);
        }
    }

    /* renamed from: g, reason: from getter */
    public final O0 getJsonStreamer() {
        return this.jsonStreamer;
    }

    public Map<String, Object> i(String section) {
        return this.store.get(section);
    }

    public final Set<Pattern> j() {
        return this.jsonStreamer.c();
    }

    public final Map<String, Map<String, Object>> k() {
        return this.store;
    }

    public final void m(Set<Pattern> set) {
        this.jsonStreamer.h(set);
    }

    public final Map<String, Map<String, Object>> n() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(this.store);
        Iterator<T> it = this.store.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            concurrentHashMap.put(entry.getKey(), new ConcurrentHashMap((Map) entry.getValue()));
        }
        return concurrentHashMap;
    }

    public final TrimMetrics o(int maxStringLength) {
        Iterator<Map.Entry<String, Map<String, Object>>> it = this.store.entrySet().iterator();
        int iD = 0;
        int iC = 0;
        while (it.hasNext()) {
            TrimMetrics trimMetricsE = R6.s.f32024a.e(maxStringLength, TypeIntrinsics.d(it.next().getValue()));
            iD += trimMetricsE.d();
            iC += trimMetricsE.c();
        }
        return new TrimMetrics(iD, iC);
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 writer) throws IOException {
        this.jsonStreamer.f(this.store, writer, true);
    }

    private final void l(Map<String, Object> map, String key, Object newValue) {
        Object obj = map.get(key);
        if (obj != null && (newValue instanceof Map)) {
            newValue = INSTANCE.c(CollectionsKt.p((Map) obj, (Map) newValue));
        }
        map.put(key, newValue);
    }

    public void b(String section, Map<String, ? extends Object> value) {
        Iterator<T> it = value.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(section, (String) entry.getKey(), entry.getValue());
        }
    }

    public final Metadata e() {
        Metadata metadataF = f(n());
        metadataF.m(CollectionsKt.o1(j()));
        return metadataF;
    }

    public Object h(String section, String key) {
        Map<String, Object> mapI = i(section);
        if (mapI == null) {
            return null;
        }
        return mapI.get(key);
    }

    public /* synthetic */ Metadata(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ConcurrentHashMap() : map);
    }
}
