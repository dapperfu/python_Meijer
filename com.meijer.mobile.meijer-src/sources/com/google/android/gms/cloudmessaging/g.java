package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.fullstory.FS;
import com.google.android.gms.common.internal.r;
import hd.q;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import qd.C16631b;
import zd.HandlerC18475f;

/* loaded from: classes4.dex */
final class g implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    h f65546c;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ l f65549f;

    /* renamed from: a, reason: collision with root package name */
    int f65544a = 0;

    /* renamed from: b, reason: collision with root package name */
    final Messenger f65545b = new Messenger(new HandlerC18475f(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.e
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                FS.log_d("MessengerIpcClient", "Received response to request: " + i10);
            }
            g gVar = this.f65541a;
            synchronized (gVar) {
                try {
                    j jVar = (j) gVar.f65548e.get(i10);
                    if (jVar == null) {
                        FS.log_w("MessengerIpcClient", "Received response for unknown request: " + i10);
                        return true;
                    }
                    gVar.f65548e.remove(i10);
                    gVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        jVar.c(new zzt(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    jVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: d, reason: collision with root package name */
    final Queue f65547d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    final SparseArray f65548e = new SparseArray();

    final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    final synchronized void b(int i10, String str, Throwable th2) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                FS.log_d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i11 = this.f65544a;
            if (i11 == 0) {
                throw new IllegalStateException();
            }
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f65544a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                FS.log_v("MessengerIpcClient", "Unbinding service");
            }
            this.f65544a = 4;
            C16631b.b().c(this.f65549f.f65557a, this);
            zzt zztVar = new zzt(i10, str, th2);
            Iterator it = this.f65547d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(zztVar);
            }
            this.f65547d.clear();
            for (int i12 = 0; i12 < this.f65548e.size(); i12++) {
                ((j) this.f65548e.valueAt(i12)).c(zztVar);
            }
            this.f65548e.clear();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    final synchronized void d() {
        if (this.f65544a == 1) {
            a(1, "Timed out while binding");
        }
    }

    final synchronized void e(int i10) {
        j jVar = (j) this.f65548e.get(i10);
        if (jVar != null) {
            FS.log_w("MessengerIpcClient", "Timing out request: " + i10);
            this.f65548e.remove(i10);
            jVar.c(new zzt(3, "Timed out waiting for response", null));
            f();
        }
    }

    final synchronized void f() {
        try {
            if (this.f65544a == 2 && this.f65547d.isEmpty() && this.f65548e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    FS.log_v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f65544a = 3;
                C16631b.b().c(this.f65549f.f65557a, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final synchronized boolean g(j jVar) {
        int i10 = this.f65544a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f65547d.add(jVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f65547d.add(jVar);
            c();
            return true;
        }
        this.f65547d.add(jVar);
        r.p(this.f65544a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            FS.log_v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f65544a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (C16631b.b().a(this.f65549f.f65557a, intent, this, 1)) {
                this.f65549f.f65558b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f65539a.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            FS.log_v("MessengerIpcClient", "Service connected");
        }
        this.f65549f.f65558b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.a
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = this.f65536a;
                IBinder iBinder2 = iBinder;
                synchronized (gVar) {
                    if (iBinder2 == null) {
                        gVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        gVar.f65546c = new h(iBinder2);
                        gVar.f65544a = 2;
                        gVar.c();
                    } catch (RemoteException e10) {
                        gVar.a(0, e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            FS.log_v("MessengerIpcClient", "Service disconnected");
        }
        this.f65549f.f65558b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f65540a.a(2, "Service disconnected");
            }
        });
    }

    /* synthetic */ g(l lVar, q qVar) {
        this.f65549f = lVar;
    }

    final void c() {
        this.f65549f.f65558b.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.b
            @Override // java.lang.Runnable
            public final void run() {
                final j jVar;
                while (true) {
                    final g gVar = this.f65538a;
                    synchronized (gVar) {
                        try {
                            if (gVar.f65544a != 2) {
                                return;
                            }
                            if (gVar.f65547d.isEmpty()) {
                                gVar.f();
                                return;
                            } else {
                                jVar = (j) gVar.f65547d.poll();
                                gVar.f65548e.put(jVar.f65552a, jVar);
                                gVar.f65549f.f65558b.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.f
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        gVar.e(jVar.f65552a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } finally {
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        FS.log_d("MessengerIpcClient", "Sending ".concat(String.valueOf(jVar)));
                    }
                    l lVar = gVar.f65549f;
                    Messenger messenger = gVar.f65545b;
                    int i10 = jVar.f65554c;
                    Context context = lVar.f65557a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = jVar.f65552a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", jVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", jVar.f65555d);
                    messageObtain.setData(bundle);
                    try {
                        gVar.f65546c.a(messageObtain);
                    } catch (RemoteException e10) {
                        gVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }
}
