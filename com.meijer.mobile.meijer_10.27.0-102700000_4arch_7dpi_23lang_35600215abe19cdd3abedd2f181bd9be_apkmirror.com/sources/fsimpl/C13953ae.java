package fsimpl;

import com.fullstory.FS;
import com.fullstory.util.Log;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: fsimpl.ae, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C13953ae extends AbstractC13951ac {

    /* renamed from: a, reason: collision with root package name */
    private final Set f131571a;

    private C13953ae() {
        this.f131571a = new HashSet();
    }

    private void a(Object obj, aK aKVar, EnumC13955ag enumC13955ag, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        String str3 = String.format(Locale.US, "%d\t%s\t%s\t%s\t%s", Long.valueOf(gd.c(obj)), aKVar, enumC13955ag, str, str2);
        if (a(str3)) {
            Log.logAlways(str3);
            FS.log(FS.LogLevel.INFO, str3);
        }
    }

    private boolean a(String str) {
        return this.f131571a.add(str);
    }

    @Override // fsimpl.AbstractC13951ac
    void a(Object obj, aK aKVar, EnumC13955ag enumC13955ag, dQ dQVar) {
        a(obj, aKVar, enumC13955ag, "match", dQVar.a());
    }

    @Override // fsimpl.AbstractC13951ac
    void a(Object obj, aK aKVar, EnumC13955ag enumC13955ag, Object obj2) {
        a(obj, aKVar, enumC13955ag, "inherited", Long.toString(obj2 != null ? gd.c(obj2) : 0L));
    }

    @Override // fsimpl.AbstractC13951ac
    void a(Object obj, aK aKVar, EnumC13955ag enumC13955ag, String str) {
        a(obj, aKVar, enumC13955ag, str, null);
    }

    @Override // fsimpl.AbstractC13951ac
    void a(Object obj, aK aKVar, C14127y c14127y, dQ dQVar) {
        a(obj, aKVar, AbstractC13951ac.b(c14127y), dQVar);
    }

    @Override // fsimpl.AbstractC13951ac
    void a(Object obj, aK aKVar, C14127y c14127y, Object obj2) {
        a(obj, aKVar, AbstractC13951ac.b(c14127y), obj2);
    }

    @Override // fsimpl.AbstractC13951ac
    void a(Object obj, aK aKVar, C14127y c14127y, String str) {
        a(obj, aKVar, AbstractC13951ac.b(c14127y), str);
    }
}
