package Fu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<Gu.h> f10958a = new a();

    @Deprecated
    public static abstract class b {

        @Deprecated
        public static abstract class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private static final a f10959a = new g();

            a() {
                super(null);
            }

            public static a a() {
                return f10959a;
            }
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
        }
    }

    public abstract Fu.a c();

    public abstract List<Gu.h> d();

    public abstract String e();

    public abstract j f();

    public abstract c g();

    @Deprecated
    public abstract b h();

    class a implements Comparator<Gu.h> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Gu.h hVar, Gu.h hVar2) {
            return hVar.b().compareToIgnoreCase(hVar2.b());
        }
    }

    public static abstract class c {
        public abstract String a();

        c() {
        }

        public static c b(String str) {
            boolean z10;
            if (Eu.b.b(str) && str.length() <= 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            Eu.c.a(z10, "Name should be a ASCII string with a length no greater than 255 characters.");
            return new h(str);
        }
    }

    public static p a(c cVar, String str, j jVar, Fu.a aVar, List<Gu.h> list) {
        Eu.c.a(new HashSet(list).size() == list.size(), "Columns have duplicate.");
        return b(cVar, str, jVar, aVar, list, b.a.a());
    }

    @Deprecated
    public static p b(c cVar, String str, j jVar, Fu.a aVar, List<Gu.h> list, b bVar) {
        Eu.c.a(new HashSet(list).size() == list.size(), "Columns have duplicate.");
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, f10958a);
        return new f(cVar, str, jVar, aVar, Collections.unmodifiableList(arrayList), bVar);
    }

    p() {
    }
}
