package hd;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import Vd.InterfaceC5509c;
import Vd.InterfaceC5511e;
import Vd.InterfaceC5515i;
import Z.n0;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.fullstory.FS;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zd.C18470a;

/* renamed from: hd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14506c {

    /* renamed from: h, reason: collision with root package name */
    private static int f135300h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f135301i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f135302j = new Executor() { // from class: hd.t
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f135303k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f135305b;

    /* renamed from: c, reason: collision with root package name */
    private final r f135306c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f135307d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f135309f;

    /* renamed from: g, reason: collision with root package name */
    private l f135310g;

    /* renamed from: a, reason: collision with root package name */
    private final n0 f135304a = new n0();

    /* renamed from: e, reason: collision with root package name */
    private final Messenger f135308e = new Messenger(new i(this, Looper.getMainLooper()));

    static /* bridge */ /* synthetic */ void g(C14506c c14506c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        c14506c.f135310g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c14506c.f135309f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        FS.log_d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f135303k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            FS.log_d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c14506c.l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    FS.log_w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    FS.log_d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c14506c.f135304a) {
                        for (int i10 = 0; i10 < c14506c.f135304a.getSize(); i10++) {
                            try {
                                c14506c.l((String) c14506c.f135304a.g(i10), intent2.getExtras());
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    FS.log_w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                c14506c.l(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        FS.log_w("Rpc", "Dropping invalid message");
    }

    private static synchronized String j() {
        int i10;
        i10 = f135300h;
        f135300h = i10 + 1;
        return Integer.toString(i10);
    }

    private static synchronized void k(Context context, Intent intent) {
        try {
            if (f135301i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f135301i = PendingIntent.getBroadcast(context, 0, intent2, C18470a.f172704a);
            }
            intent.putExtra("app", f135301i);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f135304a) {
            try {
                C5517k c5517k = (C5517k) this.f135304a.remove(str);
                if (c5517k != null) {
                    c5517k.c(bundle);
                    return;
                }
                FS.log_w("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public AbstractC5516j<C14504a> a() {
        return this.f135306c.a() >= 241100000 ? com.google.android.gms.cloudmessaging.l.b(this.f135305b).d(5, Bundle.EMPTY).j(f135302j, new InterfaceC5509c() { // from class: hd.f
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j) {
                Intent intent = (Intent) ((Bundle) abstractC5516j.n()).getParcelable("notification_data");
                if (intent != null) {
                    return new C14504a(intent);
                }
                return null;
            }
        }) : C5519m.e(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public AbstractC5516j<Void> b(C14504a c14504a) {
        if (this.f135306c.a() < 233700000) {
            return C5519m.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", c14504a.T());
        Integer numB0 = c14504a.b0();
        if (numB0 != null) {
            bundle.putInt("google.product_id", numB0.intValue());
        }
        return com.google.android.gms.cloudmessaging.l.b(this.f135305b).c(3, bundle);
    }

    public AbstractC5516j<Bundle> c(final Bundle bundle) {
        return this.f135306c.a() < 12000000 ? this.f135306c.b() != 0 ? i(bundle).l(f135302j, new InterfaceC5509c() { // from class: hd.u
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j) {
                return this.f135334a.f(bundle, abstractC5516j);
            }
        }) : C5519m.e(new IOException("MISSING_INSTANCEID_SERVICE")) : com.google.android.gms.cloudmessaging.l.b(this.f135305b).d(1, bundle).j(f135302j, new InterfaceC5509c() { // from class: hd.e
            @Override // Vd.InterfaceC5509c
            public final Object then(AbstractC5516j abstractC5516j) throws IOException {
                if (abstractC5516j.r()) {
                    return (Bundle) abstractC5516j.n();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    FS.log_d("Rpc", "Error making request: ".concat(String.valueOf(abstractC5516j.m())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", abstractC5516j.m());
            }
        });
    }

    public AbstractC5516j<Void> d(boolean z10) {
        if (this.f135306c.a() < 241100000) {
            return C5519m.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return com.google.android.gms.cloudmessaging.l.b(this.f135305b).c(4, bundle);
    }

    final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, AbstractC5516j abstractC5516j) {
        synchronized (this.f135304a) {
            this.f135304a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public C14506c(Context context) {
        this.f135305b = context;
        this.f135306c = new r(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f135307d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ AbstractC5516j e(Bundle bundle) throws Exception {
        if (m(bundle)) {
            return C5519m.f(null);
        }
        return C5519m.f(bundle);
    }

    private final AbstractC5516j i(Bundle bundle) throws RemoteException {
        final String strJ = j();
        final C5517k c5517k = new C5517k();
        synchronized (this.f135304a) {
            this.f135304a.put(strJ, c5517k);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f135306c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f135305b, intent);
        intent.putExtra("kid", "|ID|" + strJ + "|");
        if (Log.isLoggable("Rpc", 3)) {
            FS.log_d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f135308e);
        if (this.f135309f != null || this.f135310g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f135309f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f135310g.b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    FS.log_d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.f135306c.b() == 2) {
            this.f135305b.sendBroadcast(intent);
        } else {
            this.f135305b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f135307d.schedule(new Runnable() { // from class: hd.g
            @Override // java.lang.Runnable
            public final void run() {
                if (c5517k.d(new IOException("TIMEOUT"))) {
                    FS.log_w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c5517k.a().d(f135302j, new InterfaceC5511e() { // from class: hd.h
            @Override // Vd.InterfaceC5511e
            public final void onComplete(AbstractC5516j abstractC5516j) {
                this.f135314a.h(strJ, scheduledFutureSchedule, abstractC5516j);
            }
        });
        return c5517k.a();
    }

    final /* synthetic */ AbstractC5516j f(Bundle bundle, AbstractC5516j abstractC5516j) throws Exception {
        if (abstractC5516j.r() && m((Bundle) abstractC5516j.n())) {
            return i(bundle).t(f135302j, new InterfaceC5515i() { // from class: hd.s
                @Override // Vd.InterfaceC5515i
                public final AbstractC5516j then(Object obj) {
                    return C14506c.e((Bundle) obj);
                }
            });
        }
        return abstractC5516j;
    }
}
