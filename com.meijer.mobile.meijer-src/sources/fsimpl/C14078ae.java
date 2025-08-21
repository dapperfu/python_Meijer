package fsimpl;

import com.fullstory.FS;
import com.fullstory.util.Log;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: fsimpl.ae, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14078ae extends AbstractC14076ac {

    /* renamed from: a, reason: collision with root package name */
    private final Set f132821a;

    private C14078ae() {
        this.f132821a = new HashSet();
    }

    private void a(Object obj, aK aKVar, EnumC14080ag enumC14080ag, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        String str3 = String.format(Locale.US, "%d\t%s\t%s\t%s\t%s", Long.valueOf(gd.c(obj)), aKVar, enumC14080ag, str, str2);
        if (a(str3)) {
            Log.logAlways(str3);
            FS.log(FS.LogLevel.INFO, str3);
        }
    }

    private boolean a(String str) {
        return this.f132821a.add(str);
    }

    @Override // fsimpl.AbstractC14076ac
    void a(Object obj, aK aKVar, EnumC14080ag enumC14080ag, dQ dQVar) {
        a(obj, aKVar, enumC14080ag, "match", dQVar.a());
    }

    @Override // fsimpl.AbstractC14076ac
    void a(Object obj, aK aKVar, EnumC14080ag enumC14080ag, Object obj2) {
        a(obj, aKVar, enumC14080ag, "inherited", Long.toString(obj2 != null ? gd.c(obj2) : 0L));
    }

    @Override // fsimpl.AbstractC14076ac
    void a(Object obj, aK aKVar, EnumC14080ag enumC14080ag, String str) {
        a(obj, aKVar, enumC14080ag, str, null);
    }

    @Override // fsimpl.AbstractC14076ac
    void a(Object obj, aK aKVar, C14252y c14252y, dQ dQVar) {
        a(obj, aKVar, AbstractC14076ac.b(c14252y), dQVar);
    }

    @Override // fsimpl.AbstractC14076ac
    void a(Object obj, aK aKVar, C14252y c14252y, Object obj2) {
        a(obj, aKVar, AbstractC14076ac.b(c14252y), obj2);
    }

    @Override // fsimpl.AbstractC14076ac
    void a(Object obj, aK aKVar, C14252y c14252y, String str) {
        a(obj, aKVar, AbstractC14076ac.b(c14252y), str);
    }
}
