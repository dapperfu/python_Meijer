package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class TypeTable {

    /* renamed from: a, reason: collision with root package name */
    private final List<ProtoBuf.Type> f146456a;

    public TypeTable(ProtoBuf.TypeTable typeTable) {
        Intrinsics.j(typeTable, "typeTable");
        List<ProtoBuf.Type> listB = typeTable.B();
        if (typeTable.C()) {
            int iY = typeTable.y();
            List<ProtoBuf.Type> listB2 = typeTable.B();
            Intrinsics.i(listB2, "getTypeList(...)");
            List<ProtoBuf.Type> list = listB2;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.w();
                }
                ProtoBuf.Type typeBuild = (ProtoBuf.Type) obj;
                if (i10 >= iY) {
                    typeBuild = typeBuild.b().M(true).build();
                }
                arrayList.add(typeBuild);
                i10 = i11;
            }
            listB = arrayList;
        }
        Intrinsics.i(listB, "run(...)");
        this.f146456a = listB;
    }

    public final ProtoBuf.Type a(int i10) {
        return this.f146456a.get(i10);
    }
}
