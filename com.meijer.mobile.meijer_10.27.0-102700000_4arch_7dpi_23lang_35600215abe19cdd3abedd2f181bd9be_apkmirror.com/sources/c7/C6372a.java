package c7;

import b7.h;
import b7.n;
import b7.o;
import b7.p;
import b7.s;
import com.bumptech.glide.load.data.j;
import java.io.InputStream;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6372a implements o<h, InputStream> {

    /* renamed from: b, reason: collision with root package name */
    public static final V6.f<Integer> f61616b = V6.f.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    private final n<h, h> f61617a;

    /* renamed from: c7.a$a, reason: collision with other inner class name */
    public static class C1216a implements p<h, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final n<h, h> f61618a = new n<>(500);

        @Override // b7.p
        public o<h, InputStream> d(s sVar) {
            return new C6372a(this.f61618a);
        }
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(h hVar) {
        return true;
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> b(h hVar, int i10, int i11, V6.g gVar) {
        n<h, h> nVar = this.f61617a;
        if (nVar != null) {
            h hVarA = nVar.a(hVar, 0, 0);
            if (hVarA == null) {
                this.f61617a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVarA;
            }
        }
        return new o.a<>(hVar, new j(hVar, ((Integer) gVar.a(f61616b)).intValue()));
    }

    public C6372a(n<h, h> nVar) {
        this.f61617a = nVar;
    }
}
