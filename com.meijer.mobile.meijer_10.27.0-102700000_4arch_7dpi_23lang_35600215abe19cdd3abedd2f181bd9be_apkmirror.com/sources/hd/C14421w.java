package hd;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.InterfaceC5227e;

/* renamed from: hd.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C14421w implements InterfaceC5227e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5233k f134714a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C14422x f134715b;

    C14421w(C14422x c14422x, C5233k c5233k) {
        this.f134715b = c14422x;
        this.f134714a = c5233k;
    }

    @Override // Td.InterfaceC5227e
    public final void onComplete(AbstractC5232j abstractC5232j) {
        this.f134715b.f134717b.remove(this.f134714a);
    }
}
