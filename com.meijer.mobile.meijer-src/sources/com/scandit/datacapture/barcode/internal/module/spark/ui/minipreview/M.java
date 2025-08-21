package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes12.dex */
public final class M extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f124123a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Integer num, N n10) {
        super(num);
        this.f124123a = n10;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.j(property, "property");
        if (Intrinsics.e(obj, obj2)) {
            return;
        }
        this.f124123a.d();
    }
}
