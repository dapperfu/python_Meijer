package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import rd.ThreadFactoryC16893b;

/* renamed from: com.google.firebase.messaging.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C11469o {
    @SuppressLint({"ThreadPoolCreation"})
    private static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC16893b(str));
    }

    static Executor b() {
        return a("Firebase-Messaging-File-Io");
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ScheduledExecutorService c() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC16893b("Firebase-Messaging-Init"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService e() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC16893b("Firebase-Messaging-Network-Io"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC16893b("Firebase-Messaging-Task"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ScheduledExecutorService g() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC16893b("Firebase-Messaging-Topics-Io"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService d() {
        return Sf.b.a().a(new ThreadFactoryC16893b("Firebase-Messaging-Intent-Handle"), Sf.c.HIGH_SPEED);
    }
}
