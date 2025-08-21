package com.scandit.datacapture.barcode.internal.module.spark.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* loaded from: classes12.dex */
public final class b implements x, w {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f123884c = {com.scandit.datacapture.barcode.ar.ui.annotations.a.a(b.class, "value", "getValue()Ljava/lang/Object;", 0)};

    /* renamed from: a, reason: collision with root package name */
    public final a f123885a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f123886b;

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.x
    public final void a(Object obj) {
        this.f123885a.setValue(this, f123884c[0], obj);
    }

    public final f a(x listener) {
        Intrinsics.j(listener, "listener");
        if (this.f123886b.contains(listener)) {
            return null;
        }
        this.f123886b.add(listener);
        listener.a(this.f123885a.getValue(this, f123884c[0]));
        return new f(new e(this, listener));
    }

    public b(Object obj) {
        Delegates delegates = Delegates.f143781a;
        this.f123885a = new a(obj, this);
        this.f123886b = new ArrayList();
    }
}
