package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13074n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13079t f121448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121449b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13074n(C13079t c13079t, boolean z10) {
        super(0);
        this.f121448a = c13079t;
        this.f121449b = z10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Collection<L> collectionValues = this.f121448a.f121474r.values();
        boolean z10 = this.f121449b;
        for (L l10 : collectionValues) {
            L.b(l10.f121391d, z10);
            if (l10.a() == J.f121382a) {
                l10.f121390c.a(false, z10);
            }
        }
        G g10 = this.f121448a.f121473q;
        boolean z11 = this.f121449b;
        g10.getClass();
        g10.f121376h = new A(true, z11);
        return Unit.f142422a;
    }
}
