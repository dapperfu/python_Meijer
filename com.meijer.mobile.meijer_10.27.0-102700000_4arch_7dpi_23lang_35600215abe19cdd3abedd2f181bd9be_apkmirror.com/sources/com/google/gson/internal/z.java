package com.google.gson.internal;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class z {
    public static volatile z INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
