package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p2.C16214h0;
import p2.InterfaceC16212g0;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f46127c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC16212g0 f46128d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f46129e;

    /* renamed from: b, reason: collision with root package name */
    private long f46126b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final C16214h0 f46130f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<androidx.core.view.h> f46125a = new ArrayList<>();

    class a extends C16214h0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f46131a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f46132b = 0;

        void d() {
            this.f46132b = 0;
            this.f46131a = false;
            h.this.b();
        }

        a() {
        }

        @Override // p2.InterfaceC16212g0
        public void b(View view) {
            int i10 = this.f46132b + 1;
            this.f46132b = i10;
            if (i10 == h.this.f46125a.size()) {
                InterfaceC16212g0 interfaceC16212g0 = h.this.f46128d;
                if (interfaceC16212g0 != null) {
                    interfaceC16212g0.b(null);
                }
                d();
            }
        }

        @Override // p2.C16214h0, p2.InterfaceC16212g0
        public void c(View view) {
            if (this.f46131a) {
                return;
            }
            this.f46131a = true;
            InterfaceC16212g0 interfaceC16212g0 = h.this.f46128d;
            if (interfaceC16212g0 != null) {
                interfaceC16212g0.c(null);
            }
        }
    }

    void b() {
        this.f46129e = false;
    }

    public void a() {
        if (this.f46129e) {
            Iterator<androidx.core.view.h> it = this.f46125a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f46129e = false;
        }
    }

    public h c(androidx.core.view.h hVar) {
        if (!this.f46129e) {
            this.f46125a.add(hVar);
        }
        return this;
    }

    public h d(androidx.core.view.h hVar, androidx.core.view.h hVar2) {
        this.f46125a.add(hVar);
        hVar2.i(hVar.d());
        this.f46125a.add(hVar2);
        return this;
    }

    public h e(long j10) {
        if (!this.f46129e) {
            this.f46126b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f46129e) {
            this.f46127c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC16212g0 interfaceC16212g0) {
        if (!this.f46129e) {
            this.f46128d = interfaceC16212g0;
        }
        return this;
    }

    public void h() {
        if (this.f46129e) {
            return;
        }
        Iterator<androidx.core.view.h> it = this.f46125a.iterator();
        while (it.hasNext()) {
            androidx.core.view.h next = it.next();
            long j10 = this.f46126b;
            if (j10 >= 0) {
                next.e(j10);
            }
            Interpolator interpolator = this.f46127c;
            if (interpolator != null) {
                next.f(interpolator);
            }
            if (this.f46128d != null) {
                next.g(this.f46130f);
            }
            next.k();
        }
        this.f46129e = true;
    }
}
