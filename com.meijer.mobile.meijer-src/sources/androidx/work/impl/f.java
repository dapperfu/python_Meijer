package androidx.work.impl;

import android.database.SQLException;
import u4.AbstractC17349b;

/* loaded from: classes4.dex */
final class f extends AbstractC17349b {
    public f() {
        super(18, 19);
    }

    @Override // u4.AbstractC17349b
    public void migrate(B4.c cVar) throws SQLException {
        cVar.S("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
