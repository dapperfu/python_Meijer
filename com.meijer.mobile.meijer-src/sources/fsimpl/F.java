package fsimpl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes15.dex */
public class F implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final RustInterface f132627a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC14120bt f132628b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f132629c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f132630d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f132631e = false;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f132632f = new AtomicInteger();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f132633g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f132634h = new AtomicReference(null);

    F(C14138ck c14138ck, final RustInterface rustInterface, AtomicReference atomicReference, aL aLVar) {
        this.f132627a = rustInterface;
        this.f132628b = AbstractC14120bt.a(c14138ck, rustInterface, aLVar);
        this.f132630d = atomicReference;
        this.f132629c = new Runnable() { // from class: fsimpl.F$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(rustInterface);
            }
        };
    }

    private String a(Activity activity) {
        return activity != null ? activity.getClass().getName() : zzbz.UNKNOWN_CONTENT_TYPE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final RustInterface rustInterface) {
        if (this.f132632f.decrementAndGet() == 0) {
            a(new Runnable() { // from class: fsimpl.F$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    rustInterface.a(0);
                }
            });
        }
    }

    private void a(Runnable runnable) {
        boolean z10 = false;
        boolean z11 = this.f132627a.a() != null;
        boolean z12 = this.f132631e;
        this.f132631e = false;
        if (z11 && !z12) {
            z10 = true;
        }
        final CountDownLatch countDownLatch = z10 ? new CountDownLatch(1) : null;
        if (countDownLatch != null) {
            AtomicReference atomicReference = this.f132630d;
            countDownLatch.getClass();
            atomicReference.set(new U() { // from class: fsimpl.F$$ExternalSyntheticLambda3
                @Override // fsimpl.U
                public final void onFinalBundle() {
                    countDownLatch.countDown();
                }
            });
        }
        runnable.run();
        if (countDownLatch != null) {
            System.currentTimeMillis();
            try {
                countDownLatch.await(200L, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String[] strArr) {
        this.f132627a.a(str, strArr);
    }

    private String b() {
        return a(getCurrentActivity());
    }

    void a() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            this.f132631e = true;
            currentActivity.finishAffinity();
        }
    }

    void a(final String[] strArr) {
        final String strB = b();
        Log.d("[activity] onCrash: " + strB);
        a(new Runnable() { // from class: fsimpl.F$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a(strB, strArr);
            }
        });
    }

    public Activity getCurrentActivity() {
        WeakReference weakReference = (WeakReference) this.f132634h.get();
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public AbstractC14120bt getFragmentSupport() {
        return this.f132628b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Log.d("[activity] onActivityCreated: " + a(activity));
        bX.a(activity.getResources());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Log.d("[activity] onActivityDestroyed: " + a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Log.d("[activity] onActivityPaused: " + a(activity));
        WeakReference weakReference = (WeakReference) this.f132634h.get();
        Activity activity2 = weakReference == null ? null : (Activity) weakReference.get();
        if (activity2 == activity || activity2 == null) {
            F$$ExternalSyntheticBackportWithForwarding0.m(this.f132634h, weakReference, null);
        }
        this.f132627a.a(a(activity), (short) 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Log.d("[activity] onActivityResumed: " + a(activity));
        this.f132634h.set(new WeakReference(activity));
        if (this.f132633g.compareAndSet(true, false)) {
            this.f132627a.c();
        }
        this.f132627a.a(a(activity), (short) 0);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Log.d("[activity] onActivitySaveInstanceState: " + a(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        int iIncrementAndGet = this.f132632f.incrementAndGet();
        Log.d("[activity] onActivityStarted: " + a(activity));
        if (iIncrementAndGet == 1) {
            this.f132633g.set(true);
        }
        this.f132628b.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Log.d("[activity] onActivityStopped: " + a(activity));
        this.f132627a.a(a(activity), (short) 2);
        this.f132628b.b(activity);
        if (activity != null ? activity.isChangingConfigurations() : false) {
            fZ.a(this.f132629c, 500L);
        } else {
            this.f132629c.run();
        }
    }
}
