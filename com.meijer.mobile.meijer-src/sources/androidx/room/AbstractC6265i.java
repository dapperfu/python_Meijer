package androidx.room;

import kotlin.Metadata;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H$¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H$¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/room/i;", "T", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "LA4/d;", "statement", "entity", "", "a", "(LA4/d;Ljava/lang/Object;)V", "LA4/b;", "connection", "c", "(LA4/b;Ljava/lang/Object;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.room.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6265i<T> {
    protected abstract void a(A4.d statement, T entity);

    protected abstract String b();

    public final void c(A4.b connection, T entity) {
        Intrinsics.j(connection, "connection");
        if (entity == null) {
            return;
        }
        A4.d dVarS3 = connection.S3(b());
        try {
            a(dVarS3, entity);
            dVarS3.N3();
            AutoCloseableKt.a(dVarS3, null);
        } finally {
        }
    }
}
