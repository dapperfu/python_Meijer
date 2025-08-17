package fh;

/* loaded from: classes7.dex */
public class m extends C13898g {

    /* renamed from: c, reason: collision with root package name */
    private boolean f131124c;

    @Override // fh.C13898g
    protected com.google.zxing.c e(com.google.zxing.h hVar) {
        if (this.f131124c) {
            this.f131124c = false;
            return new com.google.zxing.c(new Gg.m(hVar.e()));
        }
        this.f131124c = true;
        return new com.google.zxing.c(new Gg.m(hVar));
    }

    public m(com.google.zxing.l lVar) {
        super(lVar);
        this.f131124c = true;
    }
}
