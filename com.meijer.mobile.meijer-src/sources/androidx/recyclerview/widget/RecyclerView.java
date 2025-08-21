package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.A;
import androidx.recyclerview.widget.C6256a;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.z;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.gms.common.api.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p2.C16340A;
import p2.C16342C;
import p2.C16345a0;
import p2.InterfaceC16341B;
import q2.C16595b;
import q2.y;
import q4.C16600a;
import q4.C16601b;
import q4.C16603d;
import v2.C17624a;
import w2.AbstractC17821a;

/* loaded from: classes4.dex */
public class RecyclerView extends ViewGroup implements InterfaceC16341B, FSDraw, FSDispatchDraw {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled;
    static final C sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled;
    androidx.recyclerview.widget.v mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    h mAdapter;
    C6256a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private k mChildDrawingOrderCallback;
    f mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.k mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private t mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    m mItemAnimator;
    private m.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    p mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final y mObserver;
    private List<r> mOnChildAttachStateListeners;
    private s mOnFlingListener;
    private final ArrayList<t> mOnItemTouchListeners;
    final List<F> mPendingAccessibilityImportanceChange;
    z mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    k.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final w mRecycler;
    x mRecyclerListener;
    final List<x> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private u mScrollListener;
    private List<u> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C16342C mScrollingChildHelper;
    final B mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final E mViewFlinger;
    private final A.b mViewInfoProcessCallback;
    final androidx.recyclerview.widget.A mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public static abstract class A {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView f58124b;

        /* renamed from: c, reason: collision with root package name */
        private p f58125c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f58126d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f58127e;

        /* renamed from: f, reason: collision with root package name */
        private View f58128f;

        /* renamed from: h, reason: collision with root package name */
        private boolean f58130h;

        /* renamed from: a, reason: collision with root package name */
        private int f58123a = -1;

        /* renamed from: g, reason: collision with root package name */
        private final a f58129g = new a(0, 0);

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f58131a;

            /* renamed from: b, reason: collision with root package name */
            private int f58132b;

            /* renamed from: c, reason: collision with root package name */
            private int f58133c;

            /* renamed from: d, reason: collision with root package name */
            private int f58134d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f58135e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f58136f;

            /* renamed from: g, reason: collision with root package name */
            private int f58137g;

            public a(int i10, int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f58134d = -1;
                this.f58136f = false;
                this.f58137g = 0;
                this.f58131a = i10;
                this.f58132b = i11;
                this.f58133c = i12;
                this.f58135e = interpolator;
            }

            private void e() {
                if (this.f58135e != null && this.f58133c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f58133c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f58134d >= 0;
            }

            public void b(int i10) {
                this.f58134d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f58134d;
                if (i10 >= 0) {
                    this.f58134d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i10);
                    this.f58136f = false;
                } else {
                    if (!this.f58136f) {
                        this.f58137g = 0;
                        return;
                    }
                    e();
                    recyclerView.mViewFlinger.g(this.f58131a, this.f58132b, this.f58133c, this.f58135e);
                    int i11 = this.f58137g + 1;
                    this.f58137g = i11;
                    if (i11 > 10) {
                        FS.log_e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f58136f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f58131a = i10;
                this.f58132b = i11;
                this.f58133c = i12;
                this.f58135e = interpolator;
                this.f58136f = true;
            }
        }

        public interface b {
            PointF e(int i10);
        }

        protected abstract void l(int i10, int i11, B b10, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, B b10, a aVar);

        public View b(int i10) {
            return this.f58124b.mLayout.U(i10);
        }

        public int c() {
            return this.f58124b.mLayout.b0();
        }

        public int d(View view) {
            return this.f58124b.getChildLayoutPosition(view);
        }

        public p e() {
            return this.f58125c;
        }

        public int f() {
            return this.f58123a;
        }

        public boolean g() {
            return this.f58126d;
        }

        public boolean h() {
            return this.f58127e;
        }

        protected void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.f58124b;
            if (this.f58123a == -1 || recyclerView == null) {
                r();
            }
            if (this.f58126d && this.f58128f == null && this.f58125c != null && (pointFA = a(this.f58123a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f58126d = false;
            View view = this.f58128f;
            if (view != null) {
                if (d(view) == this.f58123a) {
                    o(this.f58128f, recyclerView.mState, this.f58129g);
                    this.f58129g.c(recyclerView);
                    r();
                } else {
                    FS.log_e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f58128f = null;
                }
            }
            if (this.f58127e) {
                l(i10, i11, recyclerView.mState, this.f58129g);
                boolean zA = this.f58129g.a();
                this.f58129g.c(recyclerView);
                if (zA && this.f58127e) {
                    this.f58126d = true;
                    recyclerView.mViewFlinger.f();
                }
            }
        }

        public void p(int i10) {
            this.f58123a = i10;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.mViewFlinger.h();
            if (this.f58130h) {
                FS.log_w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f58124b = recyclerView;
            this.f58125c = pVar;
            int i10 = this.f58123a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f58138a = i10;
            this.f58127e = true;
            this.f58126d = true;
            this.f58128f = b(f());
            m();
            this.f58124b.mViewFlinger.f();
            this.f58130h = true;
        }

        protected final void r() {
            if (this.f58127e) {
                this.f58127e = false;
                n();
                this.f58124b.mState.f58138a = -1;
                this.f58128f = null;
                this.f58123a = -1;
                this.f58126d = false;
                this.f58125c.v1(this);
                this.f58125c = null;
                this.f58124b = null;
            }
        }

        public PointF a(int i10) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).e(i10);
            }
            FS.log_w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f58128f = view;
                if (RecyclerView.sVerboseLoggingEnabled) {
                    FS.log_d(RecyclerView.TAG, "smooth scroll target view has been attached");
                }
            }
        }
    }

    public static class B {

        /* renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f58139b;

        /* renamed from: m, reason: collision with root package name */
        int f58150m;

        /* renamed from: n, reason: collision with root package name */
        long f58151n;

        /* renamed from: o, reason: collision with root package name */
        int f58152o;

        /* renamed from: p, reason: collision with root package name */
        int f58153p;

        /* renamed from: q, reason: collision with root package name */
        int f58154q;

        /* renamed from: a, reason: collision with root package name */
        int f58138a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f58140c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f58141d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f58142e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f58143f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f58144g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f58145h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f58146i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f58147j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f58148k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f58149l = false;

        void f(h hVar) {
            this.f58142e = 1;
            this.f58143f = hVar.getItemCount();
            this.f58145h = false;
            this.f58146i = false;
            this.f58147j = false;
        }

        void a(int i10) {
            if ((this.f58142e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f58142e));
        }

        public int b() {
            return this.f58145h ? this.f58140c - this.f58141d : this.f58143f;
        }

        public int c() {
            return this.f58138a;
        }

        public boolean d() {
            return this.f58138a != -1;
        }

        public boolean e() {
            return this.f58145h;
        }

        public boolean g() {
            return this.f58149l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f58138a + ", mData=" + this.f58139b + ", mItemCount=" + this.f58143f + ", mIsMeasuring=" + this.f58147j + ", mPreviousLayoutItemCount=" + this.f58140c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f58141d + ", mStructureChanged=" + this.f58144g + ", mInPreLayout=" + this.f58145h + ", mRunSimpleAnimations=" + this.f58148k + ", mRunPredictiveAnimations=" + this.f58149l + '}';
        }
    }

    static class C extends l {
        @Override // androidx.recyclerview.widget.RecyclerView.l
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            Context context = recyclerView.getContext();
            return FS.maybeWrapEdgeEffect(new EdgeEffect(context), context);
        }

