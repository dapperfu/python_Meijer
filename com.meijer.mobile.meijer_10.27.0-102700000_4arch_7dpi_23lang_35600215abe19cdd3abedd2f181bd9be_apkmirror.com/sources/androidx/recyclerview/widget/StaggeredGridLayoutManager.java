package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes4.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.A.b {

    /* renamed from: B, reason: collision with root package name */
    private BitSet f57999B;

    /* renamed from: G, reason: collision with root package name */
    private boolean f58004G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f58005H;

    /* renamed from: I, reason: collision with root package name */
    private e f58006I;

    /* renamed from: J, reason: collision with root package name */
    private int f58007J;

    /* renamed from: O, reason: collision with root package name */
    private int[] f58012O;

    /* renamed from: t, reason: collision with root package name */
    f[] f58015t;

    /* renamed from: u, reason: collision with root package name */
    t f58016u;

    /* renamed from: v, reason: collision with root package name */
    t f58017v;

    /* renamed from: w, reason: collision with root package name */
    private int f58018w;

    /* renamed from: x, reason: collision with root package name */
    private int f58019x;

    /* renamed from: y, reason: collision with root package name */
    private final o f58020y;

    /* renamed from: s, reason: collision with root package name */
    private int f58014s = -1;

    /* renamed from: z, reason: collision with root package name */
    boolean f58021z = false;

    /* renamed from: A, reason: collision with root package name */
    boolean f57998A = false;

    /* renamed from: C, reason: collision with root package name */
    int f58000C = -1;

    /* renamed from: D, reason: collision with root package name */
    int f58001D = Integer.MIN_VALUE;

    /* renamed from: E, reason: collision with root package name */
    d f58002E = new d();

    /* renamed from: F, reason: collision with root package name */
    private int f58003F = 2;

    /* renamed from: K, reason: collision with root package name */
    private final Rect f58008K = new Rect();

    /* renamed from: L, reason: collision with root package name */
    private final b f58009L = new b();

    /* renamed from: M, reason: collision with root package name */
    private boolean f58010M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f58011N = true;

    /* renamed from: P, reason: collision with root package name */
    private final Runnable f58013P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.k2();
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        int f58023a;

        /* renamed from: b, reason: collision with root package name */
        int f58024b;

        /* renamed from: c, reason: collision with root package name */
        boolean f58025c;

        /* renamed from: d, reason: collision with root package name */
        boolean f58026d;

        /* renamed from: e, reason: collision with root package name */
        boolean f58027e;

        /* renamed from: f, reason: collision with root package name */
        int[] f58028f;

        void c() {
            this.f58023a = -1;
            this.f58024b = Integer.MIN_VALUE;
            this.f58025c = false;
            this.f58026d = false;
            this.f58027e = false;
            int[] iArr = this.f58028f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f58028f;
            if (iArr == null || iArr.length < length) {
                this.f58028f = new int[StaggeredGridLayoutManager.this.f58015t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f58028f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }

        b() {
            c();
        }

        void a() {
            this.f58024b = this.f58025c ? StaggeredGridLayoutManager.this.f58016u.i() : StaggeredGridLayoutManager.this.f58016u.m();
        }

        void b(int i10) {
            if (this.f58025c) {
                this.f58024b = StaggeredGridLayoutManager.this.f58016u.i() - i10;
            } else {
                this.f58024b = StaggeredGridLayoutManager.this.f58016u.m() + i10;
            }
        }
    }

    public static class c extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        f f58030e;

        /* renamed from: f, reason: collision with root package name */
        boolean f58031f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public boolean f() {
            return this.f58031f;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        int[] f58032a;

        /* renamed from: b, reason: collision with root package name */
        List<a> f58033b;

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C1134a();

            /* renamed from: a, reason: collision with root package name */
            int f58034a;

            /* renamed from: b, reason: collision with root package name */
            int f58035b;

            /* renamed from: c, reason: collision with root package name */
            int[] f58036c;

            /* renamed from: d, reason: collision with root package name */
            boolean f58037d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C1134a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i10) {
                    return new a[i10];
                }

                C1134a() {
                }
            }

            a(Parcel parcel) {
                this.f58034a = parcel.readInt();
                this.f58035b = parcel.readInt();
                this.f58037d = parcel.readInt() == 1;
                int i10 = parcel.readInt();
                if (i10 > 0) {
                    int[] iArr = new int[i10];
                    this.f58036c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            int a(int i10) {
                int[] iArr = this.f58036c;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f58034a + ", mGapDir=" + this.f58035b + ", mHasUnwantedGapAfter=" + this.f58037d + ", mGapPerSpan=" + Arrays.toString(this.f58036c) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f58034a);
                parcel.writeInt(this.f58035b);
                parcel.writeInt(this.f58037d ? 1 : 0);
                int[] iArr = this.f58036c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f58036c);
                }
            }

            a() {
            }
        }

        private int i(int i10) {
            if (this.f58033b == null) {
                return -1;
            }
            a aVarF = f(i10);
            if (aVarF != null) {
                this.f58033b.remove(aVarF);
            }
            int size = this.f58033b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                }
                if (this.f58033b.get(i11).f58034a >= i10) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                return -1;
            }
            a aVar = this.f58033b.get(i11);
            this.f58033b.remove(i11);
            return aVar.f58034a;
        }

        private void l(int i10, int i11) {
            List<a> list = this.f58033b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f58033b.get(size);
                int i12 = aVar.f58034a;
                if (i12 >= i10) {
                    aVar.f58034a = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List<a> list = this.f58033b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f58033b.get(size);
                int i13 = aVar.f58034a;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f58033b.remove(size);
                    } else {
                        aVar.f58034a = i13 - i11;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f58033b == null) {
                this.f58033b = new ArrayList();
            }
            int size = this.f58033b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = this.f58033b.get(i10);
                if (aVar2.f58034a == aVar.f58034a) {
                    this.f58033b.remove(i10);
                }
                if (aVar2.f58034a >= aVar.f58034a) {
                    this.f58033b.add(i10, aVar);
                    return;
                }
            }
            this.f58033b.add(aVar);
        }

        void b() {
            int[] iArr = this.f58032a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f58033b = null;
        }

        void c(int i10) {
            int[] iArr = this.f58032a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f58032a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f58032a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f58032a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List<a> list = this.f58033b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f58033b.get(size).f58034a >= i10) {
                        this.f58033b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List<a> list = this.f58033b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.f58033b.get(i13);
                int i14 = aVar.f58034a;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f58035b == i12 || (z10 && aVar.f58037d))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List<a> list = this.f58033b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f58033b.get(size);
                if (aVar.f58034a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f58032a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f58032a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f58032a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f58032a.length;
            }
            int iMin = Math.min(i11 + 1, this.f58032a.length);
            Arrays.fill(this.f58032a, i10, iMin, -1);
            return iMin;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f58032a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f58032a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f58032a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f58032a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f58032a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f58032a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        int o(int i10) {
            int length = this.f58032a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }

        d() {
        }

        void n(int i10, f fVar) {
            c(i10);
            this.f58032a[i10] = fVar.f58052e;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        int f58038a;

        /* renamed from: b, reason: collision with root package name */
        int f58039b;

        /* renamed from: c, reason: collision with root package name */
        int f58040c;

        /* renamed from: d, reason: collision with root package name */
        int[] f58041d;

        /* renamed from: e, reason: collision with root package name */
        int f58042e;

        /* renamed from: f, reason: collision with root package name */
        int[] f58043f;

        /* renamed from: g, reason: collision with root package name */
        List<d.a> f58044g;

        /* renamed from: h, reason: collision with root package name */
        boolean f58045h;

        /* renamed from: i, reason: collision with root package name */
        boolean f58046i;

        /* renamed from: j, reason: collision with root package name */
        boolean f58047j;

        class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i10) {
                return new e[i10];
            }

            a() {
            }
        }

        public e() {
        }

        void a() {
            this.f58041d = null;
            this.f58040c = 0;
            this.f58038a = -1;
            this.f58039b = -1;
        }

        void b() {
            this.f58041d = null;
            this.f58040c = 0;
            this.f58042e = 0;
            this.f58043f = null;
            this.f58044g = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        e(Parcel parcel) {
            this.f58038a = parcel.readInt();
            this.f58039b = parcel.readInt();
            int i10 = parcel.readInt();
            this.f58040c = i10;
            if (i10 > 0) {
                int[] iArr = new int[i10];
                this.f58041d = iArr;
                parcel.readIntArray(iArr);
            }
            int i11 = parcel.readInt();
            this.f58042e = i11;
            if (i11 > 0) {
                int[] iArr2 = new int[i11];
                this.f58043f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f58045h = parcel.readInt() == 1;
            this.f58046i = parcel.readInt() == 1;
            this.f58047j = parcel.readInt() == 1;
            this.f58044g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f58038a);
            parcel.writeInt(this.f58039b);
            parcel.writeInt(this.f58040c);
            if (this.f58040c > 0) {
                parcel.writeIntArray(this.f58041d);
            }
            parcel.writeInt(this.f58042e);
            if (this.f58042e > 0) {
                parcel.writeIntArray(this.f58043f);
            }
            parcel.writeInt(this.f58045h ? 1 : 0);
            parcel.writeInt(this.f58046i ? 1 : 0);
            parcel.writeInt(this.f58047j ? 1 : 0);
            parcel.writeList(this.f58044g);
        }

        public e(e eVar) {
            this.f58040c = eVar.f58040c;
            this.f58038a = eVar.f58038a;
            this.f58039b = eVar.f58039b;
            this.f58041d = eVar.f58041d;
            this.f58042e = eVar.f58042e;
            this.f58043f = eVar.f58043f;
            this.f58045h = eVar.f58045h;
            this.f58046i = eVar.f58046i;
            this.f58047j = eVar.f58047j;
            this.f58044g = eVar.f58044g;
        }
    }

    class f {

        /* renamed from: a, reason: collision with root package name */
        ArrayList<View> f58048a = new ArrayList<>();

        /* renamed from: b, reason: collision with root package name */
        int f58049b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        int f58050c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        int f58051d = 0;

        /* renamed from: e, reason: collision with root package name */
        final int f58052e;

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f58048a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f58048a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f58021z && staggeredGridLayoutManager.v0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f58021z && staggeredGridLayoutManager2.v0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f58048a.size();
            int i12 = 0;
            while (i12 < size2) {
                View view3 = this.f58048a.get(i12);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f58021z && staggeredGridLayoutManager3.v0(view3) <= i10) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f58021z && staggeredGridLayoutManager4.v0(view3) >= i10) || !view3.hasFocusable()) {
                    break;
                }
                i12++;
                view = view3;
            }
            return view;
        }

        f(int i10) {
            this.f58052e = i10;
        }

        void b(boolean z10, int i10) {
            int iL = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z10 || iL >= StaggeredGridLayoutManager.this.f58016u.i()) {
                if (z10 || iL <= StaggeredGridLayoutManager.this.f58016u.m()) {
                    if (i10 != Integer.MIN_VALUE) {
                        iL += i10;
                    }
                    this.f58050c = iL;
                    this.f58049b = iL;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList<View> arrayList = this.f58048a;
            View view = arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f58050c = StaggeredGridLayoutManager.this.f58016u.d(view);
            if (cVarN.f58031f && (aVarF = StaggeredGridLayoutManager.this.f58002E.f(cVarN.b())) != null && aVarF.f58035b == 1) {
                this.f58050c += aVarF.a(this.f58052e);
            }
        }

        void d() {
            d.a aVarF;
            View view = this.f58048a.get(0);
            c cVarN = n(view);
            this.f58049b = StaggeredGridLayoutManager.this.f58016u.g(view);
            if (cVarN.f58031f && (aVarF = StaggeredGridLayoutManager.this.f58002E.f(cVarN.b())) != null && aVarF.f58035b == -1) {
                this.f58049b -= aVarF.a(this.f58052e);
            }
        }

        void e() {
            this.f58048a.clear();
            q();
            this.f58051d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f58021z ? i(this.f58048a.size() - 1, -1, true) : i(0, this.f58048a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f58021z ? i(0, this.f58048a.size(), true) : i(this.f58048a.size() - 1, -1, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int iM = StaggeredGridLayoutManager.this.f58016u.m();
            int i12 = StaggeredGridLayoutManager.this.f58016u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f58048a.get(i10);
                int iG = StaggeredGridLayoutManager.this.f58016u.g(view);
                int iD = StaggeredGridLayoutManager.this.f58016u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? iG >= i12 : iG > i12;
                if (!z12 ? iD > iM : iD >= iM) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (z10 && z11) {
                        if (iG >= iM && iD <= i12) {
                            return StaggeredGridLayoutManager.this.v0(view);
                        }
                    } else {
                        if (z11) {
                            return StaggeredGridLayoutManager.this.v0(view);
                        }
                        if (iG < iM || iD > i12) {
                            return StaggeredGridLayoutManager.this.v0(view);
                        }
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        public int j() {
            return this.f58051d;
        }

        int k() {
            int i10 = this.f58050c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f58050c;
        }

        int l(int i10) {
            int i11 = this.f58050c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f58048a.size() == 0) {
                return i10;
            }
            c();
            return this.f58050c;
        }

        int o() {
            int i10 = this.f58049b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f58049b;
        }

        int p(int i10) {
            int i11 = this.f58049b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f58048a.size() == 0) {
                return i10;
            }
            d();
            return this.f58049b;
        }

        void q() {
            this.f58049b = Integer.MIN_VALUE;
            this.f58050c = Integer.MIN_VALUE;
        }

        void r(int i10) {
            int i11 = this.f58049b;
            if (i11 != Integer.MIN_VALUE) {
                this.f58049b = i11 + i10;
            }
            int i12 = this.f58050c;
            if (i12 != Integer.MIN_VALUE) {
                this.f58050c = i12 + i10;
            }
        }

        void s() {
            int size = this.f58048a.size();
            View viewRemove = this.f58048a.remove(size - 1);
            c cVarN = n(viewRemove);
            cVarN.f58030e = null;
            if (cVarN.d() || cVarN.c()) {
                this.f58051d -= StaggeredGridLayoutManager.this.f58016u.e(viewRemove);
            }
            if (size == 1) {
                this.f58049b = Integer.MIN_VALUE;
            }
            this.f58050c = Integer.MIN_VALUE;
        }

        void t() {
            View viewRemove = this.f58048a.remove(0);
            c cVarN = n(viewRemove);
            cVarN.f58030e = null;
            if (this.f58048a.size() == 0) {
                this.f58050c = Integer.MIN_VALUE;
            }
            if (cVarN.d() || cVarN.c()) {
                this.f58051d -= StaggeredGridLayoutManager.this.f58016u.e(viewRemove);
            }
            this.f58049b = Integer.MIN_VALUE;
        }

        void v(int i10) {
            this.f58049b = i10;
            this.f58050c = i10;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f58030e = this;
            this.f58048a.add(view);
            this.f58050c = Integer.MIN_VALUE;
            if (this.f58048a.size() == 1) {
                this.f58049b = Integer.MIN_VALUE;
            }
            if (!cVarN.d() && !cVarN.c()) {
                return;
            }
            this.f58051d += StaggeredGridLayoutManager.this.f58016u.e(view);
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f58030e = this;
            this.f58048a.add(0, view);
            this.f58049b = Integer.MIN_VALUE;
            if (this.f58048a.size() == 1) {
                this.f58050c = Integer.MIN_VALUE;
            }
            if (!cVarN.d() && !cVarN.c()) {
                return;
            }
            this.f58051d += StaggeredGridLayoutManager.this.f58016u.e(view);
        }
    }

    private void f3(int i10, int i11) {
        for (int i12 = 0; i12 < this.f58014s; i12++) {
            if (!this.f58015t[i12].f58048a.isEmpty()) {
                l3(this.f58015t[i12], i10, i11);
            }
        }
    }

    private int p2(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f58018w == 1) ? 1 : Integer.MIN_VALUE : this.f58018w == 0 ? 1 : Integer.MIN_VALUE : this.f58018w == 1 ? -1 : Integer.MIN_VALUE : this.f58018w == 0 ? -1 : Integer.MIN_VALUE : (this.f58018w != 1 && N2()) ? -1 : 1 : (this.f58018w != 1 && N2()) ? 1 : -1;
    }

    void S2(int i10, RecyclerView.B b10) {
        int iB2;
        int i11;
        if (i10 > 0) {
            iB2 = C2();
            i11 = 1;
        } else {
            iB2 = B2();
            i11 = -1;
        }
        this.f58020y.f58282a = true;
        j3(iB2, b10);
        b3(i11);
        o oVar = this.f58020y;
        oVar.f58284c = iB2 + oVar.f58285d;
        oVar.f58283b = Math.abs(i10);
    }

    public void d3(boolean z10) {
        w(null);
        e eVar = this.f58006I;
        if (eVar != null && eVar.f58045h != z10) {
            eVar.f58045h = z10;
        }
        this.f58021z = z10;
        K1();
    }

    public void e3(int i10) {
        w(null);
        if (i10 != this.f58014s) {
            M2();
            this.f58014s = i10;
            this.f57999B = new BitSet(this.f58014s);
            this.f58015t = new f[this.f58014s];
            for (int i11 = 0; i11 < this.f58014s; i11++) {
                this.f58015t[i11] = new f(i11);
            }
            K1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h1(RecyclerView recyclerView, int i10, int i11) {
        K2(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(RecyclerView recyclerView, int i10, int i11) {
        K2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void m1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        K2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void n1(RecyclerView.w wVar, RecyclerView.B b10) {
        Q2(wVar, b10, true);
    }

    private int D2(int i10) {
        int iL = this.f58015t[0].l(i10);
        for (int i11 = 1; i11 < this.f58014s; i11++) {
            int iL2 = this.f58015t[i11].l(i10);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int E2(int i10) {
        int iP = this.f58015t[0].p(i10);
        for (int i11 = 1; i11 < this.f58014s; i11++) {
            int iP2 = this.f58015t[i11].p(i10);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int F2(int i10) {
        int iL = this.f58015t[0].l(i10);
        for (int i11 = 1; i11 < this.f58014s; i11++) {
            int iL2 = this.f58015t[i11].l(i10);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int G2(int i10) {
        int iP = this.f58015t[0].p(i10);
        for (int i11 = 1; i11 < this.f58014s; i11++) {
            int iP2 = this.f58015t[i11].p(i10);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private f H2(o oVar) {
        int i10;
        int i11;
        int i12;
        if (R2(oVar.f58286e)) {
            i11 = this.f58014s - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = this.f58014s;
            i11 = 0;
            i12 = 1;
        }
        f fVar = null;
        if (oVar.f58286e == 1) {
            int iM = this.f58016u.m();
            int i13 = a.e.API_PRIORITY_OTHER;
            while (i11 != i10) {
                f fVar2 = this.f58015t[i11];
                int iL = fVar2.l(iM);
                if (iL < i13) {
                    fVar = fVar2;
                    i13 = iL;
                }
                i11 += i12;
            }
            return fVar;
        }
        int i14 = this.f58016u.i();
        int i15 = Integer.MIN_VALUE;
        while (i11 != i10) {
            f fVar3 = this.f58015t[i11];
            int iP = fVar3.p(i14);
            if (iP > i15) {
                fVar = fVar3;
                i15 = iP;
            }
            i11 += i12;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void K2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f57998A
            if (r0 == 0) goto L9
            int r0 = r6.C2()
            goto Ld
        L9:
            int r0 = r6.B2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f58002E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f58002E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f58002E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f58002E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f58002E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.f57998A
            if (r7 == 0) goto L4e
            int r7 = r6.B2()
            goto L52
        L4e:
            int r7 = r6.C2()
        L52:
            if (r3 > r7) goto L57
            r6.K1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.K2(int, int, int):void");
    }

    private void O2(View view, int i10, int i11, boolean z10) {
        A(view, this.f58008K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f58008K;
        int iM3 = m3(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f58008K;
        int iM32 = m3(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? Y1(view, iM3, iM32, cVar) : W1(view, iM3, iM32, cVar)) {
            view.measure(iM3, iM32);
        }
    }

    private void P2(View view, c cVar, boolean z10) {
        if (cVar.f58031f) {
            if (this.f58018w == 1) {
                O2(view, this.f58007J, RecyclerView.p.c0(o0(), p0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
                return;
            } else {
                O2(view, RecyclerView.p.c0(C0(), D0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f58007J, z10);
                return;
            }
        }
        if (this.f58018w == 1) {
            O2(view, RecyclerView.p.c0(this.f58019x, D0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.c0(o0(), p0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z10);
        } else {
            O2(view, RecyclerView.p.c0(C0(), D0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.c0(this.f58019x, p0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Q2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.B r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Q2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, boolean):void");
    }

    private boolean R2(int i10) {
        if (this.f58018w == 0) {
            return (i10 == -1) != this.f57998A;
        }
        return ((i10 == -1) == this.f57998A) == N2();
    }

    private void T2(View view) {
        for (int i10 = this.f58014s - 1; i10 >= 0; i10--) {
            this.f58015t[i10].u(view);
        }
    }

    private void U2(RecyclerView.w wVar, o oVar) {
        if (!oVar.f58282a || oVar.f58290i) {
            return;
        }
        if (oVar.f58283b == 0) {
            if (oVar.f58286e == -1) {
                V2(wVar, oVar.f58288g);
                return;
            } else {
                W2(wVar, oVar.f58287f);
                return;
            }
        }
        if (oVar.f58286e != -1) {
            int iF2 = F2(oVar.f58288g) - oVar.f58288g;
            W2(wVar, iF2 < 0 ? oVar.f58287f : Math.min(iF2, oVar.f58283b) + oVar.f58287f);
        } else {
            int i10 = oVar.f58287f;
            int iE2 = i10 - E2(i10);
            V2(wVar, iE2 < 0 ? oVar.f58288g : oVar.f58288g - Math.min(iE2, oVar.f58283b));
        }
    }

    private void X2() {
        if (this.f58017v.k() == 1073741824) {
            return;
        }
        int iB0 = b0();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < iB0; i10++) {
            View viewA0 = a0(i10);
            float fE = this.f58017v.e(viewA0);
            if (fE >= fMax) {
                if (((c) viewA0.getLayoutParams()).f()) {
                    fE = (fE * 1.0f) / this.f58014s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i11 = this.f58019x;
        int iRound = Math.round(fMax * this.f58014s);
        if (this.f58017v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f58017v.n());
        }
        k3(iRound);
        if (this.f58019x == i11) {
            return;
        }
        for (int i12 = 0; i12 < iB0; i12++) {
            View viewA02 = a0(i12);
            c cVar = (c) viewA02.getLayoutParams();
            if (!cVar.f58031f) {
                if (N2() && this.f58018w == 1) {
                    int i13 = this.f58014s;
                    int i14 = cVar.f58030e.f58052e;
                    viewA02.offsetLeftAndRight(((-((i13 - 1) - i14)) * this.f58019x) - ((-((i13 - 1) - i14)) * i11));
                } else {
                    int i15 = cVar.f58030e.f58052e;
                    int i16 = this.f58019x * i15;
                    int i17 = i15 * i11;
                    if (this.f58018w == 1) {
                        viewA02.offsetLeftAndRight(i16 - i17);
                    } else {
                        viewA02.offsetTopAndBottom(i16 - i17);
                    }
                }
            }
        }
    }

    private void Y2() {
        if (this.f58018w == 1 || !N2()) {
            this.f57998A = this.f58021z;
        } else {
            this.f57998A = !this.f58021z;
        }
    }

    private void b3(int i10) {
        o oVar = this.f58020y;
        oVar.f58286e = i10;
        oVar.f58285d = this.f57998A != (i10 == -1) ? -1 : 1;
    }

    private void e2(View view) {
        for (int i10 = this.f58014s - 1; i10 >= 0; i10--) {
            this.f58015t[i10].a(view);
        }
    }

    private void f2(b bVar) {
        e eVar = this.f58006I;
        int i10 = eVar.f58040c;
        if (i10 > 0) {
            if (i10 == this.f58014s) {
                for (int i11 = 0; i11 < this.f58014s; i11++) {
                    this.f58015t[i11].e();
                    e eVar2 = this.f58006I;
                    int i12 = eVar2.f58041d[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.f58046i ? this.f58016u.i() : this.f58016u.m();
                    }
                    this.f58015t[i11].v(i12);
                }
            } else {
                eVar.b();
                e eVar3 = this.f58006I;
                eVar3.f58038a = eVar3.f58039b;
            }
        }
        e eVar4 = this.f58006I;
        this.f58005H = eVar4.f58047j;
        d3(eVar4.f58045h);
        Y2();
        e eVar5 = this.f58006I;
        int i13 = eVar5.f58038a;
        if (i13 != -1) {
            this.f58000C = i13;
            bVar.f58025c = eVar5.f58046i;
        } else {
            bVar.f58025c = this.f57998A;
        }
        if (eVar5.f58042e > 1) {
            d dVar = this.f58002E;
            dVar.f58032a = eVar5.f58043f;
            dVar.f58033b = eVar5.f58044g;
        }
    }

    private boolean g3(RecyclerView.B b10, b bVar) {
        bVar.f58023a = this.f58004G ? y2(b10.b()) : u2(b10.b());
        bVar.f58024b = Integer.MIN_VALUE;
        return true;
    }

    private void i2(View view, c cVar, o oVar) {
        if (oVar.f58286e == 1) {
            if (cVar.f58031f) {
                e2(view);
                return;
            } else {
                cVar.f58030e.a(view);
                return;
            }
        }
        if (cVar.f58031f) {
            T2(view);
        } else {
            cVar.f58030e.u(view);
        }
    }

    private void j3(int i10, RecyclerView.B b10) {
        int iN;
        int iN2;
        int iC;
        o oVar = this.f58020y;
        boolean z10 = false;
        oVar.f58283b = 0;
        oVar.f58284c = i10;
        if (!N0() || (iC = b10.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.f57998A == (iC < i10)) {
                iN = this.f58016u.n();
                iN2 = 0;
            } else {
                iN2 = this.f58016u.n();
                iN = 0;
            }
        }
        if (e0()) {
            this.f58020y.f58287f = this.f58016u.m() - iN2;
            this.f58020y.f58288g = this.f58016u.i() + iN;
        } else {
            this.f58020y.f58288g = this.f58016u.h() + iN;
            this.f58020y.f58287f = -iN2;
        }
        o oVar2 = this.f58020y;
        oVar2.f58289h = false;
        oVar2.f58282a = true;
        if (this.f58016u.k() == 0 && this.f58016u.h() == 0) {
            z10 = true;
        }
        oVar2.f58290i = z10;
    }

    private boolean l2(f fVar) {
        boolean z10;
        if (!this.f57998A) {
            if (fVar.o() > this.f58016u.m()) {
                z10 = fVar.n(fVar.f58048a.get(0)).f58031f;
                return !z10;
            }
            return false;
        }
        if (fVar.k() < this.f58016u.i()) {
            z10 = fVar.n(fVar.f58048a.get(r0.size() - 1)).f58031f;
            return !z10;
        }
        return false;
    }

    private int m3(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private d.a q2(int i10) {
        d.a aVar = new d.a();
        aVar.f58036c = new int[this.f58014s];
        for (int i11 = 0; i11 < this.f58014s; i11++) {
            aVar.f58036c[i11] = i10 - this.f58015t[i11].l(i10);
        }
        return aVar;
    }

    private d.a r2(int i10) {
        d.a aVar = new d.a();
        aVar.f58036c = new int[this.f58014s];
        for (int i11 = 0; i11 < this.f58014s; i11++) {
            aVar.f58036c[i11] = this.f58015t[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void s2() {
        this.f58016u = t.b(this, this.f58018w);
        this.f58017v = t.b(this, 1 - this.f58018w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private int t2(RecyclerView.w wVar, o oVar, RecyclerView.B b10) {
        f fVarH2;
        int iG2;
        int iE;
        int iM;
        int iE2;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this;
        ?? r82 = 0;
        staggeredGridLayoutManager2.f57999B.set(0, staggeredGridLayoutManager2.f58014s, true);
        int i10 = staggeredGridLayoutManager2.f58020y.f58290i ? oVar.f58286e == 1 ? a.e.API_PRIORITY_OTHER : Integer.MIN_VALUE : oVar.f58286e == 1 ? oVar.f58288g + oVar.f58283b : oVar.f58287f - oVar.f58283b;
        staggeredGridLayoutManager2.f3(oVar.f58286e, i10);
        int i11 = staggeredGridLayoutManager2.f57998A ? staggeredGridLayoutManager2.f58016u.i() : staggeredGridLayoutManager2.f58016u.m();
        boolean z10 = false;
        StaggeredGridLayoutManager staggeredGridLayoutManager3 = staggeredGridLayoutManager2;
        while (oVar.a(b10) && (staggeredGridLayoutManager3.f58020y.f58290i || !staggeredGridLayoutManager3.f57999B.isEmpty())) {
            View viewB = oVar.b(wVar);
            c cVar = (c) viewB.getLayoutParams();
            int iB = cVar.b();
            int iG = staggeredGridLayoutManager3.f58002E.g(iB);
            boolean z11 = iG == -1 ? true : r82;
            if (z11) {
                fVarH2 = cVar.f58031f ? staggeredGridLayoutManager3.f58015t[r82] : staggeredGridLayoutManager3.H2(oVar);
                staggeredGridLayoutManager3.f58002E.n(iB, fVarH2);
            } else {
                fVarH2 = staggeredGridLayoutManager3.f58015t[iG];
            }
            f fVar = fVarH2;
            cVar.f58030e = fVar;
            if (oVar.f58286e == 1) {
                staggeredGridLayoutManager3.t(viewB);
            } else {
                staggeredGridLayoutManager3.u(viewB, r82);
            }
            staggeredGridLayoutManager3.P2(viewB, cVar, r82);
            if (oVar.f58286e == 1) {
                iE = cVar.f58031f ? staggeredGridLayoutManager3.D2(i11) : fVar.l(i11);
                iG2 = staggeredGridLayoutManager3.f58016u.e(viewB) + iE;
                if (z11 && cVar.f58031f) {
                    d.a aVarQ2 = staggeredGridLayoutManager3.q2(iE);
                    aVarQ2.f58035b = -1;
                    aVarQ2.f58034a = iB;
                    staggeredGridLayoutManager3.f58002E.a(aVarQ2);
                }
            } else {
                iG2 = cVar.f58031f ? staggeredGridLayoutManager3.G2(i11) : fVar.p(i11);
                iE = iG2 - staggeredGridLayoutManager3.f58016u.e(viewB);
                if (z11 && cVar.f58031f) {
                    d.a aVarR2 = staggeredGridLayoutManager3.r2(iG2);
                    aVarR2.f58035b = 1;
                    aVarR2.f58034a = iB;
                    staggeredGridLayoutManager3.f58002E.a(aVarR2);
                }
            }
            if (cVar.f58031f && oVar.f58285d == -1) {
                if (z11) {
                    staggeredGridLayoutManager3.f58010M = true;
                } else {
                    if (!(oVar.f58286e == 1 ? staggeredGridLayoutManager3.g2() : staggeredGridLayoutManager3.h2())) {
                        d.a aVarF = staggeredGridLayoutManager3.f58002E.f(iB);
                        if (aVarF != null) {
                            aVarF.f58037d = true;
                        }
                        staggeredGridLayoutManager3.f58010M = true;
                    }
                }
            }
            staggeredGridLayoutManager3.i2(viewB, cVar, oVar);
            if (staggeredGridLayoutManager3.N2() && staggeredGridLayoutManager3.f58018w == 1) {
                iE2 = cVar.f58031f ? staggeredGridLayoutManager3.f58017v.i() : staggeredGridLayoutManager3.f58017v.i() - (((staggeredGridLayoutManager3.f58014s - 1) - fVar.f58052e) * staggeredGridLayoutManager3.f58019x);
                iM = iE2 - staggeredGridLayoutManager3.f58017v.e(viewB);
            } else {
                iM = cVar.f58031f ? staggeredGridLayoutManager3.f58017v.m() : (fVar.f58052e * staggeredGridLayoutManager3.f58019x) + staggeredGridLayoutManager3.f58017v.m();
                iE2 = staggeredGridLayoutManager3.f58017v.e(viewB) + iM;
            }
            int i12 = iE2;
            int i13 = iM;
            if (staggeredGridLayoutManager3.f58018w == 1) {
                staggeredGridLayoutManager3.P0(viewB, i13, iE, i12, iG2);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager3.P0(viewB, iE, i13, iG2, i12);
                staggeredGridLayoutManager = staggeredGridLayoutManager3;
            }
            if (cVar.f58031f) {
                staggeredGridLayoutManager.f3(staggeredGridLayoutManager.f58020y.f58286e, i10);
            } else {
                staggeredGridLayoutManager.l3(fVar, staggeredGridLayoutManager.f58020y.f58286e, i10);
            }
            staggeredGridLayoutManager.U2(wVar, staggeredGridLayoutManager.f58020y);
            if (staggeredGridLayoutManager.f58020y.f58289h && viewB.hasFocusable()) {
                if (cVar.f58031f) {
                    staggeredGridLayoutManager.f57999B.clear();
                } else {
                    staggeredGridLayoutManager.f57999B.set(fVar.f58052e, false);
                }
            }
            z10 = true;
            r82 = 0;
            staggeredGridLayoutManager3 = staggeredGridLayoutManager;
        }
        if (!z10) {
            staggeredGridLayoutManager3.U2(wVar, staggeredGridLayoutManager3.f58020y);
        }
        int iM2 = staggeredGridLayoutManager3.f58020y.f58286e == -1 ? staggeredGridLayoutManager3.f58016u.m() - staggeredGridLayoutManager3.G2(staggeredGridLayoutManager3.f58016u.m()) : staggeredGridLayoutManager3.D2(staggeredGridLayoutManager3.f58016u.i()) - staggeredGridLayoutManager3.f58016u.i();
        if (iM2 > 0) {
            return Math.min(oVar.f58283b, iM2);
        }
        return 0;
    }

    private void z2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int i10;
        int iD2 = D2(Integer.MIN_VALUE);
        if (iD2 != Integer.MIN_VALUE && (i10 = this.f58016u.i() - iD2) > 0) {
            int i11 = i10 - (-Z2(-i10, wVar, b10));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f58016u.r(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean B() {
        return this.f58018w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean C() {
        return this.f58018w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean D(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void F(int i10, int i11, RecyclerView.B b10, RecyclerView.p.c cVar) {
        int iL;
        int iP;
        if (this.f58018w != 0) {
            i10 = i11;
        }
        if (b0() == 0 || i10 == 0) {
            return;
        }
        S2(i10, b10);
        int[] iArr = this.f58012O;
        if (iArr == null || iArr.length < this.f58014s) {
            this.f58012O = new int[this.f58014s];
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f58014s; i13++) {
            o oVar = this.f58020y;
            if (oVar.f58285d == -1) {
                iL = oVar.f58287f;
                iP = this.f58015t[i13].p(iL);
            } else {
                iL = this.f58015t[i13].l(oVar.f58288g);
                iP = this.f58020y.f58288g;
            }
            int i14 = iL - iP;
            if (i14 >= 0) {
                this.f58012O[i12] = i14;
                i12++;
            }
        }
        Arrays.sort(this.f58012O, 0, i12);
        for (int i15 = 0; i15 < i12 && this.f58020y.a(b10); i15++) {
            cVar.a(this.f58020y.f58284c, this.f58012O[i15]);
            o oVar2 = this.f58020y;
            oVar2.f58284c += oVar2.f58285d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean H0() {
        return this.f58003F != 0;
    }

    public int I2() {
        return this.f58018w;
    }

    public boolean J2() {
        return this.f58021z;
    }

    public void M2() {
        this.f58002E.b();
        K1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void O1(int i10) {
        e eVar = this.f58006I;
        if (eVar != null && eVar.f58038a != i10) {
            eVar.a();
        }
        this.f58000C = i10;
        this.f58001D = Integer.MIN_VALUE;
        K1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.f58002E.b();
        for (int i10 = 0; i10 < this.f58014s; i10++) {
            this.f58015t[i10].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q V() {
        return this.f58018w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q W(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q X(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        p pVar = new p(recyclerView.getContext());
        pVar.p(i10);
        a2(pVar);
    }

    public void a3(int i10, int i11) {
        e eVar = this.f58006I;
        if (eVar != null) {
            eVar.a();
        }
        this.f58000C = i10;
        this.f58001D = i11;
        K1();
    }

    public void c3(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        w(null);
        if (i10 == this.f58018w) {
            return;
        }
        this.f58018w = i10;
        t tVar = this.f58016u;
        this.f58016u = this.f58017v;
        this.f58017v = tVar;
        K1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean d2() {
        return this.f58006I == null;
    }

    boolean g2() {
        int iL = this.f58015t[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f58014s; i10++) {
            if (this.f58015t[i10].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    boolean h2() {
        int iP = this.f58015t[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f58014s; i10++) {
            if (this.f58015t[i10].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i1(RecyclerView recyclerView) {
        this.f58002E.b();
        K1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(RecyclerView recyclerView, int i10, int i11, int i12) {
        K2(i10, i11, 8);
    }

    void k3(int i10) {
        this.f58019x = i10 / this.f58014s;
        this.f58007J = View.MeasureSpec.makeMeasureSpec(i10, this.f58017v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void s1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.f58006I = eVar;
            if (this.f58000C != -1) {
                eVar.a();
                this.f58006I.b();
            }
            K1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable t1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.f58006I != null) {
            return new e(this.f58006I);
        }
        e eVar = new e();
        eVar.f58045h = this.f58021z;
        eVar.f58046i = this.f58004G;
        eVar.f58047j = this.f58005H;
        d dVar = this.f58002E;
        if (dVar == null || (iArr = dVar.f58032a) == null) {
            eVar.f58042e = 0;
        } else {
            eVar.f58043f = iArr;
            eVar.f58042e = iArr.length;
            eVar.f58044g = dVar.f58033b;
        }
        if (b0() <= 0) {
            eVar.f58038a = -1;
            eVar.f58039b = -1;
            eVar.f58040c = 0;
            return eVar;
        }
        eVar.f58038a = this.f58004G ? C2() : B2();
        eVar.f58039b = x2();
        int i10 = this.f58014s;
        eVar.f58040c = i10;
        eVar.f58041d = new int[i10];
        for (int i11 = 0; i11 < this.f58014s; i11++) {
            if (this.f58004G) {
                iP = this.f58015t[i11].l(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f58016u.i();
                    iP -= iM;
                }
            } else {
                iP = this.f58015t[i11].p(Integer.MIN_VALUE);
                if (iP != Integer.MIN_VALUE) {
                    iM = this.f58016u.m();
                    iP -= iM;
                }
            }
            eVar.f58041d[i11] = iP;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void u1(int i10) {
        if (i10 == 0) {
            k2();
        }
    }

    View v2(boolean z10) {
        int iM = this.f58016u.m();
        int i10 = this.f58016u.i();
        View view = null;
        for (int iB0 = b0() - 1; iB0 >= 0; iB0--) {
            View viewA0 = a0(iB0);
            int iG = this.f58016u.g(viewA0);
            int iD = this.f58016u.d(viewA0);
            if (iD > iM && iG < i10) {
                if (iD <= i10 || !z10) {
                    return viewA0;
                }
                if (view == null) {
                    view = viewA0;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void w(String str) {
        if (this.f58006I == null) {
            super.w(str);
        }
    }

    View w2(boolean z10) {
        int iM = this.f58016u.m();
        int i10 = this.f58016u.i();
        int iB0 = b0();
        View view = null;
        for (int i11 = 0; i11 < iB0; i11++) {
            View viewA0 = a0(i11);
            int iG = this.f58016u.g(viewA0);
            if (this.f58016u.d(viewA0) > iM && iG < i10) {
                if (iG >= iM || !z10) {
                    return viewA0;
                }
                if (view == null) {
                    view = viewA0;
                }
            }
        }
        return view;
    }

    int x2() {
        View viewV2 = this.f57998A ? v2(true) : w2(true);
        if (viewV2 == null) {
            return -1;
        }
        return v0(viewV2);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.p.d dVarW0 = RecyclerView.p.w0(context, attributeSet, i10, i11);
        c3(dVarW0.f57973a);
        e3(dVarW0.f57974b);
        d3(dVarW0.f57975c);
        this.f58020y = new o();
        s2();
    }

    private void A2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10) {
        int iM;
        int iG2 = G2(a.e.API_PRIORITY_OTHER);
        if (iG2 != Integer.MAX_VALUE && (iM = iG2 - this.f58016u.m()) > 0) {
            int iZ2 = iM - Z2(iM, wVar, b10);
            if (z10 && iZ2 > 0) {
                this.f58016u.r(-iZ2);
            }
        }
    }

    private void V2(RecyclerView.w wVar, int i10) {
        for (int iB0 = b0() - 1; iB0 >= 0; iB0--) {
            View viewA0 = a0(iB0);
            if (this.f58016u.g(viewA0) >= i10 && this.f58016u.q(viewA0) >= i10) {
                c cVar = (c) viewA0.getLayoutParams();
                if (cVar.f58031f) {
                    for (int i11 = 0; i11 < this.f58014s; i11++) {
                        if (this.f58015t[i11].f58048a.size() == 1) {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f58014s; i12++) {
                        this.f58015t[i12].s();
                    }
                } else if (cVar.f58030e.f58048a.size() != 1) {
                    cVar.f58030e.s();
                } else {
                    return;
                }
                D1(viewA0, wVar);
            } else {
                return;
            }
        }
    }

    private void W2(RecyclerView.w wVar, int i10) {
        while (b0() > 0) {
            View viewA0 = a0(0);
            if (this.f58016u.d(viewA0) <= i10 && this.f58016u.p(viewA0) <= i10) {
                c cVar = (c) viewA0.getLayoutParams();
                if (cVar.f58031f) {
                    for (int i11 = 0; i11 < this.f58014s; i11++) {
                        if (this.f58015t[i11].f58048a.size() == 1) {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f58014s; i12++) {
                        this.f58015t[i12].t();
                    }
                } else if (cVar.f58030e.f58048a.size() != 1) {
                    cVar.f58030e.t();
                } else {
                    return;
                }
                D1(viewA0, wVar);
            } else {
                return;
            }
        }
    }

    private int j2(int i10) {
        boolean z10;
        if (b0() == 0) {
            if (!this.f57998A) {
                return -1;
            }
            return 1;
        }
        if (i10 < B2()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.f57998A) {
            return -1;
        }
        return 1;
    }

    private void l3(f fVar, int i10, int i11) {
        int iJ = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + iJ <= i11) {
                this.f57999B.set(fVar.f58052e, false);
            }
        } else if (fVar.k() - iJ >= i11) {
            this.f57999B.set(fVar.f58052e, false);
        }
    }

    private int m2(RecyclerView.B b10) {
        if (b0() == 0) {
            return 0;
        }
        return w.a(b10, this.f58016u, w2(!this.f58011N), v2(!this.f58011N), this, this.f58011N);
    }

    private int n2(RecyclerView.B b10) {
        if (b0() == 0) {
            return 0;
        }
        return w.b(b10, this.f58016u, w2(!this.f58011N), v2(!this.f58011N), this, this.f58011N, this.f57998A);
    }

    private int o2(RecyclerView.B b10) {
        if (b0() == 0) {
            return 0;
        }
        return w.c(b10, this.f58016u, w2(!this.f58011N), v2(!this.f58011N), this, this.f58011N);
    }

    private int u2(int i10) {
        int iB0 = b0();
        for (int i11 = 0; i11 < iB0; i11++) {
            int iV0 = v0(a0(i11));
            if (iV0 >= 0 && iV0 < i10) {
                return iV0;
            }
        }
        return 0;
    }

    private int y2(int i10) {
        for (int iB0 = b0() - 1; iB0 >= 0; iB0--) {
            int iV0 = v0(a0(iB0));
            if (iV0 >= 0 && iV0 < i10) {
                return iV0;
            }
        }
        return 0;
    }

    int B2() {
        if (b0() == 0) {
            return 0;
        }
        return v0(a0(0));
    }

    int C2() {
        int iB0 = b0();
        if (iB0 == 0) {
            return 0;
        }
        return v0(a0(iB0 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int H(RecyclerView.B b10) {
        return m2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int I(RecyclerView.B b10) {
        return n2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int J(RecyclerView.B b10) {
        return o2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int K(RecyclerView.B b10) {
        return m2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int L(RecyclerView.B b10) {
        return n2(b10);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View L2() {
        /*
            r12 = this;
            int r0 = r12.b0()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f58014s
            r2.<init>(r3)
            int r3 = r12.f58014s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f58018w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.N2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f57998A
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.a0(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f58030e
            int r9 = r9.f58052e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f58030e
            boolean r9 = r12.l2(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f58030e
            int r9 = r9.f58052e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f58031f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.a0(r9)
            boolean r10 = r12.f57998A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.t r10 = r12.f58016u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.t r11 = r12.f58016u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.t r10 = r12.f58016u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.t r11 = r12.f58016u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f58030e
            int r8 = r8.f58052e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f58030e
            int r9 = r9.f58052e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.L2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int M(RecyclerView.B b10) {
        return o2(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int N1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        return Z2(i10, wVar, b10);
    }

    boolean N2() {
        if (r0() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int P1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        return Z2(i10, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(int i10) {
        super.S0(i10);
        for (int i11 = 0; i11 < this.f58014s; i11++) {
            this.f58015t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(int i10) {
        super.T0(i10);
        for (int i11 = 0; i11 < this.f58014s; i11++) {
            this.f58015t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T1(Rect rect, int i10, int i11) {
        int iE;
        int iE2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f58018w == 1) {
            iE2 = RecyclerView.p.E(i11, rect.height() + paddingTop, t0());
            iE = RecyclerView.p.E(i10, (this.f58019x * this.f58014s) + paddingLeft, u0());
        } else {
            iE = RecyclerView.p.E(i10, rect.width() + paddingLeft, u0());
            iE2 = RecyclerView.p.E(i11, (this.f58019x * this.f58014s) + paddingTop, t0());
        }
        S1(iE, iE2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Y0(recyclerView, wVar);
        F1(this.f58013P);
        for (int i10 = 0; i10 < this.f58014s; i10++) {
            this.f58015t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View Z0(View view, int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        View viewT;
        int iB2;
        boolean z10;
        boolean z11;
        int iG;
        int iG2;
        int iG3;
        View viewM;
        if (b0() == 0 || (viewT = T(view)) == null) {
            return null;
        }
        Y2();
        int iP2 = p2(i10);
        if (iP2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewT.getLayoutParams();
        boolean z12 = cVar.f58031f;
        f fVar = cVar.f58030e;
        if (iP2 == 1) {
            iB2 = C2();
        } else {
            iB2 = B2();
        }
        j3(iB2, b10);
        b3(iP2);
        o oVar = this.f58020y;
        oVar.f58284c = oVar.f58285d + iB2;
        oVar.f58283b = (int) (this.f58016u.n() * 0.33333334f);
        o oVar2 = this.f58020y;
        oVar2.f58289h = true;
        oVar2.f58282a = false;
        t2(wVar, oVar2, b10);
        this.f58004G = this.f57998A;
        if (!z12 && (viewM = fVar.m(iB2, iP2)) != null && viewM != viewT) {
            return viewM;
        }
        if (R2(iP2)) {
            for (int i11 = this.f58014s - 1; i11 >= 0; i11--) {
                View viewM2 = this.f58015t[i11].m(iB2, iP2);
                if (viewM2 != null && viewM2 != viewT) {
                    return viewM2;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f58014s; i12++) {
                View viewM3 = this.f58015t[i12].m(iB2, iP2);
                if (viewM3 != null && viewM3 != viewT) {
                    return viewM3;
                }
            }
        }
        boolean z13 = !this.f58021z;
        if (iP2 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z13 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z12) {
            if (z11) {
                iG3 = fVar.f();
            } else {
                iG3 = fVar.g();
            }
            View viewU = U(iG3);
            if (viewU != null && viewU != viewT) {
                return viewU;
            }
        }
        if (R2(iP2)) {
            for (int i13 = this.f58014s - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f58052e) {
                    if (z11) {
                        iG2 = this.f58015t[i13].f();
                    } else {
                        iG2 = this.f58015t[i13].g();
                    }
                    View viewU2 = U(iG2);
                    if (viewU2 != null && viewU2 != viewT) {
                        return viewU2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f58014s; i14++) {
                if (z11) {
                    iG = this.f58015t[i14].f();
                } else {
                    iG = this.f58015t[i14].g();
                }
                View viewU3 = U(iG);
                if (viewU3 != null && viewU3 != viewT) {
                    return viewU3;
                }
            }
        }
        return null;
    }

    int Z2(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        if (b0() == 0 || i10 == 0) {
            return 0;
        }
        S2(i10, b10);
        int iT2 = t2(wVar, this.f58020y, b10);
        if (this.f58020y.f58283b >= iT2) {
            if (i10 < 0) {
                i10 = -iT2;
            } else {
                i10 = iT2;
            }
        }
        this.f58016u.r(-i10);
        this.f58004G = this.f57998A;
        o oVar = this.f58020y;
        oVar.f58283b = 0;
        U2(wVar, oVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void a1(AccessibilityEvent accessibilityEvent) {
        super.a1(accessibilityEvent);
        if (b0() > 0) {
            View viewW2 = w2(false);
            View viewV2 = v2(false);
            if (viewW2 != null && viewV2 != null) {
                int iV0 = v0(viewW2);
                int iV02 = v0(viewV2);
                if (iV0 < iV02) {
                    accessibilityEvent.setFromIndex(iV0);
                    accessibilityEvent.setToIndex(iV02);
                } else {
                    accessibilityEvent.setFromIndex(iV02);
                    accessibilityEvent.setToIndex(iV0);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF e(int i10) {
        int iJ2 = j2(i10);
        PointF pointF = new PointF();
        if (iJ2 == 0) {
            return null;
        }
        if (this.f58018w == 0) {
            pointF.x = iJ2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = iJ2;
        return pointF;
    }

    boolean h3(RecyclerView.B b10, b bVar) {
        int i10;
        int iB2;
        int iM;
        boolean z10 = false;
        if (!b10.e() && (i10 = this.f58000C) != -1) {
            if (i10 >= 0 && i10 < b10.b()) {
                e eVar = this.f58006I;
                if (eVar != null && eVar.f58038a != -1 && eVar.f58040c >= 1) {
                    bVar.f58024b = Integer.MIN_VALUE;
                    bVar.f58023a = this.f58000C;
                } else {
                    View viewU = U(this.f58000C);
                    if (viewU != null) {
                        if (this.f57998A) {
                            iB2 = C2();
                        } else {
                            iB2 = B2();
                        }
                        bVar.f58023a = iB2;
                        if (this.f58001D != Integer.MIN_VALUE) {
                            if (bVar.f58025c) {
                                bVar.f58024b = (this.f58016u.i() - this.f58001D) - this.f58016u.d(viewU);
                            } else {
                                bVar.f58024b = (this.f58016u.m() + this.f58001D) - this.f58016u.g(viewU);
                            }
                            return true;
                        }
                        if (this.f58016u.e(viewU) > this.f58016u.n()) {
                            if (bVar.f58025c) {
                                iM = this.f58016u.i();
                            } else {
                                iM = this.f58016u.m();
                            }
                            bVar.f58024b = iM;
                            return true;
                        }
                        int iG = this.f58016u.g(viewU) - this.f58016u.m();
                        if (iG < 0) {
                            bVar.f58024b = -iG;
                            return true;
                        }
                        int i11 = this.f58016u.i() - this.f58016u.d(viewU);
                        if (i11 < 0) {
                            bVar.f58024b = i11;
                            return true;
                        }
                        bVar.f58024b = Integer.MIN_VALUE;
                    } else {
                        int i12 = this.f58000C;
                        bVar.f58023a = i12;
                        int i13 = this.f58001D;
                        if (i13 == Integer.MIN_VALUE) {
                            if (j2(i12) == 1) {
                                z10 = true;
                            }
                            bVar.f58025c = z10;
                            bVar.a();
                        } else {
                            bVar.b(i13);
                        }
                        bVar.f58026d = true;
                    }
                }
                return true;
            }
            this.f58000C = -1;
            this.f58001D = Integer.MIN_VALUE;
        }
        return false;
    }

    void i3(RecyclerView.B b10, b bVar) {
        if (h3(b10, bVar) || g3(b10, bVar)) {
            return;
        }
        bVar.a();
        bVar.f58023a = 0;
    }

    boolean k2() {
        int iB2;
        int iC2;
        int i10;
        if (b0() == 0 || this.f58003F == 0 || !G0()) {
            return false;
        }
        if (this.f57998A) {
            iB2 = C2();
            iC2 = B2();
        } else {
            iB2 = B2();
            iC2 = C2();
        }
        if (iB2 == 0 && L2() != null) {
            this.f58002E.b();
            L1();
            K1();
            return true;
        }
        if (!this.f58010M) {
            return false;
        }
        if (this.f57998A) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        int i11 = iC2 + 1;
        d.a aVarE = this.f58002E.e(iB2, i11, i10, true);
        if (aVarE == null) {
            this.f58010M = false;
            this.f58002E.d(i11);
            return false;
        }
        d.a aVarE2 = this.f58002E.e(iB2, aVarE.f58034a, i10 * (-1), true);
        if (aVarE2 == null) {
            this.f58002E.d(aVarE.f58034a);
        } else {
            this.f58002E.d(aVarE2.f58034a + 1);
        }
        L1();
        K1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o1(RecyclerView.B b10) {
        super.o1(b10);
        this.f58000C = -1;
        this.f58001D = Integer.MIN_VALUE;
        this.f58006I = null;
        this.f58009L.c();
    }
}
