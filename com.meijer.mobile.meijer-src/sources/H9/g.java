package H9;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LH9/g;", "", "<init>", "()V", "Landroid/content/SharedPreferences;", "oldSharedPreferences", "newSharedPreferences", "", "a", "(Landroid/content/SharedPreferences;Landroid/content/SharedPreferences;)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {
    public final void a(SharedPreferences oldSharedPreferences, SharedPreferences newSharedPreferences) {
        Intrinsics.j(oldSharedPreferences, "oldSharedPreferences");
        Intrinsics.j(newSharedPreferences, "newSharedPreferences");
        try {
            Map<String, ?> all = oldSharedPreferences.getAll();
            SharedPreferences.Editor editorEdit = newSharedPreferences.edit();
            Intrinsics.g(all);
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    editorEdit.putString(key, (String) value);
                } else if (value instanceof Integer) {
                    editorEdit.putInt(key, ((Number) value).intValue());
                } else if (value instanceof Boolean) {
                    editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value instanceof Float) {
                    editorEdit.putFloat(key, ((Number) value).floatValue());
                } else if (value instanceof Long) {
                    editorEdit.putLong(key, ((Number) value).longValue());
                } else if (value instanceof Set) {
                    Intrinsics.h(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    editorEdit.putStringSet(key, (Set) value);
                }
            }
            editorEdit.apply();
            oldSharedPreferences.edit().clear().apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
