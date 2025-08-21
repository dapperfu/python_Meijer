package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/OneSignalTopic;", "", "tagKey", "", "tagValue", "(Ljava/lang/String;Ljava/lang/String;)V", "getTagKey", "()Ljava/lang/String;", "getTagValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OneSignalTopic {

    @InterfaceC16127c("tag_key")
    private final String tagKey;

    @InterfaceC16127c("tag_value")
    private final String tagValue;

    public static /* synthetic */ OneSignalTopic copy$default(OneSignalTopic oneSignalTopic, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = oneSignalTopic.tagKey;
        }
        if ((i10 & 2) != 0) {
            str2 = oneSignalTopic.tagValue;
        }
        return oneSignalTopic.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTagKey() {
        return this.tagKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTagValue() {
        return this.tagValue;
    }

    public final OneSignalTopic copy(String tagKey, String tagValue) {
        Intrinsics.j(tagKey, "tagKey");
        Intrinsics.j(tagValue, "tagValue");
        return new OneSignalTopic(tagKey, tagValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OneSignalTopic)) {
            return false;
        }
        OneSignalTopic oneSignalTopic = (OneSignalTopic) other;
        return Intrinsics.e(this.tagKey, oneSignalTopic.tagKey) && Intrinsics.e(this.tagValue, oneSignalTopic.tagValue);
    }

    public int hashCode() {
        return this.tagValue.hashCode() + (this.tagKey.hashCode() * 31);
    }

    public String toString() {
        return "OneSignalTopic(tagKey=" + this.tagKey + ", tagValue=" + this.tagValue + ')';
    }

    public OneSignalTopic(String tagKey, String tagValue) {
        Intrinsics.j(tagKey, "tagKey");
        Intrinsics.j(tagValue, "tagValue");
        this.tagKey = tagKey;
        this.tagValue = tagValue;
    }

    public final String getTagKey() {
        return this.tagKey;
    }

    public final String getTagValue() {
        return this.tagValue;
    }
}
