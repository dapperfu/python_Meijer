package com.launchdarkly.sdk.android;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.launchdarkly.sdk.json.SerializationException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes8.dex */
final class J {

    /* renamed from: a, reason: collision with root package name */
    final List<b> f91912a;

    class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return Long.compare(bVar.f91915b, bVar2.f91915b);
        }
    }

    J() {
        this(new ArrayList());
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final String f91914a;

        /* renamed from: b, reason: collision with root package name */
        final long f91915b;

        b(String str, long j10) {
            this.f91914a = str;
            this.f91915b = j10;
        }
    }

    J(List<b> list) {
        this.f91912a = list == null ? new ArrayList<>() : list;
    }

    public static J a(String str) throws SerializationException {
        ArrayList arrayList = new ArrayList();
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                jsonReader.beginArray();
                if (jsonReader.hasNext()) {
                    String strNextString = jsonReader.nextString();
                    if (jsonReader.hasNext()) {
                        arrayList.add(new b(strNextString, jsonReader.nextLong()));
                    }
                }
                while (jsonReader.hasNext()) {
                }
                jsonReader.endArray();
            }
            jsonReader.endArray();
            return new J(arrayList);
        } catch (Exception e10) {
            throw new SerializationException(e10);
        }
    }

    public J b(int i10, List<String> list) {
        if (this.f91912a.size() <= i10 || i10 < 0) {
            return this;
        }
        List<b> list2 = this.f91912a;
        b[] bVarArr = (b[]) list2.toArray(new b[list2.size()]);
        Arrays.sort(bVarArr, new a());
        ArrayList arrayList = new ArrayList(Arrays.asList(bVarArr));
        int size = arrayList.size() - i10;
        for (int i11 = 0; i11 < size; i11++) {
            list.add(((b) arrayList.get(0)).f91914a);
            arrayList.remove(0);
        }
        return new J(arrayList);
    }

    public String c() {
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.beginArray();
            for (b bVar : this.f91912a) {
                jsonWriter.beginArray();
                jsonWriter.value(bVar.f91914a);
                jsonWriter.value(bVar.f91915b);
                jsonWriter.endArray();
            }
            jsonWriter.endArray();
            jsonWriter.flush();
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public J d(String str, long j10) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.f91912a) {
            if (!bVar.f91914a.equals(str)) {
                arrayList.add(bVar);
            }
        }
        arrayList.add(new b(str, j10));
        return new J(arrayList);
    }
}
