package fsimpl;

import android.app.Activity;
import android.view.Window;
import com.fullstory.util.Log;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes15.dex */
public class aA {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f132705a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f132706b = new WeakHashMap();

    private static Window.Callback a(Window.Callback callback) {
        return callback instanceof D ? ((D) callback).getOriginalCallback() : callback instanceof C ? ((C) callback).getOriginalCallback() : callback;
    }

    public static L a() {
        return (L) f132705a.get();
    }

    public static void a(Window window) {
        WeakHashMap weakHashMap = f132706b;
        synchronized (weakHashMap) {
            Window.Callback callback = window.getCallback();
            boolean z10 = (callback instanceof D) || (callback instanceof C);
            if (weakHashMap.containsKey(window) && z10) {
                return;
            }
            Log.w(z10 ? "Window had a Fullstory callback already, but it was not marked as instrumented." : "Window.Callback for windows has changed - re-adding Fullstory callbacks on window");
            Window.Callback callbackA = a(callback);
            D d10 = new D(window, callbackA);
            if (callbackA instanceof Activity) {
                window.setCallback(new C(d10, (Activity) callbackA));
            } else {
                window.setCallback(d10);
            }
            weakHashMap.put(window, null);
            Log.w("Found a new window: " + window);
        }
    }

    public static void a(Window window, Window.Callback callback) {
        window.setCallback(callback);
        a(window);
    }

    public static void a(L l10) {
        f132705a.set(l10);
    }

    public static Window.Callback b(Window window) {
        return a(window.getCallback());
    }
}
