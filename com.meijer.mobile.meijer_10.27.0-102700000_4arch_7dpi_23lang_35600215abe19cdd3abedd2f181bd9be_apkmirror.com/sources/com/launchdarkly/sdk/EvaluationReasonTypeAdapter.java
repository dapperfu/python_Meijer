package com.launchdarkly.sdk;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.launchdarkly.sdk.EvaluationReason;
import java.io.IOException;

/* loaded from: classes7.dex */
final class EvaluationReasonTypeAdapter extends TypeAdapter<EvaluationReason> {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f90997a;

        static {
            int[] iArr = new int[EvaluationReason.Kind.values().length];
            f90997a = iArr;
            try {
                iArr[EvaluationReason.Kind.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90997a[EvaluationReason.Kind.FALLTHROUGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90997a[EvaluationReason.Kind.TARGET_MATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90997a[EvaluationReason.Kind.RULE_MATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90997a[EvaluationReason.Kind.PREREQUISITE_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90997a[EvaluationReason.Kind.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    EvaluationReasonTypeAdapter() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.launchdarkly.sdk.EvaluationReason a(com.google.gson.stream.JsonReader r12) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.launchdarkly.sdk.EvaluationReasonTypeAdapter.a(com.google.gson.stream.JsonReader):com.launchdarkly.sdk.EvaluationReason");
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public EvaluationReason read(JsonReader jsonReader) throws IOException {
        return a(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(JsonWriter jsonWriter, EvaluationReason evaluationReason) throws IOException {
        jsonWriter.beginObject();
        jsonWriter.name("kind");
        jsonWriter.value(evaluationReason.f().name());
        int i10 = a.f90997a[evaluationReason.f().ordinal()];
        if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        jsonWriter.name("errorKind");
                        jsonWriter.value(evaluationReason.e().name());
                    }
                } else {
                    jsonWriter.name("prerequisiteKey");
                    jsonWriter.value(evaluationReason.g());
                }
            } else {
                jsonWriter.name("ruleIndex");
                jsonWriter.value(evaluationReason.i());
                if (evaluationReason.h() != null) {
                    jsonWriter.name("ruleId");
                    jsonWriter.value(evaluationReason.h());
                }
                if (evaluationReason.j()) {
                    jsonWriter.name("inExperiment");
                    jsonWriter.value(evaluationReason.j());
                }
            }
        } else if (evaluationReason.j()) {
            jsonWriter.name("inExperiment");
            jsonWriter.value(evaluationReason.j());
        }
        if (evaluationReason.d() != null) {
            jsonWriter.name("bigSegmentsStatus");
            jsonWriter.value(evaluationReason.d().name());
        }
        jsonWriter.endObject();
    }
}
