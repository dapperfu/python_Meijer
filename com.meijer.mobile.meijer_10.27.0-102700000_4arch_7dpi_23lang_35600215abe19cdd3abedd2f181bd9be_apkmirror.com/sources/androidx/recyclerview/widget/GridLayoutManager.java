package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import java.util.Arrays;
import q2.y;

/* loaded from: classes4.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I, reason: collision with root package name */
    boolean f57847I;

    /* renamed from: J, reason: collision with root package name */
    int f57848J;

    /* renamed from: K, reason: collision with root package name */
    int[] f57849K;

    /* renamed from: L, reason: collision with root package name */
    View[] f57850L;

    /* renamed from: M, reason: collision with root package name */
    final SparseIntArray f57851M;

    /* renamed from: N, reason: collision with root package name */
    final SparseIntArray f57852N;

    /* renamed from: O, reason: collision with root package name */
    c f57853O;

    /* renamed from: P, reason: collision with root package name */
    final Rect f57854P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f57855Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanIndex(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int getSpanSize(int i10) {
            return 1;
        }
    }

    public static class b extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        int f57856e;

        /* renamed from: f, reason: collision with root package name */
        int f57857f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f57856e = -1;
            this.f57857f = 0;
        }

        public int f() {
            return this.f57856e;
        }

        public int g() {
            return this.f57857f;
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f57856e = -1;
            this.f57857f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f57856e = -1;
            this.f57857f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f57856e = -1;
            this.f57857f = 0;
        }
    }

    public static abstract class c {
        final SparseIntArray mSpanIndexCache = new SparseIntArray();
        final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
        private boolean mCacheSpanIndices = false;
        private boolean mCacheSpanGroupIndices = false;

        public abstract int getSpanSize(int i10);

        int getCachedSpanGroupIndex(int i10, int i11) {
            if (!this.mCacheSpanGroupIndices) {
                return getSpanGroupIndex(i10, i11);
            }
            int i12 = this.mSpanGroupIndexCache.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int spanGroupIndex = getSpanGroupIndex(i10, i11);
            this.mSpanGroupIndexCache.put(i10, spanGroupIndex);
            return spanGroupIndex;
        }

        int getCachedSpanIndex(int i10, int i11) {
            if (!this.mCacheSpanIndices) {
                return getSpanIndex(i10, i11);
            }
            int i12 = this.mSpanIndexCache.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int spanIndex = getSpanIndex(i10, i11);
            this.mSpanIndexCache.put(i10, spanIndex);
            return spanIndex;
        }

        public int getSpanGroupIndex(int i10, int i11) {
            int i12;
            int i13;
            int cachedSpanIndex;
            int iFindFirstKeyLessThan;
            if (!this.mCacheSpanGroupIndices || (iFindFirstKeyLessThan = findFirstKeyLessThan(this.mSpanGroupIndexCache, i10)) == -1) {
                i12 = 0;
                i13 = 0;
                cachedSpanIndex = 0;
            } else {
                i12 = this.mSpanGroupIndexCache.get(iFindFirstKeyLessThan);
                i13 = iFindFirstKeyLessThan + 1;
                cachedSpanIndex = getCachedSpanIndex(iFindFirstKeyLessThan, i11) + getSpanSize(iFindFirstKeyLessThan);
                if (cachedSpanIndex == i11) {
                    i12++;
                    cachedSpanIndex = 0;
                }
            }
            int spanSize = getSpanSize(i10);
            while (i13 < i10) {
                int spanSize2 = getSpanSize(i13);
                cachedSpanIndex += spanSize2;
                if (cachedSpanIndex == i11) {
                    i12++;
                    cachedSpanIndex = 0;
                } else if (cachedSpanIndex > i11) {
                    i12++;
                    cachedSpanIndex = spanSize2;
                }
                i13++;
            }
            return cachedSpanIndex + spanSize > i11 ? i12 + 1 : i12;
        }

        public void invalidateSpanGroupIndexCache() {
            this.mSpanGroupIndexCache.clear();
        }

        public void invalidateSpanIndexCache() {
            this.mSpanIndexCache.clear();
        }

        public boolean isSpanGroupIndexCacheEnabled() {
            return this.mCacheSpanGroupIndices;
        }

        public boolean isSpanIndexCacheEnabled() {
            return this.mCacheSpanIndices;
        }

        public void setSpanGroupIndexCacheEnabled(boolean z10) {
            if (!z10) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanGroupIndices = z10;
        }

        public void setSpanIndexCacheEnabled(boolean z10) {
            if (!z10) {
                this.mSpanGroupIndexCache.clear();
            }
            this.mCacheSpanIndices = z10;
        }

        static int findFirstKeyLessThan(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 >= 0 && i13 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i13);
            }
            return -1;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int getSpanIndex(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.getSpanSize(r6)
                r1 = 0
                if (r0 != r7) goto L8
                return r1
            L8:
                boolean r2 = r5.mCacheSpanIndices
                if (r2 == 0) goto L20
                android.util.SparseIntArray r2 = r5.mSpanIndexCache
                int r2 = findFirstKeyLessThan(r2, r6)
                if (r2 < 0) goto L20
                android.util.SparseIntArray r3 = r5.mSpanIndexCache
                int r3 = r3.get(r2)
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                goto L30
            L20:
                r2 = r1
                r3 = r2
            L22:
                if (r2 >= r6) goto L33
                int r4 = r5.getSpanSize(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L2d
                r3 = r1
                goto L30
            L2d:
                if (r3 <= r7) goto L30
                r3 = r4
            L30:
                int r2 = r2 + 1
                goto L22
            L33:
                int r0 = r0 + r3
                if (r0 > r7) goto L37
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.getSpanIndex(int, int):int");
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f57847I = false;
        this.f57848J = -1;
        this.f57851M = new SparseIntArray();
        this.f57852N = new SparseIntArray();
        this.f57853O = new a();
        this.f57854P = new Rect();
        w3(RecyclerView.p.w0(context, attributeSet, i10, i11).f57974b);
    }

    private void f3(RecyclerView.w wVar, RecyclerView.B b10, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i12 = i10;
            i11 = 0;
        } else {
            i11 = i10 - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View view = this.f57850L[i11];
            b bVar = (b) view.getLayoutParams();
            int iS3 = s3(wVar, b10, v0(view));
            bVar.f57857f = iS3;
            bVar.f57856e = i14;
            i14 += iS3;
            i11 += i13;
        }
    }

    static int[] i3(int[] iArr, int i10, int i11) {
        int i12;
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void m3(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int iR3 = r3(wVar, b10, aVar.f57875b);
        if (z10) {
            while (iR3 > 0) {
                int i11 = aVar.f57875b;
                if (i11 <= 0) {
                    return;
                }
                int i12 = i11 - 1;
                aVar.f57875b = i12;
                iR3 = r3(wVar, b10, i12);
            }
            return;
        }
        int iB = b10.b() - 1;
        int i13 = aVar.f57875b;
        while (i13 < iB) {
            int i14 = i13 + 1;
            int iR32 = r3(wVar, b10, i14);
            if (iR32 <= iR3) {
                break;
            }
            i13 = i14;
            iR3 = iR32;
        }
        aVar.f57875b = i13;
    }

    private void h3(int i10) {
        this.f57849K = i3(this.f57849K, this.f57848J, i10);
    }

    private void j3() {
        this.f57851M.clear();
        this.f57852N.clear();
    }

    private void n3() {
        View[] viewArr = this.f57850L;
        if (viewArr == null || viewArr.length != this.f57848J) {
            this.f57850L = new View[this.f57848J];
        }
    }

    private void t3(float f10, int i10) {
        h3(Math.max(Math.round(f10 * this.f57848J), i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean D(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int I(RecyclerView.B b10) {
        return this.f57855Q ? k3(b10) : super.I(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int J(RecyclerView.B b10) {
        return this.f57855Q ? l3(b10) : super.J(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void J2(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int paddingLeft;
        int paddingTop;
        int iF;
        int iF2;
        int i12;
        int iC0;
        int iC02;
        View viewD;
        int iL = this.f57868u.l();
        boolean z10 = iL != 1073741824;
        int i13 = b0() > 0 ? this.f57849K[this.f57848J] : 0;
        if (z10) {
            y3();
        }
        boolean z11 = cVar.f57887e == 1;
        int iR3 = this.f57848J;
        if (!z11) {
            iR3 = r3(wVar, b10, cVar.f57886d) + s3(wVar, b10, cVar.f57886d);
        }
        int i14 = 0;
        while (i14 < this.f57848J && cVar.c(b10) && iR3 > 0) {
            int i15 = cVar.f57886d;
            int iS3 = s3(wVar, b10, i15);
            if (iS3 > this.f57848J) {
                throw new IllegalArgumentException("Item at position " + i15 + " requires " + iS3 + " spans but GridLayoutManager has only " + this.f57848J + " spans.");
            }
            iR3 -= iS3;
            if (iR3 < 0 || (viewD = cVar.d(wVar)) == null) {
                break;
            }
            this.f57850L[i14] = viewD;
            i14++;
        }
        if (i14 == 0) {
            bVar.f57880b = true;
            return;
        }
        f3(wVar, b10, i14, z11);
        float f10 = 0.0f;
        int i16 = 0;
        for (int i17 = 0; i17 < i14; i17++) {
            View view = this.f57850L[i17];
            if (cVar.f57894l == null) {
                if (z11) {
                    t(view);
                } else {
                    u(view, 0);
                }
            } else if (z11) {
                r(view);
            } else {
                s(view, 0);
            }
            A(view, this.f57854P);
            u3(view, iL, false);
            int iE = this.f57868u.e(view);
            if (iE > i16) {
                i16 = iE;
            }
            float f11 = (this.f57868u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f57857f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            t3(f10, i13);
            i16 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f57850L[i18];
                u3(view2, 1073741824, true);
                int iE2 = this.f57868u.e(view2);
                if (iE2 > i16) {
                    i16 = iE2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f57850L[i19];
            if (this.f57868u.e(view3) != i16) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f57978b;
                int i20 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i21 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iO3 = o3(bVar2.f57856e, bVar2.f57857f);
                if (this.f57866s == 1) {
                    iC02 = RecyclerView.p.c0(iO3, 1073741824, i21, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iC0 = View.MeasureSpec.makeMeasureSpec(i16 - i20, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - i21, 1073741824);
                    iC0 = RecyclerView.p.c0(iO3, 1073741824, i20, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iC02 = iMakeMeasureSpec;
                }
                v3(view3, iC02, iC0, true);
            }
        }
        bVar.f57879a = i16;
        if (this.f57866s == 1) {
            if (cVar.f57888f == -1) {
                iF2 = cVar.f57884b;
                i12 = iF2 - i16;
            } else {
                i12 = cVar.f57884b;
                iF2 = i12 + i16;
            }
            paddingTop = i12;
            iF = 0;
            paddingLeft = 0;
        } else {
            if (cVar.f57888f == -1) {
                i11 = cVar.f57884b;
                i10 = i11 - i16;
            } else {
                i10 = cVar.f57884b;
                i11 = i10 + i16;
            }
            paddingLeft = i10;
            paddingTop = 0;
            iF = i11;
            iF2 = 0;
        }
        for (int i22 = 0; i22 < i14; i22++) {
            View view4 = this.f57850L[i22];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f57866s != 1) {
                paddingTop = this.f57849K[bVar3.f57856e] + getPaddingTop();
                iF2 = this.f57868u.f(view4) + paddingTop;
            } else if (H2()) {
                iF = getPaddingLeft() + this.f57849K[this.f57848J - bVar3.f57856e];
                paddingLeft = iF - this.f57868u.f(view4);
            } else {
                paddingLeft = this.f57849K[bVar3.f57856e] + getPaddingLeft();
                iF = this.f57868u.f(view4) + paddingLeft;
            }
            int i23 = iF2;
            int i24 = paddingTop;
            int i25 = iF;
            int i26 = paddingLeft;
            P0(view4, i26, i24, i25, i23);
            iF2 = i23;
            paddingLeft = i26;
            iF = i25;
            paddingTop = i24;
            if (bVar3.d() || bVar3.c()) {
                bVar.f57881c = true;
            }
            bVar.f57882d = view4.hasFocusable() | bVar.f57882d;
        }
        Arrays.fill(this.f57850L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int L(RecyclerView.B b10) {
        return this.f57855Q ? k3(b10) : super.L(b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int M(RecyclerView.B b10) {
        return this.f57855Q ? l3(b10) : super.M(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T1(Rect rect, int i10, int i11) {
        int iE;
        int iE2;
        if (this.f57849K == null) {
            super.T1(rect, i10, i11);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f57866s == 1) {
            iE2 = RecyclerView.p.E(i11, rect.height() + paddingTop, t0());
            int[] iArr = this.f57849K;
            iE = RecyclerView.p.E(i10, iArr[iArr.length - 1] + paddingLeft, u0());
        } else {
            iE = RecyclerView.p.E(i10, rect.width() + paddingLeft, u0());
            int[] iArr2 = this.f57849K;
            iE2 = RecyclerView.p.E(i11, iArr2[iArr2.length - 1] + paddingTop, t0());
        }
        S1(iE, iE2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q V() {
        return this.f57866s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q W(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void W2(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.W2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q X(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View Z0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.B r27) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Z0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean d2() {
        return this.f57861D == null && !this.f57847I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int f0(RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f57866s == 1) {
            return this.f57848J;
        }
        if (b10.b() < 1) {
            return 0;
        }
        return q3(wVar, b10, b10.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void f2(RecyclerView.B b10, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int spanSize = this.f57848J;
        for (int i10 = 0; i10 < this.f57848J && cVar.c(b10) && spanSize > 0; i10++) {
            int i11 = cVar.f57886d;
            cVar2.a(i11, Math.max(0, cVar.f57889g));
            spanSize -= this.f57853O.getSpanSize(i11);
            cVar.f57886d += cVar.f57887e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h1(RecyclerView recyclerView, int i10, int i11) {
        this.f57853O.invalidateSpanIndexCache();
        this.f57853O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i1(RecyclerView recyclerView) {
        this.f57853O.invalidateSpanIndexCache();
        this.f57853O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.f57853O.invalidateSpanIndexCache();
        this.f57853O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void k1(RecyclerView recyclerView, int i10, int i11) {
        this.f57853O.invalidateSpanIndexCache();
        this.f57853O.invalidateSpanGroupIndexCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void m1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.f57853O.invalidateSpanIndexCache();
        this.f57853O.invalidateSpanGroupIndexCache();
    }

    int o3(int i10, int i11) {
        if (this.f57866s != 1 || !H2()) {
            int[] iArr = this.f57849K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f57849K;
        int i12 = this.f57848J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public int p3() {
        return this.f57848J;
    }

    public void w3(int i10) {
        if (i10 == this.f57848J) {
            return;
        }
        this.f57847I = true;
        if (i10 >= 1) {
            this.f57848J = i10;
            this.f57853O.invalidateSpanIndexCache();
            K1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    public void x3(c cVar) {
        this.f57853O = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y0(RecyclerView.w wVar, RecyclerView.B b10) {
        if (this.f57866s == 0) {
            return this.f57848J;
        }
        if (b10.b() < 1) {
            return 0;
        }
        return q3(wVar, b10, b10.b() - 1) + 1;
    }

    private void g3() {
        int iB0 = b0();
        for (int i10 = 0; i10 < iB0; i10++) {
            b bVar = (b) a0(i10).getLayoutParams();
            int iB = bVar.b();
            this.f57851M.put(iB, bVar.g());
            this.f57852N.put(iB, bVar.f());
        }
    }

    private int k3(RecyclerView.B b10) {
        int iMax;
        if (b0() != 0 && b10.b() != 0) {
            l2();
            boolean zI2 = I2();
            View viewQ2 = q2(!zI2, true);
            View viewP2 = p2(!zI2, true);
            if (viewQ2 != null && viewP2 != null) {
                int cachedSpanGroupIndex = this.f57853O.getCachedSpanGroupIndex(v0(viewQ2), this.f57848J);
                int cachedSpanGroupIndex2 = this.f57853O.getCachedSpanGroupIndex(v0(viewP2), this.f57848J);
                int iMin = Math.min(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int iMax2 = Math.max(cachedSpanGroupIndex, cachedSpanGroupIndex2);
                int cachedSpanGroupIndex3 = this.f57853O.getCachedSpanGroupIndex(b10.b() - 1, this.f57848J) + 1;
                if (this.f57871x) {
                    iMax = Math.max(0, (cachedSpanGroupIndex3 - iMax2) - 1);
                } else {
                    iMax = Math.max(0, iMin);
                }
                if (!zI2) {
                    return iMax;
                }
                return Math.round((iMax * (Math.abs(this.f57868u.d(viewP2) - this.f57868u.g(viewQ2)) / ((this.f57853O.getCachedSpanGroupIndex(v0(viewP2), this.f57848J) - this.f57853O.getCachedSpanGroupIndex(v0(viewQ2), this.f57848J)) + 1))) + (this.f57868u.m() - this.f57868u.g(viewQ2)));
            }
        }
        return 0;
    }

    private int l3(RecyclerView.B b10) {
        if (b0() != 0 && b10.b() != 0) {
            l2();
            View viewQ2 = q2(!I2(), true);
            View viewP2 = p2(!I2(), true);
            if (viewQ2 != null && viewP2 != null) {
                if (!I2()) {
                    return this.f57853O.getCachedSpanGroupIndex(b10.b() - 1, this.f57848J) + 1;
                }
                int iD = this.f57868u.d(viewP2) - this.f57868u.g(viewQ2);
                int cachedSpanGroupIndex = this.f57853O.getCachedSpanGroupIndex(v0(viewQ2), this.f57848J);
                return (int) ((iD / ((this.f57853O.getCachedSpanGroupIndex(v0(viewP2), this.f57848J) - cachedSpanGroupIndex) + 1)) * (this.f57853O.getCachedSpanGroupIndex(b10.b() - 1, this.f57848J) + 1));
            }
        }
        return 0;
    }

    private int q3(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f57853O.getCachedSpanGroupIndex(i10, this.f57848J);
        }
        int iG = wVar.g(i10);
        if (iG == -1) {
            FS.log_w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
            return 0;
        }
        return this.f57853O.getCachedSpanGroupIndex(iG, this.f57848J);
    }

    private int r3(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f57853O.getCachedSpanIndex(i10, this.f57848J);
        }
        int i11 = this.f57852N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iG = wVar.g(i10);
        if (iG == -1) {
            FS.log_w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 0;
        }
        return this.f57853O.getCachedSpanIndex(iG, this.f57848J);
    }

    private int s3(RecyclerView.w wVar, RecyclerView.B b10, int i10) {
        if (!b10.e()) {
            return this.f57853O.getSpanSize(i10);
        }
        int i11 = this.f57851M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iG = wVar.g(i10);
        if (iG == -1) {
            FS.log_w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
            return 1;
        }
        return this.f57853O.getSpanSize(iG);
    }

    private void u3(View view, int i10, boolean z10) {
        int iC0;
        int iC02;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f57978b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iO3 = o3(bVar.f57856e, bVar.f57857f);
        if (this.f57866s == 1) {
            iC02 = RecyclerView.p.c0(iO3, i10, i12, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iC0 = RecyclerView.p.c0(this.f57868u.n(), p0(), i11, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iC03 = RecyclerView.p.c0(iO3, i10, i11, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iC04 = RecyclerView.p.c0(this.f57868u.n(), D0(), i12, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iC0 = iC03;
            iC02 = iC04;
        }
        v3(view, iC02, iC0, z10);
    }

    private void v3(View view, int i10, int i11, boolean z10) {
        boolean zW1;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10) {
            zW1 = Y1(view, i10, i11, qVar);
        } else {
            zW1 = W1(view, i10, i11, qVar);
        }
        if (zW1) {
            view.measure(i10, i11);
        }
    }

    private void y3() {
        int iO0;
        int paddingTop;
        if (F2() == 1) {
            iO0 = C0() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            iO0 = o0() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        h3(iO0 - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void L2(RecyclerView.w wVar, RecyclerView.B b10, LinearLayoutManager.a aVar, int i10) {
        super.L2(wVar, b10, aVar, i10);
        y3();
        if (b10.b() > 0 && !b10.e()) {
            m3(wVar, b10, aVar, i10);
        }
        n3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int N1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        y3();
        n3();
        return super.N1(i10, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int P1(int i10, RecyclerView.w wVar, RecyclerView.B b10) {
        y3();
        n3();
        return super.P1(i10, wVar, b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.w wVar, RecyclerView.B b10, q2.y yVar) {
        super.c1(wVar, b10, yVar);
        yVar.p0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void f1(RecyclerView.w wVar, RecyclerView.B b10, View view, q2.y yVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.e1(view, yVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iQ3 = q3(wVar, b10, bVar.b());
        if (this.f57866s == 0) {
            yVar.s0(y.f.a(bVar.f(), bVar.g(), iQ3, 1, false, false));
        } else {
            yVar.s0(y.f.a(iQ3, 1, bVar.f(), bVar.g(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void n1(RecyclerView.w wVar, RecyclerView.B b10) {
        if (b10.e()) {
            g3();
        }
        super.n1(wVar, b10);
        j3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void o1(RecyclerView.B b10) {
        super.o1(b10);
        this.f57847I = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View z2(RecyclerView.w wVar, RecyclerView.B b10, boolean z10, boolean z11) {
        int i10;
        int iB0;
        int iB02 = b0();
        int i11 = 1;
        if (z11) {
            iB0 = b0() - 1;
            i10 = -1;
            i11 = -1;
        } else {
            i10 = iB02;
            iB0 = 0;
        }
        int iB = b10.b();
        l2();
        int iM = this.f57868u.m();
        int i12 = this.f57868u.i();
        View view = null;
        View view2 = null;
        while (iB0 != i10) {
            View viewA0 = a0(iB0);
            int iV0 = v0(viewA0);
            if (iV0 >= 0 && iV0 < iB && r3(wVar, b10, iV0) == 0) {
                if (((RecyclerView.q) viewA0.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = viewA0;
                    }
                } else {
                    if (this.f57868u.g(viewA0) < i12 && this.f57868u.d(viewA0) >= iM) {
                        return viewA0;
                    }
                    if (view == null) {
                        view = viewA0;
                    }
                }
            }
            iB0 += i11;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        this.f57847I = false;
        this.f57848J = -1;
        this.f57851M = new SparseIntArray();
        this.f57852N = new SparseIntArray();
        this.f57853O = new a();
        this.f57854P = new Rect();
        w3(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        this.f57847I = false;
        this.f57848J = -1;
        this.f57851M = new SparseIntArray();
        this.f57852N = new SparseIntArray();
        this.f57853O = new a();
        this.f57854P = new Rect();
        w3(i10);
    }
}
