package androidx.media3.exoplayer.mediacodec;

import Be.w;
import a3.z;
import android.content.Context;
import android.os.HandlerThread;
import androidx.media3.exoplayer.mediacodec.b;
import androidx.media3.exoplayer.mediacodec.h;
import androidx.media3.exoplayer.mediacodec.q;
import d3.P;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g implements h.b {

    /* renamed from: b, reason: collision with root package name */
    private final Context f56480b;

    /* renamed from: c, reason: collision with root package name */
    private final w<HandlerThread> f56481c;

    /* renamed from: d, reason: collision with root package name */
    private final w<HandlerThread> f56482d;

    /* renamed from: e, reason: collision with root package name */
    private int f56483e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f56484f;

    @Deprecated
    public g() {
        this.f56483e = 0;
        this.f56484f = false;
        this.f56480b = null;
        this.f56481c = null;
        this.f56482d = null;
    }

    private boolean c() {
        int i10 = P.f127086a;
        if (i10 >= 31) {
            return true;
        }
        Context context = this.f56480b;
        return context != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.h.b
    public h b(h.a aVar) throws IOException {
        int i10;
        w<HandlerThread> wVar;
        if (P.f127086a < 23 || !((i10 = this.f56483e) == 1 || (i10 == 0 && c()))) {
            return new q.b().b(aVar);
        }
        int iK = z.k(aVar.f56487c.f43949o);
        d3.r.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + P.p0(iK));
        w<HandlerThread> wVar2 = this.f56481c;
        b.C1126b c1126b = (wVar2 == null || (wVar = this.f56482d) == null) ? new b.C1126b(iK) : new b.C1126b(wVar2, wVar);
        c1126b.f(this.f56484f);
        return c1126b.b(aVar);
    }

    public g(Context context) {
        this(context, null, null);
    }

    public g(Context context, w<HandlerThread> wVar, w<HandlerThread> wVar2) {
        this.f56480b = context;
        this.f56483e = 0;
        this.f56484f = false;
        this.f56481c = wVar;
        this.f56482d = wVar2;
    }
}
