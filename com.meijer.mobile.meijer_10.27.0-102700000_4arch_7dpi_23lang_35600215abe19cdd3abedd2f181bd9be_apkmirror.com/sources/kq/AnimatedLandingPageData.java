package kq;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lkq/a;", "", "", "title", "description", "resource", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kq.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class AnimatedLandingPageData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int resource;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimatedLandingPageData)) {
            return false;
        }
        AnimatedLandingPageData animatedLandingPageData = (AnimatedLandingPageData) other;
        return this.title == animatedLandingPageData.title && this.description == animatedLandingPageData.description && this.resource == animatedLandingPageData.resource;
    }

    /* renamed from: a, reason: from getter */
    public final int getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final int getResource() {
        return this.resource;
    }

    /* renamed from: c, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.description)) * 31) + Integer.hashCode(this.resource);
    }

    public String toString() {
        return "AnimatedLandingPageData(title=" + this.title + ", description=" + this.description + ", resource=" + this.resource + ')';
    }

    public AnimatedLandingPageData(int i10, int i11, int i12) {
        this.title = i10;
        this.description = i11;
        this.resource = i12;
    }
}
