package w4;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import z4.C18379a;
import z4.InterfaceC18380b;
import z4.InterfaceC18382d;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz4/b;", "connection", "", "a", "(Lz4/b;)V", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/DBUtil")
@SourceDebugExtension
/* renamed from: w4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final /* synthetic */ class C17755c {
    public static final void a(InterfaceC18380b connection) {
        Intrinsics.j(connection, "connection");
        List listC = CollectionsKt.c();
        InterfaceC18382d interfaceC18382dS3 = connection.S3("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (interfaceC18382dS3.N3()) {
            try {
                listC.add(interfaceC18382dS3.P2(0));
            } finally {
            }
        }
        Unit unit = Unit.f142422a;
        AutoCloseableKt.a(interfaceC18382dS3, null);
        for (String str : CollectionsKt.a(listC)) {
            if (StringsKt.W(str, "room_fts_content_sync_", false, 2, null)) {
                C18379a.a(connection, "DROP TRIGGER IF EXISTS " + str);
            }
        }
    }
}
