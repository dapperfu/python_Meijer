package androidx.work.impl;

import android.database.SQLException;
import u4.AbstractC17349b;

/* loaded from: classes4.dex */
final class i extends AbstractC17349b {
    public i() {
        super(22, 23);
    }

    @Override // u4.AbstractC17349b
    public void migrate(B4.c cVar) throws SQLException {
        cVar.S("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}
