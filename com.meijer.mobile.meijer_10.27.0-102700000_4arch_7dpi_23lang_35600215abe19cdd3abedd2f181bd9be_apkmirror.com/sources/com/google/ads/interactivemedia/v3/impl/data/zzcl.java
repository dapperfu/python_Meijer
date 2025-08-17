package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.zzwj;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzcl implements UiElement {
    public static final zzwj<zzcl> GSON_TYPE_ADAPTER = new zzck();
    private final String name;

    public zzcl(String str) {
        this.name = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.UiElement
    public String getName() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzcl)) {
            return this.name.equals(((zzcl) obj).name);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.name});
    }

    public String toString() {
        return "UiElementImpl[name=" + this.name + "]";
    }
}
