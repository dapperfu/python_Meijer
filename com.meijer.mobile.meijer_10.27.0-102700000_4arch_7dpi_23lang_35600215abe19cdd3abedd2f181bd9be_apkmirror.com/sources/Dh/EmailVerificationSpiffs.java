package Dh;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016\"\u0004\b\u0018\u0010\u0019R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LDh/m;", "", "", "success", "emailVerified", "", "LDh/z;", "spiffs", "<init>", "(ZZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "getEmailVerified", "setEmailVerified", "(Z)V", "c", "Ljava/util/List;", "()Ljava/util/List;", "setSpiffs", "(Ljava/util/List;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dh.m, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class EmailVerificationSpiffs {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean success;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean emailVerified;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private List<SpiffItem> spiffs;

    public EmailVerificationSpiffs() {
        this(false, false, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailVerificationSpiffs)) {
            return false;
        }
        EmailVerificationSpiffs emailVerificationSpiffs = (EmailVerificationSpiffs) other;
        return this.success == emailVerificationSpiffs.success && this.emailVerified == emailVerificationSpiffs.emailVerified && Intrinsics.e(this.spiffs, emailVerificationSpiffs.spiffs);
    }

    public EmailVerificationSpiffs(boolean z10, boolean z11, List<SpiffItem> spiffs) {
        Intrinsics.j(spiffs, "spiffs");
        this.success = z10;
        this.emailVerified = z11;
        this.spiffs = spiffs;
    }

    public final List<SpiffItem> a() {
        return this.spiffs;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.success) * 31) + Boolean.hashCode(this.emailVerified)) * 31) + this.spiffs.hashCode();
    }

    public String toString() {
        return "EmailVerificationSpiffs(success=" + this.success + ", emailVerified=" + this.emailVerified + ", spiffs=" + this.spiffs + ')';
    }

    public /* synthetic */ EmailVerificationSpiffs(boolean z10, boolean z11, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? CollectionsKt.m() : list);
    }
}
