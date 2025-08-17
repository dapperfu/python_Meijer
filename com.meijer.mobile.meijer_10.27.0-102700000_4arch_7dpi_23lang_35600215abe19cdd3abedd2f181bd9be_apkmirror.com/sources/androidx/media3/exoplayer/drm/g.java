package androidx.media3.exoplayer.drm;

import Ce.y0;
import a3.v;
import android.net.Uri;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import d3.C13466a;
import f3.InterfaceC13839d;
import f3.i;
import java.util.Map;

/* loaded from: classes.dex */
public final class g implements k3.k {

    /* renamed from: a, reason: collision with root package name */
    private final Object f56107a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private v.f f56108b;

    /* renamed from: c, reason: collision with root package name */
    private i f56109c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC13839d.a f56110d;

    /* renamed from: e, reason: collision with root package name */
    private String f56111e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.media3.exoplayer.upstream.b f56112f;

    private i b(v.f fVar) {
        InterfaceC13839d.a aVarC = this.f56110d;
        if (aVarC == null) {
            aVarC = new i.b().c(this.f56111e);
        }
        Uri uri = fVar.f44069c;
        o oVar = new o(uri == null ? null : uri.toString(), fVar.f44074h, aVarC);
        y0<Map.Entry<String, String>> it = fVar.f44071e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            oVar.c(next.getKey(), next.getValue());
        }
        DefaultDrmSessionManager.b bVarE = new DefaultDrmSessionManager.b().f(fVar.f44067a, n.f56126d).c(fVar.f44072f).d(fVar.f44073g).e(He.f.l(fVar.f44076j));
        androidx.media3.exoplayer.upstream.b bVar = this.f56112f;
        if (bVar != null) {
            bVarE.b(bVar);
        }
        DefaultDrmSessionManager defaultDrmSessionManagerA = bVarE.a(oVar);
        defaultDrmSessionManagerA.F(0, fVar.c());
        return defaultDrmSessionManagerA;
    }

    @Override // k3.k
    public i a(v vVar) {
        i iVar;
        C13466a.e(vVar.f44012b);
        v.f fVar = vVar.f44012b.f44112c;
        if (fVar == null) {
            return i.f56118a;
        }
        synchronized (this.f56107a) {
            try {
                if (!fVar.equals(this.f56108b)) {
                    this.f56108b = fVar;
                    this.f56109c = b(fVar);
                }
                iVar = (i) C13466a.e(this.f56109c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }
}
