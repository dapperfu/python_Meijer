package Q4;

import O4.AbstractC4373v;
import O4.I;
import O4.InterfaceC4354b;
import P4.InterfaceC4586v;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    static final String f27764e = AbstractC4373v.i("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC4586v f27765a;

    /* renamed from: b, reason: collision with root package name */
    private final I f27766b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4354b f27767c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, Runnable> f27768d = new HashMap();

    /* renamed from: Q4.a$a, reason: collision with other inner class name */
    class RunnableC0506a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WorkSpec f27769a;

        RunnableC0506a(WorkSpec workSpec) {
            this.f27769a = workSpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4373v.e().a(a.f27764e, "Scheduling work " + this.f27769a.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
            a.this.f27765a.b(this.f27769a);
        }
    }

    public void a(WorkSpec workSpec, long j10) {
        Runnable runnableRemove = this.f27768d.remove(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
        if (runnableRemove != null) {
            this.f27766b.a(runnableRemove);
        }
        RunnableC0506a runnableC0506a = new RunnableC0506a(workSpec);
        this.f27768d.put(workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String, runnableC0506a);
        this.f27766b.b(j10 - this.f27767c.a(), runnableC0506a);
    }

    public void b(String str) {
        Runnable runnableRemove = this.f27768d.remove(str);
        if (runnableRemove != null) {
            this.f27766b.a(runnableRemove);
        }
    }

    public a(InterfaceC4586v interfaceC4586v, I i10, InterfaceC4354b interfaceC4354b) {
        this.f27765a = interfaceC4586v;
        this.f27766b = i10;
        this.f27767c = interfaceC4354b;
    }
}
