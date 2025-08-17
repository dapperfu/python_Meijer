package com.meijer.mobile.reviews.service;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0011\u0012B\u001d\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/reviews/service/ReviewException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "b", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "Timeout", "AuthenticationRequired", "Lcom/meijer/mobile/reviews/service/ReviewException$AuthenticationRequired;", "Lcom/meijer/mobile/reviews/service/ReviewException$Timeout;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ReviewException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Throwable cause;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/reviews/service/ReviewException$AuthenticationRequired;", "Lcom/meijer/mobile/reviews/service/ReviewException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "c", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "d", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuthenticationRequired extends ReviewException {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Throwable cause;

        public /* synthetic */ AuthenticationRequired(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : th2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthenticationRequired(String message, Throwable th2) {
            super(message, th2, null);
            Intrinsics.j(message, "message");
            this.message = message;
            this.cause = th2;
        }

        @Override // com.meijer.mobile.reviews.service.ReviewException, java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.meijer.mobile.reviews.service.ReviewException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/reviews/service/ReviewException$Timeout;", "Lcom/meijer/mobile/reviews/service/ReviewException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "c", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "d", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Timeout extends ReviewException {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timeout(String message, Throwable th2) {
            super(message, th2, null);
            Intrinsics.j(message, "message");
            this.message = message;
            this.cause = th2;
        }

        @Override // com.meijer.mobile.reviews.service.ReviewException, java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // com.meijer.mobile.reviews.service.ReviewException, java.lang.Throwable
        public String getMessage() {
            return this.message;
        }
    }

    public /* synthetic */ ReviewException(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th2);
    }

    private ReviewException(String str, Throwable th2) {
        super(str, th2);
        this.message = str;
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
