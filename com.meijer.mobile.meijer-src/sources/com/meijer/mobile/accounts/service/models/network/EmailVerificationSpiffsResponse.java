package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018\"\u0004\b\u001c\u0010\u001aR(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/EmailVerificationSpiffsResponse;", "", "", "success", "emailVerified", "", "Lcom/meijer/mobile/accounts/service/models/network/SpiffItemJson;", "spiffs", "<init>", "(ZZLjava/util/List;)V", "copy", "(ZZLjava/util/List;)Lcom/meijer/mobile/accounts/service/models/network/EmailVerificationSpiffsResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getSuccess", "()Z", "setSuccess", "(Z)V", "b", "setEmailVerified", "c", "Ljava/util/List;", "()Ljava/util/List;", "setSpiffs", "(Ljava/util/List;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EmailVerificationSpiffsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private transient boolean success;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean emailVerified;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private List<SpiffItemJson> spiffs;

    public EmailVerificationSpiffsResponse() {
        this(false, false, null, 7, null);
    }

    public final EmailVerificationSpiffsResponse copy(boolean success, @g(name = "emailVerified") boolean emailVerified, @g(name = "spiffs") List<SpiffItemJson> spiffs) {
        Intrinsics.j(spiffs, "spiffs");
        return new EmailVerificationSpiffsResponse(success, emailVerified, spiffs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailVerificationSpiffsResponse)) {
            return false;
        }
        EmailVerificationSpiffsResponse emailVerificationSpiffsResponse = (EmailVerificationSpiffsResponse) other;
        return this.success == emailVerificationSpiffsResponse.success && this.emailVerified == emailVerificationSpiffsResponse.emailVerified && Intrinsics.e(this.spiffs, emailVerificationSpiffsResponse.spiffs);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.success) * 31) + Boolean.hashCode(this.emailVerified)) * 31) + this.spiffs.hashCode();
    }

    public String toString() {
        return "EmailVerificationSpiffsResponse(success=" + this.success + ", emailVerified=" + this.emailVerified + ", spiffs=" + this.spiffs + ')';
    }

    public EmailVerificationSpiffsResponse(boolean z10, @g(name = "emailVerified") boolean z11, @g(name = "spiffs") List<SpiffItemJson> spiffs) {
        Intrinsics.j(spiffs, "spiffs");
        this.success = z10;
        this.emailVerified = z11;
        this.spiffs = spiffs;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getEmailVerified() {
        return this.emailVerified;
    }

    public final List<SpiffItemJson> b() {
        return this.spiffs;
    }

    public /* synthetic */ EmailVerificationSpiffsResponse(boolean z10, boolean z11, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? CollectionsKt.m() : list);
    }
}
