package androidx.fragment.app;

import L2.b;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.S;
import androidx.view.AbstractC6023l;
import androidx.view.C5614b;
import androidx.view.InterfaceC6027p;
import androidx.view.InterfaceC6030s;
import androidx.view.g0;
import androidx.view.h0;
import com.fullstory.FS;
import com.google.maps.android.BuildConfig;
import g.AbstractC14147c;
import g.AbstractC14149e;
import g.C14145a;
import g.C14151g;
import g.InterfaceC14146b;
import g.InterfaceC14150f;
import h.AbstractC14314a;
import h.C14320g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o2.InterfaceC15993a;
import p2.InterfaceC16238u;
import p2.InterfaceC16247z;
import x4.f;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    private static boolean DEBUG = false;
    private static final String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    private static final String FRAGMENT_KEY_PREFIX = "fragment_";
    private static final String FRAGMENT_MANAGER_STATE_KEY = "state";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    private static final String RESULT_KEY_PREFIX = "result_";
    private static final String SAVED_STATE_KEY = "android:support:fragments";
    public static final String TAG = "FragmentManager";
    static boolean USE_PREDICTIVE_BACK = true;
    private AbstractC5979u mContainer;
    private ArrayList<Fragment> mCreatedMenus;
    private boolean mDestroyed;
    private boolean mExecutingActions;
    private boolean mHavePendingDeferredStart;
    private AbstractC5982x<?> mHost;
    private boolean mNeedMenuInvalidate;
    private J mNonConfig;
    private androidx.view.G mOnBackPressedDispatcher;
    private Fragment mParent;
    Fragment mPrimaryNav;
    private AbstractC14147c<String[]> mRequestPermissions;
    private AbstractC14147c<Intent> mStartActivityForResult;
    private AbstractC14147c<C14151g> mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private b.c mStrictModePolicy;
    private ArrayList<Fragment> mTmpAddedFragments;
    private ArrayList<Boolean> mTmpIsPop;
    private ArrayList<C5960a> mTmpRecords;
    private final ArrayList<q> mPendingActions = new ArrayList<>();
    private final Q mFragmentStore = new Q();
    ArrayList<C5960a> mBackStack = new ArrayList<>();
    private final LayoutInflaterFactory2C5983y mLayoutInflaterFactory = new LayoutInflaterFactory2C5983y(this);
    C5960a mTransitioningOp = null;
    boolean mHandlingTransitioningOp = false;
    private final androidx.view.F mOnBackPressedCallback = new b(false);
    private final AtomicInteger mBackStackIndex = new AtomicInteger();
    private final Map<String, C5962c> mBackStackStates = Collections.synchronizedMap(new HashMap());
    private final Map<String, Bundle> mResults = Collections.synchronizedMap(new HashMap());
    private final Map<String, o> mResultListeners = Collections.synchronizedMap(new HashMap());
    ArrayList<p> mBackStackChangeListeners = new ArrayList<>();
    private final C5984z mLifecycleCallbacksDispatcher = new C5984z(this);
    private final CopyOnWriteArrayList<K> mOnAttachListeners = new CopyOnWriteArrayList<>();
    private final InterfaceC15993a<Configuration> mOnConfigurationChangedListener = new InterfaceC15993a() { // from class: androidx.fragment.app.A
        @Override // o2.InterfaceC15993a
        public final void accept(Object obj) {
            FragmentManager.f(this.f54758a, (Configuration) obj);
        }
    };
    private final InterfaceC15993a<Integer> mOnTrimMemoryListener = new InterfaceC15993a() { // from class: androidx.fragment.app.B
        @Override // o2.InterfaceC15993a
        public final void accept(Object obj) {
            FragmentManager.a(this.f54759a, (Integer) obj);
        }
    };
    private final InterfaceC15993a<androidx.core.app.j> mOnMultiWindowModeChangedListener = new InterfaceC15993a() { // from class: androidx.fragment.app.C
        @Override // o2.InterfaceC15993a
        public final void accept(Object obj) {
            FragmentManager.e(this.f54760a, (androidx.core.app.j) obj);
        }
    };
    private final InterfaceC15993a<androidx.core.app.v> mOnPictureInPictureModeChangedListener = new InterfaceC15993a() { // from class: androidx.fragment.app.D
        @Override // o2.InterfaceC15993a
        public final void accept(Object obj) {
            FragmentManager.d(this.f54761a, (androidx.core.app.v) obj);
        }
    };
    private final InterfaceC16247z mMenuProvider = new c();
    int mCurState = -1;
    private C5981w mFragmentFactory = null;
    private C5981w mHostFragmentFactory = new d();
    private c0 mSpecialEffectsControllerFactory = null;
    private c0 mDefaultSpecialEffectsControllerFactory = new e();
    ArrayDeque<n> mLaunchedFragments = new ArrayDeque<>();
    private Runnable mExecCommit = new f();

    public static abstract class FragmentLifecycleCallbacks {
        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    class a implements InterfaceC14146b<Map<String, Boolean>> {
        a() {
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            int i10;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((Boolean) arrayList.get(i11)).booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                iArr[i11] = i10;
            }
            n nVarPollFirst = FragmentManager.this.mLaunchedFragments.pollFirst();
            if (nVarPollFirst == null) {
                FS.log_w(FragmentManager.TAG, "No permissions were requested for " + this);
                return;
            }
            String str = nVarPollFirst.f54833a;
            int i12 = nVarPollFirst.f54834b;
            Fragment fragmentI = FragmentManager.this.mFragmentStore.i(str);
            if (fragmentI == null) {
                FS.log_w(FragmentManager.TAG, "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            fragmentI.onRequestPermissionsResult(i12, strArr, iArr);
        }
    }

    class b extends androidx.view.F {
        @Override // androidx.view.F
        public void handleOnBackCancelled() {
            if (FragmentManager.isLoggingEnabled(3)) {
                FS.log_d(FragmentManager.TAG, "handleOnBackCancelled. PREDICTIVE_BACK = " + FragmentManager.USE_PREDICTIVE_BACK + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.USE_PREDICTIVE_BACK) {
                FragmentManager.this.cancelBackStackTransition();
            }
        }

        @Override // androidx.view.F
        public void handleOnBackPressed() {
            if (FragmentManager.isLoggingEnabled(3)) {
                FS.log_d(FragmentManager.TAG, "handleOnBackPressed. PREDICTIVE_BACK = " + FragmentManager.USE_PREDICTIVE_BACK + " fragment manager " + FragmentManager.this);
            }
            FragmentManager.this.handleOnBackPressed();
        }

        @Override // androidx.view.F
        public void handleOnBackProgressed(C5614b c5614b) {
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "handleOnBackProgressed. PREDICTIVE_BACK = " + FragmentManager.USE_PREDICTIVE_BACK + " fragment manager " + FragmentManager.this);
            }
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.mTransitioningOp != null) {
                Iterator<b0> it = fragmentManager.collectChangedControllers(new ArrayList<>(Collections.singletonList(FragmentManager.this.mTransitioningOp)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().A(c5614b);
                }
                Iterator<p> it2 = FragmentManager.this.mBackStackChangeListeners.iterator();
                while (it2.hasNext()) {
                    it2.next().a(c5614b);
                }
            }
        }

        @Override // androidx.view.F
        public void handleOnBackStarted(C5614b c5614b) {
            if (FragmentManager.isLoggingEnabled(3)) {
                FS.log_d(FragmentManager.TAG, "handleOnBackStarted. PREDICTIVE_BACK = " + FragmentManager.USE_PREDICTIVE_BACK + " fragment manager " + FragmentManager.this);
            }
            if (FragmentManager.USE_PREDICTIVE_BACK) {
                FragmentManager.this.endAnimatingAwayFragments();
                FragmentManager.this.prepareBackStackTransition();
            }
        }

        b(boolean z10) {
            super(z10);
        }
    }

    class c implements InterfaceC16247z {
        c() {
        }

        @Override // p2.InterfaceC16247z
        public void a(Menu menu) {
            FragmentManager.this.dispatchOptionsMenuClosed(menu);
        }

        @Override // p2.InterfaceC16247z
        public void b(Menu menu) {
            FragmentManager.this.dispatchPrepareOptionsMenu(menu);
        }

        @Override // p2.InterfaceC16247z
        public boolean c(MenuItem menuItem) {
            return FragmentManager.this.dispatchOptionsItemSelected(menuItem);
        }

        @Override // p2.InterfaceC16247z
        public void d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.dispatchCreateOptionsMenu(menu, menuInflater);
        }
    }

    class d extends C5981w {
        d() {
        }

        @Override // androidx.fragment.app.C5981w
        public Fragment instantiate(ClassLoader classLoader, String str) {
            return FragmentManager.this.getHost().b(FragmentManager.this.getHost().getContext(), str, null);
        }
    }

    class e implements c0 {
        e() {
        }

        @Override // androidx.fragment.app.c0
        public b0 a(ViewGroup viewGroup) {
            return new C5965f(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.execPendingActions(true);
        }
    }

    class g implements InterfaceC6027p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f54823a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M f54824b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6023l f54825c;

        g(String str, M m10, AbstractC6023l abstractC6023l) {
            this.f54823a = str;
            this.f54824b = m10;
            this.f54825c = abstractC6023l;
        }

        @Override // androidx.view.InterfaceC6027p
        public void onStateChanged(InterfaceC6030s interfaceC6030s, AbstractC6023l.a aVar) {
            Bundle bundle;
            if (aVar == AbstractC6023l.a.ON_START && (bundle = (Bundle) FragmentManager.this.mResults.get(this.f54823a)) != null) {
                this.f54824b.a(this.f54823a, bundle);
                FragmentManager.this.clearFragmentResult(this.f54823a);
            }
            if (aVar == AbstractC6023l.a.ON_DESTROY) {
                this.f54825c.d(this);
                FragmentManager.this.mResultListeners.remove(this.f54823a);
            }
        }
    }

    class h implements K {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f54827a;

        h(Fragment fragment) {
            this.f54827a = fragment;
        }

        @Override // androidx.fragment.app.K
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f54827a.onAttachFragment(fragment);
        }
    }

    class i implements InterfaceC14146b<C14145a> {
        i() {
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C14145a c14145a) {
            n nVarPollLast = FragmentManager.this.mLaunchedFragments.pollLast();
            if (nVarPollLast == null) {
                FS.log_w(FragmentManager.TAG, "No Activities were started for result for " + this);
                return;
            }
            String str = nVarPollLast.f54833a;
            int i10 = nVarPollLast.f54834b;
            Fragment fragmentI = FragmentManager.this.mFragmentStore.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i10, c14145a.getResultCode(), c14145a.getData());
                return;
            }
            FS.log_w(FragmentManager.TAG, "Activity result delivered for unknown Fragment " + str);
        }
    }

    class j implements InterfaceC14146b<C14145a> {
        j() {
        }

        @Override // g.InterfaceC14146b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C14145a c14145a) {
            n nVarPollFirst = FragmentManager.this.mLaunchedFragments.pollFirst();
            if (nVarPollFirst == null) {
                FS.log_w(FragmentManager.TAG, "No IntentSenders were started for " + this);
                return;
            }
            String str = nVarPollFirst.f54833a;
            int i10 = nVarPollFirst.f54834b;
            Fragment fragmentI = FragmentManager.this.mFragmentStore.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i10, c14145a.getResultCode(), c14145a.getData());
                return;
            }
            FS.log_w(FragmentManager.TAG, "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public interface k {
    }

    private class l implements q {

        /* renamed from: a, reason: collision with root package name */
        private final String f54831a;

        l(String str) {
            this.f54831a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.clearBackStackState(arrayList, arrayList2, this.f54831a);
        }
    }

    static class m extends AbstractC14314a<C14151g, C14145a> {
        @Override // h.AbstractC14314a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, C14151g c14151g) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = c14151g.getFillInIntent();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra(FragmentManager.EXTRA_CREATED_FILLIN_INTENT, false)) {
                    c14151g = new C14151g.a(c14151g.getIntentSender()).b(null).c(c14151g.getFlagsValues(), c14151g.getFlagsMask()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c14151g);
            if (FragmentManager.isLoggingEnabled(2)) {
                FS.log_v(FragmentManager.TAG, "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // h.AbstractC14314a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C14145a c(int i10, Intent intent) {
            return new C14145a(i10, intent);
        }

        m() {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        String f54833a;

        /* renamed from: b, reason: collision with root package name */
        int f54834b;

        class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public n createFromParcel(Parcel parcel) {
                return new n(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public n[] newArray(int i10) {
                return new n[i10];
            }

            a() {
            }
        }

        n(String str, int i10) {
            this.f54833a = str;
            this.f54834b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f54833a);
            parcel.writeInt(this.f54834b);
        }

        n(Parcel parcel) {
            this.f54833a = parcel.readString();
            this.f54834b = parcel.readInt();
        }
    }

    private static class o implements M {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC6023l f54835a;

        /* renamed from: b, reason: collision with root package name */
        private final M f54836b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC6027p f54837c;

        @Override // androidx.fragment.app.M
        public void a(String str, Bundle bundle) {
            this.f54836b.a(str, bundle);
        }

        public boolean b(AbstractC6023l.b bVar) {
            return this.f54835a.getState().b(bVar);
        }

        public void c() {
            this.f54835a.d(this.f54837c);
        }

        o(AbstractC6023l abstractC6023l, M m10, InterfaceC6027p interfaceC6027p) {
            this.f54835a = abstractC6023l;
            this.f54836b = m10;
            this.f54837c = interfaceC6027p;
        }
    }

    public interface p {
        default void a(C5614b c5614b) {
        }

        default void b(Fragment fragment, boolean z10) {
        }

        default void c(Fragment fragment, boolean z10) {
        }

        default void d() {
        }

        void onBackStackChanged();
    }

    interface q {
        boolean a(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class r implements q {

        /* renamed from: a, reason: collision with root package name */
        final String f54838a;

        /* renamed from: b, reason: collision with root package name */
        final int f54839b;

        /* renamed from: c, reason: collision with root package name */
        final int f54840c;

        r(String str, int i10, int i11) {
            this.f54838a = str;
            this.f54839b = i10;
            this.f54840c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.mPrimaryNav;
            if (fragment == null || this.f54839b >= 0 || this.f54838a != null || !fragment.getChildFragmentManager().popBackStackImmediate()) {
                return FragmentManager.this.popBackStackState(arrayList, arrayList2, this.f54838a, this.f54839b, this.f54840c);
            }
            return false;
        }
    }

    class s implements q {
        s() {
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2) {
            boolean zPrepareBackStackState = FragmentManager.this.prepareBackStackState(arrayList, arrayList2);
            if (!FragmentManager.this.mBackStackChangeListeners.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<C5960a> it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(FragmentManager.this.fragmentsFromRecord(it.next()));
                }
                Iterator<p> it2 = FragmentManager.this.mBackStackChangeListeners.iterator();
                while (it2.hasNext()) {
                    p next = it2.next();
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        next.c((Fragment) it3.next(), zBooleanValue);
                    }
                }
            }
            return zPrepareBackStackState;
        }
    }

    private class t implements q {

        /* renamed from: a, reason: collision with root package name */
        private final String f54843a;

        t(String str) {
            this.f54843a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.restoreBackStackState(arrayList, arrayList2, this.f54843a);
        }
    }

    private class u implements q {

        /* renamed from: a, reason: collision with root package name */
        private final String f54845a;

        u(String str) {
            this.f54845a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean a(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.saveBackStackState(arrayList, arrayList2, this.f54845a);
        }
    }

    private void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    private void dispatchStateChange(int i10) {
        try {
            this.mExecutingActions = true;
            this.mFragmentStore.d(i10);
            moveToState(i10, false);
            Iterator<b0> it = collectAllSpecialEffectsController().iterator();
            while (it.hasNext()) {
                it.next().q();
            }
            this.mExecutingActions = false;
            execPendingActions(true);
        } catch (Throwable th2) {
            this.mExecutingActions = false;
            throw th2;
        }
    }

    static Fragment findViewFragment(View view) {
        while (view != null) {
            Fragment viewFragment = getViewFragment(view);
            if (viewFragment != null) {
                return viewFragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void reportBackStackChanged() {
        for (int i10 = 0; i10 < this.mBackStackChangeListeners.size(); i10++) {
            this.mBackStackChangeListeners.get(i10).onBackStackChanged();
        }
    }

    static int reverseTransit(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    void attachFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.mFragmentStore.a(fragment);
            if (isLoggingEnabled(2)) {
                FS.log_v(TAG, "add from attach: " + fragment);
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
    }

    void cancelBackStackTransition() {
        if (isLoggingEnabled(3)) {
            FS.log_d(TAG, "cancelBackStackTransition for transition " + this.mTransitioningOp);
        }
        C5960a c5960a = this.mTransitioningOp;
        if (c5960a != null) {
            c5960a.f54970u = false;
            c5960a.z();
            this.mTransitioningOp.v(true, new Runnable() { // from class: androidx.fragment.app.F
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentManager.c(this.f54769a);
                }
            });
            this.mTransitioningOp.h();
            this.mHandlingTransitioningOp = true;
            executePendingTransactions();
            this.mHandlingTransitioningOp = false;
            this.mTransitioningOp = null;
        }
    }

    void detachFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (isLoggingEnabled(2)) {
                FS.log_v(TAG, "remove from detach: " + fragment);
            }
            this.mFragmentStore.v(fragment);
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            setVisibleRemovingFragment(fragment);
        }
    }

    void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.A(false);
        dispatchStateChange(4);
    }

    void dispatchAttach() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.A(false);
        dispatchStateChange(0);
    }

    void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.A(false);
        dispatchStateChange(1);
    }

    void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions(true);
        endAnimatingAwayFragments();
        clearBackStackStateViewModels();
        dispatchStateChange(-1);
        Object obj = this.mHost;
        if (obj instanceof Z1.d) {
            ((Z1.d) obj).removeOnTrimMemoryListener(this.mOnTrimMemoryListener);
        }
        Object obj2 = this.mHost;
        if (obj2 instanceof Z1.c) {
            ((Z1.c) obj2).removeOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
        }
        Object obj3 = this.mHost;
        if (obj3 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj3).removeOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
        }
        Object obj4 = this.mHost;
        if (obj4 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj4).removeOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
        }
        Object obj5 = this.mHost;
        if ((obj5 instanceof InterfaceC16238u) && this.mParent == null) {
            ((InterfaceC16238u) obj5).removeMenuProvider(this.mMenuProvider);
        }
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            this.mOnBackPressedCallback.remove();
            this.mOnBackPressedDispatcher = null;
        }
        AbstractC14147c<Intent> abstractC14147c = this.mStartActivityForResult;
        if (abstractC14147c != null) {
            abstractC14147c.c();
            this.mStartIntentSenderForResult.c();
            this.mRequestPermissions.c();
        }
    }

    void dispatchDestroyView() {
        dispatchStateChange(1);
    }

    void dispatchPause() {
        dispatchStateChange(5);
    }

    void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.A(false);
        dispatchStateChange(7);
    }

    void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.A(false);
        dispatchStateChange(5);
    }

    void dispatchStop() {
        this.mStopped = true;
        this.mNonConfig.A(true);
        dispatchStateChange(4);
    }

    void dispatchViewCreated() {
        dispatchStateChange(2);
    }

    public boolean executePendingTransactions() {
        boolean zExecPendingActions = execPendingActions(true);
        forcePostponedTransactions();
        return zExecPendingActions;
    }

    void handleOnBackPressed() {
        this.mHandlingTransitioningOp = true;
        execPendingActions(true);
        this.mHandlingTransitioningOp = false;
        if (!USE_PREDICTIVE_BACK || this.mTransitioningOp == null) {
            if (this.mOnBackPressedCallback.getIsEnabled()) {
                if (isLoggingEnabled(3)) {
                    FS.log_d(TAG, "Calling popBackStackImmediate via onBackPressed callback");
                }
                popBackStackImmediate();
                return;
            } else {
                if (isLoggingEnabled(3)) {
                    FS.log_d(TAG, "Calling onBackPressed via onBackPressed callback");
                }
                this.mOnBackPressedDispatcher.l();
                return;
            }
        }
        if (!this.mBackStackChangeListeners.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(fragmentsFromRecord(this.mTransitioningOp));
            Iterator<p> it = this.mBackStackChangeListeners.iterator();
            while (it.hasNext()) {
                p next = it.next();
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    next.b((Fragment) it2.next(), true);
                }
            }
        }
        Iterator<S.a> it3 = this.mTransitioningOp.f54907c.iterator();
        while (it3.hasNext()) {
            Fragment fragment = it3.next().f54925b;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        Iterator<b0> it4 = collectChangedControllers(new ArrayList<>(Collections.singletonList(this.mTransitioningOp)), 0, 1).iterator();
        while (it4.hasNext()) {
            it4.next().f();
        }
        Iterator<S.a> it5 = this.mTransitioningOp.f54907c.iterator();
        while (it5.hasNext()) {
            Fragment fragment2 = it5.next().f54925b;
            if (fragment2 != null && fragment2.mContainer == null) {
                createOrGetFragmentStateManager(fragment2).m();
            }
        }
        this.mTransitioningOp = null;
        updateOnBackPressedCallbackEnabled();
        if (isLoggingEnabled(3)) {
            FS.log_d(TAG, "Op is being set to null");
            FS.log_d(TAG, "OnBackPressedCallback enabled=" + this.mOnBackPressedCallback.getIsEnabled() + " for  FragmentManager " + this);
        }
    }

    void hideFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        setVisibleRemovingFragment(fragment);
    }

    boolean isPrimaryNavigation(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.getPrimaryNavigationFragment()) && isPrimaryNavigation(fragmentManager.mParent);
    }

    public void popBackStack() {
        enqueueAction(new r(null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return popBackStackImmediate(null, -1, 0);
    }

    boolean popBackStackState(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int iFindBackStackIndex = findBackStackIndex(str, i10, (i11 & 1) != 0);
        if (iFindBackStackIndex < 0) {
            return false;
        }
        for (int size = this.mBackStack.size() - 1; size >= iFindBackStackIndex; size--) {
            arrayList.add(this.mBackStack.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    boolean prepareBackStackState(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2) {
        if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.mPendingActions);
        }
        if (this.mBackStack.isEmpty()) {
            FS.log_i(TAG, "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList<C5960a> arrayList3 = this.mBackStack;
        C5960a c5960a = arrayList3.get(arrayList3.size() - 1);
        this.mTransitioningOp = c5960a;
        Iterator<S.a> it = c5960a.f54907c.iterator();
        while (it.hasNext()) {
            Fragment fragment = it.next().f54925b;
            if (fragment != null) {
                fragment.mTransitioning = true;
            }
        }
        return popBackStackState(arrayList, arrayList2, null, -1, 0);
    }

    void removeFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        this.mFragmentStore.v(fragment);
        if (isMenuAvailable(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
        fragment.mRemoving = true;
        setVisibleRemovingFragment(fragment);
    }

    void showFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager) {
        Iterator<p> it = fragmentManager.mBackStackChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    private void clearBackStackStateViewModels() {
        AbstractC5982x<?> abstractC5982x = this.mHost;
        if (abstractC5982x instanceof h0 ? this.mFragmentStore.q().w() : abstractC5982x.getContext() instanceof Activity ? !((Activity) this.mHost.getContext()).isChangingConfigurations() : true) {
            Iterator<C5962c> it = this.mBackStackStates.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f55021a.iterator();
                while (it2.hasNext()) {
                    this.mFragmentStore.q().o(it2.next(), false);
                }
            }
        }
    }

    private Set<b0> collectAllSpecialEffectsController() {
        HashSet hashSet = new HashSet();
        Iterator<O> it = this.mFragmentStore.l().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(b0.v(viewGroup, getSpecialEffectsControllerFactory()));
            }
        }
        return hashSet;
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(Fragment fragment) {
        if (fragment == null || !fragment.equals(findActiveFragment(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private void doPendingDeferredStart() {
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    @Deprecated
    public static void enableDebugLogging(boolean z10) {
        DEBUG = z10;
    }

    public static void enablePredictiveBack(boolean z10) {
        USE_PREDICTIVE_BACK = z10;
    }

    private void ensureExecReady(boolean z10) {
        if (this.mExecutingActions) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.mHost == null) {
            if (!this.mDestroyed) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.mHost.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            checkStateLoss();
        }
        if (this.mTmpRecords == null) {
            this.mTmpRecords = new ArrayList<>();
            this.mTmpIsPop = new ArrayList<>();
        }
    }

    private static void executeOps(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            C5960a c5960a = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                c5960a.y(-1);
                c5960a.E();
            } else {
                c5960a.y(1);
                c5960a.D();
            }
            i10++;
        }
    }

    private int findBackStackIndex(String str, int i10, boolean z10) {
        if (this.mBackStack.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.mBackStack.size() - 1;
        }
        int size = this.mBackStack.size() - 1;
        while (size >= 0) {
            C5960a c5960a = this.mBackStack.get(size);
            if ((str != null && str.equals(c5960a.G())) || (i10 >= 0 && i10 == c5960a.f54971v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.mBackStack.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C5960a c5960a2 = this.mBackStack.get(size - 1);
            if ((str == null || !str.equals(c5960a2.G())) && (i10 < 0 || i10 != c5960a2.f54971v)) {
                break;
            }
            size--;
        }
        return size;
    }

    private boolean generateOpsForPendingActions(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.mPendingActions) {
            if (this.mPendingActions.isEmpty()) {
                return false;
            }
            try {
                int size = this.mPendingActions.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= this.mPendingActions.get(i10).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.mPendingActions.clear();
                this.mHost.getHandler().removeCallbacks(this.mExecCommit);
            }
        }
    }

    private J getChildNonConfig(Fragment fragment) {
        return this.mNonConfig.r(fragment);
    }

    private ViewGroup getFragmentContainer(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.mContainer.d()) {
            View viewC = this.mContainer.c(fragment.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    static Fragment getViewFragment(View view) {
        Object tag = view.getTag(K2.b.f16275a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean isLoggingEnabled(int i10) {
        return DEBUG || Log.isLoggable(TAG, i10);
    }

    private boolean isMenuAvailable(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.checkForMenus();
    }

    private boolean isParentAdded() {
        Fragment fragment = this.mParent;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.mParent.getParentFragmentManager().isParentAdded();
    }

    private void startPendingDeferredFragments() {
        Iterator<O> it = this.mFragmentStore.l().iterator();
        while (it.hasNext()) {
            performPendingDeferredStart(it.next());
        }
    }

    private void updateOnBackPressedCallbackEnabled() {
        synchronized (this.mPendingActions) {
            try {
                if (!this.mPendingActions.isEmpty()) {
                    this.mOnBackPressedCallback.setEnabled(true);
                    if (isLoggingEnabled(3)) {
                        FS.log_d(TAG, "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = getBackStackEntryCount() > 0 && isPrimaryNavigation(this.mParent);
                if (isLoggingEnabled(3)) {
                    FS.log_d(TAG, "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.mOnBackPressedCallback.setEnabled(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void addBackStackState(C5960a c5960a) {
        this.mBackStack.add(c5960a);
    }

    O addFragment(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            L2.b.f(fragment, str);
        }
        if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "add: " + fragment);
        }
        O oCreateOrGetFragmentStateManager = createOrGetFragmentStateManager(fragment);
        fragment.mFragmentManager = this;
        this.mFragmentStore.s(oCreateOrGetFragmentStateManager);
        if (!fragment.mDetached) {
            this.mFragmentStore.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
        return oCreateOrGetFragmentStateManager;
    }

    public void addFragmentOnAttachListener(K k10) {
        this.mOnAttachListeners.add(k10);
    }

    public void addOnBackStackChangedListener(p pVar) {
        this.mBackStackChangeListeners.add(pVar);
    }

    void addRetainedFragment(Fragment fragment) {
        this.mNonConfig.m(fragment);
    }

    int allocBackStackIndex() {
        return this.mBackStackIndex.getAndIncrement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void attachController(AbstractC5982x<?> abstractC5982x, AbstractC5979u abstractC5979u, Fragment fragment) {
        String str;
        if (this.mHost != null) {
            throw new IllegalStateException("Already attached");
        }
        this.mHost = abstractC5982x;
        this.mContainer = abstractC5979u;
        this.mParent = fragment;
        if (fragment != null) {
            addFragmentOnAttachListener(new h(fragment));
        } else if (abstractC5982x instanceof K) {
            addFragmentOnAttachListener((K) abstractC5982x);
        }
        if (this.mParent != null) {
            updateOnBackPressedCallbackEnabled();
        }
        if (abstractC5982x instanceof androidx.view.J) {
            androidx.view.J j10 = (androidx.view.J) abstractC5982x;
            androidx.view.G onBackPressedDispatcher = j10.getOnBackPressedDispatcher();
            this.mOnBackPressedDispatcher = onBackPressedDispatcher;
            InterfaceC6030s interfaceC6030s = j10;
            if (fragment != null) {
                interfaceC6030s = fragment;
            }
            onBackPressedDispatcher.i(interfaceC6030s, this.mOnBackPressedCallback);
        }
        if (fragment != null) {
            this.mNonConfig = fragment.mFragmentManager.getChildNonConfig(fragment);
        } else if (abstractC5982x instanceof h0) {
            this.mNonConfig = J.s(((h0) abstractC5982x).getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String());
        } else {
            this.mNonConfig = new J(false);
        }
        this.mNonConfig.A(isStateSaved());
        this.mFragmentStore.B(this.mNonConfig);
        Object obj = this.mHost;
        if ((obj instanceof x4.i) && fragment == null) {
            x4.f savedStateRegistry = ((x4.i) obj).getSavedStateRegistry();
            savedStateRegistry.c(SAVED_STATE_KEY, new f.b() { // from class: androidx.fragment.app.E
                @Override // x4.f.b
                public final Bundle saveState() {
                    return this.f54768a.saveAllStateInternal();
                }
            });
            Bundle bundleA = savedStateRegistry.a(SAVED_STATE_KEY);
            if (bundleA != null) {
                restoreSaveStateInternal(bundleA);
            }
        }
        Object obj2 = this.mHost;
        if (obj2 instanceof InterfaceC14150f) {
            AbstractC14149e activityResultRegistry = ((InterfaceC14150f) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.mStartActivityForResult = activityResultRegistry.m(str2 + "StartActivityForResult", new h.i(), new i());
            this.mStartIntentSenderForResult = activityResultRegistry.m(str2 + "StartIntentSenderForResult", new m(), new j());
            this.mRequestPermissions = activityResultRegistry.m(str2 + "RequestPermissions", new C14320g(), new a());
        }
        Object obj3 = this.mHost;
        if (obj3 instanceof Z1.c) {
            ((Z1.c) obj3).addOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
        }
        Object obj4 = this.mHost;
        if (obj4 instanceof Z1.d) {
            ((Z1.d) obj4).addOnTrimMemoryListener(this.mOnTrimMemoryListener);
        }
        Object obj5 = this.mHost;
        if (obj5 instanceof androidx.core.app.r) {
            ((androidx.core.app.r) obj5).addOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
        }
        Object obj6 = this.mHost;
        if (obj6 instanceof androidx.core.app.s) {
            ((androidx.core.app.s) obj6).addOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
        }
        Object obj7 = this.mHost;
        if ((obj7 instanceof InterfaceC16238u) && fragment == null) {
            ((InterfaceC16238u) obj7).addMenuProvider(this.mMenuProvider);
        }
    }

    public S beginTransaction() {
        return new C5960a(this);
    }

    boolean checkForMenus() {
        boolean zIsMenuAvailable = false;
        for (Fragment fragment : this.mFragmentStore.m()) {
            if (fragment != null) {
                zIsMenuAvailable = isMenuAvailable(fragment);
            }
            if (zIsMenuAvailable) {
                return true;
            }
        }
        return false;
    }

    public void clearBackStack(String str) {
        enqueueAction(new l(str), false);
    }

    public final void clearFragmentResult(String str) {
        this.mResults.remove(str);
        if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "Clearing fragment result with key " + str);
        }
    }

    public final void clearFragmentResultListener(String str) {
        o oVarRemove = this.mResultListeners.remove(str);
        if (oVarRemove != null) {
            oVarRemove.c();
        }
        if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "Clearing FragmentResultListener for key " + str);
        }
    }

    Set<b0> collectChangedControllers(ArrayList<C5960a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<S.a> it = arrayList.get(i10).f54907c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f54925b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(b0.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    O createOrGetFragmentStateManager(Fragment fragment) {
        O o10 = this.mFragmentStore.o(fragment.mWho);
        if (o10 != null) {
            return o10;
        }
        O o11 = new O(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment);
        o11.o(this.mHost.getContext().getClassLoader());
        o11.t(this.mCurState);
        return o11;
    }

    void dispatchConfigurationChanged(Configuration configuration, boolean z10) {
        if (z10 && (this.mHost instanceof Z1.c)) {
            throwException(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.p()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.dispatchConfigurationChanged(configuration, true);
                }
            }
        }
    }

    boolean dispatchContextItemSelected(MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.p()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.mCurState < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.mFragmentStore.p()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i10 = 0; i10 < this.mCreatedMenus.size(); i10++) {
                Fragment fragment2 = this.mCreatedMenus.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z10;
    }

    void dispatchLowMemory(boolean z10) {
        if (z10 && (this.mHost instanceof Z1.d)) {
            throwException(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.p()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.dispatchLowMemory(true);
                }
            }
        }
    }

    void dispatchMultiWindowModeChanged(boolean z10, boolean z11) {
        if (z11 && (this.mHost instanceof androidx.core.app.r)) {
            throwException(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.p()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.dispatchMultiWindowModeChanged(z10, true);
                }
            }
        }
    }

    void dispatchOnAttachFragment(Fragment fragment) {
        Iterator<K> it = this.mOnAttachListeners.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    void dispatchOnHiddenChanged() {
        for (Fragment fragment : this.mFragmentStore.m()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.dispatchOnHiddenChanged();
            }
        }
    }

    boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.p()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void dispatchOptionsMenuClosed(Menu menu) {
        if (this.mCurState < 1) {
            return;
        }
        for (Fragment fragment : this.mFragmentStore.p()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    void dispatchPictureInPictureModeChanged(boolean z10, boolean z11) {
        if (z11 && (this.mHost instanceof androidx.core.app.s)) {
            throwException(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.mFragmentStore.p()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.dispatchPictureInPictureModeChanged(z10, true);
                }
            }
        }
    }

    boolean dispatchPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.p()) {
            if (fragment != null && isParentMenuVisible(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.mFragmentStore.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.mCreatedMenus;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.mCreatedMenus.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        int size2 = this.mBackStack.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                C5960a c5960a = this.mBackStack.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(c5960a.toString());
                c5960a.B(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.mBackStackIndex.get());
        synchronized (this.mPendingActions) {
            try {
                int size3 = this.mPendingActions.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        q qVar = this.mPendingActions.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(qVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
    }

    void enqueueAction(q qVar, boolean z10) {
        if (!z10) {
            if (this.mHost == null) {
                if (!this.mDestroyed) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            checkStateLoss();
        }
        synchronized (this.mPendingActions) {
            try {
                if (this.mHost == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.mPendingActions.add(qVar);
                    scheduleCommit();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void execSingleAction(q qVar, boolean z10) {
        if (z10 && (this.mHost == null || this.mDestroyed)) {
            return;
        }
        ensureExecReady(z10);
        C5960a c5960a = this.mTransitioningOp;
        boolean z11 = false;
        if (c5960a != null) {
            c5960a.f54970u = false;
            c5960a.z();
            if (isLoggingEnabled(3)) {
                FS.log_d(TAG, "Reversing mTransitioningOp " + this.mTransitioningOp + " as part of execSingleAction for action " + qVar);
            }
            this.mTransitioningOp.A(false, false);
            boolean zA = this.mTransitioningOp.a(this.mTmpRecords, this.mTmpIsPop);
            Iterator<S.a> it = this.mTransitioningOp.f54907c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f54925b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.mTransitioningOp = null;
            z11 = zA;
        }
        boolean zA2 = qVar.a(this.mTmpRecords, this.mTmpIsPop);
        if (z11 || zA2) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.b();
    }

    Fragment findActiveFragment(String str) {
        return this.mFragmentStore.f(str);
    }

    public Fragment findFragmentById(int i10) {
        return this.mFragmentStore.g(i10);
    }

    public Fragment findFragmentByTag(String str) {
        return this.mFragmentStore.h(str);
    }

    Fragment findFragmentByWho(String str) {
        return this.mFragmentStore.i(str);
    }

    Set<Fragment> fragmentsFromRecord(C5960a c5960a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c5960a.f54907c.size(); i10++) {
            Fragment fragment = c5960a.f54907c.get(i10).f54925b;
            if (fragment != null && c5960a.f54913i) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    int getActiveFragmentCount() {
        return this.mFragmentStore.k();
    }

    List<Fragment> getActiveFragments() {
        return this.mFragmentStore.m();
    }

    public k getBackStackEntryAt(int i10) {
        if (i10 != this.mBackStack.size()) {
            return this.mBackStack.get(i10);
        }
        C5960a c5960a = this.mTransitioningOp;
        if (c5960a != null) {
            return c5960a;
        }
        throw new IndexOutOfBoundsException();
    }

    public int getBackStackEntryCount() {
        return this.mBackStack.size() + (this.mTransitioningOp != null ? 1 : 0);
    }

    AbstractC5979u getContainer() {
        return this.mContainer;
    }

    public C5981w getFragmentFactory() {
        C5981w c5981w = this.mFragmentFactory;
        if (c5981w != null) {
            return c5981w;
        }
        Fragment fragment = this.mParent;
        return fragment != null ? fragment.mFragmentManager.getFragmentFactory() : this.mHostFragmentFactory;
    }

    Q getFragmentStore() {
        return this.mFragmentStore;
    }

    public List<Fragment> getFragments() {
        return this.mFragmentStore.p();
    }

    public AbstractC5982x<?> getHost() {
        return this.mHost;
    }

    LayoutInflater.Factory2 getLayoutInflaterFactory() {
        return this.mLayoutInflaterFactory;
    }

    C5984z getLifecycleCallbacksDispatcher() {
        return this.mLifecycleCallbacksDispatcher;
    }

    Fragment getParent() {
        return this.mParent;
    }

    public Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    c0 getSpecialEffectsControllerFactory() {
        c0 c0Var = this.mSpecialEffectsControllerFactory;
        if (c0Var != null) {
            return c0Var;
        }
        Fragment fragment = this.mParent;
        return fragment != null ? fragment.mFragmentManager.getSpecialEffectsControllerFactory() : this.mDefaultSpecialEffectsControllerFactory;
    }

    public b.c getStrictModePolicy() {
        return this.mStrictModePolicy;
    }

    g0 getViewModelStore(Fragment fragment) {
        return this.mNonConfig.v(fragment);
    }

    void invalidateMenuForFragment(Fragment fragment) {
        if (fragment.mAdded && isMenuAvailable(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    boolean isParentHidden(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    boolean isParentMenuVisible(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    boolean isStateAtLeast(int i10) {
        return this.mCurState >= i10;
    }

    public boolean isStateSaved() {
        return this.mStateSaved || this.mStopped;
    }

    void launchRequestPermissions(Fragment fragment, String[] strArr, int i10) {
        if (this.mRequestPermissions == null) {
            this.mHost.l(fragment, strArr, i10);
            return;
        }
        this.mLaunchedFragments.addLast(new n(fragment.mWho, i10));
        this.mRequestPermissions.a(strArr);
    }

    void launchStartActivityForResult(Fragment fragment, Intent intent, int i10, Bundle bundle) {
        if (this.mStartActivityForResult == null) {
            this.mHost.n(fragment, intent, i10, bundle);
            return;
        }
        this.mLaunchedFragments.addLast(new n(fragment.mWho, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.mStartActivityForResult.a(intent);
    }

    void launchStartIntentSenderForResult(Fragment fragment, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mStartIntentSenderForResult == null) {
            this.mHost.o(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra(EXTRA_CREATED_FILLIN_INTENT, true);
            }
            if (isLoggingEnabled(2)) {
                FS.log_v(TAG, "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        C14151g c14151gA = new C14151g.a(intentSender).b(intent).c(i12, i11).a();
        this.mLaunchedFragments.addLast(new n(fragment.mWho, i10));
        if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.mStartIntentSenderForResult.a(c14151gA);
    }

    void moveToState(int i10, boolean z10) {
        AbstractC5982x<?> abstractC5982x;
        if (this.mHost == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.mCurState) {
            this.mCurState = i10;
            this.mFragmentStore.u();
            startPendingDeferredFragments();
            if (this.mNeedMenuInvalidate && (abstractC5982x = this.mHost) != null && this.mCurState == 7) {
                abstractC5982x.p();
                this.mNeedMenuInvalidate = false;
            }
        }
    }

    void noteStateNotSaved() {
        if (this.mHost == null) {
            return;
        }
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.A(false);
        for (Fragment fragment : this.mFragmentStore.p()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void onContainerAvailable(FragmentContainerView fragmentContainerView) {
        View view;
        for (O o10 : this.mFragmentStore.l()) {
            Fragment fragmentK = o10.k();
            if (fragmentK.mContainerId == fragmentContainerView.getId() && (view = fragmentK.mView) != null && view.getParent() == null) {
                fragmentK.mContainer = fragmentContainerView;
                o10.b();
                o10.m();
            }
        }
    }

    public void popBackStack(String str, int i10) {
        enqueueAction(new r(str, -1, i10), false);
    }

    public boolean popBackStackImmediate(String str, int i10) {
        return popBackStackImmediate(str, -1, i10);
    }

    void prepareBackStackTransition() {
        enqueueAction(new s(), false);
    }

    public void putFragment(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public void registerFragmentLifecycleCallbacks(FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z10) {
        this.mLifecycleCallbacksDispatcher.o(fragmentLifecycleCallbacks, z10);
    }

    public void removeFragmentOnAttachListener(K k10) {
        this.mOnAttachListeners.remove(k10);
    }

    public void removeOnBackStackChangedListener(p pVar) {
        this.mBackStackChangeListeners.remove(pVar);
    }

    void removeRetainedFragment(Fragment fragment) {
        this.mNonConfig.x(fragment);
    }

    void restoreAllState(Parcelable parcelable, H h10) {
        if (this.mHost instanceof h0) {
            throwException(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.mNonConfig.y(h10);
        restoreSaveStateInternal(parcelable);
    }

    public void restoreBackStack(String str) {
        enqueueAction(new t(str), false);
    }

    boolean restoreBackStackState(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2, String str) {
        C5962c c5962cRemove = this.mBackStackStates.remove(str);
        if (c5962cRemove == null) {
            return false;
        }
        HashMap map = new HashMap();
        Iterator<C5960a> it = arrayList.iterator();
        while (it.hasNext()) {
            C5960a next = it.next();
            if (next.f54972w) {
                Iterator<S.a> it2 = next.f54907c.iterator();
                while (it2.hasNext()) {
                    Fragment fragment = it2.next().f54925b;
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        Iterator<C5960a> it3 = c5962cRemove.a(this, map).iterator();
        while (true) {
            boolean z10 = false;
            while (it3.hasNext()) {
                if (it3.next().a(arrayList, arrayList2) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    void restoreSaveState(Parcelable parcelable) {
        if (this.mHost instanceof x4.i) {
            throwException(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        restoreSaveStateInternal(parcelable);
    }

    void restoreSaveStateInternal(Parcelable parcelable) {
        O o10;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith(RESULT_KEY_PREFIX) && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.mHost.getContext().getClassLoader());
                this.mResults.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith(FRAGMENT_KEY_PREFIX) && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.mHost.getContext().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.mFragmentStore.y(map);
        I i10 = (I) bundle3.getParcelable(FRAGMENT_MANAGER_STATE_KEY);
        if (i10 == null) {
            return;
        }
        this.mFragmentStore.w();
        Iterator<String> it = i10.f54850a.iterator();
        while (it.hasNext()) {
            Bundle bundleC = this.mFragmentStore.C(it.next(), null);
            if (bundleC != null) {
                Fragment fragmentQ = this.mNonConfig.q(((N) bundleC.getParcelable(FRAGMENT_MANAGER_STATE_KEY)).f54872b);
                if (fragmentQ != null) {
                    if (isLoggingEnabled(2)) {
                        FS.log_v(TAG, "restoreSaveState: re-attaching retained " + fragmentQ);
                    }
                    o10 = new O(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragmentQ, bundleC);
                } else {
                    o10 = new O(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, this.mHost.getContext().getClassLoader(), getFragmentFactory(), bundleC);
                }
                Fragment fragmentK = o10.k();
                fragmentK.mSavedFragmentState = bundleC;
                fragmentK.mFragmentManager = this;
                if (isLoggingEnabled(2)) {
                    FS.log_v(TAG, "restoreSaveState: active (" + fragmentK.mWho + "): " + fragmentK);
                }
                o10.o(this.mHost.getContext().getClassLoader());
                this.mFragmentStore.s(o10);
                o10.t(this.mCurState);
            }
        }
        for (Fragment fragment : this.mNonConfig.t()) {
            if (!this.mFragmentStore.c(fragment.mWho)) {
                if (isLoggingEnabled(2)) {
                    FS.log_v(TAG, "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + i10.f54850a);
                }
                this.mNonConfig.x(fragment);
                fragment.mFragmentManager = this;
                O o11 = new O(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment);
                o11.t(1);
                o11.m();
                fragment.mRemoving = true;
                o11.m();
            }
        }
        this.mFragmentStore.x(i10.f54851b);
        if (i10.f54852c != null) {
            this.mBackStack = new ArrayList<>(i10.f54852c.length);
            int i11 = 0;
            while (true) {
                C5961b[] c5961bArr = i10.f54852c;
                if (i11 >= c5961bArr.length) {
                    break;
                }
                C5960a c5960aB = c5961bArr[i11].b(this);
                if (isLoggingEnabled(2)) {
                    FS.log_v(TAG, "restoreAllState: back stack #" + i11 + " (index " + c5960aB.f54971v + "): " + c5960aB);
                    PrintWriter printWriter = new PrintWriter(new Y(TAG));
                    c5960aB.C("  ", printWriter, false);
                    printWriter.close();
                }
                this.mBackStack.add(c5960aB);
                i11++;
            }
        } else {
            this.mBackStack = new ArrayList<>();
        }
        this.mBackStackIndex.set(i10.f54853d);
        String str3 = i10.f54854e;
        if (str3 != null) {
            Fragment fragmentFindActiveFragment = findActiveFragment(str3);
            this.mPrimaryNav = fragmentFindActiveFragment;
            dispatchParentPrimaryNavigationFragmentChanged(fragmentFindActiveFragment);
        }
        ArrayList<String> arrayList = i10.f54855f;
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                this.mBackStackStates.put(arrayList.get(i12), i10.f54856g.get(i12));
            }
        }
        this.mLaunchedFragments = new ArrayDeque<>(i10.f54857h);
    }

    @Deprecated
    H retainNonConfig() {
        if (this.mHost instanceof h0) {
            throwException(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.mNonConfig.u();
    }

    Parcelable saveAllState() {
        if (this.mHost instanceof x4.i) {
            throwException(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle bundleSaveAllStateInternal = saveAllStateInternal();
        if (bundleSaveAllStateInternal.isEmpty()) {
            return null;
        }
        return bundleSaveAllStateInternal;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle saveAllStateInternal() {
        C5961b[] c5961bArr;
        Bundle bundle = new Bundle();
        forcePostponedTransactions();
        endAnimatingAwayFragments();
        execPendingActions(true);
        this.mStateSaved = true;
        this.mNonConfig.A(true);
        ArrayList<String> arrayListZ = this.mFragmentStore.z();
        HashMap<String, Bundle> mapN = this.mFragmentStore.n();
        if (!mapN.isEmpty()) {
            ArrayList<String> arrayListA = this.mFragmentStore.A();
            int size = this.mBackStack.size();
            if (size > 0) {
                c5961bArr = new C5961b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    c5961bArr[i10] = new C5961b(this.mBackStack.get(i10));
                    if (isLoggingEnabled(2)) {
                        FS.log_v(TAG, "saveAllState: adding back stack #" + i10 + ": " + this.mBackStack.get(i10));
                    }
                }
            } else {
                c5961bArr = null;
            }
            I i11 = new I();
            i11.f54850a = arrayListZ;
            i11.f54851b = arrayListA;
            i11.f54852c = c5961bArr;
            i11.f54853d = this.mBackStackIndex.get();
            Fragment fragment = this.mPrimaryNav;
            if (fragment != null) {
                i11.f54854e = fragment.mWho;
            }
            i11.f54855f.addAll(this.mBackStackStates.keySet());
            i11.f54856g.addAll(this.mBackStackStates.values());
            i11.f54857h = new ArrayList<>(this.mLaunchedFragments);
            bundle.putParcelable(FRAGMENT_MANAGER_STATE_KEY, i11);
            for (String str : this.mResults.keySet()) {
                bundle.putBundle(RESULT_KEY_PREFIX + str, this.mResults.get(str));
            }
            for (String str2 : mapN.keySet()) {
                bundle.putBundle(FRAGMENT_KEY_PREFIX + str2, mapN.get(str2));
            }
        } else if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public void saveBackStack(String str) {
        enqueueAction(new u(str), false);
    }

    boolean saveBackStackState(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2, String str) {
        int i10;
        int iFindBackStackIndex = findBackStackIndex(str, -1, true);
        if (iFindBackStackIndex < 0) {
            return false;
        }
        for (int i11 = iFindBackStackIndex; i11 < this.mBackStack.size(); i11++) {
            C5960a c5960a = this.mBackStack.get(i11);
            if (!c5960a.f54922r) {
                throwException(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c5960a + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet hashSet = new HashSet();
        for (int i12 = iFindBackStackIndex; i12 < this.mBackStack.size(); i12++) {
            C5960a c5960a2 = this.mBackStack.get(i12);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            Iterator<S.a> it = c5960a2.f54907c.iterator();
            while (it.hasNext()) {
                S.a next = it.next();
                Fragment fragment = next.f54925b;
                if (fragment != null) {
                    if (!next.f54926c || (i10 = next.f54924a) == 1 || i10 == 2 || i10 == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    int i13 = next.f54924a;
                    if (i13 == 1 || i13 == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                sb2.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                sb2.append(" in ");
                sb2.append(c5960a2);
                sb2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                throwException(new IllegalArgumentException(sb2.toString()));
            }
        }
        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            Fragment fragment2 = (Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("saveBackStack(\"");
                sb3.append(str);
                sb3.append("\") must not contain retained fragments. Found ");
                sb3.append(hashSet.contains(fragment2) ? "direct reference to retained " : "retained child ");
                sb3.append("fragment ");
                sb3.append(fragment2);
                throwException(new IllegalArgumentException(sb3.toString()));
            }
            for (Fragment fragment3 : fragment2.mChildFragmentManager.getActiveFragments()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((Fragment) it2.next()).mWho);
        }
        ArrayList arrayList4 = new ArrayList(this.mBackStack.size() - iFindBackStackIndex);
        for (int i14 = iFindBackStackIndex; i14 < this.mBackStack.size(); i14++) {
            arrayList4.add(null);
        }
        C5962c c5962c = new C5962c(arrayList3, arrayList4);
        for (int size = this.mBackStack.size() - 1; size >= iFindBackStackIndex; size--) {
            C5960a c5960aRemove = this.mBackStack.remove(size);
            C5960a c5960a3 = new C5960a(c5960aRemove);
            c5960a3.z();
            arrayList4.set(size - iFindBackStackIndex, new C5961b(c5960a3));
            c5960aRemove.f54972w = true;
            arrayList.add(c5960aRemove);
            arrayList2.add(Boolean.TRUE);
        }
        this.mBackStackStates.put(str, c5962c);
        return true;
    }

    public Fragment.m saveFragmentInstanceState(Fragment fragment) {
        O o10 = this.mFragmentStore.o(fragment.mWho);
        if (o10 == null || !o10.k().equals(fragment)) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return o10.q();
    }

    void scheduleCommit() {
        synchronized (this.mPendingActions) {
            try {
                if (this.mPendingActions.size() == 1) {
                    this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                    this.mHost.getHandler().post(this.mExecCommit);
                    updateOnBackPressedCallbackEnabled();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setFragmentFactory(C5981w c5981w) {
        this.mFragmentFactory = c5981w;
    }

    public final void setFragmentResult(String str, Bundle bundle) {
        o oVar = this.mResultListeners.get(str);
        if (oVar == null || !oVar.b(AbstractC6023l.b.f55278d)) {
            this.mResults.put(str, bundle);
        } else {
            oVar.a(str, bundle);
        }
        if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    void setMaxLifecycle(Fragment fragment, AbstractC6023l.b bVar) {
        if (fragment.equals(findActiveFragment(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void setPrimaryNavigationFragment(Fragment fragment) {
        if (fragment == null || (fragment.equals(findActiveFragment(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.mPrimaryNav;
            this.mPrimaryNav = fragment;
            dispatchParentPrimaryNavigationFragmentChanged(fragment2);
            dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void setSpecialEffectsControllerFactory(c0 c0Var) {
        this.mSpecialEffectsControllerFactory = c0Var;
    }

    public void setStrictModePolicy(b.c cVar) {
        this.mStrictModePolicy = cVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.mParent;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.mParent)));
            sb2.append("}");
        } else {
            AbstractC5982x<?> abstractC5982x = this.mHost;
            if (abstractC5982x != null) {
                sb2.append(abstractC5982x.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.mHost)));
                sb2.append("}");
            } else {
                sb2.append(BuildConfig.TRAVIS);
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public void unregisterFragmentLifecycleCallbacks(FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        this.mLifecycleCallbacksDispatcher.p(fragmentLifecycleCallbacks);
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.isParentAdded() && num.intValue() == 80) {
            fragmentManager.dispatchLowMemory(false);
        }
    }

    private void checkStateLoss() {
        if (!isStateSaved()) {
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, androidx.core.app.v vVar) {
        if (fragmentManager.isParentAdded()) {
            fragmentManager.dispatchPictureInPictureModeChanged(vVar.getIsInPictureInPictureMode(), false);
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, androidx.core.app.j jVar) {
        if (fragmentManager.isParentAdded()) {
            fragmentManager.dispatchMultiWindowModeChanged(jVar.getIsInMultiWindowMode(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void endAnimatingAwayFragments() {
        Iterator<b0> it = collectAllSpecialEffectsController().iterator();
        while (it.hasNext()) {
            it.next().q();
        }
    }

    private void executeOpsTogether(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        boolean z10 = arrayList.get(i10).f54922r;
        ArrayList<Fragment> arrayList3 = this.mTmpAddedFragments;
        if (arrayList3 == null) {
            this.mTmpAddedFragments = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.mTmpAddedFragments.addAll(this.mFragmentStore.p());
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            C5960a c5960a = arrayList.get(i12);
            if (!arrayList2.get(i12).booleanValue()) {
                primaryNavigationFragment = c5960a.F(this.mTmpAddedFragments, primaryNavigationFragment);
            } else {
                primaryNavigationFragment = c5960a.I(this.mTmpAddedFragments, primaryNavigationFragment);
            }
            if (!z11 && !c5960a.f54913i) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        this.mTmpAddedFragments.clear();
        if (!z10 && this.mCurState >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator<S.a> it = arrayList.get(i13).f54907c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f54925b;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.mFragmentStore.s(createOrGetFragmentStateManager(fragment));
                    }
                }
            }
        }
        executeOps(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
        if (z11 && !this.mBackStackChangeListeners.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<C5960a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(fragmentsFromRecord(it2.next()));
            }
            if (this.mTransitioningOp == null) {
                Iterator<p> it3 = this.mBackStackChangeListeners.iterator();
                while (it3.hasNext()) {
                    p next = it3.next();
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        next.c((Fragment) it4.next(), zBooleanValue);
                    }
                }
                Iterator<p> it5 = this.mBackStackChangeListeners.iterator();
                while (it5.hasNext()) {
                    p next2 = it5.next();
                    Iterator it6 = linkedHashSet.iterator();
                    while (it6.hasNext()) {
                        next2.b((Fragment) it6.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            C5960a c5960a2 = arrayList.get(i14);
            if (zBooleanValue) {
                for (int size = c5960a2.f54907c.size() - 1; size >= 0; size--) {
                    Fragment fragment2 = c5960a2.f54907c.get(size).f54925b;
                    if (fragment2 != null) {
                        createOrGetFragmentStateManager(fragment2).m();
                    }
                }
            } else {
                Iterator<S.a> it7 = c5960a2.f54907c.iterator();
                while (it7.hasNext()) {
                    Fragment fragment3 = it7.next().f54925b;
                    if (fragment3 != null) {
                        createOrGetFragmentStateManager(fragment3).m();
                    }
                }
            }
        }
        moveToState(this.mCurState, true);
        for (b0 b0Var : collectChangedControllers(arrayList, i10, i11)) {
            b0Var.D(zBooleanValue);
            b0Var.z();
            b0Var.n();
        }
        while (i10 < i11) {
            C5960a c5960a3 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && c5960a3.f54971v >= 0) {
                c5960a3.f54971v = -1;
            }
            c5960a3.H();
            i10++;
        }
        if (z11) {
            reportBackStackChanged();
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.isParentAdded()) {
            fragmentManager.dispatchConfigurationChanged(configuration, false);
        }
    }

    public static <F extends Fragment> F findFragment(View view) {
        F f10 = (F) findViewFragment(view);
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    public static FragmentManager findFragmentManager(View view) {
        FragmentActivity fragmentActivity;
        Fragment fragmentFindViewFragment = findViewFragment(view);
        if (fragmentFindViewFragment != null) {
            if (fragmentFindViewFragment.isAdded()) {
                return fragmentFindViewFragment.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentFindViewFragment + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                fragmentActivity = null;
                break;
            }
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private void forcePostponedTransactions() {
        Iterator<b0> it = collectAllSpecialEffectsController().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    private void removeRedundantOperationsAndExecute(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!arrayList.get(i10).f54922r) {
                        if (i11 != i10) {
                            executeOpsTogether(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (arrayList2.get(i10).booleanValue()) {
                            while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f54922r) {
                                i11++;
                            }
                        }
                        executeOpsTogether(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    executeOpsTogether(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void setVisibleRemovingFragment(Fragment fragment) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            if (fragmentContainer.getTag(K2.b.f16277c) == null) {
                fragmentContainer.setTag(K2.b.f16277c, fragment);
            }
            ((Fragment) fragmentContainer.getTag(K2.b.f16277c)).setPopDirection(fragment.getPopDirection());
        }
    }

    private void throwException(RuntimeException runtimeException) {
        FS.log_e(TAG, runtimeException.getMessage());
        FS.log_e(TAG, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new Y(TAG));
        AbstractC5982x<?> abstractC5982x = this.mHost;
        if (abstractC5982x != null) {
            try {
                abstractC5982x.i("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                FS.log_e(TAG, "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            FS.log_e(TAG, "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    boolean clearBackStackState(ArrayList<C5960a> arrayList, ArrayList<Boolean> arrayList2, String str) {
        if (!restoreBackStackState(arrayList, arrayList2, str)) {
            return false;
        }
        return popBackStackState(arrayList, arrayList2, str, -1, 1);
    }

    void dispatchPrimaryNavigationFragmentChanged() {
        updateOnBackPressedCallbackEnabled();
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    boolean execPendingActions(boolean z10) {
        C5960a c5960a;
        ensureExecReady(z10);
        boolean z11 = false;
        if (!this.mHandlingTransitioningOp && (c5960a = this.mTransitioningOp) != null) {
            c5960a.f54970u = false;
            c5960a.z();
            if (isLoggingEnabled(3)) {
                FS.log_d(TAG, "Reversing mTransitioningOp " + this.mTransitioningOp + " as part of execPendingActions for actions " + this.mPendingActions);
            }
            this.mTransitioningOp.A(false, false);
            this.mPendingActions.add(0, this.mTransitioningOp);
            Iterator<S.a> it = this.mTransitioningOp.f54907c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f54925b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.mTransitioningOp = null;
        }
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            z11 = true;
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.b();
        return z11;
    }

    public Fragment getFragment(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentFindActiveFragment = findActiveFragment(string);
        if (fragmentFindActiveFragment == null) {
            throwException(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentFindActiveFragment;
    }

    @Deprecated
    public S openTransaction() {
        return beginTransaction();
    }

    void performPendingDeferredStart(O o10) {
        Fragment fragmentK = o10.k();
        if (fragmentK.mDeferStart) {
            if (this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
            } else {
                fragmentK.mDeferStart = false;
                o10.m();
            }
        }
    }

    public void popBackStack(int i10, int i11) {
        popBackStack(i10, i11, false);
    }

    public boolean popBackStackImmediate(int i10, int i11) {
        if (i10 >= 0) {
            return popBackStackImmediate(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    void setExitAnimationOrder(Fragment fragment, boolean z10) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null && (fragmentContainer instanceof FragmentContainerView)) {
            ((FragmentContainerView) fragmentContainer).setDrawDisappearingViewsLast(!z10);
        }
    }

    public final void setFragmentResultListener(String str, InterfaceC6030s interfaceC6030s, M m10) {
        AbstractC6023l lifecycle = interfaceC6030s.getLifecycle();
        if (lifecycle.getState() == AbstractC6023l.b.f55275a) {
            return;
        }
        g gVar = new g(str, m10, lifecycle);
        o oVarPut = this.mResultListeners.put(str, new o(lifecycle, m10, gVar));
        if (oVarPut != null) {
            oVarPut.c();
        }
        if (isLoggingEnabled(2)) {
            FS.log_v(TAG, "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + m10);
        }
        lifecycle.a(gVar);
    }

    void popBackStack(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            enqueueAction(new r(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    private boolean popBackStackImmediate(String str, int i10, int i11) {
        execPendingActions(false);
        ensureExecReady(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean zPopBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i10, i11);
        if (zPopBackStackState) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.b();
        return zPopBackStackState;
    }
}
