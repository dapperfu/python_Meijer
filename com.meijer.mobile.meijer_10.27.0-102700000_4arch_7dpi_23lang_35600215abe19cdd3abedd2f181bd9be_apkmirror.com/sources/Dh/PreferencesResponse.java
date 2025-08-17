package Dh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LDh/t;", "", "", "LDh/o;", "preferences", "", "isEmailVerified", "<init>", "(Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "()Z", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dh.t, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class PreferencesResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Preference> preferences;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEmailVerified;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferencesResponse)) {
            return false;
        }
        PreferencesResponse preferencesResponse = (PreferencesResponse) other;
        return Intrinsics.e(this.preferences, preferencesResponse.preferences) && this.isEmailVerified == preferencesResponse.isEmailVerified;
    }

    public PreferencesResponse(List<Preference> preferences, boolean z10) {
        Intrinsics.j(preferences, "preferences");
        this.preferences = preferences;
        this.isEmailVerified = z10;
    }

    public final List<Preference> a() {
        return this.preferences;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    public int hashCode() {
        return (this.preferences.hashCode() * 31) + Boolean.hashCode(this.isEmailVerified);
    }

    public String toString() {
        return "PreferencesResponse(preferences=" + this.preferences + ", isEmailVerified=" + this.isEmailVerified + ')';
    }
}
