package androidx.room;

import kotlin.Metadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import w4.C17765m;
import z4.InterfaceC18380b;
import z4.InterfaceC18382d;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/room/g;", "T", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "Lz4/d;", "statement", "entity", "", "a", "(Lz4/d;Ljava/lang/Object;)V", "Lz4/b;", "connection", "", "c", "(Lz4/b;Ljava/lang/Object;)I", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.room.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6121g<T> {
    protected abstract void a(InterfaceC18382d statement, T entity);

    protected abstract String b();

    public final int c(InterfaceC18380b connection, T entity) {
        Intrinsics.j(connection, "connection");
        if (entity == null) {
            return 0;
        }
        InterfaceC18382d interfaceC18382dS3 = connection.S3(b());
        try {
            a(interfaceC18382dS3, entity);
            interfaceC18382dS3.N3();
            AutoCloseableKt.a(interfaceC18382dS3, null);
            return C17765m.a(connection);
        } finally {
        }
    }
}
