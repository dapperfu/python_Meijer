package w4;

import kotlin.Metadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LA4/b;", "connection", "", "a", "(LA4/b;)I", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: w4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17835m {
    public static final int a(A4.b connection) {
        Intrinsics.j(connection, "connection");
        A4.d dVarS3 = connection.S3("SELECT changes()");
        try {
            dVarS3.N3();
            int i10 = (int) dVarS3.getLong(0);
            AutoCloseableKt.a(dVarS3, null);
            return i10;
        } finally {
        }
    }
}
