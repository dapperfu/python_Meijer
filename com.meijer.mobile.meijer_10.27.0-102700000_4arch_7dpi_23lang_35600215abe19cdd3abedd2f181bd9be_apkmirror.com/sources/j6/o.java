package j6;

import java.util.List;
import v6.C17512a;
import v6.C17513b;
import v6.C17514c;

/* loaded from: classes4.dex */
public class o extends AbstractC14867g<n6.b> {

    class a extends C17514c<n6.b> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17513b f139471d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C17514c f139472e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n6.b f139473f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f139474g;

        a(o oVar, C17513b c17513b, C17514c c17514c, n6.b bVar) {
            this.f139471d = c17513b;
            this.f139472e = c17514c;
            this.f139473f = bVar;
            this.f139474g = oVar;
        }

        @Override // v6.C17514c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public n6.b a(C17513b<n6.b> c17513b) {
            this.f139471d.h(c17513b.f(), c17513b.a(), c17513b.g().f151018a, c17513b.b().f151018a, c17513b.d(), c17513b.c(), c17513b.e());
            String str = (String) this.f139472e.a(this.f139471d);
            n6.b bVarB = c17513b.c() == 1.0f ? c17513b.b() : c17513b.g();
            this.f139473f.a(str, bVarB.f151019b, bVarB.f151020c, bVarB.f151021d, bVarB.f151022e, bVarB.f151023f, bVarB.f151024g, bVarB.f151025h, bVarB.f151026i, bVarB.f151027j, bVarB.f151028k, bVarB.f151029l, bVarB.f151030m);
            return this.f139473f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j6.AbstractC14861a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public n6.b i(C17512a<n6.b> c17512a, float f10) {
        n6.b bVar;
        C17514c<A> c17514c = this.f139427e;
        if (c17514c == 0) {
            return (f10 != 1.0f || (bVar = c17512a.f164562c) == null) ? c17512a.f164561b : bVar;
        }
        float f11 = c17512a.f164566g;
        Float f12 = c17512a.f164567h;
        float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        n6.b bVar2 = c17512a.f164561b;
        n6.b bVar3 = bVar2;
        n6.b bVar4 = c17512a.f164562c;
        return (n6.b) c17514c.b(f11, fFloatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f10, d(), f());
    }

    public void s(C17514c<String> c17514c) {
        super.o(new a(this, new C17513b(), c17514c, new n6.b()));
    }

    public o(List<C17512a<n6.b>> list) {
        super(list);
    }
}
