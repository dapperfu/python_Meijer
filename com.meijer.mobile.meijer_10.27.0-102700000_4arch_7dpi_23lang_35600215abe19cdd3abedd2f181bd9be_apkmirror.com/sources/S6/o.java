package S6;

import S6.i;
import S6.j;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final i.f<String> f33456a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final j.a<String> f33457b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final j.a<CharSequence> f33458c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final i.f<StringBuilder> f33459d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final i.f<StringBuffer> f33460e = new e();

    class c implements j.a<CharSequence> {
        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                jVar.n();
            } else {
                jVar.p(charSequence);
            }
        }

        c() {
        }
    }

    class a implements i.f<String> {
        a() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return iVar.I();
        }
    }

    class b implements j.a<String> {
        b() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, String str) throws IOException {
            o.b(str, jVar);
        }
    }

    class d implements i.f<StringBuilder> {
        d() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StringBuilder a(i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return iVar.c(new StringBuilder());
        }
    }

    class e implements i.f<StringBuffer> {
        e() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public StringBuffer a(i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return iVar.b(new StringBuffer());
        }
    }

    public static void b(String str, j jVar) throws IOException {
        if (str == null) {
            jVar.n();
        } else {
            jVar.q(str);
        }
    }

    public static void a(String str, j jVar) throws IOException {
        jVar.q(str);
    }

    public static void c(String str, j jVar) throws IOException {
        jVar.q(str);
    }
}
