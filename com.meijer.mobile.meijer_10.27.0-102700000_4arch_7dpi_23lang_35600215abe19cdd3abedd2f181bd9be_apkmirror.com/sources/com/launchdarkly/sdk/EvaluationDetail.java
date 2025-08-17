package com.launchdarkly.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import mg.InterfaceC15616b;

@InterfaceC15616b(EvaluationDetailTypeAdapterFactory.class)
/* loaded from: classes7.dex */
public final class EvaluationDetail<T> implements com.launchdarkly.sdk.json.c {
    private static final Iterable<EvaluationDetail<?>> BOOLEAN_SINGLETONS = a();
    public static final int NO_VARIATION = -1;
    private final EvaluationReason reason;
    private final T value;
    private final int variationIndex;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EvaluationDetail) {
            EvaluationDetail evaluationDetail = (EvaluationDetail) obj;
            if (Objects.equals(this.reason, evaluationDetail.reason) && this.variationIndex == evaluationDetail.variationIndex && Objects.equals(this.value, evaluationDetail.value)) {
                return true;
            }
        }
        return false;
    }

    private static Iterable<EvaluationDetail<?>> a() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 2; i10++) {
            int i11 = 0;
            while (i11 < 2) {
                int i12 = 0;
                while (i12 < 2) {
                    for (int i13 = 0; i13 < 2; i13++) {
                        Object objT = i13 == 0 ? LDValue.t(i12 == 1) : Boolean.valueOf(i12 == 1);
                        int i14 = i12 == 0 ? i10 : 1 - i10;
                        arrayList.add(new EvaluationDetail(objT, i14, i14 == i11 ? EvaluationReason.k() : EvaluationReason.b()));
                    }
                    i12++;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public static <T> EvaluationDetail<T> b(T t10, int i10, EvaluationReason evaluationReason) {
        if (t10 != null && (t10.getClass() == Boolean.class || t10.getClass() == LDValueBool.class)) {
            Iterator<EvaluationDetail<?>> it = BOOLEAN_SINGLETONS.iterator();
            while (it.hasNext()) {
                EvaluationDetail<T> evaluationDetail = (EvaluationDetail) it.next();
                if (((EvaluationDetail) evaluationDetail).value == t10 && ((EvaluationDetail) evaluationDetail).variationIndex == i10 && ((EvaluationDetail) evaluationDetail).reason == evaluationReason) {
                    return evaluationDetail;
                }
            }
        }
        return new EvaluationDetail<>(t10, i10, evaluationReason);
    }

    public EvaluationReason c() {
        return this.reason;
    }

    public T d() {
        return this.value;
    }

    public int e() {
        return this.variationIndex;
    }

    public boolean f() {
        return this.variationIndex < 0;
    }

    public int hashCode() {
        return Objects.hash(this.reason, Integer.valueOf(this.variationIndex), this.value);
    }

    public String toString() {
        return "{" + this.value + "," + this.variationIndex + "," + this.reason + "}";
    }

    private EvaluationDetail(T t10, int i10, EvaluationReason evaluationReason) {
        this.value = t10;
        this.variationIndex = i10 < 0 ? -1 : i10;
        this.reason = evaluationReason;
    }
}
