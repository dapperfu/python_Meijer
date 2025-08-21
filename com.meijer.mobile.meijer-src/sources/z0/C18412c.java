package z0;

import H1.h;
import V0.C5489q0;
import V0.F1;
import V0.G1;
import V0.SolidColor;
import a1.d;
import a1.f;
import a1.o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import y0.C18233a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"La1/d;", "a", "La1/d;", "_close", "Ly0/a$a;", "(Ly0/a$a;)La1/d;", "Close", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18412c {

    /* renamed from: a, reason: collision with root package name */
    private static a1.d f172204a;

    public static final a1.d a(C18233a.C2752a c2752a) {
        a1.d dVar = f172204a;
        if (dVar != null) {
            Intrinsics.g(dVar);
            return dVar;
        }
        d.a aVar = new d.a("Filled.Close", h.p(24.0f), h.p(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iA = o.a();
        SolidColor solidColor = new SolidColor(C5489q0.INSTANCE.a(), null);
        int iA2 = F1.INSTANCE.a();
        int iA3 = G1.INSTANCE.a();
        f fVar = new f();
        fVar.f(19.0f, 6.41f);
        fVar.d(17.59f, 5.0f);
        fVar.d(12.0f, 10.59f);
        fVar.d(6.41f, 5.0f);
        fVar.d(5.0f, 6.41f);
        fVar.d(10.59f, 12.0f);
        fVar.d(5.0f, 17.59f);
        fVar.d(6.41f, 19.0f);
        fVar.d(12.0f, 13.41f);
        fVar.d(17.59f, 19.0f);
        fVar.d(19.0f, 17.59f);
        fVar.d(13.41f, 12.0f);
        fVar.a();
        a1.d dVarF = aVar.c(fVar.b(), (14336 & 2) != 0 ? o.a() : iA, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? o.b() : iA2, (14336 & 512) != 0 ? o.c() : iA3, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & RecyclerView.m.FLAG_MOVED) != 0 ? 0.0f : 0.0f, (14336 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).f();
        f172204a = dVarF;
        Intrinsics.g(dVarF);
        return dVarF;
    }
}
