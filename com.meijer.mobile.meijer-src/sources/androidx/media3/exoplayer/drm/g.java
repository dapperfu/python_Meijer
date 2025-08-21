package androidx.media3.exoplayer.drm;

import Ee.y0;
import a3.v;
import android.net.Uri;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import d3.C13599a;
import f3.InterfaceC13949d;
import f3.i;
import java.util.Map;

/* loaded from: classes.dex */
public final class g implements k3.k {

    /* renamed from: a, reason: collision with root package name */
    private final Object f56331a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private v.f f56332b;

    /* renamed from: c, reason: collision with root package name */
    private i f56333c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC13949d.a f56334d;

    /* renamed from: e, reason: collision with root package name */
    private String f56335e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.media3.exoplayer.upstream.b f56336f;

    private i b(v.f fVar) {
        InterfaceC13949d.a aVarC = this.f56334d;
        if (aVarC == null) {
            aVarC = new i.b().c(this.f56335e);
        }
        Uri uri = fVar.f44887c;
        o oVar = new o(uri == null ? null : uri.toString(), fVar.f44892h, aVarC);
        y0<Map.Entry<String, String>> it = fVar.f44889e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            oVar.c(next.getKey(), next.getValue());
        }
        DefaultDrmSessionManager.b bVarE = new DefaultDrmSessionManager.b().f(fVar.f44885a, n.f56350d).c(fVar.f44890f).d(fVar.f44891g).e(Je.f.l(fVar.f44894j));
        androidx.media3.exoplayer.upstream.b bVar = this.f56336f;
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
        C13599a.e(vVar.f44830b);
        v.f fVar = vVar.f44830b.f44930c;
        if (fVar == null) {
            return i.f56342a;
        }
        synchronized (this.f56331a) {
            try {
                if (!fVar.equals(this.f56332b)) {
                    this.f56332b = fVar;
                    this.f56333c = b(fVar);
                }
                iVar = (i) C13599a.e(this.f56333c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }
}
