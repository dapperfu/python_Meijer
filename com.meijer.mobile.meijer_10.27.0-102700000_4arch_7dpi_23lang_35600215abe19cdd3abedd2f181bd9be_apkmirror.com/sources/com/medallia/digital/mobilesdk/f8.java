package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class f8<T> extends e8<T> implements x0 {

    /* renamed from: h, reason: collision with root package name */
    private u1.f f92042h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<e8<T>> f92043i;

    public f8(JSONObject jSONObject) {
        try {
            if (jSONObject.has("conjunction") && !jSONObject.isNull("conjunction")) {
                this.f92042h = u1.f.a(jSONObject.getString("conjunction"));
            }
            if (!jSONObject.has("childrenCriteria") || jSONObject.isNull("childrenCriteria")) {
                return;
            }
            this.f92043i = ModelFactory.getInstance().getTriggerChildesContract(jSONObject.getJSONArray("childrenCriteria"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    private T c(ArrayList<c0> arrayList, ArrayList<c0> arrayList2, ArrayList<g6> arrayList3) {
        long jMin;
        Iterator<e8<T>> it = this.f92043i.iterator();
        Long lValueOf = null;
        while (it.hasNext()) {
            T tA = it.next().a(arrayList, arrayList2, arrayList3);
            if (tA != null) {
                Long l10 = (Long) tA;
                long jLongValue = l10.longValue();
                if (lValueOf == null) {
                    lValueOf = l10;
                }
                u1.f fVar = this.f92042h;
                if (fVar == u1.f.MIN) {
                    jMin = Math.min(lValueOf.longValue(), jLongValue);
                } else if (fVar == u1.f.MAX) {
                    jMin = Math.max(lValueOf.longValue(), jLongValue);
                }
                lValueOf = Long.valueOf(jMin);
            }
        }
        if (lValueOf == null) {
            return null;
        }
        return (T) a(lValueOf, Long.class);
    }

    @Override // com.medallia.digital.mobilesdk.e8
    public T a(ArrayList<c0> arrayList, ArrayList<c0> arrayList2, ArrayList<g6> arrayList3) {
        u1.f fVar;
        super.a(arrayList, arrayList2, arrayList3);
        if (this.f92043i == null || (fVar = this.f92042h) == null) {
            return null;
        }
        if (fVar == u1.f.OR || fVar == u1.f.AND) {
            return b(arrayList, arrayList2, arrayList3);
        }
        if (fVar == u1.f.MIN || fVar == u1.f.MAX) {
            return c(arrayList, arrayList2, arrayList3);
        }
        return null;
    }

    protected u1.f b() {
        return this.f92042h;
    }

    @Override // com.medallia.digital.mobilesdk.e8, com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"conjunction\":");
            u1.f fVar = this.f92042h;
            sb2.append(l3.c(fVar != null ? fVar.toString() : null));
            sb2.append(",\"childrenCriteria\":");
            sb2.append(ModelFactory.getInstance().getContractsAsJsonString(this.f92043i));
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    private T b(ArrayList<c0> arrayList, ArrayList<c0> arrayList2, ArrayList<g6> arrayList3) {
        Boolean bool;
        if (this.f92043i.isEmpty()) {
            bool = Boolean.TRUE;
        } else {
            Iterator<e8<T>> it = this.f92043i.iterator();
            while (true) {
                if (it.hasNext()) {
                    boolean zBooleanValue = ((Boolean) it.next().a(arrayList, arrayList2, arrayList3)).booleanValue();
                    u1.f fVar = this.f92042h;
                    if (fVar != u1.f.OR) {
                        if (fVar == u1.f.AND && !zBooleanValue) {
                            break;
                        }
                    } else if (zBooleanValue) {
                        break;
                    }
                } else {
                    u1.f fVar2 = this.f92042h;
                    if (fVar2 != u1.f.OR) {
                        if (fVar2 != u1.f.AND) {
                            return null;
                        }
                    }
                }
            }
            bool = Boolean.FALSE;
        }
        return (T) a(bool, Boolean.class);
    }

    protected ArrayList<e8<T>> a() {
        return this.f92043i;
    }
}
