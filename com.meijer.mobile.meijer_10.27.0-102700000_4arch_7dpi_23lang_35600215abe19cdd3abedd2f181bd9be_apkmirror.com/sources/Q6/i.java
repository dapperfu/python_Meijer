package Q6;

import com.bugsnag.android.C6507z0;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0007J#\u0010\u0010\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0014R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010 \u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006!"}, d2 = {"LQ6/i;", "LQ6/h;", "", "", "", "source", "<init>", "(Ljava/util/Map;)V", "f", "()Ljava/util/Map;", "e", "differences", "", "c", "", "newCallbackCounts", "a", "stringsTrimmed", "charsRemoved", "b", "(II)V", "breadcrumbsRemoved", "bytesRemoved", "d", "", "Ljava/util/Map;", "configDifferences", "callbackCounts", "I", "metadataStringsTrimmedCount", "metadataCharsTruncatedCount", "breadcrumbsRemovedCount", "breadcrumbBytesRemovedCount", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> configDifferences;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> callbackCounts;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int metadataStringsTrimmedCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int metadataCharsTruncatedCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int breadcrumbsRemovedCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int breadcrumbBytesRemovedCount;

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public i(Map<String, ? extends Object> map) {
        if (map == null) {
            this.configDifferences = new HashMap();
            this.callbackCounts = new HashMap();
            return;
        }
        Map<String, Object> mapD = TypeIntrinsics.d(map.get("config"));
        this.configDifferences = mapD == null ? new HashMap<>() : mapD;
        Map<String, Integer> mapD2 = TypeIntrinsics.d(map.get("callbacks"));
        this.callbackCounts = mapD2 == null ? new HashMap<>() : mapD2;
        Map mapD3 = TypeIntrinsics.d(map.get("system"));
        if (mapD3 != null) {
            Number number = (Number) mapD3.get("stringsTruncated");
            this.metadataStringsTrimmedCount = number != null ? number.intValue() : 0;
            Number number2 = (Number) mapD3.get("stringCharsTruncated");
            this.metadataCharsTruncatedCount = number2 != null ? number2.intValue() : 0;
            Number number3 = (Number) mapD3.get("breadcrumbsRemovedCount");
            this.breadcrumbsRemovedCount = number3 != null ? number3.intValue() : 0;
            Number number4 = (Number) mapD3.get("breadcrumbBytesRemoved");
            this.breadcrumbBytesRemovedCount = number4 != null ? number4.intValue() : 0;
        }
    }

    private final Map<String, Object> f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Integer num;
        HashMap map = new HashMap();
        map.putAll(this.callbackCounts);
        C6507z0 c6507z0 = C6507z0.f63642j;
        Map<String, Integer> mapA = c6507z0.a();
        if (mapA != null && (num = mapA.get("ndkOnError")) != null) {
            map.put("ndkOnError", num);
        }
        Map<String, Boolean> mapB = c6507z0.b();
        if (mapB != null) {
            map.putAll(mapB);
        }
        return map;
    }

    @Override // Q6.h
    public void a(Map<String, Integer> newCallbackCounts) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.callbackCounts.clear();
        this.callbackCounts.putAll(newCallbackCounts);
        C6507z0.f63642j.d(newCallbackCounts);
    }

    @Override // Q6.h
    public void b(int stringsTrimmed, int charsRemoved) {
        this.metadataStringsTrimmedCount = stringsTrimmed;
        this.metadataCharsTruncatedCount = charsRemoved;
    }

    @Override // Q6.h
    public void c(Map<String, ? extends Object> differences) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.configDifferences.clear();
        this.configDifferences.putAll(differences);
        C6507z0.f63642j.g(MapsKt.g(TuplesKt.a("usage", MapsKt.g(TuplesKt.a("config", this.configDifferences)))));
    }

    @Override // Q6.h
    public void d(int breadcrumbsRemoved, int bytesRemoved) {
        this.breadcrumbsRemovedCount = breadcrumbsRemoved;
        this.breadcrumbBytesRemovedCount = bytesRemoved;
    }

    @Override // Q6.h
    public Map<String, Object> e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Pair pairA;
        Pair pairA2;
        Pair pairA3;
        Pair pairA4;
        Pair pairA5;
        Pair pairA6;
        Map<String, Object> mapF = f();
        int i10 = this.metadataStringsTrimmedCount;
        Pair pairA7 = null;
        if (i10 > 0) {
            pairA = TuplesKt.a("stringsTruncated", Integer.valueOf(i10));
        } else {
            pairA = null;
        }
        int i11 = this.metadataCharsTruncatedCount;
        if (i11 > 0) {
            pairA2 = TuplesKt.a("stringCharsTruncated", Integer.valueOf(i11));
        } else {
            pairA2 = null;
        }
        int i12 = this.breadcrumbsRemovedCount;
        if (i12 > 0) {
            pairA3 = TuplesKt.a("breadcrumbsRemoved", Integer.valueOf(i12));
        } else {
            pairA3 = null;
        }
        int i13 = this.breadcrumbBytesRemovedCount;
        if (i13 > 0) {
            pairA4 = TuplesKt.a("breadcrumbBytesRemoved", Integer.valueOf(i13));
        } else {
            pairA4 = null;
        }
        Map mapY = MapsKt.y(CollectionsKt.r(pairA, pairA2, pairA3, pairA4));
        if (!this.configDifferences.isEmpty()) {
            pairA5 = TuplesKt.a("config", this.configDifferences);
        } else {
            pairA5 = null;
        }
        if (!mapF.isEmpty()) {
            pairA6 = TuplesKt.a("callbacks", mapF);
        } else {
            pairA6 = null;
        }
        if (!mapY.isEmpty()) {
            pairA7 = TuplesKt.a("system", mapY);
        }
        return MapsKt.y(CollectionsKt.r(pairA5, pairA6, pairA7));
    }

    public /* synthetic */ i(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : map);
    }
}
