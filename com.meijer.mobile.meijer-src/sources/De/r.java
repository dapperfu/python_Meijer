package De;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class r {

    private static class b<T> implements q<T>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends q<? super T>> f6157a;

        @Override // De.q
        public boolean apply(T t10) {
            for (int i10 = 0; i10 < this.f6157a.size(); i10++) {
                if (!this.f6157a.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        private b(List<? extends q<? super T>> list) {
            this.f6157a = list;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f6157a.equals(((b) obj).f6157a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6157a.hashCode() + 306654252;
        }

        public String toString() {
            return r.d("and", this.f6157a);
        }
    }

    private static <T> List<q<? super T>> c(q<? super T> qVar, q<? super T> qVar2) {
        return Arrays.asList(qVar, qVar2);
    }

    public static <T> q<T> b(q<? super T> qVar, q<? super T> qVar2) {
        return new b(c((q) p.q(qVar), (q) p.q(qVar2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
