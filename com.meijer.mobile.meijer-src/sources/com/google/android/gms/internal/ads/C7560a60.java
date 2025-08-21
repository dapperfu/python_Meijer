package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.a60, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7560a60 {

    /* renamed from: a, reason: collision with root package name */
    public final int f73200a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73201b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73202c;

    public C7560a60(int i10, int i11, boolean z10) {
        this.f73200a = i10;
        this.f73201b = i11;
        this.f73202c = z10;
    }

    static List a(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            boolean zNextBoolean = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if ("width".equals(strNextName)) {
                    iNextInt = jsonReader.nextInt();
                } else if ("height".equals(strNextName)) {
                    iNextInt2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(strNextName)) {
                    zNextBoolean = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new C7560a60(iNextInt, iNextInt2, zNextBoolean));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
