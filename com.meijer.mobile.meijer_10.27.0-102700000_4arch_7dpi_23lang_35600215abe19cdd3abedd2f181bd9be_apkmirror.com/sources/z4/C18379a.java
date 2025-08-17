package z4;

import android.database.SQLException;
import kotlin.Metadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lz4/b;", "", "sql", "", "a", "(Lz4/b;Ljava/lang/String;)V", "", "errorCode", "errorMsg", "", "b", "(ILjava/lang/String;)Ljava/lang/Void;", "sqlite_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: z4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18379a {
    public static final void a(InterfaceC18380b interfaceC18380b, String sql) {
        Intrinsics.j(interfaceC18380b, "<this>");
        Intrinsics.j(sql, "sql");
        InterfaceC18382d interfaceC18382dS3 = interfaceC18380b.S3(sql);
        try {
            interfaceC18382dS3.N3();
            AutoCloseableKt.a(interfaceC18382dS3, null);
        } finally {
        }
    }

    public static final Void b(int i10, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i10);
        if (str != null) {
            sb2.append(", message: " + str);
        }
        throw new SQLException(sb2.toString());
    }
}
