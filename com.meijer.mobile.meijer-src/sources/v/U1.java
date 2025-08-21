package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import v.J1;
import w.C17741b;
import w.C17744e;

/* loaded from: classes.dex */
final class U1 extends J1.c {

    /* renamed from: a, reason: collision with root package name */
    private final List<J1.c> f164922a;

    static class a extends J1.c {

        /* renamed from: a, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f164923a;

        a(CameraCaptureSession.StateCallback stateCallback) {
            this.f164923a = stateCallback;
        }

        @Override // v.J1.c
        void u(J1 j12) {
        }

        @Override // v.J1.c
        public void o(J1 j12) {
            this.f164923a.onActive(j12.l().c());
        }

        @Override // v.J1.c
        public void p(J1 j12) {
            C17744e.a(this.f164923a, j12.l().c());
        }

        @Override // v.J1.c
        public void q(J1 j12) {
            this.f164923a.onClosed(j12.l().c());
        }

        @Override // v.J1.c
        public void r(J1 j12) {
            this.f164923a.onConfigureFailed(j12.l().c());
        }

        @Override // v.J1.c
        public void s(J1 j12) {
            this.f164923a.onConfigured(j12.l().c());
        }

        @Override // v.J1.c
        public void t(J1 j12) {
            this.f164923a.onReady(j12.l().c());
        }

        @Override // v.J1.c
        public void v(J1 j12, Surface surface) {
            C17741b.a(this.f164923a, j12.l().c(), surface);
        }

        a(List<CameraCaptureSession.StateCallback> list) {
            this(M0.a(list));
        }
    }

    static J1.c w(J1.c... cVarArr) {
        return new U1(Arrays.asList(cVarArr));
    }

    @Override // v.J1.c
    public void o(J1 j12) {
        Iterator<J1.c> it = this.f164922a.iterator();
        while (it.hasNext()) {
            it.next().o(j12);
        }
    }

    @Override // v.J1.c
    public void p(J1 j12) {
        Iterator<J1.c> it = this.f164922a.iterator();
        while (it.hasNext()) {
            it.next().p(j12);
        }
    }

    @Override // v.J1.c
    public void q(J1 j12) {
        Iterator<J1.c> it = this.f164922a.iterator();
        while (it.hasNext()) {
            it.next().q(j12);
        }
    }

    @Override // v.J1.c
    public void r(J1 j12) {
        Iterator<J1.c> it = this.f164922a.iterator();
        while (it.hasNext()) {
            it.next().r(j12);
        }
    }

    @Override // v.J1.c
    public void s(J1 j12) {
        Iterator<J1.c> it = this.f164922a.iterator();
        while (it.hasNext()) {
            it.next().s(j12);
        }
    }

    @Override // v.J1.c
    public void t(J1 j12) {
        Iterator<J1.c> it = this.f164922a.iterator();
        while (it.hasNext()) {
            it.next().t(j12);
        }
    }

    @Override // v.J1.c
    void u(J1 j12) {
        Iterator<J1.c> it = this.f164922a.iterator();
        while (it.hasNext()) {
            it.next().u(j12);
        }
    }

    @Override // v.J1.c
    public void v(J1 j12, Surface surface) {
        Iterator<J1.c> it = this.f164922a.iterator();
        while (it.hasNext()) {
            it.next().v(j12, surface);
        }
    }

    U1(List<J1.c> list) {
        ArrayList arrayList = new ArrayList();
        this.f164922a = arrayList;
        arrayList.addAll(list);
    }
}
