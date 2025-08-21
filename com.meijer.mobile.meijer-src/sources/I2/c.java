package I2;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected int f14130a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f14131b;

    /* renamed from: c, reason: collision with root package name */
    private int f14132c;

    /* renamed from: d, reason: collision with root package name */
    private int f14133d;

    /* renamed from: e, reason: collision with root package name */
    d f14134e = d.a();

    protected int a(int i10) {
        return i10 + this.f14131b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f14133d) {
            return this.f14131b.getShort(this.f14132c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        this.f14131b = byteBuffer;
        if (byteBuffer == null) {
            this.f14130a = 0;
            this.f14132c = 0;
            this.f14133d = 0;
        } else {
            this.f14130a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f14132c = i11;
            this.f14133d = this.f14131b.getShort(i11);
        }
    }

    protected int d(int i10) {
        int i11 = i10 + this.f14130a;
        return i11 + this.f14131b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f14130a;
        return this.f14131b.getInt(i11 + this.f14131b.getInt(i11));
    }
}