        C() {
        }
    }

    public static abstract class D {
    }

    class E implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private int f58155a;

        /* renamed from: b, reason: collision with root package name */
        private int f58156b;

        /* renamed from: c, reason: collision with root package name */
        OverScroller f58157c;

        /* renamed from: d, reason: collision with root package name */
        Interpolator f58158d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f58159e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f58160f;

        E() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f58158d = interpolator;
            this.f58159e = false;
            this.f58160f = false;
            this.f58157c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private void e() {
            RecyclerView.this.removeCallbacks(this);
            ViewCompat.e0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f58156b = 0;
            this.f58155a = 0;
            Interpolator interpolator = this.f58158d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f58158d = interpolator2;
                this.f58157c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f58157c.fling(0, 0, i10, i11, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER, Integer.MIN_VALUE, a.e.API_PRIORITY_OTHER);
            f();
        }

        void f() {
            if (this.f58159e) {
                this.f58160f = true;
            } else {
                e();
            }
        }

        public void g(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f58158d != interpolator) {
                this.f58158d = interpolator;
                this.f58157c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f58156b = 0;
            this.f58155a = 0;
            RecyclerView.this.setScrollState(2);
            this.f58157c.startScroll(0, 0, i10, i11, i13);
            f();
        }

        public void h() {
            RecyclerView.this.removeCallbacks(this);
            this.f58157c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                h();
                return;
            }
            this.f58160f = false;
            this.f58159e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f58157c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f58155a;
                int i13 = currY - this.f58156b;
                this.f58155a = currX;
                this.f58156b = currY;
                int iConsumeFlingInHorizontalStretch = RecyclerView.this.consumeFlingInHorizontalStretch(i12);
                int iConsumeFlingInVerticalStretch = RecyclerView.this.consumeFlingInVerticalStretch(i13);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    iConsumeFlingInHorizontalStretch -= iArr2[0];
                    iConsumeFlingInVerticalStretch -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(iConsumeFlingInHorizontalStretch, iConsumeFlingInVerticalStretch, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    int i14 = iArr4[0];
                    int i15 = iArr4[1];
                    iConsumeFlingInHorizontalStretch -= i14;
                    iConsumeFlingInVerticalStretch -= i15;
                    A a10 = recyclerView4.mLayout.f58183g;
                    if (a10 != null && !a10.g() && a10.h()) {
                        int iB = RecyclerView.this.mState.b();
                        if (iB == 0) {
                            a10.r();
                        } else if (a10.f() >= iB) {
                            a10.p(iB - 1);
                            a10.j(i14, i15);
                        } else {
                            a10.j(i14, i15);
                        }
                    }
                    i11 = i15;
                    i10 = i14;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i16 = iConsumeFlingInHorizontalStretch;
                int i17 = iConsumeFlingInVerticalStretch;
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i10, i11, i16, i17, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i18 = i16 - iArr6[0];
                int i19 = i17 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.dispatchOnScrolled(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
                A a11 = RecyclerView.this.mLayout.f58183g;
                if ((a11 == null || !a11.g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i20 = i18 < 0 ? -currVelocity : i18 > 0 ? currVelocity : 0;
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i20, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                } else {
                    f();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.k kVar = recyclerView7.mGapWorker;
                    if (kVar != null) {
                        kVar.f(recyclerView7, i10, i11);
                    }
                }
            }
            A a12 = RecyclerView.this.mLayout.f58183g;
            if (a12 != null && a12.g()) {
                a12.j(0, 0);
            }
            this.f58159e = false;
            if (this.f58160f) {
                e();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }

        private int a(int i10, int i11) {
            boolean z10;
            int height;
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            if (iAbs > iAbs2) {
                z10 = true;
            } else {
                z10 = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z10) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z10) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / height) + 1.0f) * 300.0f), RecyclerView.MAX_SCROLL_DURATION);
        }
    }

    public static abstract class F {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        h<? extends F> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        F mShadowedHolder = null;
        F mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                FS.log_e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.mFlags |= 16;
            } else if (z10 && i11 == 0) {
                this.mFlags &= -17;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                FS.log_d(RecyclerView.TAG, "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && ViewCompat.P(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        public final h<? extends F> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i10) {
            return (i10 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !ViewCompat.P(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f58203c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = ViewCompat.x(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        void setScrapContainer(w wVar, boolean z10) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z10;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        void unScrap() {
            this.mScrapContainer.P(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        public F(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    class RunnableC6250a implements Runnable {
        RunnableC6250a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    class RunnableC6251b implements Runnable {
        RunnableC6251b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.mItemAnimator;
            if (mVar != null) {
                mVar.runPendingAnimations();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d, reason: case insensitive filesystem */
    class C6253d implements A.b {
        @Override // androidx.recyclerview.widget.A.b
        public void d(F f10, m.c cVar, m.c cVar2) {
            f10.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.animateChange(f10, f10, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.animatePersistence(f10, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }

        C6253d() {
        }

        @Override // androidx.recyclerview.widget.A.b
        public void a(F f10, m.c cVar, m.c cVar2) {
            RecyclerView.this.animateAppearance(f10, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.A.b
        public void b(F f10) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.D1(f10.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.A.b
        public void c(F f10, m.c cVar, m.c cVar2) {
            RecyclerView.this.mRecycler.P(f10);
            RecyclerView.this.animateDisappearance(f10, cVar, cVar2);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e, reason: case insensitive filesystem */
    class C6254e implements f.b {
        C6254e() {
        }

        @Override // androidx.recyclerview.widget.f.b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.f.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.f.b
        public void f(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public int h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void j(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void b(View view) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public F d(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void e(int i10) {
            View viewA = a(i10);
            if (viewA != null) {
                F childViewHolderInt = RecyclerView.getChildViewHolderInt(viewA);
                if (childViewHolderInt != null) {
                    if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        FS.log_d(RecyclerView.TAG, "tmpDetach " + childViewHolderInt);
                    }
                    childViewHolderInt.addFlags(256);
                }
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.exceptionLabel());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void g() {
            int iC = c();
            for (int i10 = 0; i10 < iC; i10++) {
                View viewA = a(i10);
                RecyclerView.this.dispatchChildDetached(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.f.b
        public void i(View view) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public void k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    FS.log_d(RecyclerView.TAG, "reAttach " + childViewHolderInt);
                }
                childViewHolderInt.clearTmpDetachFlag();
            } else if (RecyclerView.sDebugAssertionsEnabled) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.exceptionLabel());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f, reason: case insensitive filesystem */
    class C6255f implements C6256a.InterfaceC1148a {
        C6255f() {
        }

        @Override // androidx.recyclerview.widget.C6256a.InterfaceC1148a
        public void a(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForMove(i10, i11);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C6256a.InterfaceC1148a
        public void d(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForRemove(i10, i11, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C6256a.InterfaceC1148a
        public void e(int i10, int i11, Object obj) {
            RecyclerView.this.viewRangeUpdate(i10, i11, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.C6256a.InterfaceC1148a
        public F f(int i10) {
            F fFindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i10, true);
            if (fFindViewHolderForPosition == null) {
                return null;
            }
            if (!RecyclerView.this.mChildHelper.n(fFindViewHolderForPosition.itemView)) {
                return fFindViewHolderForPosition;
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                FS.log_d(RecyclerView.TAG, "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.C6256a.InterfaceC1148a
        public void g(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForInsert(i10, i11);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C6256a.InterfaceC1148a
        public void h(int i10, int i11) {
            RecyclerView.this.offsetPositionRecordsForRemove(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f58141d += i11;
        }

        void i(C6256a.b bVar) {
            int i10 = bVar.f58286a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.h1(recyclerView, bVar.f58287b, bVar.f58289d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.k1(recyclerView2, bVar.f58287b, bVar.f58289d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.m1(recyclerView3, bVar.f58287b, bVar.f58289d, bVar.f58288c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.j1(recyclerView4, bVar.f58287b, bVar.f58289d, 1);
            }
        }

        @Override // androidx.recyclerview.widget.C6256a.InterfaceC1148a
        public void b(C6256a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.C6256a.InterfaceC1148a
        public void c(C6256a.b bVar) {
            i(bVar);
        }
    }

    public static abstract class h<VH extends F> {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public int findRelativeAdapterPositionIn(h<? extends F> hVar, F f10, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh2, int i10);

        public void onBindViewHolder(VH vh2, int i10, List<Object> list) {
            onBindViewHolder(vh2, i10);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i10);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh2) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh2) {
        }

        public void onViewDetachedFromWindow(VH vh2) {
        }

        public void onViewRecycled(VH vh2) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(VH vh2, int i10) {
            boolean z10 = vh2.mBindingAdapter == null;
            if (z10) {
                vh2.mPosition = i10;
                if (hasStableIds()) {
                    vh2.mItemId = getItemId(i10);
                }
                vh2.setFlags(1, 519);
                j2.n.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh2.mBindingAdapter = this;
            if (RecyclerView.sDebugAssertionsEnabled) {
                if (vh2.itemView.getParent() == null && ViewCompat.R(vh2.itemView) != vh2.isTmpDetached()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + vh2.isTmpDetached() + ", attached to window: " + ViewCompat.R(vh2.itemView) + ", holder: " + vh2);
                }
                if (vh2.itemView.getParent() == null && ViewCompat.R(vh2.itemView)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + vh2);
                }
            }
            onBindViewHolder(vh2, i10, vh2.getUnmodifiedPayloads());
            if (z10) {
                vh2.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f58203c = true;
                }
                j2.n.b();
            }
        }

        boolean canRestoreState() {
            int i10 = g.f58167a[this.mStateRestorationPolicy.ordinal()];
            return i10 != 1 && (i10 != 2 || getItemCount() > 0);
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i10) {
            try {
                j2.n.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh2 = (VH) onCreateViewHolder(viewGroup, i10);
                if (vh2.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh2.mItemViewType = i10;
                return vh2;
            } finally {
                j2.n.b();
            }
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10, Object obj) {
            this.mObservable.e(i10, 1, obj);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.f(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
            this.mObservable.e(i10, i11, obj);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.g(i10, 1);
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public void setHasStableIds(boolean z10) {
            if (!hasObservers()) {
                this.mHasStableIds = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }

    static class i extends Observable<j> {
        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i10, i11, 1);
            }
        }

        public void e(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).g();
            }
        }

        i() {
        }
    }

    public interface k {
        int a(int i10, int i11);
    }

    public static class l {
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            throw null;
        }
    }

    public static abstract class m {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private b mListener = null;
        private ArrayList<a> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(F f10);
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public int f58172a;

            /* renamed from: b, reason: collision with root package name */
            public int f58173b;

            /* renamed from: c, reason: collision with root package name */
            public int f58174c;

            /* renamed from: d, reason: collision with root package name */
            public int f58175d;

            public c a(F f10) {
                return b(f10, 0);
            }

            public c b(F f10, int i10) {
                View view = f10.itemView;
                this.f58172a = view.getLeft();
                this.f58173b = view.getTop();
                this.f58174c = view.getRight();
                this.f58175d = view.getBottom();
                return this;
            }
        }

        public abstract boolean animateAppearance(F f10, c cVar, c cVar2);

        public abstract boolean animateChange(F f10, F f11, c cVar, c cVar2);

        public abstract boolean animateDisappearance(F f10, c cVar, c cVar2);

        public abstract boolean animatePersistence(F f10, c cVar, c cVar2);

        public boolean canReuseUpdatedViewHolder(F f10) {
            return true;
        }

        public abstract void endAnimation(F f10);

        public abstract void endAnimations();

        public abstract boolean isRunning();

        public final boolean isRunning(a aVar) {
            boolean zIsRunning = isRunning();
            if (aVar != null) {
                if (!zIsRunning) {
                    aVar.a();
                    return zIsRunning;
                }
                this.mFinishedListeners.add(aVar);
            }
            return zIsRunning;
        }

        public void onAnimationFinished(F f10) {
        }

        public void onAnimationStarted(F f10) {
        }

        public abstract void runPendingAnimations();

        static int buildAdapterChangeFlagsForAnimations(F f10) {
            int i10 = f10.mFlags;
            int i11 = i10 & 14;
            if (f10.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int oldPosition = f10.getOldPosition();
                int absoluteAdapterPosition = f10.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i11 | FLAG_MOVED;
                }
            }
            return i11;
        }

        public boolean canReuseUpdatedViewHolder(F f10, List<Object> list) {
            return canReuseUpdatedViewHolder(f10);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.mFinishedListeners.get(i10).a();
            }
            this.mFinishedListeners.clear();
        }

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public c obtainHolderInfo() {
            return new c();
        }

        public void setAddDuration(long j10) {
            this.mAddDuration = j10;
        }

        public void setChangeDuration(long j10) {
            this.mChangeDuration = j10;
        }

        void setListener(b bVar) {
            this.mListener = bVar;
        }

        public void setMoveDuration(long j10) {
            this.mMoveDuration = j10;
        }

        public void setRemoveDuration(long j10) {
            this.mRemoveDuration = j10;
        }

        public final void dispatchAnimationFinished(F f10) {
            onAnimationFinished(f10);
            b bVar = this.mListener;
            if (bVar != null) {
                bVar.a(f10);
            }
        }

        public final void dispatchAnimationStarted(F f10) {
            onAnimationStarted(f10);
        }

        public c recordPostLayoutInformation(B b10, F f10) {
            return obtainHolderInfo().a(f10);
        }

        public c recordPreLayoutInformation(B b10, F f10, int i10, List<Object> list) {
            return obtainHolderInfo().a(f10);
        }
    }

    private class n implements m.b {
        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(F f10) {
            f10.setIsRecyclable(true);
            if (f10.mShadowedHolder != null && f10.mShadowingHolder == null) {
                f10.mShadowedHolder = null;
            }
            f10.mShadowingHolder = null;
            if (f10.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(f10.itemView) || !f10.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f10.itemView, false);
        }

        n() {
        }
    }

    public static abstract class o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, B b10) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).b(), recyclerView);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, B b10) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, B b10) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class p {

        /* renamed from: a, reason: collision with root package name */
        f f58177a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView f58178b;

        /* renamed from: c, reason: collision with root package name */
        private final z.b f58179c;

        /* renamed from: d, reason: collision with root package name */
        private final z.b f58180d;

        /* renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.z f58181e;

        /* renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.z f58182f;

        /* renamed from: g, reason: collision with root package name */
        A f58183g;

        /* renamed from: h, reason: collision with root package name */
        boolean f58184h;

        /* renamed from: i, reason: collision with root package name */
        boolean f58185i;

        /* renamed from: j, reason: collision with root package name */
        boolean f58186j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f58187k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f58188l;

        /* renamed from: m, reason: collision with root package name */
        int f58189m;

        /* renamed from: n, reason: collision with root package name */
        boolean f58190n;

        /* renamed from: o, reason: collision with root package name */
        private int f58191o;

        /* renamed from: p, reason: collision with root package name */
        private int f58192p;

        /* renamed from: q, reason: collision with root package name */
        private int f58193q;

        /* renamed from: r, reason: collision with root package name */
        private int f58194r;

        class a implements z.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.z.b
            public View a(int i10) {
                return p.this.a0(i10);
            }

            @Override // androidx.recyclerview.widget.z.b
            public int c() {
                return p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int d() {
                return p.this.C0() - p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int b(View view) {
                return p.this.i0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public int e(View view) {
                return p.this.l0(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements z.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.z.b
            public View a(int i10) {
                return p.this.a0(i10);
            }

            @Override // androidx.recyclerview.widget.z.b
            public int c() {
                return p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int d() {
                return p.this.o0() - p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int b(View view) {
                return p.this.m0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public int e(View view) {
                return p.this.g0(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f58197a;

            /* renamed from: b, reason: collision with root package name */
            public int f58198b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f58199c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f58200d;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int c0(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.c0(int, int, int, int, boolean):int");
        }

        public boolean B() {
            return false;
        }

        public boolean C() {
            return false;
        }

        public boolean D(q qVar) {
            return qVar != null;
        }

        @SuppressLint({"UnknownNullness"})
        public void F(int i10, int i11, B b10, c cVar) {
        }

        @SuppressLint({"UnknownNullness"})
        public void G(int i10, c cVar) {
        }

        public int H(B b10) {
            return 0;
        }

        public int I(B b10) {
            return 0;
        }

        public boolean I1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return J1(recyclerView, view, rect, z10, false);
        }

        public int J(B b10) {
            return 0;
        }

        public int K(B b10) {
            return 0;
        }

        public boolean K0(w wVar, B b10) {
            return false;
        }

        public int L(B b10) {
            return 0;
        }

        public void L1() {
            this.f58184h = true;
        }

        public int M(B b10) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public int N1(int i10, w wVar, B b10) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public int P1(int i10, w wVar, B b10) {
            return 0;
        }

        void R(RecyclerView recyclerView) {
            this.f58185i = true;
            W0(recyclerView);
        }

        void S(RecyclerView recyclerView, w wVar) {
            this.f58185i = false;
            Y0(recyclerView, wVar);
        }

        public void U0(h hVar, h hVar2) {
        }

        @SuppressLint({"UnknownNullness"})
        public abstract q V();

        public boolean V0(RecyclerView recyclerView, ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        public void W0(RecyclerView recyclerView) {
        }

        @Deprecated
        public void X0(RecyclerView recyclerView) {
        }

        boolean X1() {
            return false;
        }

        public int Y() {
            return -1;
        }

        public View Z0(View view, int i10, w wVar, B b10) {
            return null;
        }

        public boolean d2() {
            return false;
        }

        public int f0(w wVar, B b10) {
            return -1;
        }

        public void f1(w wVar, B b10, View view, q2.y yVar) {
        }

        public View g1(View view, int i10) {
            return null;
        }

        public void h1(RecyclerView recyclerView, int i10, int i11) {
        }

        public void i1(RecyclerView recyclerView) {
        }

        public void j1(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public void k1(RecyclerView recyclerView, int i10, int i11) {
        }

        public void l1(RecyclerView recyclerView, int i10, int i11) {
        }

        @SuppressLint({"UnknownNullness"})
        public void o1(B b10) {
        }

        @SuppressLint({"UnknownNullness"})
        public void r(View view) {
            s(view, -1);
        }

        @SuppressLint({"UnknownNullness"})
        public void s(View view, int i10) {
            v(view, i10, true);
        }

        @SuppressLint({"UnknownNullness"})
        public void s1(Parcelable parcelable) {
        }

        @SuppressLint({"UnknownNullness"})
        public void t(View view) {
            u(view, -1);
        }

        public Parcelable t1() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void u(View view, int i10) {
            v(view, i10, false);
        }

        public void u1(int i10) {
        }

        public void x(View view) {
            y(view, -1);
        }

        public int y0(w wVar, B b10) {
            return -1;
        }

        public int z0(w wVar, B b10) {
            return 0;
        }

        public boolean z1(w wVar, B b10, View view, int i10, Bundle bundle) {
            return false;
        }

        private void Q(int i10, View view) {
            this.f58177a.d(i10);
        }

        public static d w0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16603d.f157879a, i10, i11);
            dVar.f58197a = typedArrayObtainStyledAttributes.getInt(C16603d.f157880b, 1);
            dVar.f58198b = typedArrayObtainStyledAttributes.getInt(C16603d.f157890l, 1);
            dVar.f58199c = typedArrayObtainStyledAttributes.getBoolean(C16603d.f157889k, false);
            dVar.f58200d = typedArrayObtainStyledAttributes.getBoolean(C16603d.f157891m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public void A(View view, Rect rect) {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public void B0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((q) view.getLayoutParams()).f58202b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f58178b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f58178b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int C0() {
            return this.f58193q;
        }

        public int D0() {
            return this.f58191o;
        }

        public boolean F1(Runnable runnable) {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public boolean G0() {
            return this.f58185i;
        }

        @SuppressLint({"UnknownNullness"})
        public void G1(View view) {
            this.f58177a.p(view);
        }

        public boolean H0() {
            return this.f58186j;
        }

        public final boolean J0() {
            return this.f58188l;
        }

        public void K1() {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public boolean L0() {
            return this.f58187k;
        }

        public boolean N0() {
            A a10 = this.f58183g;
            return a10 != null && a10.h();
        }

        public void O(View view) {
            int iM = this.f58177a.m(view);
            if (iM >= 0) {
                Q(iM, view);
            }
        }

        public boolean O0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f58181e.b(view, 24579) && this.f58182f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public void O1(int i10) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                FS.log_e(RecyclerView.TAG, "You MUST implement scrollToPosition. It will soon become abstract");
            }
        }

        public void S0(int i10) {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i10);
            }
        }

        public void S1(int i10, int i11) {
            this.f58178b.setMeasuredDimension(i10, i11);
        }

        public View T(View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f58177a.n(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public void T0(int i10) {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i10);
            }
        }

        void V1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f58178b = null;
                this.f58177a = null;
                this.f58193q = 0;
                this.f58194r = 0;
            } else {
                this.f58178b = recyclerView;
                this.f58177a = recyclerView.mChildHelper;
                this.f58193q = recyclerView.getWidth();
                this.f58194r = recyclerView.getHeight();
            }
            this.f58191o = 1073741824;
            this.f58192p = 1073741824;
        }

        @SuppressLint({"UnknownNullness"})
        public q W(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        @SuppressLint({"UnknownNullness"})
        public q X(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof q ? new q((q) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        boolean Y1(View view, int i10, int i11, q qVar) {
            return (this.f58187k && M0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && M0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        @SuppressLint({"UnknownNullness"})
        public void Z1(RecyclerView recyclerView, B b10, int i10) {
            FS.log_e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int a() {
            RecyclerView recyclerView = this.f58178b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public View a0(int i10) {
            f fVar = this.f58177a;
            if (fVar != null) {
                return fVar.f(i10);
            }
            return null;
        }

        public void a1(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f58178b;
            b1(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        @SuppressLint({"UnknownNullness"})
        public void a2(A a10) {
            A a11 = this.f58183g;
            if (a11 != null && a10 != a11 && a11.h()) {
                this.f58183g.r();
            }
            this.f58183g = a10;
            a10.q(this.f58178b, this);
        }

        public int b0() {
            f fVar = this.f58177a;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        public void b1(w wVar, B b10, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f58178b.canScrollVertically(-1) && !this.f58178b.canScrollHorizontally(-1) && !this.f58178b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.f58178b.mAdapter;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public void c1(w wVar, B b10, q2.y yVar) {
            if (this.f58178b.canScrollVertically(-1) || this.f58178b.canScrollHorizontally(-1)) {
                yVar.a(8192);
                yVar.R0(true);
            }
            if (this.f58178b.canScrollVertically(1) || this.f58178b.canScrollHorizontally(1)) {
                yVar.a(m.FLAG_APPEARED_IN_PRE_LAYOUT);
                yVar.R0(true);
            }
            yVar.r0(y.e.b(y0(wVar, b10), f0(wVar, b10), K0(wVar, b10), z0(wVar, b10)));
        }

        void c2() {
            A a10 = this.f58183g;
            if (a10 != null) {
                a10.r();
            }
        }

        void d1(q2.y yVar) {
            RecyclerView recyclerView = this.f58178b;
            c1(recyclerView.mRecycler, recyclerView.mState, yVar);
        }

        public boolean e0() {
            RecyclerView recyclerView = this.f58178b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView != null) {
                return ViewCompat.D(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView != null) {
                return ViewCompat.E(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public View n0() {
            View focusedChild;
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f58177a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @SuppressLint({"UnknownNullness"})
        public void n1(w wVar, B b10) {
            FS.log_e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int o0() {
            return this.f58194r;
        }

        public int p0() {
            return this.f58192p;
        }

        public void p1(w wVar, B b10, int i10, int i11) {
            this.f58178b.defaultOnMeasure(i10, i11);
        }

        public int r0() {
            return ViewCompat.z(this.f58178b);
        }

        public int t0() {
            return ViewCompat.A(this.f58178b);
        }

        public int u0() {
            return ViewCompat.B(this.f58178b);
        }

        void v1(A a10) {
            if (this.f58183g == a10) {
                this.f58183g = null;
            }
        }

        @SuppressLint({"UnknownNullness"})
        public void w(String str) {
            RecyclerView recyclerView = this.f58178b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        boolean w1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f58178b;
            return x1(recyclerView.mRecycler, recyclerView.mState, i10, bundle);
        }

        public boolean x1(w wVar, B b10, int i10, Bundle bundle) {
            int paddingTop;
            int paddingLeft;
            int i11;
            int i12;
            if (this.f58178b == null) {
                return false;
            }
            int iO0 = o0();
            int iC0 = C0();
            Rect rect = new Rect();
            if (this.f58178b.getMatrix().isIdentity() && this.f58178b.getGlobalVisibleRect(rect)) {
                iO0 = rect.height();
                iC0 = rect.width();
            }
            if (i10 == 4096) {
                paddingTop = this.f58178b.canScrollVertically(1) ? (iO0 - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.f58178b.canScrollHorizontally(1)) {
                    paddingLeft = (iC0 - getPaddingLeft()) - getPaddingRight();
                    i11 = paddingTop;
                    i12 = paddingLeft;
                }
                i11 = paddingTop;
                i12 = 0;
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                paddingTop = this.f58178b.canScrollVertically(-1) ? -((iO0 - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.f58178b.canScrollHorizontally(-1)) {
                    paddingLeft = -((iC0 - getPaddingLeft()) - getPaddingRight());
                    i11 = paddingTop;
                    i12 = paddingLeft;
                }
                i11 = paddingTop;
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f58178b.smoothScrollBy(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        boolean y1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f58178b;
            return z1(recyclerView.mRecycler, recyclerView.mState, view, i10, bundle);
        }

        public p() {
            a aVar = new a();
            this.f58179c = aVar;
            b bVar = new b();
            this.f58180d = bVar;
            this.f58181e = new androidx.recyclerview.widget.z(aVar);
            this.f58182f = new androidx.recyclerview.widget.z(bVar);
            this.f58184h = false;
            this.f58185i = false;
            this.f58186j = false;
            this.f58187k = true;
            this.f58188l = true;
        }

        public static int E(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i11, i12);
                }
                return size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        private boolean I0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int iC0 = C0() - getPaddingRight();
            int iO0 = o0() - getPaddingBottom();
            Rect rect = this.f58178b.mTempRect;
            h0(focusedChild, rect);
            if (rect.left - i10 >= iC0 || rect.right - i10 <= paddingLeft || rect.top - i11 >= iO0 || rect.bottom - i11 <= paddingTop) {
                return false;
            }
            return true;
        }

        private static boolean M0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i10) {
                    return false;
                }
                return true;
            }
            if (size < i10) {
                return false;
            }
            return true;
        }

        private void M1(w wVar, int i10, View view) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    FS.log_d(RecyclerView.TAG, "ignoring view " + childViewHolderInt);
                    return;
                }
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.f58178b.mAdapter.hasStableIds()) {
                H1(i10);
                wVar.I(childViewHolderInt);
            } else {
                P(i10);
                wVar.J(view);
                this.f58178b.mViewInfoStore.k(childViewHolderInt);
            }
        }

        private int[] d0(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int iC0 = C0() - getPaddingRight();
            int iO0 = o0() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - paddingLeft;
            int iMin = Math.min(0, i10);
            int i11 = top - paddingTop;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iC0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iO0);
            if (r0() == 1) {
                if (iMax == 0) {
                    iMax = Math.max(iMin, i12);
                }
            } else {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void v(View view, int i10, boolean z10) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z10 && !childViewHolderInt.isRemoved()) {
                this.f58178b.mViewInfoStore.p(childViewHolderInt);
            } else {
                this.f58178b.mViewInfoStore.b(childViewHolderInt);
            }
            q qVar = (q) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                if (view.getParent() == this.f58178b) {
                    int iM = this.f58177a.m(view);
                    if (i10 == -1) {
                        i10 = this.f58177a.g();
                    }
                    if (iM != -1) {
                        if (iM != i10) {
                            this.f58178b.mLayout.R0(iM, i10);
                        }
                    } else {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f58178b.indexOfChild(view) + this.f58178b.exceptionLabel());
                    }
                } else {
                    this.f58177a.a(view, i10, false);
                    qVar.f58203c = true;
                    A a10 = this.f58183g;
                    if (a10 != null && a10.h()) {
                        this.f58183g.k(view);
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.f58177a.c(view, i10, view.getLayoutParams(), false);
            }
            if (qVar.f58204d) {
                if (RecyclerView.sVerboseLoggingEnabled) {
                    FS.log_d(RecyclerView.TAG, "consuming pending invalidate on child " + qVar.f58201a);
                }
                childViewHolderInt.itemView.invalidate();
                qVar.f58204d = false;
            }
        }

        public int A0(View view) {
            return ((q) view.getLayoutParams()).f58202b.top;
        }

        public void A1() {
            for (int iB0 = b0() - 1; iB0 >= 0; iB0--) {
                this.f58177a.q(iB0);
            }
        }

        public void B1(w wVar) {
            for (int iB0 = b0() - 1; iB0 >= 0; iB0--) {
                if (!RecyclerView.getChildViewHolderInt(a0(iB0)).shouldIgnore()) {
                    E1(iB0, wVar);
                }
            }
        }

        void C1(w wVar) {
            int iK = wVar.k();
            for (int i10 = iK - 1; i10 >= 0; i10--) {
                View viewO = wVar.o(i10);
                F childViewHolderInt = RecyclerView.getChildViewHolderInt(viewO);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f58178b.removeDetachedView(viewO, false);
                    }
                    m mVar = this.f58178b.mItemAnimator;
                    if (mVar != null) {
                        mVar.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    wVar.E(viewO);
                }
            }
            wVar.f();
            if (iK > 0) {
                this.f58178b.invalidate();
            }
        }

        public void D1(View view, w wVar) {
            G1(view);
            wVar.H(view);
        }

        boolean E0() {
            int iB0 = b0();
            for (int i10 = 0; i10 < iB0; i10++) {
                ViewGroup.LayoutParams layoutParams = a0(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void E1(int i10, w wVar) {
            View viewA0 = a0(i10);
            H1(i10);
            wVar.H(viewA0);
        }

        public void F0(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f58178b;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt.addFlags(128);
                this.f58178b.mViewInfoStore.q(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f58178b.exceptionLabel());
            }
        }

        public void H1(int i10) {
            if (a0(i10) != null) {
                this.f58177a.q(i10);
            }
        }

        public boolean J1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] iArrD0 = d0(view, rect);
            int i10 = iArrD0[0];
            int i11 = iArrD0[1];
            if ((z11 && !I0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.smoothScrollBy(i10, i11);
            }
            return true;
        }

        public void N(w wVar) {
            for (int iB0 = b0() - 1; iB0 >= 0; iB0--) {
                M1(wVar, iB0, a0(iB0));
            }
        }

        public void P(int i10) {
            Q(i10, a0(i10));
        }

        public void P0(View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f58202b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void Q0(View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f58178b.getItemDecorInsetsForChild(view);
            int i12 = i10 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i13 = i11 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int iC0 = c0(C0(), D0(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) qVar).width, B());
            int iC02 = c0(o0(), p0(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).height, C());
            if (W1(view, iC0, iC02, qVar)) {
                view.measure(iC0, iC02);
            }
        }

        void Q1(RecyclerView recyclerView) {
            R1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void R0(int i10, int i11) {
            View viewA0 = a0(i10);
            if (viewA0 != null) {
                P(i10);
                y(viewA0, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f58178b.toString());
            }
        }

        void R1(int i10, int i11) {
            this.f58193q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f58191o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f58193q = 0;
            }
            this.f58194r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f58192p = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f58194r = 0;
            }
        }

        public void T1(Rect rect, int i10, int i11) {
            S1(E(i10, rect.width() + getPaddingLeft() + getPaddingRight(), u0()), E(i11, rect.height() + getPaddingTop() + getPaddingBottom(), t0()));
        }

        public View U(int i10) {
            int iB0 = b0();
            for (int i11 = 0; i11 < iB0; i11++) {
                View viewA0 = a0(i11);
                F childViewHolderInt = RecyclerView.getChildViewHolderInt(viewA0);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i10 && !childViewHolderInt.shouldIgnore() && (this.f58178b.mState.e() || !childViewHolderInt.isRemoved())) {
                    return viewA0;
                }
            }
            return null;
        }

        void U1(int i10, int i11) {
            int iB0 = b0();
            if (iB0 == 0) {
                this.f58178b.defaultOnMeasure(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iB0; i16++) {
                View viewA0 = a0(i16);
                Rect rect = this.f58178b.mTempRect;
                h0(viewA0, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f58178b.mTempRect.set(i15, i13, i12, i14);
            T1(this.f58178b.mTempRect, i10, i11);
        }

        boolean W1(View view, int i10, int i11, q qVar) {
            if (!view.isLayoutRequested() && this.f58187k && M0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && M0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) {
                return false;
            }
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public void Y0(RecyclerView recyclerView, w wVar) {
            X0(recyclerView);
        }

        public int Z(View view) {
            return ((q) view.getLayoutParams()).f58202b.bottom;
        }

        public void b2(View view) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        void e1(View view, q2.y yVar) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.f58177a.n(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.f58178b;
                f1(recyclerView.mRecycler, recyclerView.mState, view, yVar);
            }
        }

        public int g0(View view) {
            return view.getBottom() + Z(view);
        }

        public void h0(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int i0(View view) {
            return view.getLeft() - s0(view);
        }

        public int j0(View view) {
            Rect rect = ((q) view.getLayoutParams()).f58202b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int k0(View view) {
            Rect rect = ((q) view.getLayoutParams()).f58202b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int l0(View view) {
            return view.getRight() + x0(view);
        }

        public int m0(View view) {
            return view.getTop() - A0(view);
        }

        public void m1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            l1(recyclerView, i10, i11);
        }

        public int q0(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        @Deprecated
        public boolean q1(RecyclerView recyclerView, View view, View view2) {
            if (!N0() && !recyclerView.isComputingLayout()) {
                return false;
            }
            return true;
        }

        public boolean r1(RecyclerView recyclerView, B b10, View view, View view2) {
            return q1(recyclerView, view, view2);
        }

        public int s0(View view) {
            return ((q) view.getLayoutParams()).f58202b.left;
        }

        public int v0(View view) {
            return ((q) view.getLayoutParams()).b();
        }

        public int x0(View view) {
            return ((q) view.getLayoutParams()).f58202b.right;
        }

        public void y(View view, int i10) {
            z(view, i10, (q) view.getLayoutParams());
        }

        public void z(View view, int i10, q qVar) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.f58178b.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.f58178b.mViewInfoStore.p(childViewHolderInt);
            }
            this.f58177a.c(view, i10, qVar, childViewHolderInt.isRemoved());
        }
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        F f58201a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f58202b;

        /* renamed from: c, reason: collision with root package name */
        boolean f58203c;

        /* renamed from: d, reason: collision with root package name */
        boolean f58204d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f58202b = new Rect();
            this.f58203c = true;
            this.f58204d = false;
        }

        @Deprecated
        public int a() {
            return this.f58201a.getBindingAdapterPosition();
        }

        public int b() {
            return this.f58201a.getLayoutPosition();
        }

        public boolean c() {
            return this.f58201a.isUpdated();
        }

        public boolean d() {
            return this.f58201a.isRemoved();
        }

        public boolean e() {
            return this.f58201a.isInvalid();
        }

        public q(int i10, int i11) {
            super(i10, i11);
            this.f58202b = new Rect();
            this.f58203c = true;
            this.f58204d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f58202b = new Rect();
            this.f58203c = true;
            this.f58204d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f58202b = new Rect();
            this.f58203c = true;
            this.f58204d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f58202b = new Rect();
            this.f58203c = true;
            this.f58204d = false;
        }
    }

    public interface r {
        void b(View view);

        void d(View view);
    }

    public static abstract class s {
        public abstract boolean a(int i10, int i11);
    }

    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z10);
    }

    public static abstract class u {
        public void onScrollStateChanged(RecyclerView recyclerView, int i10) {
        }

        public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class v {

        /* renamed from: a, reason: collision with root package name */
        SparseArray<a> f58205a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        int f58206b = 0;

        /* renamed from: c, reason: collision with root package name */
        Set<h<?>> f58207c = Collections.newSetFromMap(new IdentityHashMap());

        public void c() {
            for (int i10 = 0; i10 < this.f58205a.size(); i10++) {
                a aVarValueAt = this.f58205a.valueAt(i10);
                Iterator<F> it = aVarValueAt.f58208a.iterator();
                while (it.hasNext()) {
                    C17624a.b(it.next().itemView);
                }
                aVarValueAt.f58208a.clear();
            }
        }

        static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList<F> f58208a = new ArrayList<>();

            /* renamed from: b, reason: collision with root package name */
            int f58209b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f58210c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f58211d = 0;

            a() {
            }
        }

        private a i(int i10) {
            a aVar = this.f58205a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f58205a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f58206b++;
        }

        void b(h<?> hVar) {
            this.f58207c.add(hVar);
        }

        void d() {
            this.f58206b--;
        }

        void e(h<?> hVar, boolean z10) {
            this.f58207c.remove(hVar);
            if (this.f58207c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f58205a.size(); i10++) {
                SparseArray<a> sparseArray = this.f58205a;
                ArrayList<F> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f58208a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    C17624a.b(arrayList.get(i11).itemView);
                }
            }
        }

        public F h(int i10) {
            a aVar = this.f58205a.get(i10);
            if (aVar == null || aVar.f58208a.isEmpty()) {
                return null;
            }
            ArrayList<F> arrayList = aVar.f58208a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void j(h<?> hVar, h<?> hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f58206b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        void f(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f58211d = l(aVarI.f58211d, j10);
        }

        void g(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f58210c = l(aVarI.f58210c, j10);
        }

        public void k(F f10) {
            int itemViewType = f10.getItemViewType();
            ArrayList<F> arrayList = i(itemViewType).f58208a;
            if (this.f58205a.get(itemViewType).f58209b <= arrayList.size()) {
                C17624a.b(f10.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(f10)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                f10.resetInternal();
                arrayList.add(f10);
            }
        }

        boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f58211d;
            if (j12 != 0 && j10 + j12 >= j11) {
                return false;
            }
            return true;
        }

        boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f58210c;
            if (j12 != 0 && j10 + j12 >= j11) {
                return false;
            }
            return true;
        }
    }

    public final class w {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList<F> f58212a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList<F> f58213b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<F> f58214c;

        /* renamed from: d, reason: collision with root package name */
        private final List<F> f58215d;

        /* renamed from: e, reason: collision with root package name */
        private int f58216e;

        /* renamed from: f, reason: collision with root package name */
        int f58217f;

        /* renamed from: g, reason: collision with root package name */
        v f58218g;

        private void C(h<?> hVar) {
            D(hVar, false);
        }

        private boolean N(F f10, int i10, int i11, long j10) {
            f10.mBindingAdapter = null;
            f10.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = f10.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != RecyclerView.FOREVER_NS && !this.f58218g.m(itemViewType, nanoTime, j10)) {
                return false;
            }
            if (f10.isTmpDetached()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(f10.itemView, recyclerView.getChildCount(), f10.itemView.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.mAdapter.bindViewHolder(f10, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(f10.itemView);
            }
            this.f58218g.f(f10.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f10);
            if (RecyclerView.this.mState.e()) {
                f10.mPreLayoutPosition = i11;
            }
            return true;
        }

        void B() {
            for (int i10 = 0; i10 < this.f58214c.size(); i10++) {
                C17624a.b(this.f58214c.get(i10).itemView);
            }
            C(RecyclerView.this.mAdapter);
        }

        void L(D d10) {
        }

        void S(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f58214c.size() - 1; size >= 0; size--) {
                F f10 = this.f58214c.get(size);
                if (f10 != null && (i12 = f10.mPosition) >= i10 && i12 < i13) {
                    f10.addFlags(2);
                    G(size);
                }
            }
        }

        public View p(int i10) {
            return q(i10, false);
        }

        public w() {
            ArrayList<F> arrayList = new ArrayList<>();
            this.f58212a = arrayList;
            this.f58213b = null;
            this.f58214c = new ArrayList<>();
            this.f58215d = Collections.unmodifiableList(arrayList);
            this.f58216e = 2;
            this.f58217f = 2;
        }

        private void D(h<?> hVar, boolean z10) {
            v vVar = this.f58218g;
            if (vVar != null) {
                vVar.e(hVar, z10);
            }
        }

        private void b(F f10) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = f10.itemView;
                if (ViewCompat.x(view) == 0) {
                    ViewCompat.w0(view, 1);
                }
                androidx.recyclerview.widget.v vVar = RecyclerView.this.mAccessibilityDelegate;
                if (vVar == null) {
                    return;
                }
                androidx.core.view.a aVarN = vVar.n();
                if (aVarN instanceof v.a) {
                    ((v.a) aVarN).o(view);
                }
                ViewCompat.m0(view, aVarN);
            }
        }

        private void s(F f10) {
            View view = f10.itemView;
            if (view instanceof ViewGroup) {
                r((ViewGroup) view, false);
            }
        }

        private void v() {
            if (this.f58218g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mAdapter == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f58218g.b(RecyclerView.this.mAdapter);
            }
        }

        void F() {
            for (int size = this.f58214c.size() - 1; size >= 0; size--) {
                G(size);
            }
            this.f58214c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }

        void G(int i10) {
            if (RecyclerView.sVerboseLoggingEnabled) {
                FS.log_d(RecyclerView.TAG, "Recycling cached view at index " + i10);
            }
            F f10 = this.f58214c.get(i10);
            if (RecyclerView.sVerboseLoggingEnabled) {
                FS.log_d(RecyclerView.TAG, "CachedViewHolder to be recycled: " + f10);
            }
            a(f10, true);
            this.f58214c.remove(i10);
        }

        void K(v vVar) {
            C(RecyclerView.this.mAdapter);
            v vVar2 = this.f58218g;
            if (vVar2 != null) {
                vVar2.d();
            }
            this.f58218g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f58218g.a();
            }
            v();
        }

        public void M(int i10) {
            this.f58216e = i10;
            Q();
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x021d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0201  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        androidx.recyclerview.widget.RecyclerView.F O(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 604
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.O(int, boolean, long):androidx.recyclerview.widget.RecyclerView$F");
        }

        void P(F f10) {
            if (f10.mInChangeScrap) {
                this.f58213b.remove(f10);
            } else {
                this.f58212a.remove(f10);
            }
            f10.mScrapContainer = null;
            f10.mInChangeScrap = false;
            f10.clearReturnedFromScrapFlag();
        }

        void Q() {
            p pVar = RecyclerView.this.mLayout;
            this.f58217f = this.f58216e + (pVar != null ? pVar.f58189m : 0);
            for (int size = this.f58214c.size() - 1; size >= 0 && this.f58214c.size() > this.f58217f; size--) {
                G(size);
            }
        }

        public void d() {
            this.f58212a.clear();
            F();
        }

        void e() {
            int size = this.f58214c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f58214c.get(i10).clearOldPosition();
            }
            int size2 = this.f58212a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f58212a.get(i11).clearOldPosition();
            }
            ArrayList<F> arrayList = this.f58213b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f58213b.get(i12).clearOldPosition();
                }
            }
        }

        void f() {
            this.f58212a.clear();
            ArrayList<F> arrayList = this.f58213b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int g(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.mState.b()) {
                return !RecyclerView.this.mState.e() ? i10 : RecyclerView.this.mAdapterHelper.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
        }

        void h(F f10) {
            x xVar = RecyclerView.this.mRecyclerListener;
            if (xVar != null) {
                xVar.a(f10);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.mRecyclerListeners.get(i10).a(f10);
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar != null) {
                hVar.onViewRecycled(f10);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(f10);
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                FS.log_d(RecyclerView.TAG, "dispatchViewRecycled: " + f10);
            }
        }

        F i(int i10) {
            int size;
            int iM;
            ArrayList<F> arrayList = this.f58213b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    F f10 = this.f58213b.get(i11);
                    if (!f10.wasReturnedFromScrap() && f10.getLayoutPosition() == i10) {
                        f10.addFlags(32);
                        return f10;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (iM = RecyclerView.this.mAdapterHelper.m(i10)) > 0 && iM < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        F f11 = this.f58213b.get(i12);
                        if (!f11.wasReturnedFromScrap() && f11.getItemId() == itemId) {
                            f11.addFlags(32);
                            return f11;
                        }
                    }
                }
            }
            return null;
        }

        v j() {
            if (this.f58218g == null) {
                this.f58218g = new v();
                v();
            }
            return this.f58218g;
        }

        int k() {
            return this.f58212a.size();
        }

        public List<F> l() {
            return this.f58215d;
        }

        F m(long j10, int i10, boolean z10) {
            for (int size = this.f58212a.size() - 1; size >= 0; size--) {
                F f10 = this.f58212a.get(size);
                if (f10.getItemId() == j10 && !f10.wasReturnedFromScrap()) {
                    if (i10 == f10.getItemViewType()) {
                        f10.addFlags(32);
                        if (f10.isRemoved() && !RecyclerView.this.mState.e()) {
                            f10.setFlags(2, 14);
                        }
                        return f10;
                    }
                    if (!z10) {
                        this.f58212a.remove(size);
                        RecyclerView.this.removeDetachedView(f10.itemView, false);
                        E(f10.itemView);
                    }
                }
            }
            int size2 = this.f58214c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                F f11 = this.f58214c.get(size2);
                if (f11.getItemId() == j10 && !f11.isAttachedToTransitionOverlay()) {
                    if (i10 == f11.getItemViewType()) {
                        if (!z10) {
                            this.f58214c.remove(size2);
                        }
                        return f11;
                    }
                    if (!z10) {
                        G(size2);
                        return null;
                    }
                }
            }
        }

        F n(int i10, boolean z10) {
            View viewE;
            int size = this.f58212a.size();
            for (int i11 = 0; i11 < size; i11++) {
                F f10 = this.f58212a.get(i11);
                if (!f10.wasReturnedFromScrap() && f10.getLayoutPosition() == i10 && !f10.isInvalid() && (RecyclerView.this.mState.f58145h || !f10.isRemoved())) {
                    f10.addFlags(32);
                    return f10;
                }
            }
            if (!z10 && (viewE = RecyclerView.this.mChildHelper.e(i10)) != null) {
                F childViewHolderInt = RecyclerView.getChildViewHolderInt(viewE);
                RecyclerView.this.mChildHelper.s(viewE);
                int iM = RecyclerView.this.mChildHelper.m(viewE);
                if (iM != -1) {
                    RecyclerView.this.mChildHelper.d(iM);
                    J(viewE);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.f58214c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                F f11 = this.f58214c.get(i12);
                if (!f11.isInvalid() && f11.getLayoutPosition() == i10 && !f11.isAttachedToTransitionOverlay()) {
                    if (!z10) {
                        this.f58214c.remove(i12);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        FS.log_d(RecyclerView.TAG, "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + f11);
                    }
                    return f11;
                }
            }
            return null;
        }

        View o(int i10) {
            return this.f58212a.get(i10).itemView;
        }

        void t() {
            int size = this.f58214c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) this.f58214c.get(i10).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f58203c = true;
                }
            }
        }

        void u() {
            int size = this.f58214c.size();
            for (int i10 = 0; i10 < size; i10++) {
                F f10 = this.f58214c.get(i10);
                if (f10 != null) {
                    f10.addFlags(6);
                    f10.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar == null || !hVar.hasStableIds()) {
                F();
            }
        }

        void w(int i10, int i11) {
            int size = this.f58214c.size();
            for (int i12 = 0; i12 < size; i12++) {
                F f10 = this.f58214c.get(i12);
                if (f10 != null && f10.mPosition >= i10) {
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        FS.log_d(RecyclerView.TAG, "offsetPositionRecordsForInsert cached " + i12 + " holder " + f10 + " now at position " + (f10.mPosition + i11));
                    }
                    f10.offsetPosition(i11, false);
                }
            }
        }

        void x(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f58214c.size();
            for (int i16 = 0; i16 < size; i16++) {
                F f10 = this.f58214c.get(i16);
                if (f10 != null && (i15 = f10.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        f10.offsetPosition(i11 - i10, false);
                    } else {
                        f10.offsetPosition(i12, false);
                    }
                    if (RecyclerView.sVerboseLoggingEnabled) {
                        FS.log_d(RecyclerView.TAG, "offsetPositionRecordsForMove cached child " + i16 + " holder " + f10);
                    }
                }
            }
        }

        void y(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f58214c.size() - 1; size >= 0; size--) {
                F f10 = this.f58214c.get(size);
                if (f10 != null) {
                    int i13 = f10.mPosition;
                    if (i13 >= i12) {
                        if (RecyclerView.sVerboseLoggingEnabled) {
                            FS.log_d(RecyclerView.TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + f10 + " now at position " + (f10.mPosition - i11));
                        }
                        f10.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        f10.addFlags(8);
                        G(size);
                    }
                }
            }
        }

        private void r(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    r((ViewGroup) childAt, true);
                }
            }
            if (!z10) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        void A() {
            v();
        }

        void E(View view) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            I(childViewHolderInt);
        }

        public void H(View view) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            I(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
            }
        }

        void I(F f10) {
            boolean z10;
            boolean z11;
            boolean z12 = false;
            boolean z13 = true;
            if (!f10.isScrap() && f10.itemView.getParent() == null) {
                if (!f10.isTmpDetached()) {
                    if (!f10.shouldIgnore()) {
                        boolean zDoesTransientStatePreventRecycling = f10.doesTransientStatePreventRecycling();
                        h hVar = RecyclerView.this.mAdapter;
                        if (hVar != null && zDoesTransientStatePreventRecycling && hVar.onFailedToRecycleView(f10)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (RecyclerView.sDebugAssertionsEnabled && this.f58214c.contains(f10)) {
                            throw new IllegalArgumentException("cached view received recycle internal? " + f10 + RecyclerView.this.exceptionLabel());
                        }
                        if (!z10 && !f10.isRecyclable()) {
                            if (RecyclerView.sVerboseLoggingEnabled) {
                                FS.log_d(RecyclerView.TAG, "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.exceptionLabel());
                            }
                            z13 = false;
                        } else {
                            if (this.f58217f > 0 && !f10.hasAnyOfTheFlags(526)) {
                                int size = this.f58214c.size();
                                if (size >= this.f58217f && size > 0) {
                                    G(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(f10.mPosition)) {
                                    int i10 = size - 1;
                                    while (i10 >= 0) {
                                        if (!RecyclerView.this.mPrefetchRegistry.d(this.f58214c.get(i10).mPosition)) {
                                            break;
                                        } else {
                                            i10--;
                                        }
                                    }
                                    size = i10 + 1;
                                }
                                this.f58214c.add(size, f10);
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                a(f10, true);
                            } else {
                                z13 = false;
                            }
                            z12 = z11;
                        }
                        RecyclerView.this.mViewInfoStore.q(f10);
                        if (!z12 && !z13 && zDoesTransientStatePreventRecycling) {
                            C17624a.b(f10.itemView);
                            f10.mBindingAdapter = null;
                            f10.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f10 + RecyclerView.this.exceptionLabel());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(f10.isScrap());
            sb2.append(" isAttached:");
            if (f10.itemView.getParent() != null) {
                z12 = true;
            }
            sb2.append(z12);
            sb2.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }

        void J(View view) {
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f58213b == null) {
                    this.f58213b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f58213b.add(childViewHolderInt);
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
            childViewHolderInt.setScrapContainer(this, false);
            this.f58212a.add(childViewHolderInt);
        }

        boolean R(F f10) {
            if (f10.isRemoved()) {
                if (RecyclerView.sDebugAssertionsEnabled && !RecyclerView.this.mState.e()) {
                    throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.exceptionLabel());
                }
                return RecyclerView.this.mState.e();
            }
            int i10 = f10.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.mAdapter.getItemCount()) {
                if (!RecyclerView.this.mState.e() && RecyclerView.this.mAdapter.getItemViewType(f10.mPosition) != f10.getItemViewType()) {
                    return false;
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && f10.getItemId() != RecyclerView.this.mAdapter.getItemId(f10.mPosition)) {
                    return false;
                }
                return true;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f10 + RecyclerView.this.exceptionLabel());
        }

        void a(F f10, boolean z10) {
            androidx.core.view.a aVarN;
            RecyclerView.clearNestedRecyclerViewIfNotNested(f10);
            View view = f10.itemView;
            androidx.recyclerview.widget.v vVar = RecyclerView.this.mAccessibilityDelegate;
            if (vVar != null) {
                androidx.core.view.a aVarN2 = vVar.n();
                if (aVarN2 instanceof v.a) {
                    aVarN = ((v.a) aVarN2).n(view);
                } else {
                    aVarN = null;
                }
                ViewCompat.m0(view, aVarN);
            }
            if (z10) {
                h(f10);
            }
            f10.mBindingAdapter = null;
            f10.mOwnerRecyclerView = null;
            j().k(f10);
        }

        public void c(View view, int i10) {
            q qVar;
            F childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                int iM = RecyclerView.this.mAdapterHelper.m(i10);
                if (iM >= 0 && iM < RecyclerView.this.mAdapter.getItemCount()) {
                    N(childViewHolderInt, iM, i10, RecyclerView.FOREVER_NS);
                    ViewGroup.LayoutParams layoutParams = childViewHolderInt.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                        childViewHolderInt.itemView.setLayoutParams(qVar);
                    } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                        qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                        childViewHolderInt.itemView.setLayoutParams(qVar);
                    } else {
                        qVar = (q) layoutParams;
                    }
                    boolean z10 = true;
                    qVar.f58203c = true;
                    qVar.f58201a = childViewHolderInt;
                    if (childViewHolderInt.itemView.getParent() != null) {
                        z10 = false;
                    }
                    qVar.f58204d = z10;
                    return;
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iM + ").state:" + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
            }
            throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.exceptionLabel());
        }

        void z(h<?> hVar, h<?> hVar2, boolean z10) {
            d();
            D(hVar, true);
            j().j(hVar, hVar2, z10);
            v();
        }

        View q(int i10, boolean z10) {
            return O(i10, z10, RecyclerView.FOREVER_NS).itemView;
        }
    }

    public interface x {
        void a(F f10);
    }

    private class y extends j {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f58144g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.r(i10, i11, obj)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.s(i10, i11)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.t(i10, i11, i12)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.u(i10, i11)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (hVar = recyclerView.mAdapter) == null || !hVar.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        void h() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    ViewCompat.e0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    public static class z extends AbstractC17821a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        Parcelable f58221c;

        class a implements Parcelable.ClassLoaderCreator<z> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i10) {
                return new z[i10];
            }

            a() {
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f58221c = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(z zVar) {
            this.f58221c = zVar.f58221c;
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f58221c, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    private void animateChange(F f10, F f11, m.c cVar, m.c cVar2, boolean z10, boolean z11) {
        f10.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(f10);
        }
        if (f10 != f11) {
            if (z11) {
                addAnimatingView(f11);
            }
            f10.mShadowedHolder = f11;
            addAnimatingView(f10);
            this.mRecycler.P(f10);
            f11.setIsRecyclable(false);
            f11.mShadowingHolder = f10;
        }
        if (this.mItemAnimator.animateChange(f10, f11, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private boolean isPreferredNextFocus(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c10 = 65535;
        int i12 = this.mLayout.r0() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i13 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 == 1) {
            return c10 < 0 || (c10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return c10 > 0 || (c10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return c10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return c10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + exceptionLabel());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.f.d(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.f.d(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.f.d(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.f.d(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            androidx.core.view.ViewCompat.d0(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return getSplineFlingDistance(-i10) < androidx.core.widget.f.b(edgeEffect) * ((float) i11);
    }

    public void addItemDecoration(o oVar, int i10) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.w("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.mItemDecorations.add(oVar);
        } else {
            this.mItemDecorations.add(i10, oVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    void animateAppearance(F f10, m.c cVar, m.c cVar2) {
        f10.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(f10, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fsSuperDispatchDraw_b7ce570bd9ad6f07f00c4b0c33e98a42(canvas);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    public F findViewHolderForLayoutPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    @Deprecated
    public F findViewHolderForPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    public void fsSuperDispatchDraw_b7ce570bd9ad6f07f00c4b0c33e98a42(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_b7ce570bd9ad6f07f00c4b0c33e98a42(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void fsSuperDraw_b7ce570bd9ad6f07f00c4b0c33e98a42(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.W(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void nestedScrollBy(int i10, int i11) {
        nestedScrollByInternal(i10, i11, null, 1);
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onScrollStateChanged(int i10) {
    }

    public void onScrolled(int i10, int i11) {
    }

    void recordAnimationInfoIfBouncedHiddenView(F f10, m.c cVar) {
        f10.setFlags(0, 8192);
        if (this.mState.f58146i && f10.isUpdated() && !f10.isRemoved() && !f10.shouldIgnore()) {
            this.mViewInfoStore.c(getChangedHolderKey(f10), f10);
        }
        this.mViewInfoStore.e(f10, cVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, null);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().p(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public void swapAdapter(h hVar, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    class InterpolatorC6252c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }

        InterpolatorC6252c() {
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f58167a;

        static {
            int[] iArr = new int[h.a.values().length];
            f58167a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f58167a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i10, int i11) {
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11, int i12) {
        }

        public void f(int i10, int i11) {
        }

        public void g() {
        }

        public void c(int i10, int i11, Object obj) {
            b(i10, i11);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C16600a.f157871a);
    }

    private void addAnimatingView(F f10) {
        View view = f10.itemView;
        boolean z10 = view.getParent() == this;
        this.mRecycler.P(getChildViewHolder(view));
        if (f10.isTmpDetached()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.mChildHelper.k(view);
        } else {
            this.mChildHelper.b(view, true);
        }
    }

    static void clearNestedRecyclerViewIfNotNested(F f10) {
        WeakReference<RecyclerView> weakReference = f10.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == f10.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            f10.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && androidx.core.widget.f.b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i11) / 4.0f) * androidx.core.widget.f.d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || androidx.core.widget.f.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.f.d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i10, int i11) throws NoSuchMethodException, SecurityException {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
            }
        }
    }

    private boolean didChildRangeChange(int i10, int i11) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i10 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i10 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(m.FLAG_MOVED);
        C16595b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f58147j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        B b10 = this.mState;
        b10.f58146i = b10.f58148k && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        b10.f58145h = b10.f58149l;
        b10.f58143f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f58148k) {
            int iG = this.mChildHelper.g();
            for (int i10 = 0; i10 < iG; i10++) {
                F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, m.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f58146i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f58149l) {
            saveOldPositions();
            B b11 = this.mState;
            boolean z10 = b11.f58144g;
            b11.f58144g = false;
            this.mLayout.n1(this.mRecycler, b11);
            this.mState.f58144g = z10;
            for (int i11 = 0; i11 < this.mChildHelper.g(); i11++) {
                F childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i11));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int iBuildAdapterChangeFlagsForAnimations = m.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iBuildAdapterChangeFlagsForAnimations |= m.FLAG_APPEARED_IN_PRE_LAYOUT;
                    }
                    m.c cVarRecordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, iBuildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVarRecordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, cVarRecordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f58142e = 2;
    }

    private void dispatchLayoutStep3() {
        RecyclerView recyclerView;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        B b10 = this.mState;
        b10.f58142e = 1;
        if (b10.f58148k) {
            for (int iG = this.mChildHelper.g() - 1; iG >= 0; iG--) {
                F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(iG));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    m.c cVarRecordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    F fG = this.mViewInfoStore.g(changedHolderKey);
                    if (fG == null || fG.shouldIgnore()) {
                        this.mViewInfoStore.d(childViewHolderInt, cVarRecordPostLayoutInformation);
                    } else {
                        boolean zH = this.mViewInfoStore.h(fG);
                        boolean zH2 = this.mViewInfoStore.h(childViewHolderInt);
                        if (zH && fG == childViewHolderInt) {
                            this.mViewInfoStore.d(childViewHolderInt, cVarRecordPostLayoutInformation);
                        } else {
                            m.c cVarN = this.mViewInfoStore.n(fG);
                            this.mViewInfoStore.d(childViewHolderInt, cVarRecordPostLayoutInformation);
                            m.c cVarM = this.mViewInfoStore.m(childViewHolderInt);
                            if (cVarN == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, fG);
                            } else {
                                animateChange(fG, childViewHolderInt, cVarN, cVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.mViewInfoStore.o(recyclerView.mViewInfoProcessCallback);
        } else {
            recyclerView = this;
        }
        recyclerView.mLayout.C1(recyclerView.mRecycler);
        B b11 = recyclerView.mState;
        b11.f58140c = b11.f58143f;
        recyclerView.mDataSetHasChangedAfterLayout = false;
        recyclerView.mDispatchItemsChangedEvent = false;
        b11.f58148k = false;
        b11.f58149l = false;
        recyclerView.mLayout.f58184h = false;
        ArrayList<F> arrayList = recyclerView.mRecycler.f58213b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.mLayout;
        if (pVar.f58190n) {
            pVar.f58189m = 0;
            pVar.f58190n = false;
            recyclerView.mRecycler.Q();
        }
        recyclerView.mLayout.o1(recyclerView.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        recyclerView.mViewInfoStore.f();
        int[] iArr = recyclerView.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        t tVar = this.mInterceptingOnItemTouchListener;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iG = this.mChildHelper.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iG; i12++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i12));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i10));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        F fFindViewHolderForAdapterPosition;
        B b10 = this.mState;
        int i10 = b10.f58150m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = b10.b();
        for (int i11 = i10; i11 < iB; i11++) {
            F fFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
            if (fFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (fFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return fFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (fFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!fFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return fFindViewHolderForAdapterPosition.itemView;
    }

    static F getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f58201a;
    }

    private C16342C getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C16342C(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j10, F f10, F f11) {
        int iG = this.mChildHelper.g();
        for (int i10 = 0; i10 < iG; i10++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
            if (childViewHolderInt != f10 && getChangedHolderKey(childViewHolderInt) == j10) {
                h hVar = this.mAdapter;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + f10 + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + f10 + exceptionLabel());
            }
        }
        FS.log_e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f11 + " cannot be found but it is necessary for " + f10 + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iG = this.mChildHelper.g();
        for (int i10 = 0; i10 < iG; i10++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initChildrenHelper() {
        this.mChildHelper = new f(new C6254e());
    }

    private void nestedScrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        p pVar = this.mLayout;
        if (pVar == null) {
            FS.log_e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zB = pVar.B();
        boolean zC = this.mLayout.C();
        int i13 = zC ? (zB ? 1 : 0) | 2 : zB ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i10 - releaseHorizontalGlow(i10, height);
        int iReleaseVerticalGlow = i11 - releaseVerticalGlow(i11, width);
        startNestedScroll(i13, i12);
        if (dispatchNestedPreScroll(zB ? iReleaseHorizontalGlow : 0, zC ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i12)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zB ? iReleaseHorizontalGlow : 0, zC ? iReleaseVerticalGlow : 0, motionEvent, i12);
        androidx.recyclerview.widget.k kVar = this.mGapWorker;
        if (kVar != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            kVar.f(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i12);
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.d2();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.i1(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.w();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z11 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f58148k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z10 = this.mDataSetHasChangedAfterLayout) || z11 || this.mLayout.f58184h) && (!z10 || this.mAdapter.hasStableIds());
        B b10 = this.mState;
        b10.f58149l = b10.f58148k && z11 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled();
    }

    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.n(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        F fFindViewHolderForItemId = (this.mState.f58151n == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f58151n);
        if (fFindViewHolderForItemId != null && !this.mChildHelper.n(fFindViewHolderForItemId.itemView) && fFindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = fFindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.g() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i10 = this.mState.f58152o;
            if (i10 != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            ViewCompat.d0(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f58203c) {
                Rect rect = qVar.f58202b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.J1(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        B b10 = this.mState;
        b10.f58151n = -1L;
        b10.f58150m = -1;
        b10.f58152o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        F fFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (fFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f58151n = this.mAdapter.hasStableIds() ? fFindContainingViewHolder.getItemId() : -1L;
        this.mState.f58150m = this.mDataSetHasChangedAfterLayout ? -1 : fFindContainingViewHolder.isRemoved() ? fFindContainingViewHolder.mOldPosition : fFindContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.f58152o = getDeepestFocusedViewWithId(fFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(h<?> hVar, boolean z10, boolean z11) {
        h hVar2 = this.mAdapter;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.y();
        h<?> hVar3 = this.mAdapter;
        this.mAdapter = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.mObserver);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.U0(hVar3, this.mAdapter);
        }
        this.mRecycler.z(hVar3, this.mAdapter, z10);
        this.mState.f58144g = true;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        sDebugAssertionsEnabled = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        sVerboseLoggingEnabled = z10;
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || androidx.core.widget.f.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            androidx.core.widget.f.d(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && androidx.core.widget.f.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.f.d(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && androidx.core.widget.f.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.f.d(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || androidx.core.widget.f.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        androidx.core.widget.f.d(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.h();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.c2();
        }
    }

    void absorbGlows(int i10, int i11) {
        if (i10 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        ViewCompat.d0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.V0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void addOnChildAttachStateChangeListener(r rVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(rVar);
    }

    public void addOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.add(tVar);
    }

    public void addOnScrollListener(u uVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(uVar);
    }

    public void addRecyclerListener(x xVar) {
        o2.i.b(xVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(xVar);
    }

    boolean canReuseUpdatedViewHolder(F f10) {
        m mVar = this.mItemAnimator;
        return mVar == null || mVar.canReuseUpdatedViewHolder(f10, f10.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.mLayout.D((q) layoutParams);
    }

    void clearOldPositions() {
        int iJ = this.mChildHelper.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.e();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.B()) {
            return this.mLayout.H(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.B()) {
            return this.mLayout.I(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.B()) {
            return this.mLayout.J(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.C()) {
            return this.mLayout.K(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.C()) {
            return this.mLayout.L(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.C()) {
            return this.mLayout.M(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            ViewCompat.d0(this);
        }
    }

    int consumeFlingInHorizontalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    int consumeFlingInVerticalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            j2.n.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            j2.n.b();
            return;
        }
        if (this.mAdapterHelper.p()) {
            if (!this.mAdapterHelper.o(4) || this.mAdapterHelper.o(11)) {
                if (this.mAdapterHelper.p()) {
                    j2.n.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    j2.n.b();
                    return;
                }
                return;
            }
            j2.n.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.w();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.i();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            j2.n.b();
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            FS.log_w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            FS.log_e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f58147j = false;
        boolean z10 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f58142e == 1) {
            dispatchLayoutStep1();
            this.mLayout.Q1(this);
            dispatchLayoutStep2();
        } else if (this.mAdapterHelper.q() || z10 || this.mLayout.C0() != getWidth() || this.mLayout.o0() != getHeight()) {
            this.mLayout.Q1(this);
            dispatchLayoutStep2();
        } else {
            this.mLayout.Q1(this);
        }
        dispatchLayoutStep3();
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().g(i10, i11, i12, i13, iArr, i14);
    }

    void dispatchOnScrollStateChanged(int i10) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.u1(i10);
        }
        onScrollStateChanged(i10);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.onScrollStateChanged(this, i10);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i10);
            }
        }
    }

    void dispatchOnScrolled(int i10, int i11) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        onScrolled(i10, i11);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.onScrolled(this, i10, i11);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i10, i11);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i10;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            F f10 = this.mPendingAccessibilityImportanceChange.get(size);
            if (f10.itemView.getParent() == this && !f10.shouldIgnore() && (i10 = f10.mPendingAccessibilityState) != -1) {
                ViewCompat.w0(f10.itemView, i10);
                f10.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this, 3);
        this.mBottomGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this, 0);
        this.mLeftGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this, 2);
        this.mRightGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.mEdgeEffectFactory.a(this, 1);
        this.mTopGlow = edgeEffectA;
        if (this.mClipToPadding) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public View findChildViewUnder(float f10, float f11) {
        for (int iG = this.mChildHelper.g() - 1; iG >= 0; iG--) {
            View viewF = this.mChildHelper.f(iG);
            float translationX = viewF.getTranslationX();
            float translationY = viewF.getTranslationY();
            if (f10 >= viewF.getLeft() + translationX && f10 <= viewF.getRight() + translationX && f11 >= viewF.getTop() + translationY && f11 <= viewF.getBottom() + translationY) {
                return viewF;
            }
        }
        return null;
    }

    public F findViewHolderForAdapterPosition(int i10) {
        F f10 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iJ = this.mChildHelper.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i10) {
                if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                f10 = childViewHolderInt;
            }
        }
        return f10;
    }

    public F findViewHolderForItemId(long j10) {
        h hVar = this.mAdapter;
        F f10 = null;
        if (hVar != null && hVar.hasStableIds()) {
            int iJ = this.mChildHelper.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j10) {
                    if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    f10 = childViewHolderInt;
                }
            }
        }
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.F findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.f r0 = r5.mChildHelper
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.f r3 = r5.mChildHelper
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$F r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.f r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$F");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i10, int i11) {
        int iMax;
        int i12;
        p pVar = this.mLayout;
        if (pVar == null) {
            FS.log_e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iB = pVar.B();
        boolean zC = this.mLayout.C();
        if (iB == 0 || Math.abs(i10) < this.mMinFlingVelocity) {
            i10 = 0;
        }
        if (!zC || Math.abs(i11) < this.mMinFlingVelocity) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || androidx.core.widget.f.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 != null && androidx.core.widget.f.b(edgeEffect2) != 0.0f) {
                    if (shouldAbsorb(this.mRightGlow, i10, getWidth())) {
                        this.mRightGlow.onAbsorb(i10);
                        i10 = 0;
                    }
                    iMax = i10;
                    i10 = 0;
                }
                iMax = 0;
            } else {
                int i13 = -i10;
                if (shouldAbsorb(this.mLeftGlow, i13, getWidth())) {
                    this.mLeftGlow.onAbsorb(i13);
                    i10 = 0;
                }
                iMax = i10;
                i10 = 0;
            }
        }
        if (i11 == 0) {
            i12 = i11;
            i11 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || androidx.core.widget.f.b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 != null && androidx.core.widget.f.b(edgeEffect4) != 0.0f) {
                    if (shouldAbsorb(this.mBottomGlow, i11, getHeight())) {
                        this.mBottomGlow.onAbsorb(i11);
                        i11 = 0;
                    }
                    i12 = 0;
                }
                i12 = i11;
                i11 = 0;
            } else {
                int i14 = -i11;
                if (shouldAbsorb(this.mTopGlow, i14, getHeight())) {
                    this.mTopGlow.onAbsorb(i14);
                    i11 = 0;
                }
                i12 = 0;
            }
        }
        if (iMax != 0 || i11 != 0) {
            int i15 = this.mMaxFlingVelocity;
            iMax = Math.max(-i15, Math.min(iMax, i15));
            int i16 = this.mMaxFlingVelocity;
            i11 = Math.max(-i16, Math.min(i11, i16));
            this.mViewFlinger.b(iMax, i11);
        }
        if (i10 == 0 && i12 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f10 = i10;
        float f11 = i12;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = iB != 0 || zC;
            dispatchNestedFling(f10, f11, z10);
            s sVar = this.mOnFlingListener;
            if (sVar != null && sVar.a(i10, i12)) {
                return true;
            }
            if (z10) {
                if (zC) {
                    iB = (iB == true ? 1 : 0) | 2;
                }
                startNestedScroll(iB, 1);
                int i17 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i17, Math.min(i10, i17));
                int i18 = this.mMaxFlingVelocity;
                this.mViewFlinger.b(iMax2, Math.max(-i18, Math.min(i12, i18)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewZ0;
        boolean z10;
        View viewG1 = this.mLayout.g1(view, i10);
        if (viewG1 != null) {
            return viewG1;
        }
        boolean z11 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.mLayout.C()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.mLayout.B()) {
                int i12 = (this.mLayout.r0() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.Z0(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewZ0 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewZ0 = this.mLayout.Z0(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewZ0 = viewFindNextFocus;
            }
        }
        if (viewZ0 == null || viewZ0.hasFocusable()) {
            return isPreferredNextFocus(view, viewZ0, i10) ? viewZ0 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        requestChildOnScreen(viewZ0, null);
        return view;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.V();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(F f10) {
        if (f10.hasAnyOfTheFlags(524) || !f10.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.e(f10.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.mLayout;
        return pVar != null ? pVar.Y() : super.getBaseline();
    }

    long getChangedHolderKey(F f10) {
        return this.mAdapter.hasStableIds() ? f10.getItemId() : f10.mPosition;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        k kVar = this.mChildDrawingOrderCallback;
        return kVar == null ? super.getChildDrawingOrder(i10, i11) : kVar.a(i10, i11);
    }

    public long getChildItemId(View view) {
        F childViewHolderInt;
        h hVar = this.mAdapter;
        if (hVar == null || !hVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.v getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public v getRecycledViewPool() {
        return this.mRecycler.j();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().l(i10);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.p();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new C6256a(new C6255f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C16601b.f157872a), resources.getDimensionPixelSize(C16601b.f157874c), resources.getDimensionPixelOffset(C16601b.f157873b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.w("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        m mVar = this.mItemAnimator;
        return mVar != null && mVar.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    void jumpToPositionForSmoothScroller(int i10) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.O1(i10);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int iJ = this.mChildHelper.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((q) this.mChildHelper.i(i10).getLayoutParams()).f58203c = true;
        }
        this.mRecycler.t();
    }

    void markKnownViewsInvalid() {
        int iJ = this.mChildHelper.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.u();
    }

    public void offsetChildrenHorizontal(int i10) {
        int iG = this.mChildHelper.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.mChildHelper.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        int iG = this.mChildHelper.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.mChildHelper.f(i11).offsetTopAndBottom(i10);
        }
    }

    void offsetPositionRecordsForInsert(int i10, int i11) {
        int iJ = this.mChildHelper.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i10) {
                if (sVerboseLoggingEnabled) {
                    FS.log_d(TAG, "offsetPositionRecordsForInsert attached child " + i12 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i11));
                }
                childViewHolderInt.offsetPosition(i11, false);
                this.mState.f58144g = true;
            }
        }
        this.mRecycler.w(i10, i11);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.mChildHelper.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i16));
            if (childViewHolderInt != null && (i15 = childViewHolderInt.mPosition) >= i13 && i15 <= i12) {
                if (sVerboseLoggingEnabled) {
                    FS.log_d(TAG, "offsetPositionRecordsForMove attached child " + i16 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i10) {
                    childViewHolderInt.offsetPosition(i11 - i10, false);
                } else {
                    childViewHolderInt.offsetPosition(i14, false);
                }
                this.mState.f58144g = true;
            }
        }
        this.mRecycler.x(i10, i11);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.mChildHelper.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i14 = childViewHolderInt.mPosition;
                if (i14 >= i12) {
                    if (sVerboseLoggingEnabled) {
                        FS.log_d(TAG, "offsetPositionRecordsForRemove attached child " + i13 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i11));
                    }
                    childViewHolderInt.offsetPosition(-i11, z10);
                    this.mState.f58144g = true;
                } else if (i14 >= i10) {
                    if (sVerboseLoggingEnabled) {
                        FS.log_d(TAG, "offsetPositionRecordsForRemove attached child " + i13 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.mState.f58144g = true;
                }
            }
        }
        this.mRecycler.y(i10, i11, z10);
        requestLayout();
    }

    void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll(boolean z10) {
        int i10 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i10;
        if (i10 < 1) {
            if (sDebugAssertionsEnabled && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + exceptionLabel());
            }
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            boolean r0 = r0.C()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.B()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.C()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.B()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean zB = pVar.B();
        boolean zC = this.mLayout.C();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zB;
            if (zC) {
                i10 = (zB ? 1 : 0) | 2;
            }
            startNestedScroll(i10, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                FS.log_e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i11 = x11 - this.mInitialTouchX;
                int i12 = y11 - this.mInitialTouchY;
                if (zB == 0 || Math.abs(i11) <= this.mTouchSlop) {
                    z10 = false;
                } else {
                    this.mLastTouchX = x11;
                    z10 = true;
                }
                if (zC && Math.abs(i12) > this.mTouchSlop) {
                    this.mLastTouchY = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x12;
            this.mInitialTouchX = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y12;
            this.mInitialTouchY = y12;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        j2.n.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        j2.n.b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null) {
            defaultOnMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.H0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mLayout.p1(this.mRecycler, this.mState, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z10;
            if (z10 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f58142e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.R1(i10, i11);
            this.mState.f58147j = true;
            dispatchLayoutStep2();
            this.mLayout.U1(i10, i11);
            if (this.mLayout.X1()) {
                this.mLayout.R1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f58147j = true;
                dispatchLayoutStep2();
                this.mLayout.U1(i10, i11);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.p1(this.mRecycler, this.mState, i10, i11);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            B b10 = this.mState;
            if (b10.f58149l) {
                b10.f58145h = true;
            } else {
                this.mAdapterHelper.j();
                this.mState.f58145h = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f58149l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.mAdapter;
        if (hVar != null) {
            this.mState.f58143f = hVar.getItemCount();
        } else {
            this.mState.f58143f = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.p1(this.mRecycler, this.mState, i10, i11);
        stopInterceptRequestLayout(false);
        this.mState.f58145h = false;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.mPendingSavedState = zVar;
        super.onRestoreInstanceState(zVar.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.mPendingSavedState;
        if (zVar2 != null) {
            zVar.b(zVar2);
            return zVar;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            zVar.f58221c = pVar.t1();
            return zVar;
        }
        zVar.f58221c = null;
        return zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        ViewCompat.e0(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.endAnimations();
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.B1(this.mRecycler);
            this.mLayout.C1(this.mRecycler);
        }
        this.mRecycler.d();
    }

    public void removeItemDecoration(o oVar) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.w("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeOnChildAttachStateChangeListener(r rVar) {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void removeOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.remove(tVar);
        if (this.mInterceptingOnItemTouchListener == tVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(u uVar) {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void removeRecyclerListener(x xVar) {
        this.mRecyclerListeners.remove(xVar);
    }

    void repositionShadowingViews() {
        F f10;
        int iG = this.mChildHelper.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.mChildHelper.f(i10);
            F childViewHolder = getChildViewHolder(viewF);
            if (childViewHolder != null && (f10 = childViewHolder.mShadowingHolder) != null) {
                View view = f10.itemView;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.r1(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.I1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mOnItemTouchListeners.get(i10).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int iJ = this.mChildHelper.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            F childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i10));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + exceptionLabel());
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        p pVar = this.mLayout;
        if (pVar == null) {
            FS.log_e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zB = pVar.B();
        boolean zC = this.mLayout.C();
        if (zB || zC) {
            if (!zB) {
                i10 = 0;
            }
            if (!zC) {
                i11 = 0;
            }
            scrollByInternal(i10, i11, null, 0);
        }
    }

    boolean scrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i10, i11, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i13, i14, i15, i16, this.mScrollOffset, i12, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i24 = iArr5[0];
        this.mLastTouchX = i23 - i24;
        int i25 = this.mLastTouchY;
        int i26 = iArr5[1];
        this.mLastTouchY = i25 - i26;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C16340A.a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            considerReleasingGlowsOnScroll(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            dispatchOnScrolled(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        FS.log_w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        p pVar = this.mLayout;
        if (pVar == null) {
            FS.log_e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.O1(i10);
            awakenScrollBars();
        }
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.v vVar) {
        this.mAccessibilityDelegate = vVar;
        ViewCompat.m0(this, vVar);
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.mRecycler.M(i10);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.endAnimations();
            }
            this.mLayout.B1(this.mRecycler);
            this.mLayout.C1(this.mRecycler);
            this.mRecycler.d();
            if (this.mIsAttached) {
                this.mLayout.S(this, this.mRecycler);
            }
            this.mLayout.V1(null);
            this.mLayout = null;
        } else {
            this.mRecycler.d();
        }
        this.mChildHelper.o();
        this.mLayout = pVar;
        if (pVar != null) {
            if (pVar.f58178b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f58178b.exceptionLabel());
            }
            pVar.V1(this);
            if (this.mIsAttached) {
                this.mLayout.R(this);
            }
        }
        this.mRecycler.Q();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    public void setOnFlingListener(s sVar) {
        this.mOnFlingListener = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.mScrollListener = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(v vVar) {
        this.mRecycler.K(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.mRecyclerListener = xVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            FS.log_d(TAG, "setting scroll state to " + i10 + " from " + this.mScrollState, new Exception());
        }
        this.mScrollState = i10;
        if (i10 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i10);
    }

    public void setViewCacheExtension(D d10) {
        this.mRecycler.L(d10);
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator) {
        smoothScrollBy(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public void smoothScrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            FS.log_e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.Z1(this, this.mState, i10);
        }
    }

    void startInterceptRequestLayout() {
        int i10 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i10;
        if (i10 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().q(i10, i11);
    }

    void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + exceptionLabel());
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z10 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().s(i10);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    void viewRangeUpdate(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.mChildHelper.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.mChildHelper.i(i14);
            F childViewHolderInt = getChildViewHolderInt(viewI);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i12 = childViewHolderInt.mPosition) >= i10 && i12 < i13) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((q) viewI.getLayoutParams()).f58203c = true;
            }
        }
        this.mRecycler.S(i10, i11);
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC6252c();
        sDefaultEdgeEffectFactory = new C();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i10);
        this.mObserver = new y();
        this.mRecycler = new w();
        this.mViewInfoStore = new androidx.recyclerview.widget.A();
        this.mUpdateChildViewsRunnable = new RunnableC6250a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new androidx.recyclerview.widget.g();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new E();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new k.b() : null;
        this.mState = new B();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC6251b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C6253d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C16345a0.f(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C16345a0.j(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (ViewCompat.x(this) == 0) {
            ViewCompat.w0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.v(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16603d.f157879a, i10, 0);
        ViewCompat.k0(this, context, C16603d.f157879a, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(C16603d.f157888j);
        if (typedArrayObtainStyledAttributes.getInt(C16603d.f157882d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(C16603d.f157881c, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(C16603d.f157883e, false);
        this.mEnableFastScroller = z10;
        if (z10) {
            initFastScroller((StateListDrawable) __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, C16603d.f157886h), __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, C16603d.f157887i), (StateListDrawable) __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, C16603d.f157884f), __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, C16603d.f157885g));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i10, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        ViewCompat.k0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        C17624a.h(this, true);
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    private void dispatchLayoutStep2() {
        boolean z10;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.j();
        this.mState.f58143f = this.mAdapter.getItemCount();
        this.mState.f58141d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f58221c;
            if (parcelable != null) {
                this.mLayout.s1(parcelable);
            }
            this.mPendingSavedState = null;
        }
        B b10 = this.mState;
        b10.f58145h = false;
        this.mLayout.n1(this.mRecycler, b10);
        B b11 = this.mState;
        b11.f58144g = false;
        if (b11.f58148k && this.mItemAnimator != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        b11.f58148k = z10;
        b11.f58142e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = this.mOnItemTouchListeners.get(i10);
            if (tVar.c(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = tVar;
                return true;
            }
        }
        return false;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f58202b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private float getSplineFlingDistance(int i10) {
        double dLog = Math.log((Math.abs(i10) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f10 = DECELERATION_RATE;
        return (float) (this.mPhysicalCoef * SCROLL_FRICTION * Math.exp((f10 / (f10 - 1.0d)) * dLog));
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (ViewCompat.y(this) == 0) {
            ViewCompat.y0(this, 8);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.mLastTouchY = y10;
            this.mInitialTouchY = y10;
        }
    }

    private int releaseHorizontalGlow(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f11 = 0.0f;
        if (edgeEffect != null && androidx.core.widget.f.b(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f12 = -androidx.core.widget.f.d(this.mLeftGlow, -width, 1.0f - height);
                if (androidx.core.widget.f.b(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && androidx.core.widget.f.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fD = androidx.core.widget.f.d(this.mRightGlow, width, height);
                    if (androidx.core.widget.f.b(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        }
        return Math.round(f11 * getWidth());
    }

    private int releaseVerticalGlow(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f11 = 0.0f;
        if (edgeEffect != null && androidx.core.widget.f.b(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f12 = -androidx.core.widget.f.d(this.mTopGlow, -height, width);
                if (androidx.core.widget.f.b(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && androidx.core.widget.f.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fD = androidx.core.widget.f.d(this.mBottomGlow, height, 1.0f - width);
                    if (androidx.core.widget.f.b(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        }
        return Math.round(f11 * getHeight());
    }

    void animateDisappearance(F f10, m.c cVar, m.c cVar2) {
        addAnimatingView(f10);
        f10.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(f10, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str + exceptionLabel());
        }
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            FS.log_w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    void defaultOnMeasure(int i10, int i11) {
        setMeasuredDimension(p.E(i10, getPaddingLeft() + getPaddingRight(), ViewCompat.B(this)), p.E(i11, getPaddingTop() + getPaddingBottom(), ViewCompat.A(this)));
    }

    void dispatchChildAttached(View view) {
        F childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).d(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        F childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        int paddingTop;
        boolean z11;
        boolean z12;
        int paddingBottom;
        fsSuperDraw_b7ce570bd9ad6f07f00c4b0c33e98a42(canvas);
        int size = this.mItemDecorations.size();
        boolean z13 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z14 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int iSave = canvas.save();
            if (this.mClipToPadding) {
                paddingBottom = getPaddingBottom();
            } else {
                paddingBottom = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.restoreToCount(iSave);
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 |= z12;
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(iSave4);
        }
        if (z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) {
            z14 = z10;
        }
        if (z14) {
            ViewCompat.d0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_b7ce570bd9ad6f07f00c4b0c33e98a42(canvas, view, j10);
    }

    final void fillRemainingScrollValues(B b10) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f58157c;
            b10.f58153p = overScroller.getFinalX() - overScroller.getCurrX();
            b10.f58154q = overScroller.getFinalY() - overScroller.getCurrY();
        } else {
            b10.f58153p = 0;
            b10.f58154q = 0;
        }
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public F findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public int getChildAdapterPosition(View view) {
        F childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildLayoutPosition(View view) {
        F childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public F getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    Rect getItemDecorInsetsForChild(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f58203c) {
            return qVar.f58202b;
        }
        if (this.mState.e() && (qVar.c() || qVar.e())) {
            return qVar.f58202b;
        }
        Rect rect = qVar.f58202b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i10).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i11 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f58203c = false;
        return rect;
    }

    public o getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.mItemDecorations.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$w r1 = r5.mRecycler
            r1.A()
            androidx.recyclerview.widget.RecyclerView$p r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.R(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L66
            java.lang.ThreadLocal<androidx.recyclerview.widget.k> r0 = androidx.recyclerview.widget.k.f58432e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.k r1 = (androidx.recyclerview.widget.k) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.k r1 = new androidx.recyclerview.widget.k
            r1.<init>()
            r5.mGapWorker = r1
            android.view.Display r1 = androidx.core.view.ViewCompat.t(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.k r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f58436c = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.k r0 = r5.mGapWorker
            r0.a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.k kVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.S(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        this.mRecycler.B();
        C17624a.c(this);
        if (ALLOW_THREAD_GAP_WORK && (kVar = this.mGapWorker) != null) {
            kVar.j(this);
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).onDraw(canvas, this, this.mState);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        invalidateGlows();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zR = this.mChildHelper.r(view);
        if (zR) {
            F childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.P(childViewHolderInt);
            this.mRecycler.I(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                FS.log_d(TAG, "after removing animated view: " + view + ", " + this);
            }
        }
        stopInterceptRequestLayout(!zR);
        return zR;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        F childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        } else if (sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + exceptionLabel());
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    void scrollStep(int i10, int i11, int[] iArr) {
        int iN1;
        int iP1;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        j2.n.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i10 != 0) {
            iN1 = this.mLayout.N1(i10, this.mRecycler, this.mState);
        } else {
            iN1 = 0;
        }
        if (i11 != 0) {
            iP1 = this.mLayout.P1(i11, this.mRecycler, this.mState);
        } else {
            iP1 = 0;
        }
        j2.n.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iN1;
            iArr[1] = iP1;
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    boolean setChildImportantForAccessibilityInternal(F f10, int i10) {
        if (isComputingLayout()) {
            f10.mPendingAccessibilityState = i10;
            this.mPendingAccessibilityImportanceChange.add(f10);
            return false;
        }
        ViewCompat.w0(f10.itemView, i10);
        return true;
    }

    public void setEdgeEffectFactory(l lVar) {
        o2.i.g(lVar);
        this.mEdgeEffectFactory = lVar;
        invalidateGlows();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().n(z10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                FS.log_w(TAG, "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int iA;
        int i10 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            iA = C16595b.a(accessibilityEvent);
        } else {
            iA = 0;
        }
        if (iA != 0) {
            i10 = iA;
        }
        this.mEatenAccessibilityChangeFlags |= i10;
        return true;
    }

    public void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12) {
        smoothScrollBy(i10, i11, interpolator, i12, false);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.X(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.mLayout;
        if (pVar == null) {
            FS.log_e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!pVar.B()) {
            i10 = 0;
        }
        if (!this.mLayout.C()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            startNestedScroll(i13, 1);
        }
        this.mViewFlinger.g(i10, i11, i12, interpolator);
    }

    public void addItemDecoration(o oVar) {
        addItemDecoration(oVar, -1);
    }
}
