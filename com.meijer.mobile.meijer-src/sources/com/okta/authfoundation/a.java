package com.okta.authfoundation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/okta/authfoundation/a;", "", "b", "a", "Lcom/okta/authfoundation/a$a;", "Lcom/okta/authfoundation/a$b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/okta/authfoundation/a$a;", "Lcom/okta/authfoundation/a;", "", "errorCode", "", "errString", "<init>", "(ILjava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getErrorCode", "b", "Ljava/lang/CharSequence;", "getErrString", "()Ljava/lang/CharSequence;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.okta.authfoundation.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class OnAuthenticationError implements a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int errorCode;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CharSequence errString;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnAuthenticationError)) {
                return false;
            }
            OnAuthenticationError onAuthenticationError = (OnAuthenticationError) other;
            return this.errorCode == onAuthenticationError.errorCode && Intrinsics.e(this.errString, onAuthenticationError.errString);
        }

        public int hashCode() {
            return (Integer.hashCode(this.errorCode) * 31) + this.errString.hashCode();
        }

        public String toString() {
            return "OnAuthenticationError(errorCode=" + this.errorCode + ", errString=" + ((Object) this.errString) + ")";
        }

        public OnAuthenticationError(int i10, CharSequence errString) {
            Intrinsics.j(errString, "errString");
            this.errorCode = i10;
            this.errString = errString;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/okta/authfoundation/a$b;", "Lcom/okta/authfoundation/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f120599a = new b();

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return 42440690;
        }

        public String toString() {
            return "OnAuthenticationFailed";
        }

        private b() {
        }
    }
}
