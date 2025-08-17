package H4;

import Z.C5503a;
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
    private static AbstractC3664k f12243a = new C3654a();

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<WeakReference<C5503a<ViewGroup, ArrayList<AbstractC3664k>>>> f12244b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    static ArrayList<ViewGroup> f12245c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        AbstractC3664k f12246a;

        /* renamed from: b, reason: collision with root package name */
        ViewGroup f12247b;

        /* renamed from: H4.t$a$a, reason: collision with other inner class name */
        class C0186a extends s {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5503a f12248a;

            C0186a(C5503a c5503a) {
                this.f12248a = c5503a;
            }

            @Override // H4.s, H4.AbstractC3664k.h
            public void a(AbstractC3664k abstractC3664k) {
                ((ArrayList) this.f12248a.get(a.this.f12247b)).remove(abstractC3664k);
                abstractC3664k.b0(this);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        private void a() {
            this.f12247b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f12247b.removeOnAttachStateChangeListener(this);
        }

        a(AbstractC3664k abstractC3664k, ViewGroup viewGroup) {
            this.f12246a = abstractC3664k;
            this.f12247b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!t.f12245c.remove(this.f12247b)) {
                return true;
            }
            C5503a<ViewGroup, ArrayList<AbstractC3664k>> c5503aC = t.c();
            ArrayList<AbstractC3664k> arrayList = c5503aC.get(this.f12247b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                c5503aC.put(this.f12247b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f12246a);
            this.f12246a.c(new C0186a(c5503aC));
            this.f12246a.m(this.f12247b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC3664k) it.next()).e0(this.f12247b);
                }
            }
            this.f12246a.Z(this.f12247b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            t.f12245c.remove(this.f12247b);
            ArrayList<AbstractC3664k> arrayList = t.c().get(this.f12247b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC3664k> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().e0(this.f12247b);
                }
            }
            this.f12246a.n(true);
        }
    }

    public static void a(ViewGroup viewGroup, AbstractC3664k abstractC3664k) {
        if (f12245c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f12245c.add(viewGroup);
        if (abstractC3664k == null) {
            abstractC3664k = f12243a;
        }
        AbstractC3664k abstractC3664kClone = abstractC3664k.clone();
        e(viewGroup, abstractC3664kClone);
        C3663j.c(viewGroup, null);
        d(viewGroup, abstractC3664kClone);
    }

    public static v b(ViewGroup viewGroup, AbstractC3664k abstractC3664k) {
        if (f12245c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!abstractC3664k.M()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f12245c.add(viewGroup);
        AbstractC3664k abstractC3664kClone = abstractC3664k.clone();
        w wVar = new w();
        wVar.t0(abstractC3664kClone);
        e(viewGroup, wVar);
        C3663j.c(viewGroup, null);
        d(viewGroup, wVar);
        viewGroup.invalidate();
        return wVar.r();
    }

    static C5503a<ViewGroup, ArrayList<AbstractC3664k>> c() {
        C5503a<ViewGroup, ArrayList<AbstractC3664k>> c5503a;
        WeakReference<C5503a<ViewGroup, ArrayList<AbstractC3664k>>> weakReference = f12244b.get();
        if (weakReference != null && (c5503a = weakReference.get()) != null) {
            return c5503a;
        }
        C5503a<ViewGroup, ArrayList<AbstractC3664k>> c5503a2 = new C5503a<>();
        f12244b.set(new WeakReference<>(c5503a2));
        return c5503a2;
    }

    private static void d(ViewGroup viewGroup, AbstractC3664k abstractC3664k) {
        if (abstractC3664k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC3664k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void e(ViewGroup viewGroup, AbstractC3664k abstractC3664k) {
        ArrayList<AbstractC3664k> arrayList = c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC3664k> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().Y(viewGroup);
            }
        }
        if (abstractC3664k != null) {
            abstractC3664k.m(viewGroup, true);
        }
        C3663j c3663jB = C3663j.b(viewGroup);
        if (c3663jB != null) {
            c3663jB.a();
        }
    }
}
