package androidx.media3.decoder;

import a3.t;
import a3.w;
import g3.AbstractC14194a;
import g3.C14196c;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class DecoderInputBuffer extends AbstractC14194a {

    /* renamed from: b, reason: collision with root package name */
    public t f55463b;

    /* renamed from: c, reason: collision with root package name */
    public final C14196c f55464c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f55465d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f55466e;

    /* renamed from: f, reason: collision with root package name */
    public long f55467f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f55468g;

    /* renamed from: h, reason: collision with root package name */
    private final int f55469h;

    /* renamed from: i, reason: collision with root package name */
    private final int f55470i;

    public static final class InsufficientCapacityException extends IllegalStateException {

        /* renamed from: a, reason: collision with root package name */
        public final int f55471a;

        /* renamed from: b, reason: collision with root package name */
        public final int f55472b;

        public InsufficientCapacityException(int i10, int i11) {
            super("Buffer too small (" + i10 + " < " + i11 + ")");
            this.f55471a = i10;
            this.f55472b = i11;
        }
    }

    public DecoderInputBuffer(int i10) {
        this(i10, 0);
    }

    static {
        w.a("media3.decoder");
    }

    public DecoderInputBuffer(int i10, int i11) {
        this.f55464c = new C14196c();
        this.f55469h = i10;
        this.f55470i = i11;
    }

    private ByteBuffer E(int i10) {
        int i11 = this.f55469h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f55465d;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }

    public static DecoderInputBuffer I() {
        return new DecoderInputBuffer(0);
    }

    public void F(int i10) {
        int i11 = i10 + this.f55470i;
        ByteBuffer byteBuffer = this.f55465d;
        if (byteBuffer == null) {
            this.f55465d = E(i11);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (iCapacity >= i12) {
            this.f55465d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferE = E(i12);
        byteBufferE.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferE.put(byteBuffer);
        }
        this.f55465d = byteBufferE;
    }

    public final void G() {
        ByteBuffer byteBuffer = this.f55465d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f55468g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean H() {
        return p(1073741824);
    }

    public void J(int i10) {
        ByteBuffer byteBuffer = this.f55468g;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.f55468g = ByteBuffer.allocate(i10);
        } else {
            this.f55468g.clear();
        }
    }

    @Override // g3.AbstractC14194a
    public void o() {
        super.o();
        ByteBuffer byteBuffer = this.f55465d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f55468g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f55466e = false;
    }
}
