package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.B;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: c, reason: collision with root package name */
    private static final v f90378c = b(t.f90552a);

    /* renamed from: a, reason: collision with root package name */
    private final Gson f90379a;

    /* renamed from: b, reason: collision with root package name */
    private final u f90380b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f90382a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f90382a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f90382a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f90382a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f90382a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f90382a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f90382a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private ObjectTypeAdapter(Gson gson, u uVar) {
        this.f90379a = gson;
        this.f90380b = uVar;
    }

    public static v a(u uVar) {
        return uVar == t.f90552a ? f90378c : b(uVar);
    }

    private static v b(final u uVar) {
        return new v() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.v
            public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
                if (aVar.getRawType() != Object.class) {
                    return null;
                }
                return new ObjectTypeAdapter(gson, uVar);
            }
        };
    }

    private Object c(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = a.f90382a[jsonToken.ordinal()];
        if (i10 == 3) {
            return jsonReader.nextString();
        }
        if (i10 == 4) {
            return this.f90380b.a(jsonReader);
        }
        if (i10 == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i10 == 6) {
            jsonReader.nextNull();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    private Object d(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i10 = a.f90382a[jsonToken.ordinal()];
        if (i10 == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new B();
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapterR = this.f90379a.r(obj.getClass());
        if (!(typeAdapterR instanceof ObjectTypeAdapter)) {
            typeAdapterR.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(JsonReader jsonReader) throws IOException {
        String strNextName;
        boolean z10;
        JsonToken jsonTokenPeek = jsonReader.peek();
        Object objD = d(jsonReader, jsonTokenPeek);
        if (objD == null) {
            return c(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                if (objD instanceof Map) {
                    strNextName = jsonReader.nextName();
                } else {
                    strNextName = null;
                }
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                Object objD2 = d(jsonReader, jsonTokenPeek2);
                if (objD2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (objD2 == null) {
                    objD2 = c(jsonReader, jsonTokenPeek2);
                }
                if (objD instanceof List) {
                    ((List) objD).add(objD2);
                } else {
                    ((Map) objD).put(strNextName, objD2);
                }
                if (z10) {
                    arrayDeque.addLast(objD);
                    objD = objD2;
                }
            } else {
                if (objD instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return objD;
                }
                objD = arrayDeque.removeLast();
            }
        }
    }
}
