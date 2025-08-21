package com.radiusnetworks.flybuy.api.model;

import com.radiusnetworks.flybuy.api.mapbox.model.a;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/PushTopic;", "", PreferencesHelper.PREF_ID, "", "type", "", "topic", "timeZone", "pushServicesTopics", "Lcom/radiusnetworks/flybuy/api/model/PushServicesTopics;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/PushServicesTopics;)V", "getId", "()J", "getPushServicesTopics", "()Lcom/radiusnetworks/flybuy/api/model/PushServicesTopics;", "getTimeZone", "()Ljava/lang/String;", "getTopic", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PushTopic {
    private final long id;

    @InterfaceC16127c("push_services_topics")
    private final PushServicesTopics pushServicesTopics;

    @InterfaceC16127c("timezone")
    private final String timeZone;
    private final String topic;

    @InterfaceC16127c("push_topic_type")
    private final String type;

    public static /* synthetic */ PushTopic copy$default(PushTopic pushTopic, long j10, String str, String str2, String str3, PushServicesTopics pushServicesTopics, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = pushTopic.id;
        }
        long j11 = j10;
        if ((i10 & 2) != 0) {
            str = pushTopic.type;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = pushTopic.topic;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = pushTopic.timeZone;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            pushServicesTopics = pushTopic.pushServicesTopics;
        }
        return pushTopic.copy(j11, str4, str5, str6, pushServicesTopics);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* renamed from: component5, reason: from getter */
    public final PushServicesTopics getPushServicesTopics() {
        return this.pushServicesTopics;
    }

    public final PushTopic copy(long id2, String type, String topic, String timeZone, PushServicesTopics pushServicesTopics) {
        Intrinsics.j(type, "type");
        Intrinsics.j(topic, "topic");
        Intrinsics.j(pushServicesTopics, "pushServicesTopics");
        return new PushTopic(id2, type, topic, timeZone, pushServicesTopics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushTopic)) {
            return false;
        }
        PushTopic pushTopic = (PushTopic) other;
        return this.id == pushTopic.id && Intrinsics.e(this.type, pushTopic.type) && Intrinsics.e(this.topic, pushTopic.topic) && Intrinsics.e(this.timeZone, pushTopic.timeZone) && Intrinsics.e(this.pushServicesTopics, pushTopic.pushServicesTopics);
    }

    public String toString() {
        return "PushTopic(id=" + this.id + ", type=" + this.type + ", topic=" + this.topic + ", timeZone=" + this.timeZone + ", pushServicesTopics=" + this.pushServicesTopics + ')';
    }

    public PushTopic(long j10, String type, String topic, String str, PushServicesTopics pushServicesTopics) {
        Intrinsics.j(type, "type");
        Intrinsics.j(topic, "topic");
        Intrinsics.j(pushServicesTopics, "pushServicesTopics");
        this.id = j10;
        this.type = type;
        this.topic = topic;
        this.timeZone = str;
        this.pushServicesTopics = pushServicesTopics;
    }

    public final long getId() {
        return this.id;
    }

    public final PushServicesTopics getPushServicesTopics() {
        return this.pushServicesTopics;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = a.a(this.topic, a.a(this.type, Long.hashCode(this.id) * 31, 31), 31);
        String str = this.timeZone;
        return this.pushServicesTopics.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }
}
