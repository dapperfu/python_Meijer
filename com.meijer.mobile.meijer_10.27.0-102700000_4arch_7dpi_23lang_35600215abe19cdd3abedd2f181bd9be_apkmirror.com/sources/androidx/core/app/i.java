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
    private final b f53687a;

    private static class a extends b {

        /* renamed from: e, reason: collision with root package name */
        private static HandlerThread f53688e;

        /* renamed from: f, reason: collision with root package name */
        private static Handler f53689f;

        /* renamed from: a, reason: collision with root package name */
        int f53690a;

        /* renamed from: b, reason: collision with root package name */
        SparseIntArray[] f53691b = new SparseIntArray[9];

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f53692c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f53693d = new WindowOnFrameMetricsAvailableListenerC1093a();

        /* renamed from: androidx.core.app.i$a$a, reason: collision with other inner class name */
        class WindowOnFrameMetricsAvailableListenerC1093a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC1093a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f53690a & 1) != 0) {
                    aVar.e(aVar.f53691b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f53690a & 2) != 0) {
                    aVar2.e(aVar2.f53691b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f53690a & 4) != 0) {
                    aVar3.e(aVar3.f53691b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f53690a & 8) != 0) {
                    aVar4.e(aVar4.f53691b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f53690a & 16) != 0) {
                    aVar5.e(aVar5.f53691b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f53690a & 64) != 0) {
                    aVar6.e(aVar6.f53691b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f53690a & 32) != 0) {
                    aVar7.e(aVar7.f53691b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f53690a & 128) != 0) {
                    aVar8.e(aVar8.f53691b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f53690a & 256) != 0) {
                    aVar9.e(aVar9.f53691b[8], frameMetrics.getMetric(2));
                }
            }
        }

        @Override // androidx.core.app.i.b
        public void a(Activity activity) {
            if (f53688e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f53688e = handlerThread;
                handlerThread.start();
                f53689f = new Handler(f53688e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f53691b;
                if (sparseIntArrayArr[i10] == null && (this.f53690a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f53693d, f53689f);
            this.f53692c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.i.b
        public SparseIntArray[] b() {
            return this.f53691b;
        }

        @Override // androidx.core.app.i.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f53692c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f53692c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f53693d);
            return this.f53691b;
        }

        @Override // androidx.core.app.i.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f53691b;
            this.f53691b = new SparseIntArray[9];
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
            this.f53690a = i10;
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
        this.f53687a = new a(i10);
    }

    public void a(Activity activity) {
        this.f53687a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f53687a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f53687a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f53687a.d();
    }
}
