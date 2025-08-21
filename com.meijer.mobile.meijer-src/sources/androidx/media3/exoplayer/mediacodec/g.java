package androidx.media3.exoplayer.mediacodec;

import De.w;
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
    private final Context f56704b;

    /* renamed from: c, reason: collision with root package name */
    private final w<HandlerThread> f56705c;

    /* renamed from: d, reason: collision with root package name */
    private final w<HandlerThread> f56706d;

    /* renamed from: e, reason: collision with root package name */
    private int f56707e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f56708f;

    @Deprecated
    public g() {
        this.f56707e = 0;
        this.f56708f = false;
        this.f56704b = null;
        this.f56705c = null;
        this.f56706d = null;
    }

    private boolean c() {
        int i10 = P.f127888a;
        if (i10 >= 31) {
            return true;
        }
        Context context = this.f56704b;
        return context != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.h.b
    public h b(h.a aVar) throws IOException {
        int i10;
        w<HandlerThread> wVar;
        if (P.f127888a < 23 || !((i10 = this.f56707e) == 1 || (i10 == 0 && c()))) {
            return new q.b().b(aVar);
        }
        int iK = z.k(aVar.f56711c.f44767o);
        d3.r.g("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + P.p0(iK));
        w<HandlerThread> wVar2 = this.f56705c;
        b.C1139b c1139b = (wVar2 == null || (wVar = this.f56706d) == null) ? new b.C1139b(iK) : new b.C1139b(wVar2, wVar);
        c1139b.f(this.f56708f);
        return c1139b.b(aVar);
    }

    public g(Context context) {
        this(context, null, null);
    }

    public g(Context context, w<HandlerThread> wVar, w<HandlerThread> wVar2) {
        this.f56704b = context;
        this.f56707e = 0;
        this.f56708f = false;
        this.f56705c = wVar;
        this.f56706d = wVar2;
    }
}
