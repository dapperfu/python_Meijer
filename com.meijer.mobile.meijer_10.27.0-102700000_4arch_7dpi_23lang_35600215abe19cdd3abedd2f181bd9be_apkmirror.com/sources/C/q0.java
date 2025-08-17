package C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private final r0 f3470a;

    /* renamed from: b, reason: collision with root package name */
    private final List<p0> f3471b;

    /* renamed from: c, reason: collision with root package name */
    private final List<AbstractC2967j> f3472c;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final List<Integer> f3473d = Arrays.asList(1, 2, 4, 3, 7);

        /* renamed from: a, reason: collision with root package name */
        private r0 f3474a;

        /* renamed from: b, reason: collision with root package name */
        private final List<p0> f3475b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List<AbstractC2967j> f3476c = new ArrayList();

        private void c() {
            Iterator<AbstractC2967j> it = this.f3476c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int iG = it.next().g();
                O.a0.a(f3473d, iG);
                int i11 = i10 & iG;
                if (i11 > 0) {
                    throw new IllegalArgumentException(String.format(Locale.US, "More than one effects has targets %s.", O.a0.b(i11)));
                }
                i10 |= iG;
            }
        }

        public a a(p0 p0Var) {
            this.f3475b.add(p0Var);
            return this;
        }

        public q0 b() {
            o2.i.b(!this.f3475b.isEmpty(), "UseCase must not be empty.");
            c();
            return new q0(this.f3474a, this.f3475b, this.f3476c);
        }

        public a d(r0 r0Var) {
            this.f3474a = r0Var;
            return this;
        }
    }

    public List<AbstractC2967j> a() {
        return this.f3472c;
    }

    public List<p0> b() {
        return this.f3471b;
    }

    public r0 c() {
        return this.f3470a;
    }

    q0(r0 r0Var, List<p0> list, List<AbstractC2967j> list2) {
        this.f3470a = r0Var;
        this.f3471b = list;
        this.f3472c = list2;
    }
}
