package q3;

import a3.C5562b;
import a3.F;
import androidx.media3.exoplayer.source.m;
import d3.C13466a;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16444b extends m {

    /* renamed from: f, reason: collision with root package name */
    private final C5562b f156757f;

    @Override // androidx.media3.exoplayer.source.m, a3.F
    public F.b g(int i10, F.b bVar, boolean z10) {
        this.f56905e.g(i10, bVar, z10);
        long j10 = bVar.f43595d;
        if (j10 == -9223372036854775807L) {
            j10 = this.f156757f.f43786d;
        }
        bVar.u(bVar.f43592a, bVar.f43593b, bVar.f43594c, j10, bVar.o(), this.f156757f, bVar.f43597f);
        return bVar;
    }

    public C16444b(F f10, C5562b c5562b) {
        boolean z10;
        super(f10);
        if (f10.i() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.g(z10);
        C13466a.g(f10.p() == 1);
        this.f156757f = c5562b;
    }
}
