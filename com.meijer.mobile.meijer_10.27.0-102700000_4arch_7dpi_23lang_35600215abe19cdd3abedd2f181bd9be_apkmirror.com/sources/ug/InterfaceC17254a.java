package ug;

import Td.AbstractC5232j;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC5990F;
import androidx.view.InterfaceC6029r;
import com.google.android.gms.common.api.f;
import java.io.Closeable;
import java.util.List;
import vg.C17567a;
import yg.C18212a;

/* renamed from: ug.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC17254a extends Closeable, InterfaceC6029r, f {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC5990F(AbstractC6023l.a.ON_DESTROY)
    void close();

    AbstractC5232j<List<C17567a>> w0(C18212a c18212a);
}
