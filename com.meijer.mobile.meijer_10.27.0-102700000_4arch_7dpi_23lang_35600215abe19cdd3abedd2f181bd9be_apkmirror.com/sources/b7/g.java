package b7;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import b7.o;
import com.bumptech.glide.load.data.d;
import com.fullstory.FS;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class g<Data> implements o<File, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final d<Data> f59975a;

    public static class a<Data> implements p<File, Data> {

        /* renamed from: a, reason: collision with root package name */
        private final d<Data> f59976a;

        @Override // b7.p
        public final o<File, Data> d(s sVar) {
            return new g(this.f59976a);
        }

        public a(d<Data> dVar) {
            this.f59976a = dVar;
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        class a implements d<ParcelFileDescriptor> {
            @Override // b7.g.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // b7.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            a() {
            }

            @Override // b7.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }
        }

        public b() {
            super(new a());
        }
    }

    private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: a, reason: collision with root package name */
        private final File f59977a;

        /* renamed from: b, reason: collision with root package name */
        private final d<Data> f59978b;

        /* renamed from: c, reason: collision with root package name */
        private Data f59979c;

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f59978b.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f59979c;
            if (data != null) {
                try {
                    this.f59978b.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public V6.a d() {
            return V6.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data dataC = this.f59978b.c(this.f59977a);
                this.f59979c = dataC;
                aVar.f(dataC);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    FS.log_d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }

        c(File file, d<Data> dVar) {
            this.f59977a = file;
            this.f59978b = dVar;
        }
    }

    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    public static class e extends a<InputStream> {

        class a implements d<InputStream> {
            @Override // b7.g.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // b7.g.d
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }

            a() {
            }

            @Override // b7.g.d
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }
        }

        public e() {
            super(new a());
        }
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(File file, int i10, int i11, V6.g gVar) {
        return new o.a<>(new o7.d(file), new c(file, this.f59975a));
    }

    public g(d<Data> dVar) {
        this.f59975a = dVar;
    }
}
