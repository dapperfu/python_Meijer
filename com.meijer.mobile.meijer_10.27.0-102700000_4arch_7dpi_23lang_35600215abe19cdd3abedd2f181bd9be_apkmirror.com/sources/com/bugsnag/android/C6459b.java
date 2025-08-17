package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/bugsnag/android/b;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "Landroid/app/ActivityManager$ProcessErrorStateInfo;", "c", "(Landroid/content/Context;)Landroid/app/ActivityManager$ProcessErrorStateInfo;", "Landroid/app/ActivityManager;", "am", "", "pid", "b", "(Landroid/app/ActivityManager;I)Landroid/app/ActivityManager$ProcessErrorStateInfo;", "Lcom/bugsnag/android/V;", "event", "anrState", "", "a", "(Lcom/bugsnag/android/V;Landroid/app/ActivityManager$ProcessErrorStateInfo;)V", "Lcom/bugsnag/android/p;", "client", "d", "(Lcom/bugsnag/android/p;Lcom/bugsnag/android/V;)V", "Landroid/os/HandlerThread;", "Landroid/os/HandlerThread;", "handlerThread", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6459b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HandlerThread handlerThread;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/bugsnag/android/b$b", "Ljava/lang/Runnable;", "", "run", "()V", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.b$b, reason: collision with other inner class name */
    public static final class RunnableC1242b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6487p f63386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f63387c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Handler f63388d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ V f63389e;

        RunnableC1242b(C6487p c6487p, AtomicInteger atomicInteger, Handler handler, V v10) {
            this.f63386b = c6487p;
            this.f63387c = atomicInteger;
            this.f63388d = handler;
            this.f63389e = v10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6459b c6459b = C6459b.this;
            Context context = this.f63386b.f63532i;
            Intrinsics.f(context, "client.appContext");
            ActivityManager.ProcessErrorStateInfo processErrorStateInfoC = c6459b.c(context);
            if (processErrorStateInfoC != null) {
                C6459b.this.a(this.f63389e, processErrorStateInfoC);
                this.f63386b.H(this.f63389e, null);
            } else if (this.f63387c.getAndIncrement() < 300) {
                this.f63388d.postDelayed(this, 100L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000a A[Catch: RuntimeException -> 0x002a, TryCatch #0 {RuntimeException -> 0x002a, blocks: (B:4:0x0003, B:8:0x000e, B:9:0x0014, B:11:0x001a, B:15:0x0027, B:7:0x000a), top: B:18:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.ActivityManager.ProcessErrorStateInfo b(android.app.ActivityManager r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto La
            java.util.List r4 = r4.getProcessesInErrorState()     // Catch: java.lang.RuntimeException -> L2a
            if (r4 == 0) goto La
            goto Le
        La:
            java.util.List r4 = kotlin.collections.CollectionsKt.m()     // Catch: java.lang.RuntimeException -> L2a
        Le:
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.RuntimeException -> L2a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.RuntimeException -> L2a
        L14:
            boolean r1 = r4.hasNext()     // Catch: java.lang.RuntimeException -> L2a
            if (r1 == 0) goto L26
            java.lang.Object r1 = r4.next()     // Catch: java.lang.RuntimeException -> L2a
            r2 = r1
            android.app.ActivityManager$ProcessErrorStateInfo r2 = (android.app.ActivityManager.ProcessErrorStateInfo) r2     // Catch: java.lang.RuntimeException -> L2a
            int r2 = r2.pid     // Catch: java.lang.RuntimeException -> L2a
            if (r2 != r5) goto L14
            goto L27
        L26:
            r1 = r0
        L27:
            android.app.ActivityManager$ProcessErrorStateInfo r1 = (android.app.ActivityManager.ProcessErrorStateInfo) r1     // Catch: java.lang.RuntimeException -> L2a
            return r1
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.C6459b.b(android.app.ActivityManager, int):android.app.ActivityManager$ProcessErrorStateInfo");
    }

    public final ActivityManager.ProcessErrorStateInfo c(Context ctx) {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = ctx.getSystemService("activity");
            if (!(systemService instanceof ActivityManager)) {
                systemService = null;
            }
            objB = Result.b((ActivityManager) systemService);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        return b((ActivityManager) (Result.g(objB) ? null : objB), Process.myPid());
    }

    public final void a(V event, ActivityManager.ProcessErrorStateInfo anrState) {
        String msg = anrState.shortMsg;
        List<S> listE = event.e();
        Intrinsics.f(listE, "event.errors");
        if (listE.isEmpty()) {
            return;
        }
        S s10 = event.e().get(0);
        Intrinsics.f(s10, "event.errors[0]");
        S s11 = s10;
        Intrinsics.f(msg, "msg");
        if (StringsKt.W(msg, "ANR", false, 2, null)) {
            msg = StringsKt.S(msg, "ANR", "", false, 4, null);
        }
        s11.h(msg);
    }

    public final void d(C6487p client, V event) {
        Handler handler = new Handler(this.handlerThread.getLooper());
        handler.post(new RunnableC1242b(client, new AtomicInteger(), handler, event));
    }

    public C6459b() {
        HandlerThread handlerThread = new HandlerThread("bugsnag-anr-collector");
        this.handlerThread = handlerThread;
        handlerThread.start();
    }
}
