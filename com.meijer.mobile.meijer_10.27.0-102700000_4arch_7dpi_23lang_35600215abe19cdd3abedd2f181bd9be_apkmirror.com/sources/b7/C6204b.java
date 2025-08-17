package b7;

import b7.o;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: b7.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6204b<Data> implements o<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1184b<Data> f59953a;

    /* renamed from: b7.b$a */
    public static class a implements p<byte[], ByteBuffer> {

        /* renamed from: b7.b$a$a, reason: collision with other inner class name */
        class C1183a implements InterfaceC1184b<ByteBuffer> {
            C1183a() {
            }

            @Override // b7.C6204b.InterfaceC1184b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // b7.C6204b.InterfaceC1184b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // b7.p
        public o<byte[], ByteBuffer> d(s sVar) {
            return new C6204b(new C1183a());
        }
    }

    /* renamed from: b7.b$b, reason: collision with other inner class name */
    public interface InterfaceC1184b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* renamed from: b7.b$c */
    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f59955a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1184b<Data> f59956b;

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f59956b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public V6.a d() {
            return V6.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            aVar.f(this.f59956b.b(this.f59955a));
        }

        c(byte[] bArr, InterfaceC1184b<Data> interfaceC1184b) {
            this.f59955a = bArr;
            this.f59956b = interfaceC1184b;
        }
    }

    /* renamed from: b7.b$d */
    public static class d implements p<byte[], InputStream> {

        /* renamed from: b7.b$d$a */
        class a implements InterfaceC1184b<InputStream> {
            a() {
            }

            @Override // b7.C6204b.InterfaceC1184b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // b7.C6204b.InterfaceC1184b
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // b7.p
        public o<byte[], InputStream> d(s sVar) {
            return new C6204b(new a());
        }
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(byte[] bArr) {
        return true;
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(byte[] bArr, int i10, int i11, V6.g gVar) {
        return new o.a<>(new o7.d(bArr), new c(bArr, this.f59953a));
    }

    public C6204b(InterfaceC1184b<Data> interfaceC1184b) {
        this.f59953a = interfaceC1184b;
    }
}
