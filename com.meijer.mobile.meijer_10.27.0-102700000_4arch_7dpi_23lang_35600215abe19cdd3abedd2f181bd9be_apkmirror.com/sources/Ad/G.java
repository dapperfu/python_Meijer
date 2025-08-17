package Ad;

import Td.C5233k;
import com.google.android.gms.common.api.Status;
import hd.C14418t;
import hd.InterfaceC14405f;

/* loaded from: classes6.dex */
final class G extends InterfaceC14405f.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f198a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5233k f199b;

    G(Object obj, C5233k c5233k) {
        this.f198a = obj;
        this.f199b = c5233k;
    }

    @Override // hd.InterfaceC14405f
    public final void i6(Status status) {
        C14418t.b(status, this.f198a, this.f199b);
    }
}
