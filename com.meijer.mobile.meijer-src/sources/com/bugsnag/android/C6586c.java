package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/bugsnag/android/c;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "Landroid/app/ActivityManager$ProcessErrorStateInfo;", "c", "(Landroid/content/Context;)Landroid/app/ActivityManager$ProcessErrorStateInfo;", "Landroid/app/ActivityManager;", "am", "", "pid", "b", "(Landroid/app/ActivityManager;I)Landroid/app/ActivityManager$ProcessErrorStateInfo;", "Lcom/bugsnag/android/b0;", "event", "anrState", "", "a", "(Lcom/bugsnag/android/b0;Landroid/app/ActivityManager$ProcessErrorStateInfo;)V", "Lcom/bugsnag/android/s;", "client", "d", "(Lcom/bugsnag/android/s;Lcom/bugsnag/android/b0;)V", "Landroid/os/HandlerThread;", "Landroid/os/HandlerThread;", "handlerThread", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6586c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HandlerThread handlerThread;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/bugsnag/android/c$b", "Ljava/lang/Runnable;", "", "run", "()V", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.c$b */
    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6617s f64103b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f64104c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Handler f64105d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C6585b0 f64106e;

        b(C6617s c6617s, AtomicInteger atomicInteger, Handler handler, C6585b0 c6585b0) {
            this.f64103b = c6617s;
            this.f64104c = atomicInteger;
            this.f64105d = handler;
            this.f64106e = c6585b0;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoC = C6586c.this.c(this.f64103b.f64368i);
            if (processErrorStateInfoC != null) {
                C6586c.this.a(this.f64106e, processErrorStateInfoC);
                this.f64103b.H(this.f64106e, null);
            } else if (this.f64104c.getAndIncrement() < 300) {
                this.f64105d.postDelayed(this, 100L);
            }
        }
    }

    public final ActivityManager.ProcessErrorStateInfo b(ActivityManager am2, int pid) {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        Object next;
        if (am2 == null) {
            processesInErrorState = null;
        } else {
            try {
                processesInErrorState = am2.getProcessesInErrorState();
            } catch (RuntimeException unused) {
                return null;
            }
        }
        if (processesInErrorState == null) {
            processesInErrorState = CollectionsKt.m();
        }
        Iterator<T> it = processesInErrorState.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ActivityManager.ProcessErrorStateInfo) next).pid == pid) {
                break;
            }
        }
        return (ActivityManager.ProcessErrorStateInfo) next;
    }

    public final ActivityManager.ProcessErrorStateInfo c(Context ctx) {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = ctx.getSystemService("activity");
            objB = Result.b(systemService instanceof ActivityManager ? (ActivityManager) systemService : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        return b((ActivityManager) (Result.g(objB) ? null : objB), Process.myPid());
    }

    public final void a(C6585b0 event, ActivityManager.ProcessErrorStateInfo anrState) {
        String strS = anrState.shortMsg;
        if (event.e().isEmpty()) {
            return;
        }
        Y y10 = event.e().get(0);
        if (StringsKt.W(strS, "ANR", false, 2, null)) {
            strS = StringsKt.S(strS, "ANR", "", false, 4, null);
        }
        y10.h(strS);
    }

    public final void d(C6617s client, C6585b0 event) {
        Handler handler = new Handler(this.handlerThread.getLooper());
        handler.post(new b(client, new AtomicInteger(), handler, event));
    }

    public C6586c() {
        HandlerThread handlerThread = new HandlerThread("bugsnag-anr-collector");
        this.handlerThread = handlerThread;
        handlerThread.start();
    }
}
