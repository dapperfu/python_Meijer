package com.launchdarkly.sdk;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes8.dex */
final class EvaluationDetailTypeAdapterFactory implements v {

    static final class EvaluationDetailTypeAdapter<T> extends TypeAdapter<EvaluationDetail<T>> {

        /* renamed from: a, reason: collision with root package name */
        private final Gson f91832a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f91833b;

        EvaluationDetailTypeAdapter(Gson gson, Type type) {
            this.f91832a = gson;
            this.f91833b = type;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.launchdarkly.sdk.EvaluationDetail<T> read(com.google.gson.stream.JsonReader r7) throws com.google.gson.JsonSyntaxException, com.google.gson.JsonIOException, java.io.IOException, java.lang.NumberFormatException {
            /*
                r6 = this;
                r7.beginObject()
                r0 = 0
                r1 = -1
                r2 = r0
                r3 = r1
            L7:
                com.google.gson.stream.JsonToken r4 = r7.peek()
                com.google.gson.stream.JsonToken r5 = com.google.gson.stream.JsonToken.END_OBJECT
                if (r4 == r5) goto L59
                java.lang.String r4 = r7.nextName()
                r4.getClass()
                int r5 = r4.hashCode()
                switch(r5) {
                    case -934964668: goto L35;
                    case 79424127: goto L2a;
                    case 111972721: goto L1f;
                    default: goto L1d;
                }
            L1d:
                r4 = r1
                goto L3f
            L1f:
                java.lang.String r5 = "value"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L28
                goto L1d
            L28:
                r4 = 2
                goto L3f
            L2a:
                java.lang.String r5 = "variationIndex"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L33
                goto L1d
            L33:
                r4 = 1
                goto L3f
            L35:
                java.lang.String r5 = "reason"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L3e
                goto L1d
            L3e:
                r4 = 0
            L3f:
                switch(r4) {
                    case 0: goto L54;
                    case 1: goto L4f;
                    case 2: goto L46;
                    default: goto L42;
                }
            L42:
                r7.skipValue()
                goto L7
            L46:
                com.google.gson.Gson r0 = r6.f91832a
                java.lang.reflect.Type r4 = r6.f91833b
                java.lang.Object r0 = r0.k(r7, r4)
                goto L7
            L4f:
                int r3 = r7.nextInt()
                goto L7
            L54:
                com.launchdarkly.sdk.EvaluationReason r2 = com.launchdarkly.sdk.EvaluationReasonTypeAdapter.a(r7)
                goto L7
            L59:
                r7.endObject()
                if (r0 != 0) goto L68
                java.lang.reflect.Type r7 = r6.f91833b
                java.lang.Class<com.launchdarkly.sdk.LDValue> r1 = com.launchdarkly.sdk.LDValue.class
                if (r7 != r1) goto L68
                com.launchdarkly.sdk.LDValue r0 = com.launchdarkly.sdk.LDValue.u()
            L68:
                com.launchdarkly.sdk.EvaluationDetail r7 = com.launchdarkly.sdk.EvaluationDetail.b(r0, r3, r2)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.launchdarkly.sdk.EvaluationDetailTypeAdapterFactory.EvaluationDetailTypeAdapter.read(com.google.gson.stream.JsonReader):com.launchdarkly.sdk.EvaluationDetail");
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void write(JsonWriter jsonWriter, EvaluationDetail<T> evaluationDetail) throws JsonIOException, IOException {
            jsonWriter.beginObject();
            jsonWriter.name("value");
            if (evaluationDetail.d() == null) {
                jsonWriter.nullValue();
            } else {
                this.f91832a.C(evaluationDetail.d(), Object.class, jsonWriter);
            }
            if (!evaluationDetail.f()) {
                jsonWriter.name("variationIndex");
                jsonWriter.value(evaluationDetail.e());
            }
            jsonWriter.name("reason");
            this.f91832a.C(evaluationDetail.c(), EvaluationReason.class, jsonWriter);
            jsonWriter.endObject();
        }
    }

    EvaluationDetailTypeAdapterFactory() {
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        if (aVar.getType() instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) aVar.getType()).getActualTypeArguments();
            if (actualTypeArguments.length == 1) {
                return new EvaluationDetailTypeAdapter(gson, actualTypeArguments[0]);
            }
        }
        return new EvaluationDetailTypeAdapter(gson, LDValue.class);
    }
}
