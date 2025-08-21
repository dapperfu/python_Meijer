package I4;

import I4.AbstractC3830k;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.V;
import com.fullstory.FS;
import j2.C14924d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: I4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3824e extends V {

    /* renamed from: I4.e$a */
    class a extends AbstractC3830k.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f14217a;

        a(Rect rect) {
            this.f14217a = rect;
        }
    }

    /* renamed from: I4.e$b */
    class b implements AbstractC3830k.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14219a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f14220b;

        @Override // I4.AbstractC3830k.h
        public void e(AbstractC3830k abstractC3830k) {
        }

        @Override // I4.AbstractC3830k.h
        public void g(AbstractC3830k abstractC3830k) {
        }

        @Override // I4.AbstractC3830k.h
        public void m(AbstractC3830k abstractC3830k) {
        }

        b(View view, ArrayList arrayList) {
            this.f14219a = view;
            this.f14220b = arrayList;
        }

        @Override // I4.AbstractC3830k.h
        public void j(AbstractC3830k abstractC3830k) {
            abstractC3830k.c0(this);
            this.f14219a.setVisibility(8);
            int size = this.f14220b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f14220b.get(i10)).setVisibility(0);
            }
        }

        @Override // I4.AbstractC3830k.h
        public void l(AbstractC3830k abstractC3830k) {
            abstractC3830k.c0(this);
            abstractC3830k.c(this);
        }
    }

    /* renamed from: I4.e$c */
    class c extends s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f14222a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f14223b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f14224c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f14225d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f14226e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f14227f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f14222a = obj;
            this.f14223b = arrayList;
            this.f14224c = obj2;
            this.f14225d = arrayList2;
            this.f14226e = obj3;
            this.f14227f = arrayList3;
        }

        @Override // I4.s, I4.AbstractC3830k.h
        public void l(AbstractC3830k abstractC3830k) {
            Object obj = this.f14222a;
            if (obj != null) {
                C3824e.this.E(obj, this.f14223b, null);
            }
            Object obj2 = this.f14224c;
            if (obj2 != null) {
                C3824e.this.E(obj2, this.f14225d, null);
            }
            Object obj3 = this.f14226e;
            if (obj3 != null) {
                C3824e.this.E(obj3, this.f14227f, null);
            }
        }

        @Override // I4.s, I4.AbstractC3830k.h
        public void j(AbstractC3830k abstractC3830k) {
            abstractC3830k.c0(this);
        }
    }

    /* renamed from: I4.e$d */
    class d implements AbstractC3830k.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f14229a;

        @Override // I4.AbstractC3830k.h
        public void e(AbstractC3830k abstractC3830k) {
        }

        @Override // I4.AbstractC3830k.h
        public void g(AbstractC3830k abstractC3830k) {
        }

        @Override // I4.AbstractC3830k.h
        public void l(AbstractC3830k abstractC3830k) {
        }

        @Override // I4.AbstractC3830k.h
        public void m(AbstractC3830k abstractC3830k) {
        }

        d(Runnable runnable) {
            this.f14229a = runnable;
        }

        @Override // I4.AbstractC3830k.h
        public void j(AbstractC3830k abstractC3830k) {
            this.f14229a.run();
        }
    }

    /* renamed from: I4.e$e, reason: collision with other inner class name */
    class C0226e extends AbstractC3830k.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f14231a;

        C0226e(Rect rect) {
            this.f14231a = rect;
        }
    }

    @Override // androidx.fragment.app.V
    public boolean m() {
        return true;
    }

    @Override // androidx.fragment.app.V
    public boolean n(Object obj) {
        boolean zM = ((AbstractC3830k) obj).M();
        if (!zM) {
            FS.log_v(FragmentManager.TAG, "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zM;
    }

    @Override // androidx.fragment.app.V
    public void w(Fragment fragment, Object obj, C14924d c14924d, Runnable runnable) {
        x(fragment, obj, c14924d, null, runnable);
    }

    public static /* synthetic */ void C(Runnable runnable, AbstractC3830k abstractC3830k, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC3830k.cancel();
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
        wVar.t0((AbstractC3830k) obj);
        return wVar;
    }

    public void E(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        AbstractC3830k abstractC3830k = (AbstractC3830k) obj;
        int i10 = 0;
        if (abstractC3830k instanceof w) {
            w wVar = (w) abstractC3830k;
            int iW0 = wVar.w0();
            while (i10 < iW0) {
                E(wVar.v0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (D(abstractC3830k)) {
            return;
        }
        List<View> listH = abstractC3830k.H();
        if (listH.size() == arrayList.size() && listH.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC3830k.d(arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC3830k.d0(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.V
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC3830k) obj).d(view);
        }
    }

    @Override // androidx.fragment.app.V
    public void b(Object obj, ArrayList<View> arrayList) {
        AbstractC3830k abstractC3830k = (AbstractC3830k) obj;
        if (abstractC3830k == null) {
            return;
        }
        int i10 = 0;
        if (abstractC3830k instanceof w) {
            w wVar = (w) abstractC3830k;
            int iW0 = wVar.w0();
            while (i10 < iW0) {
                b(wVar.v0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (D(abstractC3830k) || !V.l(abstractC3830k.H())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC3830k.d(arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.V
    public void c(Object obj) {
        ((v) obj).d();
    }

    @Override // androidx.fragment.app.V
    public void d(Object obj, Runnable runnable) {
        ((v) obj).k(runnable);
    }

    @Override // androidx.fragment.app.V
    public void e(ViewGroup viewGroup, Object obj) {
        t.a(viewGroup, (AbstractC3830k) obj);
    }

    @Override // androidx.fragment.app.V
    public boolean g(Object obj) {
        return obj instanceof AbstractC3830k;
    }

    @Override // androidx.fragment.app.V
    public Object h(Object obj) {
        if (obj != null) {
            return ((AbstractC3830k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.V
    public Object j(ViewGroup viewGroup, Object obj) {
        return t.b(viewGroup, (AbstractC3830k) obj);
    }

    @Override // androidx.fragment.app.V
    public Object o(Object obj, Object obj2, Object obj3) {
        AbstractC3830k abstractC3830kD0 = (AbstractC3830k) obj;
        AbstractC3830k abstractC3830k = (AbstractC3830k) obj2;
        AbstractC3830k abstractC3830k2 = (AbstractC3830k) obj3;
        if (abstractC3830kD0 != null && abstractC3830k != null) {
            abstractC3830kD0 = new w().t0(abstractC3830kD0).t0(abstractC3830k).D0(1);
        } else if (abstractC3830kD0 == null) {
            abstractC3830kD0 = abstractC3830k != null ? abstractC3830k : null;
        }
        if (abstractC3830k2 == null) {
            return abstractC3830kD0;
        }
        w wVar = new w();
        if (abstractC3830kD0 != null) {
            wVar.t0(abstractC3830kD0);
        }
        wVar.t0(abstractC3830k2);
        return wVar;
    }

    @Override // androidx.fragment.app.V
    public Object p(Object obj, Object obj2, Object obj3) {
        w wVar = new w();
        if (obj != null) {
            wVar.t0((AbstractC3830k) obj);
        }
        if (obj2 != null) {
            wVar.t0((AbstractC3830k) obj2);
        }
        if (obj3 != null) {
            wVar.t0((AbstractC3830k) obj3);
        }
        return wVar;
    }

    @Override // androidx.fragment.app.V
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC3830k) obj).c(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.V
    public void s(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC3830k) obj).c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
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
            vVar.h(jC);
        }
    }

    @Override // androidx.fragment.app.V
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC3830k) obj).j0(new C0226e(rect));
        }
    }

    @Override // androidx.fragment.app.V
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((AbstractC3830k) obj).j0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.V
    public void x(Fragment fragment, Object obj, C14924d c14924d, final Runnable runnable, final Runnable runnable2) {
        final AbstractC3830k abstractC3830k = (AbstractC3830k) obj;
        c14924d.c(new C14924d.a() { // from class: I4.d
            @Override // j2.C14924d.a
            public final void onCancel() {
                C3824e.C(runnable, abstractC3830k, runnable2);
            }
        });
        abstractC3830k.c(new d(runnable2));
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

    private static boolean D(AbstractC3830k abstractC3830k) {
        if (V.l(abstractC3830k.E()) && V.l(abstractC3830k.F()) && V.l(abstractC3830k.G())) {
            return false;
        }
        return true;
    }
}
