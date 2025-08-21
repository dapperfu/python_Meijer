package com.scandit.datacapture.tools.internal.module.mapmaker;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13531e {
    public abstract int a(Object obj);

    public abstract boolean a(Object obj, Object obj2);

    public final boolean b(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }
}
