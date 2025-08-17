package W4;

import N4.AbstractC4333v;
import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Landroid/content/Context;", "context", "", "tag", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "b", "(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "", "a", "()V", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private static final String f38483a;

    static {
        String strI = AbstractC4333v.i("WakeLocks");
        Intrinsics.i(strI, "tagWithPrefix(\"WakeLocks\")");
        f38483a = strI;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        H h10 = H.f38484a;
        synchronized (h10) {
            linkedHashMap.putAll(h10.a());
            Unit unit = Unit.f142422a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC4333v.e().k(f38483a, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String tag) {
        Intrinsics.j(context, "context");
        Intrinsics.j(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        H h10 = H.f38484a;
        synchronized (h10) {
            h10.a().put(wakeLock, str);
        }
        Intrinsics.i(wakeLock, "wakeLock");
        return wakeLock;
    }
}
