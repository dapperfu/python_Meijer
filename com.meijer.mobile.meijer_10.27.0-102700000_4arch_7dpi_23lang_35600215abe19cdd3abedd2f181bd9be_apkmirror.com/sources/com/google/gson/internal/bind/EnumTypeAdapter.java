package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import mg.InterfaceC15617c;

/* loaded from: classes7.dex */
class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

    /* renamed from: d, reason: collision with root package name */
    static final v f89516d = new v() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> clsC = aVar.c();
            if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                return null;
            }
            if (!clsC.isEnum()) {
                clsC = clsC.getSuperclass();
            }
            return new EnumTypeAdapter(clsC);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, T> f89517a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, T> f89518b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<T, String> f89519c;

    private EnumTypeAdapter(Class<T> cls) throws SecurityException {
        this.f89517a = new HashMap();
        this.f89518b = new HashMap();
        this.f89519c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                InterfaceC15617c interfaceC15617c = (InterfaceC15617c) field2.getAnnotation(InterfaceC15617c.class);
                if (interfaceC15617c != null) {
                    strName = interfaceC15617c.value();
                    for (String str : interfaceC15617c.alternate()) {
                        this.f89517a.put(str, r42);
                    }
                }
                this.f89517a.put(strName, r42);
                this.f89518b.put(string, r42);
                this.f89519c.put(r42, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        T t10 = this.f89517a.get(strNextString);
        return t10 == null ? this.f89518b.get(strNextString) : t10;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        jsonWriter.value(t10 == null ? null : this.f89519c.get(t10));
    }
}
