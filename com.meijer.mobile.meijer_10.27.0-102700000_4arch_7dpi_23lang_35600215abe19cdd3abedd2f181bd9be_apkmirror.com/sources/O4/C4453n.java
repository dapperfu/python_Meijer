package O4;

import android.database.SQLException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LO4/n;", "Lu4/b;", "<init>", "()V", "LA4/c;", "db", "", "migrate", "(LA4/c;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O4.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4453n extends u4.b {

    /* renamed from: a, reason: collision with root package name */
    public static final C4453n f23218a = new C4453n();

    private C4453n() {
        super(6, 7);
    }

    @Override // u4.b
    public void migrate(A4.c db2) throws SQLException {
        Intrinsics.j(db2, "db");
        db2.S("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
