package com.meijer.mobile.core.networking.exceptions;

import android.content.Context;
import android.security.keystore.UserNotAuthenticatedException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qk.f;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0016\u0018\u0000 #2\u00060\u0001j\u0002`\u0002:\u0002$!BG\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b$\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b!\u0010+¨\u0006,"}, d2 = {"Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "url", "Lretrofit2/Response;", "response", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException$b;", "exceptionKind", "", "exception", "Lsk/b;", "errorType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lretrofit2/Response;Lcom/meijer/mobile/core/networking/exceptions/RetrofitException$b;Ljava/lang/Throwable;Lsk/b;)V", "kind", "throwable", "(Lcom/meijer/mobile/core/networking/exceptions/RetrofitException$b;Ljava/lang/Throwable;)V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "a", "Ljava/lang/String;", "e", "b", "Lretrofit2/Response;", "d", "()Lretrofit2/Response;", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException$b;", "()Lcom/meijer/mobile/core/networking/exceptions/RetrofitException$b;", "Lsk/b;", "()Lsk/b;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public class RetrofitException extends RuntimeException {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Response<?> response;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b exceptionKind;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final sk.b errorType;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/core/networking/exceptions/RetrofitException$a;", "", "<init>", "()V", "Lretrofit2/HttpException;", "httpException", "Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "b", "(Lretrofit2/HttpException;)Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "Ljava/io/IOException;", "exception", "c", "(Ljava/io/IOException;)Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "Landroid/security/keystore/UserNotAuthenticatedException;", "a", "(Landroid/security/keystore/UserNotAuthenticatedException;)Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "", "g", "(Ljava/lang/Throwable;)Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "Lsk/b;", "errorType", "cause", "e", "(Lsk/b;Ljava/lang/Throwable;)Lcom/meijer/mobile/core/networking/exceptions/RetrofitException;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.core.networking.exceptions.RetrofitException$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        public final RetrofitException d(sk.b bVar) {
            return f(this, bVar, null, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ RetrofitException f(Companion companion, sk.b bVar, Throwable th2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            return companion.e(bVar, th2);
        }

        public final RetrofitException a(UserNotAuthenticatedException exception) {
            Intrinsics.j(exception, "exception");
            return new RetrofitException(exception.getMessage(), null, null, b.f97006h, exception, null);
        }

        public final RetrofitException b(HttpException httpException) {
            Intrinsics.j(httpException, "httpException");
            String strMessage = httpException.message();
            Response<?> response = httpException.response();
            return new RetrofitException(strMessage, response != null ? response.raw().getRequest().getUrl().getUrl() : "", response, b.f97001c, httpException, null);
        }

        public final RetrofitException c(IOException exception) {
            Intrinsics.j(exception, "exception");
            return new RetrofitException(exception.getMessage(), null, null, b.f97000b, exception, null);
        }

        @JvmStatic
        @JvmOverloads
        public final RetrofitException e(sk.b errorType, Throwable cause) {
            return new RetrofitException(null, null, null, b.f97002d, cause, errorType);
        }

        public final RetrofitException g(Throwable exception) {
            Intrinsics.j(exception, "exception");
            return new RetrofitException(exception.getMessage(), null, null, b.f97007i, exception, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/core/networking/exceptions/RetrofitException$b;", "", "", "messageResourceId", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "d", "e", "f", "g", "h", "i", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f97000b = new b("NETWORK", 0, f.f158517o);

        /* renamed from: c, reason: collision with root package name */
        public static final b f97001c = new b("HTTP", 1, 0);

        /* renamed from: d, reason: collision with root package name */
        public static final b f97002d = new b("SERVER", 2, 0);

        /* renamed from: e, reason: collision with root package name */
        public static final b f97003e = new b("CONNECT_EXCEPTION", 3, f.f158521s);

        /* renamed from: f, reason: collision with root package name */
        public static final b f97004f = new b("AMBIGUOUS_CASE_UNKNOWN_HOST_EXCEPTION", 4, f.f158505c);

        /* renamed from: g, reason: collision with root package name */
        public static final b f97005g = new b("REQUEST_TIMED_OUT", 5, f.f158522t);

        /* renamed from: h, reason: collision with root package name */
        public static final b f97006h = new b("UNAUTHENTICATED", 6, f.f158508f);

        /* renamed from: i, reason: collision with root package name */
        public static final b f97007i = new b("UNEXPECTED", 7, f.f158524v);

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ b[] f97008j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f97009k;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int messageResourceId;

        private static final /* synthetic */ b[] a() {
            return new b[]{f97000b, f97001c, f97002d, f97003e, f97004f, f97005g, f97006h, f97007i};
        }

        static {
            b[] bVarArrA = a();
            f97008j = bVarArrA;
            f97009k = EnumEntriesKt.a(bVarArrA);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f97008j.clone();
        }

        /* renamed from: b, reason: from getter */
        public final int getMessageResourceId() {
            return this.messageResourceId;
        }

        private b(String str, int i10, int i11) {
            this.messageResourceId = i11;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitException(String str, String str2, Response<?> response, b exceptionKind, Throwable th2, sk.b bVar) {
        super(str, th2);
        Intrinsics.j(exceptionKind, "exceptionKind");
        this.url = str2;
        this.response = response;
        this.exceptionKind = exceptionKind;
        this.errorType = bVar;
    }

    @JvmStatic
    @JvmOverloads
    public static final RetrofitException f(sk.b bVar) {
        return INSTANCE.d(bVar);
    }

    @JvmStatic
    @JvmOverloads
    public static final RetrofitException g(sk.b bVar, Throwable th2) {
        return INSTANCE.e(bVar, th2);
    }

    /* renamed from: a, reason: from getter */
    public final sk.b getErrorType() {
        return this.errorType;
    }

    /* renamed from: b, reason: from getter */
    public final b getExceptionKind() {
        return this.exceptionKind;
    }

    public String c(Context context) {
        Intrinsics.j(context, "context");
        if (this.exceptionKind.getMessageResourceId() != 0) {
            String string = context.getString(this.exceptionKind.getMessageResourceId());
            Intrinsics.g(string);
            return string;
        }
        sk.b bVar = this.errorType;
        if ((bVar != null ? bVar.getErrorString(context) : null) != null) {
            return this.errorType.getErrorString(context);
        }
        String string2 = context.getString(f.f158524v);
        Intrinsics.g(string2);
        return string2;
    }

    public final Response<?> d() {
        return this.response;
    }

    /* renamed from: e, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.core.networking.exceptions.RetrofitException
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r5 != r4) goto La
            return r0
        La:
            com.meijer.mobile.core.networking.exceptions.RetrofitException r5 = (com.meijer.mobile.core.networking.exceptions.RetrofitException) r5
            sk.b r2 = r5.errorType
            if (r2 != 0) goto L18
            sk.b r2 = r4.errorType
            if (r2 != 0) goto L16
            r2 = r0
            goto L1e
        L16:
            r2 = r1
            goto L1e
        L18:
            sk.b r3 = r4.errorType
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
        L1e:
            retrofit2.Response<?> r3 = r5.response
            if (r3 != 0) goto L2c
            if (r2 == 0) goto L2a
            retrofit2.Response<?> r2 = r4.response
            if (r2 != 0) goto L2a
        L28:
            r2 = r0
            goto L37
        L2a:
            r2 = r1
            goto L37
        L2c:
            if (r2 == 0) goto L2a
            retrofit2.Response<?> r2 = r4.response
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r3, r2)
            if (r2 == 0) goto L2a
            goto L28
        L37:
            java.lang.String r3 = r5.url
            if (r3 != 0) goto L45
            if (r2 == 0) goto L43
            java.lang.String r2 = r4.url
            if (r2 != 0) goto L43
        L41:
            r2 = r0
            goto L50
        L43:
            r2 = r1
            goto L50
        L45:
            if (r2 == 0) goto L43
            java.lang.String r2 = r4.url
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r3, r2)
            if (r2 == 0) goto L43
            goto L41
        L50:
            java.lang.Throwable r3 = r5.getCause()
            if (r3 != 0) goto L5f
            if (r2 == 0) goto L85
            java.lang.Throwable r2 = r4.getCause()
            if (r2 != 0) goto L85
            goto L7e
        L5f:
            java.lang.Throwable r3 = r4.getCause()
            if (r3 != 0) goto L66
            return r1
        L66:
            if (r2 == 0) goto L85
            java.lang.Throwable r2 = r5.getCause()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Throwable r3 = r4.getCause()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
            if (r2 == 0) goto L85
        L7e:
            com.meijer.mobile.core.networking.exceptions.RetrofitException$b r5 = r5.exceptionKind
            com.meijer.mobile.core.networking.exceptions.RetrofitException$b r2 = r4.exceptionKind
            if (r5 != r2) goto L85
            return r0
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.core.networking.exceptions.RetrofitException.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Response<?> response = this.response;
        int iHashCode2 = (((iHashCode + (response != null ? response.hashCode() : 0)) * 31) + this.exceptionKind.hashCode()) * 31;
        sk.b bVar = this.errorType;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "RetrofitException{url='" + this.url + "', response=" + this.response + ", exceptionKind=" + this.exceptionKind + ", errorType=" + this.errorType + '}';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitException(b kind, Throwable th2) {
        super(null, th2);
        Intrinsics.j(kind, "kind");
        this.exceptionKind = kind;
        this.url = null;
        this.response = null;
        this.errorType = null;
    }
}
