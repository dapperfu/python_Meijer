package O4;

import N4.AbstractC4333v;
import N4.EnumC4321i;
import W4.C5404f;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public class F extends N4.M {

    /* renamed from: j, reason: collision with root package name */
    private static final String f23106j = AbstractC4333v.i("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    private final O f23107a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23108b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC4321i f23109c;

    /* renamed from: d, reason: collision with root package name */
    private final List<? extends N4.P> f23110d;

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f23111e;

    /* renamed from: f, reason: collision with root package name */
    private final List<String> f23112f;

    /* renamed from: g, reason: collision with root package name */
    private final List<F> f23113g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f23114h;

    /* renamed from: i, reason: collision with root package name */
    private N4.z f23115i;

    public F(O o10, List<? extends N4.P> list) {
        this(o10, null, EnumC4321i.KEEP, list, null);
    }

    public void l() {
        this.f23114h = true;
    }

    public F(O o10, String str, EnumC4321i enumC4321i, List<? extends N4.P> list) {
        this(o10, str, enumC4321i, list, null);
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

    public N4.z b() {
        if (this.f23114h) {
            AbstractC4333v.e().k(f23106j, "Already enqueued work ids (" + TextUtils.join(", ", this.f23111e) + ")");
        } else {
            this.f23115i = N4.D.c(this.f23107a.n().getTracer(), "EnqueueRunnable_" + c().name(), this.f23107a.v().c(), new Function0() { // from class: O4.E
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return F.a(this.f23105a);
                }
            });
        }
        return this.f23115i;
    }

    public EnumC4321i c() {
        return this.f23109c;
    }

    public List<String> d() {
        return this.f23111e;
    }

    public String e() {
        return this.f23108b;
    }

    public List<F> f() {
        return this.f23113g;
    }

    public List<? extends N4.P> g() {
        return this.f23110d;
    }

    public O h() {
        return this.f23107a;
    }

    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.f23114h;
    }

    public F(O o10, String str, EnumC4321i enumC4321i, List<? extends N4.P> list, List<F> list2) {
        this.f23107a = o10;
        this.f23108b = str;
        this.f23109c = enumC4321i;
        this.f23110d = list;
        this.f23113g = list2;
        this.f23111e = new ArrayList(list.size());
        this.f23112f = new ArrayList();
        if (list2 != null) {
            Iterator<F> it = list2.iterator();
            while (it.hasNext()) {
                this.f23112f.addAll(it.next().f23112f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (enumC4321i == EnumC4321i.REPLACE && list.get(i10).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String strB = list.get(i10).b();
            this.f23111e.add(strB);
            this.f23112f.add(strB);
        }
    }

    public static /* synthetic */ Unit a(F f10) {
        f10.getClass();
        C5404f.b(f10);
        return Unit.f142422a;
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
