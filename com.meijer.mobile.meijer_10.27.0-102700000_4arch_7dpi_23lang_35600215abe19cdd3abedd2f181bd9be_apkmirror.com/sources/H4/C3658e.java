package H4;

import H4.AbstractC3664k;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.V;
import com.fullstory.FS;
import j2.C14836d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: H4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3658e extends V {

    /* renamed from: H4.e$a */
    class a extends AbstractC3664k.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f12153a;

        a(Rect rect) {
            this.f12153a = rect;
        }
    }

    /* renamed from: H4.e$b */
    class b implements AbstractC3664k.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f12155a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f12156b;

        @Override // H4.AbstractC3664k.h
        public void f(AbstractC3664k abstractC3664k) {
        }

        @Override // H4.AbstractC3664k.h
        public void h(AbstractC3664k abstractC3664k) {
        }

        @Override // H4.AbstractC3664k.h
        public void j(AbstractC3664k abstractC3664k) {
        }

        b(View view, ArrayList arrayList) {
            this.f12155a = view;
            this.f12156b = arrayList;
        }

        @Override // H4.AbstractC3664k.h
        public void a(AbstractC3664k abstractC3664k) {
            abstractC3664k.b0(this);
            this.f12155a.setVisibility(8);
            int size = this.f12156b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f12156b.get(i10)).setVisibility(0);
            }
        }

        @Override // H4.AbstractC3664k.h
        public void m(AbstractC3664k abstractC3664k) {
            abstractC3664k.b0(this);
            abstractC3664k.c(this);
        }
    }

    /* renamed from: H4.e$c */
    class c extends s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f12158a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f12159b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f12160c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f12161d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f12162e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f12163f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f12158a = obj;
            this.f12159b = arrayList;
            this.f12160c = obj2;
            this.f12161d = arrayList2;
            this.f12162e = obj3;
            this.f12163f = arrayList3;
        }

        @Override // H4.s, H4.AbstractC3664k.h
        public void m(AbstractC3664k abstractC3664k) {
            Object obj = this.f12158a;
            if (obj != null) {
                C3658e.this.E(obj, this.f12159b, null);
            }
            Object obj2 = this.f12160c;
            if (obj2 != null) {
                C3658e.this.E(obj2, this.f12161d, null);
            }
            Object obj3 = this.f12162e;
            if (obj3 != null) {
                C3658e.this.E(obj3, this.f12163f, null);
            }
        }

        @Override // H4.s, H4.AbstractC3664k.h
        public void a(AbstractC3664k abstractC3664k) {
            abstractC3664k.b0(this);
        }
    }

    /* renamed from: H4.e$d */
    class d implements AbstractC3664k.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f12165a;

        @Override // H4.AbstractC3664k.h
        public void f(AbstractC3664k abstractC3664k) {
        }

        @Override // H4.AbstractC3664k.h
        public void h(AbstractC3664k abstractC3664k) {
        }

        @Override // H4.AbstractC3664k.h
        public void j(AbstractC3664k abstractC3664k) {
        }

        @Override // H4.AbstractC3664k.h
        public void m(AbstractC3664k abstractC3664k) {
        }

        d(Runnable runnable) {
            this.f12165a = runnable;
        }

        @Override // H4.AbstractC3664k.h
        public void a(AbstractC3664k abstractC3664k) {
            this.f12165a.run();
        }
    }

    /* renamed from: H4.e$e, reason: collision with other inner class name */
    class C0185e extends AbstractC3664k.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f12167a;

        C0185e(Rect rect) {
            this.f12167a = rect;
        }
    }

    @Override // androidx.fragment.app.V
    public boolean m() {
        return true;
    }

    @Override // androidx.fragment.app.V
    public boolean n(Object obj) {
        boolean zM = ((AbstractC3664k) obj).M();
        if (!zM) {
            FS.log_v(FragmentManager.TAG, "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zM;
    }

    @Override // androidx.fragment.app.V
    public void w(Fragment fragment, Object obj, C14836d c14836d, Runnable runnable) {
        x(fragment, obj, c14836d, null, runnable);
    }

    public static /* synthetic */ void C(Runnable runnable, AbstractC3664k abstractC3664k, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC3664k.cancel();
            runnable2.run();
        }
    }

    @Override // androidx.fragment.app.V
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        w wVar = (w) obj;
        if (wVar != null) {
            wVar.H().clear();
            wVar.H().addAll(arrayList2);
            E(wVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.V
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        w wVar = new w();
        wVar.t0((AbstractC3664k) obj);
        return wVar;
    }

    public void E(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        AbstractC3664k abstractC3664k = (AbstractC3664k) obj;
        int i10 = 0;
        if (abstractC3664k instanceof w) {
            w wVar = (w) abstractC3664k;
            int iW0 = wVar.w0();
            while (i10 < iW0) {
                E(wVar.v0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (D(abstractC3664k)) {
            return;
        }
        List<View> listH = abstractC3664k.H();
        if (listH.size() == arrayList.size() && listH.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC3664k.d(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC3664k.d0(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.V
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC3664k) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.V
    public void b(Object obj, ArrayList<View> arrayList) {
        AbstractC3664k abstractC3664k = (AbstractC3664k) obj;
        if (abstractC3664k == null) {
            return;
        }
        int i10 = 0;
        if (abstractC3664k instanceof w) {
            w wVar = (w) abstractC3664k;
            int iW0 = wVar.w0();
            while (i10 < iW0) {
                b(wVar.v0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (D(abstractC3664k) || !V.l(abstractC3664k.H())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC3664k.d(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.V
    public void c(Object obj) {
        ((v) obj).d();
    }

    @Override // androidx.fragment.app.V
    public void d(Object obj, Runnable runnable) {
        ((v) obj).l(runnable);
    }

    @Override // androidx.fragment.app.V
    public void e(ViewGroup viewGroup, Object obj) {
        t.a(viewGroup, (AbstractC3664k) obj);
    }

    @Override // androidx.fragment.app.V
    public boolean g(Object obj) {
        return obj instanceof AbstractC3664k;
    }

    @Override // androidx.fragment.app.V
    public Object h(Object obj) {
        if (obj != null) {
            return ((AbstractC3664k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.V
    public Object j(ViewGroup viewGroup, Object obj) {
        return t.b(viewGroup, (AbstractC3664k) obj);
    }

    @Override // androidx.fragment.app.V
    public Object o(Object obj, Object obj2, Object obj3) {
        AbstractC3664k abstractC3664kD0 = (AbstractC3664k) obj;
        AbstractC3664k abstractC3664k = (AbstractC3664k) obj2;
        AbstractC3664k abstractC3664k2 = (AbstractC3664k) obj3;
        if (abstractC3664kD0 != null && abstractC3664k != null) {
            abstractC3664kD0 = new w().t0(abstractC3664kD0).t0(abstractC3664k).D0(1);
        } else if (abstractC3664kD0 == null) {
            abstractC3664kD0 = abstractC3664k != null ? abstractC3664k : null;
        }
        if (abstractC3664k2 == null) {
            return abstractC3664kD0;
        }
        w wVar = new w();
        if (abstractC3664kD0 != null) {
            wVar.t0(abstractC3664kD0);
        }
        wVar.t0(abstractC3664k2);
        return wVar;
    }

    @Override // androidx.fragment.app.V
    public Object p(Object obj, Object obj2, Object obj3) {
        w wVar = new w();
        if (obj != null) {
            wVar.t0((AbstractC3664k) obj);
        }
        if (obj2 != null) {
            wVar.t0((AbstractC3664k) obj2);
        }
        if (obj3 != null) {
            wVar.t0((AbstractC3664k) obj3);
        }
        return wVar;
    }

    @Override // androidx.fragment.app.V
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC3664k) obj).c(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.V
    public void s(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC3664k) obj).c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.V
    public void t(Object obj, float f10) {
        v vVar = (v) obj;
        if (vVar.b()) {
            long jC = (long) (f10 * vVar.c());
            if (jC == 0) {
                jC = 1;
            }
            if (jC == vVar.c()) {
                jC = vVar.c() - 1;
            }
            vVar.k(jC);
        }
    }

    @Override // androidx.fragment.app.V
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC3664k) obj).j0(new C0185e(rect));
        }
    }

    @Override // androidx.fragment.app.V
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((AbstractC3664k) obj).j0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.V
    public void x(Fragment fragment, Object obj, C14836d c14836d, final Runnable runnable, final Runnable runnable2) {
        final AbstractC3664k abstractC3664k = (AbstractC3664k) obj;
        c14836d.c(new C14836d.a() { // from class: H4.d
            @Override // j2.C14836d.a
            public final void onCancel() {
                C3658e.C(runnable, abstractC3664k, runnable2);
            }
        });
        abstractC3664k.c(new d(runnable2));
    }

    @Override // androidx.fragment.app.V
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        w wVar = (w) obj;
        List<View> listH = wVar.H();
        listH.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            V.f(listH, arrayList.get(i10));
        }
        listH.add(view);
        arrayList.add(view);
        b(wVar, arrayList);
    }

    private static boolean D(AbstractC3664k abstractC3664k) {
        if (V.l(abstractC3664k.E()) && V.l(abstractC3664k.F()) && V.l(abstractC3664k.G())) {
            return false;
        }
        return true;
    }
}
