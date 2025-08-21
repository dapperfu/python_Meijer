package I4;

import Z.C5603a;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static AbstractC3830k f14307a = new C3820a();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<WeakReference<C5603a<ViewGroup, ArrayList<AbstractC3830k>>>> f14308b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList<ViewGroup> f14309c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        AbstractC3830k f14310a;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f14311b;

        /* renamed from: I4.t$a$a, reason: collision with other inner class name */
        class C0227a extends s {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5603a f14312a;

            C0227a(C5603a c5603a) {
                this.f14312a = c5603a;
            }

            @Override // I4.s, I4.AbstractC3830k.h
            public void j(AbstractC3830k abstractC3830k) {
                ((ArrayList) this.f14312a.get(a.this.f14311b)).remove(abstractC3830k);
                abstractC3830k.c0(this);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        private void a() {
            this.f14311b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f14311b.removeOnAttachStateChangeListener(this);
        }

        a(AbstractC3830k abstractC3830k, ViewGroup viewGroup) {
            this.f14310a = abstractC3830k;
            this.f14311b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!t.f14309c.remove(this.f14311b)) {
                return true;
            }
            C5603a<ViewGroup, ArrayList<AbstractC3830k>> c5603aC = t.c();
            ArrayList<AbstractC3830k> arrayList = c5603aC.get(this.f14311b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c5603aC.put(this.f14311b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f14310a);
            this.f14310a.c(new C0227a(c5603aC));
            this.f14310a.m(this.f14311b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC3830k) it.next()).e0(this.f14311b);
                }
            }
            this.f14310a.Z(this.f14311b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            t.f14309c.remove(this.f14311b);
            ArrayList<AbstractC3830k> arrayList = t.c().get(this.f14311b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC3830k> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().e0(this.f14311b);
                }
            }
            this.f14310a.n(true);
        }
    }

    public static void a(ViewGroup viewGroup, AbstractC3830k abstractC3830k) {
        if (f14309c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f14309c.add(viewGroup);
        if (abstractC3830k == null) {
            abstractC3830k = f14307a;
        }
        AbstractC3830k abstractC3830kClone = abstractC3830k.clone();
        e(viewGroup, abstractC3830kClone);
        C3829j.c(viewGroup, null);
        d(viewGroup, abstractC3830kClone);
    }

    public static v b(ViewGroup viewGroup, AbstractC3830k abstractC3830k) {
        if (f14309c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!abstractC3830k.M()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f14309c.add(viewGroup);
        AbstractC3830k abstractC3830kClone = abstractC3830k.clone();
        w wVar = new w();
        wVar.t0(abstractC3830kClone);
        e(viewGroup, wVar);
        C3829j.c(viewGroup, null);
        d(viewGroup, wVar);
        viewGroup.invalidate();
        return wVar.r();
    }

    static C5603a<ViewGroup, ArrayList<AbstractC3830k>> c() {
        C5603a<ViewGroup, ArrayList<AbstractC3830k>> c5603a;
        WeakReference<C5603a<ViewGroup, ArrayList<AbstractC3830k>>> weakReference = f14308b.get();
        if (weakReference != null && (c5603a = weakReference.get()) != null) {
            return c5603a;
        }
        C5603a<ViewGroup, ArrayList<AbstractC3830k>> c5603a2 = new C5603a<>();
        f14308b.set(new WeakReference<>(c5603a2));
        return c5603a2;
    }

    private static void d(ViewGroup viewGroup, AbstractC3830k abstractC3830k) {
        if (abstractC3830k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC3830k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void e(ViewGroup viewGroup, AbstractC3830k abstractC3830k) {
        ArrayList<AbstractC3830k> arrayList = c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC3830k> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().Y(viewGroup);
            }
        }
        if (abstractC3830k != null) {
            abstractC3830k.m(viewGroup, true);
        }
        C3829j c3829jB = C3829j.b(viewGroup);
        if (c3829jB != null) {
            c3829jB.a();
        }
    }
}
