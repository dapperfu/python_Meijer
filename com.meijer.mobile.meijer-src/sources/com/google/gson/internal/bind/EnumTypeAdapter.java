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
import og.InterfaceC16127c;

/* loaded from: classes8.dex */
class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

    /* renamed from: d, reason: collision with root package name */
    static final v f90358d = new v() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, T> f90359a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, T> f90360b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<T, String> f90361c;

    private EnumTypeAdapter(Class<T> cls) throws SecurityException {
        this.f90359a = new HashMap();
        this.f90360b = new HashMap();
        this.f90361c = new HashMap();
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
                InterfaceC16127c interfaceC16127c = (InterfaceC16127c) field2.getAnnotation(InterfaceC16127c.class);
                if (interfaceC16127c != null) {
                    strName = interfaceC16127c.value();
                    for (String str : interfaceC16127c.alternate()) {
                        this.f90359a.put(str, r42);
                    }
                }
                this.f90359a.put(strName, r42);
                this.f90360b.put(string, r42);
                this.f90361c.put(r42, strName);
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
        T t10 = this.f90359a.get(strNextString);
        return t10 == null ? this.f90360b.get(strNextString) : t10;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, T t10) throws IOException {
        jsonWriter.value(t10 == null ? null : this.f90361c.get(t10));
    }
}
