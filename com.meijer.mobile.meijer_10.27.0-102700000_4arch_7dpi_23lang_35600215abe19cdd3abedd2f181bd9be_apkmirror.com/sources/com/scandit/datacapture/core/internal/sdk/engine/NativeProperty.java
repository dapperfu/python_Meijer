package com.scandit.datacapture.core.internal.sdk.engine;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeProperty {
    final String clients;
    final NativePropertyDataBool dataBool;
    final NativePropertyDataFloat dataFloat;
    final NativePropertyDataInt dataInt;
    final NativePropertyDataString dataString;
    final String description;
    final String name;
    final NativePropertyType type;

    public String getClients() {
        return this.clients;
    }

    public NativePropertyDataBool getDataBool() {
        return this.dataBool;
    }

    public NativePropertyDataFloat getDataFloat() {
        return this.dataFloat;
    }

    public NativePropertyDataInt getDataInt() {
        return this.dataInt;
    }

    public NativePropertyDataString getDataString() {
        return this.dataString;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public NativePropertyType getType() {
        return this.type;
    }

    public String toString() {
        return "NativeProperty{name=" + this.name + ",description=" + this.description + ",clients=" + this.clients + ",type=" + this.type + ",dataInt=" + this.dataInt + ",dataString=" + this.dataString + ",dataBool=" + this.dataBool + ",dataFloat=" + this.dataFloat + "}";
    }

    public NativeProperty(String str, String str2, String str3, NativePropertyType nativePropertyType, NativePropertyDataInt nativePropertyDataInt, NativePropertyDataString nativePropertyDataString, NativePropertyDataBool nativePropertyDataBool, NativePropertyDataFloat nativePropertyDataFloat) {
        this.name = str;
        this.description = str2;
        this.clients = str3;
        this.type = nativePropertyType;
        this.dataInt = nativePropertyDataInt;
        this.dataString = nativePropertyDataString;
        this.dataBool = nativePropertyDataBool;
        this.dataFloat = nativePropertyDataFloat;
    }
}
