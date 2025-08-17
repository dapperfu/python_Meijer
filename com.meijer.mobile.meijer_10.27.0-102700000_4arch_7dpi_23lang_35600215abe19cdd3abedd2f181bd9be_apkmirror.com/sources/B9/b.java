package B9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f2090a;

    public b(List<a> list) {
        G9.b.c(list, "ResponseHandlers must not be null!");
        this.f2090a = list;
    }

    public void a(List<a> list) {
        G9.b.c(list, "ResponseHandlers must not be null!");
        this.f2090a.addAll(list);
    }

    public void b(ResponseModel responseModel) {
        Iterator<a> it = this.f2090a.iterator();
        while (it.hasNext()) {
            it.next().b(responseModel);
        }
    }

    public b() {
        this.f2090a = new ArrayList();
    }
}
