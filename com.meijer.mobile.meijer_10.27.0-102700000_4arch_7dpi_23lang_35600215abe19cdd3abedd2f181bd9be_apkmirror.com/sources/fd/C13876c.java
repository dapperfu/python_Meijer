package fd;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import Td.InterfaceC5225c;
import Td.InterfaceC5227e;
import Td.InterfaceC5231i;
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
import xd.C18033a;

/* renamed from: fd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13876c {

    /* renamed from: h, reason: collision with root package name */
    private static int f130954h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f130955i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f130956j = new Executor() { // from class: fd.t
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f130957k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f130959b;

    /* renamed from: c, reason: collision with root package name */
    private final r f130960c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f130961d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f130963f;

    /* renamed from: g, reason: collision with root package name */
    private l f130964g;

    /* renamed from: a, reason: collision with root package name */
    private final n0 f130958a = new n0();

    /* renamed from: e, reason: collision with root package name */
    private final Messenger f130962e = new Messenger(new i(this, Looper.getMainLooper()));

    static /* bridge */ /* synthetic */ void g(C13876c c13876c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        c13876c.f130964g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c13876c.f130963f = (Messenger) parcelableExtra;
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
                    Matcher matcher = f130957k.matcher(stringExtra);
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
                        c13876c.l(strGroup, extras);
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
                    synchronized (c13876c.f130958a) {
                        for (int i10 = 0; i10 < c13876c.f130958a.getSize(); i10++) {
                            try {
                                c13876c.l((String) c13876c.f130958a.g(i10), intent2.getExtras());
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
                c13876c.l(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        FS.log_w("Rpc", "Dropping invalid message");
    }

    private static synchronized String j() {
        int i10;
        i10 = f130954h;
        f130954h = i10 + 1;
        return Integer.toString(i10);
    }

    private static synchronized void k(Context context, Intent intent) {
        try {
            if (f130955i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f130955i = PendingIntent.getBroadcast(context, 0, intent2, C18033a.f169555a);
            }
            intent.putExtra("app", f130955i);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f130958a) {
            try {
                C5233k c5233k = (C5233k) this.f130958a.remove(str);
                if (c5233k != null) {
                    c5233k.c(bundle);
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

    public AbstractC5232j<C13874a> a() {
        return this.f130960c.a() >= 241100000 ? com.google.android.gms.cloudmessaging.l.b(this.f130959b).d(5, Bundle.EMPTY).j(f130956j, new InterfaceC5225c() { // from class: fd.f
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                Intent intent = (Intent) ((Bundle) abstractC5232j.n()).getParcelable("notification_data");
                if (intent != null) {
                    return new C13874a(intent);
                }
                return null;
            }
        }) : C5235m.e(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public AbstractC5232j<Void> b(C13874a c13874a) {
        if (this.f130960c.a() < 233700000) {
            return C5235m.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", c13874a.T());
        Integer numC0 = c13874a.c0();
        if (numC0 != null) {
            bundle.putInt("google.product_id", numC0.intValue());
        }
        return com.google.android.gms.cloudmessaging.l.b(this.f130959b).c(3, bundle);
    }

    public AbstractC5232j<Bundle> c(final Bundle bundle) {
        return this.f130960c.a() < 12000000 ? this.f130960c.b() != 0 ? i(bundle).l(f130956j, new InterfaceC5225c() { // from class: fd.u
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) {
                return this.f130988a.f(bundle, abstractC5232j);
            }
        }) : C5235m.e(new IOException("MISSING_INSTANCEID_SERVICE")) : com.google.android.gms.cloudmessaging.l.b(this.f130959b).d(1, bundle).j(f130956j, new InterfaceC5225c() { // from class: fd.e
            @Override // Td.InterfaceC5225c
            public final Object then(AbstractC5232j abstractC5232j) throws IOException {
                if (abstractC5232j.r()) {
                    return (Bundle) abstractC5232j.n();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    FS.log_d("Rpc", "Error making request: ".concat(String.valueOf(abstractC5232j.m())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", abstractC5232j.m());
            }
        });
    }

    public AbstractC5232j<Void> d(boolean z10) {
        if (this.f130960c.a() < 241100000) {
            return C5235m.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return com.google.android.gms.cloudmessaging.l.b(this.f130959b).c(4, bundle);
    }

    final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, AbstractC5232j abstractC5232j) {
        synchronized (this.f130958a) {
            this.f130958a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public C13876c(Context context) {
        this.f130959b = context;
        this.f130960c = new r(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f130961d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ AbstractC5232j e(Bundle bundle) throws Exception {
        if (m(bundle)) {
            return C5235m.f(null);
        }
        return C5235m.f(bundle);
    }

    private final AbstractC5232j i(Bundle bundle) throws RemoteException {
        final String strJ = j();
        final C5233k c5233k = new C5233k();
        synchronized (this.f130958a) {
            this.f130958a.put(strJ, c5233k);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f130960c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f130959b, intent);
        intent.putExtra("kid", "|ID|" + strJ + "|");
        if (Log.isLoggable("Rpc", 3)) {
            FS.log_d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f130962e);
        if (this.f130963f != null || this.f130964g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f130963f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f130964g.b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    FS.log_d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.f130960c.b() == 2) {
            this.f130959b.sendBroadcast(intent);
        } else {
            this.f130959b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f130961d.schedule(new Runnable() { // from class: fd.g
            @Override // java.lang.Runnable
            public final void run() {
                if (c5233k.d(new IOException("TIMEOUT"))) {
                    FS.log_w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c5233k.a().d(f130956j, new InterfaceC5227e() { // from class: fd.h
            @Override // Td.InterfaceC5227e
            public final void onComplete(AbstractC5232j abstractC5232j) {
                this.f130968a.h(strJ, scheduledFutureSchedule, abstractC5232j);
            }
        });
        return c5233k.a();
    }

    final /* synthetic */ AbstractC5232j f(Bundle bundle, AbstractC5232j abstractC5232j) throws Exception {
        if (abstractC5232j.r() && m((Bundle) abstractC5232j.n())) {
            return i(bundle).t(f130956j, new InterfaceC5231i() { // from class: fd.s
                @Override // Td.InterfaceC5231i
                public final AbstractC5232j then(Object obj) {
                    return C13876c.e((Bundle) obj);
                }
            });
        }
        return abstractC5232j;
    }
}
