package fsimpl;

import android.app.Activity;
import android.view.Window;
import com.fullstory.util.Log;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes14.dex */
public class aA {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f131455a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f131456b = new WeakHashMap();

    public static L a() {
        return (L) f131455a.get();
    }

    public static void a(Window window) {
        WeakHashMap weakHashMap = f131456b;
        synchronized (weakHashMap) {
            Window.Callback callback = window.getCallback();
            boolean z10 = (callback instanceof D) || (callback instanceof C);
            if (weakHashMap.containsKey(window) && z10) {
                return;
            }
            if (!z10) {
                Log.w("Window.Callback for windows has changed - re-adding FullStory callbacks on window");
            }
            D d10 = new D(window, callback);
            if (callback instanceof Activity) {
                window.setCallback(new C(d10, (Activity) callback));
            } else {
                window.setCallback(d10);
            }
            weakHashMap.put(window, null);
            Log.w("Found a new window: " + window);
        }
    }

    public static void a(L l10) {
        f131455a.set(l10);
    }
}
