package androidx.viewpager2.adapter;

import Z.C;
import Z.C5604b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.S;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6169p;
import androidx.view.InterfaceC6172s;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o2.i;

/* loaded from: classes4.dex */
public abstract class a extends RecyclerView.h<androidx.viewpager2.adapter.b> implements androidx.viewpager2.adapter.c {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    f mFragmentEventDispatcher;
    final FragmentManager mFragmentManager;
    private g mFragmentMaxLifecycleEnforcer;
    final C<Fragment> mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final C<Integer> mItemIdToViewHolder;
    final AbstractC6165l mLifecycle;
    private final C<Fragment.m> mSavedStates;

    /* renamed from: androidx.viewpager2.adapter.a$a, reason: collision with other inner class name */
    class C1165a implements InterfaceC6169p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.viewpager2.adapter.b f59185a;

        C1165a(androidx.viewpager2.adapter.b bVar) {
            this.f59185a = bVar;
        }

        @Override // androidx.view.InterfaceC6169p
        public void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
            if (a.this.shouldDelayFragmentTransactions()) {
                return;
            }
            interfaceC6172s.getLifecycle().d(this);
            if (this.f59185a.c().isAttachedToWindow()) {
                a.this.placeFragmentInViewHolder(this.f59185a);
            }
        }
    }

    class b extends FragmentManager.FragmentLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f59187a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f59188b;

        b(Fragment fragment, FrameLayout frameLayout) {
            this.f59187a = fragment;
            this.f59188b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f59187a) {
                fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                a.this.addViewToContainer(view, this.f59188b);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.mIsInGracePeriod = false;
            aVar.gcFragments();
        }
    }

    class d implements InterfaceC6169p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f59191a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f59192b;

        d(Handler handler, Runnable runnable) {
            this.f59191a = handler;
            this.f59192b = runnable;
        }

        @Override // androidx.view.InterfaceC6169p
        public void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
            if (aVar == AbstractC6165l.a.ON_DESTROY) {
                this.f59191a.removeCallbacks(this.f59192b);
                interfaceC6172s.getLifecycle().d(this);
            }
        }
    }

    private static abstract class e extends RecyclerView.j {
        private e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        /* synthetic */ e(C1165a c1165a) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i10, int i11) {
            a();
        }
    }

    static class f {

        /* renamed from: a, reason: collision with root package name */
        private List<h> f59194a = new CopyOnWriteArrayList();

        public List<h.b> a(Fragment fragment, AbstractC6165l.b bVar) {
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f59194a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(fragment, bVar));
            }
            return arrayList;
        }

        public List<h.b> c(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f59194a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().b(fragment));
            }
            return arrayList;
        }

        public List<h.b> d(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f59194a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().c(fragment));
            }
            return arrayList;
        }

        public List<h.b> e(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<h> it = this.f59194a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d(fragment));
            }
            return arrayList;
        }

        public void f(h hVar) {
            this.f59194a.add(hVar);
        }

        public void g(h hVar) {
            this.f59194a.remove(hVar);
        }

        f() {
        }

        public void b(List<h.b> list) {
            Iterator<h.b> it = list.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    class g {

        /* renamed from: a, reason: collision with root package name */
        private ViewPager2.i f59195a;

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView.j f59196b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC6169p f59197c;

        /* renamed from: d, reason: collision with root package name */
        private ViewPager2 f59198d;

        /* renamed from: e, reason: collision with root package name */
        private long f59199e = -1;

        /* renamed from: androidx.viewpager2.adapter.a$g$a, reason: collision with other inner class name */
        class C1166a extends ViewPager2.i {
            C1166a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrollStateChanged(int i10) {
                g.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int i10) {
                g.this.d(false);
            }
        }

        class b extends e {
            b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.a.e, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                g.this.d(true);
            }
        }

        class c implements InterfaceC6169p {
            c() {
            }

            @Override // androidx.view.InterfaceC6169p
            public void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
                g.this.d(false);
            }
        }

        g() {
        }

        void d(boolean z10) {
            int currentItem;
            Fragment fragmentD;
            if (a.this.shouldDelayFragmentTransactions() || this.f59198d.getScrollState() != 0 || a.this.mFragments.f() || a.this.getItemCount() == 0 || (currentItem = this.f59198d.getCurrentItem()) >= a.this.getItemCount()) {
                return;
            }
            long itemId = a.this.getItemId(currentItem);
            if ((itemId != this.f59199e || z10) && (fragmentD = a.this.mFragments.d(itemId)) != null && fragmentD.isAdded()) {
                this.f59199e = itemId;
                S sBeginTransaction = a.this.mFragmentManager.beginTransaction();
                ArrayList arrayList = new ArrayList();
                Fragment fragment = null;
                for (int i10 = 0; i10 < a.this.mFragments.m(); i10++) {
                    long jG = a.this.mFragments.g(i10);
                    Fragment fragmentN = a.this.mFragments.n(i10);
                    if (fragmentN.isAdded()) {
                        if (jG != this.f59199e) {
                            AbstractC6165l.b bVar = AbstractC6165l.b.f55502d;
                            sBeginTransaction.w(fragmentN, bVar);
                            arrayList.add(a.this.mFragmentEventDispatcher.a(fragmentN, bVar));
                        } else {
                            fragment = fragmentN;
                        }
                        fragmentN.setMenuVisibility(jG == this.f59199e);
                    }
                }
                if (fragment != null) {
                    AbstractC6165l.b bVar2 = AbstractC6165l.b.f55503e;
                    sBeginTransaction.w(fragment, bVar2);
                    arrayList.add(a.this.mFragmentEventDispatcher.a(fragment, bVar2));
                }
                if (sBeginTransaction.p()) {
                    return;
                }
                sBeginTransaction.j();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a.this.mFragmentEventDispatcher.b((List) it.next());
                }
            }
        }

        private ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(RecyclerView recyclerView) {
            this.f59198d = a(recyclerView);
            C1166a c1166a = new C1166a();
            this.f59195a = c1166a;
            this.f59198d.g(c1166a);
            b bVar = new b();
            this.f59196b = bVar;
            a.this.registerAdapterDataObserver(bVar);
            c cVar = new c();
            this.f59197c = cVar;
            a.this.mLifecycle.a(cVar);
        }

        void c(RecyclerView recyclerView) {
            a(recyclerView).n(this.f59195a);
            a.this.unregisterAdapterDataObserver(this.f59196b);
            a.this.mLifecycle.d(this.f59197c);
            this.f59198d = null;
        }
    }

    public static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        private static final b f59204a = new C1167a();

        public interface b {
            void a();
        }

        /* renamed from: androidx.viewpager2.adapter.a$h$a, reason: collision with other inner class name */
        class C1167a implements b {
            @Override // androidx.viewpager2.adapter.a.h.b
            public void a() {
            }

            C1167a() {
            }
        }

        public b a(Fragment fragment, AbstractC6165l.b bVar) {
            return f59204a;
        }

        public b b(Fragment fragment) {
            return f59204a;
        }

        public b c(Fragment fragment) {
            return f59204a;
        }

        public b d(Fragment fragment) {
            return f59204a;
        }
    }

    public a(FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    private Long itemForViewHolder(int i10) {
        Long lValueOf = null;
        for (int i11 = 0; i11 < this.mItemIdToViewHolder.m(); i11++) {
            if (this.mItemIdToViewHolder.n(i11).intValue() == i10) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.mItemIdToViewHolder.g(i11));
            }
        }
        return lValueOf;
    }

    public abstract Fragment createFragment(int i10);

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final boolean onFailedToRecycleView(androidx.viewpager2.adapter.b bVar) {
        return true;
    }

    public a(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    private static String createKey(String str, long j10) {
        return str + j10;
    }

    private boolean isFragmentViewBound(long j10) {
        View view;
        if (this.mItemIdToViewHolder.c(j10)) {
            return true;
        }
        Fragment fragmentD = this.mFragments.d(j10);
        return (fragmentD == null || (view = fragmentD.getView()) == null || view.getParent() == null) ? false : true;
    }

    private void removeFragment(long j10) {
        ViewParent parent;
        Fragment fragmentD = this.mFragments.d(j10);
        if (fragmentD == null) {
            return;
        }
        if (fragmentD.getView() != null && (parent = fragmentD.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j10)) {
            this.mSavedStates.k(j10);
        }
        if (!fragmentD.isAdded()) {
            this.mFragments.k(j10);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (fragmentD.isAdded() && containsItem(j10)) {
            List<h.b> listE = this.mFragmentEventDispatcher.e(fragmentD);
            Fragment.m mVarSaveFragmentInstanceState = this.mFragmentManager.saveFragmentInstanceState(fragmentD);
            this.mFragmentEventDispatcher.b(listE);
            this.mSavedStates.i(j10, mVarSaveFragmentInstanceState);
        }
        List<h.b> listD = this.mFragmentEventDispatcher.d(fragmentD);
        try {
            this.mFragmentManager.beginTransaction().q(fragmentD).j();
            this.mFragments.k(j10);
        } finally {
            this.mFragmentEventDispatcher.b(listD);
        }
    }

    private void scheduleGracePeriodEnd() {
        Handler handler = new Handler(Looper.getMainLooper());
        c cVar = new c();
        this.mLifecycle.a(new d(handler, cVar));
        handler.postDelayed(cVar, GRACE_WINDOW_TIME_MS);
    }

    private void scheduleViewAttach(Fragment fragment, FrameLayout frameLayout) {
        this.mFragmentManager.registerFragmentLifecycleCallbacks(new b(fragment, frameLayout), false);
    }

    public boolean containsItem(long j10) {
        return j10 >= 0 && j10 < ((long) getItemCount());
    }

    void gcFragments() {
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        C5604b c5604b = new C5604b();
        for (int i10 = 0; i10 < this.mFragments.m(); i10++) {
            long jG = this.mFragments.g(i10);
            if (!containsItem(jG)) {
                c5604b.add(Long.valueOf(jG));
                this.mItemIdToViewHolder.k(jG);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i11 = 0; i11 < this.mFragments.m(); i11++) {
                long jG2 = this.mFragments.g(i11);
                if (!isFragmentViewBound(jG2)) {
                    c5604b.add(Long.valueOf(jG2));
                }
            }
        }
        Iterator<E> it = c5604b.iterator();
        while (it.hasNext()) {
            removeFragment(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        i.a(this.mFragmentMaxLifecycleEnforcer == null);
        g gVar = new g();
        this.mFragmentMaxLifecycleEnforcer = gVar;
        gVar.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(androidx.viewpager2.adapter.b bVar, int i10) {
        long itemId = bVar.getItemId();
        int id2 = bVar.c().getId();
        Long lItemForViewHolder = itemForViewHolder(id2);
        if (lItemForViewHolder != null && lItemForViewHolder.longValue() != itemId) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.k(lItemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.i(itemId, Integer.valueOf(id2));
        ensureFragment(i10);
        if (bVar.c().isAttachedToWindow()) {
            placeFragmentInViewHolder(bVar);
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final androidx.viewpager2.adapter.b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return androidx.viewpager2.adapter.b.b(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.c(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewAttachedToWindow(androidx.viewpager2.adapter.b bVar) {
        placeFragmentInViewHolder(bVar);
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewRecycled(androidx.viewpager2.adapter.b bVar) {
        Long lItemForViewHolder = itemForViewHolder(bVar.c().getId());
        if (lItemForViewHolder != null) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.k(lItemForViewHolder.longValue());
        }
    }

    void placeFragmentInViewHolder(androidx.viewpager2.adapter.b bVar) {
        Fragment fragmentD = this.mFragments.d(bVar.getItemId());
        if (fragmentD == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutC = bVar.c();
        View view = fragmentD.getView();
        if (!fragmentD.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragmentD.isAdded() && view == null) {
            scheduleViewAttach(fragmentD, frameLayoutC);
            return;
        }
        if (fragmentD.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutC) {
                addViewToContainer(view, frameLayoutC);
                return;
            }
            return;
        }
        if (fragmentD.isAdded()) {
            addViewToContainer(view, frameLayoutC);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            if (this.mFragmentManager.isDestroyed()) {
                return;
            }
            this.mLifecycle.a(new C1165a(bVar));
            return;
        }
        scheduleViewAttach(fragmentD, frameLayoutC);
        List<h.b> listC = this.mFragmentEventDispatcher.c(fragmentD);
        try {
            fragmentD.setMenuVisibility(false);
            this.mFragmentManager.beginTransaction().e(fragmentD, "f" + bVar.getItemId()).w(fragmentD, AbstractC6165l.b.f55502d).j();
            this.mFragmentMaxLifecycleEnforcer.d(false);
        } finally {
            this.mFragmentEventDispatcher.b(listC);
        }
    }

    public void registerFragmentTransactionCallback(h hVar) {
        this.mFragmentEventDispatcher.f(hVar);
    }

    @Override // androidx.viewpager2.adapter.c
    public final void restoreState(Parcelable parcelable) {
        if (!this.mSavedStates.f() || !this.mFragments.f()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                this.mFragments.i(parseIdFromKey(str, KEY_PREFIX_FRAGMENT), this.mFragmentManager.getFragment(bundle, str));
            } else {
                if (!isValidKey(str, KEY_PREFIX_STATE)) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long idFromKey = parseIdFromKey(str, KEY_PREFIX_STATE);
                Fragment.m mVar = (Fragment.m) bundle.getParcelable(str);
                if (containsItem(idFromKey)) {
                    this.mSavedStates.i(idFromKey, mVar);
                }
            }
        }
        if (this.mFragments.f()) {
            return;
        }
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        scheduleGracePeriodEnd();
    }

    @Override // androidx.viewpager2.adapter.c
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mFragments.m() + this.mSavedStates.m());
        for (int i10 = 0; i10 < this.mFragments.m(); i10++) {
            long jG = this.mFragments.g(i10);
            Fragment fragmentD = this.mFragments.d(jG);
            if (fragmentD != null && fragmentD.isAdded()) {
                this.mFragmentManager.putFragment(bundle, createKey(KEY_PREFIX_FRAGMENT, jG), fragmentD);
            }
        }
        for (int i11 = 0; i11 < this.mSavedStates.m(); i11++) {
            long jG2 = this.mSavedStates.g(i11);
            if (containsItem(jG2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, jG2), this.mSavedStates.d(jG2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.isStateSaved();
    }

    public void unregisterFragmentTransactionCallback(h hVar) {
        this.mFragmentEventDispatcher.g(hVar);
    }

    public a(FragmentManager fragmentManager, AbstractC6165l abstractC6165l) {
        this.mFragments = new C<>();
        this.mSavedStates = new C<>();
        this.mItemIdToViewHolder = new C<>();
        this.mFragmentEventDispatcher = new f();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = abstractC6165l;
        super.setHasStableIds(true);
    }

    private void ensureFragment(int i10) {
        long itemId = getItemId(i10);
        if (!this.mFragments.c(itemId)) {
            Fragment fragmentCreateFragment = createFragment(i10);
            fragmentCreateFragment.setInitialSavedState(this.mSavedStates.d(itemId));
            this.mFragments.i(itemId, fragmentCreateFragment);
        }
    }

    private static boolean isValidKey(String str, String str2) {
        if (str.startsWith(str2) && str.length() > str2.length()) {
            return true;
        }
        return false;
    }

    private static long parseIdFromKey(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }
}
