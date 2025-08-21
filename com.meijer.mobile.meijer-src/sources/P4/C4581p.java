package P4;

import android.database.SQLException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import u4.AbstractC17349b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LP4/p;", "Lu4/b;", "<init>", "()V", "LB4/c;", "db", "", "migrate", "(LB4/c;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: P4.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4581p extends AbstractC17349b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4581p f25560a = new C4581p();

    private C4581p() {
        super(8, 9);
    }

    @Override // u4.AbstractC17349b
    public void migrate(B4.c db2) throws SQLException {
        Intrinsics.j(db2, "db");
        db2.S("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
