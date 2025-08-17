package com.emarsys.mobileengage.iam.webview;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/emarsys/mobileengage/iam/webview/IamWebViewCreationFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "statusMessage", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStatusMessage", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IamWebViewCreationFailedException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String statusMessage;

    /* JADX WARN: Multi-variable type inference failed */
    public IamWebViewCreationFailedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IamWebViewCreationFailedException) && Intrinsics.e(this.statusMessage, ((IamWebViewCreationFailedException) other).statusMessage);
    }

    public int hashCode() {
        return this.statusMessage.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "IamWebViewCreationFailedException(statusMessage=" + this.statusMessage + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IamWebViewCreationFailedException(String statusMessage) {
        super(statusMessage);
        Intrinsics.j(statusMessage, "statusMessage");
        this.statusMessage = statusMessage;
    }

    public /* synthetic */ IamWebViewCreationFailedException(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "IamWebView creation failed!" : str);
    }
}
