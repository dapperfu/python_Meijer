package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/UnverifiedAddressJson;", "", "Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;", "original", "suggested", "<init>", "(Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;)V", "copy", "(Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;)Lcom/meijer/mobile/accounts/service/models/network/UnverifiedAddressJson;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;", "()Lcom/meijer/mobile/accounts/service/models/network/AddressSuggestionJson;", "b", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UnverifiedAddressJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressSuggestionJson original;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressSuggestionJson suggested;

    public final UnverifiedAddressJson copy(@g(name = "original") AddressSuggestionJson original, @g(name = "suggested") AddressSuggestionJson suggested) {
        Intrinsics.j(original, "original");
        Intrinsics.j(suggested, "suggested");
        return new UnverifiedAddressJson(original, suggested);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnverifiedAddressJson)) {
            return false;
        }
        UnverifiedAddressJson unverifiedAddressJson = (UnverifiedAddressJson) other;
        return Intrinsics.e(this.original, unverifiedAddressJson.original) && Intrinsics.e(this.suggested, unverifiedAddressJson.suggested);
    }

    public int hashCode() {
        return (this.original.hashCode() * 31) + this.suggested.hashCode();
    }

    public String toString() {
        return "UnverifiedAddressJson(original=" + this.original + ", suggested=" + this.suggested + ')';
    }

    public UnverifiedAddressJson(@g(name = "original") AddressSuggestionJson original, @g(name = "suggested") AddressSuggestionJson suggested) {
        Intrinsics.j(original, "original");
        Intrinsics.j(suggested, "suggested");
        this.original = original;
        this.suggested = suggested;
    }

    /* renamed from: a, reason: from getter */
    public final AddressSuggestionJson getOriginal() {
        return this.original;
    }

    /* renamed from: b, reason: from getter */
    public final AddressSuggestionJson getSuggested() {
        return this.suggested;
    }
}
