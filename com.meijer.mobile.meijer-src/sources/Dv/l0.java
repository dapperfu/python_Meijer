package Dv;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"(\u0010\u000e\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"", "serialName", "LBv/e;", "kind", "LBv/f;", "a", "(Ljava/lang/String;LBv/e;)LBv/f;", "", "b", "(Ljava/lang/String;)V", "", "Lkotlin/reflect/KClass;", "Lzv/b;", "Ljava/util/Map;", "BUILTIN_SERIALIZERS", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<KClass<?>, zv.b<?>> f6764a = X.a();

    public static final Bv.f a(String serialName, Bv.e kind) {
        Intrinsics.j(serialName, "serialName");
        Intrinsics.j(kind, "kind");
        b(serialName);
        return new PrimitiveDescriptor(serialName, kind);
    }

    private static final void b(String str) {
        for (zv.b<?> bVar : f6764a.values()) {
            if (Intrinsics.e(str, bVar.getDescriptor().getSerialName())) {
                throw new IllegalArgumentException(StringsKt.n("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + Reflection.b(bVar.getClass()).u() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
