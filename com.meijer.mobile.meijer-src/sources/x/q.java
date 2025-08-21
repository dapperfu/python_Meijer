package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final c f167724a;

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final SessionConfiguration f167725a;

        /* renamed from: b, reason: collision with root package name */
        private final List<k> f167726b;

        a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f167725a = sessionConfiguration;
            this.f167726b = Collections.unmodifiableList(q.i(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // x.q.c
        public j a() {
            return j.b(this.f167725a.getInputConfiguration());
        }

        @Override // x.q.c
        public Executor b() {
            return this.f167725a.getExecutor();
        }

        @Override // x.q.c
        public CameraCaptureSession.StateCallback c() {
            return this.f167725a.getStateCallback();
        }

        @Override // x.q.c
        public List<k> d() {
            return this.f167726b;
        }

        @Override // x.q.c
        public void e(j jVar) {
            this.f167725a.setInputConfiguration((InputConfiguration) jVar.a());
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f167725a, ((a) obj).f167725a);
            }
            return false;
        }

        @Override // x.q.c
        public Object f() {
            return this.f167725a;
        }

        @Override // x.q.c
        public int g() {
            return this.f167725a.getSessionType();
        }

        @Override // x.q.c
        public void h(CaptureRequest captureRequest) {
            this.f167725a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f167725a.hashCode();
        }

        a(int i10, List<k> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, q.h(list), executor, stateCallback));
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final List<k> f167727a;

        /* renamed from: b, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f167728b;

        /* renamed from: c, reason: collision with root package name */
        private final Executor f167729c;

        /* renamed from: d, reason: collision with root package name */
        private final int f167730d;

        /* renamed from: e, reason: collision with root package name */
        private j f167731e = null;

        /* renamed from: f, reason: collision with root package name */
        private CaptureRequest f167732f = null;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f167731e, bVar.f167731e) && this.f167730d == bVar.f167730d && this.f167727a.size() == bVar.f167727a.size()) {
                    for (int i10 = 0; i10 < this.f167727a.size(); i10++) {
                        if (!this.f167727a.get(i10).equals(bVar.f167727a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // x.q.c
        public Object f() {
            return null;
        }

        @Override // x.q.c
        public j a() {
            return this.f167731e;
        }

        @Override // x.q.c
        public Executor b() {
            return this.f167729c;
        }

        @Override // x.q.c
        public CameraCaptureSession.StateCallback c() {
            return this.f167728b;
        }

        @Override // x.q.c
        public List<k> d() {
            return this.f167727a;
        }

        @Override // x.q.c
        public void e(j jVar) {
            if (this.f167730d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f167731e = jVar;
        }

        @Override // x.q.c
        public int g() {
            return this.f167730d;
        }

        @Override // x.q.c
        public void h(CaptureRequest captureRequest) {
            this.f167732f = captureRequest;
        }

        public int hashCode() {
            int iHashCode = this.f167727a.hashCode() ^ 31;
            int i10 = (iHashCode << 5) - iHashCode;
            j jVar = this.f167731e;
            int iHashCode2 = (jVar == null ? 0 : jVar.hashCode()) ^ i10;
            return this.f167730d ^ ((iHashCode2 << 5) - iHashCode2);
        }

        b(int i10, List<k> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f167730d = i10;
            this.f167727a = Collections.unmodifiableList(new ArrayList(list));
            this.f167728b = stateCallback;
            this.f167729c = executor;
        }
    }

    private interface c {
        j a();

        Executor b();

        CameraCaptureSession.StateCallback c();

        List<k> d();

        void e(j jVar);

        Object f();

        int g();

        void h(CaptureRequest captureRequest);
    }

    public static List<OutputConfiguration> h(List<k> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<k> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) it.next().i());
        }
        return arrayList;
    }

    static List<k> i(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OutputConfiguration> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k.j(it.next()));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f167724a.b();
    }

    public j b() {
        return this.f167724a.a();
    }

    public List<k> c() {
        return this.f167724a.d();
    }

    public int d() {
        return this.f167724a.g();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f167724a.c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f167724a.equals(((q) obj).f167724a);
        }
        return false;
    }

    public void f(j jVar) {
        this.f167724a.e(jVar);
    }

    public void g(CaptureRequest captureRequest) {
        this.f167724a.h(captureRequest);
    }

    public int hashCode() {
        return this.f167724a.hashCode();
    }

    public Object j() {
        return this.f167724a.f();
    }

    public q(int i10, List<k> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f167724a = new b(i10, list, executor, stateCallback);
        } else {
            this.f167724a = new a(i10, list, executor, stateCallback);
        }
    }
}
