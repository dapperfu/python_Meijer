package com.meijer.mobile.greenville.model.response.picklist;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJH\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/greenville/model/response/picklist/PayloadResponse;", "", "", "configurationTypeName", "", "configurationTypeId", "configurationSubTypeName", "configurationSubTypeId", "", "Lcom/meijer/mobile/greenville/model/response/picklist/ConfigurationResponse;", "configurations", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/util/List;)V", "copy", "(Ljava/lang/String;ILjava/lang/String;ILjava/util/List;)Lcom/meijer/mobile/greenville/model/response/picklist/PayloadResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "I", "c", "e", "Ljava/util/List;", "()Ljava/util/List;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PayloadResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String configurationTypeName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int configurationTypeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String configurationSubTypeName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int configurationSubTypeId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ConfigurationResponse> configurations;

    public final PayloadResponse copy(@g(name = "configurationTypeName") String configurationTypeName, @g(name = "configurationTypeId") int configurationTypeId, @g(name = "configurationSubTypeName") String configurationSubTypeName, @g(name = "configurationSubTypeId") int configurationSubTypeId, @g(name = "configurations") List<ConfigurationResponse> configurations) {
        Intrinsics.j(configurationTypeName, "configurationTypeName");
        Intrinsics.j(configurationSubTypeName, "configurationSubTypeName");
        Intrinsics.j(configurations, "configurations");
        return new PayloadResponse(configurationTypeName, configurationTypeId, configurationSubTypeName, configurationSubTypeId, configurations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayloadResponse)) {
            return false;
        }
        PayloadResponse payloadResponse = (PayloadResponse) other;
        return Intrinsics.e(this.configurationTypeName, payloadResponse.configurationTypeName) && this.configurationTypeId == payloadResponse.configurationTypeId && Intrinsics.e(this.configurationSubTypeName, payloadResponse.configurationSubTypeName) && this.configurationSubTypeId == payloadResponse.configurationSubTypeId && Intrinsics.e(this.configurations, payloadResponse.configurations);
    }

    public int hashCode() {
        return (((((((this.configurationTypeName.hashCode() * 31) + Integer.hashCode(this.configurationTypeId)) * 31) + this.configurationSubTypeName.hashCode()) * 31) + Integer.hashCode(this.configurationSubTypeId)) * 31) + this.configurations.hashCode();
    }

    public String toString() {
        return "PayloadResponse(configurationTypeName=" + this.configurationTypeName + ", configurationTypeId=" + this.configurationTypeId + ", configurationSubTypeName=" + this.configurationSubTypeName + ", configurationSubTypeId=" + this.configurationSubTypeId + ", configurations=" + this.configurations + ')';
    }

    public PayloadResponse(@g(name = "configurationTypeName") String configurationTypeName, @g(name = "configurationTypeId") int i10, @g(name = "configurationSubTypeName") String configurationSubTypeName, @g(name = "configurationSubTypeId") int i11, @g(name = "configurations") List<ConfigurationResponse> configurations) {
        Intrinsics.j(configurationTypeName, "configurationTypeName");
        Intrinsics.j(configurationSubTypeName, "configurationSubTypeName");
        Intrinsics.j(configurations, "configurations");
        this.configurationTypeName = configurationTypeName;
        this.configurationTypeId = i10;
        this.configurationSubTypeName = configurationSubTypeName;
        this.configurationSubTypeId = i11;
        this.configurations = configurations;
    }

    /* renamed from: a, reason: from getter */
    public final int getConfigurationSubTypeId() {
        return this.configurationSubTypeId;
    }

    /* renamed from: b, reason: from getter */
    public final String getConfigurationSubTypeName() {
        return this.configurationSubTypeName;
    }

    /* renamed from: c, reason: from getter */
    public final int getConfigurationTypeId() {
        return this.configurationTypeId;
    }

    /* renamed from: d, reason: from getter */
    public final String getConfigurationTypeName() {
        return this.configurationTypeName;
    }

    public final List<ConfigurationResponse> e() {
        return this.configurations;
    }
}
