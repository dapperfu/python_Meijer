package com.meijer.mobile.mperks.networking.domain.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/MperksTransactionHistoryResponse;", "", "continuationToken", "", "count", "", "results", "", "Lcom/meijer/mobile/mperks/networking/domain/models/MperkTransaction;", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getContinuationToken", "()Ljava/lang/String;", "getCount", "()I", "getResults", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MperksTransactionHistoryResponse {
    private final String continuationToken;
    private final int count;
    private final List<MperkTransaction> results;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MperksTransactionHistoryResponse copy$default(MperksTransactionHistoryResponse mperksTransactionHistoryResponse, String str, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mperksTransactionHistoryResponse.continuationToken;
        }
        if ((i11 & 2) != 0) {
            i10 = mperksTransactionHistoryResponse.count;
        }
        if ((i11 & 4) != 0) {
            list = mperksTransactionHistoryResponse.results;
        }
        return mperksTransactionHistoryResponse.copy(str, i10, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContinuationToken() {
        return this.continuationToken;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    public final List<MperkTransaction> component3() {
        return this.results;
    }

    public final MperksTransactionHistoryResponse copy(@g(name = "continuationToken") String continuationToken, @g(name = "count") int count, @g(name = "results") List<MperkTransaction> results) {
        Intrinsics.j(results, "results");
        return new MperksTransactionHistoryResponse(continuationToken, count, results);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MperksTransactionHistoryResponse)) {
            return false;
        }
        MperksTransactionHistoryResponse mperksTransactionHistoryResponse = (MperksTransactionHistoryResponse) other;
        return Intrinsics.e(this.continuationToken, mperksTransactionHistoryResponse.continuationToken) && this.count == mperksTransactionHistoryResponse.count && Intrinsics.e(this.results, mperksTransactionHistoryResponse.results);
    }

    public int hashCode() {
        String str = this.continuationToken;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + this.results.hashCode();
    }

    public String toString() {
        return "MperksTransactionHistoryResponse(continuationToken=" + this.continuationToken + ", count=" + this.count + ", results=" + this.results + ')';
    }

    public MperksTransactionHistoryResponse(@g(name = "continuationToken") String str, @g(name = "count") int i10, @g(name = "results") List<MperkTransaction> results) {
        Intrinsics.j(results, "results");
        this.continuationToken = str;
        this.count = i10;
        this.results = results;
    }

    public final String getContinuationToken() {
        return this.continuationToken;
    }

    public final int getCount() {
        return this.count;
    }

    public final List<MperkTransaction> getResults() {
        return this.results;
    }
}
