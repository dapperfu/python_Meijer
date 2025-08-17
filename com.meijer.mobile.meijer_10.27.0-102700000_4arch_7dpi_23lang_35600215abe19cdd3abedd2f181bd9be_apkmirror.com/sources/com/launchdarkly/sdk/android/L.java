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
import mh.C15622c;
import mh.InterfaceC15623d;
import mh.InterfaceC15626g;
import oh.C16066h;

/* loaded from: classes7.dex */
abstract class L {

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final AtomicLong f91079a = new AtomicLong(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName(String.format(Locale.ROOT, "LaunchDarkly-DefaultEventProcessor-%d", Long.valueOf(this.f91079a.getAndIncrement())));
            threadNewThread.setDaemon(true);
            return threadNewThread;
        }
    }

    static ScheduledExecutorService b() {
        return Executors.newSingleThreadScheduledExecutor(new a());
    }

    private static void c(com.launchdarkly.sdk.j jVar, InterfaceC15623d<?> interfaceC15623d) {
        if (interfaceC15623d instanceof InterfaceC15626g) {
            LDValue lDValueA = ((InterfaceC15626g) interfaceC15623d).a(null);
            for (String str : lDValueA.m()) {
                jVar.d(str, lDValueA.g(str));
            }
        }
    }

    static C16066h.a a(C15622c c15622c) {
        c0 c0VarB = c15622c.b();
        String strH = c15622c.h();
        com.launchdarkly.sdk.j jVarB = LDValue.c().f("customBaseURI", !r0.f91257b.equals(c0VarB.f91158b.b())).f("customEventsURI", !r0.f91258c.equals(c0VarB.f91158b.a())).f("customStreamURI", !r0.f91256a.equals(c0VarB.f91158b.c())).f("backgroundPollingDisabled", c0VarB.i()).f("evaluationReasonsRequested", c0VarB.j()).b("mobileKeyCount", c0VarB.f().size()).b("maxCachedUsers", c0VarB.d());
        c(jVarB, c0VarB.f91160d);
        c(jVarB, c0VarB.f91161e);
        c(jVarB, c0VarB.f91164h);
        HashMap map = new HashMap();
        for (Map.Entry<String, String> entry : i0.e(c15622c).b()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return new C16066h.a(strH, "android-client-sdk", BuildConfig.VERSION_NAME, "Android", LDValue.c().b("androidSDKVersion", Build.VERSION.SDK_INT).a(), map, Collections.singletonList(jVarB.a()));
    }
}
