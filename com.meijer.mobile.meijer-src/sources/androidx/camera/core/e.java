package androidx.camera.core;

import C.I;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class e implements n {

    /* renamed from: b, reason: collision with root package name */
    protected final n f47482b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f47481a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Set<a> f47483c = new HashSet();

    public interface a {
        void a(n nVar);
    }

    @Override // androidx.camera.core.n
    public void R0(Rect rect) {
        this.f47482b.R0(rect);
    }

    @Override // androidx.camera.core.n
    public I S2() {
        return this.f47482b.S2();
    }

    public void a(a aVar) {
        synchronized (this.f47481a) {
            this.f47483c.add(aVar);
        }
    }

    protected void b() {
        HashSet hashSet;
        synchronized (this.f47481a) {
            hashSet = new HashSet(this.f47483c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this);
        }
    }

    @Override // androidx.camera.core.n, java.lang.AutoCloseable
    public void close() {
        this.f47482b.close();
        b();
    }

    @Override // androidx.camera.core.n
    public int getFormat() {
        return this.f47482b.getFormat();
    }

    @Override // androidx.camera.core.n
    public int getHeight() {
        return this.f47482b.getHeight();
    }

    @Override // androidx.camera.core.n
    public n.a[] getPlanes() {
        return this.f47482b.getPlanes();
    }

    @Override // androidx.camera.core.n
    public int getWidth() {
        return this.f47482b.getWidth();
    }

    @Override // androidx.camera.core.n
    public Image m3() {
        return this.f47482b.m3();
    }

    protected e(n nVar) {
        this.f47482b = nVar;
    }
}
