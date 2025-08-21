package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;

/* loaded from: classes14.dex */
public final class JvmNameResolverKt {
    public static final List<JvmProtoBuf.StringTableTypes.Record> a(List<JvmProtoBuf.StringTableTypes.Record> list) {
        Intrinsics.j(list, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list.size());
        for (JvmProtoBuf.StringTableTypes.Record record : list) {
            int iG = record.G();
            for (int i10 = 0; i10 < iG; i10++) {
                arrayList.add(record);
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
