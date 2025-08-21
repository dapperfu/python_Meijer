package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class g8<T> extends e8<T> implements x0 {

    /* renamed from: h, reason: collision with root package name */
    private h8 f92949h;

    /* renamed from: i, reason: collision with root package name */
    private h8 f92950i;

    /* renamed from: j, reason: collision with root package name */
    private u1.e f92951j;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92952a;

        static {
            int[] iArr = new int[u1.k.values().length];
            f92952a = iArr;
            try {
                iArr[u1.k.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92952a[u1.k.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    g8(JSONObject jSONObject) {
        try {
            if (jSONObject.has("right") && !jSONObject.isNull("right")) {
                this.f92949h = new h8(jSONObject.getJSONObject("right"));
            }
            if (jSONObject.has("left") && !jSONObject.isNull("left")) {
                this.f92950i = new h8(jSONObject.getJSONObject("left"));
            }
            if (!jSONObject.has("condition") || jSONObject.isNull("condition")) {
                return;
            }
            this.f92951j = u1.e.a(jSONObject.getString("condition"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected u1.e a() {
        return this.f92951j;
    }

    protected h8 b() {
        return this.f92950i;
    }

    protected h8 c() {
        return this.f92949h;
    }

    @Override // com.medallia.digital.mobilesdk.e8, com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            String jsonString = com.google.maps.android.BuildConfig.TRAVIS;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"right\":");
            h8 h8Var = this.f92949h;
            sb2.append(h8Var == null ? com.google.maps.android.BuildConfig.TRAVIS : h8Var.toJsonString());
            sb2.append(",\"left\":");
            h8 h8Var2 = this.f92950i;
            if (h8Var2 != null) {
                jsonString = h8Var2.toJsonString();
            }
            sb2.append(jsonString);
            sb2.append(",\"condition\":");
            u1.e eVar = this.f92951j;
            sb2.append(l3.c(eVar != null ? eVar.toString() : null));
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    private String c(String str, u1.k kVar) {
        int i10;
        return (str == null && kVar != null && ((i10 = a.f92952a[kVar.ordinal()]) == 1 || i10 == 2)) ? "0" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.medallia.digital.mobilesdk.e8
    public T a(ArrayList<c0> arrayList, ArrayList<c0> arrayList2, ArrayList<g6> arrayList3) throws NumberFormatException {
        Class<K> cls;
        super.a(arrayList, arrayList2, arrayList3);
        a4.b("TREV2 leftValue: " + this.f92950i.c() + " rightValue: " + this.f92949h.c() + " left.getType(): " + this.f92950i.b() + " condition: " + this.f92951j);
        String strC = c(a(this.f92950i.c(), this.f92950i.b()), this.f92950i.b());
        String strC2 = c(a(this.f92949h.c(), this.f92949h.b()), this.f92949h.b());
        String strA = a(this.f92950i.a(), strC, this.f92950i.b());
        String strA2 = a(this.f92949h.a(), strC2, this.f92949h.b());
        Object objA = a(strA, strA2, this.f92950i.b(), this.f92951j);
        a4.b("TREV2 leftValue: " + strA + " rightValue: " + strA2 + " left.getType(): " + this.f92950i.b() + " condition: " + this.f92951j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TREV2 result: ");
        sb2.append(objA);
        a4.b(sb2.toString());
        if (objA == null) {
            return null;
        }
        if (objA instanceof Long) {
            cls = Long.class;
        } else {
            if (!(objA instanceof Boolean)) {
                return null;
            }
            cls = Boolean.class;
        }
        return (T) a(objA, cls);
    }
}
