package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import c.InterfaceC6413a;
import com.fullstory.FS;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    private static String f54033d;

    /* renamed from: g, reason: collision with root package name */
    private static e f54036g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f54037a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f54038b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f54032c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static Set<String> f54034e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f54035f = new Object();

    private static class c implements f {

        /* renamed from: a, reason: collision with root package name */
        final String f54039a;

        /* renamed from: b, reason: collision with root package name */
        final int f54040b;

        /* renamed from: c, reason: collision with root package name */
        final String f54041c;

        /* renamed from: d, reason: collision with root package name */
        final Notification f54042d;

        @Override // androidx.core.app.q.f
        public void a(InterfaceC6413a interfaceC6413a) throws RemoteException {
            interfaceC6413a.l9(this.f54039a, this.f54040b, this.f54041c, this.f54042d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f54039a + ", id:" + this.f54040b + ", tag:" + this.f54041c + "]";
        }

        c(String str, int i10, String str2, Notification notification) {
            this.f54039a = str;
            this.f54040b = i10;
            this.f54041c = str2;
            this.f54042d = notification;
        }
    }

    private static class e implements Handler.Callback, ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final Context f54045a;

        /* renamed from: b, reason: collision with root package name */
        private final HandlerThread f54046b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f54047c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<ComponentName, a> f54048d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private Set<String> f54049e = new HashSet();

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                FS.log_d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f54047c.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                FS.log_d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f54047c.obtainMessage(2, componentName).sendToTarget();
        }

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            final ComponentName f54050a;

            /* renamed from: c, reason: collision with root package name */
            InterfaceC6413a f54052c;

            /* renamed from: b, reason: collision with root package name */
            boolean f54051b = false;

            /* renamed from: d, reason: collision with root package name */
            ArrayDeque<f> f54053d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            int f54054e = 0;

            a(ComponentName componentName) {
                this.f54050a = componentName;
            }
        }

        private boolean a(a aVar) {
            if (aVar.f54051b) {
                return true;
            }
            boolean zBindService = this.f54045a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f54050a), this, 33);
            aVar.f54051b = zBindService;
            if (zBindService) {
                aVar.f54054e = 0;
            } else {
                FS.log_w("NotifManCompat", "Unable to bind to listener " + aVar.f54050a);
                this.f54045a.unbindService(this);
            }
            return aVar.f54051b;
        }

        private void b(a aVar) {
            if (aVar.f54051b) {
                this.f54045a.unbindService(this);
                aVar.f54051b = false;
            }
            aVar.f54052c = null;
        }

        private void d(ComponentName componentName) {
            a aVar = this.f54048d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f54048d.get(componentName);
            if (aVar != null) {
                aVar.f54052c = InterfaceC6413a.AbstractBinderC1208a.K1(iBinder);
                aVar.f54054e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f54048d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                FS.log_d("NotifManCompat", "Processing component " + aVar.f54050a + ", " + aVar.f54053d.size() + " queued tasks");
            }
            if (aVar.f54053d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f54052c == null) {
                i(aVar);
                return;
            }
            while (true) {
                f fVarPeek = aVar.f54053d.peek();
                if (fVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        FS.log_d("NotifManCompat", "Sending task " + fVarPeek);
                    }
                    fVarPeek.a(aVar.f54052c);
                    aVar.f54053d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        FS.log_d("NotifManCompat", "Remote service has died: " + aVar.f54050a);
                    }
                } catch (RemoteException e10) {
                    FS.log_w("NotifManCompat", "RemoteException communicating with " + aVar.f54050a, e10);
                }
            }
            if (aVar.f54053d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f54047c.hasMessages(3, aVar.f54050a)) {
                return;
            }
            int i10 = aVar.f54054e;
            int i11 = i10 + 1;
            aVar.f54054e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    FS.log_d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f54047c.sendMessageDelayed(this.f54047c.obtainMessage(3, aVar.f54050a), i12);
                return;
            }
            FS.log_w("NotifManCompat", "Giving up on delivering " + aVar.f54053d.size() + " tasks to " + aVar.f54050a + " after " + aVar.f54054e + " retries");
            aVar.f54053d.clear();
        }

        private void j() {
            Set<String> setG = q.g(this.f54045a);
            if (setG.equals(this.f54049e)) {
                return;
            }
            this.f54049e = setG;
            List<ResolveInfo> listQueryIntentServices = this.f54045a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setG.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        FS.log_w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f54048d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        FS.log_d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f54048d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f54048d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        FS.log_d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(f fVar) {
            this.f54047c.obtainMessage(0, fVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((f) message.obj);
                return true;
            }
            if (i10 == 1) {
                d dVar = (d) message.obj;
                e(dVar.f54043a, dVar.f54044b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        e(Context context) {
            this.f54045a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f54046b = handlerThread;
            handlerThread.start();
            this.f54047c = new Handler(handlerThread.getLooper(), this);
        }

        private void c(f fVar) {
            j();
            for (a aVar : this.f54048d.values()) {
                aVar.f54053d.add(fVar);
                g(aVar);
            }
        }
    }

    private interface f {
        void a(InterfaceC6413a interfaceC6413a) throws RemoteException;
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void j(int i10, Notification notification) {
        k(null, i10, notification);
    }

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    static class b {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static NotificationChannel b(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f54043a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f54044b;

        d(ComponentName componentName, IBinder iBinder) {
            this.f54043a = componentName;
            this.f54044b = iBinder;
        }
    }

    public static q f(Context context) {
        return new q(context);
    }

    private void l(f fVar) {
        synchronized (f54035f) {
            try {
                if (f54036g == null) {
                    f54036g = new e(this.f54037a.getApplicationContext());
                }
                f54036g.h(fVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a() {
        return a.a(this.f54038b);
    }

    public void c(String str, int i10) {
        this.f54038b.cancel(str, i10);
    }

    public void d() {
        this.f54038b.cancelAll();
    }

    public void e(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(this.f54038b, notificationChannel);
        }
    }

    public int h() {
        return a.b(this.f54038b);
    }

    public NotificationChannel i(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.b(this.f54038b, str);
        }
        return null;
    }

    private q(Context context) {
        this.f54037a = context;
        this.f54038b = (NotificationManager) context.getSystemService("notification");
    }

    public static Set<String> g(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f54032c) {
            if (string != null) {
                try {
                    if (!string.equals(f54033d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f54034e = hashSet;
                        f54033d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f54034e;
        }
        return set;
    }

    private static boolean m(Notification notification) {
        Bundle bundleA = m.a(notification);
        if (bundleA != null && bundleA.getBoolean("android.support.useSideChannel")) {
            return true;
        }
        return false;
    }

    public void k(String str, int i10, Notification notification) {
        if (m(notification)) {
            l(new c(this.f54037a.getPackageName(), i10, str, notification));
            this.f54038b.cancel(str, i10);
        } else {
            this.f54038b.notify(str, i10, notification);
        }
    }
}
