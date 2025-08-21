package gh;

import java.util.ArrayList;
import java.util.List;

/* renamed from: gh.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C14371g implements com.google.zxing.p {

    /* renamed from: a, reason: collision with root package name */
    private com.google.zxing.l f134203a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.google.zxing.o> f134204b = new ArrayList();

    @Override // com.google.zxing.p
    public void a(com.google.zxing.o oVar) {
        this.f134204b.add(oVar);
    }

    protected com.google.zxing.m b(com.google.zxing.c cVar) {
        this.f134204b.clear();
        try {
            com.google.zxing.l lVar = this.f134203a;
            if (lVar instanceof com.google.zxing.i) {
                com.google.zxing.m mVarD = ((com.google.zxing.i) lVar).d(cVar);
                this.f134203a.reset();
                return mVarD;
            }
            com.google.zxing.m mVarB = lVar.b(cVar);
            this.f134203a.reset();
            return mVarB;
        } catch (Exception unused) {
            this.f134203a.reset();
            return null;
        } catch (Throwable th2) {
            this.f134203a.reset();
            throw th2;
        }
    }

    public List<com.google.zxing.o> d() {
        return new ArrayList(this.f134204b);
    }

    protected com.google.zxing.c e(com.google.zxing.h hVar) {
        return new com.google.zxing.c(new Ig.m(hVar));
    }

    public C14371g(com.google.zxing.l lVar) {
        this.f134203a = lVar;
    }

    public com.google.zxing.m c(com.google.zxing.h hVar) {
        return b(e(hVar));
    }
}
