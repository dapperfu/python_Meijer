package bh;

import Zg.h;
import Zg.j;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private h f60307a;

    /* renamed from: b, reason: collision with root package name */
    private Zg.f f60308b;

    /* renamed from: c, reason: collision with root package name */
    private j f60309c;

    /* renamed from: d, reason: collision with root package name */
    private int f60310d = -1;

    /* renamed from: e, reason: collision with root package name */
    private C6251b f60311e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public C6251b a() {
        return this.f60311e;
    }

    public void c(Zg.f fVar) {
        this.f60308b = fVar;
    }

    public void d(int i10) {
        this.f60310d = i10;
    }

    public void e(C6251b c6251b) {
        this.f60311e = c6251b;
    }

    public void f(h hVar) {
        this.f60307a = hVar;
    }

    public void g(j jVar) {
        this.f60309c = jVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(HttpResponseStatus.SUCCESS_OK);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f60307a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f60308b);
        sb2.append("\n version: ");
        sb2.append(this.f60309c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f60310d);
        if (this.f60311e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f60311e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
