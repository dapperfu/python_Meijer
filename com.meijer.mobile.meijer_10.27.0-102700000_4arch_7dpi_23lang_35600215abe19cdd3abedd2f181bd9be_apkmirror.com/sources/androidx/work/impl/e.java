package androidx.work.impl;

import android.database.SQLException;

/* loaded from: classes4.dex */
final class e extends u4.b {
    public e() {
        super(17, 18);
    }

    @Override // u4.b
    public void migrate(A4.c cVar) throws SQLException {
        cVar.S("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        cVar.S("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
