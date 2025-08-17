package com.scandit.datacapture.barcode.internal.module.spark.internal;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes11.dex */
public final class a extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f122931a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, b bVar) {
        super(obj);
        this.f122931a = bVar;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.j(property, "property");
        if (Intrinsics.e(obj2, obj)) {
            return;
        }
        b bVar = this.f122931a;
        Iterator it = bVar.f122934b.iterator();
        while (it.hasNext()) {
            ((x) it.next()).a(bVar.f122933a.getValue(bVar, b.f122932c[0]));
        }
    }
}
