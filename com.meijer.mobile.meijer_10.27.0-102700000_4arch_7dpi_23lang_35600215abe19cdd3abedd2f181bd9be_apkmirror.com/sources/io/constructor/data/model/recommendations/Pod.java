package io.constructor.data.model.recommendations;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/constructor/data/model/recommendations/Pod;", "Ljava/io/Serializable;", "response", "", "resultId", "(Ljava/lang/String;Ljava/lang/String;)V", "getResponse", "()Ljava/lang/String;", "getResultId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Pod implements Serializable {
    private final String response;
    private final String resultId;

    public static /* synthetic */ Pod copy$default(Pod pod, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pod.response;
        }
        if ((i10 & 2) != 0) {
            str2 = pod.resultId;
        }
        return pod.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getResponse() {
        return this.response;
    }

    /* renamed from: component2, reason: from getter */
    public final String getResultId() {
        return this.resultId;
    }

    public final Pod copy(@g(name = PreferencesHelper.PREF_ID) String response, @g(name = "display_name") String resultId) {
        return new Pod(response, resultId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pod)) {
            return false;
        }
        Pod pod = (Pod) other;
        return Intrinsics.e(this.response, pod.response) && Intrinsics.e(this.resultId, pod.resultId);
    }

    public int hashCode() {
        String str = this.response;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.resultId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Pod(response=" + this.response + ", resultId=" + this.resultId + ")";
    }

    public final String getResponse() {
        return this.response;
    }

    public final String getResultId() {
        return this.resultId;
    }

    public Pod(@g(name = PreferencesHelper.PREF_ID) String str, @g(name = "display_name") String str2) {
        this.response = str;
        this.resultId = str2;
    }
}
