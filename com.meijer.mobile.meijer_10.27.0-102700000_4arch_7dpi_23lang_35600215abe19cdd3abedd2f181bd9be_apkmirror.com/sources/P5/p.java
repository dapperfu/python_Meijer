package P5;

import P5.o;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class p<T extends o> {

    /* renamed from: b, reason: collision with root package name */
    private final f f24796b;

    /* renamed from: c, reason: collision with root package name */
    private final A f24797c;

    /* renamed from: a, reason: collision with root package name */
    private final Object f24795a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private List<T> f24798d = new ArrayList();

    public List<T> a(x xVar) {
        ArrayList arrayList;
        synchronized (this.f24795a) {
            try {
                c cVar = new c(xVar, this.f24796b, this.f24797c);
                arrayList = new ArrayList();
                for (T t10 : this.f24798d) {
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
        synchronized (this.f24795a) {
            this.f24798d = new ArrayList(list);
        }
    }

    public p(f fVar, A a10) {
        this.f24796b = fVar;
        this.f24797c = a10;
    }
}
