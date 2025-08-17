package androidx.work.impl;

import android.database.SQLException;

/* loaded from: classes4.dex */
final class f extends u4.b {
    public f() {
        super(18, 19);
    }

    @Override // u4.b
    public void migrate(A4.c cVar) throws SQLException {
        cVar.S("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
