package p3;

import Ce.L;
import androidx.media3.exoplayer.source.G;
import java.util.List;

/* renamed from: p3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16253f implements InterfaceC16252e {
    @Override // p3.InterfaceC16252e
    public G a(List<? extends G> list, List<List<Integer>> list2) {
        return new C16251d(list, list2);
    }

    @Override // p3.InterfaceC16252e
    public G empty() {
        return new C16251d(L.x(), L.x());
    }
}
