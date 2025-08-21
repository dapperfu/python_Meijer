package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.io.Serializable;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13529c extends AbstractC13531e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final C13529c f127185a = new C13529c();

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.AbstractC13531e
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.AbstractC13531e
    public final int a(Object obj) {
        return obj.hashCode();
    }
}
