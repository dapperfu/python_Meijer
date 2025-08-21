package dh;

import bh.h;
import bh.j;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private h f128542a;

    /* renamed from: b, reason: collision with root package name */
    private bh.f f128543b;

    /* renamed from: c, reason: collision with root package name */
    private j f128544c;

    /* renamed from: d, reason: collision with root package name */
    private int f128545d = -1;

    /* renamed from: e, reason: collision with root package name */
    private C13682b f128546e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public C13682b a() {
        return this.f128546e;
    }

    public void c(bh.f fVar) {
        this.f128543b = fVar;
    }

    public void d(int i10) {
        this.f128545d = i10;
    }

    public void e(C13682b c13682b) {
        this.f128546e = c13682b;
    }

    public void f(h hVar) {
        this.f128542a = hVar;
    }

    public void g(j jVar) {
        this.f128544c = jVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(HttpResponseStatus.SUCCESS_OK);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f128542a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f128543b);
        sb2.append("\n version: ");
        sb2.append(this.f128544c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f128545d);
        if (this.f128546e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f128546e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
