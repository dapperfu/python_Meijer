package Kd;

import Ld.InterfaceC4042b;
import Md.C4175a;
import Md.C4176b;
import Md.C4181g;
import Md.C4182h;
import Md.C4184j;
import Md.C4185k;
import Md.C4186l;
import Md.C4187m;
import Md.C4188n;
import Md.C4189o;
import Md.C4192s;
import Md.C4193t;
import Md.C4194u;
import Md.C4195v;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Kd.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3945c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4042b f16396a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f16397b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f16398c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private C3955m f16399d;

    /* renamed from: Kd.c$a */
    public interface a {
        void onCancel();

        void onFinish();
    }

    /* renamed from: Kd.c$b */
    public interface b {
        View getInfoContents(C4188n c4188n);

        View getInfoWindow(C4188n c4188n);
    }

    /* renamed from: Kd.c$c, reason: collision with other inner class name */
    public interface InterfaceC0283c {
        void onCameraIdle();
    }

    /* renamed from: Kd.c$d */
    public interface d {
        void a();
    }

    /* renamed from: Kd.c$e */
    public interface e {
        void a();
    }

    /* renamed from: Kd.c$f */
    public interface f {
        void a(int i10);
    }

    /* renamed from: Kd.c$g */
    public interface g {
        void onCircleClick(C4181g c4181g);
    }

    /* renamed from: Kd.c$h */
    public interface h {
        void onGroundOverlayClick(C4184j c4184j);
    }

    /* renamed from: Kd.c$i */
    public interface i {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(C4186l c4186l);
    }

    /* renamed from: Kd.c$j */
    public interface j {
        void onInfoWindowClick(C4188n c4188n);
    }

    /* renamed from: Kd.c$k */
    public interface k {
        void a(C4188n c4188n);
    }

    /* renamed from: Kd.c$l */
    public interface l {
        void onInfoWindowLongClick(C4188n c4188n);
    }

    /* renamed from: Kd.c$m */
    public interface m {
        void a(LatLng latLng);
    }

    /* renamed from: Kd.c$n */
    public interface n {
        void onMapLoaded();
    }

    /* renamed from: Kd.c$o */
    public interface o {
        void a(LatLng latLng);
    }

    /* renamed from: Kd.c$p */
    public interface p {
        boolean onMarkerClick(C4188n c4188n);
    }

    /* renamed from: Kd.c$q */
    public interface q {
        void onMarkerDrag(C4188n c4188n);

        void onMarkerDragEnd(C4188n c4188n);

        void onMarkerDragStart(C4188n c4188n);
    }

    /* renamed from: Kd.c$r */
    public interface r {
        boolean a();
    }

    /* renamed from: Kd.c$s */
    public interface s {
        void a(Location location);
    }

    /* renamed from: Kd.c$t */
    public interface t {
        void a(Md.r rVar);
    }

    /* renamed from: Kd.c$u */
    public interface u {
        void onPolygonClick(C4192s c4192s);
    }

    /* renamed from: Kd.c$v */
    public interface v {
        void onPolylineClick(C4194u c4194u);
    }

    /* renamed from: Kd.c$w */
    public interface w {
        void onSnapshotReady(Bitmap bitmap);
    }

    public final void A(d dVar) {
        try {
            if (dVar == null) {
                this.f16396a.z3(null);
            } else {
                this.f16396a.z3(new N(this, dVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void B(e eVar) {
        try {
            if (eVar == null) {
                this.f16396a.A8(null);
            } else {
                this.f16396a.A8(new M(this, eVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void C(f fVar) {
        try {
            if (fVar == null) {
                this.f16396a.F4(null);
            } else {
                this.f16396a.F4(new L(this, fVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void D(g gVar) {
        try {
            if (gVar == null) {
                this.f16396a.J5(null);
            } else {
                this.f16396a.J5(new F(this, gVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void E(h hVar) {
        try {
            if (hVar == null) {
                this.f16396a.A2(null);
            } else {
                this.f16396a.A2(new E(this, hVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void F(i iVar) {
        try {
            if (iVar == null) {
                this.f16396a.V2(null);
            } else {
                this.f16396a.V2(new C(this, iVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void G(j jVar) {
        try {
            if (jVar == null) {
                this.f16396a.w2(null);
            } else {
                this.f16396a.w2(new Kd.v(this, jVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void H(k kVar) {
        try {
            if (kVar == null) {
                this.f16396a.e9(null);
            } else {
                this.f16396a.e9(new x(this, kVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void I(l lVar) {
        try {
            if (lVar == null) {
                this.f16396a.C4(null);
            } else {
                this.f16396a.C4(new Kd.w(this, lVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void J(m mVar) {
        try {
            if (mVar == null) {
                this.f16396a.e7(null);
            } else {
                this.f16396a.e7(new P(this, mVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void K(n nVar) {
        try {
            if (nVar == null) {
                this.f16396a.z9(null);
            } else {
                this.f16396a.z9(new B(this, nVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void L(o oVar) {
        try {
            if (oVar == null) {
                this.f16396a.F1(null);
            } else {
                this.f16396a.F1(new BinderC3957o(this, oVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void M(p pVar) {
        try {
            if (pVar == null) {
                this.f16396a.c4(null);
            } else {
                this.f16396a.c4(new BinderC3956n(this, pVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void N(q qVar) {
        try {
            if (qVar == null) {
                this.f16396a.g4(null);
            } else {
                this.f16396a.g4(new Kd.u(this, qVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void O(r rVar) {
        try {
            if (rVar == null) {
                this.f16396a.t4(null);
            } else {
                this.f16396a.t4(new z(this, rVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void P(s sVar) {
        try {
            if (sVar == null) {
                this.f16396a.w8(null);
            } else {
                this.f16396a.w8(new A(this, sVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void Q(t tVar) {
        try {
            if (tVar == null) {
                this.f16396a.B6(null);
            } else {
                this.f16396a.B6(new J(this, tVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void R(u uVar) {
        try {
            if (uVar == null) {
                this.f16396a.W1(null);
            } else {
                this.f16396a.W1(new G(this, uVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void S(v vVar) {
        try {
            if (vVar == null) {
                this.f16396a.J8(null);
            } else {
                this.f16396a.J8(new H(this, vVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void T(int i10, int i11, int i12, int i13) {
        try {
            this.f16396a.X5(i10, i11, i12, i13);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void U(boolean z10) {
        try {
            this.f16396a.m7(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void V(w wVar, Bitmap bitmap) {
        com.google.android.gms.common.internal.r.m(wVar, "Callback must not be null.");
        try {
            this.f16396a.x8(new I(this, wVar), (com.google.android.gms.dynamic.d) (bitmap != null ? com.google.android.gms.dynamic.d.F2(bitmap) : null));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void W() {
        try {
            this.f16396a.v4();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C4181g a(C4182h c4182h) {
        try {
            com.google.android.gms.common.internal.r.m(c4182h, "CircleOptions must not be null.");
            return new C4181g(this.f16396a.j9(c4182h));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C4184j b(C4185k c4185k) {
        try {
            com.google.android.gms.common.internal.r.m(c4185k, "GroundOverlayOptions must not be null.");
            Bd.B bH3 = this.f16396a.H3(c4185k);
            if (bH3 != null) {
                return new C4184j(bH3);
            }
            return null;
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C4188n c(C4189o c4189o) {
        if (c4189o instanceof C4176b) {
            c4189o.d4(1);
        }
        try {
            com.google.android.gms.common.internal.r.m(c4189o, "MarkerOptions must not be null.");
            Bd.e eVarL2 = this.f16396a.l2(c4189o);
            if (eVarL2 != null) {
                return c4189o.a4() == 1 ? new C4175a(eVarL2) : new C4188n(eVarL2);
            }
            return null;
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C4192s d(C4193t c4193t) {
        try {
            com.google.android.gms.common.internal.r.m(c4193t, "PolygonOptions must not be null");
            return new C4192s(this.f16396a.Z5(c4193t));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C4194u e(C4195v c4195v) {
        try {
            com.google.android.gms.common.internal.r.m(c4195v, "PolylineOptions must not be null");
            return new C4194u(this.f16396a.A3(c4195v));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final Md.F f(Md.G g10) {
        try {
            com.google.android.gms.common.internal.r.m(g10, "TileOverlayOptions must not be null.");
            Bd.n nVarP4 = this.f16396a.P4(g10);
            if (nVarP4 != null) {
                return new Md.F(nVarP4);
            }
            return null;
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void g(C3943a c3943a, int i10, a aVar) {
        try {
            com.google.android.gms.common.internal.r.m(c3943a, "CameraUpdate must not be null.");
            this.f16396a.z8(c3943a.a(), i10, aVar == null ? null : new BinderC3958p(aVar));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void h(C3943a c3943a, a aVar) {
        try {
            com.google.android.gms.common.internal.r.m(c3943a, "CameraUpdate must not be null.");
            this.f16396a.u8(c3943a.a(), aVar == null ? null : new BinderC3958p(aVar));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void i() {
        try {
            this.f16396a.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final CameraPosition j() {
        try {
            return this.f16396a.f2();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C3952j k() {
        try {
            return new C3952j(this.f16396a.f0());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C3955m l() {
        try {
            if (this.f16399d == null) {
                this.f16399d = new C3955m(this.f16396a.X7());
            }
            return this.f16399d;
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void m(C3943a c3943a) {
        try {
            com.google.android.gms.common.internal.r.m(c3943a, "CameraUpdate must not be null.");
            this.f16396a.k6(c3943a.a());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void n(boolean z10) {
        try {
            this.f16396a.n5(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void o(String str) {
        try {
            this.f16396a.a5(str);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final boolean p(boolean z10) {
        try {
            return this.f16396a.C5(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void q(b bVar) {
        try {
            if (bVar == null) {
                this.f16396a.b4(null);
            } else {
                this.f16396a.b4(new y(this, bVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void r(LatLngBounds latLngBounds) {
        try {
            this.f16396a.s1(latLngBounds);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void s(InterfaceC3946d interfaceC3946d) {
        try {
            if (interfaceC3946d == null) {
                this.f16396a.r2(null);
            } else {
                this.f16396a.r2(new K(this, interfaceC3946d));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void t(int i10) {
        try {
            this.f16396a.W3(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean u(C4187m c4187m) {
        try {
            return this.f16396a.s5(c4187m);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void v(int i10) {
        try {
            this.f16396a.g3(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void w(float f10) {
        try {
            this.f16396a.M2(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void x(float f10) {
        try {
            this.f16396a.q7(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void y(boolean z10) {
        try {
            this.f16396a.U8(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void z(InterfaceC0283c interfaceC0283c) {
        try {
            if (interfaceC0283c == null) {
                this.f16396a.R8(null);
            } else {
                this.f16396a.R8(new O(this, interfaceC0283c));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C3945c(InterfaceC4042b interfaceC4042b) {
        this.f16396a = (InterfaceC4042b) com.google.android.gms.common.internal.r.l(interfaceC4042b);
    }
}
