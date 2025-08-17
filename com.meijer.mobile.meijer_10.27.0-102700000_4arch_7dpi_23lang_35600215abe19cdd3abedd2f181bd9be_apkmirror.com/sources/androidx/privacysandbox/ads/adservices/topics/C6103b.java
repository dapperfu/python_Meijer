package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/b;", "", "", "adsSdkName", "", "shouldRecordObservation", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "b", "Z", "()Z", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.privacysandbox.ads.adservices.topics.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6103b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String adsSdkName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean shouldRecordObservation;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/b$a;", "", "<init>", "()V", "", "adsSdkName", "b", "(Ljava/lang/String;)Landroidx/privacysandbox/ads/adservices/topics/b$a;", "", "shouldRecordObservation", "c", "(Z)Landroidx/privacysandbox/ads/adservices/topics/b$a;", "Landroidx/privacysandbox/ads/adservices/topics/b;", "a", "()Landroidx/privacysandbox/ads/adservices/topics/b;", "Ljava/lang/String;", "Z", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.privacysandbox.ads.adservices.topics.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String adsSdkName = "";

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean shouldRecordObservation = true;

        public final C6103b a() {
            return new C6103b(this.adsSdkName, this.shouldRecordObservation);
        }

        public final a b(String adsSdkName) {
            Intrinsics.j(adsSdkName, "adsSdkName");
            if (adsSdkName.length() <= 0) {
                throw new IllegalStateException("adsSdkName must be set");
            }
            this.adsSdkName = adsSdkName;
            return this;
        }

        public final a c(boolean shouldRecordObservation) {
            this.shouldRecordObservation = shouldRecordObservation;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6103b() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C6103b)) {
            return false;
        }
        C6103b c6103b = (C6103b) other;
        return Intrinsics.e(this.adsSdkName, c6103b.adsSdkName) && this.shouldRecordObservation == c6103b.shouldRecordObservation;
    }

    public C6103b(String adsSdkName, boolean z10) {
        Intrinsics.j(adsSdkName, "adsSdkName");
        this.adsSdkName = adsSdkName;
        this.shouldRecordObservation = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getAdsSdkName() {
        return this.adsSdkName;
    }

    @JvmName
    /* renamed from: b, reason: from getter */
    public final boolean getShouldRecordObservation() {
        return this.shouldRecordObservation;
    }

    public int hashCode() {
        return (this.adsSdkName.hashCode() * 31) + Boolean.hashCode(this.shouldRecordObservation);
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.adsSdkName + ", shouldRecordObservation=" + this.shouldRecordObservation;
    }

    public /* synthetic */ C6103b(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10);
    }
}
