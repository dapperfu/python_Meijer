package com.gimbal.internal.service;

import Xb.j;
import Zb.a;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import fb.C13974a;
import gt.C14406a;
import hb.C14497d;
import java.util.concurrent.ExecutorService;
import kc.C15117b;
import nt.C16020b;
import ut.C17470d;

/* loaded from: classes4.dex */
public class GimbalService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private static final C13784a f65222a = C13785b.a(GimbalService.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final C13786c f65223b = C13787d.a(GimbalService.class.getName());

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C14497d.a(getApplication());
        } catch (Exception e10) {
            f65223b.g("FAILED to create GimbalService", e10);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C16020b c16020bA = C16020b.a();
        c16020bA.f153253l.d();
        C17470d c17470d = c16020bA.f153247f;
        c17470d.f164544k.d();
        c17470d.f164554u.d();
        c17470d.f164555v.d();
        c17470d.f164556w.d();
        C14406a c14406a = c16020bA.f153248g;
        c14406a.f134458b.d();
        c14406a.f134457a.d();
        C13974a c13974aC = C13974a.c();
        j jVar = c13974aC.f131638c;
        if (jVar != null) {
            jVar.e();
        }
        C15117b c15117b = c13974aC.f131639d;
        if (c15117b != null) {
            Context context = c15117b.f141773l;
            if (context != null) {
                context.unregisterReceiver(c15117b);
            }
            ExecutorService executorService = c15117b.f141769h;
            if (executorService != null && !executorService.isShutdown()) {
                c15117b.f141769h.shutdownNow();
                c15117b.f141769h = null;
            }
        }
        if (a.a().f43668d != null) {
            a.a().f43668d.f141820a.clear();
        }
        if (a.a().f43669e != null) {
            a.a().f43669e.f45365a.e();
        }
        c13974aC.f131644i.d();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
