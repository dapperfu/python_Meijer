package fsimpl;

import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public class gm {

    /* renamed from: a, reason: collision with root package name */
    protected int f133595a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f133596b;

    /* renamed from: c, reason: collision with root package name */
    gn f133597c = gn.a();

    /* renamed from: d, reason: collision with root package name */
    private int f133598d;

    /* renamed from: e, reason: collision with root package name */
    private int f133599e;

    protected static String a(int i10, ByteBuffer byteBuffer, gn gnVar) {
        int i11 = i10 + byteBuffer.getInt(i10);
        return gnVar.a(byteBuffer, i11 + 4, byteBuffer.getInt(i11));
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        short s10;
        this.f133596b = byteBuffer;
        if (byteBuffer != null) {
            this.f133595a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f133598d = i11;
            s10 = this.f133596b.getShort(i11);
        } else {
            s10 = 0;
            this.f133595a = 0;
            this.f133598d = 0;
        }
        this.f133599e = s10;
    }

    protected int d(int i10) {
        if (i10 < this.f133599e) {
            return this.f133596b.getShort(this.f133598d + i10);
        }
        return 0;
    }

    protected int e(int i10) {
        return i10 + this.f133596b.getInt(i10);
    }

    protected String f(int i10) {
        return a(i10, this.f133596b, this.f133597c);
    }

    protected int g(int i10) {
        int i11 = i10 + this.f133595a;
        return this.f133596b.getInt(i11 + this.f133596b.getInt(i11));
    }

    protected int h(int i10) {
        int i11 = i10 + this.f133595a;
        return i11 + this.f133596b.getInt(i11) + 4;
    }
}
