package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class g extends x {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    private ArrayList<RecyclerView.F> mPendingRemovals = new ArrayList<>();
    private ArrayList<RecyclerView.F> mPendingAdditions = new ArrayList<>();
    private ArrayList<j> mPendingMoves = new ArrayList<>();
    private ArrayList<i> mPendingChanges = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.F>> mAdditionsList = new ArrayList<>();
    ArrayList<ArrayList<j>> mMovesList = new ArrayList<>();
    ArrayList<ArrayList<i>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.F> mAddAnimations = new ArrayList<>();
    ArrayList<RecyclerView.F> mMoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.F> mRemoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.F> mChangeAnimations = new ArrayList<>();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f58328a;

        a(ArrayList arrayList) {
            this.f58328a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f58328a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                g.this.animateMoveImpl(jVar.f58362a, jVar.f58363b, jVar.f58364c, jVar.f58365d, jVar.f58366e);
            }
            this.f58328a.clear();
            g.this.mMovesList.remove(this.f58328a);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f58330a;

        b(ArrayList arrayList) {
            this.f58330a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f58330a.iterator();
            while (it.hasNext()) {
                g.this.animateChangeImpl((i) it.next());
            }
            this.f58330a.clear();
            g.this.mChangesList.remove(this.f58330a);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f58332a;

        c(ArrayList arrayList) {
            this.f58332a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f58332a.iterator();
            while (it.hasNext()) {
                g.this.animateAddImpl((RecyclerView.F) it.next());
            }
            this.f58332a.clear();
            g.this.mAdditionsList.remove(this.f58332a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f58334a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f58335b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f58336c;

        d(RecyclerView.F f10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f58334a = f10;
            this.f58335b = viewPropertyAnimator;
            this.f58336c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f58335b.setListener(null);
            this.f58336c.setAlpha(1.0f);
            g.this.dispatchRemoveFinished(this.f58334a);
            g.this.mRemoveAnimations.remove(this.f58334a);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchRemoveStarting(this.f58334a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f58338a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f58339b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f58340c;

        e(RecyclerView.F f10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f58338a = f10;
            this.f58339b = view;
            this.f58340c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f58339b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f58340c.setListener(null);
            g.this.dispatchAddFinished(this.f58338a);
            g.this.mAddAnimations.remove(this.f58338a);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchAddStarting(this.f58338a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f58342a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f58343b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f58344c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f58345d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f58346e;

        f(RecyclerView.F f10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f58342a = f10;
            this.f58343b = i10;
            this.f58344c = view;
            this.f58345d = i11;
            this.f58346e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f58343b != 0) {
                this.f58344c.setTranslationX(0.0f);
            }
            if (this.f58345d != 0) {
                this.f58344c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f58346e.setListener(null);
            g.this.dispatchMoveFinished(this.f58342a);
            g.this.mMoveAnimations.remove(this.f58342a);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchMoveStarting(this.f58342a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g, reason: collision with other inner class name */
    class C1150g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f58348a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f58349b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f58350c;

        C1150g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f58348a = iVar;
            this.f58349b = viewPropertyAnimator;
            this.f58350c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f58349b.setListener(null);
            this.f58350c.setAlpha(1.0f);
            this.f58350c.setTranslationX(0.0f);
            this.f58350c.setTranslationY(0.0f);
            g.this.dispatchChangeFinished(this.f58348a.f58356a, true);
            g.this.mChangeAnimations.remove(this.f58348a.f58356a);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchChangeStarting(this.f58348a.f58356a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f58352a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f58353b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f58354c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f58352a = iVar;
            this.f58353b = viewPropertyAnimator;
            this.f58354c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f58353b.setListener(null);
            this.f58354c.setAlpha(1.0f);
            this.f58354c.setTranslationX(0.0f);
            this.f58354c.setTranslationY(0.0f);
            g.this.dispatchChangeFinished(this.f58352a.f58357b, false);
            g.this.mChangeAnimations.remove(this.f58352a.f58357b);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchChangeStarting(this.f58352a.f58357b, false);
        }
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f58356a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.F f58357b;

        /* renamed from: c, reason: collision with root package name */
        public int f58358c;

        /* renamed from: d, reason: collision with root package name */
        public int f58359d;

        /* renamed from: e, reason: collision with root package name */
        public int f58360e;

        /* renamed from: f, reason: collision with root package name */
        public int f58361f;

        private i(RecyclerView.F f10, RecyclerView.F f11) {
            this.f58356a = f10;
            this.f58357b = f11;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f58356a + ", newHolder=" + this.f58357b + ", fromX=" + this.f58358c + ", fromY=" + this.f58359d + ", toX=" + this.f58360e + ", toY=" + this.f58361f + '}';
        }

        i(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13) {
            this(f10, f11);
            this.f58358c = i10;
            this.f58359d = i11;
            this.f58360e = i12;
            this.f58361f = i13;
        }
    }

    private void endChangeAnimationIfNecessary(i iVar) {
        RecyclerView.F f10 = iVar.f58356a;
        if (f10 != null) {
            endChangeAnimationIfNecessary(iVar, f10);
        }
        RecyclerView.F f11 = iVar.f58357b;
        if (f11 != null) {
            endChangeAnimationIfNecessary(iVar, f11);
        }
    }

    private static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f58362a;

        /* renamed from: b, reason: collision with root package name */
        public int f58363b;

        /* renamed from: c, reason: collision with root package name */
        public int f58364c;

        /* renamed from: d, reason: collision with root package name */
        public int f58365d;

        /* renamed from: e, reason: collision with root package name */
        public int f58366e;

        j(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
            this.f58362a = f10;
            this.f58363b = i10;
            this.f58364c = i11;
            this.f58365d = i12;
            this.f58366e = i13;
        }
    }

    private void animateRemoveImpl(RecyclerView.F f10) {
        View view = f10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mRemoveAnimations.add(f10);
        viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new d(f10, viewPropertyAnimatorAnimate, view)).start();
    }

    private void resetAnimation(RecyclerView.F f10) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        f10.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(f10);
    }

    void animateAddImpl(RecyclerView.F f10) {
        View view = f10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mAddAnimations.add(f10);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(getAddDuration()).setListener(new e(f10, view, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.x
    @SuppressLint({"UnknownNullness"})
    public boolean animateChange(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13) {
        if (f10 == f11) {
            return animateMove(f10, i10, i11, i12, i13);
        }
        float translationX = f10.itemView.getTranslationX();
        float translationY = f10.itemView.getTranslationY();
        float alpha = f10.itemView.getAlpha();
        resetAnimation(f10);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        f10.itemView.setTranslationX(translationX);
        f10.itemView.setTranslationY(translationY);
        f10.itemView.setAlpha(alpha);
        if (f11 != null) {
            resetAnimation(f11);
            f11.itemView.setTranslationX(-i14);
            f11.itemView.setTranslationY(-i15);
            f11.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new i(f10, f11, i10, i11, i12, i13));
        return true;
    }

    void animateChangeImpl(i iVar) {
        RecyclerView.F f10 = iVar.f58356a;
        View view = f10 == null ? null : f10.itemView;
        RecyclerView.F f11 = iVar.f58357b;
        View view2 = f11 != null ? f11.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.f58356a);
            duration.translationX(iVar.f58360e - iVar.f58358c);
            duration.translationY(iVar.f58361f - iVar.f58359d);
            duration.alpha(0.0f).setListener(new C1150g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.mChangeAnimations.add(iVar.f58357b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.x
    @SuppressLint({"UnknownNullness"})
    public boolean animateMove(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
        View view = f10.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) f10.itemView.getTranslationY());
        resetAnimation(f10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            dispatchMoveFinished(f10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.mPendingMoves.add(new j(f10, translationX, translationY, i12, i13));
        return true;
    }

    void animateMoveImpl(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
        View view = f10.itemView;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mMoveAnimations.add(f10);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new f(f10, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public void endAnimation(RecyclerView.F f10) {
        View view = f10.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.mPendingMoves.get(size).f58362a == f10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(f10);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, f10);
        if (this.mPendingRemovals.remove(f10)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(f10);
        }
        if (this.mPendingAdditions.remove(f10)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(f10);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, f10);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f58362a == f10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(f10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.F> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(f10)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(f10);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(f10);
        this.mAddAnimations.remove(f10);
        this.mChangeAnimations.remove(f10);
        this.mMoveAnimations.remove(f10);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.mPendingMoves.get(size);
            View view = jVar.f58362a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(jVar.f58362a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.F f10 = this.mPendingAdditions.get(size3);
            f10.itemView.setAlpha(1.0f);
            dispatchAddFinished(f10);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f58362a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(jVar2.f58362a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.F> arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.F f11 = arrayList2.get(size8);
                    f11.itemView.setAlpha(1.0f);
                    dispatchAddFinished(f11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void runPendingAnimations() {
        boolean zIsEmpty = this.mPendingRemovals.isEmpty();
        boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
        boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
        boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.F> it = this.mPendingRemovals.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.mPendingRemovals.clear();
        if (!zIsEmpty2) {
            ArrayList<j> arrayList = new ArrayList<>();
            arrayList.addAll(this.mPendingMoves);
            this.mMovesList.add(arrayList);
            this.mPendingMoves.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                ViewCompat.f0(arrayList.get(0).f58362a.itemView, aVar, getRemoveDuration());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.mPendingChanges);
            this.mChangesList.add(arrayList2);
            this.mPendingChanges.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                ViewCompat.f0(arrayList2.get(0).f58356a.itemView, bVar, getRemoveDuration());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.F> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.mPendingAdditions);
        this.mAdditionsList.add(arrayList3);
        this.mPendingAdditions.clear();
        c cVar = new c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            ViewCompat.f0(arrayList3.get(0).itemView, cVar, (!zIsEmpty ? getRemoveDuration() : 0L) + Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()));
        }
    }

    private void endChangeAnimation(List<i> list, RecyclerView.F f10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (endChangeAnimationIfNecessary(iVar, f10) && iVar.f58356a == null && iVar.f58357b == null) {
                list.remove(iVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.x
    @SuppressLint({"UnknownNullness"})
    public boolean animateAdd(RecyclerView.F f10) {
        resetAnimation(f10);
        f10.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(f10);
        return true;
    }

    @Override // androidx.recyclerview.widget.x
    @SuppressLint({"UnknownNullness"})
    public boolean animateRemove(RecyclerView.F f10) {
        resetAnimation(f10);
        this.mPendingRemovals.add(f10);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canReuseUpdatedViewHolder(RecyclerView.F f10, List<Object> list) {
        if (list.isEmpty() && !super.canReuseUpdatedViewHolder(f10, list)) {
            return false;
        }
        return true;
    }

    void cancelAll(List<RecyclerView.F> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    private boolean endChangeAnimationIfNecessary(i iVar, RecyclerView.F f10) {
        boolean z10 = false;
        if (iVar.f58357b == f10) {
            iVar.f58357b = null;
        } else {
            if (iVar.f58356a != f10) {
                return false;
            }
            iVar.f58356a = null;
            z10 = true;
        }
        f10.itemView.setAlpha(1.0f);
        f10.itemView.setTranslationX(0.0f);
        f10.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(f10, z10);
        return true;
    }
}
