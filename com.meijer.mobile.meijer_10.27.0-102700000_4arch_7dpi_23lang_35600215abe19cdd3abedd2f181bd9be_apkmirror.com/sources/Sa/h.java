package Sa;

import Sa.c;
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
public class h extends Qa.d {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, b> f33517a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, b> f33518b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Stack<b> f33519c = new Stack<>();

    public interface a {
        void a();

        void b();
    }

    private class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        private String f33520a;

        /* renamed from: c, reason: collision with root package name */
        public Bitmap f33522c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f33523d = new AtomicInteger(0);

        /* renamed from: b, reason: collision with root package name */
        public List<WeakReference<a>> f33521b = new ArrayList();

        public b(String str) {
            this.f33520a = str;
        }

        @Override // Sa.c.a
        public void a() {
            h.this.f33518b.remove(this.f33520a);
            this.f33521b.clear();
            h.this.f33519c.push(this);
        }

        @Override // Sa.c.a
        public void b(Bitmap bitmap) {
            this.f33522c = bitmap;
            h.this.f33517a.put(this.f33520a, this);
            Iterator<WeakReference<a>> it = this.f33521b.iterator();
            while (it.hasNext()) {
                a aVar = it.next().get();
                if (aVar != null) {
                    aVar.a();
                }
            }
            h.this.f33518b.remove(this.f33520a);
        }

        public void d(a aVar) {
            Iterator<WeakReference<a>> it = this.f33521b.iterator();
            while (it.hasNext()) {
                a aVar2 = it.next().get();
                if (aVar2 != null && aVar2.equals(aVar)) {
                    return;
                }
            }
            this.f33521b.add(new WeakReference<>(aVar));
        }

        public void e(String str) {
            this.f33520a = str;
        }

        public boolean f() {
            return !this.f33521b.isEmpty();
        }

        public void g(a aVar) {
            Iterator<WeakReference<a>> it = this.f33521b.iterator();
            while (it.hasNext()) {
                a aVar2 = it.next().get();
                if (aVar2 == null || aVar2.equals(aVar)) {
                    it.remove();
                }
            }
        }

        public String toString() {
            String str = this.f33520a + " -> ";
            Iterator<WeakReference<a>> it = this.f33521b.iterator();
            while (it.hasNext()) {
                str = str + it.next().get() + "\n";
            }
            return str;
        }
    }

    public synchronized void e(String str, a aVar) {
        try {
            b bVar = this.f33517a.get(str);
            if (bVar != null) {
                bVar.g(aVar);
                b(bVar, this.f33517a);
            }
            b bVar2 = this.f33518b.get(str);
            if (bVar2 != null) {
                bVar2.g(aVar);
                b(bVar2, this.f33518b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized Bitmap f(String str, a aVar) {
        b bVar = this.f33517a.get(str);
        if (bVar != null) {
            bVar.d(aVar);
            return bVar.f33522c;
        }
        if (this.f33518b.get(str) != null) {
            this.f33518b.get(str).d(aVar);
            return null;
        }
        b bVarPop = this.f33519c.empty() ? null : this.f33519c.pop();
        if (bVarPop == null) {
            bVarPop = new b(str);
        } else {
            bVarPop.e(str);
        }
        bVarPop.d(aVar);
        this.f33518b.put(str, bVarPop);
        ((c) Qa.c.c(c.class)).b(str, bVarPop);
        return null;
    }

    private void b(b bVar, Map<String, b> map) {
        if (!bVar.f()) {
            bVar.f33523d.incrementAndGet();
            ((c) Qa.c.c(c.class)).a(bVar);
            map.remove(bVar.f33520a);
            this.f33519c.push(bVar);
        }
    }
}
