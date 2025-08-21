package g7;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14336a implements e<ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f134101a;

    /* renamed from: g7.a$a, reason: collision with other inner class name */
    public static class C2118a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new C14336a(byteBuffer);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f134101a.position(0);
        return this.f134101a;
    }

    public C14336a(ByteBuffer byteBuffer) {
        this.f134101a = byteBuffer;
    }
}
