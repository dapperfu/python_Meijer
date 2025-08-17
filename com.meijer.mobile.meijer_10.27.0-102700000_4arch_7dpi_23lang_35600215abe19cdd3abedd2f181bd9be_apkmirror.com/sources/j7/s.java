package j7;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class s implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.target.j<?>> f139530a = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f139530a.clear();
    }

    public List<com.bumptech.glide.request.target.j<?>> b() {
        return p7.l.j(this.f139530a);
    }

    public void c(com.bumptech.glide.request.target.j<?> jVar) {
        this.f139530a.add(jVar);
    }

    public void d(com.bumptech.glide.request.target.j<?> jVar) {
        this.f139530a.remove(jVar);
    }

    @Override // j7.l
    public void onDestroy() {
        Iterator it = p7.l.j(this.f139530a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.j) it.next()).onDestroy();
        }
    }

    @Override // j7.l
    public void onStart() {
        Iterator it = p7.l.j(this.f139530a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.j) it.next()).onStart();
        }
    }

    @Override // j7.l
    public void onStop() {
        Iterator it = p7.l.j(this.f139530a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.j) it.next()).onStop();
        }
    }
}
