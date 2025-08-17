package com.meijer.mobile.serverapi.util;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.H;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.reflect.a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class RuntimeTypeAdapterFactory<T> implements v {
    private final Class<?> baseType;
    private String defaultLabel;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    private final String typeFieldName;

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k createJsonElementForDefaultLabel() {
        return (k) new Gson().o("{\"" + this.typeFieldName + ":\"=\"" + this.defaultLabel + "\"}", k.class);
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    @Override // com.google.gson.v
    public <R> TypeAdapter<R> create(Gson gson, a<R> aVar) {
        if (aVar == null || !this.baseType.isAssignableFrom(aVar.c())) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            TypeAdapter<T> typeAdapterS = gson.s(this, a.a(entry.getValue()));
            linkedHashMap.put(entry.getKey(), typeAdapterS);
            linkedHashMap2.put(entry.getValue(), typeAdapterS);
        }
        return new TypeAdapter<R>() { // from class: com.meijer.mobile.serverapi.util.RuntimeTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            public R read(JsonReader jsonReader) throws JsonParseException, IOException {
                k kVarA = H.a(jsonReader);
                k kVarT = kVarA.e().t(RuntimeTypeAdapterFactory.this.typeFieldName);
                if (kVarT != null) {
                    String strH = kVarT.h();
                    if (!linkedHashMap.containsKey(strH)) {
                        if (RuntimeTypeAdapterFactory.this.defaultLabel != null) {
                            strH = RuntimeTypeAdapterFactory.this.defaultLabel;
                            kVarA = RuntimeTypeAdapterFactory.this.createJsonElementForDefaultLabel();
                        } else {
                            throw new RuntimeException("The json object being returned is not a registered subtype. To handle unknown subtypes please call registerDefaultSubtype in the set up of the factory.");
                        }
                    }
                    return (R) ((TypeAdapter) linkedHashMap.get(strH)).fromJsonTree(kVarA);
                }
                throw new JsonParseException("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, R r10) throws IOException {
                Class<?> cls = r10.getClass();
                String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                if (typeAdapter != null) {
                    m mVarE = typeAdapter.toJsonTree(r10).e();
                    if (!mVarE.v(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                        m mVar = new m();
                        mVar.o(RuntimeTypeAdapterFactory.this.typeFieldName, new n(str));
                        for (Map.Entry<String, k> entry2 : mVarE.s()) {
                            mVar.o(entry2.getKey(), entry2.getValue());
                        }
                        H.b(mVar, jsonWriter);
                        return;
                    }
                    throw new JsonParseException("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                throw new JsonParseException("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
            }
        }.nullSafe();
    }

    public RuntimeTypeAdapterFactory<T> registerDefaultSubtype(Class<? extends T> cls, String str) {
        if (this.defaultLabel != null) {
            throw new RuntimeException("Can only register one DefaultSubType");
        }
        this.defaultLabel = str;
        return registerSubtype(cls, str);
    }

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str != null && cls != null) {
            this.baseType = cls;
            this.typeFieldName = str;
            return;
        }
        throw null;
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
