package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.io.Serializable;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13396c extends AbstractC13398e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final C13396c f126233a = new C13396c();

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.AbstractC13398e
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.AbstractC13398e
    public final int a(Object obj) {
        return obj.hashCode();
    }
}
