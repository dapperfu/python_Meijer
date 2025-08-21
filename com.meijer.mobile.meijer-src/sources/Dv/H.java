package Dv;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00060\u0003B#\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\f*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001d\u001a\u00020\u001c*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00062\u0006\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"LDv/H;", "K", "V", "LDv/N;", "", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "Lzv/b;", "kSerializer", "vSerializer", "<init>", "(Lzv/b;Lzv/b;)V", "", "z", "(Ljava/util/Map;)I", "", "", "y", "(Ljava/util/Map;)Ljava/util/Iterator;", "v", "()Ljava/util/LinkedHashMap;", "w", "(Ljava/util/LinkedHashMap;)I", "B", "(Ljava/util/LinkedHashMap;)Ljava/util/Map;", "A", "(Ljava/util/Map;)Ljava/util/LinkedHashMap;", "size", "", "x", "(Ljava/util/LinkedHashMap;I)V", "LBv/f;", "c", "LBv/f;", "a", "()LBv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes14.dex */
public final class H<K, V> extends N<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bv.f descriptor;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3127a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Map<K, V> q(LinkedHashMap<K, V> linkedHashMap) {
        Intrinsics.j(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3127a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(LinkedHashMap<K, V> linkedHashMap, int i10) {
        Intrinsics.j(linkedHashMap, "<this>");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(zv.b<K> kSerializer, zv.b<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.j(kSerializer, "kSerializer");
        Intrinsics.j(vSerializer, "vSerializer");
        this.descriptor = new G(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3127a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> p(Map<K, ? extends V> map) {
        Intrinsics.j(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }

    @Override // Dv.N, zv.b, zv.h, zv.InterfaceC18555a
    /* renamed from: a, reason: from getter */
    public Bv.f getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3127a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> f() {
        return new LinkedHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3127a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int g(LinkedHashMap<K, V> linkedHashMap) {
        Intrinsics.j(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3127a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> i(Map<K, ? extends V> map) {
        Intrinsics.j(map, "<this>");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Dv.AbstractC3127a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public int j(Map<K, ? extends V> map) {
        Intrinsics.j(map, "<this>");
        return map.size();
    }
}
