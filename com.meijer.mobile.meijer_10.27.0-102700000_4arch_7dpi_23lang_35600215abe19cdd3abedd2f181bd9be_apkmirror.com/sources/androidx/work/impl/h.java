package androidx.work.impl;

import android.database.SQLException;

/* loaded from: classes4.dex */
final class h extends u4.b {
    public h() {
        super(20, 21);
    }

    @Override // u4.b
    public void migrate(A4.c cVar) throws SQLException {
        cVar.S("ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
