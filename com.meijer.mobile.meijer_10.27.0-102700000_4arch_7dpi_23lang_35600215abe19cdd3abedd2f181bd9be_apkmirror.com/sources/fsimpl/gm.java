package fsimpl;

import java.nio.ByteBuffer;

/* loaded from: classes14.dex */
public class gm {

    /* renamed from: a, reason: collision with root package name */
    protected int f132345a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f132346b;

    /* renamed from: c, reason: collision with root package name */
    gn f132347c = gn.a();

    /* renamed from: d, reason: collision with root package name */
    private int f132348d;

    /* renamed from: e, reason: collision with root package name */
    private int f132349e;

    protected static String a(int i10, ByteBuffer byteBuffer, gn gnVar) {
        int i11 = i10 + byteBuffer.getInt(i10);
        return gnVar.a(byteBuffer, i11 + 4, byteBuffer.getInt(i11));
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        short s10;
        this.f132346b = byteBuffer;
        if (byteBuffer != null) {
            this.f132345a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f132348d = i11;
            s10 = this.f132346b.getShort(i11);
        } else {
            s10 = 0;
            this.f132345a = 0;
            this.f132348d = 0;
        }
        this.f132349e = s10;
    }

    protected int d(int i10) {
        if (i10 < this.f132349e) {
            return this.f132346b.getShort(this.f132348d + i10);
        }
        return 0;
    }

    protected int e(int i10) {
        return i10 + this.f132346b.getInt(i10);
    }

    protected String f(int i10) {
        return a(i10, this.f132346b, this.f132347c);
    }

    protected int g(int i10) {
        int i11 = i10 + this.f132345a;
        return this.f132346b.getInt(i11 + this.f132346b.getInt(i11));
    }

    protected int h(int i10) {
        int i11 = i10 + this.f132345a;
        return i11 + this.f132346b.getInt(i11) + 4;
    }
}
