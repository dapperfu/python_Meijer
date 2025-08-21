package com.scandit.datacapture.core.internal.sdk.common.graphics;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeTextureBinding {
    final int target;
    final int texture;

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeTextureBinding)) {
            return false;
        }
        NativeTextureBinding nativeTextureBinding = (NativeTextureBinding) obj;
        return this.target == nativeTextureBinding.target && this.texture == nativeTextureBinding.texture;
    }

    public int getTarget() {
        return this.target;
    }

    public int getTexture() {
        return this.texture;
    }

    public int hashCode() {
        return ((this.target + 527) * 31) + this.texture;
    }

    public String toString() {
        return "NativeTextureBinding{target=" + this.target + ",texture=" + this.texture + "}";
    }

    public NativeTextureBinding(int i10, int i11) {
        this.target = i10;
        this.texture = i11;
    }
}
