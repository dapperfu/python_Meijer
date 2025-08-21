package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final b f53911a;

    private static class a extends b {

        /* renamed from: e, reason: collision with root package name */
        private static HandlerThread f53912e;

        /* renamed from: f, reason: collision with root package name */
        private static Handler f53913f;

        /* renamed from: a, reason: collision with root package name */
        int f53914a;

        /* renamed from: b, reason: collision with root package name */
        SparseIntArray[] f53915b = new SparseIntArray[9];

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f53916c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f53917d = new WindowOnFrameMetricsAvailableListenerC1106a();

        /* renamed from: androidx.core.app.i$a$a, reason: collision with other inner class name */
        class WindowOnFrameMetricsAvailableListenerC1106a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC1106a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f53914a & 1) != 0) {
                    aVar.e(aVar.f53915b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f53914a & 2) != 0) {
                    aVar2.e(aVar2.f53915b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f53914a & 4) != 0) {
                    aVar3.e(aVar3.f53915b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f53914a & 8) != 0) {
                    aVar4.e(aVar4.f53915b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f53914a & 16) != 0) {
                    aVar5.e(aVar5.f53915b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f53914a & 64) != 0) {
                    aVar6.e(aVar6.f53915b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f53914a & 32) != 0) {
                    aVar7.e(aVar7.f53915b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f53914a & 128) != 0) {
                    aVar8.e(aVar8.f53915b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f53914a & 256) != 0) {
                    aVar9.e(aVar9.f53915b[8], frameMetrics.getMetric(2));
                }
            }
        }

        @Override // androidx.core.app.i.b
        public void a(Activity activity) {
            if (f53912e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f53912e = handlerThread;
                handlerThread.start();
                f53913f = new Handler(f53912e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f53915b;
                if (sparseIntArrayArr[i10] == null && (this.f53914a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f53917d, f53913f);
            this.f53916c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.i.b
        public SparseIntArray[] b() {
            return this.f53915b;
        }

        @Override // androidx.core.app.i.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f53916c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f53916c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f53917d);
            return this.f53915b;
        }

        @Override // androidx.core.app.i.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f53915b;
            this.f53915b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        void e(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }

        a(int i10) {
            this.f53914a = i10;
        }
    }

    public i() {
        this(1);
    }

    private static class b {
        public void a(Activity activity) {
            throw null;
        }

        public SparseIntArray[] b() {
            throw null;
        }

        public SparseIntArray[] c(Activity activity) {
            throw null;
        }

        public SparseIntArray[] d() {
            throw null;
        }

        b() {
        }
    }

    public i(int i10) {
        this.f53911a = new a(i10);
    }

    public void a(Activity activity) {
        this.f53911a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f53911a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f53911a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f53911a.d();
    }
}
