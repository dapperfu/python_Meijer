package C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private final r0 f3928a;

    /* renamed from: b, reason: collision with root package name */
    private final List<p0> f3929b;

    /* renamed from: c, reason: collision with root package name */
    private final List<AbstractC3025j> f3930c;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private static final List<Integer> f3931d = Arrays.asList(1, 2, 4, 3, 7);

        /* renamed from: a, reason: collision with root package name */
        private r0 f3932a;

        /* renamed from: b, reason: collision with root package name */
        private final List<p0> f3933b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final List<AbstractC3025j> f3934c = new ArrayList();

        private void c() {
            Iterator<AbstractC3025j> it = this.f3934c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                int iG = it.next().g();
                O.a0.a(f3931d, iG);
                int i11 = i10 & iG;
                if (i11 > 0) {
                    throw new IllegalArgumentException(String.format(Locale.US, "More than one effects has targets %s.", O.a0.b(i11)));
                }
                i10 |= iG;
            }
        }

        public a a(p0 p0Var) {
            this.f3933b.add(p0Var);
            return this;
        }

        public q0 b() {
            o2.i.b(!this.f3933b.isEmpty(), "UseCase must not be empty.");
            c();
            return new q0(this.f3932a, this.f3933b, this.f3934c);
        }

        public a d(r0 r0Var) {
            this.f3932a = r0Var;
            return this;
        }
    }

    public List<AbstractC3025j> a() {
        return this.f3930c;
    }

    public List<p0> b() {
        return this.f3929b;
    }

    public r0 c() {
        return this.f3928a;
    }

    q0(r0 r0Var, List<p0> list, List<AbstractC3025j> list2) {
        this.f3928a = r0Var;
        this.f3929b = list;
        this.f3930c = list2;
    }
}
