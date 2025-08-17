package com.radiusnetworks.flybuy.api.network.response;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes11.dex */
public class HttpResponseStatus {
    public static final int ERROR_BAD_GATEWAY = 502;
    public static final int ERROR_BAD_REQUEST = 400;
    public static final int ERROR_CONFLICT = 409;
    public static final int ERROR_EXPECTATION_FAILED = 417;
    public static final int ERROR_FORBIDDEN = 403;
    public static final int ERROR_GATEWAY_TIMEOUT = 504;
    public static final int ERROR_GONE = 410;
    public static final int ERROR_HTTP_VERSION_NOT_SUPPORTED = 505;
    public static final int ERROR_INTERNAL_SERVER_ERROR = 500;
    public static final int ERROR_LENGTH_REQUIRED = 411;
    public static final int ERROR_METHOD_NOT_ALLOWED = 405;
    public static final int ERROR_NOT_ACCEPTABLE = 406;
    public static final int ERROR_NOT_FOUND = 404;
    public static final int ERROR_NOT_IMPLEMENTED = 501;
    public static final int ERROR_PARSING = -2;
    public static final int ERROR_PAYMENT_REQUIRED = 402;
    public static final int ERROR_PRECONDITION_FAILED = 412;
    public static final int ERROR_PROXY_AUTHENTICATION_REQUIRED = 407;
    public static final int ERROR_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
    public static final int ERROR_REQUEST_ENTITY_TOO_LARGE = 413;
    public static final int ERROR_REQUEST_TIMEOUT = 408;
    public static final int ERROR_REQUEST_URI_TOO_LONG = 414;
    public static final int ERROR_RETROFIT = -1;
    public static final int ERROR_SERVICE_UNAVAILABLE = 503;
    public static final int ERROR_UNAUTHORIZED = 401;
    public static final int ERROR_UNPROCESSABLE_ENTITY = 422;
    public static final int ERROR_UNSUPPORTED_MEDIA_TYPE = 415;
    public static final int INFORMATIONAL_CONTINUE = 100;
    public static final int INFORMATIONAL_SWITCHING_PROTOCOLS = 101;
    public static final int REDIRECTION_FOUND = 302;
    public static final int REDIRECTION_MOVED_PERMANENTLY = 301;
    public static final int REDIRECTION_MULTIPLE_CHOICES = 300;
    public static final int REDIRECTION_NOT_MODIFIED = 304;
    public static final int REDIRECTION_SEE_OTHER = 303;
    public static final int REDIRECTION_TEMPORARY_REDIRECT = 307;
    public static final int REDIRECTION_USE_PROXY = 305;
    public static final int SUCCESS_ACCEPTED = 202;
    public static final int SUCCESS_CREATED = 201;
    public static final int SUCCESS_NON_AUTHORITATIVE_INFORMATION = 203;
    public static final int SUCCESS_NO_CONTENT = 204;
    public static final int SUCCESS_OK = 200;
    public static final int SUCCESS_PARTIAL_CONTENT = 206;
    public static final int SUCCESS_RESET_CONTENT = 205;
    public static final int SUCCESS_UNKNOWN = 289;

    public static boolean isHttpStatusCodeSuccess(Integer num) {
        return num != null && num.intValue() / 100 == 2;
    }
}
