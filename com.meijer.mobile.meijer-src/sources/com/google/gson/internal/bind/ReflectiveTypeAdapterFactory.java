package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.d;
import com.google.gson.internal.D;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.F;
import com.google.gson.internal.G;
import com.google.gson.internal.I;
import com.google.gson.r;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.v;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import og.InterfaceC16126b;
import og.InterfaceC16127c;
import qg.C16666a;

/* loaded from: classes8.dex */
public final class ReflectiveTypeAdapterFactory implements v {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.gson.internal.v f90383a;

    /* renamed from: b, reason: collision with root package name */
    private final d f90384b;

    /* renamed from: c, reason: collision with root package name */
    private final Excluder f90385c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f90386d;

    /* renamed from: e, reason: collision with root package name */
    private final List<r> f90387e;

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {

        /* renamed from: a, reason: collision with root package name */
        private final c f90389a;

        abstract A a();

        abstract T b(A a10);

        abstract void c(A a10, JsonReader jsonReader, b bVar) throws IllegalAccessException, IOException;

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, T t10) throws IOException {
            if (t10 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator<b> it = this.f90389a.f90407b.iterator();
                while (it.hasNext()) {
                    it.next().c(jsonWriter, t10);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e10) {
                throw C16666a.e(e10);
            }
        }

        Adapter(c cVar) {
            this.f90389a = cVar;
        }

        @Override // com.google.gson.TypeAdapter
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            A a10 = a();
            Map<String, b> map = this.f90389a.f90406a;
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    b bVar = map.get(jsonReader.nextName());
                    if (bVar == null) {
                        jsonReader.skipValue();
                    } else {
                        c(a10, jsonReader, bVar);
                    }
                }
                jsonReader.endObject();
                return b(a10);
            } catch (IllegalAccessException e10) {
                throw C16666a.e(e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }
    }

    private static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: b, reason: collision with root package name */
        private final D<T> f90390b;

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        T b(T t10) {
            return t10;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        T a() {
            return this.f90390b.a();
        }

        FieldReflectionAdapter(D<T> d10, c cVar) {
            super(cVar);
            this.f90390b = d10;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        void c(T t10, JsonReader jsonReader, b bVar) throws IllegalAccessException, IOException {
            bVar.b(jsonReader, t10);
        }
    }

    private static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: e, reason: collision with root package name */
        static final Map<Class<?>, Object> f90391e = f();

        /* renamed from: b, reason: collision with root package name */
        private final Constructor<T> f90392b;

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f90393c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<String, Integer> f90394d;

        private static Map<Class<?>, Object> f() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object[] a() {
            return (Object[]) this.f90393c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public T b(Object[] objArr) {
            try {
                return this.f90392b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw C16666a.e(e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + C16666a.c(this.f90392b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + C16666a.c(this.f90392b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + C16666a.c(this.f90392b) + "' with args " + Arrays.toString(objArr), e13.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void c(Object[] objArr, JsonReader jsonReader, b bVar) throws JsonParseException, IOException {
            Integer num = this.f90394d.get(bVar.f90404c);
            if (num != null) {
                bVar.a(jsonReader, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + C16666a.c(this.f90392b) + "' for field with name '" + bVar.f90404c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }

        RecordAdapter(Class<T> cls, c cVar, boolean z10) throws JsonIOException, SecurityException {
            super(cVar);
            this.f90394d = new HashMap();
            Constructor<T> constructorI = C16666a.i(cls);
            this.f90392b = constructorI;
            if (z10) {
                ReflectiveTypeAdapterFactory.b(null, constructorI);
            } else {
                C16666a.o(constructorI);
            }
            String[] strArrK = C16666a.k(cls);
            for (int i10 = 0; i10 < strArrK.length; i10++) {
                this.f90394d.put(strArrK[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.f90392b.getParameterTypes();
            this.f90393c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f90393c[i11] = f90391e.get(parameterTypes[i11]);
            }
        }
    }

    class a extends b {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f90395d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Method f90396e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TypeAdapter f90397f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ TypeAdapter f90398g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f90399h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f90400i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Field field, boolean z10, Method method, TypeAdapter typeAdapter, TypeAdapter typeAdapter2, boolean z11, boolean z12) {
            super(str, field);
            this.f90395d = z10;
            this.f90396e = method;
            this.f90397f = typeAdapter;
            this.f90398g = typeAdapter2;
            this.f90399h = z11;
            this.f90400i = z12;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void a(JsonReader jsonReader, int i10, Object[] objArr) throws JsonParseException, IOException {
            Object obj = this.f90398g.read(jsonReader);
            if (obj != null || !this.f90399h) {
                objArr[i10] = obj;
                return;
            }
            throw new JsonParseException("null is not allowed as value for record component '" + this.f90404c + "' of primitive type; at path " + jsonReader.getPath());
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void b(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException {
            Object obj2 = this.f90398g.read(jsonReader);
            if (obj2 == null && this.f90399h) {
                return;
            }
            if (this.f90395d) {
                ReflectiveTypeAdapterFactory.b(obj, this.f90403b);
            } else if (this.f90400i) {
                throw new JsonIOException("Cannot set value of 'static final' " + C16666a.g(this.f90403b, false));
            }
            this.f90403b.set(obj, obj2);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void c(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
            Object objInvoke;
            if (this.f90395d) {
                Method method = this.f90396e;
                if (method == null) {
                    ReflectiveTypeAdapterFactory.b(obj, this.f90403b);
                } else {
                    ReflectiveTypeAdapterFactory.b(obj, method);
                }
            }
            Method method2 = this.f90396e;
            if (method2 != null) {
                try {
                    objInvoke = method2.invoke(obj, null);
                } catch (InvocationTargetException e10) {
                    throw new JsonIOException("Accessor " + C16666a.g(this.f90396e, false) + " threw exception", e10.getCause());
                }
            } else {
                objInvoke = this.f90403b.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            jsonWriter.name(this.f90402a);
            this.f90397f.write(jsonWriter, objInvoke);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <M extends AccessibleObject & Member> void b(Object obj, M m10) {
        if (Modifier.isStatic(m10.getModifiers())) {
            obj = null;
        }
        if (G.a(m10, obj)) {
            return;
        }
        throw new JsonIOException(C16666a.g(m10, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        final String f90402a;

        /* renamed from: b, reason: collision with root package name */
        final Field f90403b;

        /* renamed from: c, reason: collision with root package name */
        final String f90404c;

        abstract void a(JsonReader jsonReader, int i10, Object[] objArr) throws JsonParseException, IOException;

        abstract void b(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

        abstract void c(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;

        protected b(String str, Field field) {
            this.f90402a = str;
            this.f90403b = field;
            this.f90404c = field.getName();
        }
    }

    private static class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f90405c = new c(Collections.EMPTY_MAP, Collections.EMPTY_LIST);

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, b> f90406a;

        /* renamed from: b, reason: collision with root package name */
        public final List<b> f90407b;

        public c(Map<String, b> map, List<b> list) {
            this.f90406a = map;
            this.f90407b = list;
        }
    }

    private static IllegalArgumentException d(Class<?> cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + C16666a.f(field) + " and " + C16666a.f(field2) + "\nSee " + I.a("duplicate-fields"));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c e(com.google.gson.Gson r20, com.google.gson.reflect.a<?> r21, java.lang.Class<?> r22, boolean r23, boolean r24) throws com.google.gson.JsonIOException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.e(com.google.gson.Gson, com.google.gson.reflect.a, java.lang.Class, boolean, boolean):com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$c");
    }

    private List<String> f(Field field) {
        String strB;
        List<String> listA;
        InterfaceC16127c interfaceC16127c = (InterfaceC16127c) field.getAnnotation(InterfaceC16127c.class);
        if (interfaceC16127c == null) {
            strB = this.f90384b.b(field);
            listA = this.f90384b.a(field);
        } else {
            String strValue = interfaceC16127c.value();
            List<String> listAsList = Arrays.asList(interfaceC16127c.alternate());
            strB = strValue;
            listA = listAsList;
        }
        if (listA.isEmpty()) {
            return Collections.singletonList(strB);
        }
        ArrayList arrayList = new ArrayList(listA.size() + 1);
        arrayList.add(strB);
        arrayList.addAll(listA);
        return arrayList;
    }

    private boolean g(Field field, boolean z10) {
        return !this.f90385c.c(field, z10);
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.v vVar, d dVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<r> list) {
        this.f90383a = vVar;
        this.f90384b = dVar;
        this.f90385c = excluder;
        this.f90386d = jsonAdapterAnnotationTypeAdapterFactory;
        this.f90387e = list;
    }

    private b c(Gson gson, Field field, Method method, String str, com.google.gson.reflect.a<?> aVar, boolean z10, boolean z11) {
        boolean z12;
        TypeAdapter<?> typeAdapterQ;
        TypeAdapter<?> typeAdapter;
        TypeAdapter<?> typeAdapterRuntimeTypeWrapper;
        boolean zA = F.a(aVar.getRawType());
        int modifiers = field.getModifiers();
        boolean z13 = false;
        boolean z14 = true;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z12 = false;
            z13 = true;
        } else {
            z12 = false;
        }
        InterfaceC16126b interfaceC16126b = (InterfaceC16126b) field.getAnnotation(InterfaceC16126b.class);
        if (interfaceC16126b != null) {
            typeAdapterQ = this.f90386d.c(this.f90383a, gson, aVar, interfaceC16126b, false);
        } else {
            typeAdapterQ = null;
        }
        if (typeAdapterQ == null) {
            z14 = z12;
        }
        if (typeAdapterQ == null) {
            typeAdapterQ = gson.q(aVar);
        }
        TypeAdapter<?> typeAdapter2 = typeAdapterQ;
        if (z10) {
            if (z14) {
                typeAdapterRuntimeTypeWrapper = typeAdapter2;
            } else {
                typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper<>(gson, typeAdapter2, aVar.getType());
            }
            typeAdapter = typeAdapterRuntimeTypeWrapper;
        } else {
            typeAdapter = typeAdapter2;
        }
        return new a(str, field, z11, method, typeAdapter, typeAdapter2, zA, z13);
    }

    @Override // com.google.gson.v
    public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
        boolean z10;
        Class<? super T> rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        if (C16666a.l(rawType)) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.1
                public String toString() {
                    return "AnonymousOrNonStaticLocalClassAdapter";
                }

                @Override // com.google.gson.TypeAdapter
                public T read(JsonReader jsonReader) throws IOException {
                    jsonReader.skipValue();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void write(JsonWriter jsonWriter, T t10) throws IOException {
                    jsonWriter.nullValue();
                }
            };
        }
        r.a aVarB = G.b(this.f90387e, rawType);
        if (aVarB != r.a.BLOCK_ALL) {
            if (aVarB == r.a.BLOCK_INACCESSIBLE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (C16666a.m(rawType)) {
                return new RecordAdapter(rawType, e(gson, aVar, rawType, z10, true), z10);
            }
            return new FieldReflectionAdapter(this.f90383a.w(aVar, true), e(gson, aVar, rawType, z10, false));
        }
        throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
