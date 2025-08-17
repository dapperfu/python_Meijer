package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0000\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\u000b\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÀ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "meijerCode", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy$hybris_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/HybrisSubstitutePreference;", "copy", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HybrisSubstitutePreference {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String meijerCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public HybrisSubstitutePreference(@g(name = "code") String code, @g(name = "meijerCode") String meijerCode, @g(name = "name") String str) {
        Intrinsics.j(code, "code");
        Intrinsics.j(meijerCode, "meijerCode");
        this.code = code;
        this.meijerCode = meijerCode;
        this.name = str;
    }

    public final HybrisSubstitutePreference copy$hybris_release(@g(name = "code") String code, @g(name = "meijerCode") String meijerCode, @g(name = "name") String name) {
        Intrinsics.j(code, "code");
        Intrinsics.j(meijerCode, "meijerCode");
        return new HybrisSubstitutePreference(code, meijerCode, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisSubstitutePreference)) {
            return false;
        }
        HybrisSubstitutePreference hybrisSubstitutePreference = (HybrisSubstitutePreference) other;
        return Intrinsics.e(this.code, hybrisSubstitutePreference.code) && Intrinsics.e(this.meijerCode, hybrisSubstitutePreference.meijerCode) && Intrinsics.e(this.name, hybrisSubstitutePreference.name);
    }

    public int hashCode() {
        int iHashCode = ((this.code.hashCode() * 31) + this.meijerCode.hashCode()) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "HybrisSubstitutePreference(code=" + this.code + ", meijerCode=" + this.meijerCode + ", name=" + this.name + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final String getMeijerCode() {
        return this.meijerCode;
    }

    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public /* synthetic */ HybrisSubstitutePreference(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "-1" : str, str2, (i10 & 4) != 0 ? null : str3);
    }
}
