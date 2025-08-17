package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.l, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13072l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13079t f121444a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13072l(C13079t c13079t) {
        super(0);
        this.f121444a = c13079t;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        G g10 = this.f121444a.f121473q;
        for (E e10 : g10.f121370b.values()) {
            Iterator it = e10.f121366e.iterator();
            while (it.hasNext()) {
                L l10 = (L) it.next();
                ViewParent parent = l10.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(l10);
                }
            }
            e10.f121366e.clear();
        }
        g10.f121370b.clear();
        return Unit.f142422a;
    }
}
