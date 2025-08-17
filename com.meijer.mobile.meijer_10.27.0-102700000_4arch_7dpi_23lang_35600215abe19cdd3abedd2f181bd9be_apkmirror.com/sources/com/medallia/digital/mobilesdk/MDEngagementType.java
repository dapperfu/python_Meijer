package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
public enum MDEngagementType {
    form,
    appRating;

    protected static MDEngagementType fromString(String str) {
        MDEngagementType mDEngagementType = form;
        if (mDEngagementType.name().equals(str)) {
            return mDEngagementType;
        }
        MDEngagementType mDEngagementType2 = appRating;
        if (mDEngagementType2.name().equals(str)) {
            return mDEngagementType2;
        }
        return null;
    }
}
