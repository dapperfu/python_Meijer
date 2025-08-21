package com.meijer.mobile.mperks.networking.api.models;

import Tq.j;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0013B!\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\b\u0001\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\b\u0003\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/GetRewardsRequest;", "", "", "zip", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(Ljava/lang/String;I)V", "copy", "(Ljava/lang/String;I)Lcom/meijer/mobile/mperks/networking/api/models/GetRewardsRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GetRewardsRequest {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/GetRewardsRequest$a;", "", "<init>", "()V", "LTq/j;", "storeProvider", "Lcom/meijer/mobile/mperks/networking/api/models/GetRewardsRequest;", "a", "(LTq/j;)Lcom/meijer/mobile/mperks/networking/api/models/GetRewardsRequest;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.mperks.networking.api.models.GetRewardsRequest$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GetRewardsRequest a(j storeProvider) {
            Intrinsics.j(storeProvider, "storeProvider");
            return new GetRewardsRequest(storeProvider.h().getZipCode(), storeProvider.b());
        }
    }

    public final GetRewardsRequest copy(@g(name = "zip") String zip, @g(name = "storeId") int storeId) {
        return new GetRewardsRequest(zip, storeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetRewardsRequest)) {
            return false;
        }
        GetRewardsRequest getRewardsRequest = (GetRewardsRequest) other;
        return Intrinsics.e(this.zip, getRewardsRequest.zip) && this.storeId == getRewardsRequest.storeId;
    }

    public int hashCode() {
        String str = this.zip;
        return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.storeId);
    }

    public String toString() {
        return "GetRewardsRequest(zip=" + this.zip + ", storeId=" + this.storeId + ')';
    }

    /* renamed from: a, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: b, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    public GetRewardsRequest(@g(name = "zip") String str, @g(name = "storeId") int i10) {
        this.zip = str;
        this.storeId = i10;
    }
}
