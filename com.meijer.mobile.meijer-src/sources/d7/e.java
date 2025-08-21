package d7;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import d7.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class e<Model, Data> implements o<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final a<Data> f128194a;

    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final String f128195a;

        /* renamed from: b, reason: collision with root package name */
        private final a<Data> f128196b;

        /* renamed from: c, reason: collision with root package name */
        private Data f128197c;

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f128196b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f128196b.b(this.f128197c);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public X6.a d() {
            return X6.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data dataC = this.f128196b.c(this.f128195a);
                this.f128197c = dataC;
                aVar.f(dataC);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }

        b(String str, a<Data> aVar) {
            this.f128195a = str;
            this.f128196b = aVar;
        }
    }

    public static final class c<Model> implements p<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final a<InputStream> f128198a = new a();

        class a implements a<InputStream> {
            a() {
            }

            @Override // d7.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // d7.e.a
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

            @Override // d7.e.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        @Override // d7.p
        public o<Model, InputStream> d(s sVar) {
            return new e(this.f128198a);
        }
    }

    @Override // d7.o
    public o.a<Data> b(Model model, int i10, int i11, X6.g gVar) {
        return new o.a<>(new q7.d(model), new b(model.toString(), this.f128194a));
    }

    public e(a<Data> aVar) {
        this.f128194a = aVar;
    }

    @Override // d7.o
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }
}
