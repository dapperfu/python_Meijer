package b7;

import android.util.Log;
import b7.o;
import com.bumptech.glide.load.data.d;
import com.fullstory.FS;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p7.C16264a;

/* loaded from: classes4.dex */
public class d implements o<File, ByteBuffer> {

    private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: a, reason: collision with root package name */
        private final File f59958a;

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
        public V6.a d() {
            return V6.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(C16264a.a(this.f59958a));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    FS.log_d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }

        a(File file) {
            this.f59958a = file;
        }
    }

    public static class b implements p<File, ByteBuffer> {
        @Override // b7.p
        public o<File, ByteBuffer> d(s sVar) {
            return new d();
        }
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(File file) {
        return true;
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<ByteBuffer> b(File file, int i10, int i11, V6.g gVar) {
        return new o.a<>(new o7.d(file), new a(file));
    }
}
