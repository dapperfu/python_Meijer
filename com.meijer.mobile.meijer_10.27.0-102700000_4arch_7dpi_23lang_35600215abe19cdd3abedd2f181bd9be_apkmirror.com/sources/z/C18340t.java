package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.c;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import q.InterfaceC16423a;
import v.U;
import z.C18340t;

/* renamed from: z.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18340t {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f171394a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.google.common.util.concurrent.q<Void>> f171395b = Collections.synchronizedList(new ArrayList());

    /* renamed from: z.t$a */
    static class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        final com.google.common.util.concurrent.q<Void> f171396a = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: z.s
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return C18340t.a.a(this.f171393a, aVar);
            }
        });

        /* renamed from: b, reason: collision with root package name */
        c.a<Void> f171397b;

        public static /* synthetic */ Object a(a aVar, c.a aVar2) {
            aVar.f171397b = aVar2;
            return "RequestCompleteListener[" + aVar + "]";
        }

        private void b() {
            c.a<Void> aVar = this.f171397b;
            if (aVar != null) {
                aVar.c(null);
                this.f171397b = null;
            }
        }

        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            b();
        }
    }

    public static /* synthetic */ Void b(List list) {
        return null;
    }

    private CameraCaptureSession.CaptureCallback c() {
        final a aVar = new a();
        final com.google.common.util.concurrent.q<Void> qVar = aVar.f171396a;
        this.f171395b.add(qVar);
        FS.log_d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        qVar.addListener(new Runnable() { // from class: z.q
            @Override // java.lang.Runnable
            public final void run() {
                C18340t.a(this.f171390a, aVar, qVar);
            }
        }, H.a.a());
        return aVar;
    }

    public com.google.common.util.concurrent.q<Void> e() {
        return this.f171395b.isEmpty() ? I.n.p(null) : I.n.s(I.n.x(I.n.w(new ArrayList(this.f171395b)), new InterfaceC16423a() { // from class: z.r
            @Override // q.InterfaceC16423a
            public final Object apply(Object obj) {
                return C18340t.b((List) obj);
            }
        }, H.a.a()));
    }

    public boolean f() {
        return this.f171394a;
    }

    public void g() {
        LinkedList linkedList = new LinkedList(this.f171395b);
        while (!linkedList.isEmpty()) {
            com.google.common.util.concurrent.q qVar = (com.google.common.util.concurrent.q) linkedList.poll();
            Objects.requireNonNull(qVar);
            qVar.cancel(true);
        }
    }

    public C18340t(boolean z10) {
        this.f171394a = z10;
    }

    public static /* synthetic */ void a(C18340t c18340t, a aVar, com.google.common.util.concurrent.q qVar) {
        c18340t.getClass();
        FS.log_d("RequestMonitor", "RequestListener " + aVar + " done " + c18340t);
        c18340t.f171395b.remove(qVar);
    }

    public CameraCaptureSession.CaptureCallback d(CameraCaptureSession.CaptureCallback captureCallback) {
        if (f()) {
            return U.b(c(), captureCallback);
        }
        return captureCallback;
    }
}
