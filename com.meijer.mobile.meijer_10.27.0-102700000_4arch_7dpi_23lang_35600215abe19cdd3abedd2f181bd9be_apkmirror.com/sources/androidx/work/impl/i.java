package androidx.work.impl;

import android.database.SQLException;

/* loaded from: classes4.dex */
final class i extends u4.b {
    public i() {
        super(22, 23);
    }

    @Override // u4.b
    public void migrate(A4.c cVar) throws SQLException {
        cVar.S("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
