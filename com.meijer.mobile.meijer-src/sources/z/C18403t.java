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
import q.InterfaceC16578a;
import v.U;
import z.C18403t;

/* renamed from: z.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18403t {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f172190a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.google.common.util.concurrent.q<Void>> f172191b = Collections.synchronizedList(new ArrayList());

    /* renamed from: z.t$a */
    static class a extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        final com.google.common.util.concurrent.q<Void> f172192a = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: z.s
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return C18403t.a.a(this.f172189a, aVar);
            }
        });

        /* renamed from: b, reason: collision with root package name */
        c.a<Void> f172193b;

        public static /* synthetic */ Object a(a aVar, c.a aVar2) {
            aVar.f172193b = aVar2;
            return "RequestCompleteListener[" + aVar + "]";
        }

        private void b() {
            c.a<Void> aVar = this.f172193b;
            if (aVar != null) {
                aVar.c(null);
                this.f172193b = null;
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
        final com.google.common.util.concurrent.q<Void> qVar = aVar.f172192a;
        this.f172191b.add(qVar);
        FS.log_d("RequestMonitor", "RequestListener " + aVar + " monitoring " + this);
        qVar.addListener(new Runnable() { // from class: z.q
            @Override // java.lang.Runnable
            public final void run() {
                C18403t.a(this.f172186a, aVar, qVar);
            }
        }, H.a.a());
        return aVar;
    }

    public com.google.common.util.concurrent.q<Void> e() {
        return this.f172191b.isEmpty() ? I.n.p(null) : I.n.s(I.n.x(I.n.w(new ArrayList(this.f172191b)), new InterfaceC16578a() { // from class: z.r
            @Override // q.InterfaceC16578a
            public final Object apply(Object obj) {
                return C18403t.b((List) obj);
            }
        }, H.a.a()));
    }

    public boolean f() {
        return this.f172190a;
    }

    public void g() {
        LinkedList linkedList = new LinkedList(this.f172191b);
        while (!linkedList.isEmpty()) {
            com.google.common.util.concurrent.q qVar = (com.google.common.util.concurrent.q) linkedList.poll();
            Objects.requireNonNull(qVar);
            qVar.cancel(true);
        }
    }

    public C18403t(boolean z10) {
        this.f172190a = z10;
    }

    public static /* synthetic */ void a(C18403t c18403t, a aVar, com.google.common.util.concurrent.q qVar) {
        c18403t.getClass();
        FS.log_d("RequestMonitor", "RequestListener " + aVar + " done " + c18403t);
        c18403t.f172191b.remove(qVar);
    }

    public CameraCaptureSession.CaptureCallback d(CameraCaptureSession.CaptureCallback captureCallback) {
        if (f()) {
            return U.b(c(), captureCallback);
        }
        return captureCallback;
    }
}
