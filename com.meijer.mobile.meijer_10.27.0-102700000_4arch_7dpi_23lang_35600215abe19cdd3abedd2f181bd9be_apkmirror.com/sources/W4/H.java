package W4;

import android.os.PowerManager;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LW4/H;", "", "<init>", "()V", "Ljava/util/WeakHashMap;", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "", "b", "Ljava/util/WeakHashMap;", "a", "()Ljava/util/WeakHashMap;", "wakeLocks", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final H f38484a = new H();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final WeakHashMap<PowerManager.WakeLock, String> wakeLocks = new WeakHashMap<>();

    public final WeakHashMap<PowerManager.WakeLock, String> a() {
        return wakeLocks;
    }

    private H() {
    }
}
