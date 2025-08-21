package androidx.work.impl;

import android.database.SQLException;
import u4.AbstractC17349b;

/* loaded from: classes4.dex */
final class h extends AbstractC17349b {
    public h() {
        super(20, 21);
    }

    @Override // u4.AbstractC17349b
    public void migrate(B4.c cVar) throws SQLException {
        cVar.S("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
