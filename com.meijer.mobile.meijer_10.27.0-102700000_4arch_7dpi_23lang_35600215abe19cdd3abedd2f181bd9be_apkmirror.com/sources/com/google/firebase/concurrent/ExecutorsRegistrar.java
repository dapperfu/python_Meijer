package com.google.firebase.concurrent;

import af.InterfaceC5598a;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import bf.C6241A;
import bf.C6245c;
import bf.InterfaceC6246d;
import bf.t;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes7.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final t<ScheduledExecutorService> f88630a = new t<>(new If.b() { // from class: cf.b
        @Override // If.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });

    /* renamed from: b, reason: collision with root package name */
    static final t<ScheduledExecutorService> f88631b = new t<>(new If.b() { // from class: cf.c
        @Override // If.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* renamed from: c, reason: collision with root package name */
    static final t<ScheduledExecutorService> f88632c = new t<>(new If.b() { // from class: cf.d
        @Override // If.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* renamed from: d, reason: collision with root package name */
    static final t<ScheduledExecutorService> f88633d = new t<>(new If.b() { // from class: cf.e
        @Override // If.b
        public final Object get() {
            return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
        }
    });

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return builderDetectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, f88633d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6245c<?>> getComponents() {
        return Arrays.asList(C6245c.d(C6241A.a(InterfaceC5598a.class, ScheduledExecutorService.class), C6241A.a(InterfaceC5598a.class, ExecutorService.class), C6241A.a(InterfaceC5598a.class, Executor.class)).f(new bf.g() { // from class: cf.f
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return ExecutorsRegistrar.f88630a.get();
            }
        }).d(), C6245c.d(C6241A.a(af.b.class, ScheduledExecutorService.class), C6241A.a(af.b.class, ExecutorService.class), C6241A.a(af.b.class, Executor.class)).f(new bf.g() { // from class: cf.g
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return ExecutorsRegistrar.f88632c.get();
            }
        }).d(), C6245c.d(C6241A.a(af.c.class, ScheduledExecutorService.class), C6241A.a(af.c.class, ExecutorService.class), C6241A.a(af.c.class, Executor.class)).f(new bf.g() { // from class: cf.h
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return ExecutorsRegistrar.f88631b.get();
            }
        }).d(), C6245c.c(C6241A.a(af.d.class, Executor.class)).f(new bf.g() { // from class: cf.i
            @Override // bf.g
            public final Object a(InterfaceC6246d interfaceC6246d) {
                return l.INSTANCE;
            }
        }).d());
    }
}
