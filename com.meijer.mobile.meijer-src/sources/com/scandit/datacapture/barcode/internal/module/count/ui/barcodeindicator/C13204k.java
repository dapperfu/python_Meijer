package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13204k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13212t f122395a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13204k(C13212t c13212t) {
        super(0);
        this.f122395a = c13212t;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        G g10 = this.f122395a.f122425q;
        for (E e10 : g10.f122322b.values()) {
            Iterator it = e10.f122318e.iterator();
            while (it.hasNext()) {
                L l10 = (L) it.next();
                ViewParent parent = l10.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(l10);
                }
            }
            e10.f122318e.clear();
        }
        g10.f122322b.clear();
        return Unit.f143329a;
    }
}
