package com.scandit.datacapture.core.internal.module.https.scandit.client;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionConfiguration;
import com.scandit.datacapture.core.internal.module.https.scandit.AbstractC13309k;
import com.scandit.datacapture.core.internal.module.https.scandit.I;
import com.scandit.datacapture.core.internal.module.https.scandit.N;
import com.scandit.datacapture.core.internal.module.https.scandit.O;
import com.scandit.datacapture.core.internal.module.https.scandit.T;
import com.scandit.datacapture.core.internal.module.https.scandit.U;
import com.scandit.datacapture.core.internal.module.https.scandit.client.e;
import com.scandit.datacapture.core.time.TimeInterval;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterval f124716a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f124717b;

    /* renamed from: c, reason: collision with root package name */
    public final f f124718c;

    /* renamed from: d, reason: collision with root package name */
    public final Timer f124719d;

    /* renamed from: e, reason: collision with root package name */
    public final N f124720e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f124721f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f124722g;

    /* renamed from: h, reason: collision with root package name */
    public final c f124723h;

    public final void a(final I task) {
        Intrinsics.j(task, "task");
        this.f124717b.execute(new Runnable() { // from class: bu.a
            @Override // java.lang.Runnable
            public final void run() {
                e.a(this.f60769a, task);
            }
        });
    }

    public e(NativeHttpsSessionConfiguration config) {
        Intrinsics.j(config, "config");
        TimeInterval timeout = TimeInterval.INSTANCE.seconds(config.getTimeoutInterval());
        ExecutorService taskExecutor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Intrinsics.i(taskExecutor, "newFixedThreadPool(...)");
        a taskIdGenerator = new a();
        Timer timeoutTimer = new Timer();
        O sslSocketHandler = new O();
        Intrinsics.j(timeout, "timeout");
        Intrinsics.j(taskExecutor, "taskExecutor");
        Intrinsics.j(taskIdGenerator, "taskIdGenerator");
        Intrinsics.j(timeoutTimer, "timeoutTimer");
        Intrinsics.j(sslSocketHandler, "sslSocketHandler");
        this.f124716a = timeout;
        this.f124717b = taskExecutor;
        this.f124718c = taskIdGenerator;
        this.f124719d = timeoutTimer;
        this.f124720e = sslSocketHandler;
        Set setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.i(setSynchronizedSet, "synchronizedSet(...)");
        this.f124721f = setSynchronizedSet;
        Set setSynchronizedSet2 = Collections.synchronizedSet(new LinkedHashSet());
        Intrinsics.i(setSynchronizedSet2, "synchronizedSet(...)");
        this.f124722g = setSynchronizedSet2;
        this.f124723h = new c(this);
    }

    public static final void a(e this$0, AbstractC13309k task) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(task, "$task");
        for (l lVar : this$0.f124722g) {
            this$0.f124723h.a(new U(task, lVar));
            com.scandit.datacapture.core.internal.module.https.scandit.interceptors.a aVar = (com.scandit.datacapture.core.internal.module.https.scandit.interceptors.a) lVar;
            aVar.getClass();
            Intrinsics.j(task, "task");
            com.scandit.datacapture.core.internal.module.https.a aVarA = ((com.scandit.datacapture.core.internal.module.https.d) aVar.f124736a).a();
            k jVar = aVarA == com.scandit.datacapture.core.internal.module.https.a.f124677a ? new j("No connection") : (aVarA != com.scandit.datacapture.core.internal.module.https.a.f124678b || aVar.f124737b) ? i.f124726a : new j("Cellular not allowed");
            this$0.f124723h.a(new T(task, lVar, jVar));
            if (jVar instanceof j) {
                task.a(((j) jVar).f124727a);
                return;
            }
        }
        Timer timer = this$0.f124719d;
        long jAsMillis = this$0.f124716a.asMillis();
        d dVar = new d(task);
        timer.schedule(dVar, jAsMillis);
        task.start();
        dVar.cancel();
    }
}
