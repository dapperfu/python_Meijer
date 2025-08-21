package androidx.media3.exoplayer.video;

import e3.g;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private g.e f57239a;

    private void e(List<g.d> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).f129501a == 1) {
                this.f57239a = g.e.a(list.get(i10));
            }
        }
    }

    public void c() {
        this.f57239a = null;
    }

    private boolean a(g.d dVar, boolean z10) {
        g.e eVar;
        g.b bVarB;
        int i10 = dVar.f129501a;
        if (i10 == 2 || i10 == 15) {
            return true;
        }
        if (i10 != 3 || z10) {
            return ((i10 != 6 && i10 != 3) || (eVar = this.f57239a) == null || (bVarB = g.b.b(eVar, dVar)) == null || bVarB.a()) ? false : true;
        }
        return false;
    }

    a() {
    }

    public void b(ByteBuffer byteBuffer) {
        e(e3.g.e(byteBuffer));
    }

    public int d(ByteBuffer byteBuffer, boolean z10) {
        List<g.d> listE = e3.g.e(byteBuffer);
        e(listE);
        int size = listE.size() - 1;
        int i10 = 0;
        while (size >= 0 && a(listE.get(size), z10)) {
            if (listE.get(size).f129501a == 6 || listE.get(size).f129501a == 3) {
                i10++;
            }
            size--;
        }
        if (i10 <= 1 && size + 1 < 8) {
            if (size >= 0) {
                return listE.get(size).f129502b.limit();
            }
            return byteBuffer.position();
        }
        return byteBuffer.limit();
    }
}
