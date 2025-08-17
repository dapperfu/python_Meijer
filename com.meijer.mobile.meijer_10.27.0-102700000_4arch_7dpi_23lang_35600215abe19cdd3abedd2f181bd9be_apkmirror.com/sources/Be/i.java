package Be;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f2199a;

    class a extends i {
        a(i iVar) {
            super(iVar, null);
        }

        @Override // Be.i
        public <A extends Appendable> A b(A a10, Iterator<? extends Object> it) throws IOException {
            p.r(a10, "appendable");
            p.r(it, "parts");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    a10.append(i.this.j(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a10.append(i.this.f2199a);
                    a10.append(i.this.j(next2));
                }
            }
            return a10;
        }

        @Override // Be.i
        public b k(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final i f2201a;

        /* renamed from: b, reason: collision with root package name */
        private final String f2202b;

        /* synthetic */ b(i iVar, String str, h hVar) {
            this(iVar, str);
        }

        private b(i iVar, String str) {
            this.f2201a = iVar;
            this.f2202b = (String) p.q(str);
        }

        public String d(Iterator<? extends Map.Entry<?, ?>> it) {
            return b(new StringBuilder(), it).toString();
        }

        public <A extends Appendable> A a(A a10, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            p.q(a10);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a10.append(this.f2201a.j(next.getKey()));
                a10.append(this.f2202b);
                a10.append(this.f2201a.j(next.getValue()));
                while (it.hasNext()) {
                    a10.append(this.f2201a.f2199a);
                    Map.Entry<?, ?> next2 = it.next();
                    a10.append(this.f2201a.j(next2.getKey()));
                    a10.append(this.f2202b);
                    a10.append(this.f2201a.j(next2.getValue()));
                }
            }
            return a10;
        }

        public StringBuilder b(StringBuilder sb2, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                a(sb2, it);
                return sb2;
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }

        public String c(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return d(iterable.iterator());
        }

        public String e(Map<?, ?> map) {
            return c(map.entrySet());
        }
    }

    /* synthetic */ i(i iVar, h hVar) {
        this(iVar);
    }

    private i(String str) {
        this.f2199a = (String) p.q(str);
    }

    public static i g(char c10) {
        return new i(String.valueOf(c10));
    }

    public static i h(String str) {
        return new i(str);
    }

    public final String f(Iterator<? extends Object> it) {
        return d(new StringBuilder(), it).toString();
    }

    public i i() {
        return new a(this);
    }

    public b k(String str) {
        return new b(this, str, null);
    }

    public <A extends Appendable> A b(A a10, Iterator<? extends Object> it) throws IOException {
        p.q(a10);
        if (it.hasNext()) {
            a10.append(j(it.next()));
            while (it.hasNext()) {
                a10.append(this.f2199a);
                a10.append(j(it.next()));
            }
        }
        return a10;
    }

    public final StringBuilder c(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return d(sb2, iterable.iterator());
    }

    public final StringBuilder d(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            b(sb2, it);
            return sb2;
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String e(Iterable<? extends Object> iterable) {
        return f(iterable.iterator());
    }

    CharSequence j(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    private i(i iVar) {
        this.f2199a = iVar.f2199a;
    }
}
