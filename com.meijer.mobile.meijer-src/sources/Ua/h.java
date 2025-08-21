package Ua;

import Ua.c;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class h extends Sa.d {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, b> f37393a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, b> f37394b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Stack<b> f37395c = new Stack<>();

    public interface a {
        void a();

        void b();
    }

    private class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private String f37396a;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap f37398c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f37399d = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        public List<WeakReference<a>> f37397b = new ArrayList();

        public b(String str) {
            this.f37396a = str;
        }

        @Override // Ua.c.a
        public void a() {
            h.this.f37394b.remove(this.f37396a);
            this.f37397b.clear();
            h.this.f37395c.push(this);
        }

        @Override // Ua.c.a
        public void b(Bitmap bitmap) {
            this.f37398c = bitmap;
            h.this.f37393a.put(this.f37396a, this);
            Iterator<WeakReference<a>> it = this.f37397b.iterator();
            while (it.hasNext()) {
                a aVar = it.next().get();
                if (aVar != null) {
                    aVar.a();
                }
            }
            h.this.f37394b.remove(this.f37396a);
        }

        public void d(a aVar) {
            Iterator<WeakReference<a>> it = this.f37397b.iterator();
            while (it.hasNext()) {
                a aVar2 = it.next().get();
                if (aVar2 != null && aVar2.equals(aVar)) {
                    return;
                }
            }
            this.f37397b.add(new WeakReference<>(aVar));
        }

        public void e(String str) {
            this.f37396a = str;
        }

        public boolean f() {
            return !this.f37397b.isEmpty();
        }

        public void g(a aVar) {
            Iterator<WeakReference<a>> it = this.f37397b.iterator();
            while (it.hasNext()) {
                a aVar2 = it.next().get();
                if (aVar2 == null || aVar2.equals(aVar)) {
                    it.remove();
                }
            }
        }

        public String toString() {
            String str = this.f37396a + " -> ";
            Iterator<WeakReference<a>> it = this.f37397b.iterator();
            while (it.hasNext()) {
                str = str + it.next().get() + "\n";
            }
            return str;
        }
    }

    public synchronized void e(String str, a aVar) {
        try {
            b bVar = this.f37393a.get(str);
            if (bVar != null) {
                bVar.g(aVar);
                b(bVar, this.f37393a);
            }
            b bVar2 = this.f37394b.get(str);
            if (bVar2 != null) {
                bVar2.g(aVar);
                b(bVar2, this.f37394b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Bitmap f(String str, a aVar) {
        b bVar = this.f37393a.get(str);
        if (bVar != null) {
            bVar.d(aVar);
            return bVar.f37398c;
        }
        if (this.f37394b.get(str) != null) {
            this.f37394b.get(str).d(aVar);
            return null;
        }
        b bVarPop = this.f37395c.empty() ? null : this.f37395c.pop();
        if (bVarPop == null) {
            bVarPop = new b(str);
        } else {
            bVarPop.e(str);
        }
        bVarPop.d(aVar);
        this.f37394b.put(str, bVarPop);
        ((c) Sa.c.c(c.class)).b(str, bVarPop);
        return null;
    }

    private void b(b bVar, Map<String, b> map) {
        if (!bVar.f()) {
            bVar.f37399d.incrementAndGet();
            ((c) Sa.c.c(c.class)).a(bVar);
            map.remove(bVar.f37396a);
            this.f37395c.push(bVar);
        }
    }
}
