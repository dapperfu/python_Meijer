package l7;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class s implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Set<com.bumptech.glide.request.target.j<?>> f149546a = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f149546a.clear();
    }

    public List<com.bumptech.glide.request.target.j<?>> b() {
        return r7.l.j(this.f149546a);
    }

    public void c(com.bumptech.glide.request.target.j<?> jVar) {
        this.f149546a.add(jVar);
    }

    public void d(com.bumptech.glide.request.target.j<?> jVar) {
        this.f149546a.remove(jVar);
    }

    @Override // l7.l
    public void onDestroy() {
        Iterator it = r7.l.j(this.f149546a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.j) it.next()).onDestroy();
        }
    }

    @Override // l7.l
    public void onStart() {
        Iterator it = r7.l.j(this.f149546a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.j) it.next()).onStart();
        }
    }

    @Override // l7.l
    public void onStop() {
        Iterator it = r7.l.j(this.f149546a).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.request.target.j) it.next()).onStop();
        }
    }
}
