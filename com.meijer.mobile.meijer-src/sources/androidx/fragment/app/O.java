package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.b0;
import androidx.view.AbstractC6165l;
import androidx.view.h0;
import com.fullstory.FS;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;

/* loaded from: classes.dex */
class O {

    /* renamed from: a, reason: collision with root package name */
    private final C6126z f55110a;

    /* renamed from: b, reason: collision with root package name */
    private final Q f55111b;

    /* renamed from: c, reason: collision with root package name */
    private final Fragment f55112c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f55113d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f55114e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f55115a;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        a(View view) {
            this.f55115a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f55115a.removeOnAttachStateChangeListener(this);
            ViewCompat.j0(this.f55115a);
        }
    }

    O(C6126z c6126z, Q q10, Fragment fragment) {
        this.f55110a = c6126z;
        this.f55111b = q10;
        this.f55112c = fragment;
    }

    void a() {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "moveto ACTIVITY_CREATED: " + this.f55112c);
        }
        Bundle bundle = this.f55112c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f55112c.performActivityCreated(bundle2);
        this.f55110a.a(this.f55112c, bundle2, false);
    }

    void c() {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "moveto ATTACHED: " + this.f55112c);
        }
        Fragment fragment = this.f55112c;
        Fragment fragment2 = fragment.mTarget;
        O o10 = null;
        if (fragment2 != null) {
            O o11 = this.f55111b.o(fragment2.mWho);
            if (o11 == null) {
                throw new IllegalStateException("Fragment " + this.f55112c + " declared target fragment " + this.f55112c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f55112c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            o10 = o11;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (o10 = this.f55111b.o(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f55112c + " declared target fragment " + this.f55112c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (o10 != null) {
            o10.m();
        }
        Fragment fragment4 = this.f55112c;
        fragment4.mHost = fragment4.mFragmentManager.getHost();
        Fragment fragment5 = this.f55112c;
        fragment5.mParentFragment = fragment5.mFragmentManager.getParent();
        this.f55110a.g(this.f55112c, false);
        this.f55112c.performAttach();
        this.f55110a.b(this.f55112c, false);
    }

    void e() {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "moveto CREATED: " + this.f55112c);
        }
        Bundle bundle = this.f55112c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        Fragment fragment = this.f55112c;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.f55110a.h(fragment, bundle2, false);
            this.f55112c.performCreate(bundle2);
            this.f55110a.c(this.f55112c, bundle2, false);
        }
    }

    void g() {
        Fragment fragmentF;
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "movefrom CREATED: " + this.f55112c);
        }
        Fragment fragment = this.f55112c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.mRemoving && !fragment.isInBackStack();
        if (z10) {
            Fragment fragment2 = this.f55112c;
            if (!fragment2.mBeingSaved) {
                this.f55111b.C(fragment2.mWho, null);
            }
        }
        if (!z10 && !this.f55111b.q().B(this.f55112c)) {
            String str = this.f55112c.mTargetWho;
            if (str != null && (fragmentF = this.f55111b.f(str)) != null && fragmentF.mRetainInstance) {
                this.f55112c.mTarget = fragmentF;
            }
            this.f55112c.mState = 0;
            return;
        }
        AbstractC6124x<?> abstractC6124x = this.f55112c.mHost;
        if (abstractC6124x instanceof h0) {
            zIsChangingConfigurations = this.f55111b.q().w();
        } else if (abstractC6124x.getContext() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) abstractC6124x.getContext()).isChangingConfigurations();
        }
        if ((z10 && !this.f55112c.mBeingSaved) || zIsChangingConfigurations) {
            this.f55111b.q().n(this.f55112c, false);
        }
        this.f55112c.performDestroy();
        this.f55110a.d(this.f55112c, false);
        for (O o10 : this.f55111b.l()) {
            if (o10 != null) {
                Fragment fragmentK = o10.k();
                if (this.f55112c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.f55112c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f55112c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f55111b.f(str2);
        }
        this.f55111b.t(this);
    }

    void h() {
        View view;
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "movefrom CREATE_VIEW: " + this.f55112c);
        }
        Fragment fragment = this.f55112c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f55112c.performDestroyView();
        this.f55110a.n(this.f55112c, false);
        Fragment fragment2 = this.f55112c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.o(null);
        this.f55112c.mInLayout = false;
    }

    void i() {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "movefrom ATTACHED: " + this.f55112c);
        }
        this.f55112c.performDetach();
        this.f55110a.e(this.f55112c, false);
        Fragment fragment = this.f55112c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f55111b.q().B(this.f55112c)) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "initState called for fragment: " + this.f55112c);
        }
        this.f55112c.initState();
    }

    void n() {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "movefrom RESUMED: " + this.f55112c);
        }
        this.f55112c.performPause();
        this.f55110a.f(this.f55112c, false);
    }

    void p() {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "moveto RESUMED: " + this.f55112c);
        }
        View focusedView = this.f55112c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.isLoggingEnabled(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f55112c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f55112c.mView.findFocus());
                FS.log_v(FragmentManager.TAG, sb2.toString());
            }
        }
        this.f55112c.setFocusedView(null);
        this.f55112c.performResume();
        this.f55110a.i(this.f55112c, false);
        this.f55111b.C(this.f55112c.mWho, null);
        Fragment fragment = this.f55112c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    void u() {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "moveto STARTED: " + this.f55112c);
        }
        this.f55112c.performStart();
        this.f55110a.k(this.f55112c, false);
    }

    void v() {
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "movefrom STARTED: " + this.f55112c);
        }
        this.f55112c.performStop();
        this.f55110a.l(this.f55112c, false);
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55117a;

        static {
            int[] iArr = new int[AbstractC6165l.b.values().length];
            f55117a = iArr;
            try {
                iArr[AbstractC6165l.b.f55503e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55117a[AbstractC6165l.b.f55502d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55117a[AbstractC6165l.b.f55501c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55117a[AbstractC6165l.b.f55500b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private boolean l(View view) {
        if (view == this.f55112c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f55112c.mView) {
                return true;
            }
        }
        return false;
    }

    void b() {
        Fragment fragmentFindViewFragment = FragmentManager.findViewFragment(this.f55112c.mContainer);
        Fragment parentFragment = this.f55112c.getParentFragment();
        if (fragmentFindViewFragment != null && !fragmentFindViewFragment.equals(parentFragment)) {
            Fragment fragment = this.f55112c;
            L2.b.o(fragment, fragmentFindViewFragment, fragment.mContainerId);
        }
        int iJ = this.f55111b.j(this.f55112c);
        Fragment fragment2 = this.f55112c;
        fragment2.mContainer.addView(fragment2.mView, iJ);
    }

    int d() {
        Fragment fragment = this.f55112c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f55114e;
        int i10 = b.f55117a[fragment.mMaxState.ordinal()];
        if (i10 != 1) {
            iMin = i10 != 2 ? i10 != 3 ? i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.f55112c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f55114e, 2);
                View view = this.f55112c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f55114e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.f55112c;
        if (fragment3.mInDynamicContainer && fragment3.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f55112c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment4 = this.f55112c;
        ViewGroup viewGroup = fragment4.mContainer;
        b0.d.a aVarS = viewGroup != null ? b0.u(viewGroup, fragment4.getParentFragmentManager()).s(this) : null;
        if (aVarS == b0.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == b0.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment5 = this.f55112c;
            if (fragment5.mRemoving) {
                iMin = fragment5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment6 = this.f55112c;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f55112c.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "computeExpectedState() of " + iMin + " for " + this.f55112c);
        }
        return iMin;
    }

    void f() throws Resources.NotFoundException {
        String resourceName;
        if (this.f55112c.mFromLayout) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            FS.log_d(FragmentManager.TAG, "moveto CREATE_VIEW: " + this.f55112c);
        }
        Bundle bundle = this.f55112c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f55112c.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f55112c;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f55112c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.getContainer().c(this.f55112c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f55112c;
                    if (!fragment2.mRestored && !fragment2.mInDynamicContainer) {
                        try {
                            resourceName = fragment2.getResources().getResourceName(this.f55112c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = zzbz.UNKNOWN_CONTENT_TYPE;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f55112c.mContainerId) + " (" + resourceName + ") for fragment " + this.f55112c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    L2.b.n(this.f55112c, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f55112c;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f55112c.mView != null) {
            if (FragmentManager.isLoggingEnabled(3)) {
                FS.log_d(FragmentManager.TAG, "moveto VIEW_CREATED: " + this.f55112c);
            }
            this.f55112c.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f55112c;
            fragment4.mView.setTag(K2.b.f16258a, fragment4);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment5 = this.f55112c;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (this.f55112c.mView.isAttachedToWindow()) {
                ViewCompat.j0(this.f55112c.mView);
            } else {
                View view = this.f55112c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f55112c.performViewCreated();
            C6126z c6126z = this.f55110a;
            Fragment fragment6 = this.f55112c;
            c6126z.m(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f55112c.mView.getVisibility();
            this.f55112c.setPostOnViewCreatedAlpha(this.f55112c.mView.getAlpha());
            Fragment fragment7 = this.f55112c;
            if (fragment7.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f55112c.setFocusedView(viewFindFocus);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        FS.log_v(FragmentManager.TAG, "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f55112c);
                    }
                }
                this.f55112c.mView.setAlpha(0.0f);
            }
        }
        this.f55112c.mState = 2;
    }

    void j() {
        Fragment fragment = this.f55112c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.isLoggingEnabled(3)) {
                FS.log_d(FragmentManager.TAG, "moveto CREATE_VIEW: " + this.f55112c);
            }
            Bundle bundle = this.f55112c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            Fragment fragment2 = this.f55112c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f55112c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f55112c;
                fragment3.mView.setTag(K2.b.f16258a, fragment3);
                Fragment fragment4 = this.f55112c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f55112c.performViewCreated();
                C6126z c6126z = this.f55110a;
                Fragment fragment5 = this.f55112c;
                c6126z.m(fragment5, fragment5.mView, bundle2, false);
                this.f55112c.mState = 2;
            }
        }
    }

    Fragment k() {
        return this.f55112c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f55113d) {
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f55113d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.f55112c;
                int i10 = fragment.mState;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f55112c.mBeingSaved) {
                        if (FragmentManager.isLoggingEnabled(3)) {
                            FS.log_d(FragmentManager.TAG, "Cleaning up state of never attached fragment: " + this.f55112c);
                        }
                        this.f55111b.q().n(this.f55112c, true);
                        this.f55111b.t(this);
                        if (FragmentManager.isLoggingEnabled(3)) {
                            FS.log_d(FragmentManager.TAG, "initState called for fragment: " + this.f55112c);
                        }
                        this.f55112c.initState();
                    }
                    Fragment fragment2 = this.f55112c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            b0 b0VarU = b0.u(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f55112c.mHidden) {
                                b0VarU.k(this);
                            } else {
                                b0VarU.m(this);
                            }
                        }
                        Fragment fragment3 = this.f55112c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.invalidateMenuForFragment(fragment3);
                        }
                        Fragment fragment4 = this.f55112c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f55112c.mChildFragmentManager.dispatchOnHiddenChanged();
                    }
                    this.f55113d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f55111b.r(fragment.mWho) == null) {
                                this.f55111b.C(this.f55112c.mWho, r());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f55112c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.isLoggingEnabled(3)) {
                                FS.log_d(FragmentManager.TAG, "movefrom ACTIVITY_CREATED: " + this.f55112c);
                            }
                            Fragment fragment5 = this.f55112c;
                            if (fragment5.mBeingSaved) {
                                this.f55111b.C(fragment5.mWho, r());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment6 = this.f55112c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                b0.u(viewGroup2, fragment6.getParentFragmentManager()).l(this);
                            }
                            this.f55112c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                b0.u(viewGroup3, fragment.getParentFragmentManager()).j(b0.d.b.e(this.f55112c.mView.getVisibility()), this);
                            }
                            this.f55112c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th2) {
            this.f55113d = false;
            throw th2;
        }
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f55112c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f55112c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f55112c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            Fragment fragment = this.f55112c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            Fragment fragment2 = this.f55112c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
            N n10 = (N) this.f55112c.mSavedFragmentState.getParcelable("state");
            if (n10 != null) {
                Fragment fragment3 = this.f55112c;
                fragment3.mTargetWho = n10.f55107m;
                fragment3.mTargetRequestCode = n10.f55108n;
                Boolean bool = fragment3.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment3.mUserVisibleHint = bool.booleanValue();
                    this.f55112c.mSavedUserVisibleHint = null;
                } else {
                    fragment3.mUserVisibleHint = n10.f55109o;
                }
            }
            Fragment fragment4 = this.f55112c;
            if (fragment4.mUserVisibleHint) {
                return;
            }
            fragment4.mDeferStart = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
        }
    }

    Fragment.m q() {
        if (this.f55112c.mState > -1) {
            return new Fragment.m(r());
        }
        return null;
    }

    Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f55112c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new N(this.f55112c));
        if (this.f55112c.mState > 0) {
            Bundle bundle3 = new Bundle();
            this.f55112c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f55110a.j(this.f55112c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f55112c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleSaveAllStateInternal = this.f55112c.mChildFragmentManager.saveAllStateInternal();
            if (!bundleSaveAllStateInternal.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleSaveAllStateInternal);
            }
            if (this.f55112c.mView != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.f55112c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f55112c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f55112c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void s() {
        if (this.f55112c.mView == null) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "Saving view state for fragment " + this.f55112c + " with view " + this.f55112c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f55112c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f55112c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f55112c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f55112c.mSavedViewRegistryState = bundle;
    }

    void t(int i10) {
        this.f55114e = i10;
    }

    O(C6126z c6126z, Q q10, ClassLoader classLoader, C6123w c6123w, Bundle bundle) {
        this.f55110a = c6126z;
        this.f55111b = q10;
        Fragment fragmentA = ((N) bundle.getParcelable("state")).a(c6123w, classLoader);
        this.f55112c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (FragmentManager.isLoggingEnabled(2)) {
            FS.log_v(FragmentManager.TAG, "Instantiated fragment " + fragmentA);
        }
    }

    O(C6126z c6126z, Q q10, Fragment fragment, Bundle bundle) {
        this.f55110a = c6126z;
        this.f55111b = q10;
        this.f55112c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
