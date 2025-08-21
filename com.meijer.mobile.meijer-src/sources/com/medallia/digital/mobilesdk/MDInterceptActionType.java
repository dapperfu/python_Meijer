package com.medallia.digital.mobilesdk;

/* loaded from: classes8.dex */
public enum MDInterceptActionType {
    accepted,
    declined,
    skipped,
    deferred;

    public static MDInterceptActionType fromString(String str) {
        if (str == null) {
            return null;
        }
        MDInterceptActionType mDInterceptActionType = accepted;
        if (mDInterceptActionType.name().equals(str.toLowerCase())) {
            return mDInterceptActionType;
        }
        MDInterceptActionType mDInterceptActionType2 = declined;
        if (mDInterceptActionType2.name().equals(str.toLowerCase())) {
            return mDInterceptActionType2;
        }
        MDInterceptActionType mDInterceptActionType3 = skipped;
        if (mDInterceptActionType3.name().equals(str.toLowerCase())) {
            return mDInterceptActionType3;
        }
        MDInterceptActionType mDInterceptActionType4 = deferred;
        if (mDInterceptActionType4.name().equals(str.toLowerCase())) {
            return mDInterceptActionType4;
        }
        return null;
    }
}
