package R6;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001d\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001OB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010\u0017J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u0017J\u001f\u0010#\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u0015R0\u0010)\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0%0$j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0%`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00107R\u001a\u0010=\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b+\u0010<R(\u0010C\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\b\u00107\u0012\u0004\bB\u0010\u0004\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR0\u0010H\u001a\u00020\f2\u0006\u0010D\u001a\u00020\f8\u0006@AX\u0087\u000e¢\u0006\u0018\n\u0004\bE\u00107\u0012\u0004\bG\u0010\u0004\u001a\u0004\b2\u0010?\"\u0004\bF\u0010AR(\u0010M\u001a\u0002098\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bI\u0010;\u0012\u0004\bL\u0010\u0004\u001a\u0004\b'\u0010<\"\u0004\bJ\u0010KR(\u0010R\u001a\u0002098\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bN\u0010;\u0012\u0004\bQ\u0010\u0004\u001a\u0004\bO\u0010<\"\u0004\bP\u0010KR(\u0010S\u001a\u000209*\u00020\u001c2\u0006\u0010S\u001a\u0002098B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010T\"\u0004\bE\u0010U¨\u0006V"}, d2 = {"LR6/j;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/os/Handler$Callback;", "<init>", "()V", "Landroid/app/Application;", "application", "", "i", "(Landroid/app/Application;)V", "LR6/j$a;", "callbacks", "", "notifyCurrentState", "g", "(LR6/j$a;Z)V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "onActivityPostStarted", "onActivityPostStopped", "onActivityDestroyed", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)Z", "onActivityResumed", "onActivityPaused", "outState", "onActivitySaveInstanceState", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "listeners", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "mainThreadHandler", "d", "Landroid/app/Application;", "observedApplication", "", "e", "I", "activityInstanceCount", "f", "startedActivityCount", "Z", "waitingForActivityRestart", "", "h", "J", "()J", "startupTime", "getBackgroundSent$bugsnag_android_core_release", "()Z", "setBackgroundSent$bugsnag_android_core_release", "(Z)V", "getBackgroundSent$bugsnag_android_core_release$annotations", "backgroundSent", "<set-?>", "j", "setInForeground$bugsnag_android_core_release", "isInForeground$annotations", "isInForeground", "k", "setLastExitedForegroundMs", "(J)V", "getLastExitedForegroundMs$annotations", "lastExitedForegroundMs", "l", "a", "setLastEnteredForegroundMs", "getLastEnteredForegroundMs$annotations", "lastEnteredForegroundMs", "timestamp", "(Landroid/os/Message;)J", "(Landroid/os/Message;J)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements Application.ActivityLifecycleCallbacks, Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public static final j f31967a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ArrayList<WeakReference<a>> listeners;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Handler mainThreadHandler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static Application observedApplication;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static int activityInstanceCount;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static int startedActivityCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static boolean waitingForActivityRestart;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final long startupTime;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static boolean backgroundSent;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static boolean isInForeground;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static volatile long lastExitedForegroundMs;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static volatile long lastEnteredForegroundMs;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"LR6/j$a;", "", "", "foreground", "", "timestamp", "", "a", "(ZJ)V", "Landroid/app/Activity;", "activity", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityStopped", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a {
        void a(boolean foreground, long timestamp);

        void onActivityStarted(Activity activity);

        void onActivityStopped(Activity activity);
    }

    @JvmStatic
    @JvmOverloads
    public static final void f(a aVar) {
        h(aVar, false, 2, null);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    static {
        j jVar = new j();
        f31967a = jVar;
        listeners = new ArrayList<>();
        mainThreadHandler = new Handler(Looper.getMainLooper(), jVar);
        startupTime = SystemClock.elapsedRealtime();
        backgroundSent = true;
    }

    public static final long a() {
        return lastEnteredForegroundMs;
    }

    public static final long b() {
        return lastExitedForegroundMs;
    }

    private final long d(Message message) {
        return (message.arg1 << 32) | message.arg2;
    }

    public static final boolean e() {
        return isInForeground;
    }

    @JvmStatic
    @JvmOverloads
    public static final void g(a callbacks, boolean notifyCurrentState) {
        ArrayList<WeakReference<a>> arrayList = listeners;
        synchronized (arrayList) {
            arrayList.add(new WeakReference<>(callbacks));
        }
        if (notifyCurrentState) {
            boolean z10 = isInForeground;
            callbacks.a(z10, z10 ? lastEnteredForegroundMs : lastExitedForegroundMs);
        }
    }

    public static /* synthetic */ void h(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        g(aVar, z10);
    }

    @JvmStatic
    public static final void i(Application application) {
        Application application2 = observedApplication;
        if (application == application2) {
            return;
        }
        if (application2 != null) {
            application2.unregisterActivityLifecycleCallbacks(f31967a);
        }
        observedApplication = application;
        application.registerActivityLifecycleCallbacks(f31967a);
    }

    private final void j(Message message, long j10) {
        message.arg1 = (int) ((j10 >>> 32) & 4294967295L);
        message.arg2 = (int) (j10 & 4294967295L);
    }

    public final long c() {
        return startupTime;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) {
        if (msg.what != 1) {
            return false;
        }
        waitingForActivityRestart = false;
        if (!backgroundSent) {
            isInForeground = false;
            backgroundSent = true;
            long jD = d(msg);
            ArrayList<WeakReference<a>> arrayList = listeners;
            synchronized (arrayList) {
                try {
                    if (!arrayList.isEmpty()) {
                        try {
                            Iterator<WeakReference<a>> it = arrayList.iterator();
                            while (it.hasNext()) {
                                a aVar = it.next().get();
                                if (aVar == null) {
                                    it.remove();
                                } else {
                                    aVar.a(false, jD);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        Unit unit = Unit.f143329a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            lastExitedForegroundMs = jD;
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        activityInstanceCount++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        activityInstanceCount = Math.max(0, activityInstanceCount - 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        ArrayList<WeakReference<a>> arrayList = listeners;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    Iterator<WeakReference<a>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a aVar = it.next().get();
                        if (aVar == null) {
                            it.remove();
                        } else {
                            aVar.onActivityStarted(activity);
                        }
                    }
                } catch (Exception unused) {
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(Activity activity) {
        ArrayList<WeakReference<a>> arrayList = listeners;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    Iterator<WeakReference<a>> it = arrayList.iterator();
                    while (it.hasNext()) {
                        a aVar = it.next().get();
                        if (aVar == null) {
                            it.remove();
                        } else {
                            aVar.onActivityStopped(activity);
                        }
                    }
                } catch (Exception unused) {
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (startedActivityCount == 0 && !waitingForActivityRestart) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList<WeakReference<a>> arrayList = listeners;
            synchronized (arrayList) {
                try {
                    if (!arrayList.isEmpty()) {
                        try {
                            Iterator<WeakReference<a>> it = arrayList.iterator();
                            while (it.hasNext()) {
                                a aVar = it.next().get();
                                if (aVar == null) {
                                    it.remove();
                                } else {
                                    aVar.a(true, jElapsedRealtime);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        Unit unit = Unit.f143329a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            lastEnteredForegroundMs = jElapsedRealtime;
        }
        startedActivityCount++;
        mainThreadHandler.removeMessages(1);
        isInForeground = true;
        waitingForActivityRestart = false;
        if (Build.VERSION.SDK_INT < 29) {
            ArrayList<WeakReference<a>> arrayList2 = listeners;
            synchronized (arrayList2) {
                try {
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    try {
                        Iterator<WeakReference<a>> it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            a aVar2 = it2.next().get();
                            if (aVar2 == null) {
                                it2.remove();
                            } else {
                                aVar2.onActivityStarted(activity);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    Unit unit2 = Unit.f143329a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int iMax = Math.max(0, startedActivityCount - 1);
        startedActivityCount = iMax;
        if (iMax == 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (activity.isChangingConfigurations()) {
                waitingForActivityRestart = true;
                Handler handler = mainThreadHandler;
                Message messageObtainMessage = handler.obtainMessage(1);
                j(messageObtainMessage, jElapsedRealtime);
                handler.sendMessageDelayed(messageObtainMessage, 700L);
            } else {
                ArrayList<WeakReference<a>> arrayList = listeners;
                synchronized (arrayList) {
                    try {
                        if (!arrayList.isEmpty()) {
                            try {
                                Iterator<WeakReference<a>> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    a aVar = it.next().get();
                                    if (aVar == null) {
                                        it.remove();
                                    } else {
                                        aVar.a(false, jElapsedRealtime);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            Unit unit = Unit.f143329a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                isInForeground = false;
                lastExitedForegroundMs = jElapsedRealtime;
            }
        }
        if (Build.VERSION.SDK_INT < 29) {
            ArrayList<WeakReference<a>> arrayList2 = listeners;
            synchronized (arrayList2) {
                try {
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    try {
                        Iterator<WeakReference<a>> it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            a aVar2 = it2.next().get();
                            if (aVar2 == null) {
                                it2.remove();
                            } else {
                                aVar2.onActivityStopped(activity);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    Unit unit2 = Unit.f143329a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private j() {
    }
}
