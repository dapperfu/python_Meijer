package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.info;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes11.dex */
public final class h extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f121089a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Object obj, i iVar) {
        super(obj);
        this.f121089a = iVar;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.j(property, "property");
        if (Intrinsics.e(obj, obj2)) {
            return;
        }
        this.f121089a.b();
    }
}
