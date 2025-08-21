package j7;

import W6.a;
import a7.InterfaceC5665b;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.fullstory.FS;
import f7.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import r7.l;

/* renamed from: j7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14959a implements X6.i<ByteBuffer, C14961c> {

    /* renamed from: f, reason: collision with root package name */
    private static final C2220a f140135f = new C2220a();

    /* renamed from: g, reason: collision with root package name */
    private static final b f140136g = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Context f140137a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ImageHeaderParser> f140138b;

    /* renamed from: c, reason: collision with root package name */
    private final b f140139c;

    /* renamed from: d, reason: collision with root package name */
    private final C2220a f140140d;

    /* renamed from: e, reason: collision with root package name */
    private final C14960b f140141e;

    /* renamed from: j7.a$a, reason: collision with other inner class name */
    static class C2220a {
        W6.a a(a.InterfaceC0877a interfaceC0877a, W6.c cVar, ByteBuffer byteBuffer, int i10) {
            return new W6.e(interfaceC0877a, cVar, byteBuffer, i10);
        }

        C2220a() {
        }
    }

    public C14959a(Context context, List<ImageHeaderParser> list, a7.d dVar, InterfaceC5665b interfaceC5665b) {
        this(context, list, dVar, interfaceC5665b, f140136g, f140135f);
    }

    /* renamed from: j7.a$b */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue<W6.d> f140142a = l.f(0);

        synchronized W6.d a(ByteBuffer byteBuffer) {
            W6.d dVarPoll;
            try {
                dVarPoll = this.f140142a.poll();
                if (dVarPoll == null) {
                    dVarPoll = new W6.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return dVarPoll.p(byteBuffer);
        }

        synchronized void b(W6.d dVar) {
            dVar.a();
            this.f140142a.offer(dVar);
        }

        b() {
        }
    }

    C14959a(Context context, List<ImageHeaderParser> list, a7.d dVar, InterfaceC5665b interfaceC5665b, b bVar, C2220a c2220a) {
        this.f140137a = context.getApplicationContext();
        this.f140138b = list;
        this.f140140d = c2220a;
        this.f140141e = new C14960b(dVar, interfaceC5665b);
        this.f140139c = bVar;
    }

    private e c(ByteBuffer byteBuffer, int i10, int i11, W6.d dVar, X6.g gVar) {
        StringBuilder sb2;
        long jB = r7.g.b();
        try {
            W6.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = gVar.a(i.f140182a) == X6.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                W6.a aVarA = this.f140140d.a(this.f140141e, cVarC, byteBuffer, e(cVarC, i10, i11));
                aVarA.d(config);
                aVarA.b();
                Bitmap bitmapA = aVarA.a();
                if (bitmapA == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb2 = new StringBuilder();
                    }
                    return null;
                }
                e eVar = new e(new C14961c(this.f140137a, aVarA, k.a(), i10, i11, bitmapA));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    FS.log_v("BufferGifDecoder", "Decoded GIF from stream in " + r7.g.a(jB));
                }
                return eVar;
            }
            if (!Log.isLoggable("BufferGifDecoder", 2)) {
                return null;
            }
            sb2 = new StringBuilder();
            sb2.append("Decoded GIF from stream in ");
            sb2.append(r7.g.a(jB));
            FS.log_v("BufferGifDecoder", sb2.toString());
            return null;
        } catch (Throwable th2) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                FS.log_v("BufferGifDecoder", "Decoded GIF from stream in " + r7.g.a(jB));
            }
            throw th2;
        }
    }

    @Override // X6.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e b(ByteBuffer byteBuffer, int i10, int i11, X6.g gVar) {
        W6.d dVarA = this.f140139c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, dVarA, gVar);
        } finally {
            this.f140139c.b(dVarA);
        }
    }

    @Override // X6.i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, X6.g gVar) throws IOException {
        return !((Boolean) gVar.a(i.f140183b)).booleanValue() && com.bumptech.glide.load.a.g(this.f140138b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    private static int e(W6.c cVar, int i10, int i11) {
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
