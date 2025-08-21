package q3;

import a3.C5645b;
import a3.F;
import androidx.media3.exoplayer.source.m;
import d3.C13599a;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16599b extends m {

    /* renamed from: f, reason: collision with root package name */
    private final C5645b f157870f;

    @Override // androidx.media3.exoplayer.source.m, a3.F
    public F.b g(int i10, F.b bVar, boolean z10) {
        this.f57129e.g(i10, bVar, z10);
        long j10 = bVar.f44413d;
        if (j10 == -9223372036854775807L) {
            j10 = this.f157870f.f44604d;
        }
        bVar.u(bVar.f44410a, bVar.f44411b, bVar.f44412c, j10, bVar.o(), this.f157870f, bVar.f44415f);
        return bVar;
    }

    public C16599b(F f10, C5645b c5645b) {
        boolean z10;
        super(f10);
        if (f10.i() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.g(z10);
        C13599a.g(f10.p() == 1);
        this.f157870f = c5645b;
    }
}
