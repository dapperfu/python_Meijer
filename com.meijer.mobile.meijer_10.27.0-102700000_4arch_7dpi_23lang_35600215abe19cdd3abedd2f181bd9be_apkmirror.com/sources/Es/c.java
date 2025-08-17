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

/* loaded from: classes11.dex */
public class c extends x {

    /* renamed from: l, reason: collision with root package name */
    private static TimeInterpolator f9739l;

    /* renamed from: a, reason: collision with root package name */
    protected ArrayList<RecyclerView.F> f9740a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    protected ArrayList<RecyclerView.F> f9741b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<i> f9742c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<h> f9743d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    ArrayList<ArrayList<RecyclerView.F>> f9744e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    ArrayList<ArrayList<i>> f9745f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    ArrayList<ArrayList<h>> f9746g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    ArrayList<RecyclerView.F> f9747h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    ArrayList<RecyclerView.F> f9748i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    protected ArrayList<RecyclerView.F> f9749j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    ArrayList<RecyclerView.F> f9750k = new ArrayList<>();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f9751a;

        a(ArrayList arrayList) {
            this.f9751a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f9751a.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                c.this.animateMoveImpl(iVar.f9781a, iVar.f9782b, iVar.f9783c, iVar.f9784d, iVar.f9785e);
            }
            this.f9751a.clear();
            c.this.f9745f.remove(this.f9751a);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f9753a;

