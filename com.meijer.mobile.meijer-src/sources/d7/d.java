package d7;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.fullstory.FS;
import d7.o;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import r7.C16868a;

/* loaded from: classes4.dex */
public class d implements o<File, ByteBuffer> {

    private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: a, reason: collision with root package name */
        private final File f128193a;

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public X6.a d() {
            return X6.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(C16868a.a(this.f128193a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    FS.log_d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }

        a(File file) {
            this.f128193a = file;
        }
    }

    public static class b implements p<File, ByteBuffer> {
        @Override // d7.p
        public o<File, ByteBuffer> d(s sVar) {
            return new d();
        }
    }

    @Override // d7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }

    @Override // d7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<ByteBuffer> b(File file, int i10, int i11, X6.g gVar) {
        return new o.a<>(new q7.d(file), new a(file));
    }
}
