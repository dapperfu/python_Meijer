package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class CustomParameter implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    private static final int f92357d = 89;

    /* renamed from: a, reason: collision with root package name */
    private String f92358a;

    /* renamed from: b, reason: collision with root package name */
    private Object f92359b;

    /* renamed from: c, reason: collision with root package name */
    private CustomParameterType f92360c;

    public enum CustomParameterType {
        TypeString,
        TypeInteger,
        TypeLong,
        TypeDouble,
        TypeFloat,
        TypeBoolean,
        TypeNull;

        protected static CustomParameterType fromString(String str) {
            CustomParameterType customParameterType = TypeString;
            if (customParameterType.name().equals(str)) {
                return customParameterType;
            }
            CustomParameterType customParameterType2 = TypeInteger;
            if (customParameterType2.name().equals(str)) {
                return customParameterType2;
            }
            CustomParameterType customParameterType3 = TypeLong;
            if (customParameterType3.name().equals(str)) {
                return customParameterType3;
            }
            CustomParameterType customParameterType4 = TypeDouble;
            if (customParameterType4.name().equals(str)) {
                return customParameterType4;
            }
            CustomParameterType customParameterType5 = TypeFloat;
            if (customParameterType5.name().equals(str)) {
                return customParameterType5;
            }
            CustomParameterType customParameterType6 = TypeBoolean;
            if (customParameterType6.name().equals(str)) {
                return customParameterType6;
            }
            CustomParameterType customParameterType7 = TypeNull;
            if (customParameterType7.name().equals(str)) {
                return customParameterType7;
            }
            return null;
        }

        protected static CustomParameterType parseType(Object obj) {
            if (obj == null) {
                return TypeNull;
            }
            if (obj instanceof String) {
                return TypeString;
            }
            if (obj instanceof Integer) {
                return TypeInteger;
            }
            if (obj instanceof Long) {
                return TypeLong;
            }
            if (obj instanceof Double) {
                return TypeDouble;
            }
            if (obj instanceof Float) {
                return TypeFloat;
            }
            if (obj instanceof Boolean) {
                return TypeBoolean;
            }
            return null;
        }

        public Object validateValueFromType(Object obj) {
            if (this == TypeNull) {
                return obj;
            }
            if (this == TypeString) {
                return obj.toString();
            }
            if (this == TypeInteger) {
                return Integer.valueOf((int) Double.valueOf(String.valueOf(obj)).longValue());
            }
            if (this == TypeLong) {
                return Long.valueOf(Double.valueOf(String.valueOf(obj)).longValue());
            }
            if (this == TypeDouble) {
                return Double.valueOf(String.valueOf(obj));
            }
            if (this == TypeFloat) {
                return Float.valueOf(String.valueOf(obj));
            }
            if (this != TypeBoolean) {
                return null;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.equalsIgnoreCase("true") || strValueOf.equalsIgnoreCase("1")) {
                return Boolean.TRUE;
            }
            if (strValueOf.equalsIgnoreCase("false") || strValueOf.equalsIgnoreCase("0")) {
                return Boolean.FALSE;
            }
            return null;
        }
    }

    public CustomParameter() {
    }

    protected CustomParameterType a() {
        return this.f92360c;
    }

    public String b() {
        return this.f92358a;
    }

    public Object c() {
        return this.f92359b;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof CustomParameter)) {
            return 1;
        }
        CustomParameter customParameter = (CustomParameter) obj;
        String str = this.f92358a;
        if (str == null) {
            return -1;
        }
        String str2 = customParameter.f92358a;
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    protected JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", l3.a((Object) this.f92358a));
            jSONObject.put(d7.f92647c, l3.a(this.f92360c));
            jSONObject.put("value", l3.a(this.f92359b));
            return jSONObject;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return jSONObject;
        }
    }

    protected String e() {
        return "Name: " + this.f92358a + " Value: " + this.f92359b;
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj instanceof CustomParameter)) {
            return false;
        }
        CustomParameter customParameter = (CustomParameter) obj;
        String str2 = this.f92358a;
        return (str2 == null || (str = customParameter.f92358a) == null || this.f92359b == null || customParameter.f92359b == null || !str2.equals(str) || !this.f92359b.equals(customParameter.f92359b)) ? false : true;
    }

    protected CustomParameter f() {
        this.f92359b = this.f92360c.validateValueFromType(this.f92359b);
        return this;
    }

    public int hashCode() {
        int iHashCode = super.hashCode() * f92357d;
        String str = this.f92358a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * f92357d;
        Object obj = this.f92359b;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "Name: " + this.f92358a + " Value: " + this.f92359b;
    }

    public CustomParameter(JSONObject jSONObject) {
        try {
            if (jSONObject.has("name") && !jSONObject.isNull("name")) {
                this.f92358a = jSONObject.getString("name");
            }
            if (jSONObject.has(d7.f92647c) && !jSONObject.isNull(d7.f92647c)) {
                this.f92360c = CustomParameterType.fromString(jSONObject.getString(d7.f92647c));
            }
            if (!jSONObject.has("value") || jSONObject.isNull("value")) {
                return;
            }
            this.f92359b = jSONObject.get("value");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    protected boolean a(Object obj) {
        CustomParameterType type = CustomParameterType.parseType(obj);
        if (type == null) {
            return false;
        }
        this.f92360c = type;
        this.f92359b = obj;
        return true;
    }

    protected boolean a(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            return false;
        }
        this.f92358a = str;
        return true;
    }
}
