package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/PreferenceRequestJson;", "", "", "preferenceKey", "", "values", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/meijer/mobile/accounts/service/models/network/PreferenceRequestJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PreferenceRequestJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String preferenceKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> values;

    public final PreferenceRequestJson copy(@g(name = "preferenceKey") String preferenceKey, @g(name = "values") List<String> values) {
        Intrinsics.j(preferenceKey, "preferenceKey");
        Intrinsics.j(values, "values");
        return new PreferenceRequestJson(preferenceKey, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferenceRequestJson)) {
            return false;
        }
        PreferenceRequestJson preferenceRequestJson = (PreferenceRequestJson) other;
        return Intrinsics.e(this.preferenceKey, preferenceRequestJson.preferenceKey) && Intrinsics.e(this.values, preferenceRequestJson.values);
    }

    public int hashCode() {
        return (this.preferenceKey.hashCode() * 31) + this.values.hashCode();
    }

    public String toString() {
        return "PreferenceRequestJson(preferenceKey=" + this.preferenceKey + ", values=" + this.values + ')';
    }

    public PreferenceRequestJson(@g(name = "preferenceKey") String preferenceKey, @g(name = "values") List<String> values) {
        Intrinsics.j(preferenceKey, "preferenceKey");
        Intrinsics.j(values, "values");
        this.preferenceKey = preferenceKey;
        this.values = values;
    }

    /* renamed from: a, reason: from getter */
    public final String getPreferenceKey() {
        return this.preferenceKey;
    }

    public final List<String> b() {
        return this.values;
    }
}
