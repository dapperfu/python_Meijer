package wg;

import Vd.AbstractC5516j;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6132F;
import androidx.view.InterfaceC6171r;
import com.google.android.gms.common.api.f;
import java.io.Closeable;
import java.util.List;
import xg.C18179a;

/* renamed from: wg.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC17871a extends Closeable, InterfaceC6171r, f {
    AbstractC5516j<List<C18179a>> D0(Ag.a aVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC6132F(AbstractC6165l.a.ON_DESTROY)
    void close();
}
