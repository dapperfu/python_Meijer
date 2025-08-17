package com.launchdarkly.sdk.android;

import com.google.gson.JsonParseException;
import com.launchdarkly.sdk.android.LDFailure;
import java.lang.reflect.Type;

/* loaded from: classes7.dex */
class LDFailureSerialization implements com.google.gson.p<LDFailure>, com.google.gson.j<LDFailure> {
    @Override // com.google.gson.p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.gson.k a(LDFailure lDFailure, Type type, com.google.gson.o oVar) {
        if (lDFailure == null) {
            return null;
        }
        com.google.gson.m mVar = new com.google.gson.m();
        mVar.o("failureType", oVar.b(lDFailure.a()));
        mVar.r("message", lDFailure.getMessage());
        if (lDFailure instanceof LDInvalidResponseCodeFailure) {
            LDInvalidResponseCodeFailure lDInvalidResponseCodeFailure = (LDInvalidResponseCodeFailure) lDFailure;
            mVar.q("responseCode", Integer.valueOf(lDInvalidResponseCodeFailure.b()));
            mVar.p("retryable", Boolean.valueOf(lDInvalidResponseCodeFailure.c()));
        }
        return mVar;
    }

    LDFailureSerialization() {
    }

    @Override // com.google.gson.j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LDFailure deserialize(com.google.gson.k kVar, Type type, com.google.gson.i iVar) throws JsonParseException {
        com.google.gson.m mVarE = kVar.e();
        LDFailure.a aVar = (LDFailure.a) iVar.a(mVarE.t("failureType"), LDFailure.a.class);
        String strH = mVarE.u("message").h();
        if (aVar == LDFailure.a.UNEXPECTED_RESPONSE_CODE) {
            return new LDInvalidResponseCodeFailure(strH, mVarE.u("responseCode").s(), mVarE.u("retryable").q());
        }
        return new LDFailure(strH, aVar);
    }
}
