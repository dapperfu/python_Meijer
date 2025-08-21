package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes12.dex */
public final class m1 extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f122989a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(Boolean bool, n1 n1Var) {
        super(bool);
        this.f122989a = n1Var;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.j(property, "property");
        if (Intrinsics.e(obj, obj2)) {
            return;
        }
        ((Boolean) obj2).getClass();
        this.f122989a.c();
    }
}
