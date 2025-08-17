package com.scandit.datacapture.core.common.feedback;

import android.content.res.Resources;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/ResourceSound;", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "", "resourceId", "<init>", "(I)V", "", "toJson", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getResourceId", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ResourceSound extends Sound {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int resourceId;

    public ResourceSound(int i10) {
        super(null);
        this.resourceId = i10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResourceSound) && this.resourceId == ((ResourceSound) other).resourceId;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    public int hashCode() {
        return this.resourceId;
    }

    @Override // com.scandit.datacapture.core.common.feedback.Sound
    public String toJson() throws JSONException, Resources.NotFoundException {
        JSONObject jSONObject = new JSONObject();
        String resourceEntryName = AppAndroidEnvironment.INSTANCE.getApplicationContext().getResources().getResourceEntryName(this.resourceId);
        Intrinsics.i(resourceEntryName, "getResourceEntryName(...)");
        jSONObject.put("resource", resourceEntryName);
        String string = jSONObject.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }
}
