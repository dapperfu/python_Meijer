package androidx.work.impl.foreground;

import O4.AbstractC4373v;
import O4.C4362j;
import P4.InterfaceC4571f;
import P4.O;
import S4.b;
import S4.f;
import S4.i;
import S4.j;
import W4.WorkGenerationalId;
import W4.p;
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
import mv.C0;

/* loaded from: classes4.dex */
public class a implements f, InterfaceC4571f {

    /* renamed from: k, reason: collision with root package name */
    static final String f59425k = AbstractC4373v.i("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    private Context f59426a;

    /* renamed from: b, reason: collision with root package name */
    private O f59427b;

    /* renamed from: c, reason: collision with root package name */
    private final Y4.b f59428c;

    /* renamed from: d, reason: collision with root package name */
    final Object f59429d = new Object();

    /* renamed from: e, reason: collision with root package name */
    WorkGenerationalId f59430e;

    /* renamed from: f, reason: collision with root package name */
    final Map<WorkGenerationalId, C4362j> f59431f;

    /* renamed from: g, reason: collision with root package name */
    final Map<WorkGenerationalId, WorkSpec> f59432g;

    /* renamed from: h, reason: collision with root package name */
    final Map<WorkGenerationalId, C0> f59433h;

    /* renamed from: i, reason: collision with root package name */
    final i f59434i;

    /* renamed from: j, reason: collision with root package name */
    private b f59435j;

    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC1173a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f59436a;

        RunnableC1173a(String str) {
            this.f59436a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            WorkSpec workSpecG = a.this.f59427b.r().g(this.f59436a);
            if (workSpecG == null || !workSpecG.l()) {
                return;
            }
            synchronized (a.this.f59429d) {
                a.this.f59432g.put(p.a(workSpecG), workSpecG);
                a aVar = a.this;
                a.this.f59433h.put(p.a(workSpecG), j.c(aVar.f59434i, workSpecG, aVar.f59428c.b(), a.this));
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
        this.f59435j = null;
        synchronized (this.f59429d) {
            try {
                Iterator<C0> it = this.f59433h.values().iterator();
                while (it.hasNext()) {
                    it.next().d(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f59427b.r().m(this);
    }

    public static Intent c(Context context, WorkGenerationalId workGenerationalId, C4362j c4362j) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c4362j.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c4362j.a());
        intent.putExtra("KEY_NOTIFICATION", c4362j.b());
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    public static Intent f(Context context, WorkGenerationalId workGenerationalId, C4362j c4362j) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        intent.putExtra("KEY_NOTIFICATION_ID", c4362j.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c4362j.a());
        intent.putExtra("KEY_NOTIFICATION", c4362j.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void i(Intent intent) {
        if (this.f59435j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC4373v.e().a(f59425k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        C4362j c4362j = new C4362j(intExtra, notification, intExtra2);
        this.f59431f.put(workGenerationalId, c4362j);
        C4362j c4362j2 = this.f59431f.get(this.f59430e);
        if (c4362j2 == null) {
            this.f59430e = workGenerationalId;
        } else {
            this.f59435j.a(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<WorkGenerationalId, C4362j>> it = this.f59431f.entrySet().iterator();
                while (it.hasNext()) {
                    iA |= it.next().getValue().a();
                }
                c4362j = new C4362j(c4362j2.c(), c4362j2.b(), iA);
            } else {
                c4362j = c4362j2;
            }
        }
        this.f59435j.c(c4362j.c(), c4362j.a(), c4362j.b());
    }

    @Override // S4.f
    public void d(WorkSpec workSpec, S4.b bVar) {
        if (bVar instanceof b.ConstraintsNotMet) {
            String str = workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String;
            AbstractC4373v.e().a(f59425k, "Constraints unmet for WorkSpec " + str);
            this.f59427b.z(p.a(workSpec), ((b.ConstraintsNotMet) bVar).getReason());
        }
    }

    @Override // P4.InterfaceC4571f
    public void e(WorkGenerationalId workGenerationalId, boolean z10) {
        Map.Entry<WorkGenerationalId, C4362j> entry;
        synchronized (this.f59429d) {
            try {
                C0 c0Remove = this.f59432g.remove(workGenerationalId) != null ? this.f59433h.remove(workGenerationalId) : null;
                if (c0Remove != null) {
                    c0Remove.d(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C4362j c4362jRemove = this.f59431f.remove(workGenerationalId);
        if (workGenerationalId.equals(this.f59430e)) {
            if (this.f59431f.size() > 0) {
                Iterator<Map.Entry<WorkGenerationalId, C4362j>> it = this.f59431f.entrySet().iterator();
                Map.Entry<WorkGenerationalId, C4362j> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f59430e = entry.getKey();
                if (this.f59435j != null) {
                    C4362j value = entry.getValue();
                    this.f59435j.c(value.c(), value.a(), value.b());
                    this.f59435j.d(value.c());
                }
            } else {
                this.f59430e = null;
            }
        }
        b bVar = this.f59435j;
        if (c4362jRemove == null || bVar == null) {
            return;
        }
        AbstractC4373v.e().a(f59425k, "Removing Notification (id: " + c4362jRemove.c() + ", workSpecId: " + workGenerationalId + ", notificationType: " + c4362jRemove.a());
        bVar.d(c4362jRemove.c());
    }

    void o(b bVar) {
        if (this.f59435j != null) {
            AbstractC4373v.e().c(f59425k, "A callback already exists.");
        } else {
            this.f59435j = bVar;
        }
    }

    a(Context context) {
        this.f59426a = context;
        O oP = O.p(context);
        this.f59427b = oP;
        this.f59428c = oP.v();
        this.f59430e = null;
        this.f59431f = new LinkedHashMap();
        this.f59433h = new HashMap();
        this.f59432g = new HashMap();
        this.f59434i = new i(this.f59427b.t());
        this.f59427b.r().e(this);
    }

    private void h(Intent intent) {
        AbstractC4373v.e().f(f59425k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f59427b.b(UUID.fromString(stringExtra));
        }
    }

    private void j(Intent intent) {
        AbstractC4373v.e().f(f59425k, "Started foreground service " + intent);
        this.f59428c.d(new RunnableC1173a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    void k(Intent intent) {
        AbstractC4373v.e().f(f59425k, "Stopping foreground service");
        b bVar = this.f59435j;
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
        AbstractC4373v.e().f(f59425k, "Foreground service timed out, FGS type: " + i11);
        for (Map.Entry<WorkGenerationalId, C4362j> entry : this.f59431f.entrySet()) {
            if (entry.getValue().a() == i11) {
                this.f59427b.z(entry.getKey(), -128);
            }
        }
        b bVar = this.f59435j;
        if (bVar != null) {
            bVar.stop();
        }
    }
}
