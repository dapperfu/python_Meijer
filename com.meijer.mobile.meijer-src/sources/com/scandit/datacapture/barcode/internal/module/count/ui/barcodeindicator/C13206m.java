package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13206m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13212t f122397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f122399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13206m(C13212t c13212t, boolean z10, boolean z11) {
        super(0);
        this.f122397a = c13212t;
        this.f122398b = z10;
        this.f122399c = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        G g10 = this.f122397a.f122425q;
        boolean z10 = this.f122398b;
        boolean z11 = this.f122399c;
        g10.f122323c = z10;
        for (L l10 : SequencesKt.H(CollectionsKt.f0(g10.f122322b.values()), F.f122320a)) {
            if (!g10.f122328h.f122298a) {
                if (z10) {
                    l10.getClass();
                    L.b(l10, false);
                    l10.b(z11);
                    l10.a(z11);
                } else if (g10.f122327g == com.scandit.datacapture.barcode.internal.module.count.ui.status.n.f122771b) {
                    L.b(l10.f122341b, z11);
                    l10.f122342c.a(z11);
                } else {
                    l10.getClass();
                    L.a(l10, false);
                }
            }
        }
        return Unit.f143329a;
    }
}
