package mc;

import eb.C13786c;
import eb.C13787d;
import ec.C13788a;
import fb.C13974a;
import hb.C14495b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kc.C15116a;
import kc.l;

/* renamed from: mc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15704a implements d {

    /* renamed from: e, reason: collision with root package name */
    private static final C13786c f150962e = C13787d.a(C15704a.class.getSimpleName());

    /* renamed from: a, reason: collision with root package name */
    private List<d> f150963a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private ec.e f150964b;

    /* renamed from: c, reason: collision with root package name */
    private C13788a f150965c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f150966d;

    @Override // mc.d
    public final boolean a(C15116a c15116a, String str) {
        List<d> list = this.f150963a;
        if (list != null && !list.isEmpty()) {
            Iterator<d> it = this.f150963a.iterator();
            while (it.hasNext()) {
                if (it.next().a(c15116a, str)) {
                    return true;
                }
            }
        }
        f150962e.g("No resolver strategy resolved sighting [{}] with uuid [{}]", c15116a, str);
        return false;
    }

    public C15704a(l lVar, C13788a c13788a, ec.e eVar, Map<String, String> map) {
        this.f150964b = eVar;
        this.f150965c = c13788a;
        this.f150966d = map;
        ec.d dVarA = ec.d.a();
        this.f150963a.add(new f(this.f150964b));
        this.f150963a.add(new C15706c(lVar));
        this.f150963a.add(new C15705b(lVar, this.f150965c, this.f150966d, dVarA));
        this.f150963a.add(new e(lVar, this.f150965c, this.f150964b, C13974a.c().f131637b, C14495b.a().f135233p, C13974a.c().f131651p, dVarA));
    }
}
