package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13207n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13212t f122400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f122401b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13207n(C13212t c13212t, boolean z10) {
        super(0);
        this.f122400a = c13212t;
        this.f122401b = z10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Collection<L> collectionValues = this.f122400a.f122426r.values();
        boolean z10 = this.f122401b;
        for (L l10 : collectionValues) {
            L.b(l10.f122343d, z10);
            if (l10.a() == J.f122334a) {
                l10.f122342c.a(false, z10);
            }
        }
        G g10 = this.f122400a.f122425q;
        boolean z11 = this.f122401b;
        g10.getClass();
        g10.f122328h = new A(true, z11);
        return Unit.f143329a;
    }
}
