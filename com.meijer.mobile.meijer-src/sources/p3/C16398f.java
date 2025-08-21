package p3;

import Ee.L;
import androidx.media3.exoplayer.source.G;
import java.util.List;

/* renamed from: p3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16398f implements InterfaceC16397e {
    @Override // p3.InterfaceC16397e
    public G a(List<? extends G> list, List<List<Integer>> list2) {
        return new C16396d(list, list2);
    }

    @Override // p3.InterfaceC16397e
    public G empty() {
        return new C16396d(L.x(), L.x());
    }
}
