package jb;

import android.content.Context;
import cb.C6380a;
import cb.C6381b;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class b<T> {

    /* renamed from: g, reason: collision with root package name */
    private static final C6380a f139546g = C6381b.a(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final d<T> f139547a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f139548b;

    /* renamed from: c, reason: collision with root package name */
    private long f139549c;

    /* renamed from: d, reason: collision with root package name */
    public int f139550d;

    /* renamed from: e, reason: collision with root package name */
    public int f139551e;

    /* renamed from: f, reason: collision with root package name */
    private Za.e f139552f;

    public b() {
        this(new g());
    }

    private synchronized void d(String str, T t10, long j10) {
        this.f139548b = false;
        this.f139547a.a(str, new C14879a<>(t10, j10, this.f139552f));
        if (e() > this.f139550d + this.f139551e) {
            ArrayList arrayList = new ArrayList(this.f139547a.c());
            Collections.sort(arrayList);
            Iterator it = arrayList.subList(this.f139550d, arrayList.size()).iterator();
            while (it.hasNext()) {
                this.f139547a.b(((C14879a) it.next()).e());
            }
        }
    }

    public final synchronized void f(String str) {
        this.f139547a.b(str);
    }

    private b(d<T> dVar) {
        this(new Za.b(), dVar);
    }

    private int e() {
        return this.f139547a.a();
    }

    public final T a(String str) {
        C14879a<T> c14879aA = this.f139547a.a(str);
        if (c14879aA == null) {
            String.format("Cache miss for key: %s", str);
            return null;
        }
        if (!c14879aA.b()) {
            return c14879aA.l();
        }
        String.format("Cache entry expired for: %s", str);
        f(str);
        return null;
    }

    public final Collection<T> b() {
        Collection<C14879a<T>> collectionC = this.f139547a.c();
        ArrayList arrayList = new ArrayList();
        for (C14879a<T> c14879a : collectionC) {
            if (c14879a.b()) {
                String.format("GetAll: Cache entry expired for: %s", c14879a.e());
                f(c14879a.e());
            } else {
                arrayList.add(c14879a.l());
            }
        }
        return arrayList;
    }

    public final void c(String str, T t10) {
        d(str, t10, this.f139549c);
    }

    public b(Context context, String str, Class<T> cls) {
        this(new Za.b(), new e(context, str, cls));
    }

    private b(Za.e eVar, d<T> dVar) {
        j.a(eVar, "timeProvider");
        this.f139552f = eVar;
        this.f139547a = dVar;
        this.f139549c = Long.MAX_VALUE;
        this.f139550d = HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
        this.f139551e = 100;
        this.f139548b = e() == 0;
    }
}
