package com.scandit.datacapture.core.common.feedback;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/AssetSound;", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "", "assetName", "<init>", "(Ljava/lang/String;)V", "toJson", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getAssetName", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class AssetSound extends Sound {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String assetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetSound(String assetName) {
        super(null);
        Intrinsics.j(assetName, "assetName");
        this.assetName = assetName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AssetSound) {
            return Intrinsics.e(this.assetName, ((AssetSound) other).assetName);
        }
        return false;
    }

    public final String getAssetName() {
        return this.assetName;
    }

    public int hashCode() {
        return this.assetName.hashCode();
    }

    @Override // com.scandit.datacapture.core.common.feedback.Sound
    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resource", this.assetName);
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }
}
