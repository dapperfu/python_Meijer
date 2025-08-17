package W4;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "", "key", "", "d", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)I", "value", "", "e", "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;I)V", "Landroid/content/Context;", "context", "LA4/c;", "sqLiteDatabase", "c", "(Landroid/content/Context;LA4/c;)V", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: W4.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5413o {
    public static final void c(Context context, A4.c sqLiteDatabase) {
        Intrinsics.j(context, "context");
        Intrinsics.j(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            sqLiteDatabase.n();
            try {
                sqLiteDatabase.B0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                sqLiteDatabase.B0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.q();
            } finally {
                sqLiteDatabase.r();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(WorkDatabase workDatabase, String str) {
        int iLongValue;
        Long lB = workDatabase.h().b(str);
        int i10 = 0;
        if (lB != null) {
            iLongValue = (int) lB.longValue();
        } else {
            iLongValue = 0;
        }
        if (iLongValue != Integer.MAX_VALUE) {
            i10 = iLongValue + 1;
        }
        e(workDatabase, str, i10);
        return iLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WorkDatabase workDatabase, String str, int i10) {
        workDatabase.h().a(new Preference(str, Long.valueOf(i10)));
    }
}
