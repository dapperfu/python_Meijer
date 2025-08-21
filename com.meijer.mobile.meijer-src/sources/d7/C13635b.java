package d7;

import com.bumptech.glide.load.data.d;
import d7.o;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: d7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13635b<Data> implements o<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2017b<Data> f128188a;

    /* renamed from: d7.b$a */
    public static class a implements p<byte[], ByteBuffer> {

        /* renamed from: d7.b$a$a, reason: collision with other inner class name */
        class C2016a implements InterfaceC2017b<ByteBuffer> {
            C2016a() {
            }

            @Override // d7.C13635b.InterfaceC2017b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // d7.C13635b.InterfaceC2017b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // d7.p
        public o<byte[], ByteBuffer> d(s sVar) {
            return new C13635b(new C2016a());
        }
    }

    /* renamed from: d7.b$b, reason: collision with other inner class name */
    public interface InterfaceC2017b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* renamed from: d7.b$c */
    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f128190a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC2017b<Data> f128191b;

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f128191b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public X6.a d() {
            return X6.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            aVar.f(this.f128191b.b(this.f128190a));
        }

        c(byte[] bArr, InterfaceC2017b<Data> interfaceC2017b) {
            this.f128190a = bArr;
            this.f128191b = interfaceC2017b;
        }
    }

    /* renamed from: d7.b$d */
    public static class d implements p<byte[], InputStream> {

        /* renamed from: d7.b$d$a */
        class a implements InterfaceC2017b<InputStream> {
            a() {
            }

            @Override // d7.C13635b.InterfaceC2017b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // d7.C13635b.InterfaceC2017b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // d7.p
        public o<byte[], InputStream> d(s sVar) {
            return new C13635b(new a());
        }
    }

    @Override // d7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(byte[] bArr) {
        return true;
    }

    @Override // d7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(byte[] bArr, int i10, int i11, X6.g gVar) {
        return new o.a<>(new q7.d(bArr), new c(bArr, this.f128188a));
    }

    public C13635b(InterfaceC2017b<Data> interfaceC2017b) {
        this.f128188a = interfaceC2017b;
    }
}
