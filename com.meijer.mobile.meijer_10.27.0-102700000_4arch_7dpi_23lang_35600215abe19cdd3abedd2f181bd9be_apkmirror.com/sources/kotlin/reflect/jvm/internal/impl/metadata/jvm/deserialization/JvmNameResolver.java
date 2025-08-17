package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class JvmNameResolver extends JvmNameResolverBase {

    /* renamed from: h, reason: collision with root package name */
    private final JvmProtoBuf.StringTableTypes f145656h;

    /* JADX WARN: Illegal instructions before constructor call */
    public JvmNameResolver(JvmProtoBuf.StringTableTypes types, String[] strings) {
        Set setO1;
        Intrinsics.j(types, "types");
        Intrinsics.j(strings, "strings");
        List<Integer> listY = types.y();
        if (listY.isEmpty()) {
            setO1 = SetsKt.e();
        } else {
            Intrinsics.g(listY);
            setO1 = CollectionsKt.o1(listY);
        }
        List<JvmProtoBuf.StringTableTypes.Record> listZ = types.z();
        Intrinsics.i(listZ, "getRecordList(...)");
        super(strings, setO1, JvmNameResolverKt.a(listZ));
        this.f145656h = types;
    }
}
