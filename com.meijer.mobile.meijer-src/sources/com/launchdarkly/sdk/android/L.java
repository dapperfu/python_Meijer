package com.launchdarkly.sdk.android;

import android.os.Build;
import com.launchdarkly.sdk.LDValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import nh.C15945c;
import nh.InterfaceC15946d;
import nh.InterfaceC15949g;
import ph.C16431h;

/* loaded from: classes8.dex */
abstract class L {

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final AtomicLong f91918a = new AtomicLong(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName(String.format(Locale.ROOT, "LaunchDarkly-DefaultEventProcessor-%d", Long.valueOf(this.f91918a.getAndIncrement())));
            threadNewThread.setDaemon(true);
            return threadNewThread;
        }
    }

    static ScheduledExecutorService b() {
        return Executors.newSingleThreadScheduledExecutor(new a());
    }

    private static void c(com.launchdarkly.sdk.j jVar, InterfaceC15946d<?> interfaceC15946d) {
        if (interfaceC15946d instanceof InterfaceC15949g) {
            LDValue lDValueB = ((InterfaceC15949g) interfaceC15946d).b(null);
            for (String str : lDValueB.m()) {
                jVar.d(str, lDValueB.g(str));
            }
        }
    }

    static C16431h.a a(C15945c c15945c) {
        c0 c0VarB = c15945c.b();
        String strH = c15945c.h();
        com.launchdarkly.sdk.j jVarB = LDValue.c().f("customBaseURI", !r0.f92096b.equals(c0VarB.f91997b.b())).f("customEventsURI", !r0.f92097c.equals(c0VarB.f91997b.a())).f("customStreamURI", !r0.f92095a.equals(c0VarB.f91997b.c())).f("backgroundPollingDisabled", c0VarB.i()).f("evaluationReasonsRequested", c0VarB.j()).b("mobileKeyCount", c0VarB.f().size()).b("maxCachedUsers", c0VarB.d());
        c(jVarB, c0VarB.f91999d);
        c(jVarB, c0VarB.f92000e);
        c(jVarB, c0VarB.f92003h);
        HashMap map = new HashMap();
        for (Map.Entry<String, String> entry : i0.e(c15945c).b()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return new C16431h.a(strH, "android-client-sdk", BuildConfig.VERSION_NAME, "Android", LDValue.c().b("androidSDKVersion", Build.VERSION.SDK_INT).a(), map, Collections.singletonList(jVarB.a()));
    }
}
