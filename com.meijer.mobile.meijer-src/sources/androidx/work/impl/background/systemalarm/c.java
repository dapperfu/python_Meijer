package androidx.work.impl.background.systemalarm;

import O4.AbstractC4373v;
import O4.InterfaceC4354b;
import S4.i;
import W4.p;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
class c {

    /* renamed from: f, reason: collision with root package name */
    private static final String f59373f = AbstractC4373v.i("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f59374a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4354b f59375b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59376c;

    /* renamed from: d, reason: collision with root package name */
    private final g f59377d;

    /* renamed from: e, reason: collision with root package name */
    private final i f59378e;

    void a() {
        List<WorkSpec> listG = this.f59377d.g().u().l().g();
        ConstraintProxy.a(this.f59374a, listG);
        ArrayList<WorkSpec> arrayList = new ArrayList(listG.size());
        long jA = this.f59375b.a();
        for (WorkSpec workSpec : listG) {
            if (jA >= workSpec.c() && (!workSpec.l() || this.f59378e.a(workSpec))) {
                arrayList.add(workSpec);
            }
        }
        for (WorkSpec workSpec2 : arrayList) {
            String str = workSpec2.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String;
            Intent intentB = b.b(this.f59374a, p.a(workSpec2));
            AbstractC4373v.e().a(f59373f, "Creating a delay_met command for workSpec with id (" + str + ")");
            this.f59377d.f().a().execute(new g.b(this.f59377d, intentB, this.f59376c));
        }
    }

    c(Context context, InterfaceC4354b interfaceC4354b, int i10, g gVar) {
        this.f59374a = context;
        this.f59375b = interfaceC4354b;
        this.f59376c = i10;
        this.f59377d = gVar;
        this.f59378e = new i(gVar.g().t());
    }
}
