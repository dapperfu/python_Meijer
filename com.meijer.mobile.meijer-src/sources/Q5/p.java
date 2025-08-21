package Q5;

import Q5.o;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class p<T extends o> {

    /* renamed from: b, reason: collision with root package name */
    private final f f27826b;

    /* renamed from: c, reason: collision with root package name */
    private final A f27827c;

    /* renamed from: a, reason: collision with root package name */
    private final Object f27825a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private List<T> f27828d = new ArrayList();

    public List<T> a(x xVar) {
        ArrayList arrayList;
        synchronized (this.f27825a) {
            try {
                c cVar = new c(xVar, this.f27826b, this.f27827c);
                arrayList = new ArrayList();
                for (T t10 : this.f27828d) {
                    if (t10.a().a(cVar).a()) {
                        arrayList.add(t10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public void b(List<T> list) {
        if (list == null) {
            return;
        }
        synchronized (this.f27825a) {
            this.f27828d = new ArrayList(list);
        }
    }

    public p(f fVar, A a10) {
        this.f27826b = fVar;
        this.f27827c = a10;
    }
}
