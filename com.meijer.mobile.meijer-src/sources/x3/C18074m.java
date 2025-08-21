package x3;

import a3.InterfaceC5654k;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import x3.O;

/* renamed from: x3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18074m implements O {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f170322a = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];

    @Override // x3.O
    public void b(a3.t tVar) {
    }

    @Override // x3.O
    public void c(long j10, int i10, int i11, int i12, O.a aVar) {
    }

    @Override // x3.O
    public int a(InterfaceC5654k interfaceC5654k, int i10, boolean z10, int i11) throws IOException {
        int i12 = interfaceC5654k.read(this.f170322a, 0, Math.min(this.f170322a.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // x3.O
    public void e(d3.D d10, int i10, int i11) {
        d10.X(i10);
    }
}
