package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.Map;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13527a implements Map.Entry {
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        M m10 = (M) this;
        sb2.append(m10.getKey());
        sb2.append("=");
        sb2.append(m10.getValue());
        return sb2.toString();
    }
}
