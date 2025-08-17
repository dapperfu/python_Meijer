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
    private final c f166636a;

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final SessionConfiguration f166637a;

        /* renamed from: b, reason: collision with root package name */
        private final List<k> f166638b;

        a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f166637a = sessionConfiguration;
            this.f166638b = Collections.unmodifiableList(q.i(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // x.q.c
        public j a() {
            return j.b(this.f166637a.getInputConfiguration());
        }

        @Override // x.q.c
        public Executor b() {
            return this.f166637a.getExecutor();
        }

        @Override // x.q.c
        public CameraCaptureSession.StateCallback c() {
            return this.f166637a.getStateCallback();
        }

        @Override // x.q.c
        public List<k> d() {
            return this.f166638b;
        }

        @Override // x.q.c
        public void e(j jVar) {
            this.f166637a.setInputConfiguration((InputConfiguration) jVar.a());
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f166637a, ((a) obj).f166637a);
            }
            return false;
        }

        @Override // x.q.c
        public Object f() {
            return this.f166637a;
        }

        @Override // x.q.c
        public int g() {
            return this.f166637a.getSessionType();
        }

        @Override // x.q.c
        public void h(CaptureRequest captureRequest) {
            this.f166637a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f166637a.hashCode();
        }

        a(int i10, List<k> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, q.h(list), executor, stateCallback));
        }
    }

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final List<k> f166639a;

        /* renamed from: b, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f166640b;

        /* renamed from: c, reason: collision with root package name */
        private final Executor f166641c;

        /* renamed from: d, reason: collision with root package name */
        private final int f166642d;

        /* renamed from: e, reason: collision with root package name */
        private j f166643e = null;

        /* renamed from: f, reason: collision with root package name */
        private CaptureRequest f166644f = null;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f166643e, bVar.f166643e) && this.f166642d == bVar.f166642d && this.f166639a.size() == bVar.f166639a.size()) {
                    for (int i10 = 0; i10 < this.f166639a.size(); i10++) {
                        if (!this.f166639a.get(i10).equals(bVar.f166639a.get(i10))) {
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
            return this.f166643e;
        }

        @Override // x.q.c
        public Executor b() {
            return this.f166641c;
        }

        @Override // x.q.c
        public CameraCaptureSession.StateCallback c() {
            return this.f166640b;
        }

        @Override // x.q.c
        public List<k> d() {
            return this.f166639a;
        }

        @Override // x.q.c
        public void e(j jVar) {
            if (this.f166642d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f166643e = jVar;
        }

        @Override // x.q.c
        public int g() {
            return this.f166642d;
        }

        @Override // x.q.c
        public void h(CaptureRequest captureRequest) {
            this.f166644f = captureRequest;
        }

        public int hashCode() {
            int iHashCode = this.f166639a.hashCode() ^ 31;
            int i10 = (iHashCode << 5) - iHashCode;
            j jVar = this.f166643e;
            int iHashCode2 = (jVar == null ? 0 : jVar.hashCode()) ^ i10;
            return this.f166642d ^ ((iHashCode2 << 5) - iHashCode2);
        }

        b(int i10, List<k> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f166642d = i10;
            this.f166639a = Collections.unmodifiableList(new ArrayList(list));
            this.f166640b = stateCallback;
            this.f166641c = executor;
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
        return this.f166636a.b();
    }

    public j b() {
        return this.f166636a.a();
    }

    public List<k> c() {
        return this.f166636a.d();
    }

    public int d() {
        return this.f166636a.g();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f166636a.c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f166636a.equals(((q) obj).f166636a);
        }
        return false;
    }

    public void f(j jVar) {
        this.f166636a.e(jVar);
    }

    public void g(CaptureRequest captureRequest) {
        this.f166636a.h(captureRequest);
    }

    public int hashCode() {
        return this.f166636a.hashCode();
    }

    public Object j() {
        return this.f166636a.f();
    }

    public q(int i10, List<k> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f166636a = new b(i10, list, executor, stateCallback);
        } else {
            this.f166636a = new a(i10, list, executor, stateCallback);
        }
    }
}
