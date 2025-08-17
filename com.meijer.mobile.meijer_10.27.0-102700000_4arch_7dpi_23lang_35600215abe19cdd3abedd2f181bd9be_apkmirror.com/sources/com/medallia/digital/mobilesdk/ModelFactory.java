package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class ModelFactory {
    private static ModelFactory modelFactory;

    ModelFactory() {
    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private boolean validate(C11566b c11566b) {
        h4.a aVar;
        if (c11566b.c() == null) {
            aVar = h4.a.f92164o;
        } else if (c11566b.d() == -1) {
            aVar = h4.a.f92165p;
        } else if (c11566b.b() == -1) {
            aVar = h4.a.f92166q;
        } else if (c11566b.e() == -1) {
            aVar = h4.a.f92167r;
        } else {
            if (c11566b.a() != null) {
                return true;
            }
            aVar = h4.a.f92168s;
        }
        a4.f(aVar.toString());
        return false;
    }

    private void validateConfiguration(ConfigurationContract configurationContract) throws SecurityException {
        if (configurationContract != null) {
            configurationContract.validateFields();
        } else {
            a4.f(h4.a.f92174y.toString());
        }
    }

    private void validateFeedback(a2 a2Var) {
        if (a2Var == null || a2Var.a() == null) {
            a4.f(h4.a.f92126H.toString());
        }
    }

    private void validatePropertyConfiguration(PropertyConfigurationContract propertyConfigurationContract) throws SecurityException {
        if (propertyConfigurationContract != null) {
            propertyConfigurationContract.validateFields();
        } else {
            a4.f(h4.a.f92174y.toString());
        }
    }

    protected C11566b createAccessToken(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            } catch (Exception e10) {
                a4.c(h4.a.f92163n + e10.getMessage());
            }
            str = jSONObject.has("accessToken") ? jSONObject.get("accessToken").toString() : null;
            C11566b c11566b = new C11566b(str);
            c11566b.a(str);
            if (validate(c11566b)) {
                return c11566b;
            }
        }
        a4.c(h4.a.f92163n.toString());
        return null;
    }

    protected n createApiToken(String str) {
        if (TextUtils.isEmpty(str)) {
            a4.f(h4.a.f92148d.toString());
        } else {
            try {
                n nVar = new n(str);
                nVar.a(str);
                if (validate(nVar)) {
                    return nVar;
                }
                return null;
            } catch (Exception e10) {
                a4.c(h4.a.f92148d + e10.getMessage());
            }
        }
        return null;
    }

    protected ConfigurationContract createConfiguration(String str) {
        try {
            ConfigurationContract configurationContract = new ConfigurationContract(new JSONObject(str));
            validateConfiguration(configurationContract);
            return configurationContract;
        } catch (Exception e10) {
            a4.c(h4.a.f92174y + e10.getMessage());
            return null;
        }
    }

    protected EvaluationResult createEvaluationResult(String str) {
        if (str != null && !str.equals(com.google.maps.android.BuildConfig.TRAVIS)) {
            try {
                return new EvaluationResult(new JSONObject(str));
            } catch (Exception e10) {
                a4.f(e10.getMessage());
            }
        }
        return null;
    }

    protected a2 createFeedback(String str) {
        try {
            a2 a2Var = new a2(new JSONObject(str));
            validateFeedback(a2Var);
            return a2Var;
        } catch (Exception e10) {
            a4.c(h4.a.f92126H + e10.getMessage());
            return null;
        }
    }

    protected b2 createFeedbackContract(String str) {
        try {
            return new b2(new JSONObject(str));
        } catch (Exception e10) {
            a4.c(h4.a.f92130L + e10.getMessage());
            return null;
        }
    }

    protected PropertyConfigurationContract createPropertyConfiguration(String str) {
        try {
            PropertyConfigurationContract propertyConfigurationContract = new PropertyConfigurationContract(new JSONObject(str));
            validatePropertyConfiguration(propertyConfigurationContract);
            return propertyConfigurationContract;
        } catch (Exception e10) {
            a4.c(h4.a.f92174y + e10.getMessage());
            return null;
        }
    }

    public f6 createQuarantineValidation(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new f6(new JSONObject(str));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
            return null;
        }
    }

    protected TargetRuleEngineContract createTargetRuleEngine(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new TargetRuleEngineContract(new JSONObject(str));
        } catch (Exception e10) {
            a4.f(e10.getMessage());
            return null;
        }
    }

    protected r7 createThankYouDataObject(String str) {
        r7 r7Var = new r7();
        if (str != null) {
            try {
                return new r7(new JSONObject(str).getJSONObject("settings").getJSONObject("formMobileThankYouPromptSettingsContract"));
            } catch (Exception e10) {
                a4.f(e10.getMessage());
            }
        }
        return r7Var;
    }

    protected c8 createTransitionType(String str) throws JSONException {
        String string;
        if (str != null) {
            try {
                string = new JSONObject(str).getJSONObject("settings").getJSONObject("formBasicSettings").getString("transitionType");
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        } else {
            string = null;
        }
        return c8.a(string);
    }

    protected ConfigurationUUID createUUID(String str) {
        try {
            return new ConfigurationUUID(new JSONObject(str));
        } catch (Exception e10) {
            a4.c(h4.a.f92170u + e10.getMessage());
            return null;
        }
    }

    protected String customParameterContractsToJsonString(List<c1> list) {
        if (list == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).toJsonString());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    protected JSONArray customParametersToJsonArray(ArrayList<CustomParameter> arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator<CustomParameter> it = arrayList.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectD = it.next().d();
            if (jSONObjectD != null) {
                jSONArray.put(jSONObjectD);
            }
        }
        return jSONArray;
    }

    protected String getAnalyticsAsJsonString(List<k> list) {
        if (list == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).toJsonString());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    protected List<AppRatingContract> getAppRatingContractsArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(new AppRatingContract(jSONArray.getJSONObject(i10)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return arrayList;
    }

    protected String getAppRatingsAsJsonString(List<AppRatingContract> list) {
        if (list == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).toJsonString());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    public String getCUuid(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("uuid") || jSONObject.isNull("uuid")) {
                return null;
            }
            return jSONObject.getString("uuid");
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return null;
        }
    }

    protected ArrayList<Component> getComponentsArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<Component> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(new Component(jSONArray.getJSONObject(i10)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return arrayList;
    }

    protected <T> ArrayList<T> getContractArray(String str, JSONArray jSONArray) throws NoSuchMethodException, SecurityException {
        if (jSONArray == null) {
            return null;
        }
        ArgumentList argumentList = (ArrayList<T>) new ArrayList();
        try {
            Constructor<?> constructor = Class.forName(str).getConstructor(JSONObject.class);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    argumentList.add(constructor.newInstance(jSONArray.getJSONObject(i10)));
                } catch (JSONException e10) {
                    a4.c(e10.getMessage());
                }
            }
            return argumentList;
        } catch (Exception e11) {
            a4.c(e11.getMessage());
            return argumentList;
        }
    }

    protected <K> String getContractsAsJsonString(List<K> list) {
        if (list == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (int i10 = 0; i10 < list.size(); i10++) {
                sb2.append(((x0) list.get(i10)).toJsonString());
                if (i10 < list.size() - 1) {
                    sb2.append(',');
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
    }

    protected ArrayList<CustomParameter> getCustomParameterArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<CustomParameter> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(new CustomParameter(jSONArray.getJSONObject(i10)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return arrayList;
    }

    protected ArrayList<c1> getCustomParameterContractArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<c1> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(new c1(jSONArray.getJSONObject(i10)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return arrayList;
    }

    List<SDKConfigurationFormContract> getFormContractsArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(new SDKConfigurationFormContract(jSONArray.getJSONObject(i10)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return arrayList;
    }

    protected String getFormsAsJsonString(List<SDKConfigurationFormContract> list) {
        if (list == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).toJsonString());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    protected ArrayList<t5> getPageArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<t5> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(new t5(jSONArray.getJSONObject(i10)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return arrayList;
    }

    protected String getProvisionsAsJsonString(HashMap<String, Boolean> map) {
        if (map == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        ArrayList arrayList = new ArrayList(map.keySet());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                sb2.append("\"");
                sb2.append((String) arrayList.get(i10));
                sb2.append("\":");
                sb2.append(map.get(arrayList.get(i10)));
                if (i10 < arrayList.size() - 1) {
                    sb2.append(',');
                }
            } catch (Exception e10) {
                a4.c(e10.getMessage());
                return "{}";
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    protected List<ResourceContract> getResourcesArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(new ResourceContract(jSONArray.getJSONObject(i10)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return arrayList;
    }

    protected String getResourcesAsJsonString(List<ResourceContract> list) {
        if (list == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).toJsonString());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    protected ArrayList<p6> getRuleConversionContract(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<p6> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(new p6(jSONArray.getJSONObject(i10)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return arrayList;
    }

    protected String getRuleConversionsAsJsonString(List<p6> list) {
        if (list == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).toJsonString());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    public ArrayList<g6> getRulesArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<g6> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(new g6(jSONArray.getJSONObject(i10)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return arrayList;
    }

    protected ArrayList<String> getStringArray(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(jSONArray.getString(i10));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return arrayList;
    }

    protected String getStringArrayAsJsonString(ArrayList<String> arrayList) {
        if (arrayList == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) == null) {
                sb2.append(com.google.maps.android.BuildConfig.TRAVIS);
            } else {
                sb2.append("\"");
                sb2.append(arrayList.get(i10));
                sb2.append("\"");
            }
            if (i10 < arrayList.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    protected HashMap<String, Boolean> getStringBooleanMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, Boolean> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                map.put(next, jSONObject.isNull(next) ? null : Boolean.valueOf(jSONObject.getBoolean(next)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return map;
    }

    protected HashMap<String, Long> getStringLongMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, Long> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                map.put(next, jSONObject.isNull(next) ? null : Long.valueOf(jSONObject.getLong(next)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return map;
    }

    protected String getStringLongMapAsJsonString(HashMap<String, Long> map) {
        if (map == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        ArrayList arrayList = new ArrayList(map.keySet());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                sb2.append("\"");
                sb2.append((String) arrayList.get(i10));
                sb2.append("\":\"");
                sb2.append(map.get(arrayList.get(i10)));
                sb2.append("\"");
                if (i10 < arrayList.size() - 1) {
                    sb2.append(',');
                }
            } catch (Exception e10) {
                a4.c(e10.getMessage());
                return "{}";
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    protected HashMap<String, String> getStringMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                map.put(next, jSONObject.isNull(next) ? null : jSONObject.getString(next));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return map;
    }

    protected String getStringMapAsJsonString(HashMap<String, String> map) {
        if (map == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        ArrayList arrayList = new ArrayList(map.keySet());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                sb2.append("\"");
                sb2.append((String) arrayList.get(i10));
                sb2.append("\":\"");
                sb2.append(map.get(arrayList.get(i10)));
                sb2.append("\"");
                if (i10 < arrayList.size() - 1) {
                    sb2.append(',');
                }
            } catch (Exception e10) {
                a4.c(e10.getMessage());
                return "{}";
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    protected HashMap<String, t7> getStringThemeMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, t7> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                map.put(next, jSONObject.isNull(next) ? null : new t7(jSONObject.getJSONObject(next)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return map;
    }

    protected String getThemesMapAsJsonString(HashMap<String, t7> map) {
        if (map == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        ArrayList arrayList = new ArrayList(map.keySet());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                sb2.append("\"");
                sb2.append((String) arrayList.get(i10));
                sb2.append("\":");
                sb2.append(map.get(arrayList.get(i10)).b());
                if (i10 < arrayList.size() - 1) {
                    sb2.append(',');
                }
            } catch (Exception e10) {
                a4.c(e10.getMessage());
                return "{}";
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    protected <T> e8<T> getTriggerChildContract(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has("left") ? new g8(jSONObject) : new f8(jSONObject);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return null;
        }
    }

    protected <T> ArrayList<e8<T>> getTriggerChildesContract(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList<e8<T>> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(jSONArray.getJSONObject(i10).has("left") ? new g8<>(jSONArray.getJSONObject(i10)) : new f8<>(jSONArray.getJSONObject(i10)));
            } catch (JSONException e10) {
                a4.c(e10.getMessage());
            }
        }
        return arrayList;
    }

    public String rulesAsJsoString(List<g6> list) {
        if (list == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).toJsonString());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    private boolean validate(n nVar) {
        h4.a aVar;
        if (TextUtils.isEmpty(nVar.b())) {
            aVar = h4.a.f92154g;
        } else if (nVar.c() == -1) {
            aVar = h4.a.f92150e;
        } else {
            if (!TextUtils.isEmpty(nVar.a())) {
                return true;
            }
            aVar = h4.a.f92152f;
        }
        a4.f(aVar.toString());
        return false;
    }
}
