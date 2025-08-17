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
import c.InterfaceC6287a;
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
    private static String f53809d;

    /* renamed from: g, reason: collision with root package name */
    private static e f53812g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f53813a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f53814b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f53808c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static Set<String> f53810e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f53811f = new Object();

    private static class c implements f {

        /* renamed from: a, reason: collision with root package name */
        final String f53815a;

        /* renamed from: b, reason: collision with root package name */
        final int f53816b;

        /* renamed from: c, reason: collision with root package name */
        final String f53817c;

        /* renamed from: d, reason: collision with root package name */
        final Notification f53818d;

        @Override // androidx.core.app.q.f
        public void a(InterfaceC6287a interfaceC6287a) throws RemoteException {
            interfaceC6287a.k9(this.f53815a, this.f53816b, this.f53817c, this.f53818d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f53815a + ", id:" + this.f53816b + ", tag:" + this.f53817c + "]";
        }

        c(String str, int i10, String str2, Notification notification) {
            this.f53815a = str;
            this.f53816b = i10;
            this.f53817c = str2;
            this.f53818d = notification;
        }
    }

    private static class e implements Handler.Callback, ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final Context f53821a;

        /* renamed from: b, reason: collision with root package name */
        private final HandlerThread f53822b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f53823c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<ComponentName, a> f53824d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private Set<String> f53825e = new HashSet();

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                FS.log_d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f53823c.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                FS.log_d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f53823c.obtainMessage(2, componentName).sendToTarget();
        }

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            final ComponentName f53826a;

            /* renamed from: c, reason: collision with root package name */
            InterfaceC6287a f53828c;

            /* renamed from: b, reason: collision with root package name */
            boolean f53827b = false;

            /* renamed from: d, reason: collision with root package name */
            ArrayDeque<f> f53829d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            int f53830e = 0;

            a(ComponentName componentName) {
                this.f53826a = componentName;
            }
        }

        private boolean a(a aVar) {
            if (aVar.f53827b) {
                return true;
            }
            boolean zBindService = this.f53821a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f53826a), this, 33);
            aVar.f53827b = zBindService;
            if (zBindService) {
                aVar.f53830e = 0;
            } else {
                FS.log_w("NotifManCompat", "Unable to bind to listener " + aVar.f53826a);
                this.f53821a.unbindService(this);
            }
            return aVar.f53827b;
        }

        private void b(a aVar) {
            if (aVar.f53827b) {
                this.f53821a.unbindService(this);
                aVar.f53827b = false;
            }
            aVar.f53828c = null;
        }

        private void d(ComponentName componentName) {
            a aVar = this.f53824d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f53824d.get(componentName);
            if (aVar != null) {
                aVar.f53828c = InterfaceC6287a.AbstractBinderC1196a.A1(iBinder);
                aVar.f53830e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f53824d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                FS.log_d("NotifManCompat", "Processing component " + aVar.f53826a + ", " + aVar.f53829d.size() + " queued tasks");
            }
            if (aVar.f53829d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f53828c == null) {
                i(aVar);
                return;
            }
            while (true) {
                f fVarPeek = aVar.f53829d.peek();
                if (fVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        FS.log_d("NotifManCompat", "Sending task " + fVarPeek);
                    }
                    fVarPeek.a(aVar.f53828c);
                    aVar.f53829d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        FS.log_d("NotifManCompat", "Remote service has died: " + aVar.f53826a);
                    }
                } catch (RemoteException e10) {
                    FS.log_w("NotifManCompat", "RemoteException communicating with " + aVar.f53826a, e10);
                }
            }
            if (aVar.f53829d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f53823c.hasMessages(3, aVar.f53826a)) {
                return;
            }
            int i10 = aVar.f53830e;
            int i11 = i10 + 1;
            aVar.f53830e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    FS.log_d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f53823c.sendMessageDelayed(this.f53823c.obtainMessage(3, aVar.f53826a), i12);
                return;
            }
            FS.log_w("NotifManCompat", "Giving up on delivering " + aVar.f53829d.size() + " tasks to " + aVar.f53826a + " after " + aVar.f53830e + " retries");
            aVar.f53829d.clear();
        }

        private void j() {
            Set<String> setG = q.g(this.f53821a);
            if (setG.equals(this.f53825e)) {
                return;
            }
            this.f53825e = setG;
            List<ResolveInfo> listQueryIntentServices = this.f53821a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
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
                if (!this.f53824d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        FS.log_d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f53824d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f53824d.entrySet().iterator();
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
            this.f53823c.obtainMessage(0, fVar).sendToTarget();
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
                e(dVar.f53819a, dVar.f53820b);
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
            this.f53821a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f53822b = handlerThread;
            handlerThread.start();
            this.f53823c = new Handler(handlerThread.getLooper(), this);
        }

        private void c(f fVar) {
            j();
            for (a aVar : this.f53824d.values()) {
                aVar.f53829d.add(fVar);
                g(aVar);
            }
        }
    }

    private interface f {
        void a(InterfaceC6287a interfaceC6287a) throws RemoteException;
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
        final ComponentName f53819a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f53820b;

        d(ComponentName componentName, IBinder iBinder) {
            this.f53819a = componentName;
            this.f53820b = iBinder;
        }
    }

    public static q f(Context context) {
        return new q(context);
    }

    private void l(f fVar) {
        synchronized (f53811f) {
            try {
                if (f53812g == null) {
                    f53812g = new e(this.f53813a.getApplicationContext());
                }
                f53812g.h(fVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a() {
        return a.a(this.f53814b);
    }

    public void c(String str, int i10) {
        this.f53814b.cancel(str, i10);
    }

    public void d() {
        this.f53814b.cancelAll();
    }

    public void e(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(this.f53814b, notificationChannel);
        }
    }

    public int h() {
        return a.b(this.f53814b);
    }

    public NotificationChannel i(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return b.b(this.f53814b, str);
        }
        return null;
    }

    private q(Context context) {
        this.f53813a = context;
        this.f53814b = (NotificationManager) context.getSystemService("notification");
    }

    public static Set<String> g(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f53808c) {
            if (string != null) {
                try {
                    if (!string.equals(f53809d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f53810e = hashSet;
                        f53809d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f53810e;
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
            l(new c(this.f53813a.getPackageName(), i10, str, notification));
            this.f53814b.cancel(str, i10);
        } else {
            this.f53814b.notify(str, i10, notification);
        }
    }
}
