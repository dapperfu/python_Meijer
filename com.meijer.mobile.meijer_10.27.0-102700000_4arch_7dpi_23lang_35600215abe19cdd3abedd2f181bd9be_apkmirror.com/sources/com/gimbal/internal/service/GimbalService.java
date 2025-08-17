package com.gimbal.internal.service;

import Vb.j;
import Xb.a;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import db.C13501a;
import fb.C13867d;
import gt.C14310a;
import ic.C14714b;
import java.util.concurrent.ExecutorService;
import nt.C15944b;
import ut.C17318d;

/* loaded from: classes4.dex */
public class GimbalService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private static final C6380a f64382a = C6381b.a(GimbalService.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final C6382c f64383b = C6383d.a(GimbalService.class.getName());

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C13867d.a(getApplication());
        } catch (Exception e10) {
            f64383b.g("FAILED to create GimbalService", e10);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C15944b c15944bA = C15944b.a();
        c15944bA.f152801l.d();
        C17318d c17318d = c15944bA.f152795f;
        c17318d.f163466k.d();
        c17318d.f163476u.d();
        c17318d.f163477v.d();
        c17318d.f163478w.d();
        C14310a c14310a = c15944bA.f152796g;
        c14310a.f134085b.d();
        c14310a.f134084a.d();
        C13501a c13501aC = C13501a.c();
        j jVar = c13501aC.f127309c;
        if (jVar != null) {
            jVar.e();
        }
        C14714b c14714b = c13501aC.f127310d;
        if (c14714b != null) {
            Context context = c14714b.f137684l;
            if (context != null) {
                context.unregisterReceiver(c14714b);
            }
            ExecutorService executorService = c14714b.f137680h;
            if (executorService != null && !executorService.isShutdown()) {
                c14714b.f137680h.shutdownNow();
                c14714b.f137680h = null;
            }
        }
        if (a.a().f39190d != null) {
            a.a().f39190d.f137731a.clear();
        }
        if (a.a().f39191e != null) {
            a.a().f39191e.f40233a.e();
        }
        c13501aC.f127315i.d();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
