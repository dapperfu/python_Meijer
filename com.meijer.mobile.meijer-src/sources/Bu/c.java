package Bu;

import android.content.Context;
import android.content.SharedPreferences;
import io.constructor.data.local.PreferencesHelper;
import io.constructor.data.memory.ConfigMemoryHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LBu/c;", "", "Landroid/content/Context;", "application", "<init>", "(Landroid/content/Context;)V", "c", "()Landroid/content/Context;", "Landroid/content/SharedPreferences;", "preferences", "Lio/constructor/data/local/PreferencesHelper;", "d", "(Landroid/content/SharedPreferences;)Lio/constructor/data/local/PreferencesHelper;", "context", "b", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "Lio/constructor/data/memory/ConfigMemoryHolder;", "a", "()Lio/constructor/data/memory/ConfigMemoryHolder;", "Landroid/content/Context;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context application;

    public c(Context application) {
        Intrinsics.j(application, "application");
        this.application = application;
    }

    public final ConfigMemoryHolder a() {
        return new ConfigMemoryHolder();
    }

    public final SharedPreferences b(Context context) {
        Intrinsics.j(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("constructor_pref_file", 0);
        Intrinsics.i(sharedPreferences, "context.getSharedPrefere…e\", Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    /* renamed from: c, reason: from getter */
    public final Context getApplication() {
        return this.application;
    }

    public final PreferencesHelper d(SharedPreferences preferences) {
        Intrinsics.j(preferences, "preferences");
        return new PreferencesHelper(preferences);
    }
}
