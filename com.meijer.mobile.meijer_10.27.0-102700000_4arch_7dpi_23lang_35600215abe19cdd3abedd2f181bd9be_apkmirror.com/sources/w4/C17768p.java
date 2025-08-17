package w4;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import z4.InterfaceC18382d;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lz4/d;", "", "name", "", "a", "(Lz4/d;Ljava/lang/String;)I", "b", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/SQLiteStatementUtil")
/* renamed from: w4.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final /* synthetic */ class C17768p {
    public static final int a(InterfaceC18382d interfaceC18382d, String name) {
        Intrinsics.j(interfaceC18382d, "<this>");
        Intrinsics.j(name, "name");
        int iB = C17766n.b(interfaceC18382d, name);
        if (iB >= 0) {
            return iB;
        }
        int iB2 = C17766n.b(interfaceC18382d, '`' + name + '`');
        return iB2 >= 0 ? iB2 : b(interfaceC18382d, name);
    }

    private static final int b(InterfaceC18382d interfaceC18382d, String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount = interfaceC18382d.getColumnCount();
            String str2 = '.' + str;
            String str3 = '.' + str + '`';
            for (int i10 = 0; i10 < columnCount; i10++) {
                String columnName = interfaceC18382d.getColumnName(i10);
                if (columnName.length() >= str.length() + 2 && (StringsKt.G(columnName, str2, false, 2, null) || (columnName.charAt(0) == '`' && StringsKt.G(columnName, str3, false, 2, null)))) {
                    return i10;
                }
            }
        }
        return -1;
    }
}
