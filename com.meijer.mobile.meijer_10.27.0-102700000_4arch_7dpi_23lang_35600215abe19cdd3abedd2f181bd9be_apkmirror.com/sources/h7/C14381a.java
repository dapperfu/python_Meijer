package h7;

import U6.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.fullstory.FS;
import d7.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p7.l;

/* renamed from: h7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14381a implements V6.i<ByteBuffer, C14383c> {

    /* renamed from: f, reason: collision with root package name */
    private static final C2122a f134448f = new C2122a();

    /* renamed from: g, reason: collision with root package name */
    private static final b f134449g = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Context f134450a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ImageHeaderParser> f134451b;

    /* renamed from: c, reason: collision with root package name */
    private final b f134452c;

    /* renamed from: d, reason: collision with root package name */
    private final C2122a f134453d;

    /* renamed from: e, reason: collision with root package name */
    private final C14382b f134454e;

    /* renamed from: h7.a$a, reason: collision with other inner class name */
    static class C2122a {
        U6.a a(a.InterfaceC0784a interfaceC0784a, U6.c cVar, ByteBuffer byteBuffer, int i10) {
            return new U6.e(interfaceC0784a, cVar, byteBuffer, i10);
        }

        C2122a() {
        }
    }

    public C14381a(Context context, List<ImageHeaderParser> list, Y6.d dVar, Y6.b bVar) {
        this(context, list, dVar, bVar, f134449g, f134448f);
    }

    /* renamed from: h7.a$b */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue<U6.d> f134455a = l.f(0);

        synchronized U6.d a(ByteBuffer byteBuffer) {
            U6.d dVarPoll;
            try {
                dVarPoll = this.f134455a.poll();
                if (dVarPoll == null) {
                    dVarPoll = new U6.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return dVarPoll.p(byteBuffer);
        }

        synchronized void b(U6.d dVar) {
            dVar.a();
            this.f134455a.offer(dVar);
        }

        b() {
        }
    }

    C14381a(Context context, List<ImageHeaderParser> list, Y6.d dVar, Y6.b bVar, b bVar2, C2122a c2122a) {
        this.f134450a = context.getApplicationContext();
        this.f134451b = list;
        this.f134453d = c2122a;
        this.f134454e = new C14382b(dVar, bVar);
        this.f134452c = bVar2;
    }

    private e c(ByteBuffer byteBuffer, int i10, int i11, U6.d dVar, V6.g gVar) {
        StringBuilder sb2;
        long jB = p7.g.b();
        try {
            U6.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = gVar.a(i.f134495a) == V6.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                U6.a aVarA = this.f134453d.a(this.f134454e, cVarC, byteBuffer, e(cVarC, i10, i11));
                aVarA.d(config);
                aVarA.b();
                Bitmap bitmapA = aVarA.a();
                if (bitmapA == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder();
                    }
                    return null;
                }
                e eVar = new e(new C14383c(this.f134450a, aVarA, k.a(), i10, i11, bitmapA));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    FS.log_v("BufferGifDecoder", "Decoded GIF from stream in " + p7.g.a(jB));
                }
                return eVar;
            }
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                return null;
            }
            sb2 = new StringBuilder();
            sb2.append("Decoded GIF from stream in ");
            sb2.append(p7.g.a(jB));
            FS.log_v("BufferGifDecoder", sb2.toString());
            return null;
        } catch (Throwable th2) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                FS.log_v("BufferGifDecoder", "Decoded GIF from stream in " + p7.g.a(jB));
            }
            throw th2;
        }
    }

    @Override // V6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(ByteBuffer byteBuffer, int i10, int i11, V6.g gVar) {
        U6.d dVarA = this.f134452c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, dVarA, gVar);
        } finally {
            this.f134452c.b(dVarA);
        }
    }

    @Override // V6.i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, V6.g gVar) throws IOException {
        return !((Boolean) gVar.a(i.f134496b)).booleanValue() && com.bumptech.glide.load.a.g(this.f134451b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    private static int e(U6.c cVar, int i10, int i11) {
        int iHighestOneBit;
        int iMin = Math.min(cVar.a() / i11, cVar.d() / i10);
        if (iMin == 0) {
            iHighestOneBit = 0;
        } else {
            iHighestOneBit = Integer.highestOneBit(iMin);
        }
        int iMax = Math.max(1, iHighestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            FS.log_v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return iMax;
    }
}
