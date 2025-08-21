package k6;

import java.util.List;
import w6.C17845a;
import w6.C17846b;
import w6.C17847c;

/* loaded from: classes4.dex */
public class o extends AbstractC15099g<o6.b> {

    class a extends C17847c<o6.b> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17846b f141669d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C17847c f141670e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ o6.b f141671f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f141672g;

        a(o oVar, C17846b c17846b, C17847c c17847c, o6.b bVar) {
            this.f141669d = c17846b;
            this.f141670e = c17847c;
            this.f141671f = bVar;
            this.f141672g = oVar;
        }

        @Override // w6.C17847c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public o6.b a(C17846b<o6.b> c17846b) {
            this.f141669d.h(c17846b.f(), c17846b.a(), c17846b.g().f153620a, c17846b.b().f153620a, c17846b.d(), c17846b.c(), c17846b.e());
            String str = (String) this.f141670e.a(this.f141669d);
            o6.b bVarB = c17846b.c() == 1.0f ? c17846b.b() : c17846b.g();
            this.f141671f.a(str, bVarB.f153621b, bVarB.f153622c, bVarB.f153623d, bVarB.f153624e, bVarB.f153625f, bVarB.f153626g, bVarB.f153627h, bVarB.f153628i, bVarB.f153629j, bVarB.f153630k, bVarB.f153631l, bVarB.f153632m);
            return this.f141671f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k6.AbstractC15093a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public o6.b i(C17845a<o6.b> c17845a, float f10) {
        o6.b bVar;
        C17847c<A> c17847c = this.f141625e;
        if (c17847c == 0) {
            return (f10 != 1.0f || (bVar = c17845a.f166946c) == null) ? c17845a.f166945b : bVar;
        }
        float f11 = c17845a.f166950g;
        Float f12 = c17845a.f166951h;
        float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        o6.b bVar2 = c17845a.f166945b;
        o6.b bVar3 = bVar2;
        o6.b bVar4 = c17845a.f166946c;
        return (o6.b) c17847c.b(f11, fFloatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f10, d(), f());
    }

    public void s(C17847c<String> c17847c) {
        super.o(new a(this, new C17846b(), c17847c, new o6.b()));
    }

    public o(List<C17845a<o6.b>> list) {
        super(list);
    }
}
