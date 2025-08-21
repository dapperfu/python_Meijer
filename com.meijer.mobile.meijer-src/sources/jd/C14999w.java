package jd;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.InterfaceC5511e;

/* renamed from: jd.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C14999w implements InterfaceC5511e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5517k f140403a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C15000x f140404b;

    C14999w(C15000x c15000x, C5517k c5517k) {
        this.f140404b = c15000x;
        this.f140403a = c5517k;
    }

    @Override // Vd.InterfaceC5511e
    public final void onComplete(AbstractC5516j abstractC5516j) {
        this.f140404b.f140406b.remove(this.f140403a);
    }
}
