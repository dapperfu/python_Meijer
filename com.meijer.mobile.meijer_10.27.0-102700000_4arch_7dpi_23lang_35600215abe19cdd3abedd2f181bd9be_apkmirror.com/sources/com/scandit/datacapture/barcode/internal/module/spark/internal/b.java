package com.scandit.datacapture.barcode.internal.module.spark.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* loaded from: classes11.dex */
public final class b implements x, w {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f122932c = {com.scandit.datacapture.barcode.ar.ui.annotations.a.a(b.class, "value", "getValue()Ljava/lang/Object;", 0)};

    /* renamed from: a, reason: collision with root package name */
    public final a f122933a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f122934b;

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.x
    public final void a(Object obj) {
        this.f122933a.setValue(this, f122932c[0], obj);
    }

    public final f a(x listener) {
        Intrinsics.j(listener, "listener");
        if (this.f122934b.contains(listener)) {
            return null;
        }
        this.f122934b.add(listener);
        listener.a(this.f122933a.getValue(this, f122932c[0]));
        return new f(new e(this, listener));
    }

    public b(Object obj) {
        Delegates delegates = Delegates.f142874a;
        this.f122933a = new a(obj, this);
        this.f122934b = new ArrayList();
    }
}
