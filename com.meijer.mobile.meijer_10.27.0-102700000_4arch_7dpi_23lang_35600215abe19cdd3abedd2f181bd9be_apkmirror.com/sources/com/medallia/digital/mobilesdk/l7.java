package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class l7 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private f8<Boolean> f92512a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<v1<Boolean>> f92513b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<v1<Long>> f92514c;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<v1<Boolean>> f92515d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<v1<Long>> f92516e;

    /* renamed from: f, reason: collision with root package name */
    private HashMap<String, Long> f92517f;

    public l7(JSONObject jSONObject) {
        try {
            if (jSONObject.has("preEvaluation") && !jSONObject.isNull("preEvaluation")) {
                this.f92512a = new f8<>(jSONObject.getJSONObject("preEvaluation"));
            }
            if (jSONObject.has("triggerRules") && !jSONObject.isNull("triggerRules")) {
                this.f92513b = ModelFactory.getInstance().getContractArray(v1.class.getName(), jSONObject.getJSONArray("triggerRules"));
            }
            if (jSONObject.has("nextEvaluationTime") && !jSONObject.isNull("nextEvaluationTime")) {
                this.f92514c = ModelFactory.getInstance().getContractArray(v1.class.getName(), jSONObject.getJSONArray("nextEvaluationTime"));
            }
            if (jSONObject.has("backgroundTriggerRules") && !jSONObject.isNull("backgroundTriggerRules")) {
                this.f92515d = ModelFactory.getInstance().getContractArray(v1.class.getName(), jSONObject.getJSONArray("backgroundTriggerRules"));
            }
            if (jSONObject.has("backgroundNextEvaluationTime") && !jSONObject.isNull("backgroundNextEvaluationTime")) {
                this.f92516e = ModelFactory.getInstance().getContractArray(v1.class.getName(), jSONObject.getJSONArray("backgroundNextEvaluationTime"));
            }
            if (!jSONObject.has("backgroundDelay") || jSONObject.isNull("backgroundDelay")) {
                return;
            }
            this.f92517f = ModelFactory.getInstance().getStringLongMap(jSONObject.getJSONObject("backgroundDelay"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    public HashMap<String, Long> a() {
        return this.f92517f;
    }

    public ArrayList<v1<Long>> b() {
        return this.f92516e;
    }

    public ArrayList<v1<Boolean>> c() {
        return this.f92515d;
    }

    protected ArrayList<v1<Long>> d() {
        return this.f92514c;
    }

    protected f8<Boolean> e() {
        return this.f92512a;
    }

    protected ArrayList<v1<Boolean>> f() {
        return this.f92513b;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            String jsonString = com.google.maps.android.BuildConfig.TRAVIS;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"preEvaluation\":");
            f8<Boolean> f8Var = this.f92512a;
            if (f8Var != null) {
                jsonString = f8Var.toJsonString();
            }
            sb2.append(jsonString);
            sb2.append(",\"triggerRules\":");
            sb2.append(ModelFactory.getInstance().getContractsAsJsonString(this.f92513b));
            sb2.append(",\"nextEvaluationTime\":");
            sb2.append(ModelFactory.getInstance().getContractsAsJsonString(this.f92514c));
            sb2.append(",\"backgroundTriggerRules\":");
            sb2.append(ModelFactory.getInstance().getContractsAsJsonString(this.f92515d));
            sb2.append(",\"backgroundNextEvaluationTime\":");
            sb2.append(ModelFactory.getInstance().getContractsAsJsonString(this.f92516e));
            sb2.append(",\"backgroundNextEvaluationTime\":");
            sb2.append(ModelFactory.getInstance().getStringLongMapAsJsonString(this.f92517f));
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
