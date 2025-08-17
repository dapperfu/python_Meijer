package e7;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13632a implements e<ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f128633a;

    /* renamed from: e7.a$a, reason: collision with other inner class name */
    public static class C2020a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new C13632a(byteBuffer);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f128633a.position(0);
        return this.f128633a;
    }

    public C13632a(ByteBuffer byteBuffer) {
        this.f128633a = byteBuffer;
    }
}
