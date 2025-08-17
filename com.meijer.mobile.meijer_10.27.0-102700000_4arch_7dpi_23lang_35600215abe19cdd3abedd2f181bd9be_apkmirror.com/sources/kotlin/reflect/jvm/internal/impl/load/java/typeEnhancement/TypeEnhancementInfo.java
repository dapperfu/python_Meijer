package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class TypeEnhancementInfo {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, JavaTypeQualifiers> f144685a;

    public TypeEnhancementInfo(Map<Integer, JavaTypeQualifiers> map) {
        Intrinsics.j(map, "map");
        this.f144685a = map;
    }

    public final TypeEnhancementInfo a() {
        Map<Integer, JavaTypeQualifiers> map = this.f144685a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.f(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), JavaTypeQualifiers.c((JavaTypeQualifiers) entry.getValue(), null, null, false, true, 7, null));
        }
        return new TypeEnhancementInfo(linkedHashMap);
    }

    public final Map<Integer, JavaTypeQualifiers> b() {
        return this.f144685a;
    }
}
