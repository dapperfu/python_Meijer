package androidx.work.impl;

import android.database.SQLException;
import u4.AbstractC17349b;

/* loaded from: classes4.dex */
final class e extends AbstractC17349b {
    public e() {
        super(17, 18);
    }

    @Override // u4.AbstractC17349b
    public void migrate(B4.c cVar) throws SQLException {
        cVar.S("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        cVar.S("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
