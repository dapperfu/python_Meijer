package Ju;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<Ku.h> f16159a = new a();

    @Deprecated
    public static abstract class b {

        @Deprecated
        public static abstract class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private static final a f16160a = new g();

            a() {
                super(null);
            }

            public static a a() {
                return f16160a;
            }
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
        }
    }

    public abstract Ju.a c();

    public abstract List<Ku.h> d();

    public abstract String e();

    public abstract j f();

    public abstract c g();

    @Deprecated
    public abstract b h();

    class a implements Comparator<Ku.h> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Ku.h hVar, Ku.h hVar2) {
            return hVar.b().compareToIgnoreCase(hVar2.b());
        }
    }

    public static abstract class c {
        public abstract String a();

        c() {
        }

        public static c b(String str) {
            boolean z10;
            if (Iu.b.b(str) && str.length() <= 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iu.c.a(z10, "Name should be a ASCII string with a length no greater than 255 characters.");
            return new h(str);
        }
    }

    public static p a(c cVar, String str, j jVar, Ju.a aVar, List<Ku.h> list) {
        Iu.c.a(new HashSet(list).size() == list.size(), "Columns have duplicate.");
        return b(cVar, str, jVar, aVar, list, b.a.a());
    }

    @Deprecated
    public static p b(c cVar, String str, j jVar, Ju.a aVar, List<Ku.h> list, b bVar) {
        Iu.c.a(new HashSet(list).size() == list.size(), "Columns have duplicate.");
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, f16159a);
        return new f(cVar, str, jVar, aVar, Collections.unmodifiableList(arrayList), bVar);
    }

    p() {
    }
}
