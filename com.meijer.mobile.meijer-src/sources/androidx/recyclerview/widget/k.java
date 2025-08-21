package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
final class k implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    static final ThreadLocal<k> f58432e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    static Comparator<c> f58433f = new a();

    /* renamed from: b, reason: collision with root package name */
    long f58435b;

    /* renamed from: c, reason: collision with root package name */
    long f58436c;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<RecyclerView> f58434a = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<c> f58437d = new ArrayList<>();

    class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f58445d;
            if ((recyclerView == null) != (cVar2.f58445d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f58442a;
            if (z10 != cVar2.f58442a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f58443b - cVar.f58443b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f58444c - cVar2.f58444c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }

        a() {
        }
    }

    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.p.c {

        /* renamed from: a, reason: collision with root package name */
        int f58438a;

        /* renamed from: b, reason: collision with root package name */
        int f58439b;

        /* renamed from: c, reason: collision with root package name */
        int[] f58440c;

        /* renamed from: d, reason: collision with root package name */
        int f58441d;

        void c(RecyclerView recyclerView, boolean z10) {
            this.f58441d = 0;
            int[] iArr = this.f58440c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.mLayout;
            if (recyclerView.mAdapter == null || pVar == null || !pVar.J0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.mAdapterHelper.p()) {
                    pVar.G(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                pVar.F(this.f58438a, this.f58439b, recyclerView.mState, this);
            }
            int i10 = this.f58441d;
            if (i10 > pVar.f58189m) {
                pVar.f58189m = i10;
                pVar.f58190n = z10;
                recyclerView.mRecycler.Q();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f58441d;
            int i13 = i12 * 2;
            int[] iArr = this.f58440c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f58440c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f58440c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f58440c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f58441d++;
        }

        void b() {
            int[] iArr = this.f58440c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f58441d = 0;
        }

        boolean d(int i10) {
            if (this.f58440c != null) {
                int i11 = this.f58441d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f58440c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f58438a = i10;
            this.f58439b = i11;
        }

        b() {
        }
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f58437d.size(); i10++) {
            c cVar = this.f58437d.get(i10);
            if (cVar.f58445d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f58442a;

        /* renamed from: b, reason: collision with root package name */
        public int f58443b;

        /* renamed from: c, reason: collision with root package name */
        public int f58444c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f58445d;

        /* renamed from: e, reason: collision with root package name */
        public int f58446e;

        public void a() {
            this.f58442a = false;
            this.f58443b = 0;
            this.f58444c = 0;
            this.f58445d = null;
            this.f58446e = 0;
        }

        c() {
        }
    }

    private void b() {
        c cVar;
        int size = this.f58434a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f58434a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.c(recyclerView, false);
                i10 += recyclerView.mPrefetchRegistry.f58441d;
            }
        }
        this.f58437d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f58434a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.mPrefetchRegistry;
                int iAbs = Math.abs(bVar.f58438a) + Math.abs(bVar.f58439b);
                for (int i14 = 0; i14 < bVar.f58441d * 2; i14 += 2) {
                    if (i12 >= this.f58437d.size()) {
                        cVar = new c();
                        this.f58437d.add(cVar);
                    } else {
                        cVar = this.f58437d.get(i12);
                    }
                    int[] iArr = bVar.f58440c;
                    int i15 = iArr[i14 + 1];
                    cVar.f58442a = i15 <= iAbs;
                    cVar.f58443b = iAbs;
                    cVar.f58444c = i15;
                    cVar.f58445d = recyclerView2;
                    cVar.f58446e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f58437d, f58433f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.F fI = i(cVar.f58445d, cVar.f58446e, cVar.f58442a ? Long.MAX_VALUE : j10);
        if (fI == null || fI.mNestedRecyclerView == null || !fI.isBound() || fI.isInvalid()) {
            return;
        }
        h(fI.mNestedRecyclerView.get(), j10);
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int iJ = recyclerView.mChildHelper.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            RecyclerView.F childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.i(i11));
            if (childViewHolderInt.mPosition == i10 && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.c(recyclerView, true);
        if (bVar.f58441d != 0) {
            try {
                j2.n.a("RV Nested Prefetch");
                recyclerView.mState.f(recyclerView.mAdapter);
                for (int i10 = 0; i10 < bVar.f58441d * 2; i10 += 2) {
                    i(recyclerView, bVar.f58440c[i10], j10);
                }
            } finally {
                j2.n.b();
            }
        }
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.sDebugAssertionsEnabled && this.f58434a.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.f58434a.add(recyclerView);
    }

    public void j(RecyclerView recyclerView) {
        boolean zRemove = this.f58434a.remove(recyclerView);
        if (RecyclerView.sDebugAssertionsEnabled && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            j2.n.a("RV Prefetch");
            if (!this.f58434a.isEmpty()) {
                int size = this.f58434a.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f58434a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f58436c);
                }
            }
        } finally {
            this.f58435b = 0L;
            j2.n.b();
        }
    }

    k() {
    }

    private RecyclerView.F i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.F fO = wVar.O(i10, false, j10);
            if (fO != null) {
                if (fO.isBound() && !fO.isInvalid()) {
                    wVar.H(fO.itemView);
                } else {
                    wVar.a(fO, false);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            return fO;
        } catch (Throwable th2) {
            recyclerView.onExitLayoutOrScroll(false);
            throw th2;
        }
    }

    void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.sDebugAssertionsEnabled && !this.f58434a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f58435b == 0) {
                this.f58435b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.mPrefetchRegistry.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }
}
