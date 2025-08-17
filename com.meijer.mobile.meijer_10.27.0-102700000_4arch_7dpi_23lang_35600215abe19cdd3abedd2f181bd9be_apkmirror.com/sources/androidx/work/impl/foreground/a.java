package androidx.work.impl.foreground;

import N4.AbstractC4333v;
import N4.C4322j;
import O4.InterfaceC4445f;
import O4.O;
import R4.b;
import R4.f;
import R4.i;
import R4.j;
import V4.WorkGenerationalId;
import V4.p;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import qv.C0;

/* loaded from: classes4.dex */
public class a implements f, InterfaceC4445f {

    /* renamed from: k, reason: collision with root package name */
    static final String f59239k = AbstractC4333v.i("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    private Context f59240a;

    /* renamed from: b, reason: collision with root package name */
    private O f59241b;

    /* renamed from: c, reason: collision with root package name */
    private final X4.b f59242c;

    /* renamed from: d, reason: collision with root package name */
    final Object f59243d = new Object();

    /* renamed from: e, reason: collision with root package name */
    WorkGenerationalId f59244e;

    /* renamed from: f, reason: collision with root package name */
    final Map<WorkGenerationalId, C4322j> f59245f;

    /* renamed from: g, reason: collision with root package name */
    final Map<WorkGenerationalId, WorkSpec> f59246g;

    /* renamed from: h, reason: collision with root package name */
    final Map<WorkGenerationalId, C0> f59247h;

    /* renamed from: i, reason: collision with root package name */
    final i f59248i;

    /* renamed from: j, reason: collision with root package name */
    private b f59249j;

    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC1163a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59250a;

        RunnableC1163a(String str) {
            this.f59250a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WorkSpec workSpecG = a.this.f59241b.r().g(this.f59250a);
            if (workSpecG == null || !workSpecG.l()) {
                return;
            }
            synchronized (a.this.f59243d) {
                a.this.f59246g.put(p.a(workSpecG), workSpecG);
                a aVar = a.this;
                a.this.f59247h.put(p.a(workSpecG), j.c(aVar.f59248i, workSpecG, aVar.f59242c.b(), a.this));
            }
        }
    }

    interface b {
        void a(int i10, Notification notification);

        void c(int i10, int i11, Notification notification);

        void d(int i10);

        void stop();
    }

    void l() {
        this.f59249j = null;
        synchronized (this.f59243d) {
            try {
                Iterator<C0> it = this.f59247h.values().iterator();
                while (it.hasNext()) {
                    it.next().d(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f59241b.r().m(this);
    }

    public static Intent d(Context context, WorkGenerationalId workGenerationalId, C4322j c4322j) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c4322j.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c4322j.a());
        intent.putExtra("KEY_NOTIFICATION", c4322j.b());
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    public static Intent f(Context context, WorkGenerationalId workGenerationalId, C4322j c4322j) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        intent.putExtra("KEY_NOTIFICATION_ID", c4322j.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c4322j.a());
        intent.putExtra("KEY_NOTIFICATION", c4322j.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void i(Intent intent) {
        if (this.f59249j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC4333v.e().a(f59239k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        C4322j c4322j = new C4322j(intExtra, notification, intExtra2);
        this.f59245f.put(workGenerationalId, c4322j);
        C4322j c4322j2 = this.f59245f.get(this.f59244e);
        if (c4322j2 == null) {
            this.f59244e = workGenerationalId;
        } else {
            this.f59249j.a(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<WorkGenerationalId, C4322j>> it = this.f59245f.entrySet().iterator();
                while (it.hasNext()) {
                    iA |= it.next().getValue().a();
                }
                c4322j = new C4322j(c4322j2.c(), c4322j2.b(), iA);
            } else {
                c4322j = c4322j2;
            }
        }
        this.f59249j.c(c4322j.c(), c4322j.a(), c4322j.b());
    }

    @Override // O4.InterfaceC4445f
    public void b(WorkGenerationalId workGenerationalId, boolean z10) {
        Map.Entry<WorkGenerationalId, C4322j> entry;
        synchronized (this.f59243d) {
            try {
                C0 c0Remove = this.f59246g.remove(workGenerationalId) != null ? this.f59247h.remove(workGenerationalId) : null;
                if (c0Remove != null) {
                    c0Remove.d(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C4322j c4322jRemove = this.f59245f.remove(workGenerationalId);
        if (workGenerationalId.equals(this.f59244e)) {
            if (this.f59245f.size() > 0) {
                Iterator<Map.Entry<WorkGenerationalId, C4322j>> it = this.f59245f.entrySet().iterator();
                Map.Entry<WorkGenerationalId, C4322j> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f59244e = entry.getKey();
                if (this.f59249j != null) {
                    C4322j value = entry.getValue();
                    this.f59249j.c(value.c(), value.a(), value.b());
                    this.f59249j.d(value.c());
                }
            } else {
                this.f59244e = null;
            }
        }
        b bVar = this.f59249j;
        if (c4322jRemove == null || bVar == null) {
            return;
        }
        AbstractC4333v.e().a(f59239k, "Removing Notification (id: " + c4322jRemove.c() + ", workSpecId: " + workGenerationalId + ", notificationType: " + c4322jRemove.a());
        bVar.d(c4322jRemove.c());
    }

    @Override // R4.f
    public void e(WorkSpec workSpec, R4.b bVar) {
        if (bVar instanceof b.ConstraintsNotMet) {
            String str = workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String;
            AbstractC4333v.e().a(f59239k, "Constraints unmet for WorkSpec " + str);
            this.f59241b.z(p.a(workSpec), ((b.ConstraintsNotMet) bVar).getReason());
        }
    }

    void o(b bVar) {
        if (this.f59249j != null) {
            AbstractC4333v.e().c(f59239k, "A callback already exists.");
        } else {
            this.f59249j = bVar;
        }
    }

    a(Context context) {
        this.f59240a = context;
        O oP = O.p(context);
        this.f59241b = oP;
        this.f59242c = oP.v();
        this.f59244e = null;
        this.f59245f = new LinkedHashMap();
        this.f59247h = new HashMap();
        this.f59246g = new HashMap();
        this.f59248i = new i(this.f59241b.t());
        this.f59241b.r().e(this);
    }

    private void h(Intent intent) {
        AbstractC4333v.e().f(f59239k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f59241b.b(UUID.fromString(stringExtra));
        }
    }

    private void j(Intent intent) {
        AbstractC4333v.e().f(f59239k, "Started foreground service " + intent);
        this.f59242c.d(new RunnableC1163a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    void k(Intent intent) {
        AbstractC4333v.e().f(f59239k, "Stopping foreground service");
        b bVar = this.f59249j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent);
        }
    }

    void n(int i10, int i11) {
        AbstractC4333v.e().f(f59239k, "Foreground service timed out, FGS type: " + i11);
        for (Map.Entry<WorkGenerationalId, C4322j> entry : this.f59245f.entrySet()) {
            if (entry.getValue().a() == i11) {
                this.f59241b.z(entry.getKey(), -128);
            }
        }
        b bVar = this.f59249j;
        if (bVar != null) {
            bVar.stop();
        }
    }
}
