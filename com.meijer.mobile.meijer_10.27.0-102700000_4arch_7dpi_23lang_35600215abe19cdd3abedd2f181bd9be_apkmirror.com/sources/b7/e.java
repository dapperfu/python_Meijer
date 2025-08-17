package b7;

import android.util.Base64;
import b7.o;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class e<Model, Data> implements o<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final a<Data> f59959a;

    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final String f59960a;

        /* renamed from: b, reason: collision with root package name */
        private final a<Data> f59961b;

        /* renamed from: c, reason: collision with root package name */
        private Data f59962c;

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f59961b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f59961b.b(this.f59962c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public V6.a d() {
            return V6.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data dataC = this.f59961b.c(this.f59960a);
                this.f59962c = dataC;
                aVar.f(dataC);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }

        b(String str, a<Data> aVar) {
            this.f59960a = str;
            this.f59961b = aVar;
        }
    }

    public static final class c<Model> implements p<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final a<InputStream> f59963a = new a();

        class a implements a<InputStream> {
            a() {
            }

            @Override // b7.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // b7.e.a
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }

            @Override // b7.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        @Override // b7.p
        public o<Model, InputStream> d(s sVar) {
            return new e(this.f59963a);
        }
    }

    @Override // b7.o
    public o.a<Data> b(Model model, int i10, int i11, V6.g gVar) {
        return new o.a<>(new o7.d(model), new b(model.toString(), this.f59959a));
    }

    public e(a<Data> aVar) {
        this.f59959a = aVar;
    }

    @Override // b7.o
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }
}
