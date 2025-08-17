package P4;

import N4.AbstractC4333v;
import N4.I;
import N4.InterfaceC4314b;
import O4.InterfaceC4460v;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    static final String f24734e = AbstractC4333v.i("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC4460v f24735a;

    /* renamed from: b, reason: collision with root package name */
    private final I f24736b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4314b f24737c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Runnable> f24738d = new HashMap();

    /* renamed from: P4.a$a, reason: collision with other inner class name */
    class RunnableC0442a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WorkSpec f24739a;

        RunnableC0442a(WorkSpec workSpec) {
            this.f24739a = workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4333v.e().a(a.f24734e, "Scheduling work " + this.f24739a.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
            a.this.f24735a.c(this.f24739a);
        }
    }

    public void a(WorkSpec workSpec, long j10) {
        Runnable runnableRemove = this.f24738d.remove(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
        if (runnableRemove != null) {
            this.f24736b.a(runnableRemove);
        }
        RunnableC0442a runnableC0442a = new RunnableC0442a(workSpec);
        this.f24738d.put(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String, runnableC0442a);
        this.f24736b.b(j10 - this.f24737c.a(), runnableC0442a);
    }

    public void b(String str) {
        Runnable runnableRemove = this.f24738d.remove(str);
        if (runnableRemove != null) {
            this.f24736b.a(runnableRemove);
        }
    }

    public a(InterfaceC4460v interfaceC4460v, I i10, InterfaceC4314b interfaceC4314b) {
        this.f24735a = interfaceC4460v;
        this.f24736b = i10;
        this.f24737c = interfaceC4314b;
    }
}
