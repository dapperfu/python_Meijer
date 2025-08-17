package W4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;

/* loaded from: classes4.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f38468a;

    public static void c(Context context, A4.c cVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            cVar.n();
            try {
                cVar.B0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                cVar.B0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                cVar.q();
            } finally {
                cVar.r();
            }
        }
    }

    public long a() {
        Long lB = this.f38468a.h().b("last_force_stop_ms");
        if (lB != null) {
            return lB.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long lB = this.f38468a.h().b("reschedule_needed");
        return lB != null && lB.longValue() == 1;
    }

    public void d(long j10) {
        this.f38468a.h().a(new Preference("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void e(boolean z10) {
        this.f38468a.h().a(new Preference("reschedule_needed", z10));
    }

    public B(WorkDatabase workDatabase) {
        this.f38468a = workDatabase;
    }
}
