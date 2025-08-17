package I2;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected int f13457a;

    /* renamed from: b, reason: collision with root package name */
    protected ByteBuffer f13458b;

    /* renamed from: c, reason: collision with root package name */
    private int f13459c;

    /* renamed from: d, reason: collision with root package name */
    private int f13460d;

    /* renamed from: e, reason: collision with root package name */
    d f13461e = d.a();

    protected int a(int i10) {
        return i10 + this.f13458b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f13460d) {
            return this.f13458b.getShort(this.f13459c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        this.f13458b = byteBuffer;
        if (byteBuffer == null) {
            this.f13457a = 0;
            this.f13459c = 0;
            this.f13460d = 0;
        } else {
            this.f13457a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f13459c = i11;
            this.f13460d = this.f13458b.getShort(i11);
        }
    }

    protected int d(int i10) {
        int i11 = i10 + this.f13457a;
        return i11 + this.f13458b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f13457a;
        return this.f13458b.getInt(i11 + this.f13458b.getInt(i11));
    }
}
