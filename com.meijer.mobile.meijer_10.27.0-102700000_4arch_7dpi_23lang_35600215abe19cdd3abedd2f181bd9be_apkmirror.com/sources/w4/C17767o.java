package w4;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import z4.InterfaceC18382d;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lz4/d;", "stmt", "", "name", "", "c", "(Lz4/d;Ljava/lang/String;)I", "a", "b", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/SQLiteStatementUtil")
@SourceDebugExtension
/* renamed from: w4.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final /* synthetic */ class C17767o {
    public static final int a(InterfaceC18382d interfaceC18382d, String name) {
        Intrinsics.j(interfaceC18382d, "<this>");
        Intrinsics.j(name, "name");
        if (interfaceC18382d instanceof C17760h) {
            return ((C17760h) interfaceC18382d).getColumnIndex(name);
        }
        int columnCount = interfaceC18382d.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            if (Intrinsics.e(name, interfaceC18382d.getColumnName(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public static final int b(InterfaceC18382d stmt, String name) {
        Intrinsics.j(stmt, "stmt");
        Intrinsics.j(name, "name");
        return C17766n.a(stmt, name);
    }

    public static final int c(InterfaceC18382d stmt, String name) {
        Intrinsics.j(stmt, "stmt");
        Intrinsics.j(name, "name");
        int iA = C17766n.a(stmt, name);
        if (iA >= 0) {
            return iA;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(stmt.getColumnName(i10));
        }
        throw new IllegalArgumentException("Column '" + name + "' does not exist. Available columns: [" + CollectionsKt.B0(arrayList, null, null, null, 0, null, null, 63, null) + ']');
    }
}
