package O4;

import android.database.SQLException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u4.InterfaceC17221a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LO4/c;", "Lu4/a;", "<init>", "()V", "LA4/c;", "db", "", "a", "(LA4/c;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4442c implements InterfaceC17221a {
    @Override // u4.InterfaceC17221a
    public void a(A4.c db2) throws SQLException {
        Intrinsics.j(db2, "db");
        db2.S("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}
