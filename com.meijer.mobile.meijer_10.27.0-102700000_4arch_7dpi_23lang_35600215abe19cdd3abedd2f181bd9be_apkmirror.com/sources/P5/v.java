package P5;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final List<r> f24815a;

    public String a(x xVar, A a10) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<r> it = this.f24815a.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().a(xVar, a10));
        }
        return sb2.toString();
    }

    public v(String str, d dVar) {
        this.f24815a = w.b(str, dVar);
    }
}
