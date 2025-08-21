package lb;

import android.content.Context;
import bb.C6345b;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import eb.C13784a;
import eb.C13785b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class b<T> {

    /* renamed from: g, reason: collision with root package name */
    private static final C13784a f149560g = C13785b.a(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final d<T> f149561a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f149562b;

    /* renamed from: c, reason: collision with root package name */
    private long f149563c;

    /* renamed from: d, reason: collision with root package name */
    public int f149564d;

    /* renamed from: e, reason: collision with root package name */
    public int f149565e;

    /* renamed from: f, reason: collision with root package name */
    private bb.e f149566f;

    public b() {
        this(new g());
    }

    private synchronized void d(String str, T t10, long j10) {
        this.f149562b = false;
        this.f149561a.a(str, new C15478a<>(t10, j10, this.f149566f));
        if (e() > this.f149564d + this.f149565e) {
            ArrayList arrayList = new ArrayList(this.f149561a.c());
            Collections.sort(arrayList);
            Iterator it = arrayList.subList(this.f149564d, arrayList.size()).iterator();
            while (it.hasNext()) {
                this.f149561a.b(((C15478a) it.next()).e());
            }
        }
    }

    public final synchronized void f(String str) {
        this.f149561a.b(str);
    }

    private b(d<T> dVar) {
        this(new C6345b(), dVar);
    }

    private int e() {
        return this.f149561a.a();
    }

    public final T a(String str) {
        C15478a<T> c15478aA = this.f149561a.a(str);
        if (c15478aA == null) {
            String.format("Cache miss for key: %s", str);
            return null;
        }
        if (!c15478aA.b()) {
            return c15478aA.l();
        }
        String.format("Cache entry expired for: %s", str);
        f(str);
        return null;
    }

    public final Collection<T> b() {
        Collection<C15478a<T>> collectionC = this.f149561a.c();
        ArrayList arrayList = new ArrayList();
        for (C15478a<T> c15478a : collectionC) {
            if (c15478a.b()) {
                String.format("GetAll: Cache entry expired for: %s", c15478a.e());
                f(c15478a.e());
            } else {
                arrayList.add(c15478a.l());
            }
        }
        return arrayList;
    }

    public final void c(String str, T t10) {
        d(str, t10, this.f149563c);
    }

    public b(Context context, String str, Class<T> cls) {
        this(new C6345b(), new e(context, str, cls));
    }

    private b(bb.e eVar, d<T> dVar) {
        j.a(eVar, "timeProvider");
        this.f149566f = eVar;
        this.f149561a = dVar;
        this.f149563c = Long.MAX_VALUE;
        this.f149564d = HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
        this.f149565e = 100;
        this.f149562b = e() == 0;
    }
}
