package D9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<a> f6035a;

    public b(List<a> list) {
        I9.b.c(list, "ResponseHandlers must not be null!");
        this.f6035a = list;
    }

    public void a(List<a> list) {
        I9.b.c(list, "ResponseHandlers must not be null!");
        this.f6035a.addAll(list);
    }

    public void b(ResponseModel responseModel) {
        Iterator<a> it = this.f6035a.iterator();
        while (it.hasNext()) {
            it.next().b(responseModel);
        }
    }

    public b() {
        this.f6035a = new ArrayList();
    }
}
