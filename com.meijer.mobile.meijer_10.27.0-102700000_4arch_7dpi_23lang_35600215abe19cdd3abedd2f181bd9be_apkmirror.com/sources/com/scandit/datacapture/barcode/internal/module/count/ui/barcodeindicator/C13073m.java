package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13073m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13079t f121445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f121447c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13073m(C13079t c13079t, boolean z10, boolean z11) {
        super(0);
        this.f121445a = c13079t;
        this.f121446b = z10;
        this.f121447c = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        G g10 = this.f121445a.f121473q;
        boolean z10 = this.f121446b;
        boolean z11 = this.f121447c;
        g10.f121371c = z10;
        for (L l10 : SequencesKt.H(CollectionsKt.f0(g10.f121370b.values()), F.f121368a)) {
            if (!g10.f121376h.f121346a) {
                if (z10) {
                    l10.getClass();
                    L.b(l10, false);
                    l10.b(z11);
                    l10.a(z11);
                } else if (g10.f121375g == com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f121819b) {
                    L.b(l10.f121389b, z11);
                    l10.f121390c.a(z11);
                } else {
                    l10.getClass();
                    L.a(l10, false);
                }
            }
        }
        return Unit.f142422a;
    }
}
