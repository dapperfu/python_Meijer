package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.h4;
import org.json.JSONException;

/* loaded from: classes8.dex */
class s1 extends h4 {
    protected s1(h4.a aVar) throws JSONException {
        super(aVar);
        AnalyticsBridge.getInstance().reportInternalErrorEvent(aVar.a(), aVar.b());
    }
}
