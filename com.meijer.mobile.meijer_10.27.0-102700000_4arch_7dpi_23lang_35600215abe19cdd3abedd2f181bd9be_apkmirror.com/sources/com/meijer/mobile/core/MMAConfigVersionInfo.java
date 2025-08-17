package com.meijer.mobile.core;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/core/MMAConfigVersionInfo;", "", "", "major", "minor", "patch", "minSdk", "<init>", "(IIII)V", "copy", "(IIII)Lcom/meijer/mobile/core/MMAConfigVersionInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "d", "e", "versionCode", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MMAConfigVersionInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int major;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int patch;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minSdk;

    public MMAConfigVersionInfo() {
        this(0, 0, 0, 0, 15, null);
    }

    public final MMAConfigVersionInfo copy(@g(name = "major") int major, @g(name = "minor") int minor, @g(name = "patch") int patch, @g(name = "minSdk") int minSdk) {
        return new MMAConfigVersionInfo(major, minor, patch, minSdk);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MMAConfigVersionInfo)) {
            return false;
        }
        MMAConfigVersionInfo mMAConfigVersionInfo = (MMAConfigVersionInfo) other;
        return this.major == mMAConfigVersionInfo.major && this.minor == mMAConfigVersionInfo.minor && this.patch == mMAConfigVersionInfo.patch && this.minSdk == mMAConfigVersionInfo.minSdk;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.major) * 31) + Integer.hashCode(this.minor)) * 31) + Integer.hashCode(this.patch)) * 31) + Integer.hashCode(this.minSdk);
    }

    public String toString() {
        return "MMAConfigVersionInfo(major=" + this.major + ", minor=" + this.minor + ", patch=" + this.patch + ", minSdk=" + this.minSdk + ')';
    }

    public MMAConfigVersionInfo(@g(name = "major") int i10, @g(name = "minor") int i11, @g(name = "patch") int i12, @g(name = "minSdk") int i13) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.minSdk = i13;
    }

    /* renamed from: a, reason: from getter */
    public final int getMajor() {
        return this.major;
    }

    /* renamed from: b, reason: from getter */
    public final int getMinSdk() {
        return this.minSdk;
    }

    /* renamed from: c, reason: from getter */
    public final int getMinor() {
        return this.minor;
    }

    /* renamed from: d, reason: from getter */
    public final int getPatch() {
        return this.patch;
    }

    public final int e() {
        return (this.major * 10000000) + (this.minor * 100000) + (this.patch * 1000);
    }

    public /* synthetic */ MMAConfigVersionInfo(int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}
