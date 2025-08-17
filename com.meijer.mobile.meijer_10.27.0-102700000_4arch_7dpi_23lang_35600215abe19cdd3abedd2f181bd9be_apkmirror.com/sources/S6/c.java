package S6;

import S6.i;
import S6.j;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f33249a = new boolean[0];

    /* renamed from: b, reason: collision with root package name */
    public static final i.f<Boolean> f33250b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final i.f<Boolean> f33251c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final j.a<Boolean> f33252d = new C0749c();

    /* renamed from: e, reason: collision with root package name */
    public static final i.f<boolean[]> f33253e = new d();

    /* renamed from: f, reason: collision with root package name */
    public static final j.a<boolean[]> f33254f = new e();

    class a implements i.f<Boolean> {
        a() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(i iVar) throws IOException {
            return Boolean.valueOf(c.a(iVar));
        }
    }

    class b implements i.f<Boolean> {
        b() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            return Boolean.valueOf(c.a(iVar));
        }
    }

    /* renamed from: S6.c$c, reason: collision with other inner class name */
    class C0749c implements j.a<Boolean> {
        C0749c() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, Boolean bool) throws IOException {
            c.d(bool, jVar);
        }
    }

    class d implements i.f<boolean[]> {
        d() {
        }

        @Override // S6.i.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean[] a(i iVar) throws IOException {
            if (iVar.M()) {
                return null;
            }
            if (iVar.n() == 91) {
                iVar.j();
                return c.b(iVar);
            }
            throw iVar.p("Expecting '[' for boolean array start");
        }
    }

    class e implements j.a<boolean[]> {
        e() {
        }

        @Override // S6.j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, boolean[] zArr) throws IOException {
            c.c(zArr, jVar);
        }
    }

    public static void c(boolean[] zArr, j jVar) throws IOException {
        if (zArr == null) {
            jVar.n();
            return;
        }
        if (zArr.length == 0) {
            jVar.i("[]");
            return;
        }
        jVar.l((byte) 91);
        jVar.i(zArr[0] ? "true" : "false");
        for (int i10 = 1; i10 < zArr.length; i10++) {
            jVar.i(zArr[i10] ? ",true" : ",false");
        }
        jVar.l((byte) 93);
    }

    public static void d(Boolean bool, j jVar) throws IOException {
        if (bool == null) {
            jVar.n();
        } else if (bool.booleanValue()) {
            jVar.i("true");
        } else {
            jVar.i("false");
        }
    }

    public static boolean a(i iVar) throws IOException {
        if (iVar.N()) {
            return true;
        }
        if (iVar.L()) {
            return false;
        }
        throw iVar.r("Found invalid boolean value", 0);
    }

    public static boolean[] b(i iVar) throws IOException {
        if (iVar.n() == 93) {
            return f33249a;
        }
        boolean[] zArrCopyOf = new boolean[4];
        zArrCopyOf[0] = a(iVar);
        int i10 = 1;
        while (iVar.j() == 44) {
            iVar.j();
            if (i10 == zArrCopyOf.length) {
                zArrCopyOf = Arrays.copyOf(zArrCopyOf, zArrCopyOf.length << 1);
            }
            zArrCopyOf[i10] = a(iVar);
            i10++;
        }
        iVar.d();
        return Arrays.copyOf(zArrCopyOf, i10);
    }
}
