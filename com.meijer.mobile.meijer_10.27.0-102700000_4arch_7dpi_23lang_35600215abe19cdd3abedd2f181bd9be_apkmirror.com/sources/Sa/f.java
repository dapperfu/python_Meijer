package Sa;

import Ra.A;
import Ra.w;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.WayfinderView;
import com.flipp.sfml.views.SourceImageView;
import com.flipp.sfml.views.ZoomScrollView;
import com.flipp.sfml.views.a;
import com.fullstory.FS;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class f implements Handler.Callback, View.OnLayoutChangeListener, WayfinderView.k, SourceImageView.e, a.c, ZoomScrollView.f {

    /* renamed from: m, reason: collision with root package name */
    private static final String f33495m = "f";

    /* renamed from: g, reason: collision with root package name */
    private Sa.a f33502g;

    /* renamed from: a, reason: collision with root package name */
    private long f33496a = 500;

    /* renamed from: b, reason: collision with root package name */
    private long f33497b = 6000;

    /* renamed from: l, reason: collision with root package name */
    private boolean f33507l = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33503h = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f33505j = false;

    /* renamed from: e, reason: collision with root package name */
    private WeakReference<a> f33500e = new WeakReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    private WeakReference<WayfinderView> f33498c = new WeakReference<>(null);

    /* renamed from: d, reason: collision with root package name */
    private WeakReference<ZoomScrollView> f33499d = new WeakReference<>(null);

    /* renamed from: i, reason: collision with root package name */
    private boolean f33504i = false;

    /* renamed from: k, reason: collision with root package name */
    private Handler f33506k = new Handler(Looper.getMainLooper(), this);

    /* renamed from: f, reason: collision with root package name */
    private RectF f33501f = new RectF();

    public interface a {
        void a(A.a aVar);

        void b(boolean z10, A.a aVar);

        void c();

        void d(List<Ra.b> list);

        void e();
    }

    @Override // com.flipp.sfml.views.ZoomScrollView.f
    public void c() {
    }

    @Override // com.flipp.sfml.views.ZoomScrollView.f
    public void g(float f10) {
    }

    private void h() {
        ZoomScrollView zoomScrollView = this.f33499d.get();
        if (zoomScrollView == null) {
            return;
        }
        zoomScrollView.addOnLayoutChangeListener(this);
    }

    private void i(Sa.a aVar, List<Ra.b> list, RectF rectF, float f10) {
        RectF rectF2 = new RectF(aVar.b(), aVar.f(), aVar.c(), aVar.r());
        if (rectF2.intersect(rectF)) {
            if (!(aVar instanceof d)) {
                if (aVar instanceof b) {
                    Iterator<Sa.a> it = ((b) aVar).d().iterator();
                    while (it.hasNext()) {
                        i(it.next(), list, rectF, f10);
                    }
                    return;
                }
                return;
            }
            d dVar = (d) aVar;
            float fWidth = rectF2.width() * rectF2.height();
            if (fWidth / (dVar.e() * dVar.a()) > 0.5d || fWidth / f10 > 0.5d) {
                list.add(dVar.d());
            }
        }
    }

    private void j() {
        WayfinderView wayfinderView = this.f33498c.get();
        if (wayfinderView == null) {
            return;
        }
        wayfinderView.C(this);
    }

    private void k() {
        if (this.f33504i && this.f33503h) {
            if (this.f33506k.hasMessages(1) && this.f33507l) {
                return;
            }
            this.f33507l = true;
            this.f33506k.sendEmptyMessageDelayed(1, this.f33497b);
        }
    }

    private void l() {
        if (this.f33504i && this.f33503h && !this.f33506k.hasMessages(2)) {
            this.f33506k.sendEmptyMessageDelayed(2, this.f33496a);
        }
    }

    private void m() {
        if (this.f33504i && this.f33503h && !this.f33505j) {
            this.f33505j = true;
            this.f33506k.sendEmptyMessage(3);
        }
    }

    private void n() {
        if (this.f33507l) {
            this.f33506k.removeMessages(1);
        }
    }

    private void o() {
        this.f33506k.removeMessages(2);
    }

    private void p() {
        if (this.f33506k.hasMessages(1) && this.f33507l) {
            this.f33506k.removeMessages(1);
            this.f33507l = false;
            this.f33506k.sendEmptyMessage(1);
        }
    }

    @Override // android.view.WayfinderView.k
    public void a(A.a aVar) {
        this.f33506k.sendMessage(this.f33506k.obtainMessage(5, aVar));
    }

    @Override // android.view.WayfinderView.k
    public void b(boolean z10, A.a aVar) {
        this.f33506k.sendMessage(this.f33506k.obtainMessage(4, z10 ? 1 : 0, 0, aVar));
    }

    @Override // com.flipp.sfml.views.ZoomScrollView.f
    public void e(boolean z10, boolean z11, float f10, float f11, float f12, float f13) {
        this.f33501f.set(f10, f11, f12, f13);
        if (!z10) {
            o();
            return;
        }
        if (z11) {
            p();
        }
        l();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = this.f33500e.get();
        if (aVar == null) {
            return true;
        }
        int i10 = message.what;
        if (i10 == 1) {
            aVar.e();
        } else if (i10 == 2) {
            ArrayList arrayList = new ArrayList();
            if (this.f33502g != null) {
                i(this.f33502g, arrayList, this.f33501f, this.f33501f.width() * this.f33501f.height());
            }
            aVar.d(arrayList);
        } else if (i10 == 3) {
            aVar.c();
        } else if (i10 == 4) {
            aVar.b(message.arg1 == 1, (A.a) message.obj);
        } else if (i10 != 5) {
            FS.log_e(f33495m, "unknown message detected. ignoring it " + message);
        } else {
            aVar.a((A.a) message.obj);
        }
        return true;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (!this.f33503h) {
            this.f33503h = true;
            k();
            m();
        }
        l();
        ZoomScrollView zoomScrollView = this.f33499d.get();
        if (zoomScrollView != null) {
            zoomScrollView.i(this);
            e eVar = (e) Qa.c.c(e.class);
            eVar.v(zoomScrollView, new int[2]);
            this.f33502g = eVar.e(zoomScrollView, r3[0], r3[1]);
        }
    }

    public void r(boolean z10) {
        if (z10 == this.f33504i) {
            return;
        }
        this.f33504i = z10;
        if (z10) {
            k();
            l();
            m();
        } else {
            this.f33505j = false;
            n();
            o();
        }
    }

    @Override // com.flipp.sfml.views.SourceImageView.e
    public void L(View view, w wVar) {
        p();
    }

    @Override // com.flipp.sfml.views.SourceImageView.e
    public void Y0(View view, w wVar) {
        p();
    }

    @Override // com.flipp.sfml.views.a.c
    public void d(com.flipp.sfml.views.a aVar) {
        p();
    }

    @Override // com.flipp.sfml.views.a.c
    public boolean f(com.flipp.sfml.views.a aVar) {
        p();
        return true;
    }

    public void q(ZoomScrollView zoomScrollView) {
        h();
        this.f33503h = false;
        this.f33499d = new WeakReference<>(zoomScrollView);
        if (zoomScrollView != null) {
            zoomScrollView.addOnLayoutChangeListener(this);
        }
    }

    public void s(WayfinderView wayfinderView) {
        j();
        this.f33498c = new WeakReference<>(wayfinderView);
        if (wayfinderView != null) {
            wayfinderView.j(this);
        }
    }
}
