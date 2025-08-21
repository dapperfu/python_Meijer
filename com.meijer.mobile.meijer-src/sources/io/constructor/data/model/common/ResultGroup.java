package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lio/constructor/data/model/common/ResultGroup;", "Ljava/io/Serializable;", "displayName", "", "groupId", "path", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "getGroupId", "setGroupId", "getPath", "setPath", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ResultGroup implements Serializable {
    private String displayName;
    private String groupId;
    private String path;

    public ResultGroup(@g(name = "display_name") String str, @g(name = "group_id") String groupId, @g(name = "path") String str2) {
        Intrinsics.j(groupId, "groupId");
        this.displayName = str;
        this.groupId = groupId;
        this.path = str2;
    }

    public static /* synthetic */ ResultGroup copy$default(ResultGroup resultGroup, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = resultGroup.displayName;
        }
        if ((i10 & 2) != 0) {
            str2 = resultGroup.groupId;
        }
        if ((i10 & 4) != 0) {
            str3 = resultGroup.path;
        }
        return resultGroup.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final ResultGroup copy(@g(name = "display_name") String displayName, @g(name = "group_id") String groupId, @g(name = "path") String path) {
        Intrinsics.j(groupId, "groupId");
        return new ResultGroup(displayName, groupId, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultGroup)) {
            return false;
        }
        ResultGroup resultGroup = (ResultGroup) other;
        return Intrinsics.e(this.displayName, resultGroup.displayName) && Intrinsics.e(this.groupId, resultGroup.groupId) && Intrinsics.e(this.path, resultGroup.path);
    }

    public int hashCode() {
        String str = this.displayName;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.groupId.hashCode()) * 31;
        String str2 = this.path;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ResultGroup(displayName=" + this.displayName + ", groupId=" + this.groupId + ", path=" + this.path + ")";
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getPath() {
        return this.path;
    }

    public final void setDisplayName(String str) {
        this.displayName = str;
    }

    public final void setGroupId(String str) {
        Intrinsics.j(str, "<set-?>");
        this.groupId = str;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public /* synthetic */ ResultGroup(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3);
    }
}
