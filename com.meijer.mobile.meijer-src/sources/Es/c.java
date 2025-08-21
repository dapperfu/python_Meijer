package Es;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class c extends x {

    /* renamed from: l, reason: collision with root package name */
    private static TimeInterpolator f8451l;

    /* renamed from: a, reason: collision with root package name */
    protected ArrayList<RecyclerView.F> f8452a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    protected ArrayList<RecyclerView.F> f8453b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<i> f8454c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<h> f8455d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.F>> f8456e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    ArrayList<ArrayList<i>> f8457f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    ArrayList<ArrayList<h>> f8458g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    ArrayList<RecyclerView.F> f8459h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<RecyclerView.F> f8460i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    protected ArrayList<RecyclerView.F> f8461j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    ArrayList<RecyclerView.F> f8462k = new ArrayList<>();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f8463a;

        a(ArrayList arrayList) {
            this.f8463a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f8463a.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                c.this.animateMoveImpl(iVar.f8493a, iVar.f8494b, iVar.f8495c, iVar.f8496d, iVar.f8497e);
            }
            this.f8463a.clear();
            c.this.f8457f.remove(this.f8463a);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f8465a;

        b(ArrayList arrayList) {
            this.f8465a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f8465a.iterator();
            while (it.hasNext()) {
                c.this.a((h) it.next());
            }
            this.f8465a.clear();
            c.this.f8458g.remove(this.f8465a);
        }
    }

    /* renamed from: Es.c$c, reason: collision with other inner class name */
    class RunnableC0167c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f8467a;

        RunnableC0167c(ArrayList arrayList) {
            this.f8467a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f8467a.iterator();
            while (it.hasNext()) {
                c.this.animateAddImpl((RecyclerView.F) it.next());
            }
            this.f8467a.clear();
            c.this.f8456e.remove(this.f8467a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f8469a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f8470b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f8471c;

        d(RecyclerView.F f10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f8469a = f10;
            this.f8470b = view;
            this.f8471c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8470b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8471c.setListener(null);
            c.this.dispatchAddFinished(this.f8469a);
            c.this.f8459h.remove(this.f8469a);
            c.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchAddStarting(this.f8469a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f8473a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8474b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f8475c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8476d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f8477e;

        e(RecyclerView.F f10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f8473a = f10;
            this.f8474b = i10;
            this.f8475c = view;
            this.f8476d = i11;
            this.f8477e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f8474b != 0) {
                this.f8475c.setTranslationX(0.0f);
            }
            if (this.f8476d != 0) {
                this.f8475c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8477e.setListener(null);
            c.this.dispatchMoveFinished(this.f8473a);
            c.this.f8460i.remove(this.f8473a);
            c.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchMoveStarting(this.f8473a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f8479a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f8480b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f8481c;

        f(h hVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f8479a = hVar;
            this.f8480b = viewPropertyAnimator;
            this.f8481c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8480b.setListener(null);
            this.f8481c.setAlpha(1.0f);
            this.f8481c.setTranslationX(0.0f);
            this.f8481c.setTranslationY(0.0f);
            c.this.dispatchChangeFinished(this.f8479a.f8487a, true);
            c.this.f8462k.remove(this.f8479a.f8487a);
            c.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchChangeStarting(this.f8479a.f8487a, true);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f8483a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f8484b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f8485c;

        g(h hVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f8483a = hVar;
            this.f8484b = viewPropertyAnimator;
            this.f8485c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8484b.setListener(null);
            this.f8485c.setAlpha(1.0f);
            this.f8485c.setTranslationX(0.0f);
            this.f8485c.setTranslationY(0.0f);
            c.this.dispatchChangeFinished(this.f8483a.f8488b, false);
            c.this.f8462k.remove(this.f8483a.f8488b);
            c.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchChangeStarting(this.f8483a.f8488b, false);
        }
    }

    private static class h {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f8487a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.F f8488b;

        /* renamed from: c, reason: collision with root package name */
        public int f8489c;

        /* renamed from: d, reason: collision with root package name */
        public int f8490d;

        /* renamed from: e, reason: collision with root package name */
        public int f8491e;

        /* renamed from: f, reason: collision with root package name */
        public int f8492f;

        private h(RecyclerView.F f10, RecyclerView.F f11) {
            this.f8487a = f10;
            this.f8488b = f11;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f8487a + ", newHolder=" + this.f8488b + ", fromX=" + this.f8489c + ", fromY=" + this.f8490d + ", toX=" + this.f8491e + ", toY=" + this.f8492f + '}';
        }

        h(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13) {
            this(f10, f11);
            this.f8489c = i10;
            this.f8490d = i11;
            this.f8491e = i12;
            this.f8492f = i13;
        }
    }

    protected void animateRemoveImpl(RecyclerView.F f10) {
        throw null;
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f8493a;

        /* renamed from: b, reason: collision with root package name */
        public int f8494b;

        /* renamed from: c, reason: collision with root package name */
        public int f8495c;

        /* renamed from: d, reason: collision with root package name */
        public int f8496d;

        /* renamed from: e, reason: collision with root package name */
        public int f8497e;

        i(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
            this.f8493a = f10;
            this.f8494b = i10;
            this.f8495c = i11;
            this.f8496d = i12;
            this.f8497e = i13;
        }
    }

    private void b(h hVar) {
        RecyclerView.F f10 = hVar.f8487a;
        if (f10 != null) {
            c(hVar, f10);
        }
        RecyclerView.F f11 = hVar.f8488b;
        if (f11 != null) {
            c(hVar, f11);
        }
    }

    private boolean c(h hVar, RecyclerView.F f10) {
        boolean z10 = false;
        if (hVar.f8488b == f10) {
            hVar.f8488b = null;
        } else {
            if (hVar.f8487a != f10) {
                return false;
            }
            hVar.f8487a = null;
            z10 = true;
        }
        f10.itemView.setAlpha(1.0f);
        f10.itemView.setTranslationX(0.0f);
        f10.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(f10, z10);
        return true;
    }

    private void resetAnimation(RecyclerView.F f10) {
        if (f8451l == null) {
            f8451l = new ValueAnimator().getInterpolator();
        }
        f10.itemView.animate().setInterpolator(f8451l);
        endAnimation(f10);
    }

    void a(h hVar) {
        RecyclerView.F f10 = hVar.f8487a;
        View view = f10 == null ? null : f10.itemView;
        RecyclerView.F f11 = hVar.f8488b;
        View view2 = f11 != null ? f11.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.f8462k.add(hVar.f8487a);
            duration.translationX(hVar.f8491e - hVar.f8489c);
            duration.translationY(hVar.f8492f - hVar.f8490d);
            duration.alpha(0.0f).setListener(new f(hVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f8462k.add(hVar.f8488b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new g(hVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void animateAddImpl(RecyclerView.F f10) {
        View view = f10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f8459h.add(f10);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(getAddDuration()).setListener(new d(f10, view, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.x
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
        this.f8455d.add(new h(f10, f11, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.x
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
        this.f8454c.add(new i(f10, translationX, translationY, i12, i13));
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
        this.f8460i.add(f10);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new e(f10, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimation(RecyclerView.F f10) {
        View view = f10.itemView;
        view.animate().cancel();
        int size = this.f8454c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f8454c.get(size).f8493a == f10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(f10);
                this.f8454c.remove(size);
            }
        }
        endChangeAnimation(this.f8455d, f10);
        if (this.f8452a.remove(f10)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(f10);
        }
        if (this.f8453b.remove(f10)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(f10);
        }
        for (int size2 = this.f8458g.size() - 1; size2 >= 0; size2--) {
            ArrayList<h> arrayList = this.f8458g.get(size2);
            endChangeAnimation(arrayList, f10);
            if (arrayList.isEmpty()) {
                this.f8458g.remove(size2);
            }
        }
        for (int size3 = this.f8457f.size() - 1; size3 >= 0; size3--) {
            ArrayList<i> arrayList2 = this.f8457f.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f8493a == f10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(f10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f8457f.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f8456e.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.F> arrayList3 = this.f8456e.get(size5);
            if (arrayList3.remove(f10)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(f10);
                if (arrayList3.isEmpty()) {
                    this.f8456e.remove(size5);
                }
            }
        }
        this.f8461j.remove(f10);
        this.f8459h.remove(f10);
        this.f8462k.remove(f10);
        this.f8460i.remove(f10);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimations() {
        int size = this.f8454c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            i iVar = this.f8454c.get(size);
            View view = iVar.f8493a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(iVar.f8493a);
            this.f8454c.remove(size);
        }
        for (int size2 = this.f8452a.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.f8452a.get(size2));
            this.f8452a.remove(size2);
        }
        int size3 = this.f8453b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.F f10 = this.f8453b.get(size3);
            f10.itemView.setAlpha(1.0f);
            dispatchAddFinished(f10);
            this.f8453b.remove(size3);
        }
        for (int size4 = this.f8455d.size() - 1; size4 >= 0; size4--) {
            b(this.f8455d.get(size4));
        }
        this.f8455d.clear();
        if (isRunning()) {
            for (int size5 = this.f8457f.size() - 1; size5 >= 0; size5--) {
                ArrayList<i> arrayList = this.f8457f.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    i iVar2 = arrayList.get(size6);
                    View view2 = iVar2.f8493a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(iVar2.f8493a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f8457f.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f8456e.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.F> arrayList2 = this.f8456e.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.F f11 = arrayList2.get(size8);
                    f11.itemView.setAlpha(1.0f);
                    dispatchAddFinished(f11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f8456e.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f8458g.size() - 1; size9 >= 0; size9--) {
                ArrayList<h> arrayList3 = this.f8458g.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    b(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f8458g.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.f8461j);
            cancelAll(this.f8460i);
            cancelAll(this.f8459h);
            cancelAll(this.f8462k);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean isRunning() {
        return (this.f8453b.isEmpty() && this.f8455d.isEmpty() && this.f8454c.isEmpty() && this.f8452a.isEmpty() && this.f8460i.isEmpty() && this.f8461j.isEmpty() && this.f8459h.isEmpty() && this.f8462k.isEmpty() && this.f8457f.isEmpty() && this.f8456e.isEmpty() && this.f8458g.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void runPendingAnimations() {
        boolean zIsEmpty = this.f8452a.isEmpty();
        boolean zIsEmpty2 = this.f8454c.isEmpty();
        boolean zIsEmpty3 = this.f8455d.isEmpty();
        boolean zIsEmpty4 = this.f8453b.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.F> it = this.f8452a.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.f8452a.clear();
        if (!zIsEmpty2) {
            ArrayList<i> arrayList = new ArrayList<>();
            arrayList.addAll(this.f8454c);
            this.f8457f.add(arrayList);
            this.f8454c.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                ViewCompat.f0(arrayList.get(0).f8493a.itemView, aVar, getRemoveDuration());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<h> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f8455d);
            this.f8458g.add(arrayList2);
            this.f8455d.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                ViewCompat.f0(arrayList2.get(0).f8487a.itemView, bVar, getRemoveDuration());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.F> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.f8453b);
        this.f8456e.add(arrayList3);
        this.f8453b.clear();
        RunnableC0167c runnableC0167c = new RunnableC0167c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC0167c.run();
        } else {
            ViewCompat.f0(arrayList3.get(0).itemView, runnableC0167c, (!zIsEmpty ? getRemoveDuration() : 0L) + Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()));
        }
    }

    private void endChangeAnimation(List<h> list, RecyclerView.F f10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            h hVar = list.get(size);
            if (c(hVar, f10) && hVar.f8487a == null && hVar.f8488b == null) {
                list.remove(hVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.x
    public boolean animateAdd(RecyclerView.F f10) {
        resetAnimation(f10);
        f10.itemView.setAlpha(0.0f);
        this.f8453b.add(f10);
        return true;
    }

    @Override // androidx.recyclerview.widget.x
    public boolean animateRemove(RecyclerView.F f10) {
        resetAnimation(f10);
        this.f8452a.add(f10);
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

    protected void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }
}