        b(ArrayList arrayList) {
            this.f9753a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f9753a.iterator();
            while (it.hasNext()) {
                c.this.a((h) it.next());
            }
            this.f9753a.clear();
            c.this.f9746g.remove(this.f9753a);
        }
    }

    /* renamed from: Es.c$c, reason: collision with other inner class name */
    class RunnableC0138c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f9755a;

        RunnableC0138c(ArrayList arrayList) {
            this.f9755a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f9755a.iterator();
            while (it.hasNext()) {
                c.this.animateAddImpl((RecyclerView.F) it.next());
            }
            this.f9755a.clear();
            c.this.f9744e.remove(this.f9755a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f9757a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f9758b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f9759c;

        d(RecyclerView.F f10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f9757a = f10;
            this.f9758b = view;
            this.f9759c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9758b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9759c.setListener(null);
            c.this.dispatchAddFinished(this.f9757a);
            c.this.f9747h.remove(this.f9757a);
            c.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchAddStarting(this.f9757a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.F f9761a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f9762b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f9763c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f9764d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f9765e;

        e(RecyclerView.F f10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f9761a = f10;
            this.f9762b = i10;
            this.f9763c = view;
            this.f9764d = i11;
            this.f9765e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f9762b != 0) {
                this.f9763c.setTranslationX(0.0f);
            }
            if (this.f9764d != 0) {
                this.f9763c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9765e.setListener(null);
            c.this.dispatchMoveFinished(this.f9761a);
            c.this.f9748i.remove(this.f9761a);
            c.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchMoveStarting(this.f9761a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f9767a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f9768b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f9769c;

        f(h hVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f9767a = hVar;
            this.f9768b = viewPropertyAnimator;
            this.f9769c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9768b.setListener(null);
            this.f9769c.setAlpha(1.0f);
            this.f9769c.setTranslationX(0.0f);
            this.f9769c.setTranslationY(0.0f);
            c.this.dispatchChangeFinished(this.f9767a.f9775a, true);
            c.this.f9750k.remove(this.f9767a.f9775a);
            c.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchChangeStarting(this.f9767a.f9775a, true);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f9771a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f9772b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f9773c;

        g(h hVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f9771a = hVar;
            this.f9772b = viewPropertyAnimator;
            this.f9773c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9772b.setListener(null);
            this.f9773c.setAlpha(1.0f);
            this.f9773c.setTranslationX(0.0f);
            this.f9773c.setTranslationY(0.0f);
            c.this.dispatchChangeFinished(this.f9771a.f9776b, false);
            c.this.f9750k.remove(this.f9771a.f9776b);
            c.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchChangeStarting(this.f9771a.f9776b, false);
        }
    }

    private static class h {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f9775a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.F f9776b;

        /* renamed from: c, reason: collision with root package name */
        public int f9777c;

        /* renamed from: d, reason: collision with root package name */
        public int f9778d;

        /* renamed from: e, reason: collision with root package name */
        public int f9779e;

        /* renamed from: f, reason: collision with root package name */
        public int f9780f;

        private h(RecyclerView.F f10, RecyclerView.F f11) {
            this.f9775a = f10;
            this.f9776b = f11;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f9775a + ", newHolder=" + this.f9776b + ", fromX=" + this.f9777c + ", fromY=" + this.f9778d + ", toX=" + this.f9779e + ", toY=" + this.f9780f + '}';
        }

        h(RecyclerView.F f10, RecyclerView.F f11, int i10, int i11, int i12, int i13) {
            this(f10, f11);
            this.f9777c = i10;
            this.f9778d = i11;
            this.f9779e = i12;
            this.f9780f = i13;
        }
    }

    protected void animateRemoveImpl(RecyclerView.F f10) {
        throw null;
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.F f9781a;

        /* renamed from: b, reason: collision with root package name */
        public int f9782b;

        /* renamed from: c, reason: collision with root package name */
        public int f9783c;

        /* renamed from: d, reason: collision with root package name */
        public int f9784d;

        /* renamed from: e, reason: collision with root package name */
        public int f9785e;

        i(RecyclerView.F f10, int i10, int i11, int i12, int i13) {
            this.f9781a = f10;
            this.f9782b = i10;
            this.f9783c = i11;
            this.f9784d = i12;
            this.f9785e = i13;
        }
    }

    private void b(h hVar) {
        RecyclerView.F f10 = hVar.f9775a;
        if (f10 != null) {
            c(hVar, f10);
        }
        RecyclerView.F f11 = hVar.f9776b;
        if (f11 != null) {
            c(hVar, f11);
        }
    }

    private boolean c(h hVar, RecyclerView.F f10) {
        boolean z10 = false;
        if (hVar.f9776b == f10) {
            hVar.f9776b = null;
        } else {
            if (hVar.f9775a != f10) {
                return false;
            }
            hVar.f9775a = null;
            z10 = true;
        }
        f10.itemView.setAlpha(1.0f);
        f10.itemView.setTranslationX(0.0f);
        f10.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(f10, z10);
        return true;
    }

    private void resetAnimation(RecyclerView.F f10) {
        if (f9739l == null) {
            f9739l = new ValueAnimator().getInterpolator();
        }
        f10.itemView.animate().setInterpolator(f9739l);
        endAnimation(f10);
    }

    void a(h hVar) {
        RecyclerView.F f10 = hVar.f9775a;
        View view = f10 == null ? null : f10.itemView;
        RecyclerView.F f11 = hVar.f9776b;
        View view2 = f11 != null ? f11.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.f9750k.add(hVar.f9775a);
            duration.translationX(hVar.f9779e - hVar.f9777c);
            duration.translationY(hVar.f9780f - hVar.f9778d);
            duration.alpha(0.0f).setListener(new f(hVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f9750k.add(hVar.f9776b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new g(hVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void animateAddImpl(RecyclerView.F f10) {
        View view = f10.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f9747h.add(f10);
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
        this.f9743d.add(new h(f10, f11, i10, i11, i12, i13));
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
        this.f9742c.add(new i(f10, translationX, translationY, i12, i13));
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
        this.f9748i.add(f10);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new e(f10, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimation(RecyclerView.F f10) {
        View view = f10.itemView;
        view.animate().cancel();
        int size = this.f9742c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f9742c.get(size).f9781a == f10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(f10);
                this.f9742c.remove(size);
            }
        }
        endChangeAnimation(this.f9743d, f10);
        if (this.f9740a.remove(f10)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(f10);
        }
        if (this.f9741b.remove(f10)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(f10);
        }
        for (int size2 = this.f9746g.size() - 1; size2 >= 0; size2--) {
            ArrayList<h> arrayList = this.f9746g.get(size2);
            endChangeAnimation(arrayList, f10);
            if (arrayList.isEmpty()) {
                this.f9746g.remove(size2);
            }
        }
        for (int size3 = this.f9745f.size() - 1; size3 >= 0; size3--) {
            ArrayList<i> arrayList2 = this.f9745f.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f9781a == f10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(f10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f9745f.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f9744e.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.F> arrayList3 = this.f9744e.get(size5);
            if (arrayList3.remove(f10)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(f10);
                if (arrayList3.isEmpty()) {
                    this.f9744e.remove(size5);
                }
            }
        }
        this.f9749j.remove(f10);
        this.f9747h.remove(f10);
        this.f9750k.remove(f10);
        this.f9748i.remove(f10);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimations() {
        int size = this.f9742c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            i iVar = this.f9742c.get(size);
            View view = iVar.f9781a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(iVar.f9781a);
            this.f9742c.remove(size);
        }
        for (int size2 = this.f9740a.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.f9740a.get(size2));
            this.f9740a.remove(size2);
        }
        int size3 = this.f9741b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.F f10 = this.f9741b.get(size3);
            f10.itemView.setAlpha(1.0f);
            dispatchAddFinished(f10);
            this.f9741b.remove(size3);
        }
        for (int size4 = this.f9743d.size() - 1; size4 >= 0; size4--) {
            b(this.f9743d.get(size4));
        }
        this.f9743d.clear();
        if (isRunning()) {
            for (int size5 = this.f9745f.size() - 1; size5 >= 0; size5--) {
                ArrayList<i> arrayList = this.f9745f.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    i iVar2 = arrayList.get(size6);
                    View view2 = iVar2.f9781a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(iVar2.f9781a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f9745f.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f9744e.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.F> arrayList2 = this.f9744e.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.F f11 = arrayList2.get(size8);
                    f11.itemView.setAlpha(1.0f);
                    dispatchAddFinished(f11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f9744e.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f9746g.size() - 1; size9 >= 0; size9--) {
                ArrayList<h> arrayList3 = this.f9746g.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    b(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f9746g.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.f9749j);
            cancelAll(this.f9748i);
            cancelAll(this.f9747h);
            cancelAll(this.f9750k);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean isRunning() {
        return (this.f9741b.isEmpty() && this.f9743d.isEmpty() && this.f9742c.isEmpty() && this.f9740a.isEmpty() && this.f9748i.isEmpty() && this.f9749j.isEmpty() && this.f9747h.isEmpty() && this.f9750k.isEmpty() && this.f9745f.isEmpty() && this.f9744e.isEmpty() && this.f9746g.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void runPendingAnimations() {
        boolean zIsEmpty = this.f9740a.isEmpty();
        boolean zIsEmpty2 = this.f9742c.isEmpty();
        boolean zIsEmpty3 = this.f9743d.isEmpty();
        boolean zIsEmpty4 = this.f9741b.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.F> it = this.f9740a.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.f9740a.clear();
        if (!zIsEmpty2) {
            ArrayList<i> arrayList = new ArrayList<>();
            arrayList.addAll(this.f9742c);
            this.f9745f.add(arrayList);
            this.f9742c.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                ViewCompat.f0(arrayList.get(0).f9781a.itemView, aVar, getRemoveDuration());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<h> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f9743d);
            this.f9746g.add(arrayList2);
            this.f9743d.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                ViewCompat.f0(arrayList2.get(0).f9775a.itemView, bVar, getRemoveDuration());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.F> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.f9741b);
        this.f9744e.add(arrayList3);
        this.f9741b.clear();
        RunnableC0138c runnableC0138c = new RunnableC0138c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC0138c.run();
        } else {
            ViewCompat.f0(arrayList3.get(0).itemView, runnableC0138c, (!zIsEmpty ? getRemoveDuration() : 0L) + Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()));
        }
    }

    private void endChangeAnimation(List<h> list, RecyclerView.F f10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            h hVar = list.get(size);
            if (c(hVar, f10) && hVar.f9775a == null && hVar.f9776b == null) {
                list.remove(hVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.x
    public boolean animateAdd(RecyclerView.F f10) {
        resetAnimation(f10);
        f10.itemView.setAlpha(0.0f);
        this.f9741b.add(f10);
        return true;
    }

    @Override // androidx.recyclerview.widget.x
    public boolean animateRemove(RecyclerView.F f10) {
        resetAnimation(f10);
        this.f9740a.add(f10);
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
