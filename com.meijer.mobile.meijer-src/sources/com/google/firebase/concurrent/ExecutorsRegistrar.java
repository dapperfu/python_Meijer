package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import cf.InterfaceC6504a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import df.C13672A;
import df.C13676c;
import df.InterfaceC13677d;
import df.t;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes8.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final t<ScheduledExecutorService> f89470a = new t<>(new Kf.b() { // from class: ef.b
        @Override // Kf.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
        }
    });

    /* renamed from: b, reason: collision with root package name */
    static final t<ScheduledExecutorService> f89471b = new t<>(new Kf.b() { // from class: ef.c
        @Override // Kf.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
        }
    });

    /* renamed from: c, reason: collision with root package name */
    static final t<ScheduledExecutorService> f89472c = new t<>(new Kf.b() { // from class: ef.d
        @Override // Kf.b
        public final Object get() {
            return ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
        }
    });

    /* renamed from: d, reason: collision with root package name */
    static final t<ScheduledExecutorService> f89473d = new t<>(new Kf.b() { // from class: ef.e
        @Override // Kf.b
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
        return new o(executorService, f89473d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C13676c<?>> getComponents() {
        return Arrays.asList(C13676c.d(C13672A.a(InterfaceC6504a.class, ScheduledExecutorService.class), C13672A.a(InterfaceC6504a.class, ExecutorService.class), C13672A.a(InterfaceC6504a.class, Executor.class)).f(new df.g() { // from class: ef.f
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return ExecutorsRegistrar.f89470a.get();
            }
        }).d(), C13676c.d(C13672A.a(cf.b.class, ScheduledExecutorService.class), C13672A.a(cf.b.class, ExecutorService.class), C13672A.a(cf.b.class, Executor.class)).f(new df.g() { // from class: ef.g
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return ExecutorsRegistrar.f89472c.get();
            }
        }).d(), C13676c.d(C13672A.a(cf.c.class, ScheduledExecutorService.class), C13672A.a(cf.c.class, ExecutorService.class), C13672A.a(cf.c.class, Executor.class)).f(new df.g() { // from class: ef.h
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return ExecutorsRegistrar.f89471b.get();
            }
        }).d(), C13676c.c(C13672A.a(cf.d.class, Executor.class)).f(new df.g() { // from class: ef.i
            @Override // df.g
            public final Object a(InterfaceC13677d interfaceC13677d) {
                return l.INSTANCE;
            }
        }).d());
    }
}
