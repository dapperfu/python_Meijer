package P4;

import O4.AbstractC4373v;
import O4.EnumC4361i;
import X4.C5557f;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public class F extends O4.M {

    /* renamed from: j, reason: collision with root package name */
    private static final String f25446j = AbstractC4373v.i("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    private final O f25447a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25448b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC4361i f25449c;

    /* renamed from: d, reason: collision with root package name */
    private final List<? extends O4.P> f25450d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f25451e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f25452f;

    /* renamed from: g, reason: collision with root package name */
    private final List<F> f25453g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25454h;

    /* renamed from: i, reason: collision with root package name */
    private O4.z f25455i;

    public F(O o10, List<? extends O4.P> list) {
        this(o10, null, EnumC4361i.KEEP, list, null);
    }

    public void l() {
        this.f25454h = true;
    }

    public F(O o10, String str, EnumC4361i enumC4361i, List<? extends O4.P> list) {
        this(o10, str, enumC4361i, list, null);
    }

    public static Set<String> m(F f10) {
        HashSet hashSet = new HashSet();
        List<F> listF = f10.f();
        if (listF != null && !listF.isEmpty()) {
            Iterator<F> it = listF.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().d());
            }
        }
        return hashSet;
    }

    public O4.z b() {
        if (this.f25454h) {
            AbstractC4373v.e().k(f25446j, "Already enqueued work ids (" + TextUtils.join(", ", this.f25451e) + ")");
        } else {
            this.f25455i = O4.D.c(this.f25447a.n().getTracer(), "EnqueueRunnable_" + c().name(), this.f25447a.v().c(), new Function0() { // from class: P4.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return F.a(this.f25445a);
                }
            });
        }
        return this.f25455i;
    }

    public EnumC4361i c() {
        return this.f25449c;
    }

    public List<String> d() {
        return this.f25451e;
    }

    public String e() {
        return this.f25448b;
    }

    public List<F> f() {
        return this.f25453g;
    }

    public List<? extends O4.P> g() {
        return this.f25450d;
    }

    public O h() {
        return this.f25447a;
    }

    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.f25454h;
    }

    public F(O o10, String str, EnumC4361i enumC4361i, List<? extends O4.P> list, List<F> list2) {
        this.f25447a = o10;
        this.f25448b = str;
        this.f25449c = enumC4361i;
        this.f25450d = list;
        this.f25453g = list2;
        this.f25451e = new ArrayList(list.size());
        this.f25452f = new ArrayList();
        if (list2 != null) {
            Iterator<F> it = list2.iterator();
            while (it.hasNext()) {
                this.f25452f.addAll(it.next().f25452f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (enumC4361i == EnumC4361i.REPLACE && list.get(i10).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strB = list.get(i10).b();
            this.f25451e.add(strB);
            this.f25452f.add(strB);
        }
    }

    public static /* synthetic */ Unit a(F f10) {
        f10.getClass();
        C5557f.b(f10);
        return Unit.f143329a;
    }

    private static boolean j(F f10, Set<String> set) {
        set.addAll(f10.d());
        Set<String> setM = m(f10);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (setM.contains(it.next())) {
                return true;
            }
        }
        List<F> listF = f10.f();
        if (listF != null && !listF.isEmpty()) {
            Iterator<F> it2 = listF.iterator();
            while (it2.hasNext()) {
                if (j(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(f10.d());
        return false;
    }
}
