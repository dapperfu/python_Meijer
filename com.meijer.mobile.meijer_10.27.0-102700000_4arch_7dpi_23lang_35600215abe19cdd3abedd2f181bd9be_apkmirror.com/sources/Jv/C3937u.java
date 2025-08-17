package Jv;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R<\u0010\u0016\u001a*\u0012\u0004\u0012\u00020\u0005\u0012 \u0012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0013j\b\u0012\u0004\u0012\u00020\u0001`\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"LJv/u;", "", "<init>", "()V", "T", "LFv/f;", "descriptor", "LJv/u$a;", "key", "value", "", "c", "(LFv/f;LJv/u$a;Ljava/lang/Object;)V", "Lkotlin/Function0;", "defaultValue", "b", "(LFv/f;LJv/u$a;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "a", "(LFv/f;LJv/u$a;)Ljava/lang/Object;", "", "Lkotlinx/serialization/json/internal/DescriptorData;", "Ljava/util/Map;", "map", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Jv.u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3937u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Fv.f, Map<a<Object>, Object>> map = C3936t.a(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LJv/u$a;", "", "T", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Jv.u$a */
    public static final class a<T> {
    }

    public final <T> T a(Fv.f descriptor, a<T> key) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(key, "key");
        Map<a<Object>, Object> map = this.map.get(descriptor);
        T t10 = map != null ? (T) map.get(key) : null;
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    public final <T> T b(Fv.f descriptor, a<T> key, Function0<? extends T> defaultValue) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(key, "key");
        Intrinsics.j(defaultValue, "defaultValue");
        T t10 = (T) a(descriptor, key);
        if (t10 != null) {
            return t10;
        }
        T tInvoke = defaultValue.invoke();
        c(descriptor, key, tInvoke);
        return tInvoke;
    }

    public final <T> void c(Fv.f descriptor, a<T> key, T value) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(key, "key");
        Intrinsics.j(value, "value");
        Map<Fv.f, Map<a<Object>, Object>> map = this.map;
        Map<a<Object>, Object> mapA = map.get(descriptor);
        if (mapA == null) {
            mapA = C3936t.a(2);
            map.put(descriptor, mapA);
        }
        mapA.put(key, value);
    }
}
