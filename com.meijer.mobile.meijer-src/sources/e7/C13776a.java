package e7;

import com.bumptech.glide.load.data.j;
import d7.h;
import d7.n;
import d7.o;
import d7.p;
import d7.s;
import java.io.InputStream;

/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13776a implements o<h, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final X6.f<Integer> f129998b = X6.f.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    private final n<h, h> f129999a;

    /* renamed from: e7.a$a, reason: collision with other inner class name */
    public static class C2043a implements p<h, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final n<h, h> f130000a = new n<>(500);

        @Override // d7.p
        public o<h, InputStream> d(s sVar) {
            return new C13776a(this.f130000a);
        }
    }

    @Override // d7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(h hVar) {
        return true;
    }

    @Override // d7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(h hVar, int i10, int i11, X6.g gVar) {
        n<h, h> nVar = this.f129999a;
        if (nVar != null) {
            h hVarA = nVar.a(hVar, 0, 0);
            if (hVarA == null) {
                this.f129999a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVarA;
            }
        }
        return new o.a<>(hVar, new j(hVar, ((Integer) gVar.a(f129998b)).intValue()));
    }

    public C13776a(n<h, h> nVar) {
        this.f129999a = nVar;
    }
}
