package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p2.C16359h0;
import p2.InterfaceC16357g0;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    private Interpolator f46351c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC16357g0 f46352d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f46353e;

    /* renamed from: b, reason: collision with root package name */
    private long f46350b = -1;

    /* renamed from: f, reason: collision with root package name */
    private final C16359h0 f46354f = new a();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList<androidx.core.view.h> f46349a = new ArrayList<>();

    class a extends C16359h0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f46355a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f46356b = 0;

        void d() {
            this.f46356b = 0;
            this.f46355a = false;
            h.this.b();
        }

        a() {
        }

        @Override // p2.InterfaceC16357g0
        public void b(View view) {
            int i10 = this.f46356b + 1;
            this.f46356b = i10;
            if (i10 == h.this.f46349a.size()) {
                InterfaceC16357g0 interfaceC16357g0 = h.this.f46352d;
                if (interfaceC16357g0 != null) {
                    interfaceC16357g0.b(null);
                }
                d();
            }
        }

        @Override // p2.C16359h0, p2.InterfaceC16357g0
        public void c(View view) {
            if (this.f46355a) {
                return;
            }
            this.f46355a = true;
            InterfaceC16357g0 interfaceC16357g0 = h.this.f46352d;
            if (interfaceC16357g0 != null) {
                interfaceC16357g0.c(null);
            }
        }
    }

    void b() {
        this.f46353e = false;
    }

    public void a() {
        if (this.f46353e) {
            Iterator<androidx.core.view.h> it = this.f46349a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f46353e = false;
        }
    }

    public h c(androidx.core.view.h hVar) {
        if (!this.f46353e) {
            this.f46349a.add(hVar);
        }
        return this;
    }

    public h d(androidx.core.view.h hVar, androidx.core.view.h hVar2) {
        this.f46349a.add(hVar);
        hVar2.i(hVar.d());
        this.f46349a.add(hVar2);
        return this;
    }

    public h e(long j10) {
        if (!this.f46353e) {
            this.f46350b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f46353e) {
            this.f46351c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC16357g0 interfaceC16357g0) {
        if (!this.f46353e) {
            this.f46352d = interfaceC16357g0;
        }
        return this;
    }

    public void h() {
        if (this.f46353e) {
            return;
        }
        Iterator<androidx.core.view.h> it = this.f46349a.iterator();
        while (it.hasNext()) {
            androidx.core.view.h next = it.next();
            long j10 = this.f46350b;
            if (j10 >= 0) {
                next.e(j10);
            }
            Interpolator interpolator = this.f46351c;
            if (interpolator != null) {
                next.f(interpolator);
            }
            if (this.f46352d != null) {
                next.g(this.f46354f);
            }
            next.k();
        }
        this.f46353e = true;
    }
}
