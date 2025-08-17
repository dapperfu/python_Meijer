package w4;

import kotlin.Metadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import z4.InterfaceC18380b;
import z4.InterfaceC18382d;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz4/b;", "connection", "", "a", "(Lz4/b;)I", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: w4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17765m {
    public static final int a(InterfaceC18380b connection) {
        Intrinsics.j(connection, "connection");
        InterfaceC18382d interfaceC18382dS3 = connection.S3("SELECT changes()");
        try {
            interfaceC18382dS3.N3();
            int i10 = (int) interfaceC18382dS3.getLong(0);
            AutoCloseableKt.a(interfaceC18382dS3, null);
            return i10;
        } finally {
        }
    }
}
