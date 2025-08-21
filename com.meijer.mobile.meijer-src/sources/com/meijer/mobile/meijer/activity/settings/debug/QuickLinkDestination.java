package com.meijer.mobile.meijer.activity.settings.debug;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/debug/e0;", "", "", "activity", "actionCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.settings.debug.e0, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class QuickLinkDestination {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String activity;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String actionCode;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickLinkDestination)) {
            return false;
        }
        QuickLinkDestination quickLinkDestination = (QuickLinkDestination) other;
        return Intrinsics.e(this.activity, quickLinkDestination.activity) && Intrinsics.e(this.actionCode, quickLinkDestination.actionCode);
    }

    public int hashCode() {
        String str = this.activity;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.actionCode.hashCode();
    }

    public String toString() {
        return "QuickLinkDestination(activity=" + this.activity + ", actionCode=" + this.actionCode + ')';
    }

    public QuickLinkDestination(String str, String actionCode) {
        Intrinsics.j(actionCode, "actionCode");
        this.activity = str;
        this.actionCode = actionCode;
    }

    /* renamed from: a, reason: from getter */
    public final String getActionCode() {
        return this.actionCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getActivity() {
        return this.activity;
    }
}
