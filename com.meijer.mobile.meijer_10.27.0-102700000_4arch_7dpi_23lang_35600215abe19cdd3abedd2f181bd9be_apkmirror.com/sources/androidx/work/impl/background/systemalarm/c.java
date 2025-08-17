package androidx.work.impl.background.systemalarm;

import N4.AbstractC4333v;
import N4.InterfaceC4314b;
import R4.i;
import V4.p;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
class c {

    /* renamed from: f, reason: collision with root package name */
    private static final String f59187f = AbstractC4333v.i("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f59188a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4314b f59189b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59190c;

    /* renamed from: d, reason: collision with root package name */
    private final g f59191d;

    /* renamed from: e, reason: collision with root package name */
    private final i f59192e;

    void a() {
        List<WorkSpec> listH = this.f59191d.g().u().l().h();
        ConstraintProxy.a(this.f59188a, listH);
        ArrayList<WorkSpec> arrayList = new ArrayList(listH.size());
        long jA = this.f59189b.a();
        for (WorkSpec workSpec : listH) {
            if (jA >= workSpec.c() && (!workSpec.l() || this.f59192e.a(workSpec))) {
                arrayList.add(workSpec);
            }
        }
        for (WorkSpec workSpec2 : arrayList) {
            String str = workSpec2.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String;
            Intent intentC = b.c(this.f59188a, p.a(workSpec2));
            AbstractC4333v.e().a(f59187f, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f59191d.f().a().execute(new g.b(this.f59191d, intentC, this.f59190c));
        }
    }

    c(Context context, InterfaceC4314b interfaceC4314b, int i10, g gVar) {
        this.f59188a = context;
        this.f59189b = interfaceC4314b;
        this.f59190c = i10;
        this.f59191d = gVar;
        this.f59192e = new i(gVar.g().t());
    }
}
