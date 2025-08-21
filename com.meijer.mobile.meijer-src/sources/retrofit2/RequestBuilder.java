package retrofit2;

import fsimpl.C14170dq;
import gw.C14416e;
import gw.InterfaceC14417f;
import java.io.EOFException;
import java.io.IOException;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.h;
import okhttp3.k;

/* loaded from: classes14.dex */
final class RequestBuilder {
    private static final String PATH_SEGMENT_ALWAYS_ENCODE_SET = " \"<>^`{}|\\?#";
    private final HttpUrl baseUrl;
    private RequestBody body;
    private okhttp3.j contentType;
    private h.a formBuilder;
    private final boolean hasBody;
    private final Headers.a headersBuilder;
    private final String method;
    private k.a multipartBuilder;
    private String relativeUrl;
    private final Request.a requestBuilder = new Request.a();
    private HttpUrl.a urlBuilder;
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern PATH_TRAVERSAL = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    private static class ContentTypeOverridingRequestBody extends RequestBody {
        private final okhttp3.j contentType;
        private final RequestBody delegate;

        @Override // okhttp3.RequestBody
        public long contentLength() throws IOException {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.RequestBody
        /* renamed from: contentType */
        public okhttp3.j getContentType() {
            return this.contentType;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(InterfaceC14417f interfaceC14417f) throws IOException {
            this.delegate.writeTo(interfaceC14417f);
        }

        ContentTypeOverridingRequestBody(RequestBody requestBody, okhttp3.j jVar) {
            this.delegate = requestBody;
            this.contentType = jVar;
        }
    }

    private static String canonicalizeForPath(String str, boolean z10) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                C14416e c14416e = new C14416e();
                c14416e.N0(str, 0, iCharCount);
                canonicalizeForPath(c14416e, str, iCharCount, length, z10);
                return c14416e.n3();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    void addPart(Headers headers, RequestBody requestBody) {
        this.multipartBuilder.c(headers, requestBody);
    }

    void addFormField(String str, String str2, boolean z10) {
        if (z10) {
            this.formBuilder.b(str, str2);
        } else {
            this.formBuilder.a(str, str2);
        }
    }

    void addHeader(String str, String str2, boolean z10) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            if (z10) {
                this.headersBuilder.e(str, str2);
                return;
            } else {
                this.headersBuilder.a(str, str2);
                return;
            }
        }
        try {
            this.contentType = okhttp3.j.e(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    void addHeaders(Headers headers) {
        this.headersBuilder.b(headers);
    }

    void addPart(k.c cVar) {
        this.multipartBuilder.d(cVar);
    }

    void addPathParam(String str, String str2, boolean z10) {
        if (this.relativeUrl == null) {
            throw new AssertionError();
        }
        String strCanonicalizeForPath = canonicalizeForPath(str2, z10);
        String strReplace = this.relativeUrl.replace("{" + str + "}", strCanonicalizeForPath);
        if (!PATH_TRAVERSAL.matcher(strReplace).matches()) {
            this.relativeUrl = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void addQueryParam(String str, String str2, boolean z10) {
        String str3 = this.relativeUrl;
        if (str3 != null) {
            HttpUrl.a aVarL = this.baseUrl.l(str3);
            this.urlBuilder = aVarL;
            if (aVarL == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
            this.relativeUrl = null;
        }
        if (z10) {
            this.urlBuilder.b(str, str2);
        } else {
            this.urlBuilder.f(str, str2);
        }
    }

    <T> void addTag(Class<T> cls, T t10) {
        this.requestBuilder.r(cls, t10);
    }

    Request.a get() {
        HttpUrl httpUrlW;
        HttpUrl.a aVar = this.urlBuilder;
        if (aVar != null) {
            httpUrlW = aVar.g();
        } else {
            httpUrlW = this.baseUrl.w(this.relativeUrl);
            if (httpUrlW == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.baseUrl + ", Relative: " + this.relativeUrl);
            }
        }
        RequestBody contentTypeOverridingRequestBody = this.body;
        if (contentTypeOverridingRequestBody == null) {
            h.a aVar2 = this.formBuilder;
            if (aVar2 != null) {
                contentTypeOverridingRequestBody = aVar2.c();
            } else {
                k.a aVar3 = this.multipartBuilder;
                if (aVar3 != null) {
                    contentTypeOverridingRequestBody = aVar3.e();
                } else if (this.hasBody) {
                    contentTypeOverridingRequestBody = RequestBody.create((okhttp3.j) null, new byte[0]);
                }
            }
        }
        okhttp3.j jVar = this.contentType;
        if (jVar != null) {
            if (contentTypeOverridingRequestBody != null) {
                contentTypeOverridingRequestBody = new ContentTypeOverridingRequestBody(contentTypeOverridingRequestBody, jVar);
            } else {
                this.headersBuilder.a("Content-Type", jVar.getMediaType());
            }
        }
        return this.requestBuilder.v(httpUrlW).n(this.headersBuilder.f()).o(this.method, contentTypeOverridingRequestBody);
    }

    void setBody(RequestBody requestBody) {
        this.body = requestBody;
    }

    RequestBuilder(String str, HttpUrl httpUrl, String str2, Headers headers, okhttp3.j jVar, boolean z10, boolean z11, boolean z12) {
        this.method = str;
        this.baseUrl = httpUrl;
        this.relativeUrl = str2;
        this.contentType = jVar;
        this.hasBody = z10;
        if (headers != null) {
            this.headersBuilder = headers.k();
        } else {
            this.headersBuilder = new Headers.a();
        }
        if (z11) {
            this.formBuilder = new h.a();
        } else if (z12) {
            k.a aVar = new k.a();
            this.multipartBuilder = aVar;
            aVar.f(k.f154714k);
        }
    }

    void setRelativeUrl(Object obj) {
        this.relativeUrl = obj.toString();
    }

    private static void canonicalizeForPath(C14416e c14416e, String str, int i10, int i11, boolean z10) throws EOFException {
        C14416e c14416e2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt >= 32 && iCodePointAt < 127 && PATH_SEGMENT_ALWAYS_ENCODE_SET.indexOf(iCodePointAt) == -1 && (z10 || (iCodePointAt != 47 && iCodePointAt != 37))) {
                    c14416e.Z(iCodePointAt);
                } else {
                    if (c14416e2 == null) {
                        c14416e2 = new C14416e();
                    }
                    c14416e2.Z(iCodePointAt);
                    long size = c14416e2.getSize();
                    for (long j10 = 0; j10 < size; j10++) {
                        byte bL = c14416e2.l(j10);
                        c14416e.writeByte(37);
                        char[] cArr = HEX_DIGITS;
                        c14416e.writeByte(cArr[((bL & 255) >> 4) & 15]);
                        c14416e.writeByte(cArr[bL & C14170dq.MULTIPLY]);
                    }
                    c14416e2.a();
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }
}
