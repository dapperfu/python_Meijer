package Md;

import Nd.InterfaceC4174b;
import Od.C4453a;
import Od.C4454b;
import Od.C4459g;
import Od.C4460h;
import Od.C4462j;
import Od.C4463k;
import Od.C4464l;
import Od.C4465m;
import Od.C4466n;
import Od.C4467o;
import Od.C4470s;
import Od.C4471t;
import Od.C4472u;
import Od.C4473v;
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

/* renamed from: Md.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4110c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4174b f19755a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f19756b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Map f19757c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private C4120m f19758d;

    /* renamed from: Md.c$a */
    public interface a {
        void onCancel();

        void onFinish();
    }

    /* renamed from: Md.c$b */
    public interface b {
        View getInfoContents(C4466n c4466n);

        View getInfoWindow(C4466n c4466n);
    }

    /* renamed from: Md.c$c, reason: collision with other inner class name */
    public interface InterfaceC0346c {
        void onCameraIdle();
    }

    /* renamed from: Md.c$d */
    public interface d {
        void a();
    }

    /* renamed from: Md.c$e */
    public interface e {
        void a();
    }

    /* renamed from: Md.c$f */
    public interface f {
        void a(int i10);
    }

    /* renamed from: Md.c$g */
    public interface g {
        void onCircleClick(C4459g c4459g);
    }

    /* renamed from: Md.c$h */
    public interface h {
        void onGroundOverlayClick(C4462j c4462j);
    }

    /* renamed from: Md.c$i */
    public interface i {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(C4464l c4464l);
    }

    /* renamed from: Md.c$j */
    public interface j {
        void onInfoWindowClick(C4466n c4466n);
    }

    /* renamed from: Md.c$k */
    public interface k {
        void a(C4466n c4466n);
    }

    /* renamed from: Md.c$l */
    public interface l {
        void onInfoWindowLongClick(C4466n c4466n);
    }

    /* renamed from: Md.c$m */
    public interface m {
        void a(LatLng latLng);
    }

    /* renamed from: Md.c$n */
    public interface n {
        void onMapLoaded();
    }

    /* renamed from: Md.c$o */
    public interface o {
        void a(LatLng latLng);
    }

    /* renamed from: Md.c$p */
    public interface p {
        boolean onMarkerClick(C4466n c4466n);
    }

    /* renamed from: Md.c$q */
    public interface q {
        void onMarkerDrag(C4466n c4466n);

        void onMarkerDragEnd(C4466n c4466n);

        void onMarkerDragStart(C4466n c4466n);
    }

    /* renamed from: Md.c$r */
    public interface r {
        boolean a();
    }

    /* renamed from: Md.c$s */
    public interface s {
        void a(Location location);
    }

    /* renamed from: Md.c$t */
    public interface t {
        void a(Od.r rVar);
    }

    /* renamed from: Md.c$u */
    public interface u {
        void onPolygonClick(C4470s c4470s);
    }

    /* renamed from: Md.c$v */
    public interface v {
        void onPolylineClick(C4472u c4472u);
    }

    /* renamed from: Md.c$w */
    public interface w {
        void onSnapshotReady(Bitmap bitmap);
    }

    public final void A(d dVar) {
        try {
            if (dVar == null) {
                this.f19755a.f9(null);
            } else {
                this.f19755a.f9(new N(this, dVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void B(e eVar) {
        try {
            if (eVar == null) {
                this.f19755a.H3(null);
            } else {
                this.f19755a.H3(new M(this, eVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void C(f fVar) {
        try {
            if (fVar == null) {
                this.f19755a.b2(null);
            } else {
                this.f19755a.b2(new L(this, fVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void D(g gVar) {
        try {
            if (gVar == null) {
                this.f19755a.Y8(null);
            } else {
                this.f19755a.Y8(new F(this, gVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void E(h hVar) {
        try {
            if (hVar == null) {
                this.f19755a.A3(null);
            } else {
                this.f19755a.A3(new E(this, hVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void F(i iVar) {
        try {
            if (iVar == null) {
                this.f19755a.j4(null);
            } else {
                this.f19755a.j4(new C(this, iVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void G(j jVar) {
        try {
            if (jVar == null) {
                this.f19755a.N4(null);
            } else {
                this.f19755a.N4(new Md.v(this, jVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void H(k kVar) {
        try {
            if (kVar == null) {
                this.f19755a.H8(null);
            } else {
                this.f19755a.H8(new x(this, kVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void I(l lVar) {
        try {
            if (lVar == null) {
                this.f19755a.b5(null);
            } else {
                this.f19755a.b5(new Md.w(this, lVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void J(m mVar) {
        try {
            if (mVar == null) {
                this.f19755a.b6(null);
            } else {
                this.f19755a.b6(new P(this, mVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void K(n nVar) {
        try {
            if (nVar == null) {
                this.f19755a.D8(null);
            } else {
                this.f19755a.D8(new B(this, nVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void L(o oVar) {
        try {
            if (oVar == null) {
                this.f19755a.D2(null);
            } else {
                this.f19755a.D2(new BinderC4122o(this, oVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void M(p pVar) {
        try {
            if (pVar == null) {
                this.f19755a.l3(null);
            } else {
                this.f19755a.l3(new BinderC4121n(this, pVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void N(q qVar) {
        try {
            if (qVar == null) {
                this.f19755a.a3(null);
            } else {
                this.f19755a.a3(new Md.u(this, qVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void O(r rVar) {
        try {
            if (rVar == null) {
                this.f19755a.d7(null);
            } else {
                this.f19755a.d7(new z(this, rVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void P(s sVar) {
        try {
            if (sVar == null) {
                this.f19755a.k9(null);
            } else {
                this.f19755a.k9(new A(this, sVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void Q(t tVar) {
        try {
            if (tVar == null) {
                this.f19755a.w5(null);
            } else {
                this.f19755a.w5(new J(this, tVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void R(u uVar) {
        try {
            if (uVar == null) {
                this.f19755a.S2(null);
            } else {
                this.f19755a.S2(new G(this, uVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void S(v vVar) {
        try {
            if (vVar == null) {
                this.f19755a.y1(null);
            } else {
                this.f19755a.y1(new H(this, vVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void T(int i10, int i11, int i12, int i13) {
        try {
            this.f19755a.n6(i10, i11, i12, i13);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void U(boolean z10) {
        try {
            this.f19755a.t7(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void V(w wVar, Bitmap bitmap) {
        com.google.android.gms.common.internal.r.m(wVar, "Callback must not be null.");
        try {
            this.f19755a.y3(new I(this, wVar), (com.google.android.gms.dynamic.d) (bitmap != null ? com.google.android.gms.dynamic.d.I2(bitmap) : null));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void W() {
        try {
            this.f19755a.I4();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C4459g a(C4460h c4460h) {
        try {
            com.google.android.gms.common.internal.r.m(c4460h, "CircleOptions must not be null.");
            return new C4459g(this.f19755a.b8(c4460h));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C4462j b(C4463k c4463k) {
        try {
            com.google.android.gms.common.internal.r.m(c4463k, "GroundOverlayOptions must not be null.");
            Dd.B bV0 = this.f19755a.V0(c4463k);
            if (bV0 != null) {
                return new C4462j(bV0);
            }
            return null;
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C4466n c(C4467o c4467o) {
        if (c4467o instanceof C4454b) {
            c4467o.d4(1);
        }
        try {
            com.google.android.gms.common.internal.r.m(c4467o, "MarkerOptions must not be null.");
            Dd.e eVarT8 = this.f19755a.T8(c4467o);
            if (eVarT8 != null) {
                return c4467o.a4() == 1 ? new C4453a(eVarT8) : new C4466n(eVarT8);
            }
            return null;
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C4470s d(C4471t c4471t) {
        try {
            com.google.android.gms.common.internal.r.m(c4471t, "PolygonOptions must not be null");
            return new C4470s(this.f19755a.T0(c4471t));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C4472u e(C4473v c4473v) {
        try {
            com.google.android.gms.common.internal.r.m(c4473v, "PolylineOptions must not be null");
            return new C4472u(this.f19755a.w3(c4473v));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final Od.F f(Od.G g10) {
        try {
            com.google.android.gms.common.internal.r.m(g10, "TileOverlayOptions must not be null.");
            Dd.n nVarZ4 = this.f19755a.z4(g10);
            if (nVarZ4 != null) {
                return new Od.F(nVarZ4);
            }
            return null;
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void g(C4108a c4108a, int i10, a aVar) {
        try {
            com.google.android.gms.common.internal.r.m(c4108a, "CameraUpdate must not be null.");
            this.f19755a.H5(c4108a.a(), i10, aVar == null ? null : new BinderC4123p(aVar));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void h(C4108a c4108a, a aVar) {
        try {
            com.google.android.gms.common.internal.r.m(c4108a, "CameraUpdate must not be null.");
            this.f19755a.g7(c4108a.a(), aVar == null ? null : new BinderC4123p(aVar));
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void i() {
        try {
            this.f19755a.clear();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final CameraPosition j() {
        try {
            return this.f19755a.h2();
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C4117j k() {
        try {
            return new C4117j(this.f19755a.h0());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final C4120m l() {
        try {
            if (this.f19758d == null) {
                this.f19758d = new C4120m(this.f19755a.U7());
            }
            return this.f19758d;
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void m(C4108a c4108a) {
        try {
            com.google.android.gms.common.internal.r.m(c4108a, "CameraUpdate must not be null.");
            this.f19755a.y6(c4108a.a());
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void n(boolean z10) {
        try {
            this.f19755a.t5(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void o(String str) {
        try {
            this.f19755a.m5(str);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final boolean p(boolean z10) {
        try {
            return this.f19755a.M5(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void q(b bVar) {
        try {
            if (bVar == null) {
                this.f19755a.Z8(null);
            } else {
                this.f19755a.Z8(new y(this, bVar));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void r(LatLngBounds latLngBounds) {
        try {
            this.f19755a.B1(latLngBounds);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void s(InterfaceC4111d interfaceC4111d) {
        try {
            if (interfaceC4111d == null) {
                this.f19755a.A4(null);
            } else {
                this.f19755a.A4(new K(this, interfaceC4111d));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void t(int i10) {
        try {
            this.f19755a.l4(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public boolean u(C4465m c4465m) {
        try {
            return this.f19755a.D1(c4465m);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void v(int i10) {
        try {
            this.f19755a.n3(i10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void w(float f10) {
        try {
            this.f19755a.R2(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public void x(float f10) {
        try {
            this.f19755a.w7(f10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void y(boolean z10) {
        try {
            this.f19755a.S8(z10);
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public final void z(InterfaceC0346c interfaceC0346c) {
        try {
            if (interfaceC0346c == null) {
                this.f19755a.S3(null);
            } else {
                this.f19755a.S3(new O(this, interfaceC0346c));
            }
        } catch (RemoteException e10) {
            throw new RuntimeRemoteException(e10);
        }
    }

    public C4110c(InterfaceC4174b interfaceC4174b) {
        this.f19755a = (InterfaceC4174b) com.google.android.gms.common.internal.r.l(interfaceC4174b);
    }
}
