package gh;

/* loaded from: classes8.dex */
public class m extends C14371g {

    /* renamed from: c, reason: collision with root package name */
    private boolean f134223c;

    @Override // gh.C14371g
    protected com.google.zxing.c e(com.google.zxing.h hVar) {
        if (this.f134223c) {
            this.f134223c = false;
            return new com.google.zxing.c(new Ig.m(hVar.e()));
        }
        this.f134223c = true;
        return new com.google.zxing.c(new Ig.m(hVar));
    }

    public m(com.google.zxing.l lVar) {
        super(lVar);
        this.f134223c = true;
    }
}
